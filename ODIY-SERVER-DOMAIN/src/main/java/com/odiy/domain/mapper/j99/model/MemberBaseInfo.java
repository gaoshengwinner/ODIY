package com.odiy.domain.mapper.j99.model;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberBaseInfo implements Serializable {
    private Integer memberId;

    private String memberPhoneNo;

    private String memberPhone4bit;

    private String memberEmail;

    private String memberStaus;

    private String memberPassword;
    
    public void init() {
    	
    }

    private static final long serialVersionUID = 1L;
}