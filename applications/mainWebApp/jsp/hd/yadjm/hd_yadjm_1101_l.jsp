<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1101_LDataSet ds = (HD_YADJM_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_YADJM_1101_LCURLIST2Record rec = (HD_YADJM_1101_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "txn_std_sctn_1", StringUtil.replaceToXml(rec.txn_std_sctn_1));
			rx.add(record, "txn_std_sctn_2", StringUtil.replaceToXml(rec.txn_std_sctn_2));
			rx.add(record, "rate", StringUtil.replaceToXml(rec.rate));
			rx.add(record, "dedu_amt", StringUtil.replaceToXml(rec.dedu_amt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "txn_std_sctn_1", rec.txn_std_sctn_1);
			//rx.add(record, "txn_std_sctn_2", rec.txn_std_sctn_2);
			//rx.add(record, "rate", rec.rate);
			//rx.add(record, "dedu_amt", rec.dedu_amt);
			//rx.add(record, "seq", rec.seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_YADJM_1101_LCURLIST1Record rec = (HD_YADJM_1101_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_saly_sctn_1", StringUtil.replaceToXml(rec.tot_saly_sctn_1));
			rx.add(record, "tot_saly_sctn_2", StringUtil.replaceToXml(rec.tot_saly_sctn_2));
			rx.add(record, "labr_incm_add_amt", StringUtil.replaceToXml(rec.labr_incm_add_amt));
			rx.add(record, "labr_incm_dedu_amt", StringUtil.replaceToXml(rec.labr_incm_dedu_amt));
			rx.add(record, "labr_incm_dduc_rate", StringUtil.replaceToXml(rec.labr_incm_dduc_rate));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "tot_saly_sctn_1", rec.tot_saly_sctn_1);
			//rx.add(record, "tot_saly_sctn_2", rec.tot_saly_sctn_2);
			//rx.add(record, "labr_incm_add_amt", rec.labr_incm_add_amt);
			//rx.add(record, "labr_incm_dedu_amt", rec.labr_incm_dedu_amt);
			//rx.add(record, "labr_incm_dduc_rate", rec.labr_incm_dduc_rate);
			//rx.add(record, "seq", rec.seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_yadjm_1101_l>
	<dataSet>
		<CURLIST2>
			<record>
				<txn_std_sctn_1/>
				<txn_std_sctn_2/>
				<rate/>
				<dedu_amt/>
				<seq/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_yadjm_1101_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_yadjm_1101_l>
	<dataSet>
		<CURLIST1>
			<record>
				<tot_saly_sctn_1/>
				<tot_saly_sctn_2/>
				<labr_incm_add_amt/>
				<labr_incm_dedu_amt/>
				<labr_incm_dduc_rate/>
				<seq/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_yadjm_1101_l>
*/
%>

<% /* 작성시간 : Wed Aug 19 10:22:51 KST 2009 */ %>