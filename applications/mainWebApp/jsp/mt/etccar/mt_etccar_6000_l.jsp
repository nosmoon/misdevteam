<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_6000_LDataSet ds = (MT_ETCCAR_6000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCCAR_6000_LCURLISTRecord rec = (MT_ETCCAR_6000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "oil_clsf_1", rec.oil_clsf_1);
			rx.add(record, "oil_clsf_2", rec.oil_clsf_2);
			rx.add(record, "oil_clsf_3", rec.oil_clsf_3);
			rx.add(record, "oil_clsf_4", rec.oil_clsf_4);
			rx.add(record, "oil_clsf_5", rec.oil_clsf_5);
			rx.add(record, "oil_clsf_6", rec.oil_clsf_6);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "oil_clsf_1", StringUtil.replaceToXml(rec.oil_clsf_1));
			//rx.add(record, "oil_clsf_2", StringUtil.replaceToXml(rec.oil_clsf_2));
			//rx.add(record, "oil_clsf_3", StringUtil.replaceToXml(rec.oil_clsf_3));
			//rx.add(record, "oil_clsf_4", StringUtil.replaceToXml(rec.oil_clsf_4));
			//rx.add(record, "oil_clsf_5", StringUtil.replaceToXml(rec.oil_clsf_5));
			//rx.add(record, "oil_clsf_6", StringUtil.replaceToXml(rec.oil_clsf_6));
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
<mt_etccar_6000_l>
	<dataSet>
		<CURLIST>
			<record>
				<oil_clsf_1/>
				<oil_clsf_2/>
				<oil_clsf_3/>
				<oil_clsf_4/>
				<oil_clsf_5/>
				<oil_clsf_6/>
				<oil_clsf_7/>
				<oil_clsf_8/>
				<oil_clsf_9/>
				<oil_clsf_10/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etccar_6000_l>
*/
%>

<% /* 작성시간 : Fri Apr 17 17:44:49 KST 2009 */ %>