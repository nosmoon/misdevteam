<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_2000_MDataSet ds = (FC_FUNC_2000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURDRCR_YGCOMPGBCD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_YGCOMPGBCD", "");

		for(int i = 0; i < ds.curdrcr_ygcompgbcd.size(); i++) {
			FC_FUNC_2000_MCURDRCR_YGCOMPGBCDRecord rec = (FC_FUNC_2000_MCURDRCR_YGCOMPGBCDRecord)ds.curdrcr_ygcompgbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_ygcompgbcd.size());
		/****** CURDRCR_YGCOMPGBCD END */

		/****** CURDRCR_YGYUGAGBCD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_YGYUGAGBCD", "");

		for(int i = 0; i < ds.curdrcr_ygyugagbcd.size(); i++) {
			FC_FUNC_2000_MCURDRCR_YGYUGAGBCDRecord rec = (FC_FUNC_2000_MCURDRCR_YGYUGAGBCDRecord)ds.curdrcr_ygyugagbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.addCData(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_ygyugagbcd.size());
		/****** CURDRCR_YGYUGAGBCD END */

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
	<CURDRCR_YGCOMPGBCD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURDRCR_YGCOMPGBCD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_YGYUGAGBCD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURDRCR_YGYUGAGBCD>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 14:08:43 KST 2009 */ %>