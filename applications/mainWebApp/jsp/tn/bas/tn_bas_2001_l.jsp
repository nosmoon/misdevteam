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
	TN_BAS_2001_LDataSet ds = (TN_BAS_2001_LDataSet)request.getAttribute("ds");
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
			TN_BAS_2001_LCURLISTRecord rec = (TN_BAS_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "membercategorycode", rec.membercategorycode);
			rx.add(record, "parentmembercategorycode", rec.parentmembercategorycode);
			rx.add(record, "membertype", rec.membertype);
			rx.add(record, "membertype_nm", rec.membertype_nm);
			rx.add(record, "depth", rec.depth);
			rx.add(record, "membercategory", rec.membercategory);
			rx.add(record, "displayorder", rec.displayorder);
			rx.add(record, "description", rec.description);
			rx.add(record, "useinsert_nm", rec.useinsert_nm);
			rx.add(record, "useinsert", rec.useinsert);
			//rx.add(record, "membercategorycode", StringUtil.replaceToXml(rec.membercategorycode));
			//rx.add(record, "parentmembercategorycode", StringUtil.replaceToXml(rec.parentmembercategorycode));
			//rx.add(record, "membertype", StringUtil.replaceToXml(rec.membertype));
			//rx.add(record, "membertype_nm", StringUtil.replaceToXml(rec.membertype_nm));
			//rx.add(record, "depth", StringUtil.replaceToXml(rec.depth));
			//rx.add(record, "membercategory", StringUtil.replaceToXml(rec.membercategory));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
			//rx.add(record, "description", StringUtil.replaceToXml(rec.description));
			//rx.add(record, "useinsert_nm", StringUtil.replaceToXml(rec.useinsert_nm));
			//rx.add(record, "useinsert", StringUtil.replaceToXml(rec.useinsert));
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
<tn_bas_2001_l>
	<dataSet>
		<CURLIST>
			<record>
				<membercategorycode/>
				<parentmembercategorycode/>
				<membertype/>
				<membertype_nm/>
				<depth/>
				<membercategory/>
				<displayorder/>
				<description/>
				<useinsert_nm/>
				<useinsert/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_2001_l>
*/
%>

<% /* 작성시간 : Thu Jul 07 18:53:57 KST 2016 */ %>