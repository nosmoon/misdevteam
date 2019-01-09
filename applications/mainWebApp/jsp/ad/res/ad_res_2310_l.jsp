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
	AD_RES_2310_LDataSet ds = (AD_RES_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData 	= rx.add(root, "resData", "");
	
	String	slcrg_pers		=	"";
	String	slcrg_pers_nm	=	"";	
	String	mchrg_pers		=	"";
	String	mchrg_pers_nm	=	"";
	String	pubc_dt			=	"";
	String	fee_rate		=	"";

	try { 
		int gridData 	= rx.add(root, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_2310_LCURLISTRecord rec = (AD_RES_2310_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");  
			rx.add(record, "seq", rec.preng_occr_seq);  
			rx.add(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);  
			rx.add(record, "sect_nm", rec.sect_cd + "" + rec.sect_seq);
			rx.add(record, "dn", rec.dn); 
			rx.add(record, "cm", rec.cm); 			
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers", rec.mchrg_pers); 						
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);  
			rx.add(record, "chrg_aprv", rec.chrg_aprv);  
			rx.add(record, "team_chf_aprv", rec.team_chf_aprv);  			
			rx.add(record, "pubc_side", ""); 
		
		}
		  
		for(int i=0; i<27-ds.curlist.size(); i++){

			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");  
			rx.add(record, "seq", "");  
			rx.add(record, "advt_cont", "");
			rx.add(record, "dlco_no", "");
			rx.add(record, "dlco_nm", "");  
			rx.add(record, "sect_nm", "");
			rx.add(record, "dn", ""); 
			rx.add(record, "cm", ""); 			
			rx.add(record, "uprc", "");
			rx.add(record, "advt_fee", "");
			rx.add(record, "vat", "");
			rx.add(record, "slcrg_pers", "");
			rx.add(record, "mchrg_pers", "");				
			rx.add(record, "medi_cd", "");
			rx.add(record, "pubc_slip_no", "");
			rx.add(record, "preng_occr_dt", "");
			rx.add(record, "preng_occr_seq", "");  
			rx.add(record, "chrg_aprv", "");  
			rx.add(record, "team_chf_aprv", "");  	
			rx.add(record, "pubc_side", "");  				
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
