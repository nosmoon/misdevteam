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
	HD_AFFR_4400_LDataSet ds = (HD_AFFR_4400_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	int rowcnt = 1;
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_4400_LCURLIST1Record rec = (HD_AFFR_4400_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowcnt", rowcnt);
			rx.add(record, "category_clsf", rec.category_clsf);
			rx.add(record, "emp_no_cnt", rec.emp_no_cnt);
			rx.add(record, "category_clsf_cnt", rec.category_clsf_cnt);
			rx.add(record, "use_amt_sum", rec.use_amt_sum);
			rx.add(record, "rate", "");
			rowcnt++;
			//rx.add(record, "category_cls", StringUtil.replaceToXml(rec.category_cls));
			//rx.add(record, "emp_no_cnt", StringUtil.replaceToXml(rec.emp_no_cnt));
			//rx.add(record, "category_clsf_cnt", StringUtil.replaceToXml(rec.category_clsf_cnt));
			//rx.add(record, "use_amt_sum", StringUtil.replaceToXml(rec.use_amt_sum));
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
<hd_affr_4400_l>
	<dataSet>
		<CURLIST1>
			<record>
				<category_cls/>
				<emp_no_cnt/>
				<category_clsf_cnt/>
				<use_amt_sum/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_affr_4400_l>
*/
%>

<% /* 작성시간 : Wed Jun 10 11:03:04 KST 2009 */ %>