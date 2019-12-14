<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>点击显示隐藏菜单代码</title>
 <style>
    nav {
        margin:100px auto;
        text-align:center;
        margin-bottom: 0;
    }
    nav ul {
        list-style-type: none;
        padding:0 20px;
        display:inline-table;
        position:relative;  
        background: #999;
    }
    nav ul ul {
        display:none;
    }
    nav ul li {
        float:left; 
    }
    nav ul::after {
        content:"";
        display:block;
        clear:both;
    }
    nav ul li a {
        display:block;
        padding:25px 40px;
        color:#000;
        text-decoration:none;
        font-family:"微软雅黑";
    }
 
    nav ul li:hover {
        background:linear-gradient(to bottom,#4f5964,#5f6975);
    }
    nav ul li:hover a {
        color:#FFF;
    }
 
    #target_1:target, #target_2:target, #target_3:target, #target_4:target {
      display: block;     
  }
 
  nav ul ul {
    background:#5f6975;
    border-radius:0;
    position:absolute;
    top:100%;
    padding:0;
}
nav ul ul li {
    float:none;
    border-top:1px solid #6b727c;
    border-bottom:1px solid #575f6a;
}   
nav ul ul li a:hover {
    background:#4b545f;
}
</style>

 </head>

<div id="Test5study" class="Test5study">
<h2 id="t1" οnclick="ShHi('t1','h1');">标题></h2>
<ul class="TxtList" id="h1">
            <li><img src="img1.jpg" width="100" height="90" /></li>
<li>身体健康...</li>

</ul>
<h2 id="t2" οnclick="ShHi('t2','h2');">标题></h2>
<ul class="TxtList" id="h2" style="display:none;">
<li><img src="img2.jpg" width="100" height="90" /></li>
<li>没毒...</li>
</ul>
<h2 id="t3" οnclick="ShHi('t3','h3');">标题></h2>
<ul class="TxtList" id="h3" style="display:none;">
<li><img src="img3.jpg" width="100" height="90" /></li>
<li>艾滋病...</li>
</ul>
<h2 id="t4" οnclick="ShHi('t4','h4');">标题></h2>
<ul class="TxtList" id="h4" style="display:none;">
<li><img src="img1.jpg" width="100" height="90" /></li>
<li>aizib </li>
</ul>
</div>
<script type="text/javascript">


function $(d){return document.getElementById(d);}
function f(d){var t=$(d);if (t){return t.style;}else{return null;}}
function Hi(){var items = document.getElementsByTagName("ul");for (var i=0;i<items.length;i++){items[i].style.display='none';}}
function Hl(){var iteml = document.getElementsByTagName("h2");for (var j=0;j<iteml.length;j++){iteml[j].style.fontWeight='normal';}}
function h(d){var s=f(d);var b=s.display;if (b=='none'){return true;}else{return false;}}
function ShHi(ii,jj){if(h(jj)){Hl();Hi();f(jj).display='block';f(ii).fontWeight='bold';}else{Hl();Hi();f(jj).display='none';f(ii).fontWeight='normal';}}
</script>
</body>
</html>