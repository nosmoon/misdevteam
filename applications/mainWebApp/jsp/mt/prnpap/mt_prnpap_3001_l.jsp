<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3001_LDataSet ds = (MT_PRNPAP_3001_LDataSet)request.getAttribute("ds");
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
			MT_PRNPAP_3001_LCURLISTRecord rec = (MT_PRNPAP_3001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowCnt", i + 1 );
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "pap_cmpy", rec.pap_cmpy);
			rx.add(record, "paper_clsf_cd", rec.paper_clsf_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "fr_roll", rec.fr_roll);
			rx.add(record, "fr_wt", rec.fr_wt);
			rx.add(record, "rem_qunt_cnt", rec.rem_qunt_cnt);
			rx.add(record, "rem_qunt_wgt", rec.rem_qunt_wgt);
			rx.add(record, "somo_roll", rec.somo_roll);
			rx.add(record, "somo_wgt", rec.somo_wgt);
			rx.add(record, "ewh_roll_cnt", rec.ewh_roll_cnt);
			rx.add(record, "ewh_wgt", rec.ewh_wgt);
			rx.add(record, "ewh_roll_cnt_to", rec.ewh_roll_cnt_to);
			rx.add(record, "ewh_wgt_to", rec.ewh_wgt_to);
			rx.add(record, "cnsm_qunt", rec.cnsm_qunt);
			rx.add(record, "wht_pj_retngod_wgt", rec.wht_pj_retngod_wgt);
			rx.add(record, "sum_wht_pj_retngod_wgt", rec.sum_wht_pj_retngod_wgt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
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
			<issu_dt/>
			<fac_clsf/>
			<pap_cmpy/>
			<paper_clsf_cd/>
			<matr_cd/>
			<fr_roll/>
			<fr_wt/>
			<rem_qunt_cnt/>
			<rem_qunt_wgt/>
			<somo_roll/>
			<somo_wgt/>
			<ewh_roll_cnt/>
			<ewh_wgt/>
			<ewh_roll_cnt_to/>
			<ewh_wgt_to/>
			<cnsm_qunt/>
			<wht_pj_retngod_wgt/>
			<occr_dt/>
			<seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jun 25 14:36:36 KST 2009 */ %>