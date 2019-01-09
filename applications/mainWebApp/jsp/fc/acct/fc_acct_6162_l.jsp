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
	FC_ACCT_6162_LDataSet ds = (FC_ACCT_6162_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6162_LCURLIST2Record rec = (FC_ACCT_6162_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "prof_type_cd", rec.prof_type_cd);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "from_fisc_dt", rec.from_fisc_dt);
			//rx.add(record, "to_fisc_dt", rec.to_fisc_dt);
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "from_fisc_dt", StringUtil.replaceToXml(rec.from_fisc_dt));
			rx.add(record, "to_fisc_dt", StringUtil.replaceToXml(rec.to_fisc_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6162_LCURLIST1Record rec = (FC_ACCT_6162_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "cbamt", rec.cbamt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "from_fisc_dt", rec.from_fisc_dt);
			//rx.add(record, "to_fisc_dt", rec.to_fisc_dt);
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "cbamt", StringUtil.replaceToXml(rec.cbamt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "from_fisc_dt", StringUtil.replaceToXml(rec.from_fisc_dt));
			rx.add(record, "to_fisc_dt", StringUtil.replaceToXml(rec.to_fisc_dt));
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
<fc_acct_6162_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dlco_cd/>
				<suply_amt/>
				<vat_amt/>
				<prof_type_cd/>
				<slip_clsf_cd/>
				<from_fisc_dt/>
				<to_fisc_dt/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_6162_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_6162_l>
	<dataSet>
		<CURLIST1>
			<record>
				<dlco_cd/>
				<cbamt/>
				<slip_clsf_cd/>
				<from_fisc_dt/>
				<to_fisc_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_6162_l>
*/
%>

<% /* 작성시간 : Tue Sep 15 16:08:12 KST 2009 */ %>