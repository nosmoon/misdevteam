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
	AD_PUB_1110_LDataSet ds = (AD_PUB_1110_LDataSet)request.getAttribute("ds");
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
			AD_PUB_1110_LCURLISTRecord rec = (AD_PUB_1110_LCURLISTRecord)ds.curlist.get(i);
			
			String	eps_clsf_cd = "";
			if("1".equals(rec.eps_clsf_cd)) 		eps_clsf_cd = "Yes";
			else if("2".equals(rec.eps_clsf_cd)) 	eps_clsf_cd = "No";
			
			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");  
			rx.add(record, "seq", rec.seq);  
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
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "guid_sec_kind_cd", rec.guid_sec_kind_cd);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "pubc_occr_dt", rec.pubc_occr_dt);
			rx.add(record, "pubc_occr_seq", rec.pubc_occr_seq);  
			rx.add(record, "coms_rate", rec.coms_rate);  
			
			if(i == 0){
				slcrg_pers		=	rec.slcrg_pers;
				slcrg_pers_nm	=	rec.slcrg_pers_nm;
				mchrg_pers		=	rec.mchrg_pers;
				mchrg_pers_nm	=	rec.mchrg_pers_nm;
				pubc_dt			=	rec.pubc_dt;
				if("".equals(StringUtil.nvl(rec.fee_rate))){
					fee_rate		=	rec.fee_rate;
				}else if("".equals(StringUtil.nvl(rec.coms_rate))){
					fee_rate		=	rec.coms_rate;
				}
			}
		}
		  
		for(int i=0; i<27-ds.curlist.size(); i++){

			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");  
			rx.add(record, "seq", "");  
			rx.add(record, "advt_cont", "");
			rx.add(record, "dlco_no", "");
			rx.add(record, "dlco_nm", "");  
			rx.add(record, "eps_clsf_cd", "");  
			rx.add(record, "sect_nm", "");
			rx.add(record, "arow", ""); 
			rx.add(record, "uprc", "");
			rx.add(record, "advt_fee", "");
			rx.add(record, "vat", "");
			rx.add(record, "guid_sec_kind_nm", "");
			rx.add(record, "medi_cd", "");
			rx.add(record, "pubc_side", "");
			rx.add(record, "guid_sec_kind_cd", "");		
			rx.add(record, "pubc_slip_no", "");
			rx.add(record, "pubc_occr_dt", "");
			rx.add(record, "pubc_occr_seq", "");
			rx.add(record, "coms_rate", "");  
		}
/*		
		rx.add(resData, "slcrg_pers", slcrg_pers);  
		rx.add(resData, "slcrg_pers_nm", slcrg_pers_nm);  
		rx.add(resData, "mchrg_pers", mchrg_pers);  
		rx.add(resData, "mchrg_pers_nm", mchrg_pers_nm);  
		rx.add(resData, "pubc_dt", pubc_dt);  
		rx.add(resData, "fee_rate", fee_rate);
*/		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

