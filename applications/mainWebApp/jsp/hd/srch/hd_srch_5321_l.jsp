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
	HD_SRCH_5321_LDataSet ds = (HD_SRCH_5321_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_5321_LCURLIST1Record rec = (HD_SRCH_5321_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clsf1", rec.clsf1);
			rx.add(record, "clsf2", rec.clsf2);
			rx.add(record, "emp_clsf1", rec.emp_clsf1);
			rx.add(record, "emp_clsf2", rec.emp_clsf2);
			rx.add(record, "emp_clsf3", rec.emp_clsf3);
			rx.add(record, "emp_clsf4", rec.emp_clsf4);
			rx.add(record, "tot_stot", rec.tot_stot);
			//rx.add(record, "clsf1", StringUtil.replaceToXml(rec.clsf1));
			//rx.add(record, "clsf2", StringUtil.replaceToXml(rec.clsf2));
			//rx.add(record, "emp_clsf1", StringUtil.replaceToXml(rec.emp_clsf1));
			//rx.add(record, "emp_clsf2", StringUtil.replaceToXml(rec.emp_clsf2));
			//rx.add(record, "emp_clsf3", StringUtil.replaceToXml(rec.emp_clsf3));
			//rx.add(record, "emp_clsf4", StringUtil.replaceToXml(rec.emp_clsf4));
			//rx.add(record, "tot_stot", StringUtil.replaceToXml(rec.tot_stot));
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
<hd_srch_5321_l>
	<dataSet>
		<CURLIST1>
			<record>
				<clsf1/>
				<clsf2/>
				<emp_clsf1/>
				<emp_clsf2/>
				<emp_clsf3/>
				<emp_clsf4/>
				<tot_stot/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5321_l>
*/
%>

<% /* 작성시간 : Tue Oct 16 17:02:25 KST 2018 */ %>