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
	AS_LEAS_1901_LDataSet ds = (AS_LEAS_1901_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1901_LCURLISTRecord rec = (AS_LEAS_1901_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "clam_dt", rec.clam_dt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "tot1", rec.tot1);
			rx.add(record, "tot2", rec.tot2);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "clam_seq", rec.clam_seq);
			rx.add(record, "in_gubun", rec.in_gubun);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "clam_dt", StringUtil.replaceToXml(rec.clam_dt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "tot1", StringUtil.replaceToXml(rec.tot1));
			//rx.add(record, "tot2", StringUtil.replaceToXml(rec.tot2));
			//rx.add(record, "actu_slip_no", StringUtil.replaceToXml(rec.actu_slip_no));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
			//rx.add(record, "in_gubun", StringUtil.replaceToXml(rec.in_gubun));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "rmtt_plac", StringUtil.replaceToXml(rec.rmtt_plac));
			//rx.add(record, "rmtt_dt", StringUtil.replaceToXml(rec.rmtt_dt));
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
<as_leas_1901_l>
	<dataSet>
		<CURLIST>
			<record>
				<cntr_no/>
				<clam_yymm/>
				<clam_dt/>
				<clam_tot_amt/>
				<occr_dt/>
				<tot1/>
				<tot2/>
				<actu_slip_no/>
				<remk/>
				<clam_seq/>
				<in_gubun/>
				<hire_dlco_ern/>
				<hire_dlco_nm/>
				<rmtt_plac/>
				<rmtt_dt/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1901_l>
*/
%>

<% /* 작성시간 : Thu Dec 17 16:01:11 KST 2009 */ %>