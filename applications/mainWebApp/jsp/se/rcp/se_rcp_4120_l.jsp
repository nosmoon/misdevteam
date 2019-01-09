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
<td>년월</td>
<td>부서코드</td>
<td>부섭명</td>
<td>파트코드</td>
<td>파트명</td>
<td>지역코드</td>
<td>지역명</td>
<td>센터명</td>
<td>지대판매망구분</td>
<td>센터코드</td>
<td>센터순번</td>
<td>정렬순서</td>
<td>금월발행부수</td>
<td>금월유가부수</td>
<td>금월유가무가</td>
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
