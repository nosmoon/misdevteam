<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_8011_LDataSet ds = (HD_AFFR_8011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "sply_fee", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_8011_LCURLISTRecord rec = (HD_AFFR_8011_LCURLISTRecord)ds.curlist.get(i);
		//	int record = rx.add(dataSet, "tempData", "");
			rx.add(recordSet, "sply_fee", rec.sply_fee);
			//rx.add(record, "sply_fee", StringUtil.replaceToXml(rec.sply_fee));
		}
	//	rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<hd_affr_8011_l>
	<dataSet>
		<CURLIST>
			<record>
				<sply_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_8011_l>
*/
%>

<% /* 작성시간 : Wed Oct 17 11:40:07 KST 2012 */ %>