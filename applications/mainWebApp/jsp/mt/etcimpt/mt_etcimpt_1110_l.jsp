<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1110_LDataSet ds = (MT_ETCIMPT_1110_LDataSet)request.getAttribute("ds");
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
			MT_ETCIMPT_1110_LCURLISTRecord rec = (MT_ETCIMPT_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			rx.add(record, "leas_clsf_nm", StringUtil.replaceToXml(rec.leas_clsf_nm));
			rx.add(record, "reg_dt", StringUtil.replaceToXml(rec.reg_dt));
			rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			rx.add(record, "matr_ptcr", StringUtil.replaceToXml(rec.matr_ptcr));
			rx.add(record, "impt_resn", StringUtil.replaceToXml(rec.impt_resn));
			rx.add(record, "offer_pric", StringUtil.replaceToXml(rec.offer_pric));
			rx.add(record, "yy", StringUtil.replaceToXml(rec.yy));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "leas_clsf", StringUtil.replaceToXml(rec.leas_clsf));
			//rx.add(record, "mang_no", rec.mang_no);
			//rx.add(record, "leas_clsf_nm", rec.leas_clsf_nm);
			//rx.add(record, "reg_dt", rec.reg_dt);
			//rx.add(record, "case_nm", rec.case_nm);
			//rx.add(record, "matr_ptcr", rec.matr_ptcr);
			//rx.add(record, "impt_resn", rec.impt_resn);
			//rx.add(record, "offer_pric", rec.offer_pric);
			//rx.add(record, "yy", rec.yy);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "leas_clsf", rec.leas_clsf);
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
<mt_etcimpt_1110_l>
	<dataSet>
		<CURLIST>
			<record>
				<mang_no/>
				<leas_clsf_nm/>
				<reg_dt/>
				<case_nm/>
				<matr_ptcr/>
				<impt_resn/>
				<offer_pric/>
				<yy/>
				<seq/>
				<leas_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etcimpt_1110_l>
*/
%>

<% /* 작성시간 : Fri Jul 03 11:36:32 KST 2009 */ %>