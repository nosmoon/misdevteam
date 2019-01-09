<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.sal.rec.*
	,	chosun.ciis.pl.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_sal_1420_l.jsp
* 기능 : 
* 작성일자 : 2009-04-03
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
	PL_SAL_1420_LDataSet ds = (PL_SAL_1420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** ORDR_HEADER BEGIN */
		int ORDR_HEADER = rx.add(dataSet, "ORDR_HEADER", "");
		rx.add(ORDR_HEADER, "medi_clsf", ds.medi_clsf);
		rx.add(ORDR_HEADER, "basi_dt", ds.basi_dt);
		rx.add(ORDR_HEADER, "dlco_cd", ds.dlco_cd);
		rx.add(ORDR_HEADER, "dlco_seq", ds.dlco_seq);
		rx.add(ORDR_HEADER, "dlco_nm", StringUtil.replaceToXml(ds.dlco_nm));
		rx.add(ORDR_HEADER, "send_plac_seq", ds.send_plac_seq);
		rx.add(ORDR_HEADER, "send_plac_nm", StringUtil.replaceToXml(ds.send_plac_nm));
		rx.add(ORDR_HEADER, "send_plac_tel_no_1", ds.send_plac_tel_no_1);
		rx.add(ORDR_HEADER, "send_plac_tel_no_2", ds.send_plac_tel_no_2);
		rx.add(ORDR_HEADER, "send_plac_tel_no_3", ds.send_plac_tel_no_3);
		rx.add(ORDR_HEADER, "send_plac_ptph_no_1", ds.send_plac_ptph_no_1);
		rx.add(ORDR_HEADER, "send_plac_ptph_no_2", ds.send_plac_ptph_no_2);
		rx.add(ORDR_HEADER, "send_plac_ptph_no_3", ds.send_plac_ptph_no_3);
		rx.add(ORDR_HEADER, "send_plac_fax_no_1", ds.send_plac_fax_no_1);
		rx.add(ORDR_HEADER, "send_plac_fax_no_2", ds.send_plac_fax_no_2);
		rx.add(ORDR_HEADER, "send_plac_fax_no_3", ds.send_plac_fax_no_3);
		rx.add(ORDR_HEADER, "send_plac_zip_1", ds.send_plac_zip_1);
		rx.add(ORDR_HEADER, "send_plac_zip_2", ds.send_plac_zip_2);
		rx.add(ORDR_HEADER, "send_plac_addr", StringUtil.replaceToXml(ds.send_plac_addr));
		rx.add(ORDR_HEADER, "send_plac_dtls_addr", StringUtil.replaceToXml(ds.send_plac_dtls_addr));
		rx.add(ORDR_HEADER, "remk", StringUtil.replaceToXml(ds.remk));
		rx.add(ORDR_HEADER, "ordr_dt", ds.ordr_dt);
		rx.add(ORDR_HEADER, "ordr_grp_seq", ds.ordr_grp_seq);
		rx.add(ORDR_HEADER, "deal_dt", ds.deal_dt);
		rx.add(ORDR_HEADER, "deal_grp_seq", ds.deal_grp_seq);
		/****** ORDR_HEADER END */

		/****** ORDR_PTCRCUR BEGIN */
		int ORDR_PTCRCUR = rx.add(dataSet, "ORDR_PTCRCUR", "");
		for(int i = 0; i < ds.ordr_ptcrcur.size(); i++) {
			PL_SAL_1420_LORDR_PTCRCURRecord rec = (PL_SAL_1420_LORDR_PTCRCURRecord)ds.ordr_ptcrcur.get(i);
			int record = rx.add(ORDR_PTCRCUR, "record", "");
			rx.add(record, "ordr_dt", rec.ordr_dt);
			rx.add(record, "ordr_grp_seq", rec.ordr_grp_seq);
			rx.add(record, "ordr_seq", rec.ordr_seq);
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "stok_qty", rec.stok_qty);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "sell_type", rec.sell_type);
			rx.add(record, "absence_clsf", "");
		}
		/****** ORDR_PTCRCUR END */

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
	<ORDR_HEADER>
		<medi_clsf/>
		<basi_dt/>
		<dlco_cd/>
		<dlco_seq/>
		<dlco_nm/>
		<send_plac_seq/>
		<send_plac_nm/>
		<send_plac_tel_no_1/>
		<send_plac_tel_no_2/>
		<send_plac_tel_no_3/>
		<send_plac_ptph_no_1/>
		<send_plac_ptph_no_2/>
		<send_plac_ptph_no_3/>
		<send_plac_fax_no_1/>
		<send_plac_fax_no_2/>
		<send_plac_fax_no_3/>
		<send_plac_zip_1/>
		<send_plac_zip_2/>
		<send_plac_addr/>
		<send_plac_dtls_addr/>
		<remk/>
		<ordr_dt/>
		<ordr_grp_seq/>
		<deal_dt/>
		<deal_grp_seq/>
	</ORDR_HEADER>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<ORDR_PTCRCUR>
		<record>
			<ordr_dt/>
			<ordr_grp_seq/>
			<ordr_seq/>
			<deal_dt/>
			<deal_grp_seq/>
			<deal_seq/>
			<medi_clsf/>
			<medi_cd/>
			<medi_ser_no/>
			<medi_nm/>
			<stok_qty/>
			<deal_qty/>
			<deal_uprc/>
			<dcrate/>
			<deal_amt/>
			<sale_clsf/>
			<sendclsf/>
			<wh_cd/>
			<sell_type/>
		</record>
	</ORDR_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 18:08:00 KST 2009 */ %>