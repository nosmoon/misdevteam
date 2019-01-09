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
	HD_EVLU_5901_LDataSet ds = (HD_EVLU_5901_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5901_LCURLISTRecord rec = (HD_EVLU_5901_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			rx.add(record, "tgt_evlu_pers_emp_no", rec.tgt_evlu_pers_emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "tgt_evlu_pers_dept_cd", rec.tgt_evlu_pers_dept_cd);
			rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "evlu_proc_stat_tms", rec.evlu_proc_stat_tms);
			rx.add(record, "evlu_proc_stat_nm", rec.evlu_proc_stat_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "tgt_evlu_pers_emp_no", StringUtil.replaceToXml(rec.tgt_evlu_pers_emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "tgt_evlu_pers_dept_cd", StringUtil.replaceToXml(rec.tgt_evlu_pers_dept_cd));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "evlu_proc_stat_tms", StringUtil.replaceToXml(rec.evlu_proc_stat_tms));
			//rx.add(record, "evlu_proc_stat_nm", StringUtil.replaceToXml(rec.evlu_proc_stat_nm));
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
<hd_evlu_5901_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<evlu_yy/>
				<tms_clsf/>
				<tgt_evlu_pers_emp_no/>
				<nm_korn/>
				<tgt_evlu_pers_dept_cd/>
				<abrv_nm/>
				<evlu_proc_stat_tms/>
				<evlu_proc_stat_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5901_l>
*/
%>

<% /* 작성시간 : Mon Jun 08 21:28:16 KST 2009 */ %>