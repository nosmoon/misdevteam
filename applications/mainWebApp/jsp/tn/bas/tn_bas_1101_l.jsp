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
	TN_BAS_1101_LDataSet ds = (TN_BAS_1101_LDataSet)request.getAttribute("ds");
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
			TN_BAS_1101_LCURLISTRecord rec = (TN_BAS_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "organidx", rec.organidx);
			rx.add(record, "deptname", rec.deptname);
			rx.add(record, "deptcategory", rec.deptcategory);
			rx.add(record, "deptcategory_nm", rec.deptcategory_nm);
			rx.add(record, "description", rec.description);
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "organidx", StringUtil.replaceToXml(rec.organidx));
			//rx.add(record, "deptname", StringUtil.replaceToXml(rec.deptname));
			//rx.add(record, "deptcategory", StringUtil.replaceToXml(rec.deptcategory));
			//rx.add(record, "deptcategory_nm", StringUtil.replaceToXml(rec.deptcategory_nm));
			//rx.add(record, "description", StringUtil.replaceToXml(rec.description));
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
<tn_bas_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<deptidx/>
				<organidx/>
				<deptname/>
				<deptcategory/>
				<deptcategory_nm/>
				<description/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_1101_l>
*/
%>

<% /* 작성시간 : Fri Jun 17 10:07:09 KST 2016 */ %>