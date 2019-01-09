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
<td>년월</td>
<td>부서코드</td>
<td>부섭명</td>
<td>파트코드</td>
<td>파트명</td>
<td>지역코드</td>
<td>지역명</td>
<td>센터코드</td>
<td>센터순번</td>
<td>센터명</td>
<td>센터대표명</td>
<td>공통거래처명</td>
<td>사업자번호</td>
<td>우편번호1</td>
<td>우편번호2</td>
<td>센터주소</td>
<td>전화번호1</td>
<td>전화번호2</td>
<td>전화번호3</td>
<td>센터계약일자</td>
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