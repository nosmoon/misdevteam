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
	HD_INSR_1302_LDataSet ds = (HD_INSR_1302_LDataSet)request.getAttribute("ds");
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
			HD_INSR_1302_LCURLIST2Record rec = (HD_INSR_1302_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INSR_1302_LCURLIST1Record rec = (HD_INSR_1302_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
			rx.add(record, "calc1_hlth_fee", rec.calc1_hlth_fee);
			rx.add(record, "calc1_hlth_med_care_insr_fee", rec.calc1_hlth_med_care_insr_fee);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "hlth_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_med_care_insr_fee));
			//rx.add(record, "calc1_hlth_fee", StringUtil.replaceToXml(rec.calc1_hlth_fee));
			//rx.add(record, "calc1_hlth_med_care_insr_fee", StringUtil.replaceToXml(rec.calc1_hlth_med_care_insr_fee));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INSR_1302_LCURLISTRecord rec = (HD_INSR_1302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "hlth_insr_fee", rec.hlth_insr_fee);
			rx.add(record, "hlth_insr_med_care_insr_fee", rec.hlth_insr_med_care_insr_fee);
			rx.add(record, "calc1_hlth_fee", rec.calc1_hlth_fee);
			rx.add(record, "calc1_hlth_med_care_insr_fee", rec.calc1_hlth_med_care_insr_fee);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "hlth_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_fee));
			//rx.add(record, "hlth_insr_med_care_insr_fee", StringUtil.replaceToXml(rec.hlth_insr_med_care_insr_fee));
			//rx.add(record, "calc1_hlth_fee", StringUtil.replaceToXml(rec.calc1_hlth_fee));
			//rx.add(record, "calc1_hlth_med_care_insr_fee", StringUtil.replaceToXml(rec.calc1_hlth_med_care_insr_fee));
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
<hd_insr_1302_l>
	<dataSet>
		<CURLIST2>
			<record>
				<emp_no/>
				<hlth_insr_fee/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_insr_1302_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1302_l>
	<dataSet>
		<CURLIST1>
			<record>
				<emp_no/>
				<hlth_insr_fee/>
				<hlth_insr_med_care_insr_fee/>
				<calc1_hlth_fee/>
				<calc1_hlth_med_care_insr_fee/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_insr_1302_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_insr_1302_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<hlth_insr_fee/>
				<hlth_insr_med_care_insr_fee/>
				<calc1_hlth_fee/>
				<calc1_hlth_med_care_insr_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1302_l>
*/
%>

<% /* 작성시간 : Mon Aug 09 13:42:02 KST 2010 */ %>