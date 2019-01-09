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
	MT_ETCPC_2300_LDataSet ds = (MT_ETCPC_2300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
    int rowCnt = 1;

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "swnm", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_ETCPC_2300_LCURLIST3Record rec = (MT_ETCPC_2300_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.swnm);
			rx.add(record, "value", rec.swnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
        
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "sw", "");
        
        if(ds.curlist2.size()==0){
            
        }
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCPC_2300_LCURLIST2Record rec = (MT_ETCPC_2300_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
            
 			rx.add(record, "scnt", rec.scnt);
 			//rx.add(record, "swlics_cnt", rec.swlics_cnt);
            rx.add(record, "swlics_cnt", rec.swlics_cnt.substring(8));
            rx.add(record, "swlics_no", rec.swlics_cnt.substring(0,7));
		}
		
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "search", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
            
			MT_ETCPC_2300_LCURLIST1Record rec = (MT_ETCPC_2300_LCURLIST1Record)ds.curlist1.get(i);
            
			int record = rx.add(recordSet, "record", "");
			
			rx.add(record, "rowCnt", rowCnt);
System.out.println("rec.swlics_no =>"+rec.swlics_no );
			//A.MCHN_MANG_NO||' '||A.SWLICS_NO||' '||A.SWNM SWLICS_NO
            rx.add(record, "swlics_no", rec.swlics_no.substring(16));          // S/W명
			rx.add(record, "lisno", rec.lisno);           
			rx.add(record, "swlics_cnt", rec.swlics_cnt);
			rx.add(record, "swestb_dt", rec.swestb_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "seq", rec.seq); 
			rx.add(record, "swlics_no2", rec.swlics_no.substring(8,15));            // S/W번호
			rx.add(record, "mchn_mang_no", rec.swlics_no.substring(0,7));     // 기기관리번호
            
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
	<CURLIST2>
		<record>
			<scnt/>
			<swlics_cnt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<swlics_no/>
			<lisno/>
			<swlics_cnt/>
			<swestb_dt/>
			<remk/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 27 17:39:30 KST 2009 */ %>