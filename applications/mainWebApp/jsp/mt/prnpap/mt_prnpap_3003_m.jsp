<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3003_MDataSet ds = (MT_PRNPAP_3003_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "roll_wgt", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3003_MCURLISTRecord rec = (MT_PRNPAP_3003_MCURLISTRecord)ds.curlist.get(0);
			//int record = rx.add(recordSet, "record", "");
			rx.add(recordSet, "roll_wgt", rec.roll_wgt);
			//rx.add(record, "roll_wgt", StringUtil.replaceToXml(rec.roll_wgt));
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
<mt_prnpap_3003_m>
	<dataSet>
		<CURLIST>
			<record>
				<roll_wgt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_prnpap_3003_m>
*/
%>

<% /* 작성시간 : Tue May 12 09:38:23 KST 2009 */ %>