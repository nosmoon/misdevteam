<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papmeda.rec.*
	,	chosun.ciis.mt.papmeda.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPMEDA_1000_MDataSet ds = (MT_PAPMEDA_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		/****** 위탁처 콤보 ***************/
		recordSet = rx.add(dataSet, "fac_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPMEDA_1000_MCURLISTRecord rec = (MT_PAPMEDA_1000_MCURLISTRecord)ds.curlist.get(i);
			if(rec.cd_type.equals("FAC_CLSF")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		/****** 제지사 콤보 ***************/
		recordSet = rx.add(dataSet, "papcmpy_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPMEDA_1000_MCURLISTRecord rec = (MT_PAPMEDA_1000_MCURLISTRecord)ds.curlist.get(i);
			if(rec.cd_type.equals("PAPCMPY_CD")) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		
		/****** 매체 콤보 ***************/
		recordSet = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPMEDA_1000_MCURLISTRecord rec = (MT_PAPMEDA_1000_MCURLISTRecord)ds.curlist.get(i);
			if(rec.cd_type.equals("MEDI_CD")) {
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

<% /* 작성시간 : Wed May 06 16:53:54 KST 2009 */ %>