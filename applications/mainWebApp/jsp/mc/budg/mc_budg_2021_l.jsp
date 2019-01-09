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
	MC_BUDG_2021_LDataSet ds = (MC_BUDG_2021_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2021_LCURLISTRecord rec = (MC_BUDG_2021_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "bsynm", rec.bsynm);
			rx.add(record, "form_dept_cd", rec.form_dept_cd);
			rx.add(record, "mt1", rec.mt1);
			rx.add(record, "mt2", rec.mt2);
			rx.add(record, "mt3", rec.mt3);
			rx.add(record, "mt4", rec.mt4);
			rx.add(record, "mt5", rec.mt5);
			rx.add(record, "mt6", rec.mt6);
			rx.add(record, "mt7", rec.mt7);
			rx.add(record, "mt8", rec.mt8);
			rx.add(record, "mt9", rec.mt9);
			rx.add(record, "mt10", rec.mt10);
			rx.add(record, "mt11", rec.mt11);
			rx.add(record, "mt12", rec.mt12);
			rx.add(record, "dtls_clsf_cd", "");
			rx.add(record, "ini_plan_qunt", "");
            rx.add(record, "rmks", "");
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "bsynm", StringUtil.replaceToXml(rec.bsynm));
			//rx.add(record, "form_dept_cd", StringUtil.replaceToXml(rec.form_dept_cd));
			//rx.add(record, "mt1", StringUtil.replaceToXml(rec.mt1));
			//rx.add(record, "mt2", StringUtil.replaceToXml(rec.mt2));
			//rx.add(record, "mt3", StringUtil.replaceToXml(rec.mt3));
			//rx.add(record, "mt4", StringUtil.replaceToXml(rec.mt4));
			//rx.add(record, "mt5", StringUtil.replaceToXml(rec.mt5));
			//rx.add(record, "mt6", StringUtil.replaceToXml(rec.mt6));
			//rx.add(record, "mt7", StringUtil.replaceToXml(rec.mt7));
			//rx.add(record, "mt8", StringUtil.replaceToXml(rec.mt8));
			//rx.add(record, "mt9", StringUtil.replaceToXml(rec.mt9));
			//rx.add(record, "mt10", StringUtil.replaceToXml(rec.mt10));
			//rx.add(record, "mt11", StringUtil.replaceToXml(rec.mt11));
			//rx.add(record, "mt12", StringUtil.replaceToXml(rec.mt12));
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
<mc_budg_2021_l>
	<dataSet>
		<CURLIST>
			<record>
				<yymm/>
				<dept_cd/>
				<bsynm/>
				<form_dept_cd/>
				<mt1/>
				<mt2/>
				<mt3/>
				<mt4/>
				<mt5/>
				<mt6/>
				<mt7/>
				<mt8/>
				<mt9/>
				<mt10/>
				<mt11/>
				<mt12/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2021_l>
*/
%>

<% /* 작성시간 : Wed May 20 19:26:20 KST 2009 */ %>