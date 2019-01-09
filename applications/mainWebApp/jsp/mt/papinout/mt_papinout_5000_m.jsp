<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_5000_MDataSet ds = (MT_PAPINOUT_5000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	String sUnit = "";
	
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "pj_kind", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_5000_MCURLIST1Record rec = (MT_PAPINOUT_5000_MCURLIST1Record)ds.curlist1.get(i);
			if("PJ_KIND".equals(rec.cd_type)) {
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd + " " + rec.cdnm);
			}
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		
		recordSet = rx.add(dataSet, "bank_cd", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_5000_MCURLIST3Record rec = (MT_PAPINOUT_5000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.bank_cd);
			rx.add(record, "label", rec.bank_cd + " " + rec.bank_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		
		recordSet = rx.add(dataSet, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_5000_MCURLIST2Record rec = (MT_PAPINOUT_5000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			if(rec.pj_kind_nm.substring(0,2).equals("심봉")) {
				sUnit = "(개)";
			} else if(rec.pj_kind_nm.substring(0,2).equals("합계")){
				sUnit = "";
			} else {
				sUnit = "(kg)";
			}
			rx.add(record, "pj_kind", rec.pj_kind);
			rx.add(record, "pj_kind_nm", rec.pj_kind_nm + sUnit);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
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
			<cd_type/>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 13:20:14 KST 2009 */ %>