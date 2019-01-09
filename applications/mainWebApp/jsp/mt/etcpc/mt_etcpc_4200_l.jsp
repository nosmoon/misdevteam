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
	MT_ETCPC_4200_LDataSet ds = (MT_ETCPC_4200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int recordSet1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
      
		/****** CURLIST2 BEGIN */
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCPC_4200_LCURLIST2Record rec = (MT_ETCPC_4200_LCURLIST2Record)ds.curlist2.get(0);
			
			rx.add(dataSet, "swnm", rec.swnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
        
        
        
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(root, "tempData", "");
		recordSet1 = rx.add(recordSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_4200_LCURLIST1Record rec = (MT_ETCPC_4200_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet1, "record", "");
            
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "mchn_mang_no", rec.mchn_mang_no);
			rx.add(record, "use_nm", rec.use_nm);
			rx.add(record, "use_usag", rec.use_usag);
			rx.add(record, "modl_mang_nonm", rec.modl_mang_nonm);
			rx.add(record, "use_usag_sw", rec.use_usag_sw);
			rx.add(record, "swnm", rec.swnm);
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
			<use_nm/>
			<use_usag/>
			<modl_mang_nonm/>
			<use_usag_sw/>
			<swnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 31 13:50:03 KST 2009 */ %>