<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1620_p.jsp
* ��� : �����濵-�������μ���Ȳ-�μ�
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-27
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	//TrustForm ����.
	//content type�� text/html, text/xml�� �ƴ� ��� �ڵ����� download ��ȯ�̶�� �ϳ� �Ʒ��� ���� �̸� �������� ������ ����� �������� ����.
	response.setHeader("Content-Disposition","attachment; filename=SSBRMGR1620.xls");

    SS_L_QTY_SP_EXCELDataSet ds = (SS_L_QTY_SP_EXCELDataSet)request.getAttribute("ds");
%>

<html>
<body>
</head></head>
<table>
	<tr> 
		<td> �μ� </td>
		<td> ��Ʈ </td>
		<td> ���� </td>
		<td> ���� </td>
		<td> �����μ� </td>
		<td> �����μ� </td>
		<td> �߼ۺμ� </td>
		<td> ������ </td>
		<td> ���� </td>
	</tr>

<!--�������μ� ��Ȳ ��� ���� ---------------------------------------------------------------------------->      
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_QTY_SP_EXCELCURCOMMLISTRecord curcommlistRec = (SS_L_QTY_SP_EXCELCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td> <%= curcommlistRec.deptnm%>&nbsp; </td>
		<td> <%= curcommlistRec.partnm%>&nbsp; </td>
		<td> <%= curcommlistRec.areanm%>&nbsp; </td>
		<td> <%= curcommlistRec.bonm%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.iygwygbs)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.iygwmgbs)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.iygwsdbs)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.dntnwsp)%>&nbsp; </td>
		<td> <%= Util.comma(curcommlistRec.cupn)%>&nbsp; </td>
	</tr>
<%}%>
<!--�������μ� ��Ȳ ��� �� ---------------------------------------------------------------------------->      
</table>
</body>
</html>