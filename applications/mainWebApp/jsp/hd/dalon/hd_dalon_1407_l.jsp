<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1407_LDataSet ds = (HD_DALON_1407_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempPayAmt", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_1407_LCURLISTRecord rec = (HD_DALON_1407_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cost_flag", rec.cost_flag);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "fee_clsf", rec.fee_clsf);
			rx.add(record, "pay_amt", rec.pay_amt);
			//rx.add(record, "cost_flag", StringUtil.replaceToXml(rec.cost_flag));
			//rx.add(record, "aply_basi_dt", StringUtil.replaceToXml(rec.aply_basi_dt));
			//rx.add(record, "fee_clsf", StringUtil.replaceToXml(rec.fee_clsf));
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
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
<hd_dalon_1407_l>
	<dataSet>
		<CURLIST>
			<record>
				<cost_flag/>
				<aply_basi_dt/>
				<fee_clsf/>
				<pay_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_dalon_1407_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 10:47:30 KST 2009 */ %>