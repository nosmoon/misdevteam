<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8071_LDataSet ds = (FC_FUNC_8071_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_8071_LCURLISTRecord rec = (FC_FUNC_8071_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "leas_nm", rec.leas_nm);
			rx.add(record, "compgbcdnm", rec.compgbcdnm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "pay_plan_tms", rec.pay_plan_tms);
			rx.add(record, "pch_count", rec.pch_count);
			//rx.add(record, "leas_nm", StringUtil.replaceToXml(rec.leas_nm));
			//rx.add(record, "compgbcdnm", StringUtil.replaceToXml(rec.compgbcdnm));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "frcr_amt", StringUtil.replaceToXml(rec.frcr_amt));
			//rx.add(record, "pay_plan_tms", StringUtil.replaceToXml(rec.pay_plan_tms));
			//rx.add(record, "pch_count", StringUtil.replaceToXml(rec.pch_count));
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
<fc_func_8071_l>
	<dataSet>
		<CURLIST>
			<record>
				<leas_nm/>
				<compgbcdnm/>
				<dlco_cd/>
				<compnm/>
				<frcr_amt/>
				<pay_plan_tms/>
				<pch_count/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_8071_l>
*/
%>

<% /* 작성시간 : Wed Apr 08 13:50:32 KST 2009 */ %>