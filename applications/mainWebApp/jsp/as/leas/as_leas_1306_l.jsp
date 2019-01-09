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
	AS_LEAS_1306_LDataSet ds = (AS_LEAS_1306_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1306_LCURLISTRecord rec = (AS_LEAS_1306_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			rx.add(record, "cntr_gurt_amt", StringUtil.replaceToXml(rec.cntr_gurt_amt));
			rx.add(record, "gurt_tot_amt", StringUtil.replaceToXml(rec.gurt_tot_amt));
			rx.add(record, "gurt_out_amt", StringUtil.replaceToXml(rec.gurt_out_amt));
			rx.add(record, "precpt_tot_amt", StringUtil.replaceToXml(rec.precpt_tot_amt));
			rx.add(record, "precpt_out_amt", StringUtil.replaceToXml(rec.precpt_out_amt));
			rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			rx.add(record, "hire_dlco_clsf_cd", StringUtil.replaceToXml(rec.hire_dlco_clsf_cd));
			//rx.add(record, "bldg_nm", rec.bldg_nm);
			//rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			//rx.add(record, "cntr_no", rec.cntr_no);
			//rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
			//rx.add(record, "gurt_tot_amt", rec.gurt_tot_amt);
			//rx.add(record, "gurt_out_amt", rec.gurt_out_amt);
			//rx.add(record, "precpt_tot_amt", rec.precpt_tot_amt);
			//rx.add(record, "precpt_out_amt", rec.precpt_out_amt);
			//rx.add(record, "bldg_cd", rec.bldg_cd);
			//rx.add(record, "cntr_yy", rec.cntr_yy);
			//rx.add(record, "cntr_seq", rec.cntr_seq);
			//rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			//rx.add(record, "hire_dlco_clsf_cd", rec.hire_dlco_clsf_cd);
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
<as_leas_1306_l>
	<dataSet>
		<CURLIST>
			<record>
				<bldg_nm/>
				<hire_dlco_nm/>
				<cntr_no/>
				<cntr_gurt_amt/>
				<gurt_tot_amt/>
				<gurt_out_amt/>
				<precpt_tot_amt/>
				<precpt_out_amt/>
				<bldg_cd/>
				<cntr_yy/>
				<cntr_seq/>
				<hire_dlco_ern/>
				<hire_dlco_clsf_cd/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1306_l>
*/
%>

<% /* 작성시간 : Tue Jun 02 14:24:00 KST 2009 */ %>