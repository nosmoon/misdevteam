<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1010_MDataSet ds = (FC_FUNC_1010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURDRCR_DLCO_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_DLCO_CLSF_CD", "");

		for(int i = 0; i < ds.curdrcr_dlco_clsf_cd.size(); i++) {
			FC_FUNC_1010_MCURDRCR_DLCO_CLSF_CDRecord rec = (FC_FUNC_1010_MCURDRCR_DLCO_CLSF_CDRecord)ds.curdrcr_dlco_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_dlco_clsf_cd.size());
		/****** CURDRCR_DLCO_CLSF_CD END */

		/****** CURDRCR_PAY_PLAC_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_PAY_PLAC_CD", "");

		for(int i = 0; i < ds.curdrcr_pay_plac_cd.size(); i++) {
			FC_FUNC_1010_MCURDRCR_PAY_PLAC_CDRecord rec = (FC_FUNC_1010_MCURDRCR_PAY_PLAC_CDRecord)ds.curdrcr_pay_plac_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_pay_plac_cd.size());
		/****** CURDRCR_PAY_PLAC_CD END */

		/****** CURDRCR_NOTE_CLEHOUS_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_NOTE_CLEHOUS_CD", "");

		for(int i = 0; i < ds.curdrcr_note_clehous_cd.size(); i++) {
			FC_FUNC_1010_MCURDRCR_NOTE_CLEHOUS_CDRecord rec = (FC_FUNC_1010_MCURDRCR_NOTE_CLEHOUS_CDRecord)ds.curdrcr_note_clehous_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_note_clehous_cd.size());
		/****** CURDRCR_NOTE_CLEHOUS_CD END */

		/****** CURDRCR_NOTE_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_NOTE_CLSF_CD", "");

		for(int i = 0; i < ds.curdrcr_note_clsf_cd.size(); i++) {
			FC_FUNC_1010_MCURDRCR_NOTE_CLSF_CDRecord rec = (FC_FUNC_1010_MCURDRCR_NOTE_CLSF_CDRecord)ds.curdrcr_note_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_note_clsf_cd.size());
		/****** CURDRCR_NOTE_CLSF_CD END */

		/****** CURDRCR_EEYGTJ BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_EEYGTJ", "");

		for(int i = 0; i < ds.curdrcr_eeygtj.size(); i++) {
			FC_FUNC_1010_MCURDRCR_EEYGTJRecord rec = (FC_FUNC_1010_MCURDRCR_EEYGTJRecord)ds.curdrcr_eeygtj.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_eeygtj.size());
		/****** CURDRCR_EEYGTJ END */

		/****** CURDRCR_ISSU_CMPY_CLSF_CD BEGIN */
		recordSet = rx.add(dataSet, "CURDRCR_ISSU_CMPY_CLSF_CD", "");

		for(int i = 0; i < ds.curdrcr_issu_cmpy_clsf_cd.size(); i++) {
			FC_FUNC_1010_MCURDRCR_ISSU_CMPY_CLSF_CDRecord rec = (FC_FUNC_1010_MCURDRCR_ISSU_CMPY_CLSF_CDRecord)ds.curdrcr_issu_cmpy_clsf_cd.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curdrcr_issu_cmpy_clsf_cd.size());
		/****** CURDRCR_ISSU_CMPY_CLSF_CD END */

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
<fc_func_1010_m>
	<dataSet>
		<CURDRCR_DLCO_CLSF_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURDRCR_DLCO_CLSF_CD>
	</dataSet>
</fc_func_1010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_1010_m>
	<dataSet>
		<CURDRCR_PAY_PLAC_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURDRCR_PAY_PLAC_CD>
	</dataSet>
</fc_func_1010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_1010_m>
	<dataSet>
		<CURDRCR_NOTE_CLEHOUS_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURDRCR_NOTE_CLEHOUS_CD>
	</dataSet>
</fc_func_1010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_1010_m>
	<dataSet>
		<CURDRCR_NOTE_CLSF_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURDRCR_NOTE_CLSF_CD>
	</dataSet>
</fc_func_1010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_1010_m>
	<dataSet>
		<CURDRCR_EEYGTJ>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURDRCR_EEYGTJ>
	</dataSet>
</fc_func_1010_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_1010_m>
	<dataSet>
		<CURDRCR_ISSU_CMPY_CLSF_CD>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURDRCR_ISSU_CMPY_CLSF_CD>
	</dataSet>
</fc_func_1010_m>
*/
%>

<% /* 작성시간 : Wed Apr 22 19:47:16 KST 2009 */ %>