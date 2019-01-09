<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_3420_LDataSet ds = (HD_VACA_3420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_VACA_3420_LCURLIST3Record rec = (HD_VACA_3420_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_proc_stat", rec.tot_proc_stat);
			rx.add(record, "tot_proc_stat_nm", rec.tot_proc_stat_nm);
			//rx.add(record, "tot_proc_stat", StringUtil.replaceToXml(rec.tot_proc_stat));
			//rx.add(record, "tot_proc_stat_nm", StringUtil.replaceToXml(rec.tot_proc_stat_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_VACA_3420_LCURLIST2Record rec = (HD_VACA_3420_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_3420_LCURLISTRecord rec = (HD_VACA_3420_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "in_cmpy_yn", rec.in_cmpy_yn);
			rx.add(record, "lvcmpy_yn", rec.lvcmpy_yn);
			rx.add(record, "reinst_yn", rec.reinst_yn);
			rx.add(record, "susp_yn", rec.susp_yn);
			rx.add(record, "temp_yn", rec.temp_yn);
			rx.add(record, "dspch_yn", rec.dspch_yn);
			rx.add(record, "stdy_yn", rec.stdy_yn);
			rx.add(record, "labr_tm_exem_yn", rec.labr_tm_exem_yn);
			rx.add(record, "labr_tm_exem_end_yn", rec.labr_tm_exem_end_yn);
			rx.add(record, "child_birth_vaca", rec.child_birth_vaca);
			rx.add(record, "sick_vaca", rec.sick_vaca);
			rx.add(record, "exec_clsf", rec.exec_clsf);
			rx.add(record, "exec_clsf_nm", rec.exec_clsf_nm);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "in_cmpy_yn", StringUtil.replaceToXml(rec.in_cmpy_yn));
			//rx.add(record, "lvcmpy_yn", StringUtil.replaceToXml(rec.lvcmpy_yn));
			//rx.add(record, "reinst_yn", StringUtil.replaceToXml(rec.reinst_yn));
			//rx.add(record, "susp_yn", StringUtil.replaceToXml(rec.susp_yn));
			//rx.add(record, "temp_yn", StringUtil.replaceToXml(rec.temp_yn));
			//rx.add(record, "dspch_yn", StringUtil.replaceToXml(rec.dspch_yn));
			//rx.add(record, "stdy_yn", StringUtil.replaceToXml(rec.stdy_yn));
			//rx.add(record, "labr_tm_exem_yn", StringUtil.replaceToXml(rec.labr_tm_exem_yn));
			//rx.add(record, "labr_tm_exem_end_yn", StringUtil.replaceToXml(rec.labr_tm_exem_end_yn));
			//rx.add(record, "child_birth_vaca", StringUtil.replaceToXml(rec.child_birth_vaca));
			//rx.add(record, "sick_vaca", StringUtil.replaceToXml(rec.sick_vaca));
			//rx.add(record, "exec_clsf", StringUtil.replaceToXml(rec.exec_clsf));
			//rx.add(record, "exec_clsf_nm", StringUtil.replaceToXml(rec.exec_clsf_nm));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
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
<hd_vaca_3420_l>
	<dataSet>
		<CURLIST3>
			<record>
				<tot_proc_stat/>
				<tot_proc_stat_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_vaca_3420_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_3420_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<posi_cd/>
				<posi_nm/>
				<dty_cd/>
				<dty_nm/>
				<in_cmpy_dt/>
				<lvcmpy_dt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_vaca_3420_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_vaca_3420_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<posi_cd/>
				<posi_nm/>
				<dty_cd/>
				<dty_nm/>
				<in_cmpy_yn/>
				<lvcmpy_yn/>
				<reinst_yn/>
				<susp_yn/>
				<temp_yn/>
				<dspch_yn/>
				<stdy_yn/>
				<labr_tm_exem_yn/>
				<labr_tm_exem_end_yn/>
				<child_birth_vaca/>
				<sick_vaca/>
				<exec_clsf/>
				<exec_clsf_nm/>
				<proc_stat/>
				<proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_3420_l>
*/
%>

<% /* 작성시간 : Mon Aug 31 13:48:56 KST 2015 */ %>