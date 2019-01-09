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
	HD_VACA_1501_LDataSet ds = (HD_VACA_1501_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "temp_cd2", "");		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_VACA_1501_LCURLIST1Record rec = (HD_VACA_1501_LCURLIST1Record)ds.curlist1.get(i);
			if ("TEMP_CD2".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		int record2 = rx.add(recordSet, "item", "");	
		rx.add(record2, "value", "13999001"); //널 대체 가상코드
		rx.add(record2, "label", "선택");
		rx.add(dataSet, "totalcnt", ds.curlist1.size());
		
		/****** CURLIST1 END */		
		recordSet = rx.add(dataSet, "temp_cd1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1501_LCURLISTRecord rec = (HD_VACA_1501_LCURLISTRecord)ds.curlist.get(i);
			if ("TEMP_CD1".equals(rec.getCd_type())){						
				int record = rx.add(recordSet, "item", "");	
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		int record = rx.add(recordSet, "item", "");	
		rx.add(record2, "value", "13999001"); //널 대체 가상코드
		rx.add(record2, "label", "전체");
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
<tempData>
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</tempData>
*/
%>

<% /* 작성시간 : Sat Apr 25 16:09:11 KST 2009 */ %>