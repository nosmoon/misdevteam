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
	HD_EVLU_2457_LDataSet ds = (HD_EVLU_2457_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_2457_LCURLISTRecord rec = (HD_EVLU_2457_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
			rx.add(record, "grp_nm", rec.grp_nm);
			rx.add(record, "evlu_pers_emp_no_1tms", rec.evlu_pers_emp_no_1tms);
			rx.add(record, "nm_korn_1tms", rec.nm_korn_1tms);
			rx.add(record, "evlu_pers_emp_no_2tms", rec.evlu_pers_emp_no_2tms);
			rx.add(record, "nm_korn_2tms", rec.nm_korn_2tms);
			rx.add(record, "asst_evlu_pers_emp_no", rec.asst_evlu_pers_emp_no);
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "evlu_grp_cd", StringUtil.replaceToXml(rec.evlu_grp_cd));
			//rx.add(record, "grp_nm", StringUtil.replaceToXml(rec.grp_nm));
			//rx.add(record, "evlu_pers_emp_no_1tms", StringUtil.replaceToXml(rec.evlu_pers_emp_no_1tms));
			//rx.add(record, "nm_korn_1tms", StringUtil.replaceToXml(rec.nm_korn_1tms));
			//rx.add(record, "evlu_pers_emp_no_2tms", StringUtil.replaceToXml(rec.evlu_pers_emp_no_2tms));
			//rx.add(record, "nm_korn_2tms", StringUtil.replaceToXml(rec.nm_korn_2tms));
			//rx.add(record, "asst_evlu_pers_emp_no", StringUtil.replaceToXml(rec.asst_evlu_pers_emp_no));
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
<hd_evlu_2457_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_yy/>
				<tms_clsf/>
				<emp_no/>
				<flnm/>
				<evlu_grp_cd/>
				<grp_nm/>
				<evlu_pers_emp_no_1tms/>
				<nm_korn_1tms/>
				<evlu_pers_emp_no_2tms/>
				<nm_korn_2tms/>
				<asst_evlu_pers_emp_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_2457_l>
*/
%>

<% /* 작성시간 : Fri Nov 10 15:03:52 KST 2017 */ %>