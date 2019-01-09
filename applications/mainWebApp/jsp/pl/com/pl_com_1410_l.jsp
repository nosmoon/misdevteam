<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.com.rec.*
	,	chosun.ciis.pl.com.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_com_1410_l.jsp
* 기능 : 
* 작성일자 : 2009-03-26
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
	PL_COM_1410_LDataSet ds = (PL_COM_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "DLCOINFOLIST", "");

	try {
		/****** DLCOINFOLIST BEGIN */
		for(int i = 0; i < ds.dlcoinfolist.size(); i++) {
			PL_COM_1410_LDLCOINFOLISTRecord rec = (PL_COM_1410_LDLCOINFOLISTRecord)ds.dlcoinfolist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "send_plac_seq", rec.send_plac_seq);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "comn_mang_no", rec.comn_mang_no);
			rx.add(record, "rptv_flnm", StringUtil.replaceToXml(rec.rptv_flnm));
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", rec.dlco_clsf_nm);
			rx.add(record, "area", rec.area);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "prv_curr_clsf", rec.prv_curr_clsf);
			rx.add(record, "prv_curr_clsf_nm", rec.prv_curr_clsf_nm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "fax_no", rec.fax_no);
			rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			rx.add(record, "magz_deal_yn", rec.magz_deal_yn);
			rx.add(record, "sep_book_deal_yn", rec.sep_book_deal_yn);
		}
		/****** DLCOINFOLIST END */

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
	<DLCOINFOLIST>
		<record>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<send_plac_seq/>
			<send_plac_nm/>
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
		</record>
	</DLCOINFOLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 26 16:25:38 KST 2009 */ %>