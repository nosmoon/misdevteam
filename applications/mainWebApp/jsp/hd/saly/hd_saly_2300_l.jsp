<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_2300_LDataSet ds = (HD_SALY_2300_LDataSet)request.getAttribute("ds");
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
			HD_SALY_2300_LCURLISTRecord rec = (HD_SALY_2300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dspch_enpr", rec.dspch_enpr);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "servcost", rec.servcost);
			rx.add(record, "paid_hody_alon", rec.paid_hody_alon);
			rx.add(record, "lvcmpy_pers_alon", rec.lvcmpy_pers_alon);
			rx.add(record, "snk_fee", rec.snk_fee);
			rx.add(record, "pgsw_yybi_sum", rec.pgsw_yybi_sum);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dspch_enpr", StringUtil.replaceToXml(rec.dspch_enpr));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "servcost", StringUtil.replaceToXml(rec.servcost));
			//rx.add(record, "paid_hody_alon", StringUtil.replaceToXml(rec.paid_hody_alon));
			//rx.add(record, "lvcmpy_pers_alon", StringUtil.replaceToXml(rec.lvcmpy_pers_alon));
			//rx.add(record, "snk_fee", StringUtil.replaceToXml(rec.snk_fee));
			//rx.add(record, "pgsw_yybi_sum", StringUtil.replaceToXml(rec.pgsw_yybi_sum));
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
<hd_saly_2300_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dspch_enpr/>
				<in_cmpy_dt/>
				<servcost/>
				<paid_hody_alon/>
				<lvcmpy_pers_alon/>
				<snk_fee/>
				<pgsw_yybi_sum/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_2300_l>
*/
%>

<% /* 작성시간 : Sun Sep 27 16:38:09 KST 2009 */ %>