<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1009_LDataSet ds = (HD_ORGA_1009_LDataSet)request.getAttribute("ds");
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
			HD_ORGA_1009_LCURLISTRecord rec = (HD_ORGA_1009_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "orga_reorga_dd", rec.orga_reorga_dd);
			//rx.add(record, "orga_reorga_dd", StringUtil.replaceToXml(rec.orga_reorga_dd));
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
<hd_orga_1009_l>
	<dataSet>
		<CURLIST>
			<record>
				<orga_reorga_dd/>
			</record>
		</CURLIST>
	</dataSet>
</hd_orga_1009_l>
*/
%>

<% /* 작성시간 : Wed Jun 17 11:39:48 KST 2009 */ %>