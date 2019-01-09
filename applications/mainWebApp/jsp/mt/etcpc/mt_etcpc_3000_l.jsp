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
	MT_ETCPC_3000_LDataSet ds = (MT_ETCPC_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_3000_LCURLIST1Record rec = (MT_ETCPC_3000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "record", "");
            String use_usagNM = "";
            
            if("1".equalsIgnoreCase(rec.use_usag)){
                use_usagNM = "사무전산용";   
            } else if("2".equalsIgnoreCase(rec.use_usag)){
            	use_usagNM = "기사,인터넷용";
            }
             
            int cnt2 =Integer.parseInt(rec.swlics_cnt)-Integer.parseInt(rec.swlics_cnt2);

			rx.add(record, "swmang_no", rec.swmang_no);
			rx.add(record, "make_cmpy", rec.make_cmpy);
			rx.add(record, "swnm", rec.swnm);
			rx.add(record, "swkind", rec.swkind);
			rx.add(record, "use_usagNM", use_usagNM);
			rx.add(record, "buy_dt", rec.buy_dt);
			rx.add(record, "buy_draft_dept", rec.buy_draft_dept);
			rx.add(record, "buy_draft_dept_nm", rec.buy_draft_dept_nm);
			rx.add(record, "buy_draft_no", rec.buy_draft_no);
			rx.add(record, "swlics_cnt", rec.swlics_cnt);
			rx.add(record, "swlics_cnt2", rec.swlics_cnt2);
			rx.add(record, "cnt2", cnt2);
			rx.add(record, "gds_key", rec.gds_key);
			rx.add(record, "lics_certi_no", rec.lics_certi_no);
			rx.add(record, "swver", rec.swver);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "use_usag", rec.use_usag);
			
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
			<swmang_no/>
			<make_cmpy/>
			<swnm/>
			<swkind/>
			<use_usag/>
			<buy_dt/>
			<buy_draft_dept/>
			<buy_draft_no/>
			<swlics_cnt/>
			<gds_key/>
			<lics_certi_no/>
			<swver/>
			<remk/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 14:50:51 KST 2009 */ %>