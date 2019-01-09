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
	FC_FUNC_1400_MDataSet ds = (FC_FUNC_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURDRCR_STAT_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_STAT_CD", "");

		for(int i = 0; i < ds.curdrcr_stat_cd.size(); i++) {
			FC_FUNC_1400_MCURDRCR_STAT_CDRecord rec = (FC_FUNC_1400_MCURDRCR_STAT_CDRecord)ds.curdrcr_stat_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_stat_cd.size());
		/****** CURDRCR_STAT_CD END */

		/****** CURDRCR_NOW_NOTE_STAT_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_NOW_NOTE_STAT_CD", "");

		for(int i = 0; i < ds.curdrcr_now_note_stat_cd.size(); i++) {
			FC_FUNC_1400_MCURDRCR_NOW_NOTE_STAT_CDRecord rec = (FC_FUNC_1400_MCURDRCR_NOW_NOTE_STAT_CDRecord)ds.curdrcr_now_note_stat_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_now_note_stat_cd.size());
		/****** CURDRCR_NOW_NOTE_STAT_CD END */

		/****** CURDRCR_BCOMPGBCD2 BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_BCOMPGBCD2", "");

		for(int i = 0; i < ds.curdrcr_bcompgbcd2.size(); i++) {
			FC_FUNC_1400_MCURDRCR_BCOMPGBCD2Record rec = (FC_FUNC_1400_MCURDRCR_BCOMPGBCD2Record)ds.curdrcr_bcompgbcd2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_bcompgbcd2.size());
		/****** CURDRCR_BCOMPGBCD2 END */

		/****** CURDRCR_BCOMPGBCD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_BCOMPGBCD", "");

		for(int i = 0; i < ds.curdrcr_bcompgbcd.size(); i++) {
			FC_FUNC_1400_MCURDRCR_BCOMPGBCDRecord rec = (FC_FUNC_1400_MCURDRCR_BCOMPGBCDRecord)ds.curdrcr_bcompgbcd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_bcompgbcd.size());
		/****** CURDRCR_BCOMPGBCD END */

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
	<CURDRCR_STAT_CD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURDRCR_STAT_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_NOW_NOTE_STAT_CD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURDRCR_NOW_NOTE_STAT_CD>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_BCOMPGBCD2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURDRCR_BCOMPGBCD2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURDRCR_BCOMPGBCD>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURDRCR_BCOMPGBCD>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 09 14:25:26 KST 2009 */ %>