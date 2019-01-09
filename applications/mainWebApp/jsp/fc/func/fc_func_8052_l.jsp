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
	FC_FUNC_8052_LDataSet ds = (FC_FUNC_8052_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8052_LCURLIST1Record rec = (FC_FUNC_8052_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "comp_dt1", rec.comp_dt1);
			rx.add(record, "mtry_dt1", rec.mtry_dt1);
			rx.add(record, "won_amt", rec.won_amt);
			rx.add(record, "insr_nm", rec.insr_nm);
			rx.add(record, "insr_amt", rec.insr_amt);
			rx.add(record, "insr_rate", rec.insr_rate);
			rx.add(record, "frex_cd", rec.frex_cd);
			rx.add(record, "exrate", rec.exrate);
			rx.add(record, "frcr_amt", rec.frcr_amt);
			rx.add(record, "won_amt1", rec.won_amt1);
			rx.add(record, "comp_dt2", rec.comp_dt2);
			rx.add(record, "mtry_dt2", rec.mtry_dt2);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "mcnm", rec.mcnm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "buseonm", rec.buseonm);
			rx.add(record, "pymt_rmks", rec.pymt_rmks);
			rx.add(record, "jpno", rec.jpno);
			rx.add(record, "insr_stat_cdnm", rec.insr_stat_cdnm);
			rx.add(record, "pymt_dt", rec.pymt_dt);
			rx.add(record, "leas_nm", rec.leas_nm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "pymt_slip_occr_dt", rec.pymt_slip_occr_dt);
			rx.add(record, "pymt_slip_clsf_cd", rec.pymt_slip_clsf_cd);
			rx.add(record, "pymt_slip_seq", rec.pymt_slip_seq);
			//rx.add(record, "comp_dt1", StringUtil.replaceToXml(rec.comp_dt1));
			//rx.add(record, "mtry_dt1", StringUtil.replaceToXml(rec.mtry_dt1));
			//rx.add(record, "won_amt", StringUtil.replaceToXml(rec.won_amt));
			//rx.add(record, "insr_nm", StringUtil.replaceToXml(rec.insr_nm));
			//rx.add(record, "insr_amt", StringUtil.replaceToXml(rec.insr_amt));
			//rx.add(record, "insr_rate", StringUtil.replaceToXml(rec.insr_rate));
			//rx.add(record, "frex_cd", StringUtil.replaceToXml(rec.frex_cd));
			//rx.add(record, "exrate", StringUtil.replaceToXml(rec.exrate));
			//rx.add(record, "frcr_amt", StringUtil.replaceToXml(rec.frcr_amt));
			//rx.add(record, "won_amt1", StringUtil.replaceToXml(rec.won_amt1));
			//rx.add(record, "comp_dt2", StringUtil.replaceToXml(rec.comp_dt2));
			//rx.add(record, "mtry_dt2", StringUtil.replaceToXml(rec.mtry_dt2));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "mcnm", StringUtil.replaceToXml(rec.mcnm));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "buseonm", StringUtil.replaceToXml(rec.buseonm));
			//rx.add(record, "pymt_rmks", StringUtil.replaceToXml(rec.pymt_rmks));
			//rx.add(record, "jpno", StringUtil.replaceToXml(rec.jpno));
			//rx.add(record, "insr_stat_cdnm", StringUtil.replaceToXml(rec.insr_stat_cdnm));
			//rx.add(record, "pymt_dt", StringUtil.replaceToXml(rec.pymt_dt));
			//rx.add(record, "leas_nm", StringUtil.replaceToXml(rec.leas_nm));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "pymt_slip_occr_dt", StringUtil.replaceToXml(rec.pymt_slip_occr_dt));
			//rx.add(record, "pymt_slip_clsf_cd", StringUtil.replaceToXml(rec.pymt_slip_clsf_cd));
			//rx.add(record, "pymt_slip_seq", StringUtil.replaceToXml(rec.pymt_slip_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_func_8052_l>
	<dataSet>
		<CURLIST1>
			<record>
				<comp_dt1/>
				<mtry_dt1/>
				<won_amt/>
				<insr_nm/>
				<insr_amt/>
				<insr_rate/>
				<frex_cd/>
				<exrate/>
				<frcr_amt/>
				<won_amt1/>
				<comp_dt2/>
				<mtry_dt2/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<compnm/>
				<medi_cd/>
				<mcnm/>
				<dtls_medi_cd/>
				<use_dept_cd/>
				<buseonm/>
				<pymt_rmks/>
				<jpno/>
				<insr_stat_cdnm/>
				<pymt_dt/>
				<leas_nm/>
				<comp_dt/>
				<mtry_dt/>
				<pymt_slip_occr_dt/>
				<pymt_slip_clsf_cd/>
				<pymt_slip_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8052_l>
*/
%>

<% /* 작성시간 : Fri Apr 10 20:18:51 KST 2009 */ %>