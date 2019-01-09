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
	HD_LVCMPY_1004_LDataSet ds = (HD_LVCMPY_1004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_LVCMPY_1004_LCURLIST3Record rec = (HD_LVCMPY_1004_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_LVCMPY_1004_LCURLIST2Record rec = (HD_LVCMPY_1004_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_1004_LCURLISTRecord rec = (HD_LVCMPY_1004_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "saly_pay_mm", rec.saly_pay_mm);
			rx.add(record, "sum_saly1", rec.sum_saly1);
			rx.add(record, "sum_alon1", rec.sum_alon1);
			rx.add(record, "dty_acty_fee1", rec.dty_acty_fee1);
			rx.add(record, "sum_saly2", rec.sum_saly2);
			rx.add(record, "sum_alon2", rec.sum_alon2);
			rx.add(record, "dty_acty_fee2", rec.dty_acty_fee2);
			rx.add(record, "saly_fr_dt", "");
			rx.add(record, "saly_to_dt", "");
			rx.add(record, "saly_cnt", "");
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "saly_pay_mm", StringUtil.replaceToXml(rec.saly_pay_mm));
			//rx.add(record, "sum_saly1", StringUtil.replaceToXml(rec.sum_saly1));
			//rx.add(record, "sum_alon1", StringUtil.replaceToXml(rec.sum_alon1));
			//rx.add(record, "sum_saly2", StringUtil.replaceToXml(rec.sum_saly2));
			//rx.add(record, "sum_alon2", StringUtil.replaceToXml(rec.sum_alon2));
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
<hd_lvcmpy_1004_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cnt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_lvcmpy_1004_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_lvcmpy_1004_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<saly_pay_mm/>
				<sum_saly1/>
				<sum_alon1/>
				<sum_saly2/>
				<sum_alon2/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_1004_l>
*/
%>

<% /* 작성시간 : Mon Aug 03 11:21:33 KST 2009 */ %>