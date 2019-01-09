<%@	page contentType="application/excel; charset=EUC-KR" import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%@ page buffer="none"%>
<%
	response.setHeader("Content-Disposition","attachment; filename=center_list.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
	
	SE_RCP_4121_LDataSet ds = (SE_RCP_4121_LDataSet)request.getAttribute("ds");
%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=KSC5601" /></head>
<body>
<table>
<tr> 
<td>���</td>
<td>�μ��ڵ�</td>
<td>�μ���</td>
<td>��Ʈ�ڵ�</td>
<td>��Ʈ��</td>
<td>�����ڵ�</td>
<td>������</td>
<td>�����ڵ�</td>
<td>���ͼ���</td>
<td>���͸�</td>
<td>���ʹ�ǥ��</td>
<td>����ŷ�ó��</td>
<td>����ڹ�ȣ</td>
<td>�����ȣ1</td>
<td>�����ȣ2</td>
<td>�����ּ�</td>
<td>��ȭ��ȣ1</td>
<td>��ȭ��ȣ2</td>
<td>��ȭ��ȣ3</td>
<td>���Ͱ������</td>
</tr>
<%
for(int i = 0; i < ds.curlist.size(); i++) {
	SE_RCP_4121_LCURLISTRecord rec = (SE_RCP_4121_LCURLISTRecord)ds.curlist.get(i);
%>
<tr>
<td><%=rec.yymm%></td>
<td><%=rec.dept_cd%></td>
<td><%=rec.dept_nm%></td>
<td><%=rec.part_cd%></td>
<td><%=rec.part_nm%></td>
<td><%=rec.area_cd%></td>
<td><%=rec.area_nm%></td>
<td><%=rec.bo_cd%></td>
<td><%=rec.bo_seq%></td>
<td><%=rec.bo_nm%></td>
<td><%=rec.bo_head_nm%></td>
<td><%=rec.dlco_nm%></td>
<td><%=rec.ern%></td>
<td><%=rec.bo_zip_1%></td>
<td><%=rec.bo_zip_2%></td>
<td><%=rec.bo_addr%></td>
<td><%=rec.tel_no_1_1%></td>
<td><%=rec.tel_no_1_2%></td>
<td><%=rec.tel_no_1_3%></td>
<td><%=rec.bo_cntr_dt%></td>
</tr>
<%
}
%>
</table>
</body>
</html>