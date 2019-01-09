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
* 파일명 : pl_sal_1010_l.jsp
* 기능 : 
* 작성일자 : 2009-03-18
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
	PL_SAL_1010_LDataSet ds = (PL_SAL_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** DELI_DTLINFO BEGIN */
		int DELI_DTLINFO = rx.add(dataSet, "DELI_DTLINFO", "");
		rx.add(DELI_DTLINFO, "basi_yymm", ds.basi_yymm);
		rx.add(DELI_DTLINFO, "basi_dt", ds.basi_dt);
		rx.add(DELI_DTLINFO, "ewh_qty", ds.ewh_qty);
		rx.add(DELI_DTLINFO, "deli_qty", ds.deli_qty);
		rx.add(DELI_DTLINFO, "stok_qty", ds.stok_qty);
		/****** DELI_DTLINFO END */

		/****** DELI_PTCRCUR BEGIN */
		int DELI_PTCRCUR = rx.add(dataSet, "DELI_PTCRCUR", "");
		for(int i = 0; i < ds.deli_ptcrcur.size(); i++) {
			PL_SAL_1010_LDELI_PTCRCURRecord rec = (PL_SAL_1010_LDELI_PTCRCURRecord)ds.deli_ptcrcur.get(i);
			int record = rx.add(DELI_PTCRCUR, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "dlco_abrv_nm", StringUtil.replaceToXml(rec.dlco_abrv_nm));
			rx.add(record, "send_plac_seq", rec.send_plac_seq);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_clsf_nm", StringUtil.replaceToXml(rec.dlco_clsf_nm));
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "sale_clsf_nm", StringUtil.replaceToXml(rec.sale_clsf_nm));
			rx.add(record, "sendclsf", rec.sendclsf);
			rx.add(record, "sendclsf_nm", StringUtil.replaceToXml(rec.sendclsf_nm));
			rx.add(record, "sell_type", rec.sell_type);
			rx.add(record, "sell_type_nm", StringUtil.replaceToXml(rec.sell_type_nm));
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "wh_cd_nm", StringUtil.replaceToXml(rec.wh_cd_nm));
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** DELI_PTCRCUR END */

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
	<DELI_PTCRCUR>
		<record>
			<medi_cd/>
			<medi_ser_no/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<dlco_abrv_nm/>
			<send_plac_seq/>
			<send_plac_nm/>
			<dlco_clsf/>
			<dlco_clsf_nm/>
			<sale_clsf/>
			<sale_clsf_nm/>
			<sendclsf/>
			<sendclsf_nm/>
			<sell_type/>
			<sell_type_nm/>
			<wh_cd/>
			<wh_cd_nm/>
			<deal_uprc/>
			<dcrate/>
			<deal_qty/>
			<deal_amt/>
			<deal_dt/>
			<deal_grp_seq/>
			<deal_seq/>
			<remk/>
		</record>
	</DELI_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 18 20:02:37 KST 2009 */ %>