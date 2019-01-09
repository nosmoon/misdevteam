<%@ page contentType="application/vnd.ms-excel; charset=EUC-KR" import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,   java.lang.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"%>
<%@ page buffer="none"%>
	
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : fc_acct_2482.jsp
* ��� : ��ݺ���-�������-�����ٿ�ε�
* �ۼ����� : 2017-01-05
* �ۼ��� : ������
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
	response.setHeader("Content-Disposition","attachment; filename=list.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
    FC_ACCT_2481_LDataSet ds = (FC_ACCT_2481_LDataSet)request.getAttribute("ds");
%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=KSC5601" />
<style>
.text {mso-number-format: "@";}
.number {mso-number-format:"0"}
</style>
</head>
<body>
<table border="1">
<tr> 
<td> �����ڵ� </td>
<td> ����� </td>
<td> ȸ������ </td>
<td> ��ǥ��ȣ </td>
<td> ���� </td>
<td> �����ݾ� </td>
<td> �뺯�ݾ� </td>
<td> �������� </td>
<td> ������ȣ </td>
<td> �ŷ�ó���� </td>
<td> �ŷ�ó�ڵ� </td>
<td> �ŷ�ó�� </td>
<td> �ΰŷ�ó�� </td>
<td> ��ü�ڵ� </td>
<td> �󼼸�ü�ڵ� </td>
<td> ���������� </td>
<td> ���μ� </td>
<td> ����ڵ� </td>
<td> û���μ� </td>
<td> ������ </td>
<td> ���ݾ� </td>
<td> �ҵ汸�� </td>
</tr>
<%
for(int j=0; j<ds.curlist.size(); j++){ 
 FC_ACCT_2481_LCURLISTRecord curlistRec = (FC_ACCT_2481_LCURLISTRecord)ds.curlist.get(j);
%>
<tr>
<td class="text"><%= curlistRec.budg_cd%></td>
<td><%= curlistRec.budg_cd_nm%></td>
<td><%= curlistRec.fisc_dt%></td>
<td><%= curlistRec.slip_occr_dt%>-<%= curlistRec.slip_clsf_cd%>-<%= curlistRec.slip_seq%>-<%= curlistRec.slip_sub_seq%>-<%= curlistRec.slip_arow_no%></td>
<td><%= curlistRec.rmks1%></td>
<td class="number"><%= curlistRec.dr_amt%></td>
<td class="number"><%= curlistRec.crdt_amt%></td>
<td><%= curlistRec.mang_clsf_cd_nm%></td>	
<td><%= curlistRec.mang_no%></td>
<td><%= curlistRec.dlco_clsf_cd_nm%></td>
<td><%= curlistRec.dlco_cd%></td>
<td><%= curlistRec.dlco_nm%></td>
<td><%= curlistRec.boks_dlco_nm%></td>
<td><%= curlistRec.medi_cd%> <%= curlistRec.medi_cd_nm%></td>
<td><%= curlistRec.dtls_medi_cd%> <%= curlistRec.dtls_medi_cdnm%></td>
<td><%= curlistRec.prop_equip_cd%></td>
<td><%= curlistRec.use_dept_cd%></td>
<td><%= curlistRec.evnt_cd%></td>
<td><%= curlistRec.clam_dept_cd_nm%></td>
<td><%= curlistRec.obj_acct_cd_nm%></td>
<td class="number"><%= curlistRec.obj_amt%></td>
<td><%= curlistRec.incm_clsf_cd_nm%></td>
</tr>
<%
}
%>
</table>
</body>
</html>