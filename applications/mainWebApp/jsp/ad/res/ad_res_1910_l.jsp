<%@	page contentType="text/xml; charset=EUC-KR" %>


<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1910_LDataSet ds = (AD_RES_1910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int curlist1 = rx.add(root, "curlist1", "");
	
	try {  
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1910_LCURLISTRecord rec = (AD_RES_1910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist1, "record", "");
			
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "agn_nm", rec.agn_nm);
			rx.add(record, "coms_rate", rec.coms_rate);
			rx.add(record, "coms", rec.coms); 
			rx.add(record, "slcrg_pers_nm", rec.slcrg_pers_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "coms_vat", rec.coms_vat); 
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
