<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_3000_LDataSet ds = (MT_ETCCAR_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "datagrid", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCCAR_3000_LCURLIST1Record rec = (MT_ETCCAR_3000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "repa_dt", rec.repa_dt);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "repa_gag", rec.repa_gag);
			rx.add(record, "repa_clsf", rec.repa_clsf);
			rx.add(record, "repa_cont", rec.repa_cont);
			rx.add(record, "oil_qunt", rec.oil_qunt);
			rx.add(record, "repa_dtls_ptcr", rec.repa_dtls_ptcr);
			rx.add(record, "incmg_pers_ipaddr", rec.incmg_pers_ipaddr);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "drvr_nm", rec.drvr_nm);
			rx.add(record, "cmpy_mang_nm", rec.cmpy_mang_nm);
			rx.add(record, "car_modl", rec.car_modl);
			//rx.add(record, "car_no", StringUtil.replaceToXml(rec.car_no));
			//rx.add(record, "repa_dt", StringUtil.replaceToXml(rec.repa_dt));
			//rx.add(record, "repa_gag", StringUtil.replaceToXml(rec.repa_gag));
			//rx.add(record, "repa_clsf", StringUtil.replaceToXml(rec.repa_clsf));
			//rx.add(record, "repa_cont", StringUtil.replaceToXml(rec.repa_cont));
			//rx.add(record, "oil_qunt", StringUtil.replaceToXml(rec.oil_qunt));
			//rx.add(record, "repa_dtls_ptcr", StringUtil.replaceToXml(rec.repa_dtls_ptcr));
			//rx.add(record, "incmg_pers_ipaddr", StringUtil.replaceToXml(rec.incmg_pers_ipaddr));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<mt_etccar_3000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<car_no/>
				<repa_dt/>
				<repa_gag/>
				<repa_clsf/>
				<repa_cont/>
				<oil_qunt/>
				<repa_dtls_ptcr/>
				<incmg_pers_ipaddr/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
				<occr_dt/>
				<seq/>
				<sub_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_etccar_3000_l>
*/
%>

<% /* 작성시간 : Tue Apr 14 20:04:22 KST 2009 */ %>