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
	AD_PUB_3310_LDataSet ds = (AD_PUB_3310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_PUB_3310_LCURLISTRecord rec = (AD_PUB_3310_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add(record, "select", "N");
			rx.add(record, "podr_yn", rec.podr_yn);
			rx.add(record, "exct_yn", rec.exct_yn);
			rx.add(record, "podr_ym", rec.podr_ym);
			rx.add(record, "podr_clsf", rec.podr_clsf);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "spl_dlco", rec.spl_dlco);
			rx.addCData(record, "brnd_nm", rec.brnd_nm);
			rx.addCData(record, "item_nm", rec.item_nm);
			rx.add(record, "podr_cnt", rec.podr_cnt);
			rx.add(record, "podr_uprc", rec.podr_uprc);
			rx.add(record, "podr_amt", rec.podr_amt);
			rx.add(record, "exct_cnt", rec.exct_cnt);
			rx.add(record, "exct_uprc", rec.exct_uprc);
			rx.add(record, "exct_amt", rec.exct_amt);
			rx.add(record, "ccon_fee", rec.ccon_fee);
			rx.add(record, "ex_sale_fee", rec.ex_sale_fee);
			rx.add(record, "mms", rec.mms);
			rx.add(record, "medi_fee", rec.medi_fee);
			rx.add(record, "m_amt", rec.m_amt);
			rx.add(record, "easy_amt", rec.easy_amt);
			rx.add(record, "ex_buy_fee", rec.ex_buy_fee);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.addCData(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "podr_slip_no", rec.podr_slip_no);
			rx.add(record, "exct_slip_no", rec.exct_slip_no);
			rx.add(record, "status", rec.status);
			rx.addCData(record, "remk", rec.remk);
		}	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>