<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4081_LDataSet ds = (AD_NMD_4081_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData 	= rx.add(root, "resGrid", "");
	int gridData 	= rx.add(root, "gridData", "");
			
	try { 
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4081_LCURLISTRecord rec = (AD_NMD_4081_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record,"clos_stat",rec.clos_stat);
			rx.add(record,"make_dt",rec.make_dt);
			rx.add(record,"semuro_no",rec.semuro_no);
			rx.add(record,"tax_stmt_no",rec.tax_stmt_no);
			rx.add(record,"agn",rec.agn);
			rx.add(record,"agn_nm",rec.agn_nm);
			rx.add(record,"fee",rec.fee);
			rx.add(record,"fee_vat",rec.fee_vat);
			rx.add(record,"tot_fee",rec.tot_fee);
			rx.add(record,"tax_item",rec.tax_item);
			rx.add(record,"medi_cd",rec.medi_cd);
			rx.add(record,"occr_dt",rec.slip_occr_dt);
			rx.add(record,"seq",rec.slip_seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

