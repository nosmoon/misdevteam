<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : mon_menu.jsp
* ���     : ����͸� �޴�
* �ۼ����� : 2005-08-03
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--
// �̺�Ʈ �ڵ鷯 �ʱ�ȭ
function view(m, i){
	if(document.all){

		if(document.all[m].style.display == "none"){
			document.all[m].style.display = "";
			document.images[i].src =  "/html/comm_img/ic_tr05_1.gif";
		}else if(document.all[m].style.display == ""){
			document.all[m].style.display = "none";
			document.images[i].src =  "/html/comm_img/ic_tr05.gif";
		}
	}
}

// ���õ� �޴��׸� ���� �ٲٱ�
function change_color(obj) {
	for(i=0; i<document.anchors.length; i++) {
		document.anchors[i].style.color = "BLACK";
	}
	obj.style.color = "RED";
}

-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">
<table width=100% border=0 cellpadding=0 cellspacing=0 >
  <tr>
    <td background="/html/comm_img/sls_menu_back.gif" style height="29"><img src="/html/comm_img/sls_menu_01.gif" width=124 height=29 alt=""></td>
  </tr>
  <tr>
    <td  valign="top" width="123" class="menu" height="25">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td bgcolor="#EBEBEB"><img src="/html/comm_img/ic_tr05.gif" width="16" height="22" align="absmiddle" style="cursor:hand" onclick="javascript:view('mnt_m','mnt_i');" name="mnt_i"><a href="javascript:view('mnt_m','mnt_i');">����͸�</a></td>
        </tr>
        <tr id="mnt_m" style="display:none">
          <td bgcolor="#EBEBEB">
            <%--2dept table--%>
            <table width="123" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1100" onclick="change_color(this)" name="anc" target="conFrame" >�Ǹ�����</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1200" onclick="change_color(this)" name="anc" target="conFrame" >�Ǹű�</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1300" onclick="change_color(this)" name="anc" target="conFrame" >��������</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1400" onclick="change_color(this)" name="anc" target="conFrame" >���Ǳ�</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1500" onclick="change_color(this)" name="anc" target="conFrame" >���պ���(�Ϲ�)</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1600" onclick="change_color(this)" name="anc" target="conFrame" >���պ���(����)</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1700" onclick="change_color(this)" name="anc" target="conFrame" >ȸ������</a></td>
              </tr>
              <tr>
                <td width="16"></td>
                <td><img src="/html/comm_img/ic_tr05_2.gif" width="16" height="22" align="absmiddle"><a href="/ss/monitor/1800" onclick="change_color(this)" name="anc" target="conFrame" >�ݼ���</a></td>
              </tr>
            </table>
            <%--2dept table end--%>
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td bgcolor="#B3B1B1"><br>
      <br>
      <%--�ϴܿ���--%>
    </td>
  </tr>
</table>
</body>
</html>
