<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_2606_LDataSet ds = (HD_LVCMPY_2606_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet2", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_2606_LCURLISTRecord rec = (HD_LVCMPY_2606_LCURLISTRecord)ds.curlist.get(i);
		//	int record = rx.add(recordSet, "record", "");
			rx.add(recordSet, "emp_no", rec.emp_no);
			rx.add(recordSet, "ernm", rec.ernm);
		    rx.add(recordSet, "ern_no", rec.ern_no );
			rx.add(recordSet, "acct_no", rec.acct_no);
			rx.add(recordSet, "lgl_rcpm_amt", rec.lgl_rcpm_amt);
			rx.add(recordSet, "rcpm_amt", rec.rcpm_amt);
			rx.add(recordSet, "rcpm_dt", rec.rcpm_dt);
			rx.add(recordSet, "mtry_dt", rec.mtry_dt);
			rx.add(recordSet, "irp_amt", rec.irp_amt);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "ernm", StringUtil.replaceToXml(rec.ernm));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "lgl_rcpm_amt", StringUtil.replaceToXml(rec.lgl_rcpm_amt));
			//rx.add(record, "rcpm_amt", StringUtil.replaceToXml(rec.rcpm_amt));
			//rx.add(record, "rcpm_dt", StringUtil.replaceToXml(rec.rcpm_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "irp_amt", StringUtil.replaceToXml(rec.irp_amt));
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
<hd_lvcmpy_2606_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<ernm/>
				<acct_no/>
				<lgl_rcpm_amt/>
				<rcpm_amt/>
				<rcpm_dt/>
				<mtry_dt/>
				<irp_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_2606_l>
*/
%>

<% /* 작성시간 : Tue Mar 12 20:21:58 KST 2013 */ %>