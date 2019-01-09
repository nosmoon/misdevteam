<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2101_LDataSet ds = (MT_PAPINOUT_2101_LDataSet)request.getAttribute("ds");
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
			MT_PAPINOUT_2101_LCURLISTRecord rec = (MT_PAPINOUT_2101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "mg_30", rec.mg_30);
			rx.add(record, "mg_20", rec.mg_20);
			rx.add(record, "mg_40", rec.mg_40);
			rx.add(record, "mg_50", rec.mg_50);
			rx.add(record, "mg_60", rec.mg_60);
			rx.add(record, "nm_30", rec.nm_30);
			rx.add(record, "nm_20", rec.nm_20);
			rx.add(record, "nm_40", rec.nm_40);
			rx.add(record, "nm_50", rec.nm_50);
			rx.add(record, "nm_60", rec.nm_60);
			rx.add(record, "tm_30", rec.tm_30);
			rx.add(record, "tm_20", rec.tm_20);
			rx.add(record, "tm_40", rec.tm_40);
			rx.add(record, "tm_50", rec.tm_50);
			rx.add(record, "tm_60", rec.tm_60);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "mg_30", StringUtil.replaceToXml(rec.mg_30));
			//rx.add(record, "mg_20", StringUtil.replaceToXml(rec.mg_20));
			//rx.add(record, "mg_40", StringUtil.replaceToXml(rec.mg_40));
			//rx.add(record, "mg_50", StringUtil.replaceToXml(rec.mg_50));
			//rx.add(record, "mg_60", StringUtil.replaceToXml(rec.mg_60));
			//rx.add(record, "nm_30", StringUtil.replaceToXml(rec.nm_30));
			//rx.add(record, "nm_20", StringUtil.replaceToXml(rec.nm_20));
			//rx.add(record, "nm_40", StringUtil.replaceToXml(rec.nm_40));
			//rx.add(record, "nm_50", StringUtil.replaceToXml(rec.nm_50));
			//rx.add(record, "nm_60", StringUtil.replaceToXml(rec.nm_60));
			//rx.add(record, "tm_30", StringUtil.replaceToXml(rec.tm_30));
			//rx.add(record, "tm_20", StringUtil.replaceToXml(rec.tm_20));
			//rx.add(record, "tm_40", StringUtil.replaceToXml(rec.tm_40));
			//rx.add(record, "tm_50", StringUtil.replaceToXml(rec.tm_50));
			//rx.add(record, "tm_60", StringUtil.replaceToXml(rec.tm_60));
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
<mt_papinout_2101_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf/>
				<fac_clsf_nm/>
				<mg_30/>
				<mg_20/>
				<mg_40/>
				<mg_50/>
				<mg_60/>
				<nm_30/>
				<nm_20/>
				<nm_40/>
				<nm_50/>
				<nm_60/>
				<tm_30/>
				<tm_20/>
				<tm_40/>
				<tm_50/>
				<tm_60/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papinout_2101_l>
*/
%>

<% /* 작성시간 : Thu Sep 17 23:11:24 KST 2009 */ %>