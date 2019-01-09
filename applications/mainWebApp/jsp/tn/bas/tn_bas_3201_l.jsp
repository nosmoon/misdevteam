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
	TN_BAS_3201_LDataSet ds = (TN_BAS_3201_LDataSet)request.getAttribute("ds");
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
			TN_BAS_3201_LCURLISTRecord rec = (TN_BAS_3201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "parentpaymethodcode", rec.parentpaymethodcode);
			rx.add(record, "depth_nm", rec.depth_nm);
			rx.add(record, "depth", rec.depth);
			rx.add(record, "paymethodtype", rec.paymethodtype);
			rx.add(record, "paymethodtype_nm", rec.paymethodtype_nm);
			rx.add(record, "paymethod", rec.paymethod);
			rx.add(record, "canmodify", rec.canmodify);
			rx.add(record, "displayorder", rec.displayorder);
			rx.add(record, "useinsert", rec.useinsert);
			rx.add(record, "useinsert_nm", rec.useinsert_nm);
			//rx.add(record, "paymethodcode", StringUtil.replaceToXml(rec.paymethodcode));
			//rx.add(record, "parentpaymethodcode", StringUtil.replaceToXml(rec.parentpaymethodcode));
			//rx.add(record, "depth_nm", StringUtil.replaceToXml(rec.depth_nm));
			//rx.add(record, "depth", StringUtil.replaceToXml(rec.depth));
			//rx.add(record, "paymethodtype", StringUtil.replaceToXml(rec.paymethodtype));
			//rx.add(record, "paymethodtype_nm", StringUtil.replaceToXml(rec.paymethodtype_nm));
			//rx.add(record, "paymethod", StringUtil.replaceToXml(rec.paymethod));
			//rx.add(record, "canmodify", StringUtil.replaceToXml(rec.canmodify));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
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
<tn_bas_3201_l>
	<dataSet>
		<CURLIST>
			<record>
				<paymethodcode/>
				<parentpaymethodcode/>
				<depth_nm/>
				<depth/>
				<paymethodtype/>
				<paymethodtype_nm/>
				<paymethod/>
				<canmodify/>
				<displayorder/>
				<useinsert/>
				<useinsert_nm/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_3201_l>
*/
%>

<% /* 작성시간 : Thu Aug 18 15:17:47 KST 2016 */ %>