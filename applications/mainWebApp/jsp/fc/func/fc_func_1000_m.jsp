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
	FC_FUNC_1000_MDataSet ds = (FC_FUNC_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_NOTE_CLEHOUS_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_NOTE_CLEHOUS_LIST", "");

		for(int i = 0; i < ds.cur_note_clehous_list.size(); i++) {
			FC_FUNC_1000_MCUR_NOTE_CLEHOUS_LISTRecord rec = (FC_FUNC_1000_MCUR_NOTE_CLEHOUS_LISTRecord)ds.cur_note_clehous_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_note_clehous_list.size());
		/****** CUR_NOTE_CLEHOUS_LIST END */

		/****** CUR_ISSU_CMPY_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_ISSU_CMPY_LIST", "");

		for(int i = 0; i < ds.cur_issu_cmpy_list.size(); i++) {
			FC_FUNC_1000_MCUR_ISSU_CMPY_LISTRecord rec = (FC_FUNC_1000_MCUR_ISSU_CMPY_LISTRecord)ds.cur_issu_cmpy_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_issu_cmpy_list.size());
		/****** CUR_ISSU_CMPY_LIST END */

		/****** CUR_PAY_PLAC_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_PAY_PLAC_LIST", "");

		for(int i = 0; i < ds.cur_pay_plac_list.size(); i++) {
			FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord rec = (FC_FUNC_1000_MCUR_PAY_PLAC_LISTRecord)ds.cur_pay_plac_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_pay_plac_list.size());
		/****** CUR_PAY_PLAC_LIST END */

		/****** CUR_NOTE_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_NOTE_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_note_clsf_list.size(); i++) {
			FC_FUNC_1000_MCUR_NOTE_CLSF_LISTRecord rec = (FC_FUNC_1000_MCUR_NOTE_CLSF_LISTRecord)ds.cur_note_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_note_clsf_list.size());
		/****** CUR_NOTE_CLSF_LIST END */

		/****** CUR_DLCO_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_DLCO_CLSF_LIST", "");

		for(int i = 0; i < ds.cur_dlco_clsf_list.size(); i++) {
			FC_FUNC_1000_MCUR_DLCO_CLSF_LISTRecord rec = (FC_FUNC_1000_MCUR_DLCO_CLSF_LISTRecord)ds.cur_dlco_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.cur_dlco_clsf_list.size());
		/****** CUR_DLCO_CLSF_LIST END */

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
	<CUR_NOTE_CLEHOUS_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_NOTE_CLEHOUS_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_ISSU_CMPY_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_ISSU_CMPY_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_PAY_PLAC_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_PAY_PLAC_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_NOTE_CLSF_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_NOTE_CLSF_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CUR_DLCO_CLSF_LIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CUR_DLCO_CLSF_LIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 21:59:33 KST 2009 */ %>