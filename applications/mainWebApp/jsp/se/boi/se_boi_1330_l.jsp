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
* 파일명 : se_boi_1330_l.jsp
* 기능 : 지국현황조회 - 지국전세보증금탭 조회
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
	SE_BOI_1330_LDataSet ds = (SE_BOI_1330_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab3list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1330_LCURLISTRecord rec = (SE_BOI_1330_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "cntr_stat_nm", rec.cntr_stat_nm);
			rx.add(record, "bo_cntr_dt", rec.bo_cntr_dt);
			rx.add(record, "bo_expy_dt", rec.bo_expy_dt);
			rx.add(record, "out_gurt_amt", rec.out_gurt_amt);
			rx.add(record, "out_amt_dt", rec.out_amt_dt);
			rx.add(record, "in_gurt_amt", rec.in_gurt_amt);
			rx.add(record, "in_amt_dt", rec.in_amt_dt);
			rx.add(record, "leas_sply_amt_unrcp_occr_dt", rec.leas_sply_amt_unrcp_occr_dt);
			rx.add(record, "leas_sply_amt_bal", rec.leas_sply_amt_bal);
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
<resData>
	<CURLIST>
		<record>
			<area_nm/>
			<bo_nm/>
			<bo_head_nm/>
			<ern/>
			<bizcond/>
			<item/>
			<dlco_nm/>
			<zip/>
			<addr/>
			<presi_nm/>
			<presi_prn/>
			<presi_zip/>
			<presi_addr/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Feb 03 10:01:21 KST 2009 */ %>
