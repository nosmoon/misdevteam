<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1401_LDataSet ds = (AS_ASET_1401_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1401_LCURLISTRecord rec = (AS_ASET_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ndduc_year", rec.ndduc_year);
			rx.add(record, "ndduc_prd_clsf_nm", rec.ndduc_prd_clsf_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "ndduc_prd_clsf", rec.ndduc_prd_clsf);
			rx.add(record, "chg_clsf", rec.chg_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
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
			<ndduc_year/>
			<ndduc_prd_clsf_nm/>
			<remk/>
			<incmg_dt_tm/>
			<incmg_pers_nm/>
			<ndduc_prd_clsf/>
			<chg_clsf/>
			<occr_dt/>
			<occr_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 16 17:58:44 KST 2009 */ %>