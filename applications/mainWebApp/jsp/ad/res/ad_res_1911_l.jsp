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
	AD_RES_1911_LDataSet ds = (AD_RES_1911_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int curlist2 = rx.add(root, "curlist2", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1911_LCURLISTRecord rec = (AD_RES_1911_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist2, "record", "");
			
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "coms_rate", rec.coms_rate);
			rx.add(record, "coms", rec.coms);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1)); //소수점 1자리까지 표현
			rx.add(record, "agn_nm", rec.agn_nm);
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
