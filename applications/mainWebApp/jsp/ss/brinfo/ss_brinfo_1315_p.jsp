<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1315_p.jsp
* ��� : ����Info-����������Ȳ-�� ��� (�˾�)
* �ۼ����� : 2004-11-13
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOEMP_DTLDataSet ds = (SS_L_BOEMP_DTLDataSet)request.getAttribute("ds");
%>

<html>
<head>
<title>::: ����� ���::::</title>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
<link rel="stylesheet" href="/html/comm_css/sls.css" type="text/css">
<script language="JavaScript" src="/html/comm_js/common.js"></script>
<script language="JavaScript">
<!--

	//â�ݱ�
	function close_modal(){
		window.close();
	}
//-->
</script>
</head>

<body bgcolor="#F8F7F7" text="#000000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" class="scroll1">

<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF">
	<tr bgcolor="#dddddd" height="23">
		<td width="60"  class="gray" align="center">�̸�</td>
		<td width="70"  class="gray" align="center">��å</td>
		<td width="100"  class="gray" align="center">�ֹι�ȣ</td>
		<td width="100"  class="gray" align="center">��ȭ</td>
		<td class="gray" align="center">�ּ�</td>
		<td width="70"  class="gray" align="center">�Ի�����</td>
		<td width="80"  class="gray" align="center">���̹�����</td>
		<td width="60"  class="gray" align="center">���谡��</td>
	</tr>

	<!-- ��� ���� -------------------------------------------------------------------------->
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_BOEMP_DTLCURCOMMLISTRecord curcommlistRec = (SS_L_BOEMP_DTLCURCOMMLISTRecord)ds.curcommlist.get(i);%>

    <tr>
		<td width="60"  class="gray" align="left">&nbsp;<%= curcommlistRec.flnm%></td>
		<td width="70"  class="gray" align="left">&nbsp;<%= curcommlistRec.dutynm%></td>
		<td width="100"  class="gray" align="center"><%= Util.FormatJumin(curcommlistRec.prn)%>&nbsp;</td>
		<td width="100"  class="gray" align="left"><%= Util.getChainStr(curcommlistRec.tel1, curcommlistRec.tel2, curcommlistRec.tel3, "-")%>&nbsp;</td>
		<td class="gray" align="left"><%= curcommlistRec.addr%>&nbsp;<%= curcommlistRec.dtlsaddr%></td>
		<td width="70"  class="gray" align="center"><%= Util.convertS(curcommlistRec.in_cmpy_dt)%>&nbsp;</td>
		<td width="80"  class="gray" align="center"><%= Util.convertS(curcommlistRec.regdt)%>&nbsp;</td>
		<td width="60"  class="gray" align="center"><%= curcommlistRec.cctryn%></td>
	</tr>
    <%}%>
</table>

<table align="center">
  	<tr>
    	<td align="center" height="27"  bgcolor="#000000"><input type="image" src="/html/comm_img/bu_close.gif" onclick="close_modal();window.event.returnValue=false;"></a></td>
  	</tr>
</table>

</body>
</html>

<script>

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
    close_modal();
<%}%>
</script>
