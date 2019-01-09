<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_4110_LDataSet ds = (TN_LNK_4110_LDataSet)request.getAttribute("ds");
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
			TN_LNK_4110_LCURLISTRecord rec = (TN_LNK_4110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "umsidx", rec.umsidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "status", rec.status);
			rx.add(record, "purpose", rec.purpose);
			rx.add(record, "title", rec.title);
			rx.add(record, "sendtype", rec.sendtype);
			rx.add(record, "startdate", rec.startdate);
			rx.add(record, "receiver", rec.receiver);
			rx.add(record, "receiver_s", rec.receiver_s);
			rx.add(record, "receiver_s", rec.receiver_s);
			rx.add(record, "receiver_f", rec.receiver_f);
			rx.add(record, "writedate", rec.writedate);
			//rx.add(record, "umsidx", StringUtil.replaceToXml(rec.umsidx));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
			//rx.add(record, "purpose", StringUtil.replaceToXml(rec.purpose));
			//rx.add(record, "sendtype", StringUtil.replaceToXml(rec.sendtype));
			//rx.add(record, "startdate", StringUtil.replaceToXml(rec.startdate));
			//rx.add(record, "receiver", StringUtil.replaceToXml(rec.receiver));
			//rx.add(record, "receiver_s", StringUtil.replaceToXml(rec.receiver_s));
			//rx.add(record, "receiver_s", StringUtil.replaceToXml(rec.receiver_s));
			//rx.add(record, "receiver_f", StringUtil.replaceToXml(rec.receiver_f));
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
<tn_lnk_4110_l>
	<dataSet>
		<CURLIST>
			<record>
				<umsidx/>
				<deptidx/>
				<status/>
				<purpose/>
				<sendtype/>
				<startdate/>
				<receiver/>
				<receiver_s/>
				<receiver_s/>
				<receiver_f/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_4110_l>
*/
%>

<% /* 작성시간 : Thu Aug 18 20:21:21 KST 2016 */ %>