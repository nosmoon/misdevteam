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
* 파일명 : tn_rpt_1021_l.jsp
* 기능 : 모금보고-납입명단-엑셀다운로드
* 작성일자 : 2017-01-06
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm 대응.
	//content type이 text/html, text/xml이 아닌 경우 자동으로 download 전환이라고 하나 아래와 같이 이름 지정하지 않으면 제대로 동작하지 않음.
	//response.reset();  //엑셀열리는게이상함
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
<td> 영수증번호 </td>
<td> 발급일 </td>
<td> 기부자분류 </td>
<td> 성명 </td>
<td> 주민(사업자)번호 </td>
<td> 주소 </td>
<td> 납입기간시작일 </td>
<td> 납입기간종료일 </td>
<td> 납입건 </td>
<td> 발급금액 </td>
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