<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_7010_LDataSet ds = (MT_COMMATR_7010_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_7010_LCURLISTRecord rec = (MT_COMMATR_7010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "matr_clas", rec.matr_clas);
			//rx.add(record, "matr_clas_nm", rec.matr_clas_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ewh_qunt", rec.ewh_qunt);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "rest_amt", rec.rest_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "submatr_gbn", rec.submatr_gbn);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dlco_clsf", StringUtil.replaceToXml(rec.dlco_clsf));
			//rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			//rx.add(record, "chrg_pers", StringUtil.replaceToXml(rec.chrg_pers));
			//rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
			//rx.add(record, "patr_chrg_pers", StringUtil.replaceToXml(rec.patr_chrg_pers));
			//rx.add(record, "titl", StringUtil.replaceToXml(rec.titl));
			//rx.add(record, "cont", StringUtil.replaceToXml(rec.cont));
			//rx.add(record, "tag", StringUtil.replaceToXml(rec.tag));
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
<mt_commatr_7010_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<dlco_clsf/>
				<dlco_clsf_nm/>
				<chrg_pers/>
				<dlco_no/>
				<dlco_nm/>
				<patr_chrg_pers/>
				<titl/>
				<cont/>
				<tag/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_7010_l>
*/
%>

<% /* 작성시간 : Thu Jun 21 19:16:40 KST 2012 */ %>