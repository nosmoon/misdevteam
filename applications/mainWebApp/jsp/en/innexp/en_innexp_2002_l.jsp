<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.innexp.rec.*
	,	chosun.ciis.en.innexp.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_INNEXP_2002_LDataSet ds = (EN_INNEXP_2002_LDataSet)request.getAttribute("ds");
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
			EN_INNEXP_2002_LCURLISTRecord rec = (EN_INNEXP_2002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "budg_amt", rec.budg_amt);
			rx.add(record, "stlm_amt", rec.stlm_amt);
			rx.add(record, "bal_amt", rec.bal_amt);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "budg_amt", StringUtil.replaceToXml(rec.budg_amt));
			//rx.add(record, "stlm_amt", StringUtil.replaceToXml(rec.stlm_amt));
			//rx.add(record, "bal_amt", StringUtil.replaceToXml(rec.bal_amt));
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
<en_innexp_2002_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<budg_nm/>
				<budg_amt/>
				<stlm_amt/>
				<bal_amt/>
			</record>
		</CURLIST>
	</dataSet>
</en_innexp_2002_l>
*/
%>

<% /* 작성시간 : Wed Apr 29 18:05:10 KST 2009 */ %>