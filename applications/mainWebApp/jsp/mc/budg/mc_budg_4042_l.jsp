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
	MC_BUDG_4042_LDataSet ds = (MC_BUDG_4042_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4042_LCURLISTRecord rec = (MC_BUDG_4042_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "work_no", rec.work_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "dtsqty", rec.dtsqty);
			rx.add(record, "dtdan", rec.dtdan);
			rx.add(record, "dtamt", rec.dtamt);
			rx.add(record, "rmks", rec.rmks);
			rx.add(record, "crte_clsf", rec.crte_clsf);
			rx.add(record, "work_dt", rec.work_dt);
			rx.add(record, "hsty_no", rec.hsty_no);
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
			//rx.add(record, "budg_yymm", StringUtil.replaceToXml(rec.budg_yymm));
			//rx.add(record, "dtsqty", StringUtil.replaceToXml(rec.dtsqty));
			//rx.add(record, "dtdan", StringUtil.replaceToXml(rec.dtdan));
			//rx.add(record, "dtamt", StringUtil.replaceToXml(rec.dtamt));
			//rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
			//rx.add(record, "crte_clsf", StringUtil.replaceToXml(rec.crte_clsf));
			//rx.add(record, "work_dt", StringUtil.replaceToXml(rec.work_dt));
			//rx.add(record, "hsty_no", StringUtil.replaceToXml(rec.hsty_no));
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
<mc_budg_4042_l>
	<dataSet>
		<CURLIST>
			<record>
				<work_no/>
				<medi_cd/>
				<use_dept_cd/>
				<budg_yymm/>
				<dtsqty/>
				<dtdan/>
				<dtamt/>
				<rmks/>
				<crte_clsf/>
				<work_dt/>
				<hsty_no/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4042_l>
*/
%>

<% /* 작성시간 : Fri Apr 17 14:51:07 KST 2009 */ %>