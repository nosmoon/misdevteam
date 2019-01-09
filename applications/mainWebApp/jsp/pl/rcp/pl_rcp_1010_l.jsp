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
* 파일명 : pl_rcp_1010_l.jsp
* 기능 : 
* 작성일자 : 2009-04-15
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
	PL_RCP_1010_LDataSet ds = (PL_RCP_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** RCPM_PTCRLIST BEGIN */
		int RCPM_PTCRLIST = rx.add(dataSet, "RCPM_PTCRLIST", "");
		for(int i = 0; i < ds.rcpm_ptcrlist.size(); i++) {
			PL_RCP_1010_LRCPM_PTCRLISTRecord rec = (PL_RCP_1010_LRCPM_PTCRLISTRecord)ds.rcpm_ptcrlist.get(i);
			int record = rx.add(RCPM_PTCRLIST, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "amt", rec.amt);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dd_clos_yn", rec.dd_clos_yn);
			rx.add(record, "gurt_amt", rec.gurt_amt);
		}
		/****** RCPM_PTCRLIST END */

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
	<RCPM_PTCRLIST>
		<record>
			<rcpm_dt/>
			<dlco_clsf_nm/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<amt/>
			<rcpm_shet_no/>
			<occr_dt/>
			<slip_clsf/>
			<seq/>
			<dd_clos_yn/>
			<gurt_amt/>
		</record>
	</RCPM_PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 15 11:36:37 KST 2009 */ %>