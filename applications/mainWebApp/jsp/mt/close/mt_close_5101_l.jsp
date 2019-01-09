<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_CLOSE_5101_LDataSet ds = (MT_CLOSE_5101_LDataSet)request.getAttribute("ds");
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
			MT_CLOSE_5101_LCURLISTRecord rec = (MT_CLOSE_5101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "owh_dt", rec.owh_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_qunt", rec.medi_qunt);
			rx.add(record, "dtl_qunt", rec.dtl_qunt);
			rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "owh_dt", StringUtil.replaceToXml(rec.owh_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "medi_qunt", StringUtil.replaceToXml(rec.medi_qunt));
			//rx.add(record, "dtl_qunt", StringUtil.replaceToXml(rec.dtl_qunt));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
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
<mt_close_5101_l>
	<dataSet>
		<CURLIST>
			<record>
				<owh_dt/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<matr_cd/>
				<matr_nm/>
				<medi_qunt/>
				<dtl_qunt/>
				<qunt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_close_5101_l>
*/
%>

<% /* 작성시간 : Wed Aug 09 17:28:07 KST 2017 */ %>