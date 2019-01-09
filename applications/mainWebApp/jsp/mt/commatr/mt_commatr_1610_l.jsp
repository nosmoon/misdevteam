<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*
	,   chosun.ciis.co.base.util.StringUtil;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_1610_LDataSet ds = (MT_COMMATR_1610_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_1610_LCURLISTRecord rec = (MT_COMMATR_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "part_cd", rec.part_cd);
			rx.addCData(record, "part_nm", rec.part_nm);
			rx.addCData(record, "part_dtl_nm", rec.part_dtl_nm);
			rx.addCData(record, "barcode", rec.barcode);
			rx.addCData(record, "maker", rec.maker);
			rx.addCData(record, "std_modl", rec.std_modl);
			rx.add(record, "prt_seq", rec.prt_seq);
			rx.addCData(record, "usag", rec.usag);
			rx.addCData(record, "purc_info", rec.purc_info);
			rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "stok_10", rec.stok_10);
			rx.add(record, "stok_22", rec.stok_22);
			rx.add(record, "stok_25", rec.stok_25);
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
<dataSet>
	<CURLIST>
		<record>
			<matr_cd/>
			<matr_nm/>
			<purc_uprc/>
			<unit/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 14:08:25 KST 2009 */ %>