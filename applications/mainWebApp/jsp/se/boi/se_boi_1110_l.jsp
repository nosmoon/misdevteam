<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1110_l.jsp
* 기능 : 지국지역관리 -지국리스트 조회
* 작성일자 : 2009-02-06
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
	SE_BOI_1110_LDataSet ds = (SE_BOI_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	dataSet = rx.add(root, "bolistData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1110_LCURLISTRecord rec = (SE_BOI_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "bo_cd", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "chg_prv_area_cd", rec.chg_prv_area_cd);
			rx.add(record, "chg_prv_srt_seq", rec.chg_prv_srt_seq);
			rx.add(record, "chg_aft_area_cd", rec.chg_aft_area_cd);
			rx.add(record, "chg_aft_srt_seq", rec.chg_aft_srt_seq);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<bo_head_nm/>
			<chg_prv_area_cd/>
			<chg_prv_srt_seq/>
			<chg_aft_area_cd/>
			<chg_aft_srt_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Jan 30 13:32:01 KST 2009 */ %>
