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
	FC_ACCT_2022_LDataSet ds = (FC_ACCT_2022_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_2022_LCURLISTRecord rec = (FC_ACCT_2022_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "old_dlco_clsf_cd", rec.old_dlco_clsf_cd);
			rx.add(record, "old_dlco_cd", rec.old_dlco_cd);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.add(record, "nosh", rec.nosh);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "atic_fee", rec.atic_fee);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "with_tax", rec.with_tax);
			rx.addCData(record, "atic_nm", rec.atic_nm);
			rx.add(record, "incm_tax", rec.incm_tax);
			rx.add(record, "res_tax", rec.res_tax);
			rx.add(record, "pch_compnm", rec.pch_compnm);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "cal_pay_amt", rec.cal_pay_amt);
			rx.add(record, "bank_clsf", rec.bank_clsf);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "deps_pers_nm", rec.deps_pers_nm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.addCData(record, "dtls_medi_cdnm", rec.dtls_medi_cdnm);
			//rx.add(record, "old_dlco_clsf_cd", StringUtil.replaceToXml(rec.old_dlco_clsf_cd));
			//rx.add(record, "old_dlco_cd", StringUtil.replaceToXml(rec.old_dlco_cd));
			//rx.add(record, "pubc_dt", StringUtil.replaceToXml(rec.pubc_dt));
			//rx.add(record, "incm_clsf_cd", StringUtil.replaceToXml(rec.incm_clsf_cd));
			//rx.add(record, "nosh", StringUtil.replaceToXml(rec.nosh));
			//rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
			//rx.add(record, "atic_fee", StringUtil.replaceToXml(rec.atic_fee));
			//rx.add(record, "coms", StringUtil.replaceToXml(rec.coms));
			//rx.add(record, "with_tax", StringUtil.replaceToXml(rec.with_tax));
			//rx.add(record, "atic_nm", StringUtil.replaceToXml(rec.atic_nm));
			//rx.add(record, "incm_tax", StringUtil.replaceToXml(rec.incm_tax));
			//rx.add(record, "res_tax", StringUtil.replaceToXml(rec.res_tax));
			//rx.add(record, "pch_compnm", StringUtil.replaceToXml(rec.pch_compnm));
			//rx.add(record, "pubc_side", StringUtil.replaceToXml(rec.pubc_side));
			//rx.add(record, "cal_pay_amt", StringUtil.replaceToXml(rec.cal_pay_amt));
			//rx.add(record, "bank_clsf", StringUtil.replaceToXml(rec.bank_clsf));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "deps_pers_nm", StringUtil.replaceToXml(rec.deps_pers_nm));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			//rx.add(record, "dtls_medi_cdnm", StringUtil.replaceToXml(rec.dtls_medi_cdnm));
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
<fc_acct_2022_l>
	<dataSet>
		<CURLIST>
			<record>
				<old_dlco_clsf_cd/>
				<old_dlco_cd/>
				<pubc_dt/>
				<incm_clsf_cd/>
				<nosh/>
				<uprc/>
				<atic_fee/>
				<coms/>
				<with_tax/>
				<atic_nm/>
				<incm_tax/>
				<res_tax/>
				<pch_compnm/>
				<pubc_side/>
				<cal_pay_amt/>
				<bank_clsf/>
				<acct_no/>
				<deps_pers_nm/>
				<dtls_medi_cd/>
				<dtls_medi_cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2022_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 21:19:23 KST 2009 */ %>