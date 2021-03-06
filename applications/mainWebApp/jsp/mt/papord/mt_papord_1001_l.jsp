<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_1001_LDataSet ds = (MT_PAPORD_1001_LDataSet)request.getAttribute("ds");
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
			MT_PAPORD_1001_LCURLISTRecord rec = (MT_PAPORD_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowCnt", (i+1));
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "max_ewh_roll_cnt", rec.max_ewh_roll_cnt);
			rx.add(record, "max_ewh_wgt", rec.max_ewh_wgt);
			rx.add(record, "std_ewh_roll_cnt", rec.std_ewh_roll_cnt);
			rx.add(record, "oth_prts_ratio", rec.oth_prts_ratio);
			rx.add(record, "std_ewh_wgt", rec.std_ewh_wgt);
			rx.add(record, "std_amss_ratio", rec.std_amss_ratio);
			rx.add(record, "roll_wgt", rec.roll_wgt);
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
			<fac_clsf/>
			<matr_cd/>
			<matr_nm/>
			<aply_dt/>
			<max_ewh_roll_cnt/>
			<max_ewh_wgt/>
			<std_ewh_roll_cnt/>
			<std_ewh_wgt/>
			<std_amss_ratio/>
			<use_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 03 19:38:03 KST 2009 */ %>