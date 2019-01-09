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
	AS_ASET_1004_SDataSet ds = (AS_ASET_1004_SDataSet)request.getAttribute("ds");
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
			AS_ASET_1004_SCURLISTRecord rec = (AS_ASET_1004_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "land_plcw", rec.land_plcw);
			rx.add(record, "acqr_land_amt", rec.acqr_land_amt);
			rx.add(record, "acqr_yymm", rec.acqr_yymm);
			rx.add(record, "now_land_amt", rec.now_land_amt);
			rx.add(record, "now_yymm", rec.now_yymm);
			rx.add(record, "land_usag", rec.land_usag);
			rx.add(record, "rela_aset_no", rec.rela_aset_no);
			rx.add(record, "rela_aset_nm", rec.rela_aset_nm);
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
			<aset_no/>
			<land_plcw/>
			<acqr_land_amt/>
			<acqr_yymm/>
			<now_land_amt/>
			<now_yymm/>
			<land_usag/>
			<rela_aset_no/>
			<rela_aset_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 14:30:09 KST 2009 */ %>