<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.evlu.rec.*
	,	chosun.ciis.ad.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EVLU_2210_LDataSet ds = (AD_EVLU_2210_LDataSet)request.getAttribute("ds");
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
			AD_EVLU_2210_LCURLISTRecord rec = (AD_EVLU_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pubc_yyyymmdd", rec.pubc_yyyymmdd);
			rx.add(record, "yoil", rec.yoil);
			rx.add(record, "scorecode", rec.scorecode);
			rx.add(record, "scor", rec.scor);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "evlu_pers_emp_no", rec.evlu_pers_emp_no);
			//rx.add(record, "pubc_yyyymmdd", StringUtil.replaceToXml(rec.pubc_yyyymmdd));
			//rx.add(record, "yoil", StringUtil.replaceToXml(rec.yoil));
			//rx.add(record, "scorecode", StringUtil.replaceToXml(rec.scorecode));
			//rx.add(record, "scor", StringUtil.replaceToXml(rec.scor));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "evlu_pers_emp_no", StringUtil.replaceToXml(rec.evlu_pers_emp_no));
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
<ad_evlu_2210_l>
	<dataSet>
		<CURLIST>
			<record>
				<pubc_yyyymmdd/>
				<yoil/>
				<scorecode/>
				<scor/>
				<remk/>
				<evlu_pers_emp_no/>
			</record>
		</CURLIST>
	</dataSet>
</ad_evlu_2210_l>
*/
%>

<% /* 작성시간 : Mon Mar 22 15:09:48 KST 2010 */ %>