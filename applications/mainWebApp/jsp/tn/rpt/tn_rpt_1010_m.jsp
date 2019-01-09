<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1010_MDataSet ds = (TN_RPT_1010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1	   = 0;
	int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");

	try {

		depth1 = rx.add(recordSet, "deptidx_clsf", "");
		record  = rx.add(depth1, "item", "");
		rx.add(record, "value", "all");
		rx.add(record, "label", "전체");

 		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_RPT_1010_MCURLISTRecord rec = (TN_RPT_1010_MCURLISTRecord)ds.curlist.get(i);
			record = rx.add(depth1, "item", "");
			//rx.add(record, "organidx", rec.organidx);
			rx.add(record, "value", rec.deptidx);
			rx.add(record, "label", rec.deptname);
			//rx.add(record, "deptcategory", rec.deptcategory);
			//rx.add(record, "description", rec.description);
			//rx.add(record, "displayorder", rec.displayorder);
		}
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
<tn_rpt_1010_m>
	<dataSet>
		<CURLIST>
			<record>
				<organidx/>
				<deptidx/>
				<deptname/>
				<deptcategory/>
				<description/>
				<displayorder/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1010_m>
*/
%>

<% /* 작성시간 : Mon Aug 22 17:23:30 KST 2016 */ %>