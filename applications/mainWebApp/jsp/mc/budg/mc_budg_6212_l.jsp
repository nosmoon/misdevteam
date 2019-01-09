<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6212_LDataSet ds = (MC_BUDG_6212_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6212_LCURLISTRecord rec = (MC_BUDG_6212_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_clas_cd", rec.budg_clas_cd);
			rx.add(record, "budg_clas_cd_nm", rec.budg_clas_cd_nm);
			rx.add(record, "groupings", rec.groupings);
			rx.add(record, "mm_amt_1", rec.mm_amt_1);
			rx.add(record, "mm_amt_2", rec.mm_amt_2);
			rx.add(record, "mm_amt_3", rec.mm_amt_3);
			rx.add(record, "mm_amt_4", rec.mm_amt_4);
			rx.add(record, "mm_amt_5", rec.mm_amt_5);
			rx.add(record, "mm_amt_6", rec.mm_amt_6);
			rx.add(record, "mm_amt_7", rec.mm_amt_7);
			rx.add(record, "mm_amt_8", rec.mm_amt_8);
			rx.add(record, "mm_amt_9", rec.mm_amt_9);
			rx.add(record, "mm_amt_10", rec.mm_amt_10);
			rx.add(record, "mm_amt_11", rec.mm_amt_11);
			rx.add(record, "mm_amt_12", rec.mm_amt_12);
			rx.add(record, "amount_sum", rec.amount_sum);
			rx.add(record, "prvyy_rslt_amt", rec.prvyy_rslt_amt);
			//rx.add(record, "budg_clas_cd", StringUtil.replaceToXml(rec.budg_clas_cd));
			//rx.add(record, "budg_clas_cd_nm", StringUtil.replaceToXml(rec.budg_clas_cd_nm));
			//rx.add(record, "groupings", StringUtil.replaceToXml(rec.groupings));
			//rx.add(record, "mm_amt_1", StringUtil.replaceToXml(rec.mm_amt_1));
			//rx.add(record, "mm_amt_2", StringUtil.replaceToXml(rec.mm_amt_2));
			//rx.add(record, "mm_amt_3", StringUtil.replaceToXml(rec.mm_amt_3));
			//rx.add(record, "mm_amt_4", StringUtil.replaceToXml(rec.mm_amt_4));
			//rx.add(record, "mm_amt_5", StringUtil.replaceToXml(rec.mm_amt_5));
			//rx.add(record, "mm_amt_6", StringUtil.replaceToXml(rec.mm_amt_6));
			//rx.add(record, "mm_amt_7", StringUtil.replaceToXml(rec.mm_amt_7));
			//rx.add(record, "mm_amt_8", StringUtil.replaceToXml(rec.mm_amt_8));
			//rx.add(record, "mm_amt_9", StringUtil.replaceToXml(rec.mm_amt_9));
			//rx.add(record, "mm_amt_10", StringUtil.replaceToXml(rec.mm_amt_10));
			//rx.add(record, "mm_amt_11", StringUtil.replaceToXml(rec.mm_amt_11));
			//rx.add(record, "mm_amt_12", StringUtil.replaceToXml(rec.mm_amt_12));
			//rx.add(record, "amount_sum", StringUtil.replaceToXml(rec.amount_sum));
			//rx.add(record, "prvyy_rslt_amt", StringUtil.replaceToXml(rec.prvyy_rslt_amt));
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
<mc_budg_6212_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_clas_cd/>
				<budg_clas_cd_nm/>
				<groupings/>
				<mm_amt_1/>
				<mm_amt_2/>
				<mm_amt_3/>
				<mm_amt_4/>
				<mm_amt_5/>
				<mm_amt_6/>
				<mm_amt_7/>
				<mm_amt_8/>
				<mm_amt_9/>
				<mm_amt_10/>
				<mm_amt_11/>
				<mm_amt_12/>
				<amount_sum/>
				<prvyy_rslt_amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6212_l>
*/
%>

<% /* 작성시간 : Mon May 25 16:40:12 KST 2009 */ %>