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
	MT_ETCPC_1200_LDataSet ds = (MT_ETCPC_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;    
	dataSet = rx.add(root, "tempData", "");
    
	try {
		/****** CURLIST1 BEGIN */
//		recordSet = rx.add(dataSet, "gridData", "");
        int rowCnt_h = 1;
        int rowCnt_s = 1;
		int record = 0;
    	recordSet = rx.add(dataSet, "hw", "");
        for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_1200_LCURLIST1Record rec = (MT_ETCPC_1200_LCURLIST1Record)ds.curlist1.get(i);
			
            if("H".equalsIgnoreCase(rec.spec_clsf)){            	
            	record = rx.add(recordSet, "record", "");                
    			rx.add(record, "seq_h", rowCnt_h);
    			rx.add(record, "cmps_item", rec.cmps_item);
    			rx.add(record, "brand_sw", rec.brand_sw);
    			rx.add(record, "spec", rec.spec);
    			rx.add(record, "seq", rec.seq);
    			rx.add(record, "modl_mang_no", rec.modl_mang_no);
    			rx.add(record, "spec_clsf", rec.spec_clsf);
    			rowCnt_h++;
            }
		}
        
    	recordSet = rx.add(dataSet, "sw", "");
        
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCPC_1200_LCURLIST1Record rec = (MT_ETCPC_1200_LCURLIST1Record)ds.curlist1.get(i);
			
             if("S".equalsIgnoreCase(rec.spec_clsf)){
                record = rx.add(recordSet, "record", "");
            	rx.add(record, "seq_s", rowCnt_s);
    			rx.add(record, "cmps_item", rec.cmps_item);
    			rx.add(record, "brand_sw", rec.brand_sw);
    			rx.add(record, "spec", rec.spec);
    			rx.add(record, "seq", rec.seq);
    			rx.add(record, "modl_mang_no", rec.modl_mang_no);
    			rx.add(record, "spec_clsf", rec.spec_clsf);
                
    			rowCnt_s++;
            }
           
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
			<modl_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 12 15:09:48 KST 2009 */ %>