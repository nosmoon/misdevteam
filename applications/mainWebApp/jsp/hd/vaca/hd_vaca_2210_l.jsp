<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_2210_LDataSet ds = (HD_VACA_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_2210_LCURLISTRecord rec = (HD_VACA_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "year_vaca_dds_sum", rec.year_vaca_dds_sum);
			rx.add(record, "add_vaca_dds_sum", rec.add_vaca_dds_sum);
			rx.add(record, "occr_vaca_dds_sum", rec.occr_vaca_dds_sum);
			rx.add(record, "use_vaca_dds_sum", rec.use_vaca_dds_sum);
			rx.add(record, "vaca_rmn_dds_sum", rec.vaca_rmn_dds_sum);
			rx.add(record, "yymm_alon_sum", rec.yymm_alon_sum);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
<dataSet>
	<CURLIST>
		<record>
			<cd_nm/>
			<year_vaca_dds_sum/>
			<add_vaca_dds_sum/>
			<occr_vaca_dds_sum/>
			<use_vaca_dds_sum/>
			<vaca_rmn_dds_sum/>
			<yymm_alon_sum/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 04 15:46:20 KST 2009 */ %>