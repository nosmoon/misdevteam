<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_2000_LDataSet ds = (PR_PAPMAKE_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_2000_LCURLISTRecord rec = (PR_PAPMAKE_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "dept_clsf", rec.dept_clsf);
			rx.add(record, "mang_nops", rec.mang_nops);
			rx.add(record, "prt_nops", rec.prt_nops);
			rx.add(record, "prt_board_nops", rec.prt_board_nops);
			rx.add(record, "repa_nops", rec.repa_nops);
			rx.add(record, "nwsp_high_nops", rec.nwsp_high_nops);
			rx.add(record, "send_nops", rec.send_nops);
			rx.add(record, "cmpos_nops", rec.cmpos_nops);
			rx.add(record, "mony_trad_nops", rec.mony_trad_nops);
			rx.add(record, "edt_side_nops", rec.edt_side_nops);
			rx.add(record, "advt_incmg_nops", rec.advt_incmg_nops);
			rx.add(record, "ofcr_nops", rec.ofcr_nops);
			rx.add(record, "gen_affr_nops", rec.gen_affr_nops);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "ref_matt", rec.ref_matt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
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
			<cmpy_cd/>
			<yymm/>
			<fac_clsf/>
			<dept_clsf/>
			<mang_nops/>
			<prt_nops/>
			<prt_board_nops/>
			<repa_nops/>
			<nwsp_high_nops/>
			<send_nops/>
			<cmpos_nops/>
			<mony_trad_nops/>
			<edt_side_nops/>
			<advt_incmg_nops/>
			<ofcr_nops/>
			<gen_affr_nops/>
			<remk/>
			<seq/>
			<ref_matt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 13 15:20:05 KST 2009 */ %>