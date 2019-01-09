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
	HD_SRCH_2000_LDataSet ds = (HD_SRCH_2000_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_2000_LCURLISTRecord rec = (HD_SRCH_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			rx.add(record, "temp_yn", StringUtil.replaceToXml(rec.temp_yn));
			rx.add(record, "stdy_yn", StringUtil.replaceToXml(rec.stdy_yn));
		//	rx.add(record, "dspch_clsf", rec.dspch_clsf);
			rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			rx.add(record, "home_zip", StringUtil.replaceToXml(rec.home_zip));
			rx.add(record, "home_addr", StringUtil.replaceToXml(rec.home_addr));
			rx.add(record, "home_dtls_addr", StringUtil.replaceToXml(rec.home_dtls_addr));
			rx.add(record, "email_id", rec.email_id);
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "emp_no", rec.emp_no);
			//rx.add(record, "nm_korn", rec.nm_korn);
			//rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			//rx.add(record, "temp_yn", rec.temp_yn);
			//rx.add(record, "stdy_yn", rec.stdy_yn);
			//rx.add(record, "prn", rec.prn);
			//rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			//rx.add(record, "home_zip", rec.home_zip);
			//rx.add(record, "home_addr", rec.home_addr);
			//rx.add(record, "home_dtls_addr", rec.home_dtls_addr);
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
<hd_srch_2000_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd_nm/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<posi_nm/>
				<in_cmpy_dt/>
				<temp_yn/>
				<stdy_yn/>
				<prn/>
				<lvcmpy_dt/>
				<home_zip/>
				<home_addr/>
				<home_dtls_addr/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_2000_l>
*/
%>

<% /* 작성시간 : Thu Oct 01 18:15:20 KST 2009 */ %>