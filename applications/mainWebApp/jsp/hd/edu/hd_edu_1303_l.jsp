<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.edu.rec.*
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_1303_LDataSet ds = (HD_EDU_1303_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		 
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1303_LCURLISTRecord rec = (HD_EDU_1303_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "edu_clsf", rec.edu_clsf);
			rx.add(record, "lecture_nm", StringUtil.replaceToXml(rec.lecture_nm));
			rx.add(record, "edu_frdt", rec.edu_frdt);
			rx.add(record, "edu_todt", rec.edu_todt);
			rx.add(record, "edu_tm", rec.edu_tm);
			rx.add(record, "edu_cost", rec.edu_cost);
			rx.add(record, "emp_yn", rec.emp_yn);
			rx.add(record, "edu_scor", rec.edu_scor);
			rx.add(record, "complt_yn", rec.complt_yn);
			rx.add(record, "complt_yn_nm", rec.complt_yn_nm);
			rx.add(record, "emp_yn_nm", rec.emp_yn_nm);
			rx.add(record, "edu_dtls_clsf", rec.edu_dtls_clsf);			
			rx.add(record, "edu_dtls_clsf_nm", rec.edu_dtls_clsf_nm);
			rx.add(record, "lang_cd", rec.lang_cd);
			rx.add(record, "lang_nm", rec.lang_nm);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "remk", rec.remk);
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
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<edu_clsf/>
			<lecture_nm/>
			<edu_frdt/>
			<edu_todt/>
			<edu_dds/>
			<edu_tm/>
			<edu_cost/>
			<emp_yn/>
			<edu_scor/>
			<complt_yn/>
			<complt_yn_nm/>
			<emp_yn_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 23 17:17:33 KST 2009 */ %>