<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.dlco.rec.*
	,	chosun.ciis.co.dlco.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_DLCO_1011_LDataSet ds = (CO_DLCO_1011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm = rx.add(root, "resForm", "");

	try { 
	    System.out.println(ds.curlist.size());
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_DLCO_1011_LCURLISTRecord rec = (CO_DLCO_1011_LCURLISTRecord)ds.curlist.get(i);
			
			int record = rx.add(resForm, "gridData", "");
			
			String	acct_stat = "";
			if("2".equals(rec.acct_stat)) 		acct_stat = "N";
			else if("3".equals(rec.acct_stat)) 	acct_stat = "Y";
			
			rx.add(record, "acct_stat", acct_stat);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "dlco_abrv_nm", rec.dlco_abrv_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "setl_bank", rec.setl_bank);
			rx.addCData(record, "setl_bank_nm", rec.setl_bank_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.addCData(record, "rcpm_main_nm", rec.rcpm_main_nm);
			rx.add(record, "lst_use_dt", rec.lst_use_dt);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<sys_clsf_1/>
			<sys_clsf_2/>
			<sys_clsf_3/>
			<sys_clsf_4/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 06 16:46:20 KST 2009 */ %>