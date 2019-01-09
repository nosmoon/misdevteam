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
	MC_BUDG_5011_LDataSet ds = (MC_BUDG_5011_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_5011_LCURLISTRecord rec = (MC_BUDG_5011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "fix_asin_amt", rec.fix_asin_amt);
			rx.add(record, "budg_ask_amt", rec.budg_ask_amt);
			rx.add(record, "budg_cndt_amt", rec.budg_cndt_amt);
			rx.add(record, "fix_ask_amt", rec.fix_ask_amt);
			rx.add(record, "fix_cndt_amt", rec.fix_cndt_amt);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "fix_asin_amt", StringUtil.replaceToXml(rec.fix_asin_amt));
			//rx.add(record, "budg_ask_amt", StringUtil.replaceToXml(rec.budg_ask_amt));
			//rx.add(record, "budg_cndt_amt", StringUtil.replaceToXml(rec.budg_cndt_amt));
			//rx.add(record, "fix_ask_amt", StringUtil.replaceToXml(rec.fix_ask_amt));
			//rx.add(record, "fix_cndt_amt", StringUtil.replaceToXml(rec.fix_cndt_amt));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<mc_budg_5011_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<budg_cdnm/>
				<budg_yymm/>
				<fix_asin_amt/>
				<budg_ask_amt/>
				<budg_cndt_amt/>
				<fix_ask_amt/>
				<fix_cndt_amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5011_l>
*/
%>

<% /* �ۼ��ð� : Tue Apr 14 15:30:56 KST 2009 */ %>