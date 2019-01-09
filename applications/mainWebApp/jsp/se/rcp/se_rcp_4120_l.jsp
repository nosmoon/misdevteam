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
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%
	response.setHeader("Content-Disposition","attachment; filename=sports_data.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
	
	SE_RCP_4120_LDataSet ds = (SE_RCP_4120_LDataSet)request.getAttribute("ds");
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
<td>���͸�</td>
<td>�����ǸŸ�����</td>
<td>�����ڵ�</td>
<td>���ͼ���</td>
<td>���ļ���</td>
<td>�ݿ�����μ�</td>
<td>�ݿ������μ�</td>
<td>�ݿ���������</td>
</tr>
<%
for(int i = 0; i < ds.curlist.size(); i++) {
	SE_RCP_4120_LCURLISTRecord rec = (SE_RCP_4120_LCURLISTRecord)ds.curlist.get(i);
%>
<tr>
<td><%=rec.yymm%></td>
<td><%=rec.dept_cd%></td>
<td><%=rec.dept_nm%></td>
<td><%=rec.part_cd%></td>
<td><%=rec.part_nm%></td>
<td><%=rec.area_cd%></td>
<td><%=rec.area_nm%></td>
<td><%=rec.bo_nm%></td>
<td><%=rec.jd_sell_net_clsf%></td>
<td><%=rec.bo_cd%></td>
<td><%=rec.bo_seq%></td>
<td><%=rec.srt_seq%></td>
<td><%=rec.curmm_issu_qty%></td>
<td><%=rec.curmm_val_qty%></td>
<td><%=rec.curmm_tot_qty%></td>
</tr>
<%
}
%>
</table>
</body>
</html>
