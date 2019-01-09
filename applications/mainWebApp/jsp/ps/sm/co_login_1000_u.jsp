<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%@	page import="
		pbs.com.ldap.*
"
%>
<%----------------------------------------------------------
* 프로그램명	: co_login_1000_u.jsp
* 프로그램기능	: B2E LDAP 사용자 비밀번호 변경 처리
* 작성일자	: 2004.05.31
* 작성자	: 조은영
* 수정내역	:
----------------------------------------------------------%>
<jsp:useBean id="changePass" scope="page" class="ldapp.ChangePass" />
<%
  String rtnUrl = "http://" + request.getServerName() + ":" + request.getServerPort() + "/main.jsp";

  // 사용자 아이디, 비밀번호, TARGET URL 읽어오기
  String userid = "", oldpass = "", newpass = "", cnfnewpass = "", target = "", msg = "";

  userid = request.getParameter("USERNAME");
  oldpass = request.getParameter("OLDPASSWORD");
  newpass = request.getParameter("NEWPASSWORD");
  cnfnewpass = request.getParameter("CNFRMNEWPASSWORD");
  target = request.getParameter("TARGET");

  if (userid == null || userid.trim().equals("")) {
    out.println ("<script language=javascript><!--");
    out.println ("alert('아이디를 입력해 주세요.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
    return;
  }
  else if (oldpass == "" || oldpass.trim().equals("")){
    out.println ("<script language=javascript><!--");
    out.println ("alert('기존 비밀번호를 입력해 주세요.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
  }
  else if (newpass == "" || newpass.trim().equals("")){
    out.println ("<script language=javascript><!--");
    out.println ("alert('신규 비밀번호를 입력해 주세요.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
  }
  else if (newpass.trim().length() < 4 || newpass.trim().length() > 16){
    out.println ("<script language=javascript><!--");
    out.println ("alert('비밀번호는 4~16자의 영문 소문자와 숫자만 사용할 수 있습니다.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
  }
  else if (cnfnewpass == "" || cnfnewpass.trim().equals("")){
    out.println ("<script language=javascript><!--");
    out.println ("alert('신규 비밀번호 확인을 입력해 주세요.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
  }
  else if (oldpass.equals(cnfnewpass)){
    out.println ("<script language=javascript><!--");
    out.println ("alert('기존 비밀번호와 다른 신규 비밀번호를 입력해 주세요.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
  }
  else if (!newpass.equals(cnfnewpass)){
    out.println ("<script language=javascript><!--");
    out.println ("alert('신규 비밀번호가 일치하지 않습니다.');");
    out.println ("history.back(-1);");
    out.println ("//--></script>");
  }

  // 비밀번호 갱신
  int result = changePass.updateldap(userid, oldpass, newpass);
  if (result == -1){
    msg = "정보가 일치하지 않습니다. <br>확인하시고 다시 시도해 주세요.";
    target = "/jsp/ps/sm/co_login_1000_i.jsp?USERNAME=" + userid;
  }
  else if (result == 0){
    msg = "비밀번호 수정에 실패했습니다. <br>다시 시도해 주세요.";
    target = "/jsp/ps/sm/co_login_1000_i.jsp?USERNAME=" + userid;
  }
  else {
    //개발계는 밑에 두 라인 제외
    COLdapSend coldapSend = new COLdapSend();
    coldapSend.CSPutTransfer(userid,newpass);
    msg = "비밀번호 수정에 성공했습니다. <br>신규 비밀번호로 로그인해 주세요.";
    target = "/login.jsp?USERNAME=" + userid;
  }
  if (target == null || target.trim().equals(""))
    target = rtnUrl;
%>

<html>
<head>
<title>비밀번호 변경</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
//체크확인(로그인이동)
function CheckOk()
{
    var  lo_form1   = document.okchk;
    lo_form1.action = "/login.jsp";
	lo_form1.target = "_self";
    lo_form1.submit();
}
//-->
</script>

<body text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" bgcolor="#ffffff">
<table width="100%" border="0" cellspacing="0" cellpadding="0" height="100%">
  <tr>
    <td background="/html/comm_img/login_back.jpg" height="155">
      <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0" width="1000" height="155">
        <param name=movie value="/html/comm_img/login_top1.swf">
        <param name=quality value=high>
        <embed src="/html/comm_img/login_top1.swf" quality=high pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash" type="application/x-shockwave-flash" width="1000" height="155">
        </embed>
      </object>
    </td>
  </tr>
  <tr>
    <td height="25" background="/html/comm_img/login_tiback01.gif"> <font color="#FFFFFF">
      <img src="/html/comm_img/login_tiback.gif" width="83" height="25" align="absmiddle">
      <font color="#FFCC00"><b><img src="/html/comm_img/ic_arr01.gif" width="20" height="16" align="absmiddle">
      </b></font>비밀번호를 변경</font>
    </td>
  </tr>
  <tr>
    <td align="center">
      <table width=493 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width=19 height=35 ></td>
          <td> <img src="/html/comm_img/login_box_02.gif" width=460 height=35 alt=""></td>
          <td  width=14 height=35 ></td>
        </tr>
        <tr>
          <td> <img src="/html/comm_img/login_box_04.gif" width=19 height=25 alt=""></td>
          <td> <img src="/html/comm_img/login_box_05.gif" width=460 height=25 alt=""></td>
          <td> <img src="/html/comm_img/login_box_06.gif" width=14 height=25 alt=""></td>
        </tr>
        <tr>
          <td> <img src="/html/comm_img/login_box_07.gif" width=19 height=27 alt=""></td>
          <td> <img src="/html/comm_img/login_box_08_02.gif" width=460 height=27 alt=""></td>
          <td> <img src="/html/comm_img/login_box_09.gif" width=14 height=27 alt=""></td>
        </tr>
        <tr>
          <td background="/html/comm_img/login_box_10.gif">&nbsp; </td>
          <td bgcolor="#F2F3F3" height="140">
          <!--버튼간격 맞춰놓은 거니까.. 텍스트 박스 줄이지 말것-->
            <table border="0" cellspacing="0" cellpadding="2" width="100%" >
              <tr>
                <td width="96"></td>
                <td align=left width="200">
                  <%=msg%>
                </td>
                <td width="152">
                  <!--input type="image" tabIndex="3" src="/html/comm_img/bu_login.gif" width="47" height="47" border="0"-->
                  <!--<img src="/html/comm_img/bu_login.gif" style="cursor:hand" onclick="javascript:CheckOk();window.event.returnValue=false;" width="47" height="47" border="0"> -->
                  <a href="<%=target%>"><img src="/html/comm_img/bu_login.gif" width="47" height="47" border="0"></a>
                </td>
              </tr>
            </table>
          </td>
          <td background="/html/comm_img/login_box_12.gif">&nbsp; </td>
        </tr>
        <tr>
          <td> <img src="/html/comm_img/login_box_13.gif" width=19 height=12 alt=""></td>
          <td background="/html/comm_img/login_box_14.gif"></td>
          <td><img src="/html/comm_img/login_box_15.gif" width=14 height=12 alt=""></td>
        </tr>
      </table>
      <br>
      <br>
    </td>
  </tr>
  <tr bgcolor="#000000">
    <td width="1000" height="25" align="right" bgcolor="#000000"><font color="#FFFFFF">Copyright
      (c) 2003 chosun.com All rights reserved.&nbsp;&nbsp;&nbsp; Contact </font><a href="mailto:webmaster@chosun.com%20"><font color="#FFCC00">webmaster@chosun.com</font></a><font color="#FFFFFF"> for more information.</font>
    </td>
  </tr>
</table>
<form name="okchk" method="post" action="">
  <input type="hidden" name="valname1" value="">
</form>
</body>
</html>
