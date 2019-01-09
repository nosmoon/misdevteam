<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1030_LDataSet ds = (HD_SRCH_1030_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1030_LCURLISTRecord rec = (HD_SRCH_1030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "gender", rec.gender);
			rx.addCData(record, "cur_job", rec.cur_job);
			rx.addCData(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_dtls_clsf_nm", rec.emp_dtls_clsf_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.addCData(record, "email_id", StringUtil.replaceToXml(rec.email_id));
			rx.addCData(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			rx.addCData(record, "home_zip", StringUtil.replaceToXml(rec.home_zip));
			rx.addCData(record, "home_addr", StringUtil.replaceToXml(rec.home_addr));
			rx.addCData(record, "home_dtls_addr", StringUtil.replaceToXml(rec.home_dtls_addr));
			rx.addCData(record, "cmpy_zip", StringUtil.replaceToXml(rec.cmpy_zip));
			rx.addCData(record, "cmpy_addr", StringUtil.replaceToXml(rec.cmpy_addr));
			rx.addCData(record, "cmpy_dtls_addr", StringUtil.replaceToXml(rec.cmpy_dtls_addr));
			rx.addCData(record, "fore_home_zip", StringUtil.replaceToXml(rec.fore_home_zip));
			rx.addCData(record, "fore_home_addr", StringUtil.replaceToXml(rec.fore_home_addr));
			rx.addCData(record, "fore_home_dtls_addr", StringUtil.replaceToXml(rec.fore_home_dtls_addr));
			rx.addCData(record, "fore_cmpy_zip", StringUtil.replaceToXml(rec.fore_cmpy_zip));
			rx.addCData(record, "fore_cmpy_addr", StringUtil.replaceToXml(rec.fore_cmpy_addr));
			rx.addCData(record, "fore_cmpy_dtls_addr", StringUtil.replaceToXml(rec.fore_cmpy_dtls_addr));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "gender", StringUtil.replaceToXml(rec.gender));
			//rx.add(record, "cur_job", StringUtil.replaceToXml(rec.cur_job));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "email_id", StringUtil.replaceToXml(rec.email_id));
			//rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			//rx.add(record, "home_zip", StringUtil.replaceToXml(rec.home_zip));
			//rx.add(record, "home_addr", StringUtil.replaceToXml(rec.home_addr));
			//rx.add(record, "home_dtls_addr", StringUtil.replaceToXml(rec.home_dtls_addr));
			//rx.add(record, "cmpy_zip", StringUtil.replaceToXml(rec.cmpy_zip));
			//rx.add(record, "cmpy_addr", StringUtil.replaceToXml(rec.cmpy_addr));
			//rx.add(record, "cmpy_dtls_addr", StringUtil.replaceToXml(rec.cmpy_dtls_addr));
			//rx.add(record, "fore_home_zip", StringUtil.replaceToXml(rec.fore_home_zip));
			//rx.add(record, "fore_home_addr", StringUtil.replaceToXml(rec.fore_home_addr));
			//rx.add(record, "fore_home_dtls_addr", StringUtil.replaceToXml(rec.fore_home_dtls_addr));
			//rx.add(record, "fore_cmpy_zip", StringUtil.replaceToXml(rec.fore_cmpy_zip));
			//rx.add(record, "fore_cmpy_addr", StringUtil.replaceToXml(rec.fore_cmpy_addr));
			//rx.add(record, "fore_cmpy_dtls_addr", StringUtil.replaceToXml(rec.fore_cmpy_dtls_addr));
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
<hd_srch_1030_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<cd_nm/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<gender/>
				<cur_job/>
				<emp_clsf_nm/>
				<emp_dtls_clsf_nm/>
				<in_cmpy_dt/>
				<email_id/>
				<ptph_no/>
				<home_zip/>
				<home_addr/>
				<home_dtls_addr/>
				<cmpy_zip/>
				<cmpy_addr/>
				<cmpy_dtls_addr/>
				<fore_home_zip/>
				<fore_home_addr/>
				<fore_home_dtls_addr/>
				<fore_cmpy_zip/>
				<fore_cmpy_addr/>
				<fore_cmpy_dtls_addr/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1030_l>
*/
%>

<% /* 작성시간 : Fri Nov 27 19:49:35 KST 2009 */ %>