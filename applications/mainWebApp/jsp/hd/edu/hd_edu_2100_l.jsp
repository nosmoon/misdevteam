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
	HD_EDU_2100_LDataSet ds = (HD_EDU_2100_LDataSet)request.getAttribute("ds");
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
			HD_EDU_2100_LCURLISTRecord rec = (HD_EDU_2100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "send", "");
			rx.add(record, "retu", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "rptv_posi_nm", rec.rptv_posi_nm);
			rx.add(record, "cour_yyyymm", rec.cour_yyyymm);
			rx.add(record, "cour_lng_cd_nm", rec.cour_lng_cd_nm);
			rx.add(record, "cour_obj_cd_nm", rec.cour_obj_cd_nm);
			rx.add(record, "cour_tm_cd_nm", rec.cour_tm_cd_nm);
			rx.add(record, "lv_cd_nm", rec.lv_cd_nm);
			rx.add(record, "lv_test_req_cd_nm", rec.lv_test_req_cd_nm);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "rptv_posi_nm", StringUtil.replaceToXml(rec.rptv_posi_nm));
			//rx.add(record, "cour_yyyymm", StringUtil.replaceToXml(rec.cour_yyyymm));
			//rx.add(record, "cour_lng_cd_nm", StringUtil.replaceToXml(rec.cour_lng_cd_nm));
			//rx.add(record, "cour_obj_cd_nm", StringUtil.replaceToXml(rec.cour_obj_cd_nm));
			//rx.add(record, "cour_tm_cd_nm", StringUtil.replaceToXml(rec.cour_tm_cd_nm));
			//rx.add(record, "lv_cd_nm", StringUtil.replaceToXml(rec.lv_cd_nm));
			//rx.add(record, "lv_test_req_cd_nm", StringUtil.replaceToXml(rec.lv_test_req_cd_nm));
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
<hd_edu_2100_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<flnm/>
				<rptv_posi_nm/>
				<cour_yyyymm/>
				<cour_lng_cd_nm/>
				<cour_obj_cd_nm/>
				<cour_tm_cd_nm/>
				<lv_cd_nm/>
				<lv_test_req_cd_nm/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_2100_l>
*/
%>

<% /* 작성시간 : Mon Apr 11 10:23:25 KST 2011 */ %>