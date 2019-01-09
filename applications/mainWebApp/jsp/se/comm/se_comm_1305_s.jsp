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
* 파일명 : se_comm_1305_s.jsp
* 기능 : 
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
	SE_COMM_1305_SDataSet ds = (SE_COMM_1305_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");
	resform = rx.add(resData, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "rsltcnt", ds.rsltcnt);
			rx.add(resform, "bo_head_prn", ds.bo_head_prn);
			rx.addCData(resform, "bo_head_nm", ds.bo_head_nm);
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
		<bo_head_prn/>
		<bo_head_nm/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 23 13:56:07 KST 2009 */ %>
