<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%----------------------------------------------------------
* ���α׷���	: co_login_1100_i.jsp
* ���α׷����	: ��й�ȣ ��߱� ��û
* �ۼ�����	: 2004.07.27
* �ۼ���	: ��뼷
----------------------------------------------------------%>
<%
  String userid = Util.Uni2Ksc(Util.checkString(request.getParameter("USERNAME")));
%>
<html>
<head>
<title>��й�ȣ ����</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
function jsInit(){
    setEventHandler();
	setEnterKeyEventHandler();
	setInputBackgroundColor();
	document.re_pwd_form.deptnm.focus();
}

// �� ��ȿ�� üũ
function check_all(form){
    if(!validate(form)) return false;
    else{
        makeValue(form);
        return true;
    }
}

// ����ó��
function re_pwd(){
	var lo_form1 = document.re_pwd_form;
	
	// �Է°�üũ
	// ���̵� 5�ڸ� üũ ���� ��� �Һ��ڵ�5�ڸ�+����ڼ���(1-5) (����)
	
	if(lo_form1.deptnm.value == ''){
		alert("�μ����� �Է��ϼ���");
		return;
	}
	
	if(lo_form1.usernm.value == ''){
		alert("����ڸ��� �Է��ϼ���");
		return;
	}
	
	if(lo_form1.position.value == ''){
		alert("��å���� �Է��ϼ���");
		return;
	}
	
	if(lo_form1.userid.value == ''){
		alert("���̵� �Է��ϼ���");
		return;
	}
	
	if(lo_form1.reason.value == ''){
		alert("��������� �Է��ϼ���");
		return;
	}
	
    lo_form1.submit();
}

// ���
function cancel(){
	location.replace("/login.jsp");
}
//-->
</script>
</head>
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
      </b></font>��й�ȣ�� ��߱�</font>
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
          <td> <img src="/html/comm_img/login_box_08_03.gif" width=460 height=27 alt=""></td>
          <td> <img src="/html/comm_img/login_box_09.gif" width=14 height=27 alt=""></td>
        </tr>
        <tr>
          <td background="/html/comm_img/login_box_10.gif">&nbsp; </td>
          <td bgcolor="#F2F3F3" height="140">
			<table width="460" border="0" cellpadding="2" cellspacing="1" bgcolor="#999999" align="center">
		    <form name="re_pwd_form" method="post" action="/jsp/ss/sm/co_login_1100_u.jsp" >
				<tr align="center" bgcolor="#D5D5D5"> 
					<td width="90" height="24" align="center" bgcolor="#D5D5D5"><strong>�� ��</strong></td>
					<td width="132" height="24" align="left" bgcolor="#FFFFFF"><input type="text" name="deptnm" size="18" class="text_box" caption="�� ��" notEmpty></td>
					<td width="90" height="24" align="center"><strong>����ڸ�</strong></td>
					<td width="143" height="24"  align="left" bgcolor="#FFFFFF"><input type="text" name="usernm" size="18" class="text_box" caption="����ڸ�" notEmpty></td>
				</tr>
				<tr bgcolor="#FFFFFF"> 
					<td height="24" align="center" bgcolor="#D5D5D5"><strong>�� å</strong></td>
					<td height="24" align="left"><input type="text" name="position" size="18" class="text_box" caption="�� å" notEmpty></td>
					<td height="24" align="center" bgcolor="#D5D5D5"><strong>���̵�</strong></td>
					<td height="24" align="left"><input type="text" name="userid" size="18" class="text_box" caption="���̵�" notEmpty value="<%=userid%>"></td>
				</tr>
				<tr bgcolor="#FFFFFF"> 
					<td height="49" align="center" bgcolor="#D5D5D5"><strong>�������</strong></td>
					<td height="49" colspan="3"><textarea name="reason" style="ime-mode:active;" cols="46" rows="3" class="scroll1" caption="�������" notEmpty></textarea></td>
				</tr>
			</form>				
			</table>
			<br>
			<table width="140" border="0" cellspacing="0" cellpadding="0" align="center">
				<tr align="center">
					<td><input name="login_img" type="image" src="/html/comm_img/bu_login.gif" width="47" height="47" border="0" onclick="re_pwd();window.event.returnValue=false;"></td>
					<td><input name="cancel_img" type="image" src="/html/comm_img/bu_pw_cancel.gif" width="47" height="47" border="0" onclick="cancel();window.event.returnValue=false;"></td>
				</tr>
			</table>
        
        <br>
      </td>
      <td background="/html/comm_img/login_box_12.gif">&nbsp; </td>
    </tr>
    <tr> 
      <td><img height=12 alt="" src="/html/comm_img/login_box_13.gif" width=19></td>
      <td background="/html/comm_img/login_box_14.gif"></td>
      <td><img height=12 alt="" src="/html/comm_img/login_box_15.gif" width=14></td>
    </tr>
  </tbody>
</table>
</body>
</html>
