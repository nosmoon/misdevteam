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
	MT_ETCPC_4100_LDataSet ds = (MT_ETCPC_4100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
    
	try {
		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_4100_LCURLIST1Record rec = (MT_ETCPC_4100_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "mchn_mang_no", rec.mchn_mang_no);
			rx.add(record, "use_pers_flnm", rec.use_pers_flnm);
			rx.add(record, "use_usag", rec.use_usag);
			rx.add(record, "mdnm", rec.mdnm);
			rx.add(record, "mchn_stat", rec.mchn_stat );  // 기기상태
			rx.add(record, "kep_plac", rec.kep_plac);
			rx.add(record, "buy_dt", rec.buy_dt);
			rx.add(record, "pay_dt", rec.pay_dt);
			rx.add(record, "sygg", rec.sygg);
			rx.add(record, "wste_dd_pers", rec.wste_dd_pers);
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
			<use_dept_nm/>
			<mchn_mang_no/>
			<use_pers_flnm/>
			<use_usag/>
			<mdnm/>
			<mchn_stat/>
			<kep_plac/>
			<buy_dt/>
			<pay_dt/>
			<sygg/>
			<wste_dd_pers/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 30 17:11:24 KST 2009 */ %>