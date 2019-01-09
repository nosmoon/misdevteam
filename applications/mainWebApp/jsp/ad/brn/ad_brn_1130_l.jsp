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
	AD_BRN_1130_LDataSet ds = (AD_BRN_1130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int curlist2 = rx.add(root, "curlist3", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1130_LCURLISTRecord rec = (AD_BRN_1130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist2, "record", "");
			
			rx.add(record, "hndl_nm_cd", 	rec.hndl_nm_cd);
			rx.add(record, "pubc_dt", 		rec.pubc_dt);
			rx.add(record, "sect", 			rec.sect);
			rx.add(record, "advt_cont",		rec.advt_cont);
			rx.add(record, "dn", 			rec.dn);
			rx.add(record, "cm", 			rec.cm);
			rx.add(record, "hndl_evlt", 	rec.hndl_evlt_cd);
			rx.add(record, "other", 	    rec.other);
			rx.add(record, "slcrg_nm", 		rec.slcrg_nm);
			rx.add(record, "remk", 		    rec.remk);
			rx.add(record, "slcrg_remk", 	rec.slcrg_remk);			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
