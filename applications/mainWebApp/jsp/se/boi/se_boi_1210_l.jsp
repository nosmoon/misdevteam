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
* 파일명 : se_boi_1210_l.jsp																		 
* 기능 : 지국주소일괄변경 - 지국리스트 조회																					 
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
	SE_BOI_1210_LDataSet ds = (SE_BOI_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int item = 0;
	dataSet = rx.add(root, "bolistData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1210_LCURLISTRecord rec = (SE_BOI_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "bo_cd", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "zip", rec.zip_1+rec.zip_2);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dtls_addr", rec.dtls_addr);
			rx.add(record, "tel_no1", rec.tel_no1);
			rx.add(record, "tel_no2", rec.tel_no2);
			rx.add(record, "tel_no3", rec.tel_no3);
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
