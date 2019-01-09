<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1801_LDataSet ds = (AS_LEAS_1801_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1801_LCURLISTRecord rec = (AS_LEAS_1801_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "flag", StringUtil.replaceToXml(rec.flag));
			rx.add(record, "occr_no", StringUtil.replaceToXml(rec.occr_no));
			rx.add(record, "inout_clsf_nm", StringUtil.replaceToXml(rec.inout_clsf_nm));
			rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			rx.add(record, "inout_clsf", StringUtil.replaceToXml(rec.inout_clsf));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "occr_seq", StringUtil.replaceToXml(rec.occr_seq));
			//rx.add(record, "flag", rec.flag);
			//rx.add(record, "occr_no", rec.occr_no);
			//rx.add(record, "inout_clsf_nm", rec.inout_clsf_nm);
			//rx.add(record, "bldg_nm", rec.bldg_nm);
			//rx.add(record, "cntr_no", rec.cntr_no);
			//rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			//rx.add(record, "remk", rec.remk);
			//rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			//rx.add(record, "actu_slip_no", rec.actu_slip_no);
			//rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			//rx.add(record, "bldg_cd", rec.bldg_cd);
			//rx.add(record, "inout_clsf", rec.inout_clsf);
			//rx.add(record, "occr_dt", rec.occr_dt);
			//rx.add(record, "occr_seq", rec.occr_seq);
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
<as_leas_1801_l>
	<dataSet>
		<CURLIST>
			<record>
				<flag/>
				<occr_no/>
				<inout_clsf_nm/>
				<bldg_nm/>
				<cntr_no/>
				<hire_dlco_nm/>
				<remk/>
				<rcpm_tot_amt/>
				<actu_slip_no/>
				<hire_dlco_ern/>
				<bldg_cd/>
				<inout_clsf/>
				<occr_dt/>
				<occr_seq/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1801_l>
*/
%>

<% /* 작성시간 : Fri May 29 09:53:59 KST 2009 */ %>