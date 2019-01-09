<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_9051_LDataSet ds = (HD_AFFR_9051_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_9051_LCURLISTRecord rec = (HD_AFFR_9051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "usag_clsf_cd", rec.usag_clsf_cd);
			rx.add(record, "usag_clsf_nm", rec.usag_clsf_nm);
			rx.add(record, "journal_cd", rec.journal_cd);
			rx.add(record, "journal_nm", rec.journal_nm);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "subs_pay", rec.subs_pay);
			rx.add(record, "subs_tot_sum", rec.subs_tot_sum);
			rx.add(record, "mm_issu_tms", rec.mm_issu_tms);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "basi_dt", StringUtil.replaceToXml(rec.basi_dt));
			//rx.add(record, "usag_clsf_cd", StringUtil.replaceToXml(rec.usag_clsf_cd));
			//rx.add(record, "usag_clsf_nm", StringUtil.replaceToXml(rec.usag_clsf_nm));
			//rx.add(record, "journal_cd", StringUtil.replaceToXml(rec.journal_cd));
			//rx.add(record, "journal_nm", StringUtil.replaceToXml(rec.journal_nm));
			//rx.add(record, "qty", StringUtil.replaceToXml(rec.qty));
			//rx.add(record, "subs_pay", StringUtil.replaceToXml(rec.subs_pay));
			//rx.add(record, "subs_tot_sum", StringUtil.replaceToXml(rec.subs_tot_sum));
			//rx.add(record, "mm_issu_tms", StringUtil.replaceToXml(rec.mm_issu_tms));
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
<hd_affr_9051_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<basi_dt/>
				<usag_clsf_cd/>
				<usag_clsf_nm/>
				<journal_cd/>
				<journal_nm/>
				<qty/>
				<subs_pay/>
				<subs_tot_sum/>
				<mm_issu_tms/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9051_l>
*/
%>

<% /* 작성시간 : Mon Sep 12 10:47:02 KST 2016 */ %>