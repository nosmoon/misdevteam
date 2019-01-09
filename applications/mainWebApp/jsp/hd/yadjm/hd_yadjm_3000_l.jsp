<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_3000_LDataSet ds = (HD_YADJM_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	System.out.println("---------------------------------------------------");
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_3000_LCURLISTRecord rec = (HD_YADJM_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "emp_clsf", StringUtil.replaceToXml(rec.emp_clsf));
			rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "nm_korn", rec.nm_korn);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dty_cd", rec.dty_cd);
			//rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "posi_cd", rec.posi_cd);
			//rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "emp_clsf", rec.emp_clsf);
			//rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			//rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			//rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			//rx.add(record, "prn", rec.prn);
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
<hd_yadjm_3000_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<emp_clsf/>
				<emp_clsf_nm/>
				<in_cmpy_dt/>
				<lvcmpy_dt/>
				<prn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_3000_l>
*/
%>

<% /* 작성시간 : Wed Aug 19 17:12:35 KST 2009 */ %>