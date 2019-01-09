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
	MC_BUDG_4083_LDataSet ds = (MC_BUDG_4083_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_4083_LCURLISTRecord rec = (MC_BUDG_4083_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "work_no", rec.work_no);
			rx.add(record, "evnt_proc_clsf_nm", rec.evnt_proc_clsf_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "befamt", rec.befamt);
			rx.add(record, "addamt", rec.addamt);
			rx.add(record, "sumamt", rec.sumamt);
			//rx.add(record, "work_no", StringUtil.replaceToXml(rec.work_no));
			//rx.add(record, "evnt_proc_clsf_nm", StringUtil.replaceToXml(rec.evnt_proc_clsf_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "befamt", StringUtil.replaceToXml(rec.befamt));
			//rx.add(record, "addamt", StringUtil.replaceToXml(rec.addamt));
			//rx.add(record, "sumamt", StringUtil.replaceToXml(rec.sumamt));
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
<mc_budg_4083_l>
	<dataSet>
		<CURLIST>
			<record>
				<work_no/>
				<evnt_proc_clsf_nm/>
				<budg_cd/>
				<budg_cdnm/>
				<befamt/>
				<addamt/>
				<sumamt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_4083_l>
*/
%>

<% /* 작성시간 : Mon May 18 14:24:01 KST 2009 */ %>