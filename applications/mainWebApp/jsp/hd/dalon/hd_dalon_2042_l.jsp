<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_2042_LDataSet ds = (HD_DALON_2042_LDataSet)request.getAttribute("ds");
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
			HD_DALON_2042_LCURLISTRecord rec = (HD_DALON_2042_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "vgl_duty_dt", rec.vgl_duty_dt);
			rx.add(record, "prvdd_prsnt_tm", rec.prvdd_prsnt_tm);
			rx.add(record, "prvdd_finish_tm", rec.prvdd_finish_tm);
			rx.add(record, "thdd_prsnt_tm", rec.thdd_prsnt_tm);
			rx.add(record, "thdd_finish_tm", rec.thdd_finish_tm);
			rx.add(record, "thdd_duty_tm", rec.thdd_duty_tm);
			rx.add(record, "pay_dt", rec.pay_dt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "duty_dt", StringUtil.replaceToXml(rec.duty_dt));
			//rx.add(record, "vgl_duty_dt", StringUtil.replaceToXml(rec.vgl_duty_dt));
			//rx.add(record, "prvdd_prsnt_tm", StringUtil.replaceToXml(rec.prvdd_prsnt_tm));
			//rx.add(record, "prvdd_finish_tm", StringUtil.replaceToXml(rec.prvdd_finish_tm));
			//rx.add(record, "thdd_prsnt_tm", StringUtil.replaceToXml(rec.thdd_prsnt_tm));
			//rx.add(record, "thdd_finish_tm", StringUtil.replaceToXml(rec.thdd_finish_tm));
			//rx.add(record, "thdd_duty_tm", StringUtil.replaceToXml(rec.thdd_duty_tm));
			//rx.add(record, "pay_dt", StringUtil.replaceToXml(rec.pay_dt));
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
<hd_dalon_2042_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<dty_cd/>
				<posi_cd/>
				<duty_dt/>
				<vgl_duty_dt/>
				<prvdd_prsnt_tm/>
				<prvdd_finish_tm/>
				<thdd_prsnt_tm/>
				<thdd_finish_tm/>
				<thdd_duty_tm/>
				<pay_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_dalon_2042_l>
*/
%>

<% /* 작성시간 : Mon Jan 30 10:32:03 KST 2012 */ %>