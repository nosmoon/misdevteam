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
	MT_COMMATR_7410_LDataSet ds = (MT_COMMATR_7410_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_7410_LCURLISTRecord rec = (MT_COMMATR_7410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "factcd", rec.factcd);
			rx.add(record, "fact_nm", rec.fact_nm);
			rx.add(record, "wgt_1101", rec.wgt_1101);
			rx.add(record, "per_1101", rec.per_1101);
			rx.add(record, "wgt_1102", rec.wgt_1102);
			rx.add(record, "per_1102", rec.per_1102);
			rx.add(record, "wgt_1105", rec.wgt_1105);
			rx.add(record, "per_1105", rec.per_1105);
			rx.add(record, "wgt_1106", rec.wgt_1106);
			rx.add(record, "per_1106", rec.per_1106);
			rx.add(record, "wgt_tot", rec.wgt_tot);
			rx.add(record, "per_tot", rec.per_tot);
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
<mt_commatr_7310_l>
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
</mt_commatr_7310_l>
*/
%>

<% /* 작성시간 : Thu Jun 21 19:16:40 KST 2012 */ %>