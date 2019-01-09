<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_3000_ADataSet ds = (HD_VACA_3000_ADataSet)request.getAttribute("ds");
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
			HD_VACA_3000_ACURLISTRecord rec = (HD_VACA_3000_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "num", rec.num);
			rx.add(record, "monday", rec.monday);
			rx.add(record, "sunday", rec.sunday);
			//rx.add(record, "num", StringUtil.replaceToXml(rec.num));
			//rx.add(record, "monday", StringUtil.replaceToXml(rec.monday));
			//rx.add(record, "sunday", StringUtil.replaceToXml(rec.sunday));
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
<hd_vaca_3000_a>
	<dataSet>
		<CURLIST>
			<record>
				<num/>
				<monday/>
				<sunday/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_3000_a>
*/
%>

<% /* 작성시간 : Fri Mar 11 15:46:48 KST 2016 */ %>