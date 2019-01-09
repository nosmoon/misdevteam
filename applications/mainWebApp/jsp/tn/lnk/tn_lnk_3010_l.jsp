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
	TN_LNK_3010_LDataSet ds = (TN_LNK_3010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData  = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	gridData = rx.add(root, "gridHeader", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_3010_LCURLISTRecord rec = (TN_LNK_3010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "pymtmm", rec.pymtmm);
			rx.add(record, "pymtdd", rec.pymtdd);
			rx.add(record, "requestdate", rec.requestdate);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "request_file", rec.filename);
			rx.add(record, "result_file", rec.resultfilename);
			rx.add(record, "okcount", rec.okcount);
			rx.add(record, "okprice", rec.okprice);
			rx.add(record, "errorcount", rec.errorcount);
			rx.add(record, "errorprice", rec.errorprice);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "stat1", rec.stat1);
			rx.add(record, "stat2", rec.stat2);
			rx.add(record, "stat3", rec.stat3);
			rx.add(record, "stat4", rec.stat4);
			rx.add(record, "cmsidx", rec.cmsidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "status", rec.status);
		}
		rx.add(gridData, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_3010_l>
	<dataSet>
		<CURLIST>
			<record>
				<pymtmm/>
				<pymtdd/>
				<requestdate/>
				<paydate/>
				<filename/>
				<resultfilename/>
				<okcount/>
				<okprice/>
				<errorcount/>
				<errorprice/>
				<fee/>
				<stat1/>
				<stat2/>
				<stat3/>
				<stat4/>
				<cmsidx/>
				<deptidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_3010_l>
*/
%>

<% /* 작성시간 : Thu Aug 18 14:34:13 KST 2016 */ %>