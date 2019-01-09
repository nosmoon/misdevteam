<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.bas.rec.*
	,	chosun.ciis.tn.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_BAS_3101_LDataSet ds = (TN_BAS_3101_LDataSet)request.getAttribute("ds");
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
			TN_BAS_3101_LCURLISTRecord rec = (TN_BAS_3101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "topsupportidx", rec.topsupportidx);
			rx.add(record, "parentsupportidx", rec.parentsupportidx);
			rx.add(record, "depth", rec.depth);
			rx.add(record, "depth_nm", rec.depth_nm);
			rx.add(record, "support", rec.support);
			rx.add(record, "supportcode", rec.supportcode);
			rx.add(record, "displayorder", rec.displayorder);
			rx.add(record, "memo", rec.memo);
			rx.add(record, "useinsert", rec.useinsert);
			rx.add(record, "useinsert_nm", rec.useinsert_nm);
			//rx.add(record, "supportidx", StringUtil.replaceToXml(rec.supportidx));
			//rx.add(record, "topsupportidx", StringUtil.replaceToXml(rec.topsupportidx));
			//rx.add(record, "parentsupportidx", StringUtil.replaceToXml(rec.parentsupportidx));
			//rx.add(record, "depth", StringUtil.replaceToXml(rec.depth));
			//rx.add(record, "depth_nm", StringUtil.replaceToXml(rec.depth_nm));
			//rx.add(record, "support", StringUtil.replaceToXml(rec.support));
			//rx.add(record, "supportcode", StringUtil.replaceToXml(rec.supportcode));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
			//rx.add(record, "memo", StringUtil.replaceToXml(rec.memo));
			//rx.add(record, "useinsert", StringUtil.replaceToXml(rec.useinsert));
			//rx.add(record, "useinsert_nm", StringUtil.replaceToXml(rec.useinsert_nm));
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
<tn_bas_3101_l>
	<dataSet>
		<CURLIST>
			<record>
				<supportidx/>
				<topsupportidx/>
				<parentsupportidx/>
				<depth/>
				<depth_nm/>
				<support/>
				<supportcode/>
				<displayorder/>
				<memo/>
				<useinsert/>
				<useinsert_nm/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_3101_l>
*/
%>

<% /* 작성시간 : Thu Aug 18 19:27:57 KST 2016 */ %>