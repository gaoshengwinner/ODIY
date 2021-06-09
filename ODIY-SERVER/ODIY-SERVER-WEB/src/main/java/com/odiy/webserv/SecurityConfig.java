package com.odiy.webserv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	UserDetailsService loginUserDetailsService;

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(loginUserDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
//		.requireCsrfProtectionMatcher(new RequestMatcher() {
//			private Pattern allowedMethods = Pattern.compile("^(GET|HEAD|TRACE|OPTIONS)$");
//			private RegexRequestMatcher unprotectedMatcher = new RegexRequestMatcher("^/v1/api/.*", null);
//
//			@Override
//			public boolean matches(HttpServletRequest request) {
//				if (unprotectedMatcher.matches(request)) {
//					return !allowedMethods.matcher(request.getMethod()).matches();
//				} else {
//					return false;
//				}
//			}
//		});

//		http.authorizeRequests()
//				.antMatchers("/v1/api/*", "/res/**", "/member/regist", "/", "/member/login", "/member/regist_mailcf")
//				.permitAll().anyRequest().authenticated();
//
//		http.formLogin().loginPage("/member/login").usernameParameter("memberEmail").passwordParameter("memberPassword")
//				.successForwardUrl("/member/home").failureUrl("/member/login?error=1");// .and().exceptionHandling().accessDeniedPage("/401");
//
//		http.logout().logoutUrl("/member/logout").logoutSuccessUrl("/member/login")
//				.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout", "GET")).deleteCookies("JSESSIONID")
//				.invalidateHttpSession(true);
		http.csrf().disable();
//		http.rememberMe().rememberMeParameter("remembermeParamater");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// 允许跨域
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**").allowedOrigins("*")
//						.allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS").allowCredentials(false)
//						.maxAge(3600);

				registry.addMapping("/v1/api/**")

						.allowedOrigins("*")
						// 允许发送Cookie
						.allowCredentials(true)
						// 允许所有方法
						.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD");
			}
		};
	}

}
