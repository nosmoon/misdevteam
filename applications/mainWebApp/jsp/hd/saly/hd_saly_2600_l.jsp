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
	HD_SALY_2600_LDataSet ds = (HD_SALY_2600_LDataSet)request.getAttribute("ds");
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
			HD_SALY_2600_LCURLISTRecord rec = (HD_SALY_2600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "non_tax_yn_jrnst", rec.non_tax_yn_jrnst);
			rx.add(record, "non_tax_yn_frnc", rec.non_tax_yn_frnc);
			rx.add(record, "simp_tax_rate", rec.simp_tax_rate);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "non_tax_yn_jrnst", StringUtil.replaceToXml(rec.non_tax_yn_jrnst));
			//rx.add(record, "non_tax_yn_frnc", StringUtil.replaceToXml(rec.non_tax_yn_frnc));
			//rx.add(record, "simp_tax_rate", StringUtil.replaceToXml(rec.simp_tax_rate));
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
<hd_saly_2600_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<non_tax_yn_jrnst/>
				<non_tax_yn_frnc/>
				<simp_tax_rate/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_2600_l>
*/
%>

<% /* 작성시간 : Thu Jul 02 15:26:20 KST 2015 */ %>