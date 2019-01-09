<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_OTHCNSM_2200_LDataSet ds = (PR_OTHCNSM_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_OTHCNSM_2200_LCURLISTRecord rec = (PR_OTHCNSM_2200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			rx.add(record, "day_of_week", StringUtil.replaceToXml(rec.day_of_week));
			rx.add(record, "sect_type", StringUtil.replaceToXml(rec.sect_type));
			rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			rx.add(record, "issu_qty", StringUtil.replaceToXml(rec.issu_qty));
			rx.add(record, "bw_pcnt", StringUtil.replaceToXml(rec.bw_pcnt));
			rx.add(record, "clr_pcnt", StringUtil.replaceToXml(rec.clr_pcnt));
			rx.add(record, "film_use_qunt", StringUtil.replaceToXml(rec.film_use_qunt));
			rx.add(record, "u_1", StringUtil.replaceToXml(rec.u_1));
			rx.add(record, "n_1", StringUtil.replaceToXml(rec.n_1));
			rx.add(record, "u_2", StringUtil.replaceToXml(rec.u_2));
			rx.add(record, "n_2", StringUtil.replaceToXml(rec.n_2));
			rx.add(record, "u_4", StringUtil.replaceToXml(rec.u_4));
			rx.add(record, "n_4", StringUtil.replaceToXml(rec.n_4));
			rx.add(record, "u_m2", StringUtil.replaceToXml(rec.u_m2));
			rx.add(record, "n_m2", StringUtil.replaceToXml(rec.n_m2));
			rx.add(record, "u_m4", StringUtil.replaceToXml(rec.u_m4));
			rx.add(record, "n_m4", StringUtil.replaceToXml(rec.n_m4));
			rx.add(record, "prt_fee", StringUtil.replaceToXml(rec.prt_fee));
			rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			rx.add(record, "paper_amt", StringUtil.replaceToXml(rec.paper_amt));
			rx.add(record, "psplat_use_amt", StringUtil.replaceToXml(rec.psplat_use_amt));
			rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			rx.add(record, "dest_fee", StringUtil.replaceToXml(rec.dest_fee));
			rx.add(record, "ink_use_amt", StringUtil.replaceToXml(rec.ink_use_amt));
			rx.add(record, "etc_matr_fee", StringUtil.replaceToXml(rec.etc_matr_fee));
			rx.add(record, "base_leas_fee", StringUtil.replaceToXml(rec.base_leas_fee));
			rx.add(record, "real_leas_fee", StringUtil.replaceToXml(rec.real_leas_fee));
			rx.add(record, "leas_use_fee", StringUtil.replaceToXml(rec.leas_use_fee));
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "total", StringUtil.replaceToXml(rec.total));
			//rx.add(record, "issu_dt", rec.issu_dt);
			//rx.add(record, "day", rec.day);
			//rx.add(record, "issu_qty", rec.issu_qty);
			//rx.add(record, "bw_pcnt", rec.bw_pcnt);
			//rx.add(record, "clr_pcnt", rec.clr_pcnt);
			//rx.add(record, "film_use_qunt", rec.film_use_qunt);
			//rx.add(record, "u_1", rec.u_1);
			//rx.add(record, "n_1", rec.n_1);
			//rx.add(record, "u_2", rec.u_2);
			//rx.add(record, "n_2", rec.n_2);
			//rx.add(record, "u_4", rec.u_4);
			//rx.add(record, "n_4", rec.n_4);
			//rx.add(record, "u_m2", rec.u_m2);
			//rx.add(record, "n_m2", rec.n_m2);
			//rx.add(record, "u_m4", rec.u_m4);
			//rx.add(record, "n_m4", rec.n_m4);
			//rx.add(record, "prt_fee", rec.prt_fee);
			//rx.add(record, "paper_wgt", rec.paper_wgt);
			//rx.add(record, "paper_amt", rec.paper_amt);
			//rx.add(record, "psplat_use_amt", rec.psplat_use_amt);
			//rx.add(record, "gnaw_fee", rec.gnaw_fee);
			//rx.add(record, "film_make_fee", rec.film_make_fee);
			//rx.add(record, "pack_fee", rec.pack_fee);
			//rx.add(record, "paper_portage", rec.paper_portage);
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "total", rec.total);
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
<pr_othcnsm_2200_l>
	<dataSet>
		<CURLIST>
			<record>
				<issu_dt/>
				<day/>
				<issu_qty/>
				<bw_pcnt/>
				<clr_pcnt/>
				<film_use_qunt/>
				<u_1/>
				<n_1/>
				<u_2/>
				<n_2/>
				<u_4/>
				<n_4/>
				<u_m2/>
				<n_m2/>
				<u_m4/>
				<n_m4/>
				<prt_fee/>
				<paper_wgt/>
				<paper_amt/>
				<psplat_use_amt/>
				<gnaw_fee/>
				<film_make_fee/>
				<pack_fee/>
				<paper_portage/>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<total/>
			</record>
		</CURLIST>
	</dataSet>
</pr_othcnsm_2200_l>
*/
%>

<% /* 작성시간 : Mon Sep 28 16:44:31 KST 2009 */ %>