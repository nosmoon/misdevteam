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
	FC_FUNC_1130_LDataSet ds = (FC_FUNC_1130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
    int resData = 0;
    int gridData = 0;
	int dataSet = 0;
//	int recordSet = 0;
    int NOTE_STAT_LIST = 0;
    int NOTE_STAT = 0;

	String errcode = "";
	String errmsg = "";
	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** NOTE_STAT_LIST BEGIN */
		NOTE_STAT_LIST = rx.add(dataSet, "NOTE_STAT_LIST", "");

		for(int i = 0; i < ds.note_stat_list.size(); i++) {
			FC_FUNC_1130_LNOTE_STAT_LISTRecord rec = (FC_FUNC_1130_LNOTE_STAT_LISTRecord)ds.note_stat_list.get(i);
			int record = rx.add(NOTE_STAT_LIST, "record", "");
			rx.add(record, "stat_dt", rec.stat_dt);
			rx.add(record, "stat_cd", rec.stat_cd);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "stat_nm", rec.stat_nm);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
		}
		rx.add(NOTE_STAT_LIST, "totalcnt", ds.note_stat_list.size());
		/****** NOTE_STAT_LIST END */

		/****** NOTE_STAT BEGIN */
		NOTE_STAT = rx.add(dataSet, "NOTE_STAT", "");

		for(int i = 0; i < ds.note_stat.size(); i++) {
			FC_FUNC_1130_LNOTE_STATRecord rec = (FC_FUNC_1130_LNOTE_STATRecord)ds.note_stat.get(i);
			int record = rx.add(NOTE_STAT, "record", "");
			rx.add(record, "now_note_stat_cd", rec.now_note_stat_cd);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "issu_cmpy_clsf_cd", rec.issu_cmpy_clsf_cd);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_clsf_cd_nm", rec.dlco_clsf_cd +" " +  rec.dlco_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "now_note_stat_nm", rec.now_note_stat_nm);
			rx.add(record, "issu_cmpy_clsf_nm", rec.issu_cmpy_clsf_nm);
			rx.add(record, "compnm", rec.compnm);
		}
		//rx.add(recordSet, "totalcnt", ds.note_stat.size());
		/****** NOTE_STAT END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<NOTE_STAT_LIST>
		<record>
			<stat_dt/>
			<stat_cd/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<stat_nm/>
			<dlco_clsf_nm/>
			<dlco_nm/>
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
		</record>
	</NOTE_STAT_LIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<NOTE_STAT>
		<record>
			<now_note_stat_cd/>
			<note_amt/>
			<comp_dt/>
			<mtry_dt/>
			<issu_cmpy_clsf_cd/>
			<issu_pers_nm/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<bank_nm/>
			<now_note_stat_nm/>
			<issu_cmpy_clsf_nm/>
			<compnm/>
		</record>
	</NOTE_STAT>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 03 17:07:41 KST 2009 */ %>
