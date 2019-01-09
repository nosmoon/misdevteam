<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_2301_LDataSet ds = (HD_EDU_2301_LDataSet)request.getAttribute("ds");
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
			HD_EDU_2301_LCURLISTRecord rec = (HD_EDU_2301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "edu_frdt", rec.edu_frdt);
			rx.add(record, "edu_todt", rec.edu_todt);
			rx.add(record, "lecture_nm", StringUtil.replaceToXml(rec.lecture_nm));
			rx.add(record, "complt_yn_nm", rec.complt_yn_nm);
			rx.add(record, "edu_cost", rec.edu_cost);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "lang_aprv_tms_chk", rec.lang_aprv_tms_chk);
			rx.add(record, "edu_clsf", rec.edu_clsf);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "edu_frdt", StringUtil.replaceToXml(rec.edu_frdt));
			//rx.add(record, "edu_todt", StringUtil.replaceToXml(rec.edu_todt));
			//rx.add(record, "lecture_nm", StringUtil.replaceToXml(rec.lecture_nm));
			//rx.add(record, "complt_yn_nm", StringUtil.replaceToXml(rec.complt_yn_nm));
			//rx.add(record, "edu_cost", StringUtil.replaceToXml(rec.edu_cost));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "lang_aprv_tms_chk", StringUtil.replaceToXml(rec.lang_aprv_tms_chk));
			//rx.add(record, "edu_clsf", StringUtil.replaceToXml(rec.edu_clsf));
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
<hd_edu_2301_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<edu_frdt/>
				<edu_todt/>
				<lecture_nm/>
				<complt_yn_nm/>
				<edu_cost/>
				<remk/>
				<lang_aprv_tms_chk/>
				<edu_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_2301_l>
*/
%>

<% /* 작성시간 : Thu Sep 13 16:42:28 KST 2018 */ %>