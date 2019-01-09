<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_1722_LDataSet ds = (HD_INSR_1722_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INSR_1722_LCURLISTRecord rec = (HD_INSR_1722_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "tms", rec.tms);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "insr_amt_recp_resn", rec.insr_amt_recp_resn);
			rx.add(record, "rela_spc_agrmnt", rec.rela_spc_agrmnt);
			rx.add(record, "recp_insr_amt", rec.recp_insr_amt);
			rx.add(record, "dlay_int", rec.dlay_int);
			rx.add(record, "clam_resn_occr_dt", rec.clam_resn_occr_dt);
			rx.add(record, "insr_amt_recp_dt", rec.insr_amt_recp_dt);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "insr_amt_recp_resn", StringUtil.replaceToXml(rec.insr_amt_recp_resn));
			//rx.add(record, "rela_spc_agrmnt", StringUtil.replaceToXml(rec.rela_spc_agrmnt));
			//rx.add(record, "recp_insr_amt", StringUtil.replaceToXml(rec.recp_insr_amt));
			//rx.add(record, "dlay_int", StringUtil.replaceToXml(rec.dlay_int));
			//rx.add(record, "clam_resn_occr_dt", StringUtil.replaceToXml(rec.clam_resn_occr_dt));
			//rx.add(record, "insr_amt_recp_dt", StringUtil.replaceToXml(rec.insr_amt_recp_dt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<hd_insr_1722_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<rnum/>
				<tms/>
				<emp_no/>
				<flnm/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<insr_amt_recp_resn/>
				<rela_spc_agrmnt/>
				<recp_insr_amt/>
				<dlay_int/>
				<clam_resn_occr_dt/>
				<insr_amt_recp_dt/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1722_l>
*/
%>

<% /* 작성시간 : Tue May 19 16:42:17 KST 2009 */ %>