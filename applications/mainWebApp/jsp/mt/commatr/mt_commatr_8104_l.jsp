<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_8104_LDataSet ds = (MT_COMMATR_8104_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_8104_LCURLISTRecord rec = (MT_COMMATR_8104_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "somodat", rec.somodat);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "reso_amt", rec.reso_amt);
			rx.add(record, "rest_amt", rec.rest_amt);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			//rx.add(record, "somodat", StringUtil.replaceToXml(rec.somodat));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "reso_amt", StringUtil.replaceToXml(rec.reso_amt));
			//rx.add(record, "rest_amt", StringUtil.replaceToXml(rec.rest_amt));
			//rx.add(record, "slip_occr_dt", StringUtil.replaceToXml(rec.slip_occr_dt));
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
<mt_commatr_8104_l>
	<dataSet>
		<CURLIST>
			<record>
				<somodat/>
				<tot_amt/>
				<reso_amt/>
				<rest_amt/>
				<slip_occr_dt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_8104_l>
*/
%>

<% /* 작성시간 : Fri Jun 28 16:21:29 KST 2013 */ %>