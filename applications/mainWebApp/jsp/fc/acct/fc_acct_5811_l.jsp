<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_5811_LDataSet ds = (FC_ACCT_5811_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_5811_LCURLISTRecord rec = (FC_ACCT_5811_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "supr_acct_cd", rec.supr_acct_cd);
			rx.addCData(record, "insd_acct_nm", rec.insd_acct_nm);
			rx.addCData(record, "acctcdacct_abrvnm", rec.acctcdacct_abrvnm);
			rx.add(record, "acct_levl", rec.acct_levl);
			rx.add(record, "etc", rec.etc);
			rx.add(record, "medi_190", rec.medi_190);
			rx.add(record, "medi_210", rec.medi_210);
			rx.add(record, "medi_220", rec.medi_220);
			rx.add(record, "medi_230", rec.medi_230);
			rx.add(record, "medi_270", rec.medi_270);
			rx.add(record, "medi_320", rec.medi_320);
			rx.add(record, "medi_424", rec.medi_424);
			rx.add(record, "medi_426", rec.medi_426);
			rx.add(record, "medi_610", rec.medi_610);
			rx.add(record, "medi_620", rec.medi_620);
			rx.add(record, "medi_625", rec.medi_625);
			rx.add(record, "medi_630", rec.medi_630);
			rx.add(record, "medi_635", rec.medi_635);
			rx.add(record, "medi_640", rec.medi_640);
			rx.add(record, "medi_645", rec.medi_645);
			rx.add(record, "medi_646", rec.medi_646);
			rx.add(record, "medi_650", rec.medi_650);
			rx.add(record, "medi_655", rec.medi_655);
			rx.add(record, "medi_660", rec.medi_660);
			rx.add(record, "medi_665", rec.medi_665);
			rx.add(record, "medi_671", rec.medi_671);
			rx.add(record, "medi_680", rec.medi_680);
			rx.add(record, "medi_685", rec.medi_685);
			rx.add(record, "medi_700", rec.medi_700);
			rx.add(record, "medi_701", rec.medi_701);
			rx.add(record, "medi_702", rec.medi_702);
			rx.add(record, "medi_703", rec.medi_703);
			rx.add(record, "medi_704", rec.medi_704);
			rx.add(record, "medi_705", rec.medi_705);
			//rx.add(record, "supr_acct_cd", StringUtil.replaceToXml(rec.supr_acct_cd));
			//rx.add(record, "insd_acct_nm", StringUtil.replaceToXml(rec.insd_acct_nm));
			//rx.add(record, "acctcdacct_abrvnm", StringUtil.replaceToXml(rec.acctcdacct_abrvnm));
			//rx.add(record, "acct_levl", StringUtil.replaceToXml(rec.acct_levl));
			//rx.add(record, "etc", StringUtil.replaceToXml(rec.etc));
			//rx.add(record, "medi_190", StringUtil.replaceToXml(rec.medi_190));
			//rx.add(record, "medi_210", StringUtil.replaceToXml(rec.medi_210));
			//rx.add(record, "medi_220", StringUtil.replaceToXml(rec.medi_220));
			//rx.add(record, "medi_230", StringUtil.replaceToXml(rec.medi_230));
			//rx.add(record, "medi_270", StringUtil.replaceToXml(rec.medi_270));
			//rx.add(record, "medi_320", StringUtil.replaceToXml(rec.medi_320));
			//rx.add(record, "medi_424", StringUtil.replaceToXml(rec.medi_424));
			//rx.add(record, "medi_426", StringUtil.replaceToXml(rec.medi_426));
			//rx.add(record, "medi_610", StringUtil.replaceToXml(rec.medi_610));
			//rx.add(record, "medi_620", StringUtil.replaceToXml(rec.medi_620));
			//rx.add(record, "medi_625", StringUtil.replaceToXml(rec.medi_625));
			//rx.add(record, "medi_630", StringUtil.replaceToXml(rec.medi_630));
			//rx.add(record, "medi_635", StringUtil.replaceToXml(rec.medi_635));
			//rx.add(record, "medi_640", StringUtil.replaceToXml(rec.medi_640));
			//rx.add(record, "medi_645", StringUtil.replaceToXml(rec.medi_645));
			//rx.add(record, "medi_646", StringUtil.replaceToXml(rec.medi_646));
			//rx.add(record, "medi_650", StringUtil.replaceToXml(rec.medi_650));
			//rx.add(record, "medi_655", StringUtil.replaceToXml(rec.medi_655));
			//rx.add(record, "medi_660", StringUtil.replaceToXml(rec.medi_660));
			//rx.add(record, "medi_665", StringUtil.replaceToXml(rec.medi_665));
			//rx.add(record, "medi_680", StringUtil.replaceToXml(rec.medi_680));
			//rx.add(record, "medi_685", StringUtil.replaceToXml(rec.medi_685));
			//rx.add(record, "medi_700", StringUtil.replaceToXml(rec.medi_700));
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
<fc_acct_5811_l>
	<dataSet>
		<CURLIST>
			<record>
				<supr_acct_cd/>
				<insd_acct_nm/>
				<acctcdacct_abrvnm/>
				<acct_levl/>
				<etc/>
				<medi_190/>
				<medi_210/>
				<medi_220/>
				<medi_230/>
				<medi_270/>
				<medi_320/>
				<medi_424/>
				<medi_426/>
				<medi_610/>
				<medi_620/>
				<medi_625/>
				<medi_630/>
				<medi_635/>
				<medi_640/>
				<medi_645/>
				<medi_646/>
				<medi_650/>
				<medi_655/>
				<medi_660/>
				<medi_665/>
				<medi_680/>
				<medi_685/>
				<medi_700/>
				<medi_701/>
				<medi_702/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_5811_l>
*/
%>

<% /* 작성시간 : Thu Oct 01 18:21:47 KST 2015 */ %>