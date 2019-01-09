<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_2010_LDataSet ds = (AD_NMD_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_2010_LCURLISTRecord rec = (AD_NMD_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "demand_dlco_no"	, rec.demand_dlco_no);
			rx.addCData(record, "demand_dlco_nm"	, rec.demand_dlco_nm);
			System.out.println(rec.demand_dlco_nm);
			rx.add(record, "sum_adjst_amt"	, rec.sum_adjst_amt);
			rx.add(record, "proc_yn"		, rec.proc_yn);
			rx.add(record, "slip_occr_dt"		, rec.slip_occr_dt);
			rx.add(record, "slip_seq"		, rec.slip_seq);
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
<gridData>
	<record>
		<mortg_clsf/>
		<dlco_nm/>
		<cntr_type/>
		<mortg_cont/>
		<setup_pers/>
		<acct_no/>
		<mortg_amt/>
		<cntr_dt/>
		<gurt_todt/>
		<ewh_dt/>
		<owh_dt/>
		<remk/>
	</record>
</gridData>
*/
%>

<% /* 작성시간 : Thu Jan 15 11:10:47 KST 2009 */ %>