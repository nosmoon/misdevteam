<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_1102_LDataSet ds = (HD_INSR_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INSR_1102_LCURLIST2Record rec = (HD_INSR_1102_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INSR_1102_LCURLIST1Record rec = (HD_INSR_1102_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "cmpy_burd_amt", rec.cmpy_burd_amt);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "np_cmpy_burd_amt", rec.np_cmpy_burd_amt);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "cmpy_burd_amt", StringUtil.replaceToXml(rec.cmpy_burd_amt));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "np_cmpy_burd_amt", StringUtil.replaceToXml(rec.np_cmpy_burd_amt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INSR_1102_LCURLISTRecord rec = (HD_INSR_1102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "cmpy_burd_amt", rec.cmpy_burd_amt);
			rx.add(record, "np_slf_ctrb_amt", rec.np_slf_ctrb_amt);
			rx.add(record, "np_cmpy_burd_amt", rec.np_cmpy_burd_amt);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "cmpy_burd_amt", StringUtil.replaceToXml(rec.cmpy_burd_amt));
			//rx.add(record, "np_slf_ctrb_amt", StringUtil.replaceToXml(rec.np_slf_ctrb_amt));
			//rx.add(record, "np_cmpy_burd_amt", StringUtil.replaceToXml(rec.np_cmpy_burd_amt));
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
<hd_insr_1102_l>
	<dataSet>
		<CURLIST2>
			<record>
				<emp_no/>
				<np_slf_ctrb_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_insr_1102_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1102_l>
	<dataSet>
		<CURLIST1>
			<record>
				<emp_no/>
				<slf_burd_amt/>
				<cmpy_burd_amt/>
				<np_slf_ctrb_amt/>
				<np_cmpy_burd_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_insr_1102_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1102_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<slf_burd_amt/>
				<cmpy_burd_amt/>
				<np_slf_ctrb_amt/>
				<np_cmpy_burd_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1102_l>
*/
%>

<% /* 작성시간 : Thu Aug 05 15:57:25 KST 2010 */ %>