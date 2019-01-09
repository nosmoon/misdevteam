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
	MT_PAPINOUT_4001_MDataSet ds = (MT_PAPINOUT_4001_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "fac_clsf", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4001_MCURLISTRecord rec = (MT_PAPINOUT_4001_MCURLISTRecord)ds.curlist.get(i);
			if("FAC_CLSF".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "cut_err_point", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4001_MCURLISTRecord rec = (MT_PAPINOUT_4001_MCURLISTRecord)ds.curlist.get(i);
			if("CUT_ERR_POINT".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "cut_err_caus_prd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4001_MCURLISTRecord rec = (MT_PAPINOUT_4001_MCURLISTRecord)ds.curlist.get(i);
			if("CUT_ERR_CAUS_PRD".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "cut_err_caus_midl", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4001_MCURLISTRecord rec = (MT_PAPINOUT_4001_MCURLISTRecord)ds.curlist.get(i);
			if("CUT_ERR_CAUS_MIDL".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "papcmpy_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4001_MCURLISTRecord rec = (MT_PAPINOUT_4001_MCURLISTRecord)ds.curlist.get(i);
			if("PAPCMPY_CD".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
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
			<cd_type/>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 13:41:10 KST 2009 */ %>