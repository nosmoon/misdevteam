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
	AD_PUB_1430_LDataSet ds = (AD_PUB_1430_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData2", "");
			
	try { 
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1430_LCURLISTRecord rec = (AD_PUB_1430_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn_nm", rec.agn_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);  
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "arow", rec.arow);
			rx.add(record, "pubc_area", DigitUtil.cutUnderPoint(rec.pubc_area,2));
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

