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
	FC_ACCT_5312_LDataSet ds = (FC_ACCT_5312_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5312_LCURLISTRecord rec = (FC_ACCT_5312_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "acacctynm", rec.acacctynm);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "ycyscdnm", rec.ycyscdnm);
			//rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "rmks1", rec.rmks1);
			//rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "slip_seq", rec.slip_seq);
			//rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			//rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			rx.add(record, "acacctynm", StringUtil.replaceToXml(rec.acacctynm));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "ycyscdnm", StringUtil.replaceToXml(rec.ycyscdnm));
			rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
			rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "slip_seq", StringUtil.replaceToXml(rec.slip_seq));
			rx.add(record, "slip_sub_seq", StringUtil.replaceToXml(rec.slip_sub_seq));
			rx.add(record, "slip_arow_no", StringUtil.replaceToXml(rec.slip_arow_no));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_5312_l>
	<dataSet>
		<CURLIST>
			<record>
				<fisc_dt/>
				<slip_no/>
				<acct_cd/>
				<acacctynm/>
				<budg_cd/>
				<ycyscdnm/>
				<dtls_medi_cd/>
				<dr_amt/>
				<rmks1/>
				<rmks2/>
				<medi_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<clam_dept_cd/>
				<use_dept_cd/>
				<boks_dlco_nm/>
				<slip_occr_dt/>
				<slip_clsf_cd/>
				<slip_seq/>
				<slip_sub_seq/>
				<slip_arow_no/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_5312_l>
*/
%>

<% /* �ۼ��ð� : Fri Jun 19 10:11:58 KST 2009 */ %>