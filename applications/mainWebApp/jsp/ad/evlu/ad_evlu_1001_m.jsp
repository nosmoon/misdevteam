<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.evlu.rec.*
	,	chosun.ciis.ad.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EVLU_1001_MDataSet ds = (AD_EVLU_1001_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "score", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_EVLU_1001_MCURLIST1Record rec = (AD_EVLU_1001_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.cdnm);
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<ad_evlu_1001_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST1>
	</dataSet>
</ad_evlu_1001_m>
*/
%>

<% /* 작성시간 : Mon Mar 15 13:44:38 KST 2010 */ %>