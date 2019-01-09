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
	HD_SRCH_5333_LDataSet ds = (HD_SRCH_5333_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");


	rx.add(dataSet, "text_tag", ds.tag1 );
	
	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_SRCH_5333_LCURLIST2Record rec = (HD_SRCH_5333_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clas_clsf1_02", rec.clas_clsf1_02);
			rx.add(record, "clas_clsf2_02", rec.clas_clsf2_02);
			rx.add(record, "pre_emp_cnt_02", rec.pre_emp_cnt_02);
			rx.add(record, "pre_servcost_02", rec.pre_servcost_02);
			rx.add(record, "emp_cnt_02", rec.emp_cnt_02);
			rx.add(record, "servcost_02", rec.servcost_02);
			rx.addCData(record, "remk_02", rec.remk_02);
			//rx.add(record, "clas_clsf1_02", StringUtil.replaceToXml(rec.clas_clsf1_02));
			//rx.add(record, "clas_clsf2_02", StringUtil.replaceToXml(rec.clas_clsf2_02));
			//rx.add(record, "pre_emp_cnt_02", StringUtil.replaceToXml(rec.pre_emp_cnt_02));
			//rx.add(record, "pre_servcost_02", StringUtil.replaceToXml(rec.pre_servcost_02));
			//rx.add(record, "emp_cnt_02", StringUtil.replaceToXml(rec.emp_cnt_02));
			//rx.add(record, "servcost_02", StringUtil.replaceToXml(rec.servcost_02));
			//rx.add(record, "remk_02", StringUtil.replaceToXml(rec.remk_02));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_SRCH_5333_LCURLIST1Record rec = (HD_SRCH_5333_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clas_clsf1_01", rec.clas_clsf1_01);
			rx.add(record, "clas_clsf2_01", rec.clas_clsf2_01);
			rx.add(record, "pre_emp_cnt_01", rec.pre_emp_cnt_01);
			rx.add(record, "pre_servcost_01", rec.pre_servcost_01);
			rx.add(record, "emp_cnt_01", rec.emp_cnt_01);
			rx.add(record, "servcost_01", rec.servcost_01);
			rx.add(record, "icdc_amt_01", rec.icdc_amt_01);
			//rx.add(record, "clas_clsf1_01", StringUtil.replaceToXml(rec.clas_clsf1_01));
			//rx.add(record, "clas_clsf2_01", StringUtil.replaceToXml(rec.clas_clsf2_01));
			//rx.add(record, "pre_emp_cnt_01", StringUtil.replaceToXml(rec.pre_emp_cnt_01));
			//rx.add(record, "pre_servcost_01", StringUtil.replaceToXml(rec.pre_servcost_01));
			//rx.add(record, "emp_cnt_01", StringUtil.replaceToXml(rec.emp_cnt_01));
			//rx.add(record, "servcost_01", StringUtil.replaceToXml(rec.servcost_01));
			//rx.add(record, "icdc_amt_01", StringUtil.replaceToXml(rec.icdc_amt_01));
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
<hd_srch_5333_l>
	<dataSet>
		<CURLIST2>
			<record>
				<clas_clsf1_02/>
				<clas_clsf2_02/>
				<pre_emp_cnt_02/>
				<pre_servcost_02/>
				<emp_cnt_02/>
				<servcost_02/>
				<remk_02/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_srch_5333_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_srch_5333_l>
	<dataSet>
		<CURLIST1>
			<record>
				<clas_clsf1_01/>
				<clas_clsf2_01/>
				<pre_emp_cnt_01/>
				<pre_servcost_01/>
				<emp_cnt_01/>
				<servcost_01/>
				<icdc_amt_01/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_srch_5333_l>
*/
%>

<% /* 작성시간 : Mon Nov 26 15:01:54 KST 2018 */ %>