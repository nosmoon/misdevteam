<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_2110_LDataSet ds = (AD_PUB_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2110_LCURLISTRecord rec = (AD_PUB_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.addCData(record, "medi_nm", rec.medi_nm);
			rx.add(record, "name_cd", rec.name_cd);
			rx.addCData(record, "name", rec.name);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "rnum", rec.rnum);

		}
	    //전년동기 			
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_2110_LCURLIST2Record rec = (AD_PUB_2110_LCURLIST2Record)ds.curlist2.get(i);
			int record2 = rx.add(gridData, "record2", "");
			
			rx.add(record2, "rnum", rec.rnum);
			rx.addCData(record2, "medi_nm", rec.medi_nm);
			rx.add(record2, "name_cd", rec.name_cd);
			rx.addCData(record2, "name", rec.name);
			rx.add(record2, "advt_fee", rec.advt_fee);
			rx.add(record2, "vat", rec.vat);
			rx.add(record2, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record2, "cnt", rec.cnt);
			rx.add(record2, "pubc_dt", rec.pubc_dt);

		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
