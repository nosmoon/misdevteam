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
	HD_INSR_1200_LDataSet ds = (HD_INSR_1200_LDataSet)request.getAttribute("ds");
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
			HD_INSR_1200_LCURLIST4Record rec = (HD_INSR_1200_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "hlth_entr_no", rec.hlth_entr_no);
			rx.add(record, "hlth_insr_entr_dt", rec.hlth_insr_entr_dt);
			rx.add(record, "slf_hlth_insr_fee", rec.slf_hlth_insr_fee);
			rx.add(record, "self_insr_med_care_insr_fee", rec.self_insr_med_care_insr_fee);
			rx.add(record, "cmpy_hlth_insr_fee", rec.cmpy_hlth_insr_fee);
			rx.add(record, "cmpy_insr_med_care_insr_fee", rec.cmpy_insr_med_care_insr_fee);
			//rx.add(record, "hlth_entr_no", StringUtil.replaceToXml(rec.hlth_entr_no));
			//rx.add(record, "hlth_insr_entr_dt", StringUtil.replaceToXml(rec.hlth_insr_entr_dt));
			//rx.add(record, "slf_hlth_insr_fee", StringUtil.replaceToXml(rec.slf_hlth_insr_fee));
			//rx.add(record, "self_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.self_insr_med_care_insr_fee));
			//rx.add(record, "cmpy_hlth_insr_fee", StringUtil.replaceToXml(rec.cmpy_hlth_insr_fee));
			//rx.add(record, "cmpy_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.cmpy_insr_med_care_insr_fee));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INSR_1200_LCURLIST3Record rec = (HD_INSR_1200_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "s_slf_burd_insr_fee", rec.s_slf_burd_insr_fee);
			rx.add(record, "s_cmpy_burd_insr_fee", rec.s_cmpy_burd_insr_fee);
			rx.add(record, "s_slf_burd_med_care_insr_fee", rec.s_slf_burd_med_care_insr_fee);
			rx.add(record, "s_cmpy_burd_med_care_insr_fee", rec.s_cmpy_burd_med_care_insr_fee);
			rx.add(record, "sumall", rec.sumall);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "s_slf_burd_insr_fee", StringUtil.replaceToXml(rec.s_slf_burd_insr_fee));
			//rx.add(record, "s_cmpy_burd_insr_fee", StringUtil.replaceToXml(rec.s_cmpy_burd_insr_fee));
			//rx.add(record, "s_slf_burd_med_care_insr_fee", StringUtil.replaceToXml(rec.s_slf_burd_med_care_insr_fee));
			//rx.add(record, "s_cmpy_burd_med_care_insr_fee", StringUtil.replaceToXml(rec.s_cmpy_burd_med_care_insr_fee));
			//rx.add(record, "sumall", StringUtil.replaceToXml(rec.sumall));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INSR_1200_LCURLIST2Record rec = (HD_INSR_1200_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "slf_burd_insr_fee", rec.slf_burd_insr_fee);
			rx.add(record, "cmpy_burd_insr_fee", rec.cmpy_burd_insr_fee);
			rx.add(record, "slf_burd_med_care_insr_fee", rec.slf_burd_med_care_insr_fee);
			rx.add(record, "cmpy_burd_med_care_insr_fee", rec.cmpy_burd_med_care_insr_fee);
			rx.add(record, "sum", rec.sum);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "slf_burd_insr_fee", StringUtil.replaceToXml(rec.slf_burd_insr_fee));
			//rx.add(record, "cmpy_burd_insr_fee", StringUtil.replaceToXml(rec.cmpy_burd_insr_fee));
			//rx.add(record, "slf_burd_med_care_insr_fee", StringUtil.replaceToXml(rec.slf_burd_med_care_insr_fee));
			//rx.add(record, "cmpy_burd_med_care_insr_fee", StringUtil.replaceToXml(rec.cmpy_burd_med_care_insr_fee));
			//rx.add(record, "sum", StringUtil.replaceToXml(rec.sum));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INSR_1200_LCURLIST1Record rec = (HD_INSR_1200_LCURLIST1Record)ds.curlist1.get(i);
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
<hd_insr_1200_l>
	<dataSet>
		<CURLIST4>
			<record>
				<hlth_entr_no/>
				<hlth_insr_entr_dt/>
				<slf_hlth_insr_fee/>
				<self_insr_med_care_insr_fee/>
				<cmpy_hlth_insr_fee/>
				<cmpy_insr_med_care_insr_fee/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_insr_1200_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1200_l>
	<dataSet>
		<CURLIST3>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<s_slf_burd_insr_fee/>
				<s_cmpy_burd_insr_fee/>
				<s_slf_burd_med_care_insr_fee/>
				<s_cmpy_burd_med_care_insr_fee/>
				<sumall/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_insr_1200_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1200_l>
	<dataSet>
		<CURLIST2>
			<record>
				<rnum/>
				<emp_no/>
				<saly_yy/>
				<saly_no/>
				<slf_burd_insr_fee/>
				<cmpy_burd_insr_fee/>
				<slf_burd_med_care_insr_fee/>
				<cmpy_burd_med_care_insr_fee/>
				<sum/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_insr_1200_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1200_l>
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
</hd_insr_1200_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 17:18:53 KST 2009 */ %>