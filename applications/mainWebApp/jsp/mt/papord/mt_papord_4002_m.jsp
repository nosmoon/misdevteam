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
	MT_PAPORD_4002_MDataSet ds = (MT_PAPORD_4002_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "roll_wgt_a", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4002_MCURLISTRecord rec = (MT_PAPORD_4002_MCURLISTRecord)ds.curlist.get(i);
			if(rec.paper_clsf_cd.equals("A")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.roll_wgt);
				rx.add(record, "label", "[" + rec.matr_nm + "]" +rec.roll_wgt);
			}
		}
		
		recordSet = rx.add(dataSet, "roll_wgt_b", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4002_MCURLISTRecord rec = (MT_PAPORD_4002_MCURLISTRecord)ds.curlist.get(i);
			if(rec.paper_clsf_cd.equals("B")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.roll_wgt);
				rx.add(record, "label", "[" + rec.matr_nm + "]" +rec.roll_wgt);
			}
		}
		
		recordSet = rx.add(dataSet, "roll_wgt_c", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4002_MCURLISTRecord rec = (MT_PAPORD_4002_MCURLISTRecord)ds.curlist.get(i);
			if(rec.paper_clsf_cd.equals("C")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.roll_wgt);
				rx.add(record, "label", "[" + rec.matr_nm + "]" +rec.roll_wgt);
			}
		}
		
		recordSet = rx.add(dataSet, "matr_cd_a", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4002_MCURLISTRecord rec = (MT_PAPORD_4002_MCURLISTRecord)ds.curlist.get(i);
			if(rec.paper_clsf_cd.equals("A")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.matr_cd);
				rx.add(record, "label", rec.matr_cd);
			}
		}
		
		recordSet = rx.add(dataSet, "matr_cd_b", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4002_MCURLISTRecord rec = (MT_PAPORD_4002_MCURLISTRecord)ds.curlist.get(i);
			if(rec.paper_clsf_cd.equals("B")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.matr_cd);
				rx.add(record, "label", rec.matr_cd);
			}
		}
		
		recordSet = rx.add(dataSet, "matr_cd_c", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4002_MCURLISTRecord rec = (MT_PAPORD_4002_MCURLISTRecord)ds.curlist.get(i);
			if(rec.paper_clsf_cd.equals("C")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.matr_cd);
				rx.add(record, "label", rec.matr_cd);
			}
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<fac_clsf/>
			<paper_std_cd/>
			<paper_std_nm/>
			<matr_cd/>
			<matr_nm/>
			<roll_wgt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 14:49:58 KST 2009 */ %>