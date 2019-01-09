<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3120_LDataSet ds = (AD_PUB_3120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData2 	= rx.add(root, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3120_LCURLISTRecord rec = (AD_PUB_3120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData2, "record", "");
			
			rx.add(record, "chcode", StringUtil.replaceToXml(rec.chcode));
			rx.add(record, "cuscode", StringUtil.replaceToXml(rec.cuscode));
			rx.add(record, "blndcode", StringUtil.replaceToXml(rec.blndcode));
			rx.add(record, "orgcode", StringUtil.replaceToXml(rec.orgcode));
			rx.add(record, "frdate", StringUtil.replaceToXml(rec.frdate));
			rx.add(record, "todate", StringUtil.replaceToXml(rec.todate));
			rx.add(record, "rcvgrp", StringUtil.replaceToXml(rec.rcvgrp));
			rx.add(record, "chgcode", StringUtil.replaceToXml(rec.chgcode));
			rx.add(record, "dtlseq", StringUtil.replaceToXml(rec.dtlseq));
			rx.add(record, "zpcode", StringUtil.replaceToXml(rec.zpcode));
			rx.add(record, "zpname", StringUtil.replaceToXml(rec.zpname));
			rx.add(record, "stdamt", StringUtil.replaceToXml(rec.stdamt));
			rx.add(record, "divamt", StringUtil.replaceToXml(rec.divamt));
			rx.add(record, "divvatamt", StringUtil.replaceToXml(rec.divvatamt));
			rx.add(record, "agentstdamt", StringUtil.replaceToXml(rec.agentstdamt));
			rx.add(record, "agentdivamt", StringUtil.replaceToXml(rec.agentdivamt));
			rx.add(record, "agentdivvatamt", StringUtil.replaceToXml(rec.agentdivvatamt));
			rx.add(record, "agentstdamt2", StringUtil.replaceToXml(rec.agentstdamt2));
			rx.add(record, "agentdivamt2", StringUtil.replaceToXml(rec.agentdivamt2));
			rx.add(record, "agentdivvatamt2", StringUtil.replaceToXml(rec.agentdivvatamt2));
			rx.add(record, "acct_trn_cnfm", StringUtil.replaceToXml(rec.acct_trn_cnfm));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "pubc_occr_dt", StringUtil.replaceToXml(rec.pubc_occr_dt));
			rx.add(record, "pubc_occr_seq", StringUtil.replaceToXml(rec.pubc_occr_seq));
			rx.add(record, "pubc_slip_no", StringUtil.replaceToXml(rec.pubc_slip_no));
			if("Y".equals(rec.acct_trn_cnfm)){//수신된 매출일때
				rx.add(record, "trst_fee", rec.trst_fee);
				rx.add(record, "trst_vat", rec.trst_vat);	
			}else{//수신되지않은 매출일때		
				rx.add(record, "trst_fee", "");
				rx.add(record, "trst_vat", "");	
			}			
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>