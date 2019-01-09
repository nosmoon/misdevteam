<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_3203_LDataSet ds = (MT_SUBMATROUT_3203_LDataSet)request.getAttribute("ds");
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
			MT_SUBMATROUT_3203_LCURLISTRecord rec = (MT_SUBMATROUT_3203_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "ordr_dt", rec.ordr_dt);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlvs_dt", rec.dlvs_dt);
			rx.add(record, "dlvs_fac_cd", rec.dlvs_fac_cd);
			rx.add(record, "dlvs_chrg_pers", rec.dlvs_chrg_pers);
			rx.add(record, "chrg_pers_cntc_plac", rec.chrg_pers_cntc_plac);
			rx.add(record, "chrg_pers_email", rec.chrg_pers_email);
			rx.add(record, "amt_pay_mthd", rec.amt_pay_mthd);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "ordr_yn", rec.ordr_yn);
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<ordr_dt/>
			<dlco_cd/>
			<dlco_nm/>
			<dlvs_dt/>
			<dlvs_fac_cd/>
			<dlvs_chrg_pers/>
			<chrg_pers_cntc_plac/>
			<chrg_pers_email/>
			<amt_pay_mthd/>
			<remk/>
			<ordr_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 07 09:22:25 KST 2009 */ %>