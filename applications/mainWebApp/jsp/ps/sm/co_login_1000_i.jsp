<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%----------------------------------------------------------
* ���α׷���	: co_login_1000_i.jsp
* ���α׷����	: B2E LDAP ����� ��й�ȣ ����
* �ۼ�����	: 2004.05.31
* �ۼ���	: ������
* ��������	:
----------------------------------------------------------%>
<%
  String rtnUrl = "http://" + request.getServerName() + ":" + request.getServerPort() + "/main.jsp";

  // ����� ���̵�, TARGET URL �о����
  String userName = "", target = "";

  userName = Util.Uni2Ksc(Util.checkString(request.getParameter("USERNAME")));
  if (userName != null && !userName.trim().equals("")) {
    userName = "\"" + userName + "\" ";
  }

  if (request.getAttribute("unencodedTarget") != null)
    target = (request.getAttribute("unencodedTarget")).toString();

  /**
  if (userName == null || userName.trim().equals("")) {
    response.sendRedirect (rtnUrl);
    return;
  }
  **/

  if (target == null || target.trim().equals(""))
    target = rtnUrl;
%>
<html>
<head>
<title>��й�ȣ ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
function jsInit(){
    setEventHandler();
    setEnterKeyEventHandler();
    setInputBackgroundColor();
    if(document.changepw.USERNAME.value == ""){
        document.changepw.USERNAME.focus();
    }else{
        document.changepw.OLDPASSWORD.focus();
    }
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ���Ǳ� user id ��ȿ�� ����
function validate_id(s_id){
    if(trim(s_id) == "") return false;
    var format = /^(\w{1}\d{4}|\w{1}\d{5}|\w{1}\d{6}|\w{1}\d{7}|\d{5}|\d{6}|\d{7}|\d{8}|\w{2}\d{5})$/;
    return isValidFormat(s_id, format);
}

// ���Ǳ� user password ��ȿ�� ����
function validate_pw(s_pw){
    if(trim(s_pw) == "") return false;
    var format = /^([a-z0-9]{4,16})$/;
    return isValidFormat(s_pw, format);
}

//Ȯ��üũ
function CheckForm()
{
  form = document.forms.changepw;

  if(!check_all(form)) return;

  if (!validate_id(form.USERNAME.value)){
    alert( "��ȿ���� ���� ���̵� �Դϴ�." );
    form.USERNAME.focus();
    form.USERNAME.select();
    return;
  }
  /*
  else if (!validate_pw(form.OLDPASSWORD.value)){
    alert( "��ȿ���� ���� ��й�ȣ �Դϴ�.\n(��й�ȣ�� 4~16���� ���� �ҹ��ڿ� ���ڸ� ����� �� �ֽ��ϴ�.)" );
    form.OLDPASSWORD.focus();
    form.OLDPASSWORD.select();
    return;
  }
  */
  else if (!validate_pw(form.NEWPASSWORD.value)){
    alert( "��ȿ���� ���� ��й�ȣ �Դϴ�.\n(��й�ȣ�� 4~16���� ���� �ҹ��ڿ� ���ڸ� ����� �� �ֽ��ϴ�.)" );
    form.NEWPASSWORD.focus();
    form.NEWPASSWORD.select();
    return;
  }
  else if ( form.NEWPASSWORD.value == form.USERNAME.value ){
    alert( "���̵�� ������ ��й�ȣ�� ����� �� �����ϴ�." );
    form.NEWPASSWORD.value = "";
    form.CNFRMNEWPASSWORD.value = "";
    form.NEWPASSWORD.focus();
    return false;
  }
  else if (!isValidValue(form.NEWPASSWORD.value)) {
    alert( "����� �� ���� ��й�ȣ�Դϴ�. �ٽ� �Է����ּ���." );
    form.NEWPASSWORD.value = "";
    form.CNFRMNEWPASSWORD.value = "";
    form.NEWPASSWORD.focus();
    return false;
  }
  else if ( form.OLDPASSWORD.value == form.NEWPASSWORD.value ){
    alert( "���� ��й�ȣ�� �ٸ� �ű� ��й�ȣ�� �Է��� �ּ���." );
    form.NEWPASSWORD.focus();
    form.NEWPASSWORD.select();
    return;
  }
  else if ( form.NEWPASSWORD.value != form.CNFRMNEWPASSWORD.value ){
    alert( "�ű� ��й�ȣ�� ��ġ���� �ʽ��ϴ�." );
    form.CNFRMNEWPASSWORD.focus();
    form.CNFRMNEWPASSWORD.select();
    return;
  }
  else {
    document.changepw.submit();
    return true;
  }
}

//����̵�
function CancelForm()
{
    var  lo_form1   = document.can_form;
    lo_form1.action = "/login.jsp";
	lo_form1.target = "_self";
    lo_form1.submit();
}

function isValidValue(str) {

	//�ҹ���, ���� ����
	var re = /[a-z0-9]/;
	if (!re.test(str)) {
		return false;
	}

	//���������ߺ�, dddd..., 1234.., abcd...
	var cnt = 0, chk = 0, chk2 = 0;
	for (i=1; i<str.length; i++) {

		if (str.charAt(i) == str.charAt(i-1))
			cnt++;
		else
			cnt = 0;

		if (str.charAt(i).charCodeAt() - 1 == str.charAt(i-1).charCodeAt())
			chk++;
		else
			chk = 0;

		if (str.charAt(i).charCodeAt() + 1 == str.charAt(i-1).charCodeAt())
			chk2++;
		else
			chk2 = 0;
	}

	if (cnt + 1 == str.length  || chk + 1 == str.length || chk2 + 1 == str.length)
		return false;

	return true;
}
//-->
</script>
</head>

<body text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" bgcolor="#ffffff" onload="jsInit();">
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
      </b></font>��й�ȣ�� ����</font>
    </td>
  </tr>
  <tr>
    <td align="center">
      <table width=493 border=0 cellpadding=0 cellspacing=0>
        <tbody>
        <form name="changepw" method="post" action="/jsp/ps/sm/co_login_1000_u.jsp" onSubmit="return CheckForm();">
          <input name="TARGET" type="hidden" value="<%=target%>">
          <TR>
            <TD width=19 height=35></TD>
            <TD><IMG height=35 alt="" src="/html/comm_img/login_box_02.gif"  width=460></TD>
            <TD width=14 height=35></TD>
          </TR>
          <TR>
            <TD><IMG height=25 alt="" src="/html/comm_img/login_box_04.gif" width=19></TD>
            <TD><IMG height=25 alt="" src="/html/comm_img/login_box_05.gif" width=460></TD>
            <TD><IMG height=25 alt="" src="/html/comm_img/login_box_06.gif" width=14></TD>
          </TR>
          <TR>
            <TD><IMG height=27 alt="" src="/html/comm_img/login_box_07.gif" width=19></TD>
            <TD><IMG height=27 alt="" src="/html/comm_img/login_box_08_02.gif" width=460></TD>
            <TD><IMG height=27 alt="" src="/html/comm_img/login_box_09.gif" width=14></TD>
          </TR>
          <TR>
            <TD background="/html/comm_img/login_box_10.gif">&nbsp; </TD>
            <TD height=140 align="center" bgColor=#f2f3f3><br>
              <table cellspacing=0 cellpadding=2 width="100%" border=0>
                <tbody>
                  <tr>
                    <td ><img height=14 src="/html/comm_img/user_id.gif" width=90></td>
                    <td>
                      <input class=text_box style="WIDTH: 118px" tabindex=1 size=18 name=USERNAME notempty caption="���̵�" value=<%=userName%> >
                    </td>
                    <td ><img height=14 src="/html/comm_img/old_pw.gif" width=100></td>
                    <td >
                      <input name=OLDPASSWORD type=password class=text_box id="old_pw" style="WIDTH: 118px" tabindex=2 size=18 caption="���� ��й�ȣ"  notEmpty >
                    </td>
                  </tr>
                  <tr>
                    <td><img height=14 src="/html/comm_img/new_pw.gif" width=90></td>
                    <td>
                      <input name=NEWPASSWORD type=password class=text_box id="new_pw" style="WIDTH: 118px" tabindex=3 size=18 caption="�ű� ��й�ȣ"  notEmpty >
                    </td>
                    <td><img height=14 src="/html/comm_img/new_pw_con.gif" width=100></td>
                    <td >
                      <input name=CNFRMNEWPASSWORD type=password class=text_box id="pw_confirm" style="WIDTH: 118px" tabindex=4 size=18 caption="Ȯ�� ��й�ȣ"  notEmpty onkeydown="if(event.keyCode=='13'){document.all.login_btn_id.focus();window.event.returnValue=false;}">
                    </td>
                  </tr>
                </tbody>
              </table>
              <br>
              <table width="140" border="0" cellspacing="0" cellpadding="0">
                <tr align="center">
                  <td><input name="imageField" id="login_btn_id" type="image" src="/html/comm_img/bu_login.gif" width="47" height="47" border="0"></td>
                  <td><img src="/html/comm_img/bu_pw_cancel.gif" style="cursor:hand" onclick="javascript:CancelForm();window.event.returnValue=false;" width="47" height="47" border="0"></td>
                </tr>
              </table>
              <BR>
            </TD>
            <TD background="/html/comm_img/login_box_12.gif">&nbsp; </TD>
          </TR>
          <TR>
            <TD><IMG height=12 alt="" src="/html/comm_img/login_box_13.gif" width=19></TD>
            <TD background="/html/comm_img/login_box_14.gif"></TD>
            <TD><IMG height=12 alt="" src="/html/comm_img/login_box_15.gif" width=14></TD>
          </TR>
        </form>
        <!-- SiteMinder ���� ó�� FORM �� -->
        </tbody>
      </table>
      <br>
      <br>
      <table width="495" border="0" cellspacing="0" cellpadding="3" bgcolor="#E9F8EF">
        <tr>
          <td bgcolor="#CACACA" height="1"></td>
        </tr>
        <tr>
          <td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11" align="absmiddle">
           ���� ��й�ȣ�� �Է��� �� �ű� ��й�ȣ�� �Է��Ͻð� Ȯ�� ��ư�� ��������.
          </td>
        </tr>
        <tr>
          <td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11" align="absmiddle">
          ��й�ȣ�� 4~16���� ���� �ҹ��ڿ� ���ڸ� ����� �� �ֽ��ϴ�.
          </td>
        </tr>
        <tr>
          <td><img src="/html/comm_img/ic_arr02.gif" width="7" height="11" align="absmiddle">
          ���� ��й�ȣ�� �ٸ� �ű� ��й�ȣ�� �Է��ϼž� �մϴ�.
          </td>
        </tr>
        <tr>
          <td bgcolor="#CACACA" height="1"></td>
        </tr>
      </table>

    </td>
  </tr>
  <tr bgcolor="#000000">
    <td width="1000" height="25" align="right" bgcolor="#000000"><font color="#FFFFFF">Copyright
      (c) 2003 chosun.com All rights reserved.&nbsp;&nbsp;&nbsp; Contact </font><a href="mailto:webmaster@chosun.com%20"><font color="#FFCC00">webmaster@chosun.com</font></a><font color="#FFFFFF"> for more information.</font>
    </td>
  </tr>
</table>
<form name="can_form" method="post" action="">
  <input type="hidden" name="valname1" value="">
</form>
</body>
</html>
