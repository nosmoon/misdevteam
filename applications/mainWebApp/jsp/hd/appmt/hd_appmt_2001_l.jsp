<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.appmt.rec.*
	,	chosun.ciis.hd.appmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_APPMT_2001_LDataSet ds = (HD_APPMT_2001_LDataSet)request.getAttribute("ds");
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
			HD_APPMT_2001_LCURLISTRecord rec = (HD_APPMT_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "saly_stot", rec.saly_stot);
			rx.add(record, "yy_base_saly", rec.yy_base_saly);
			rx.add(record, "yy_posk_saly", rec.yy_posk_saly);
			rx.add(record, "yy_saly_stot", rec.yy_saly_stot);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "appmt_dt", StringUtil.replaceToXml(rec.appmt_dt));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "saly_stot", StringUtil.replaceToXml(rec.saly_stot));
			//rx.add(record, "yy_base_saly", StringUtil.replaceToXml(rec.yy_base_saly));
			//rx.add(record, "yy_posk_saly", StringUtil.replaceToXml(rec.yy_posk_saly));
			//rx.add(record, "yy_saly_stot", StringUtil.replaceToXml(rec.yy_saly_stot));
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
<hd_appmt_2001_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<flnm/>
				<dept_nm/>
				<posi_nm/>
				<in_cmpy_dt/>
				<appmt_dt/>
				<base_saly/>
				<posk_saly/>
				<saly_stot/>
				<yy_base_saly/>
				<yy_posk_saly/>
				<yy_saly_stot/>
			</record>
		</CURLIST>
	</dataSet>
</hd_appmt_2001_l>
*/
%>

<% /* 작성시간 : Mon Jun 01 17:05:17 KST 2009 */ %>