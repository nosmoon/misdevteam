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
	HD_SALY_2100_LDataSet ds = (HD_SALY_2100_LDataSet)request.getAttribute("ds");
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
			HD_SALY_2100_LCURLISTRecord rec = (HD_SALY_2100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "saly_yy", rec.saly_yy);
			rx.add(record, "saly_no", rec.saly_no);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "base_saly", rec.base_saly);
			rx.add(record, "posk_saly", rec.posk_saly);
			rx.add(record, "lvcmpy_alon", rec.lvcmpy_alon);
			rx.add(record, "tot_amt", rec.tot_amt);
			//rx.add(record, "saly_yy", StringUtil.replaceToXml(rec.saly_yy));
			//rx.add(record, "saly_no", StringUtil.replaceToXml(rec.saly_no));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "base_saly", StringUtil.replaceToXml(rec.base_saly));
			//rx.add(record, "posk_saly", StringUtil.replaceToXml(rec.posk_saly));
			//rx.add(record, "lvcmpy_alon", StringUtil.replaceToXml(rec.lvcmpy_alon));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
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
<hd_saly_2100_l>
	<dataSet>
		<CURLIST>
			<record>
				<saly_yy/>
				<saly_no/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<base_saly/>
				<posk_saly/>
				<lvcmpy_alon/>
				<tot_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_2100_l>
*/
%>

<% /* 작성시간 : Fri May 08 14:32:26 KST 2009 */ %>