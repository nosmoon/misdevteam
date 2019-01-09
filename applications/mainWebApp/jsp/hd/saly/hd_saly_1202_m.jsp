<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1202_MDataSet ds = (HD_SALY_1202_MDataSet)request.getAttribute("ds");
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
			HD_SALY_1202_MCURLISTRecord rec = (HD_SALY_1202_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "duty_alon_basi_frdt", rec.duty_alon_basi_frdt);
			rx.add(record, "duty_alon_basi_todt", rec.duty_alon_basi_todt);
			//rx.add(record, "duty_alon_basi_frdt", StringUtil.replaceToXml(rec.duty_alon_basi_frdt));
			//rx.add(record, "duty_alon_basi_todt", StringUtil.replaceToXml(rec.duty_alon_basi_todt));
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
<hd_saly_1202_m>
	<dataSet>
		<CURLIST>
			<record>
				<duty_alon_basi_frdt/>
				<duty_alon_basi_todt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1202_m>
*/
%>

<% /* 작성시간 : Mon Apr 27 20:41:30 KST 2009 */ %>