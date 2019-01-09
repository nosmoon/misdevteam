<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_3000_LDataSet ds = (HD_APPMT_3000_LDataSet)request.getAttribute("ds");
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
			HD_APPMT_3000_LCURLISTRecord rec = (HD_APPMT_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "gender", rec.gender);
			rx.add(record, "posk_clas_nm", rec.posk_clas_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "su_dt", rec.su_dt);
			rx.add(record, "fst_dt", rec.fst_dt);
			rx.add(record, "sec_dt", rec.sec_dt);
			rx.add(record, "dspch_enpr_main_nm", rec.dspch_enpr_main_nm);
			rx.add(record, "mang_liab_pers_flnm", rec.mang_liab_pers_flnm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "team_nm", StringUtil.replaceToXml(rec.team_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "gender", StringUtil.replaceToXml(rec.gender));
			//rx.add(record, "posk_clas_nm", StringUtil.replaceToXml(rec.posk_clas_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "su_dt", StringUtil.replaceToXml(rec.su_dt));
			//rx.add(record, "fst_dt", StringUtil.replaceToXml(rec.fst_dt));
			//rx.add(record, "sec_dt", StringUtil.replaceToXml(rec.sec_dt));
			//rx.add(record, "dspch_enpr_main_nm", StringUtil.replaceToXml(rec.dspch_enpr_main_nm));
			//rx.add(record, "mang_liab_pers_flnm", StringUtil.replaceToXml(rec.mang_liab_pers_flnm));
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
<hd_appmt_3000_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<team_nm/>
				<emp_no/>
				<nm_korn/>
				<gender/>
				<posk_clas_nm/>
				<in_cmpy_dt/>
				<su_dt/>
				<fst_dt/>
				<sec_dt/>
				<dspch_enpr_main_nm/>
				<mang_liab_pers_flnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_appmt_3000_l>
*/
%>

<% /* 작성시간 : Wed Jun 03 16:01:01 KST 2009 */ %>