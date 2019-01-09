<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_5000_m.jsp
* 기능 :  판매 - 입금관리 - 마감관리 - 일입금마감
* 작성일자 : 2009-05-20
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
	SE_RCP_5010_SDataSet ds = (SE_RCP_5010_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;

	try {
		formData			= rx.add(root, "closInfo", "");
		rx.add(formData, "clos_yn"	, ds.clos_yn	);
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