<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.rcp.rec.*
	,	chosun.ciis.pl.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_rcp_3520_l.jsp
* 기능 : 
* 작성일자 : 2009-04-28
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_RCP_3520_LDataSet ds = (PL_RCP_3520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridTab2", "");

	try {
		/****** PTCRLIST BEGIN */
		int PTCRLIST = rx.add(dataSet, "PTCRLIST", "");
		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_RCP_3520_LPTCRLISTRecord rec = (PL_RCP_3520_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "bef_gurtamt", rec.bef_gurtamt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "altn_amt", rec.altn_amt);
			rx.add(record, "retn_amt", rec.retn_amt);
			rx.add(record, "gurt_amt", "0");
		}
		/****** PTCRLIST END */

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
<dataSet>
	<PTCRLIST>
		<record>
			<rcpm_dt/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<bef_gurtamt/>
			<rcpm_amt/>
			<altn_amt/>
			<retn_amt/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 28 14:05:51 KST 2009 */ %>