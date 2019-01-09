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
	AD_BRN_1120_LDataSet ds = (AD_BRN_1120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int curlist2 = rx.add(root, "curlist2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1120_LCURLISTRecord rec = (AD_BRN_1120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist2, "record", "");
			
			//rx.add(record, "dlco_no", 	rec.dlco_no);
			rx.add(record, "dlco_nm", 		rec.dlco_nm);
			rx.add(record, "pubc_dt", 		rec.pubc_dt);
			//rx.add(record, "advt_clas", 	rec.advt_clas);
			rx.add(record, "advt_clas_nm", 	rec.advt_clas_nm);
			rx.add(record, "dn", 			StringUtil.toDouble(rec.dn));
			rx.add(record, "cm", 			StringUtil.toDouble(rec.cm));
			//rx.add(record, "medi_cd", 	rec.medi_cd);
			rx.add(record, "medi_nm", 		rec.medi_nm);
			rx.add(record, "uprc", 			rec.uprc);
			rx.add(record, "advt_fee", 		rec.advt_fee);
			rx.add(record, "vat", 			rec.vat);
			rx.add(record, "pubc_tot_amt", 	rec.pubc_tot_amt);
			rx.add(record, "coms_rate", rec.coms_rate);
			rx.add(record, "coms", rec.coms);			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
