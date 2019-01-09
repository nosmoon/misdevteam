<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.mach.rec.*
	,	chosun.ciis.as.mach.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_MACH_1000_MDataSet ds = (AS_MACH_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURMACH BEGIN */
		recordSet = rx.add(dataSet, "curmach", "");

		for(int i = 0; i < ds.curmach.size(); i++) {
			AS_MACH_1000_MCURMACHRecord rec = (AS_MACH_1000_MCURMACHRecord)ds.curmach.get(i);
			int record = rx.add(recordSet, "record", "");			
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdabrvnm_cd", rec.cdnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curmach.size());
		/****** CURMACH END */

		/****** CURBLDG BEGIN */
		recordSet = rx.add(dataSet, "curbldg", "");

		for(int i = 0; i < ds.curbldg.size(); i++) {
			AS_MACH_1000_MCURBLDGRecord rec = (AS_MACH_1000_MCURBLDGRecord)ds.curbldg.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdabrvnm_cd", rec.cdnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curbldg.size());
		/****** CURBLDG END */

		/****** CURWORK BEGIN */
		recordSet = rx.add(dataSet, "curwork", "");

		for(int i = 0; i < ds.curwork.size(); i++) {
			AS_MACH_1000_MCURWORKRecord rec = (AS_MACH_1000_MCURWORKRecord)ds.curwork.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdabrvnm_cd", rec.cdnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curwork.size());
		/****** CURWORK END */

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
<as_mach_1000_m>
	<dataSet>
		<CURMACH>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURMACH>
	</dataSet>
</as_mach_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_mach_1000_m>
	<dataSet>
		<CURBLDG>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURBLDG>
	</dataSet>
</as_mach_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_mach_1000_m>
	<dataSet>
		<CURWORK>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURWORK>
	</dataSet>
</as_mach_1000_m>
*/
%>

<% /* 작성시간 : Wed Jun 10 11:05:24 KST 2015 */ %>