<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_1310_LDataSet ds = (AD_BAS_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int gridData = rx.add(root, "gridData", "");

	try {

		long tot_mortg_amt = 0;
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1310_LCURLISTRecord rec = (AD_BAS_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "mortg_clsf"		, rec.mortg_clsf);
			rx.add(record, "dlco_nm"		, rec.dlco_nm);
			rx.add(record, "cntr_type"		, rec.cntr_type);
			rx.add(record, "mortg_cont"		, rec.mortg_cont);
			rx.add(record, "setup_pers"		, rec.setup_pers);
			rx.add(record, "acct_no"		, rec.acct_no);
			rx.add(record, "mortg_amt"		, rec.mortg_amt);
			rx.add(record, "cntr_dt"		, rec.cntr_dt);
			rx.add(record, "cntr_todt"		, rec.cntr_todt);
			rx.add(record, "gurt_frdt"		, rec.gurt_frdt);
			rx.add(record, "gurt_todt"		, rec.gurt_todt);
			rx.add(record, "ewh_dt"			, rec.ewh_dt);
			rx.add(record, "owh_dt"			, rec.owh_dt);
			rx.add(record, "remk"			, rec.remk); 
			rx.add(record, "del_yn"			, rec.del_yn); 			
			
			tot_mortg_amt += StringUtil.toNumber(rec.mortg_amt);
		}
		
	 	rx.add(gridData, "tot_mortg_amt"		, tot_mortg_amt);
		
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