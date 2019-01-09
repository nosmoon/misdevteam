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
	AS_LEAS_1310_LDataSet ds = (AS_LEAS_1310_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1310_LCURLISTRecord rec = (AS_LEAS_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
			rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			rx.add(record, "leas_rcpm_amt", StringUtil.replaceToXml(rec.leas_rcpm_amt));
			rx.add(record, "mang_rcpm_amt", StringUtil.replaceToXml(rec.mang_rcpm_amt));
			rx.add(record, "vat_rcpm_amt", StringUtil.replaceToXml(rec.vat_rcpm_amt));
			rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			//rx.add(record, "cntr_no", rec.cntr_no);
			//rx.add(record, "clam_yymm", rec.clam_yymm);
			//rx.add(record, "clam_seq", rec.clam_seq);
			//rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			//rx.add(record, "mang_clam_amt", rec.mang_clam_amt);
			//rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			//rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			//rx.add(record, "leas_rcpm_amt", rec.leas_rcpm_amt);
			//rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt);
			//rx.add(record, "vat_rcpm_amt", rec.vat_rcpm_amt);
			//rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
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
<as_leas_1310_l>
	<dataSet>
		<CURLIST>
			<record>
				<cntr_no/>
				<clam_yymm/>
				<clam_seq/>
				<leas_clam_amt/>
				<mang_clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
				<leas_rcpm_amt/>
				<mang_rcpm_amt/>
				<vat_rcpm_amt/>
				<rcpm_tot_amt/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1310_l>
*/
%>

<% /* 작성시간 : Thu Jun 04 17:52:11 KST 2009 */ %>