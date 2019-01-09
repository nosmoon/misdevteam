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
	MC_BUDG_4052_LDataSet ds = (MC_BUDG_4052_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4052_LCURLISTRecord rec = (MC_BUDG_4052_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "amt_s", rec.amt_s);
			rx.add(record, "work_dt", rec.work_dt);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "yramt", rec.yramt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "hsty_no", rec.hsty_no);
			rx.add(record, "sub_no", rec.sub_no);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			//rx.add(record, "amt_s", StringUtil.replaceToXml(rec.amt_s));
			//rx.add(record, "work_dt", StringUtil.replaceToXml(rec.work_dt));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "yramt", StringUtil.replaceToXml(rec.yramt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "hsty_no", StringUtil.replaceToXml(rec.hsty_no));
			//rx.add(record, "sub_no", StringUtil.replaceToXml(rec.sub_no));
			//rx.add(record, "fix_asin_amt", StringUtil.replaceToXml(rec.fix_asin_amt));
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
<mc_budg_4052_l>
	<dataSet>
		<CURLIST>
			<record>
				<amt_s/>
				<work_dt/>
				<budg_cd/>
				<budg_nm/>
				<rmks/>
				<yramt/>
				<amt/>
				<hsty_no/>
				<sub_no/>
				<fix_asin_amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4052_l>
*/
%>

<% /* 작성시간 : Tue Jun 02 10:54:36 KST 2009 */ %>