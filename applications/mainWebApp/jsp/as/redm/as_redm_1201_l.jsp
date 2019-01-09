<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.redm.rec.*
	,	chosun.ciis.as.redm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_REDM_1201_LDataSet ds = (AS_REDM_1201_LDataSet)request.getAttribute("ds");
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
			AS_REDM_1201_LCURLISTRecord rec = (AS_REDM_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "meda_amt", rec.meda_amt);
			rx.add(record, "redm_extt_amt", rec.redm_extt_amt);
			rx.add(record, "cur_redm_agg_amt", rec.cur_redm_agg_amt);
			rx.add(record, "pre_bi_amt", rec.pre_bi_amt);
			rx.add(record, "stcuramt", rec.stcuramt);
			rx.add(record, "cur_end_bi_amt", rec.cur_end_bi_amt);
			rx.add(record, "redm_mthd_cd", rec.redm_mthd_cd);
			rx.add(record, "redm_stat_cd", rec.redm_stat_cd);
			rx.add(record, "hsty__stat_cd", rec.hsty__stat_cd);
			rx.add(record, "acct_book_amt", rec.acct_book_amt);
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "meda_amt", StringUtil.replaceToXml(rec.meda_amt));
			//rx.add(record, "redm_extt_amt", StringUtil.replaceToXml(rec.redm_extt_amt));
			//rx.add(record, "cur_redm_agg_amt", StringUtil.replaceToXml(rec.cur_redm_agg_amt));
			//rx.add(record, "pre_bi_amt", StringUtil.replaceToXml(rec.pre_bi_amt));
			//rx.add(record, "stcuramt", StringUtil.replaceToXml(rec.stcuramt));
			//rx.add(record, "cur_end_bi_amt", StringUtil.replaceToXml(rec.cur_end_bi_amt));
			//rx.add(record, "redm_mthd_cd", StringUtil.replaceToXml(rec.redm_mthd_cd));
			//rx.add(record, "redm_stat_cd", StringUtil.replaceToXml(rec.redm_stat_cd));
			//rx.add(record, "hsty__stat_cd", StringUtil.replaceToXml(rec.hsty__stat_cd));
			//rx.add(record, "acct_book_amt", StringUtil.replaceToXml(rec.acct_book_amt));
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
<as_redm_1201_l>
	<dataSet>
		<CURLIST>
			<record>
				<aset_no/>
				<aset_nm/>
				<meda_amt/>
				<redm_extt_amt/>
				<cur_redm_agg_amt/>
				<pre_bi_amt/>
				<stcuramt/>
				<cur_end_bi_amt/>
				<redm_mthd_cd/>
				<redm_stat_cd/>
				<hsty__stat_cd/>
				<acct_book_amt/>
			</record>
		</CURLIST>
	</dataSet>
</as_redm_1201_l>
*/
%>

<% /* 작성시간 : Tue May 12 16:11:35 KST 2009 */ %>