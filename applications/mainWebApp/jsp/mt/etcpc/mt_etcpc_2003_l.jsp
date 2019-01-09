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
	MT_ETCPC_2003_LDataSet ds = (MT_ETCPC_2003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_2003_LCURLIST1Record rec = (MT_ETCPC_2003_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record", "");
            
			rx.add(record, "mchn_mang_no", rec.mchn_mang_no);
			rx.add(record, "modl_mang_no", rec.modl_mang_no+" "+rec.modl_nm);
			rx.add(record, "serl_no", rec.serl_no);
			rx.add(record, "rsrt_dt", rec.rsrt_dt);
			rx.add(record, "use_pers", rec.use_pers+" " +rec.use_pers_flnm);
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
			<mchn_mang_no/>
			<modl_mang_no/>
			<modl_nm/>
			<serl_no/>
			<rsrt_dt/>
			<use_pers/>
			<use_pers_flnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 14:59:42 KST 2009 */ %>