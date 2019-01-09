<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_1042_LDataSet ds = (MC_COST_1042_LDataSet)request.getAttribute("ds");
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
			MC_COST_1042_LCURLISTRecord rec = (MC_COST_1042_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dept_cdnm", rec.dept_cdnm);
			rx.add(record, "emp_nm", rec.emp_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "emp_clsf_nm", rec.emp_clsf_nm);
			rx.add(record, "emp_cost_dstb_cd", rec.emp_cost_dstb_cd);
			rx.add(record, "emp_dstb_clsf", rec.emp_dstb_clsf);
			rx.add(record, "qunt", rec.qunt);
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dept_cdnm", StringUtil.replaceToXml(rec.dept_cdnm));
			//rx.add(record, "emp_nm", StringUtil.replaceToXml(rec.emp_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "emp_clsf_nm", StringUtil.replaceToXml(rec.emp_clsf_nm));
			//rx.add(record, "emp_cost_dstb_cd", StringUtil.replaceToXml(rec.emp_cost_dstb_cd));
			//rx.add(record, "emp_dstb_clsf", StringUtil.replaceToXml(rec.emp_dstb_clsf));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
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
<mc_cost_1042_l>
	<dataSet>
		<CURLIST>
			<record>
				<offi_nm/>
				<dept_nm/>
				<dept_cdnm/>
				<emp_nm/>
				<emp_no/>
				<emp_clsf_nm/>
				<emp_cost_dstb_cd/>
				<emp_dstb_clsf/>
				<qunt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1042_l>
*/
%>

<% /* 작성시간 : Wed Apr 29 21:19:46 KST 2009 */ %>