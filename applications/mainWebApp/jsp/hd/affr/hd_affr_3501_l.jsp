<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_3501_LDataSet ds = (HD_AFFR_3501_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_3501_LCURLISTRecord rec = (HD_AFFR_3501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sch_yyyy", rec.sch_yyyy);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "affr_type_nm", rec.affr_type_nm);
			rx.add(record, "affr_amt", rec.affr_amt);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			//rx.add(record, "sch_yyyy", StringUtil.replaceToXml(rec.sch_yyyy));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "affr_type_nm", StringUtil.replaceToXml(rec.affr_type_nm));
			//rx.add(record, "affr_amt", StringUtil.replaceToXml(rec.affr_amt));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
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
<hd_affr_3501_l>
	<dataSet>
		<CURLIST>
			<record>
				<sch_yyyy/>
				<flnm/>
				<emp_no/>
				<affr_type_nm/>
				<affr_amt/>
				<offi_nm/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3501_l>
*/
%>

<% /* 작성시간 : Mon Nov 02 17:52:01 KST 2009 */ %>