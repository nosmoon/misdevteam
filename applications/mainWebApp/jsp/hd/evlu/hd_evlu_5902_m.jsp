<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5902_MDataSet ds = (HD_EVLU_5902_MDataSet)request.getAttribute("ds");
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
			HD_EVLU_5902_MCURLISTRecord rec = (HD_EVLU_5902_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "evlu_grad_cd", rec.evlu_grad_cd);
			rx.add(record, "gradpoint", rec.gradpoint);
			//rx.add(record, "evlu_grad_cd", StringUtil.replaceToXml(rec.evlu_grad_cd));
			//rx.add(record, "gradpoint", StringUtil.replaceToXml(rec.gradpoint));
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
<hd_evlu_5902_m>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_grad_cd/>
				<gradpoint/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5902_m>
*/
%>

<% /* 작성시간 : Tue Jun 09 10:20:36 KST 2009 */ %>