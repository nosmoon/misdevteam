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
	AD_PUB_1530_LDataSet ds = (AD_PUB_1530_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	//int resData = rx.add(root, "resData", "");
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1530_LCURLISTRecord rec = (AD_PUB_1530_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "seq", rec.seq); 
			rx.add(record, "icdcpubc_yn", rec.icdcpubc_yn); 
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);
			rx.add(record, "medi_cd", rec.medi_cd);	
			rx.add(record, "dlco_no", rec.dlco_no);		
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect", rec.sect_cd+rec.sect_seq);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "hndl_plac_cd", rec.hndl_plac_cd);			
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
     		rx.add(record, "pers", rec.pers);

		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
