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
	FC_FUNC_1452_LDataSet ds = (FC_FUNC_1452_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_FUNC_1452_LCURLISTRecord rec = (FC_FUNC_1452_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "note_ns", rec.note_ns);
			rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "jgjnm", rec.jgjnm);
			rx.add(record, "now_note_stat_cd_nm", rec.now_note_stat_cd_nm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_seq", rec.note_seq);
			rx.add(record, "bank_cd", rec.bank_cd);
			//rx.add(record, "reg_dt", StringUtil.replaceToXml(rec.reg_dt));
			//rx.add(record, "note_ns", StringUtil.replaceToXml(rec.note_ns));
			//rx.add(record, "note_clsf_cd_nm", StringUtil.replaceToXml(rec.note_clsf_cd_nm));
			//rx.add(record, "note_amt", StringUtil.replaceToXml(rec.note_amt));
			//rx.add(record, "bank_cd_nm", StringUtil.replaceToXml(rec.bank_cd_nm));
			//rx.add(record, "jpno", StringUtil.replaceToXml(rec.jpno));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "issu_pers_nm", StringUtil.replaceToXml(rec.issu_pers_nm));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "jgjnm", StringUtil.replaceToXml(rec.jgjnm));
			//rx.add(record, "now_note_stat_cd_nm", StringUtil.replaceToXml(rec.now_note_stat_cd_nm));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "note_no", StringUtil.replaceToXml(rec.note_no));
			//rx.add(record, "note_seq", StringUtil.replaceToXml(rec.note_seq));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
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
<fc_func_1452_l>
	<dataSet>
		<CURLIST>
			<record>
				<reg_dt/>
				<note_ns/>
				<note_clsf_cd_nm/>
				<note_amt/>
				<bank_cd_nm/>
				<jpno/>
				<mtry_dt/>
				<issu_pers_nm/>
				<compnm/>
				<jgjnm/>
				<now_note_stat_cd_nm/>
				<comp_dt/>
				<note_no/>
				<note_seq/>
				<bank_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1452_l>
*/
%>

<% /* 작성시간 : Mon Apr 06 14:51:02 KST 2009 */ %>