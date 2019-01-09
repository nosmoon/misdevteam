<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_1180_LDataSet ds = (AD_BAS_1180_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData2", "");

	try {
		/****** CURLIST2 BEGIN */
		int grid2 = rx.add(resData, "grid2", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_1180_LCURLIST1Record rec = (AD_BAS_1180_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(grid2, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "mortg_clsf", rec.mortg_clsf);
			rx.add(record, "mortg_cont", rec.mortg_cont);
			rx.add(record, "mortg_amt", rec.mortg_amt);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "gurt_frdt", rec.gurt_frdt);
			rx.add(record, "gurt_todt", rec.gurt_todt);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "setup_pers", rec.setup_pers); 
		}

		int grid3 = rx.add(resData, "grid3", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_1180_LCURLIST2Record rec = (AD_BAS_1180_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(grid3, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "mortg_clsf", rec.mortg_clsf);
			rx.add(record, "mortg_cont", rec.mortg_cont);
			rx.add(record, "mortg_amt", rec.mortg_amt);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "gurt_frdt", rec.gurt_frdt);
			rx.add(record, "gurt_todt", rec.gurt_todt);
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "setup_pers", rec.setup_pers);
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
	<CURLIST2>
		<record>
			<cntr_dt/>
			<seq/>
			<mortg_cont/>
			<mortg_amt/>
			<setup_pers/>
			<gurt_frdt/>
			<gurt_todt/>
			<remk/>
			<ewh_dt/>
			<mortg_clsf/>
			<acct_no/>
			<owh_dt/>
			<ewh_cnfm/>
			<owh_cnfm/>
			<repl_rtcn_cnfm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cntr_dt/>
			<seq/>
			<mortg_cont/>
			<mortg_amt/>
			<setup_pers/>
			<gurt_frdt/>
			<gurt_todt/>
			<remk/>
			<ewh_dt/>
			<mortg_clsf/>
			<acct_no/>
			<owh_dt/>
			<ewh_cnfm/>
			<owh_cnfm/>
			<repl_rtcn_cnfm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jan 20 09:34:44 KST 2009 */ %>