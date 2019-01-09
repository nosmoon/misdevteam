<%@ page contentType="text/html; charset=KSC5601" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%!
    // 전달된 쿠키에 설정된 값을 얻어서 리턴한다.
    public String GetCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = cookies[i].getValue();
					break;
                }
            }
        }
        return ret;
    }

	// 전달된 쿠키의 값을 제거한다.
	public void DelCookie(HttpServletRequest req, HttpServletResponse res, String param) throws Exception{
		Cookie cookie = new Cookie(param, "");
		cookie.setDomain(".chosun.com");
		cookie.setPath("/");
		cookie.setMaxAge(0);
		res.addCookie(cookie);
	}

    // 에러 처리 페이지로 분기한다.
    public void GoErrorPage(HttpServletRequest req, HttpServletResponse res, String url) throws Exception{
        getServletConfig().getServletContext().getRequestDispatcher(url).forward(req, res);
    }
%>

<%if("1".equals(GetCookie(request, response, "loginstatus"))){%>
<script language="javascript">
	alert("회원아이디가 올바르지 않습니다.");
</script>

<%}else if("2".equals(GetCookie(request, response, "loginstatus"))){%>
<script language="javascript">
	alert("비밀번호가 올바르지 않습니다.");
</script>
<%}%>
<%
	DelCookie(request,  response, "loginstatus");
%>


<%
    session.invalidate();

    String loginid = GetCookie(request, response, "loginid");
	             DelCookie(request, response, "loginid");
%>
<script language="javascript">
    if(top.name != "") {
        top.name = "";
    }

    if(this.name != "") {
        top.location.replace("/login.jsp");
    }
</script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<title>아이리더 관리시스템 </title>
<link rel="stylesheet" href="/css/common.css" type="text/css">
<script language="JavaScript" src="/js/common.js"></script>
<script language="JavaScript" type="text/JavaScript">
<!--
// 폼 visual initializing
function jsInit(){
    setEventHandler();
    setEnterKeyEventHandler();
    setInputBackgroundColor();
}

// 로그인
function login(){
    if(window.event)window.event.returnValue = false;

    var lo_form1 = document.form;
    if(!validate(lo_form1)) return;

    lo_form1.submit();
}

// 비밀번호 변경
function pwdchg(){
    var lo_form1    = document.form;
    var lo_form2    = document.pwdchg_form;

//    var ls_loginid1 = trim(lo_form1.User.value);
//    var ls_loginid2 = trim(lo_form2.USERNAME.value);

    var ls_loginid1 = lo_form1.User.value;
    var ls_loginid2 = lo_form2.USERNAME.value;

    if(ls_loginid2 == "") {
        lo_form2.USERNAME.value = ls_loginid1;
    }

    lo_form2.action = "/sm/co_login_1000_i.jsp";
	lo_form2.target = "_self";
    lo_form2.submit();
}

// 비밀번호 재발급신청 페이지로 이동
function re_pwd() {
	var ls_loginid = document.form.User.value;
	document.location.href = "/sm/co_login_1100_i.jsp?USERNAME=" + ls_loginid;
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</head>

<body class="loginbg" onLoad="MM_preloadImages('images/btn_loginr.gif'); document.form.User.focus();">
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">

<form name="form" method="post" action="/siteminderagent/forms/login.fcc">
    <input name="target" type="hidden" value="/main.jsp">
    <input name="smauthreason" type="hidden" value="0">

  <tr>
    <td height="240">&nbsp;</td>
  </tr>
  <tr>
    <td style="text-align:center; vertical-align:middle;">
	<table width="610" height="368" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td background="images/login_box.gif" valign="top">
		  <table width="610" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="284" height="137">&nbsp;</td>
              <td>&nbsp;</td>
              <td width="8">&nbsp;</td>
              <td width="184">&nbsp;</td>
              </tr>
            <tr>
              <td>&nbsp;</td>
              <td width="134"><input name="User" value="<%=loginid%>" type="text" class="input_login" style="width:125px" caption="아이디" tabIndex="1" onFocus="focus()" notEmpty></td>
              <td>&nbsp;</td>
              <td rowspan="3"><a href="javascript:login();" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image1','','images/btn_loginr.gif',1)">
					<img src="images/btn_login.gif" alt="로그인" name="Image1" width="88" height="52" border="0"></a>
			  </td>
              </tr>
            <tr>
              <td height="6"></td>
              <td></td>
              <td></td>
              </tr>
            <tr>
              <td>&nbsp;</td>
              <td><input type="password" name="Password" class="input_login" style="width:125px" caption="비밀번호"  tabIndex="2" notEmpty onkeydown="if(window.event.keyCode=='13'){login();}"></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td colspan="3" style="padding-top:3px;">
				<table border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  <td><a href="javascript:re_pwd();"><img src="images/btn_pwre.gif" width="116" height="24" border="0"></a></td>
	                  <td width="10">&nbsp;</td>
	                  <td><a href="javascript:pwdchg();"><img src="images/btn_pwch.gif" width="104" height="24" border="0"></a></td>
	               </tr>
              </table>
			  </td>
            </tr>
        </table>
		</td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>
<form name="pwdchg_form" method="post" action="">
  <input type="hidden" name="USERNAME" value="<%=loginid%>">
</form>
