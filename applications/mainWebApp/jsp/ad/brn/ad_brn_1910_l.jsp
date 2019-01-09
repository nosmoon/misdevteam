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
	AD_BRN_1910_LDataSet ds = (AD_BRN_1910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData 	= rx.add(root, "resData", "");
	
	try { 
		int gridData 	= rx.add(root, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BRN_1910_LCURLISTRecord rec = (AD_BRN_1910_LCURLISTRecord)ds.curlist.get(i);
			
			String	eps_clsf_cd = "";
			if("1".equals(rec.eps_clsf_cd)) 		eps_clsf_cd = "Yes";
			else if("2".equals(rec.eps_clsf_cd)) 	eps_clsf_cd = "No";
			
			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");  
			rx.add(record, "bo_chrg_aprv", rec.bo_chrg_aprv);  
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);  
			rx.add(record, "advt_cont", rec.advt_cont);
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
			
		}
		  
		for(int i=0; i<27-ds.curlist.size(); i++){

			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "N");  
			rx.add(record, "bo_chrg_aprv", "N");  
			rx.add(record, "preng_occr_seq", "");  
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
			rx.add(record, "pubc_side", "");
			rx.add(record, "guid_sec_kind_cd", "");		
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

