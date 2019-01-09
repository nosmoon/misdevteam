<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1050_LDataSet ds = (TN_RPT_1050_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1050_LCURLISTRecord rec = (TN_RPT_1050_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", ""); 
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "acct_cdnm", rec.acct_cdnm);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "acct_clsf", rec.acct_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "bank_name", rec.bank_name);
			rx.add(record, "today_amt", rec.today_amt);
			rx.add(record, "in_amt", rec.in_amt);
			rx.add(record, "out_amt", rec.out_amt);
			rx.add(record, "yes_amt", rec.yes_amt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "acct_num", StringUtil.replaceToXml(rec.acct_num));
			//rx.add(record, "acct_clsf", StringUtil.replaceToXml(rec.acct_clsf));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "tran_date", StringUtil.replaceToXml(rec.tran_date));
			//rx.add(record, "bank_id", StringUtil.replaceToXml(rec.bank_id));
			//rx.add(record, "bank_name", StringUtil.replaceToXml(rec.bank_name));
			//rx.add(record, "today_amt", StringUtil.replaceToXml(rec.today_amt));
			//rx.add(record, "in_amt", StringUtil.replaceToXml(rec.in_amt));
			//rx.add(record, "out_amt", StringUtil.replaceToXml(rec.out_amt));
			//rx.add(record, "yes_amt", StringUtil.replaceToXml(rec.yes_amt));
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
<tn_rpt_1050_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<cdnm/>
				<acct_num/>
				<acct_clsf/>
				<remk/>
				<tran_date/>
				<bank_id/>
				<bank_name/>
				<today_amt/>
				<in_amt/>
				<out_amt/>
				<yes_amt/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1050_l>
*/
%>

<% /* 작성시간 : Sun Aug 28 16:38:12 KST 2016 */ %>