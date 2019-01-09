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
	HD_SRCH_1010_LDataSet ds = (HD_SRCH_1010_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1010_LCURLISTRecord rec = (HD_SRCH_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "gender", StringUtil.replaceToXml(rec.gender));
			rx.add(record, "cur_job", StringUtil.replaceToXml(rec.cur_job));
			rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			rx.add(record, "emp_dtls_clsf_nm", StringUtil.replaceToXml(rec.emp_dtls_clsf_nm));
			rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			rx.add(record, "nm_engl", StringUtil.replaceToXml(rec.nm_engl));
			rx.add(record, "nm_chin", StringUtil.replaceToXml(rec.nm_chin));
			rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			rx.add(record, "evngt_saly", StringUtil.replaceToXml(rec.evngt_saly));
			rx.add(record, "supl_saly", StringUtil.replaceToXml(rec.supl_saly));
			rx.add(record, "trff_alon", StringUtil.replaceToXml(rec.trff_alon));
			rx.add(record, "treat_add_amt", StringUtil.replaceToXml(rec.treat_add_amt));
			rx.add(record, "tot_saly", StringUtil.replaceToXml(rec.tot_saly));
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			rx.add(record, "appmt_nm", StringUtil.replaceToXml(rec.appmt_nm));
			rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
			rx.add(record, "appmt_cont", StringUtil.replaceToXml(rec.appmt_cont));
			
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
<hd_srch_1010_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<cd_nm/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<gender/>
				<cur_job/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<emp_clsf_nm/>
				<emp_dtls_clsf_nm/>
				<in_cmpy_dt/>
				<nm_engl/>
				<nm_chin/>
				<base_saly/>
				<posk_saly/>
				<evngt_saly/>
				<supl_saly/>
				<trff_alon/>
				<treat_add_amt/>
				<tot_saly/>
				<prn/>
				<appmt_nm/>
				<appmt_dt/>
				<appmt_cont/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1010_l>
*/
%>

<% /* 작성시간 : Tue Nov 24 17:03:51 KST 2009 */ %>