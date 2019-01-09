<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_2001_LDataSet ds = (HD_INFO_2001_LDataSet)request.getAttribute("ds");
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
			HD_INFO_2001_LCURLISTRecord rec = (HD_INFO_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "psgp_cd", rec.psgp_cd);
			rx.add(record, "psgp_nm", StringUtil.replaceToXml(rec.psgp_nm));
			rx.add(record, "intern_desty", rec.intern_desty);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "univ_nm", StringUtil.replaceToXml(rec.univ_nm));
			rx.add(record, "majr_nm", StringUtil.replaceToXml(rec.majr_nm));
			rx.add(record, "univ_enty_yy", rec.univ_enty_yy);
			rx.add(record, "engl_test_nm", StringUtil.replaceToXml(rec.engl_test_nm));
			rx.add(record, "engl_test_scor", rec.engl_test_scor);
			rx.add(record, "hby", StringUtil.replaceToXml(rec.hby));
			rx.add(record, "spc", StringUtil.replaceToXml(rec.spc));
			rx.add(record, "acty_dept", rec.acty_dept);
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "acty_frdt", rec.acty_frdt);
			rx.add(record, "acty_todt", rec.acty_todt);
			rx.add(record, "acty_complt_yn", rec.acty_complt_yn);
			rx.add(record, "carr_matt_1", StringUtil.replaceToXml(rec.carr_matt_1));
			rx.add(record, "carr_matt_1_frdt", rec.carr_matt_1_frdt);
			rx.add(record, "carr_matt_1_todt", rec.carr_matt_1_todt);
			rx.add(record, "carr_matt_1_instt", StringUtil.replaceToXml(rec.carr_matt_1_instt));
			rx.add(record, "carr_matt_2", StringUtil.replaceToXml(rec.carr_matt_2));
			rx.add(record, "carr_matt_2_frdt", rec.carr_matt_2_frdt);
			rx.add(record, "carr_matt_2_todt", rec.carr_matt_2_todt);
			rx.add(record, "carr_matt_2_instt", StringUtil.replaceToXml(rec.carr_matt_2_instt));
			rx.add(record, "carr_matt_3", StringUtil.replaceToXml(rec.carr_matt_3));
			rx.add(record, "carr_matt_3_frdt", rec.carr_matt_3_frdt);
			rx.add(record, "carr_matt_3_todt", rec.carr_matt_3_todt);
			rx.add(record, "carr_matt_3_instt", StringUtil.replaceToXml(rec.carr_matt_3_instt));
			rx.add(record, "blng_dpthd_emp_no", rec.blng_dpthd_emp_no);
			rx.add(record, "blng_dpthd_evlu_idea", StringUtil.replaceToXml(rec.blng_dpthd_evlu_idea));
			rx.add(record, "etc", StringUtil.replaceToXml(rec.etc));
			rx.add(record, "birth", rec.birth);
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<psgp_cd/>
			<intern_desty/>
			<flnm/>
			<prn/>
			<tel_no/>
			<univ_nm/>
			<majr_nm/>
			<univ_enty_yy/>
			<engl_test_nm/>
			<engl_test_scor/>
			<hby/>
			<spc/>
			<acty_dept/>
			<dept_nm/>
			<acty_frdt/>
			<acty_todt/>
			<acty_complt_yn/>
			<carr_matt_1/>
			<carr_matt_1_frdt/>
			<carr_matt_1_todt/>
			<carr_matt_1_instt/>
			<carr_matt_2/>
			<carr_matt_2_frdt/>
			<carr_matt_2_todt/>
			<carr_matt_2_instt/>
			<carr_matt_3/>
			<carr_matt_3_frdt/>
			<carr_matt_3_todt/>
			<carr_matt_3_instt/>
			<blng_dpthd_emp_no/>
			<blng_dpthd_evlu_idea/>
			<etc/>
			<birth/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 28 14:56:14 KST 2009 */ %>