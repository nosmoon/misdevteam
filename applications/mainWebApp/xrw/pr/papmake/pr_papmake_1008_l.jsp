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
	PR_PAPMAKE_1008_LDataSet ds = (PR_PAPMAKE_1008_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		formData = rx.add(recordSet, "medi_pcnt", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1008_LCURLIST2Record rec = (PR_PAPMAKE_1008_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "pj_qty", rec.pj_qty);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "seq", rec.seq);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		formData = rx.add(recordSet, "make_info", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1008_LCURLIST1Record rec = (PR_PAPMAKE_1008_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "ledt_cd", rec.ledt_cd);
			rx.add(record, "ledt_nm", rec.ledt_nm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "last_side", rec.last_side);
			rx.add(record, "rmsg_tm", rec.rmsg_tm);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "prt_qty", rec.prt_qty);
			rx.add(record, "out_gate", rec.out_gate);
			rx.add(record, "apcut_err", rec.apcut_err);
			rx.add(record, "runcut_err", rec.runcut_err);
			rx.add(record, "remk", rec.remk);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
			<medi_cd/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<pj_qty/>
			<remk/>
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
			<issu_dt/>
			<medi_cd/>
			<medi_nm/>
			<ecnt/>
			<last_edt_page/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<prt_qty/>
			<out_gate/>
			<apcut_err/>
			<runcut_err/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 27 09:37:53 KST 2009 */ %>