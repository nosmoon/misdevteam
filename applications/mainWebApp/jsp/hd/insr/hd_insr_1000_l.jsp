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
	HD_INSR_1000_LDataSet ds = (HD_INSR_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_INSR_1000_LCURLIST4Record rec = (HD_INSR_1000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "np_entr_dt", rec.np_entr_dt);
			rx.add(record, "np_mtry_dt", rec.np_mtry_dt);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "np_cmpy_burd_amt", rec.np_cmpy_burd_amt);
			rx.add(record, "np_no", rec.np_no);
			//rx.add(record, "np_entr_dt", StringUtil.replaceToXml(rec.np_entr_dt));
			//rx.add(record, "np_mtry_dt", StringUtil.replaceToXml(rec.np_mtry_dt));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "np_cmpy_burd_amt", StringUtil.replaceToXml(rec.np_cmpy_burd_amt));
			//rx.add(record, "np_no", StringUtil.replaceToXml(rec.np_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INSR_1000_LCURLIST3Record rec = (HD_INSR_1000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "slf_burd_amt_sum", rec.slf_burd_amt_sum);
			rx.add(record, "cmpy_burd_amt_sum", rec.cmpy_burd_amt_sum);
			rx.add(record, "lvcmpy_swit_amt_sum", rec.lvcmpy_swit_amt_sum);
			rx.add(record, "nan1", rec.nan1);
			rx.add(record, "nan2", rec.nan2);
			rx.add(record, "sumall", rec.sumall);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "slf_burd_amt_sum", StringUtil.replaceToXml(rec.slf_burd_amt_sum));
			//rx.add(record, "cmpy_burd_amt_sum", StringUtil.replaceToXml(rec.cmpy_burd_amt_sum));
			//rx.add(record, "lvcmpy_swit_amt_sum", StringUtil.replaceToXml(rec.lvcmpy_swit_amt_sum));
			//rx.add(record, "nan1", StringUtil.replaceToXml(rec.nan1));
			//rx.add(record, "nan2", StringUtil.replaceToXml(rec.nan2));
			//rx.add(record, "sumall", StringUtil.replaceToXml(rec.sumall));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INSR_1000_LCURLIST2Record rec = (HD_INSR_1000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			//rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "cmpy_burd_amt", rec.cmpy_burd_amt);
			rx.add(record, "lvcmpy_swit_amt", rec.lvcmpy_swit_amt);
			rx.add(record, "sum", rec.sum);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "cmpy_burd_amt", StringUtil.replaceToXml(rec.cmpy_burd_amt));
			//rx.add(record, "lvcmpy_swit_amt", StringUtil.replaceToXml(rec.lvcmpy_swit_amt));
			//rx.add(record, "sum", StringUtil.replaceToXml(rec.sum));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INSR_1000_LCURLIST1Record rec = (HD_INSR_1000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_cd_nm", rec.dty_cd_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_cd_nm", rec.posi_cd_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_cd_nm", StringUtil.replaceToXml(rec.dept_cd_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_cd_nm", StringUtil.replaceToXml(rec.dty_cd_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_cd_nm", StringUtil.replaceToXml(rec.posi_cd_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
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
<hd_insr_1000_l>
	<dataSet>
		<CURLIST4>
			<record>
				<np_entr_dt/>
				<np_mtry_dt/>
				<np_slf_ctrb_amt/>
				<np_cmpy_burd_amt/>
				<np_no/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_insr_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1000_l>
	<dataSet>
		<CURLIST3>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<slf_burd_amt_sum/>
				<cmpy_burd_amt_sum/>
				<lvcmpy_swit_amt_sum/>
				<nan1/>
				<nan2/>
				<sumall/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_insr_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<rnum/>
				<emp_no/>
				<saly_yy/>
				<saly_no/>
				<slf_burd_amt/>
				<cmpy_burd_amt/>
				<lvcmpy_swit_amt/>
				<sum/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_insr_1000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<prn/>
				<emp_clsf/>
				<emp_clsf_nm/>
				<dept_cd/>
				<dept_cd_nm/>
				<dty_cd/>
				<dty_cd_nm/>
				<posi_cd/>
				<posi_cd_nm/>
				<in_cmpy_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_insr_1000_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 20:54:39 KST 2009 */ %>