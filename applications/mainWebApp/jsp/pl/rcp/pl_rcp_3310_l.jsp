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
* 파일명 : pl_rcp_3310_l.jsp
* 기능 : 
* 작성일자 : 2009-04-27
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
	PL_RCP_3310_LDataSet ds = (PL_RCP_3310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** PTCRLIST BEGIN */
		int PTCRLIST = rx.add(dataSet, "PTCRLIST", "");
		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_RCP_3310_LPTCRLISTRecord rec = (PL_RCP_3310_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "colt_clsf_nm", StringUtil.replaceToXml(rec.colt_clsf_nm));
			rx.add(record, "setup_stat_nm", StringUtil.replaceToXml(rec.setup_stat_nm));
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "colt_obj_nm", StringUtil.replaceToXml(rec.colt_obj_nm));
			rx.add(record, "prty_rank", rec.prty_rank);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "colt_setup_amt", rec.colt_setup_amt);
			rx.add(record, "plcw", rec.plcw);
			rx.add(record, "gurt_strt_dd", rec.gurt_strt_dd);
			rx.add(record, "gurt_end_dd", rec.gurt_end_dd);
			rx.add(record, "insr_stock_no", rec.insr_stock_no);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
			<colt_clsf_nm/>
			<setup_stat_nm/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<colt_obj_nm/>
			<prty_rank/>
			<acqr_dt/>
			<colt_setup_amt/>
			<plcw/>
			<gurt_strt_dd/>
			<gurt_end_dd/>
			<insr_stock_no/>
			<remk/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */ %>