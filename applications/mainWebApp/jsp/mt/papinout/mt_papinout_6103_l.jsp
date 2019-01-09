<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_6103_LDataSet ds = (MT_PAPINOUT_6103_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_6103_LCURLISTRecord rec = (MT_PAPINOUT_6103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "ewh_roll", rec.ewh_roll);
			rx.add(record, "ewh_amt", rec.ewh_amt);
			rx.add(record, "ewh_vat", rec.ewh_vat);
			rx.add(record, "sum_amt", rec.sum_amt);
			rx.add(record, "ewh_wgt", rec.ewh_wgt);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "ewh_uprc", rec.ewh_uprc);
			rx.add(record, "wisgno", rec.wisgno);
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
<dataSet>
	<CURLIST>
		<record>
			<ewh_dt/>
			<fac_clsf/>
			<usag/>
			<ewh_roll/>
			<ewh_amt/>
			<ewh_vat/>
			<sum_amt/>
			<ewh_wgt/>
			<matr_cd/>
			<matr_nm/>
			<ewh_uprc/>
			<wisgno/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 21 16:58:55 KST 2009 */ %>