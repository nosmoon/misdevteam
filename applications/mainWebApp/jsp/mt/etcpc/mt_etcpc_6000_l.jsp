<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcpc.rec.*
	,	chosun.ciis.mt.etcpc.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCPC_6000_LDataSet ds = (MT_ETCPC_6000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST1", "");
System.out.println("ds.curlist1.size()=> "+ds.curlist1.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_6000_LCURLIST1Record rec = (MT_ETCPC_6000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "modl_mang_no", rec.modl_mang_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "modl_kind_nm", rec.modl_kind_nm);
			rx.add(record, "modl_nm", rec.modl_nm);
			rx.add(record, "use_usag_sw", rec.use_usag_sw);
			rx.add(record, "buy_cnt", rec.buy_cnt);
			rx.add(record, "gs1", rec.gs1);
			rx.add(record, "gs2", rec.gs2);
			rx.add(record, "gs3", rec.gs3);
			rx.add(record, "gs4", rec.gs4);
			rx.add(record, "gs5", rec.gs5);
			rx.add(record, "gs6", rec.gs6);
			rx.add(record, "gs7", rec.gs7);
			rx.add(record, "gs8", rec.gs8);
			rx.add(record, "gs9", rec.gs9);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<modl_mang_no/>
			<occr_dt/>
			<seq/>
			<modl_kind_nm/>
			<modl_nm/>
			<use_usag_sw/>
			<buy_cnt/>
			<gs1/>
			<gs2/>
			<gs3/>
			<gs4/>
			<gs5/>
			<gs6/>
			<gs7/>
			<gs8/>
			<gs9/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 15:58:20 KST 2009 */ %>