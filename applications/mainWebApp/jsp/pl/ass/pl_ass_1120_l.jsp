<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.ass.rec.*
	,	chosun.ciis.pl.ass.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_ass_1120_l.jsp
* 기능 : 
* 작성일자 : 2009-03-17
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
	PL_ASS_1120_LDataSet ds = (PL_ASS_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** ASIN_DTLINFO BEGIN */
		int ASIN_DTLINFO = rx.add(dataSet, "ASIN_DTLINFO", "");
		rx.add(ASIN_DTLINFO, "ref_medi_cd", ds.ref_medi_cd);
		rx.add(ASIN_DTLINFO, "ref_medi_ser_no", ds.ref_medi_ser_no);
		rx.addCData(ASIN_DTLINFO, "ref_medi_nm", ds.ref_medi_nm);
		rx.add(ASIN_DTLINFO, "basi_bgn_yymm", ds.basi_bgn_yymm);
		rx.add(ASIN_DTLINFO, "basi_end_yymm", ds.basi_end_yymm);
		rx.add(ASIN_DTLINFO, "prd", ds.prd);
		rx.add(ASIN_DTLINFO, "remk", ds.remk);
		rx.add(ASIN_DTLINFO, "ewh_qty", ds.ewh_qty);
		rx.add(ASIN_DTLINFO, "deli_qty", ds.deli_qty);
		rx.add(ASIN_DTLINFO, "stok_qty", ds.stok_qty);
		/****** ASIN_DTLINFO END */

		/****** ASIN_PLANCUR BEGIN */
		int ASIN_PLANCUR = rx.add(dataSet, "ASIN_PLANCUR", "");
		for(int i = 0; i < ds.asin_plancur.size(); i++) {
			PL_ASS_1120_LASIN_PLANCURRecord rec = (PL_ASS_1120_LASIN_PLANCURRecord)ds.asin_plancur.get(i);
			int record = rx.add(ASIN_PLANCUR, "record", "");
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "send_plac_seq", rec.send_plac_seq);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "sell_type", rec.sell_type);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "asin_qty", rec.asin_qty);
			rx.add(record, "calc_qty", rec.calc_qty);
			rx.add(record, "avg_sell_qty", rec.avg_sell_qty);
			rx.add(record, "ocpy_rate", rec.ocpy_rate);
			rx.add(record, "tot_deli_qty", rec.tot_deli_qty);
			rx.add(record, "avg_deli_qty", rec.avg_deli_qty);
			rx.add(record, "tot_sell_qty", rec.tot_sell_qty);
			rx.add(record, "tot_rtgqty", rec.tot_rtgqty);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** ASIN_PLANCUR END */

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
	<ASIN_PLANCUR>
		<record>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<send_plac_seq/>
			<send_plac_nm/>
			<sale_clsf/>
			<sendclsf/>
			<wh_cd/>
			<sell_type/>
			<dcrate/>
			<asin_qty/>
			<calc_qty/>
			<avg_sell_qty/>
			<ocpy_rate/>
			<tot_deli_qty/>
			<avg_deli_qty/>
			<tot_sell_qty/>
			<tot_rtgqty/>
			<remk/>
		</record>
	</ASIN_PLANCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 17 11:41:30 KST 2009 */ %>