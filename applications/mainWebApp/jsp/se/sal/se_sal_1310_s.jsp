<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_1310_s.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 지국별 순매출액 조정
* 작성일자 : 2009-04-01
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx 				= new RwXml();
	SE_SAL_1310_SDataSet ds = (SE_SAL_1310_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;

	try {
		formData			= rx.add(root, "closInfo", "");
		rx.add(formData, "clos_yn"	, ds.clos_yn	);
		rx.add(formData, "chrg_pers", ds.chrg_pers	);
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<clos_yn/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Apr 01 10:01:41 KST 2009 */ %>