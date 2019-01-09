<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1900_LDataSet ds = (HD_VACA_1900_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_VACA_1900_LCURLIST1Record rec = (HD_VACA_1900_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "year_vaca_dds", rec.year_vaca_dds);
			rx.add(record, "add_vaca_dds", rec.add_vaca_dds);
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "duty_vaca_dds", rec.duty_vaca_dds);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
			rx.add(record, "year_saly", rec.year_saly);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			//rx.add(record, "year_vaca_dds", StringUtil.replaceToXml(rec.year_vaca_dds));
			//rx.add(record, "add_vaca_dds", StringUtil.replaceToXml(rec.add_vaca_dds));
			//rx.add(record, "use_vaca_dds", StringUtil.replaceToXml(rec.use_vaca_dds));
			//rx.add(record, "duty_vaca_dds", StringUtil.replaceToXml(rec.duty_vaca_dds));
			//rx.add(record, "rmn_vaca_dds", StringUtil.replaceToXml(rec.rmn_vaca_dds));
			//rx.add(record, "year_saly", StringUtil.replaceToXml(rec.year_saly));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<hd_vaca_1900_l>
	<dataSet>
		<CURLIST1>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_nm/>
				<posi_nm/>
				<in_cmpy_dt/>
				<vaca_dds/>
				<year_vaca_dds/>
				<add_vaca_dds/>
				<use_vaca_dds/>
				<duty_vaca_dds/>
				<rmn_vaca_dds/>
				<year_saly/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_vaca_1900_l>
*/
%>

<% /* 작성시간 : Thu Nov 26 16:56:20 KST 2009 */ %>