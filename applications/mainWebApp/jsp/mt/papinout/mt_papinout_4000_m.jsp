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
	MT_PAPINOUT_4000_MDataSet ds = (MT_PAPINOUT_4000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet 	= 0;
	int recordSet 	= 0;
	int recordTop	= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//공장콤보
		recordSet = rx.add(dataSet, "fac_clsf", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("FAC_CLSF".equals(rec.cd_type)) {
				int record2 = rx.add(recordSet, "item", "");
				rx.add(record2, "value", rec.cd);
				rx.add(record2, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		//현상콤보
		recordSet = rx.add(dataSet, "now_trad_cd", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("NOW_TRAD_CD".equals(rec.cd_type)) {
				int record2 = rx.add(recordSet, "item", "");
				rx.add(record2, "value", rec.cd);
				rx.add(record2, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		//매체콤보
		recordSet = rx.add(dataSet, "medi_cd", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("MEDI_CD".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		//관련부서
		recordSet = rx.add(dataSet, "rela_dept", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("RELA_DEPT".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		//원인(중)
		recordSet = rx.add(dataSet, "caus_midl", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("CAUS_MIDL".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		//원인(대)
		recordSet = rx.add(dataSet, "caus_prd", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("CAUS_PRD".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "cut_err_point", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("CUT_ERR_POINT".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "cut_err_caus_prd", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("CUT_ERR_CAUS_PRD".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "cut_err_caus_midl", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
			if("CUT_ERR_CAUS_MIDL".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		recordSet = rx.add(dataSet, "papcmpy_cd", "");
		recordTop = rx.add(recordSet, "item", "");
		rx.add(recordTop, "value", "");
		rx.add(recordTop, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4000_MCURLISTRecord rec = (MT_PAPINOUT_4000_MCURLISTRecord)ds.curlist.get(i);
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

<% /* 작성시간 : Mon Apr 20 13:36:55 KST 2009 */ %>