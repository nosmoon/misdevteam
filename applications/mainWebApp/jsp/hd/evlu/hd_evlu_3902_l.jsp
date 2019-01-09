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
	HD_EVLU_3902_LDataSet ds = (HD_EVLU_3902_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_3902_LCURLISTRecord rec = (HD_EVLU_3902_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf_name", rec.tms_clsf_name);
			rx.add(record, "evlu_pers1", rec.evlu_pers1);
			rx.add(record, "evlu_pers2", rec.evlu_pers2);
			rx.add(record, "evlu_pers_deci_grad_last", rec.evlu_pers_deci_grad_last);
			rx.add(record, "evlu_grp_name", rec.evlu_grp_name);
			rx.add(record, "evlu_frdt", rec.evlu_frdt);
			rx.add(record, "evlu_todt", rec.evlu_todt);
			rx.add(record, "noti_dt", rec.noti_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf_name", StringUtil.replaceToXml(rec.tms_clsf_name));
			//rx.add(record, "evlu_pers1", StringUtil.replaceToXml(rec.evlu_pers1));
			//rx.add(record, "evlu_pers2", StringUtil.replaceToXml(rec.evlu_pers2));
			//rx.add(record, "evlu_pers_deci_grad_last", StringUtil.replaceToXml(rec.evlu_pers_deci_grad_last));
			//rx.add(record, "evlu_grp_name", StringUtil.replaceToXml(rec.evlu_grp_name));
			//rx.add(record, "evlu_frdt", StringUtil.replaceToXml(rec.evlu_frdt));
			//rx.add(record, "evlu_todt", StringUtil.replaceToXml(rec.evlu_todt));
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
<hd_evlu_3902_l>
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
				<in_cmpy_dt/>
				<evlu_yy/>
				<tms_clsf_name/>
				<evlu_pers1/>
				<evlu_pers2/>
				<evlu_pers_deci_grad_last/>
				<evlu_grp_name/>
				<evlu_frdt/>
				<evlu_todt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_3902_l>
*/
%>

<% /* 작성시간 : Mon Jul 22 14:03:40 KST 2013 */ %>