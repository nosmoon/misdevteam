<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.brn.rec.*
	,	chosun.ciis.ad.brn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BRN_1810_LDataSet ds = (AD_BRN_1810_LDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int resData 	= rx.add(root, "resData", "");
	int gridData 	= rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1810_LCURLISTRecord rec = (AD_BRN_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "bo_chrg_aprv", rec.bo_chrg_aprv);
			rx.add(record, "chrg_aprv", rec.chrg_aprv);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "sect_nm", rec.sect_cd + (StringUtil.toNumber(rec.sect_seq) < 10 ? " " + rec.sect_seq : rec.sect_seq ));
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));  
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "chro_clsf_nm", rec.chro_clsf_nm); 
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm); 
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
