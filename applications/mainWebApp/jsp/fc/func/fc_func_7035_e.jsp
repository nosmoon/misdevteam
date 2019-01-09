<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_7035_EDataSet ds = (FC_FUNC_7035_EDataSet)request.getAttribute("ds");
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
			FC_FUNC_7035_ECURLISTRecord rec = (FC_FUNC_7035_ECURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "loan_nm", rec.loan_nm);
			rx.add(record, "loan_amt", rec.loan_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "int_clsf_cd", rec.int_clsf_cd);
			rx.add(record, "loan_rmks", rec.loan_rmks);
			rx.add(record, "loan_slip_occr_dt", rec.loan_slip_occr_dt);
			rx.add(record, "loan_slip_clsf_cd", rec.loan_slip_clsf_cd);
			rx.add(record, "loan_slip_seq", rec.loan_slip_seq);
			rx.add(record, "loan_repay_clsf_cd", rec.loan_repay_clsf_cd);
			rx.add(record, "compgbnm", rec.compgbnm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "intgbnm", rec.intgbnm);
			rx.add(record, "cishgbnm", rec.cishgbnm);
			rx.add(record, "int_rate", rec.int_rate);
			//rx.add(record, "loan_nm", StringUtil.replaceToXml(rec.loan_nm));
			//rx.add(record, "loan_amt", StringUtil.replaceToXml(rec.loan_amt));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "int_clsf_cd", StringUtil.replaceToXml(rec.int_clsf_cd));
			//rx.add(record, "loan_rmks", StringUtil.replaceToXml(rec.loan_rmks));
			//rx.add(record, "loan_slip_occr_dt", StringUtil.replaceToXml(rec.loan_slip_occr_dt));
			//rx.add(record, "loan_slip_clsf_cd", StringUtil.replaceToXml(rec.loan_slip_clsf_cd));
			//rx.add(record, "loan_slip_seq", StringUtil.replaceToXml(rec.loan_slip_seq));
			//rx.add(record, "loan_repay_clsf_cd", StringUtil.replaceToXml(rec.loan_repay_clsf_cd));
			//rx.add(record, "compgbnm", StringUtil.replaceToXml(rec.compgbnm));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "intgbnm", StringUtil.replaceToXml(rec.intgbnm));
			//rx.add(record, "cishgbnm", StringUtil.replaceToXml(rec.cishgbnm));
			//rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
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
<fc_func_7035_e>
	<dataSet>
		<CURLIST>
			<record>
				<loan_nm/>
				<loan_amt/>
				<comp_dt/>
				<mtry_dt/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<int_clsf_cd/>
				<loan_rmks/>
				<loan_slip_occr_dt/>
				<loan_slip_clsf_cd/>
				<loan_slip_seq/>
				<loan_repay_clsf_cd/>
				<compgbnm/>
				<compnm/>
				<intgbnm/>
				<cishgbnm/>
				<int_rate/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_7035_e>
*/
%>

<% /* 작성시간 : Tue Apr 07 11:13:48 KST 2009 */ %>