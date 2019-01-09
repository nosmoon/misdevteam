<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_5008_LDataSet ds = (HD_SALY_5008_LDataSet)request.getAttribute("ds");
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
			HD_SALY_5008_LCURLISTRecord rec = (HD_SALY_5008_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no_1", rec.emp_no_1);
			rx.add(record, "emp_impn_amt", rec.emp_impn_amt);
			rx.add(record, "emp_slf_burd_amt", rec.emp_slf_burd_amt);
			rx.add(record, "emp_adjm_obj_amt", rec.emp_adjm_obj_amt);
			rx.add(record, "emp_ipymt_six_mm_amt", rec.emp_ipymt_six_mm_amt);
			rx.add(record, "emp_mm_dduc_base_amt", rec.emp_mm_dduc_base_amt);
			rx.add(record, "emp_ipymt_amt", rec.emp_ipymt_amt);
			rx.add(record, "emp_mm_dduc_tot_amt", rec.emp_mm_dduc_tot_amt);
			rx.add(record, "emp_befr_dduc_amt", rec.emp_befr_dduc_amt);
			rx.add(record, "emp_ipymt_months", rec.emp_ipymt_months);
			rx.add(record, "emp_no_2", rec.emp_no_2);
			rx.add(record, "hlth_impn_amt", rec.hlth_impn_amt);
			rx.add(record, "hlth_slf_burd_amt", rec.hlth_slf_burd_amt);
			rx.add(record, "hlth_adjm_obj_amt", rec.hlth_adjm_obj_amt);
			rx.add(record, "hlth_ipymt_six_mm_amt", rec.hlth_ipymt_six_mm_amt);
			rx.add(record, "hlth_mm_dduc_base_amt", rec.hlth_mm_dduc_base_amt);
			rx.add(record, "hlth_ipymt_amt", rec.hlth_ipymt_amt);
			rx.add(record, "hlth_mm_dduc_tot_amt", rec.hlth_mm_dduc_tot_amt);
			rx.add(record, "hlth_befr_dduc_amt", rec.hlth_befr_dduc_amt);
			rx.add(record, "hlth_ipymt_months", rec.hlth_ipymt_months);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "impn_amt", StringUtil.replaceToXml(rec.impn_amt));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "adjm_obj_amt", StringUtil.replaceToXml(rec.adjm_obj_amt));
			//rx.add(record, "ipymt_six_mm_amt", StringUtil.replaceToXml(rec.ipymt_six_mm_amt));
			//rx.add(record, "mm_dduc_base_amt", StringUtil.replaceToXml(rec.mm_dduc_base_amt));
			//rx.add(record, "ipymt_amt", StringUtil.replaceToXml(rec.ipymt_amt));
			//rx.add(record, "mm_dduc_tot_amt", StringUtil.replaceToXml(rec.mm_dduc_tot_amt));
			//rx.add(record, "befr_dduc_amt", StringUtil.replaceToXml(rec.befr_dduc_amt));
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
<hd_saly_5008_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<impn_amt/>
				<slf_burd_amt/>
				<adjm_obj_amt/>
				<ipymt_six_mm_amt/>
				<mm_dduc_base_amt/>
				<ipymt_amt/>
				<mm_dduc_tot_amt/>
				<befr_dduc_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_5008_l>
*/
%>

<% /* 작성시간 : Tue Oct 22 17:22:05 KST 2013 */ %>