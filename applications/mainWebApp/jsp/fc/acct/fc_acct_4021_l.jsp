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
	FC_ACCT_4021_LDataSet ds = (FC_ACCT_4021_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_4021_LCURLIST1Record rec = (FC_ACCT_4021_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "occr_acct_cd", rec.occr_acct_cd);
			rx.add(record, "acctynm", rec.acctynm);
			rx.addCData(record, "rmks1", rec.rmks1);
			rx.addCData(record, "rmks2", rec.rmks2);
			rx.add(record, "extnc_acct_cd", rec.extnc_acct_cd);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "adjm_amt", rec.adjm_amt);
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			//rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			//rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
			//rx.add(record, "occr_acct_cd", StringUtil.replaceToXml(rec.occr_acct_cd));
			//rx.add(record, "acctynm", StringUtil.replaceToXml(rec.acctynm));
			//rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			//rx.add(record, "extnc_acct_cd", StringUtil.replaceToXml(rec.extnc_acct_cd));
			//rx.add(record, "occr_amt", StringUtil.replaceToXml(rec.occr_amt));
			//rx.add(record, "adjm_amt", StringUtil.replaceToXml(rec.adjm_amt));
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
<fc_acct_4021_l>
	<dataSet>
		<CURLIST1>
			<record>
				<acct_cd/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
				<occr_acct_cd/>
				<acctynm/>
				<rmks1/>
				<rmks2/>
				<extnc_acct_cd/>
				<occr_amt/>
				<adjm_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_4021_l>
*/
%>

<% /* 작성시간 : Fri Jul 03 11:19:26 KST 2009 */ %>