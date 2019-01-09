<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_8003_LDataSet ds = (HD_SALY_8003_LDataSet)request.getAttribute("ds");
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
			HD_SALY_8003_LCURLIST1Record rec = (HD_SALY_8003_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_8003_LCURLISTRecord rec = (HD_SALY_8003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "rptv_posi_cd", rec.rptv_posi_cd);
			rx.add(record, "rptv_posi_nm", rec.rptv_posi_nm);
			rx.add(record, "pens_aply_mm", rec.pens_aply_mm);
			rx.add(record, "welf_pens_amt", rec.welf_pens_amt);
			rx.add(record, "prsn_pens_amt", rec.prsn_pens_amt);
			rx.add(record, "pens_stot", rec.pens_stot);
			rx.add(record, "sum_pens_stot", rec.sum_pens_stot);
			rx.add(record, "prsn_sppt_amt", rec.prsn_sppt_amt);
			rx.add(record, "entr_yn", rec.entr_yn);
			rx.add(record, "lvcmpy_yn", rec.lvcmpy_yn);
			rx.add(record, "age", rec.age);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "rptv_posi_cd", StringUtil.replaceToXml(rec.rptv_posi_cd));
			//rx.add(record, "rptv_posi_nm", StringUtil.replaceToXml(rec.rptv_posi_nm));
			//rx.add(record, "pens_aply_mm", StringUtil.replaceToXml(rec.pens_aply_mm));
			//rx.add(record, "welf_pens_amt", StringUtil.replaceToXml(rec.welf_pens_amt));
			//rx.add(record, "prsn_pens_amt", StringUtil.replaceToXml(rec.prsn_pens_amt));
			//rx.add(record, "pens_stot", StringUtil.replaceToXml(rec.pens_stot));
			//rx.add(record, "sum_pens_stot", StringUtil.replaceToXml(rec.sum_pens_stot));
			//rx.add(record, "prsn_sppt_amt", StringUtil.replaceToXml(rec.prsn_sppt_amt));
			//rx.add(record, "entr_yn", StringUtil.replaceToXml(rec.entr_yn));
			//rx.add(record, "lvcmpy_yn", StringUtil.replaceToXml(rec.lvcmpy_yn));
			//rx.add(record, "age", StringUtil.replaceToXml(rec.age));
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
<hd_saly_8003_l>
	<dataSet>
		<CURLIST1>
			<record>
				<occr_dt/>
				<seq/>
				<proc_stat/>
				<proc_stat_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_saly_8003_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_saly_8003_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<rptv_posi_cd/>
				<rptv_posi_nm/>
				<pens_aply_mm/>
				<welf_pens_amt/>
				<prsn_pens_amt/>
				<pens_stot/>
				<sum_pens_stot/>
				<prsn_sppt_amt/>
				<entr_yn/>
				<lvcmpy_yn/>
				<age/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_8003_l>
*/
%>

<% /* 작성시간 : Fri Mar 04 14:33:10 KST 2016 */ %>