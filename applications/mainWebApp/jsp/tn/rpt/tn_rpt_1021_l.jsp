<%@ page contentType="application/vnd.ms-excel; charset=EUC-KR" import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,   java.lang.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"%>
<%@ page buffer="none"%>
	
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : tn_rpt_1021_l.jsp
* ��� : ��ݺ���-���Ը��-�����ٿ�ε�
* �ۼ����� : 2017-01-06
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm ����.
	//content type�� text/html, text/xml�� �ƴ� ��� �ڵ����� download ��ȯ�̶�� �ϳ� �Ʒ��� ���� �̸� �������� ������ ����� �������� ����.
	//response.reset();  //���������°��̻���
	//response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
	response.setHeader("Content-Disposition","attachment; filename=receptlist.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
	//response.setHeader("Content-Transfer-Encoding", "binary;");
    //response.setHeader("Pragma", "no-cache;");
    //response.setHeader("Expires", "-1;");

	TN_RPT_1020_LDataSet ds = (TN_RPT_1020_LDataSet)request.getAttribute("ds");
%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=KSC5601" /></head>
<body>
<table>
<tr> 
<td> ��������ȣ </td>
<td> �߱��� </td>
<td> ����ںз� </td>
<td> ���� </td>
<td> �ֹ�(�����)��ȣ </td>
<td> �ּ� </td>
<td> ���ԱⰣ������ </td>
<td> ���ԱⰣ������ </td>
<td> ���԰� </td>
<td> �߱ޱݾ� </td>
</tr>
<%
for(int j=0; j<ds.curlist.size(); j++){
	TN_RPT_1020_LCURLISTRecord rec = (TN_RPT_1020_LCURLISTRecord)ds.curlist.get(j);
%>
<tr>
<td><%= rec.receiptcode%>&nbsp;</td>
<td><%= rec.issuedate%>&nbsp;</td>
<td><%= rec.receiptcategory%>&nbsp;</td>
<td><%= rec.name%>&nbsp;</td>
<td><%= rec.regno%>&nbsp;</td>
<td><%= rec.address%>&nbsp;</td>
<td><%= rec.mindate%>&nbsp;</td>
<td><%= rec.maxdate%>&nbsp;</td>
<td><%= rec.paymentcount%>&nbsp;</td>
<td><%= rec.price%>&nbsp;</td>
</tr>
<%
}
%>
</table>
</body>
</html>