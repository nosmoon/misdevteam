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
	MT_ETCPC_1303_LDataSet ds = (MT_ETCPC_1303_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int rowCnt=1;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
        recordSet = rx.add(dataSet, "gridData", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_1303_LCURLIST1Record rec = (MT_ETCPC_1303_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
            
			rx.add(record, "rowcnt", rowCnt);			
			rx.add(record, "modl_mang_no", rec.modl_nm);
            //rx.add(record, "modl_nm", rec.modl_nm);
			rx.add(record, "buy_dt", rec.buy_dt);
			rx.add(record, "use_usag", rec.use_usag + " "+rec.use_usag_nm);
			rx.add(record, "buy_cnt", rec.buy_cnt);
			rx.add(record, "draft_deptcd", rec.draft_deptcd);
			rx.add(record, "draft_deptnm", rec.draft_deptnm);
			rx.add(record, "draft_no", rec.draft_no);
			rx.add(record, "nocompen_mant_frdt", rec.nocompen_mant_frdt);
			rx.add(record, "nocompen_mant_todt", rec.nocompen_mant_todt);
			rx.add(record, "compen_mant_frdt", rec.compen_mant_frdt);
			rx.add(record, "compen_mant_todt", rec.compen_mant_todt);
			rx.add(record, "compen_mant_cmpy", rec.compen_mant_cmpy);
			//rx.add(record, "modl_mang_no", rec.modl_mang_no);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "draft_kind", rec.draft_kind);
			rowCnt++;
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
			<modl_nm/>
			<buy_dt/>
			<use_usag/>
			<buy_cnt/>
			<draft_deptcd/>
			<draft_deptnm/>
			<draft_no/>
			<nocompen_mant_frdt/>
			<nocompen_mant_todt/>
			<compen_mant_frdt/>
			<compen_mant_todt/>
			<compen_mant_cmpy/>
			<modl_mang_no/>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<use_term/>
			<draft_kind/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 13:26:23 KST 2009 */ %>