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
	MT_PAPINOUT_5101_LDataSet ds = (MT_PAPINOUT_5101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	
	int iQuntTot = 0;	//수량합계
	int iAmtTot  = 0;	//금액합계
	int iWgtTot  = 0;	//중량합계
	
	String sUnit = "";
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_5101_LCURLISTRecord rec = (MT_PAPINOUT_5101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			if(rec.pj_kind_nm.substring(0,2).equals("심봉")) {
				sUnit = "(개)";
			} else {
				sUnit = "(kg)";
			}
			
			rx.add(record, "pj_kind", rec.pj_kind);
			rx.add(record, "pj_kind_nm", rec.pj_kind_nm + sUnit);
			rx.add(record, "pj_qunt", rec.pj_qunt);
			rx.add(record, "pj_wgt", rec.pj_wgt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
			
			iQuntTot = iQuntTot + Integer.parseInt(rec.pj_qunt);
			iAmtTot  = iAmtTot  + Integer.parseInt(rec.amt);
			iWgtTot  = iWgtTot  + Integer.parseInt(rec.pj_wgt);
			
			if(i == (ds.curlist.size() -1)) {
				rx.add(recordSet, "record", "");
				rx.add(record, "pj_kind", "TOT");
				rx.add(record, "pj_kind_nm", "합계");
				rx.add(record, "pj_qunt", iQuntTot);
				rx.add(record, "pj_wgt", iWgtTot);
				rx.add(record, "uprc", "");
				rx.add(record, "amt", iAmtTot);
			}
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<cmpy_cd/>
			<pj_kind/>
			<pj_kind_nm/>
			<pj_qunt/>
			<uprc/>
			<amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 12 10:04:29 KST 2009 */ %>