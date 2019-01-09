<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5704_LDataSet ds = (HD_EVLU_5704_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5704_LCURLISTRecord rec = (HD_EVLU_5704_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "up_insd_dept_cd", rec.up_insd_dept_cd);
			rx.add(record, "up_insd_dept_nm", StringUtil.replaceToXml(rec.up_insd_dept_nm));
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
			rx.add(record, "up_emp_no1", rec.up_emp_no1);
			rx.add(record, "up_nm_korn1", rec.up_nm_korn1);
			rx.add(record, "up_emp_no2", rec.up_emp_no2);
			rx.add(record, "up_nm_korn2", rec.up_nm_korn2);
			rx.add(record, "obj_excl_clsf", rec.obj_excl_clsf);
			rx.add(record, "posk_clas_cd", rec.posk_clas_cd);
			rx.add(record, "posk_clas_cd_nm", rec.posk_clas_cd_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "bet_in_cmpy_dt", rec.bet_in_cmpy_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "up_insd_dept_cd", StringUtil.replaceToXml(rec.up_insd_dept_cd));
			//rx.add(record, "up_insd_dept_nm", StringUtil.replaceToXml(rec.up_insd_dept_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "evlu_grp_cd", StringUtil.replaceToXml(rec.evlu_grp_cd));
			//rx.add(record, "up_emp_no1", StringUtil.replaceToXml(rec.up_emp_no1));
			//rx.add(record, "up_nm_korn1", StringUtil.replaceToXml(rec.up_nm_korn1));
			//rx.add(record, "up_emp_no2", StringUtil.replaceToXml(rec.up_emp_no2));
			//rx.add(record, "up_nm_korn2", StringUtil.replaceToXml(rec.up_nm_korn2));
			//rx.add(record, "obj_excl_clsf", StringUtil.replaceToXml(rec.obj_excl_clsf));
			//rx.add(record, "posk_clas_cd", StringUtil.replaceToXml(rec.posk_clas_cd));
			//rx.add(record, "posk_clas_cd_nm", StringUtil.replaceToXml(rec.posk_clas_cd_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "bet_in_cmpy_dt", StringUtil.replaceToXml(rec.bet_in_cmpy_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
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
<hd_evlu_5704_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<emp_no/>
				<nm_korn/>
				<up_insd_dept_cd/>
				<up_insd_dept_nm/>
				<dept_cd/>
				<abrv_nm/>
				<evlu_grp_cd/>
				<up_emp_no1/>
				<up_nm_korn1/>
				<up_emp_no2/>
				<up_nm_korn2/>
				<obj_excl_clsf/>
				<posk_clas_cd/>
				<posk_clas_cd_nm/>
				<in_cmpy_dt/>
				<bet_in_cmpy_dt/>
				<mtry_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5704_l>
*/
%>

<% /* 작성시간 : Mon Jun 08 12:48:42 KST 2009 */ %>