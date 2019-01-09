<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_bas_1410_l.jsp
* 기능 : 
* 작성일자 : 2009-03-05
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
	PL_BAS_1410_LDataSet ds = (PL_BAS_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "DLCOBASEBALCUR", "");

	try {
		/****** DLCOBASEBALCUR BEGIN */
		for(int i = 0; i < ds.dlcobasebalcur.size(); i++) {
			PL_BAS_1410_LDLCOBASEBALCURRecord rec = (PL_BAS_1410_LDLCOBASEBALCURRecord)ds.dlcobasebalcur.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "comn_mang_no", rec.comn_mang_no);
			rx.add(record, "rptv_flnm", rec.rptv_flnm);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "prv_curr_clsf_nm", StringUtil.replaceToXml(rec.prv_curr_clsf_nm));
			rx.add(record, "magz_deal_yn", rec.magz_deal_yn);
			rx.add(record, "sep_book_deal_yn", rec.sep_book_deal_yn);
			rx.add(record, "magz_setup_amt", rec.magz_setup_amt);
			rx.add(record, "sep_book_setup_amt", rec.sep_book_setup_amt);
		}
		/****** DLCOBASEBALCUR END */

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
	<DLCOBASEBALCUR>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<comn_mang_no/>
			<rptv_flnm/>
			<dlco_clsf_nm/>
			<area_nm/>
			<prv_curr_clsf_nm/>
			<magz_deal_yn/>
			<sep_book_deal_yn/>
			<magz_setup_amt/>
			<sep_book_setup_amt/>
		</record>
	</DLCOBASEBALCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 19:55:11 KST 2009 */ %>