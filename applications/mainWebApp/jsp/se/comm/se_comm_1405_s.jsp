<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_comm_1405_s.jsp
* 기능 : 공통코드 1건검색
* 작성일자 : 2009-02-23
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_COMM_1405_SDataSet ds = (SE_COMM_1405_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tempRes", "");

	try {
		if(ds != null){
			rx.add(resData, "rsltcnt", ds.rsltcnt);
			rx.add(resData, "cd", ds.cd);
			rx.add(resData, "cdnm", ds.cdnm);
		}
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
		<rsltcnt/>
		<cd/>
		<cdnm/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 23 15:31:47 KST 2009 */ %>