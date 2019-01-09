<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1915_s.jsp
* 기능 : 부실확장등록 - 지국의 팀,파트,지역명 가져오기
* 작성일자 : 2009-07-01
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
	SE_TRG_1915_SDataSet ds = (SE_TRG_1915_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "recv", "");

	try {
		if(ds != null){
			rx.add(resData, "team_nm", ds.team_nm);
			rx.add(resData, "part_nm", ds.part_nm);
			rx.add(resData, "area_nm", ds.area_nm);
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
		<team_nm/>
		<part_nm/>
		<area_nm/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Jul 01 20:44:51 KST 2009 */ %>