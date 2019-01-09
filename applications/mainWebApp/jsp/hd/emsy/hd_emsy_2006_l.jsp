<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.emsy.rec.*
	,	chosun.ciis.hd.emsy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EMSY_2006_LDataSet ds = (HD_EMSY_2006_LDataSet)request.getAttribute("ds");
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
			HD_EMSY_2006_LCURLISTRecord rec = (HD_EMSY_2006_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "recemail", rec.recemail);
			rx.add(record, "rec_yn", rec.rec_yn);
			//rx.add(record, "recemail", StringUtil.replaceToXml(rec.recemail));
			//rx.add(record, "rec_yn", StringUtil.replaceToXml(rec.rec_yn));
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
<hd_emsy_2006_l>
	<dataSet>
		<CURLIST>
			<record>
				<recemail/>
				<rec_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_emsy_2006_l>
*/
%>

<% /* 작성시간 : Thu Oct 21 16:51:07 KST 2010 */ %>