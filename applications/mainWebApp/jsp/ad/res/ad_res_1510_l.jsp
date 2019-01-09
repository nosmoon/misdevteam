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
	AD_RES_1510_LDataSet ds = (AD_RES_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1510_LCURLISTRecord rec = (AD_RES_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));  //소수점 1자리까지 표현
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));  //소수점 1자리까지 표현
			rx.add(record, "chro_clsf_nm", rec.chro_clsf_nm);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "hndl_plac_nm", rec.hndl_plac_nm);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.addCData(record, "remk", rec.remk);
						
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
