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
	HD_EDU_2200_LDataSet ds = (HD_EDU_2200_LDataSet)request.getAttribute("ds");
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
			HD_EDU_2200_LCURLISTRecord rec = (HD_EDU_2200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "check", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "cour_lng_cd", rec.cour_lng_cd);
			rx.add(record, "cour_obj_cd", rec.cour_obj_cd);
			rx.add(record, "cour_tm_cd", rec.cour_tm_cd);
			rx.add(record, "lv_cd", rec.lv_cd);
			rx.add(record, "lv_test_req_cd", rec.lv_test_req_cd);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_cd_nm", StringUtil.replaceToXml(rec.dept_cd_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "cour_lng_cd", StringUtil.replaceToXml(rec.cour_lng_cd));
			//rx.add(record, "cour_obj_cd", StringUtil.replaceToXml(rec.cour_obj_cd));
			//rx.add(record, "cour_tm_cd", StringUtil.replaceToXml(rec.cour_tm_cd));
			//rx.add(record, "lv_cd", StringUtil.replaceToXml(rec.lv_cd));
			//rx.add(record, "lv_test_req_cd", StringUtil.replaceToXml(rec.lv_test_req_cd));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_edu_2200_l>
	<dataSet>
		<CURLIST>
			<record>
				<check/>
				<dept_cd/>
				<dept_cd_nm/>
				<emp_no/>
				<flnm/>
				<cour_lng_cd/>
				<cour_obj_cd/>
				<cour_tm_cd/>
				<lv_cd/>
				<lv_test_req_cd/>
				<tel_no/>
				<proc_stat/>
				<proc_stat_nm/>
				<remk/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_2200_l>
*/
%>

<% /* 작성시간 : Tue Apr 12 14:10:56 KST 2011 */ %>