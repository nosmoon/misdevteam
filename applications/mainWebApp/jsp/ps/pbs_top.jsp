<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : pbs_top.jsp
* ���     : ���Ǳ� top �޴�
* �ۼ����� : 2004-01-09
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    //����� ��������
    String emp_nm      = Util.getSessionParameterValue(request, "emp_nm", true);          //�α��� ����
    String cmpynm      = Util.getSessionParameterValue(request, "cmpynm", true);          //ȸ���
%>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=KSC5601">
<link rel="stylesheet" href="/html/comm_css/pbs.css" type="text/css">
</head>

<body bgcolor="#FFFFFF" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="1000">
      <table width=1000 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td> <a href="/ps/share/1801" target="conFrame"><img src="/html/comm_img/pbs_top_01.gif" width=160 height=55  border="0"></a></td>
          <td> <img src="/html/comm_img/pbs_top_02.gif" width=143 height=55 ></td>
          <td> <img src="/html/comm_img/pbs_top_03.gif" width=106 height=55 ></td>
          <td> <img src="/html/comm_img/pbs_top_04.gif" width=116 height=55 ></td>
          <td> <img src="/html/comm_img/pbs_top_05.gif" width=261 height=55 ></td>
          <td width="214" background="/html/comm_img/pbs_top_06.gif" align="right" valign="bottom">
<%--200705073 ����ǥ �߰�(�����˻� ��ũ)--%>
			<a href="/ps/common/1901" target="_blank"><font color="#66CCFF"><b>�����˻�</b></font></a>&nbsp;<font color="#66CCFF">|</font>
<%--20050113 ����ǥ �߰�(���Ȯ�� ��ũ)--%>
			<a href="http://morningplus.chosun.com/ps/service/extn/1150" target="_blank"><font color="#66CCFF"><b>���Ȯ����</b></font></a>&nbsp;<font color="#66CCFF">|</font>
			<a href="http://mail.chosun.com/" target="_blank"><font color="#66CCFF"><b>��������</b></font></a>
			<br>
            <font color="#FFFF00">
            <a href="/logout.jsp" style="cursor:hand;COLOR: #FFFF00;TEXT-DECORATION: none;" >�α׾ƿ�</a></font></td>
        </tr>
      </table>
    </td>
    <td bgcolor="#0B8785">&nbsp;</td>
  </tr>
  <tr>
    <td height="26" background="/html/comm_img/sls_top_back.gif" width="1000" align="right">
      <table width=1000 border=0 cellpadding=0 cellspacing=0>
        <tr>
          <td width="25"> <img src="/html/comm_img/sls_bar_01.gif" width=25 height=26 ></td>
          <td width=63><a href="/html/help/publishdept1.htm" target="_blank"><img src="/html/comm_img/pbs_help.gif" width=63 height=26 ></a></td>
          <td width="814" align="right"><img src="/html/comm_img/ic_arr02.gif" width="7" height="11" align="absmiddle">
            <font color="#2847B3">
            <!--<b>< %//=getCookieParameterValue(request, "CMPYNM", true)%>&nbsp;< %//=getCookieParameterValue(request, "EMP_NM", true)%></b>-->
            <b><%=cmpynm%>&nbsp;<%=emp_nm%></b>
            </font><font color="#1F6DBC">�� �湮�ϼ̽��ϴ�.</font> </td>
        </tr>
      </table>
    </td>
    <td height="26" background="/html/comm_img/sls_top_back.gif"><!--����r--></td>
  </tr>
  <!--<tr>
	<td>
		<iframe width=350 height=0 noresize scrolling=yes frameborder=0 marginheight=0 marginwidth=0 src=refresh.html></iframe>
	</td>
  </tr>-->
</table>

</body>
</html>
