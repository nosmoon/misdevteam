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
	HD_EVLU_5501_LDataSet ds = (HD_EVLU_5501_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5501_LCURLISTRecord rec = (HD_EVLU_5501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "t1", rec.t1);
			rx.add(record, "t2", rec.t2);
			rx.add(record, "t3", rec.t3);
			rx.add(record, "t4", rec.t4);
			rx.add(record, "t5", rec.t5);
			rx.add(record, "t6", rec.t6);
			rx.add(record, "t7", rec.t7);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "t1", StringUtil.replaceToXml(rec.t1));
			//rx.add(record, "t2", StringUtil.replaceToXml(rec.t2));
			//rx.add(record, "t3", StringUtil.replaceToXml(rec.t3));
			//rx.add(record, "t4", StringUtil.replaceToXml(rec.t4));
			//rx.add(record, "t5", StringUtil.replaceToXml(rec.t5));
			//rx.add(record, "t6", StringUtil.replaceToXml(rec.t6));
			//rx.add(record, "t7", StringUtil.replaceToXml(rec.t7));
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
<hd_evlu_5501_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<cd/>
				<cdnm/>
				<t1/>
				<t2/>
				<t3/>
				<t4/>
				<t5/>
				<t6/>
				<t7/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5501_l>
*/
%>

<% /* 작성시간 : Thu Jun 04 15:18:22 KST 2009 */ %>