<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2151_LDataSet ds = (FC_ACCT_2151_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2151_LCURLISTRecord rec = (FC_ACCT_2151_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip", rec.slip);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "item", rec.item);
			rx.add(record, "occr_slip", rec.occr_slip);
			rx.add(record, "occr_slip_occr_dt", rec.occr_slip_occr_dt);
			rx.add(record, "occr_slip_clsf_cd", rec.occr_slip_clsf_cd);
			rx.add(record, "occr_slip_seq", rec.occr_slip_seq);
			rx.add(record, "occr_slip_sub_seq", rec.occr_slip_sub_seq);
			rx.add(record, "sgamt", rec.sgamt);
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip", StringUtil.replaceToXml(rec.slip));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			//rx.add(record, "make_dt", StringUtil.replaceToXml(rec.make_dt));
			//rx.add(record, "item", StringUtil.replaceToXml(rec.item));
			//rx.add(record, "occr_slip", StringUtil.replaceToXml(rec.occr_slip));
			//rx.add(record, "occr_slip_occr_dt", StringUtil.replaceToXml(rec.occr_slip_occr_dt));
			//rx.add(record, "occr_slip_clsf_cd", StringUtil.replaceToXml(rec.occr_slip_clsf_cd));
			//rx.add(record, "occr_slip_seq", StringUtil.replaceToXml(rec.occr_slip_seq));
			//rx.add(record, "occr_slip_sub_seq", StringUtil.replaceToXml(rec.occr_slip_sub_seq));
			//rx.add(record, "sgamt", StringUtil.replaceToXml(rec.sgamt));
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
<fc_acct_2151_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_clsf_cd/>
				<slip_occr_dt/>
				<slip_seq/>
				<slip/>
				<dlco_cd/>
				<dlco_nm/>
				<make_dt/>
				<item/>
				<occr_slip/>
				<occr_slip_occr_dt/>
				<occr_slip_clsf_cd/>
				<occr_slip_seq/>
				<occr_slip_sub_seq/>
				<sgamt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2151_l>
*/
%>

<% /* 작성시간 : Tue Apr 28 16:45:03 KST 2009 */ %>