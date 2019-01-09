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
	AD_PUB_1115_LDataSet ds = (AD_PUB_1115_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData 	= rx.add(root, "resData", "");
	
	String	slcrg_pers		=	"";
	String	slcrg_pers_nm	=	"";	
	String	mchrg_pers		=	"";
	String	mchrg_pers_nm	=	"";
	String	pubc_dt			=	"";
	String	fee_rate		=	"";  

	try { 
		int gridData 	= rx.add(root, "gridData2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1115_LCURLISTRecord rec = (AD_PUB_1115_LCURLISTRecord)ds.curlist.get(i);
			
			String	eps_clsf_cd = "";
			if("1".equals(rec.eps_clsf_cd)) 		eps_clsf_cd = "Yes";
			else if("2".equals(rec.eps_clsf_cd)) 	eps_clsf_cd = "No";
			
			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");    
			rx.add(record, "hndl_plac_nm", rec.hndl_plac_nm);  
			rx.addCData(record, "advt_cont", rec.advt_cont); 
			rx.add(record, "dlco_no", rec.dlco_no);  
			rx.add(record, "dlco_nm", rec.dlco_nm);  
			rx.add(record, "eps_clsf_cd", eps_clsf_cd);  
			rx.add(record, "sect_nm", rec.sect_cd + "" + rec.sect_seq);
			rx.add(record, "arow", rec.arow); 
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "guid_sec_kind_nm", rec.guid_sec_kind_cd + " " + rec.guid_sec_kind_nm);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "guid_sec_kind_cd", rec.guid_sec_kind_cd);
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq); 
			rx.add(record, "coms_rate", rec.coms_rate);  
			
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

