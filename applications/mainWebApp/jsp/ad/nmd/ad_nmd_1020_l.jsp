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

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	AD_NMD_1020_LDataSet ds = (AD_NMD_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {

		long tot_mortg_amt = 0;
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_1020_LCURLISTRecord rec = (AD_NMD_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "cnt"			, rec.cnt);
			rx.add(record, "suply_amt"		, rec.suply_amt);
			rx.add(record, "suply_amt_g"	, rec.suply_amt_g);
			rx.add(record, "vat_amt"		, rec.vat_amt);
			rx.add(record, "p_suply_amt"	, rec.p_suply_amt);
			rx.add(record, "p_suply_amt_g"	, rec.p_suply_amt_g);
			rx.add(record, "p_vat_amt"		, rec.p_vat_amt); 
			rx.add(record, "w_suply_amt"	, rec.w_suply_amt);
			rx.add(record, "w_suply_amt_g"	, rec.w_suply_amt_g);
			rx.add(record, "w_vat_amt"		, rec.w_vat_amt);
			rx.add(record, "sum_suply_amt"	, rec.sum_suply_amt);
			rx.add(record, "sum_suply_amt_g", rec.sum_suply_amt_g);
			rx.add(record, "sum_vat_amt"	, rec.sum_vat_amt);
			rx.add(record, "slip_occr_dt"	, rec.slip_occr_dt);
			rx.add(record, "slip_seq_l"	, rec.slip_seq_l);
			

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