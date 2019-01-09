<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etcbook.rec.*
	,	chosun.ciis.mt.etcbook.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCBOOK_1100_LDataSet ds = (MT_ETCBOOK_1100_LDataSet)request.getAttribute("ds");
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
			MT_ETCBOOK_1100_LCURLISTRecord rec = (MT_ETCBOOK_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ck", StringUtil.replaceToXml(rec.ck));
			rx.add(record, "clam_dt", StringUtil.replaceToXml(rec.clam_dt));
			rx.add(record, "draft_deptnm", StringUtil.replaceToXml(rec.draft_deptnm));
			rx.add(record, "subs_frdt", StringUtil.replaceToXml(rec.subs_frdt));
			rx.add(record, "sbend_dt", StringUtil.replaceToXml(rec.sbend_dt));
			rx.add(record, "book_cd", StringUtil.replaceToXml(rec.book_cd));
			rx.add(record, "book_nm", StringUtil.replaceToXml(rec.book_nm));
			rx.add(record, "qty", rec.qty);
			rx.add(record, "uprc_won", rec.uprc_won);
			rx.add(record, "curc_clsf", StringUtil.replaceToXml(rec.curc_clsf));
			rx.add(record, "uprc_frex", rec.uprc_frex);
			rx.add(record, "dlvs_plac", StringUtil.replaceToXml(rec.dlvs_plac));
			rx.add(record, "dlvs_dt", StringUtil.replaceToXml(rec.dlvs_dt));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			rx.add(record, "extd_dt", StringUtil.replaceToXml(rec.extd_dt));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "buy_plac_clsf", StringUtil.replaceToXml(rec.buy_plac_clsf));
			rx.add(record, "istt_hdqt_yn", StringUtil.replaceToXml(rec.istt_hdqt_yn));
			//rx.add(record, "ck", rec.ck);
			//rx.add(record, "clam_dt", rec.clam_dt);
			//rx.add(record, "draft_deptnm", rec.draft_deptnm);
			//rx.add(record, "subs_frdt", rec.subs_frdt);
			//rx.add(record, "sbend_dt", rec.sbend_dt);
			//rx.add(record, "book_cd", rec.book_cd);
			//rx.add(record, "book_nm", rec.book_nm);
			//rx.add(record, "qty", rec.qty);
			//rx.add(record, "uprc_won", rec.uprc_won);
			//rx.add(record, "curc_clsf", rec.curc_clsf);
			//rx.add(record, "uprc_frex", rec.uprc_frex);
			//rx.add(record, "dlvs_plac", rec.dlvs_plac);
			//rx.add(record, "dlvs_dt", rec.dlvs_dt);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "aplc_dt", rec.aplc_dt);
			//rx.add(record, "extd_dt", rec.extd_dt);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "buy_plac_clsf", rec.buy_plac_clsf);
			//rx.add(record, "istt_hdqt_yn", rec.istt_hdqt_yn);
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
<mt_etcbook_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<ck/>
				<clam_dt/>
				<draft_deptnm/>
				<subs_frdt/>
				<sbend_dt/>
				<book_cd/>
				<book_nm/>
				<qty/>
				<uprc_won/>
				<curc_clsf/>
				<uprc_frex/>
				<dlvs_plac/>
				<dlvs_dt/>
				<occr_dt/>
				<seq/>
				<dept_cd/>
				<aplc_dt/>
				<extd_dt/>
				<remk/>
				<buy_plac_clsf/>
				<istt_hdqt_yn/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etcbook_1100_l>
*/
%>

<% /* 작성시간 : Thu Jul 02 17:16:18 KST 2009 */ %>