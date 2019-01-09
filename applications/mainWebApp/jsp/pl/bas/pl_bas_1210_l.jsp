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
* 파일명 : pl_bas_1210_l.jsp
* 기능 : 
* 작성일자 : 2009-03-04
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
	PL_BAS_1210_LDataSet ds = (PL_BAS_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "DLCO_PTCRCUR", "");

	try {
		/****** DLCO_PTCRCUR BEGIN */
		for(int i = 0; i < ds.dlco_ptcrcur.size(); i++) {
			PL_BAS_1210_LDLCO_PTCRCURRecord rec = (PL_BAS_1210_LDLCO_PTCRCURRecord)ds.dlco_ptcrcur.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "comn_mang_no", rec.comn_mang_no);
			rx.add(record, "rptv_flnm", StringUtil.replaceToXml(rec.rptv_flnm));
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			rx.add(record, "area", rec.area);
			rx.add(record, "area_nm", StringUtil.replaceToXml(rec.area_nm));
			rx.add(record, "prv_curr_clsf", rec.prv_curr_clsf);
			rx.add(record, "prv_curr_clsf_nm", rec.prv_curr_clsf_nm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "email", rec.email);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "magz_deal_yn", rec.magz_deal_yn);
			rx.add(record, "sep_book_deal_yn", rec.sep_book_deal_yn);
			rx.add(record, "elec_tax_stmt_yn", rec.elec_tax_stmt_yn);
		}
		rx.add(recordSet, "totalcnt", ds.dlco_ptcrcur.size());
		/****** DLCO_PTCRCUR END */

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
	<DLCO_PTCRCUR>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<comn_mang_no/>
			<rptv_flnm/>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<area/>
			<area_nm/>
			<prv_curr_clsf/>
			<prv_curr_clsf_nm/>
			<tel_no/>
			<ptph_no/>
			<fax_no/>
			<email/>
			<addr/>
			<magz_deal_yn/>
			<sep_book_deal_yn/>
			<elec_tax_stmt_yn/>
		</record>
	</DLCO_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 04 13:37:54 KST 2009 */ %>