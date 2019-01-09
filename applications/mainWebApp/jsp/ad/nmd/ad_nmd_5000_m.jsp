<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_5000_MDataSet ds = (AD_NMD_5000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try { 
	
		//매체구분
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_NMD_5000_MCURLIST1Record rec = (AD_NMD_5000_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}	
	
		//증빙유형코드
		int prof_type_cd = rx.add( tempData , "prof_type_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_NMD_5000_MCURLIST2Record rec = (AD_NMD_5000_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( prof_type_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}	
		
		//재발행사유
		int re_issu_resn_cd = rx.add( tempData , "re_issu_resn_cd" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_NMD_5000_MCURLIST3Record rec = (AD_NMD_5000_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( re_issu_resn_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}	
		//거래처구분
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_NMD_5000_MCURLIST4Record rec = (AD_NMD_5000_MCURLIST4Record)ds.curlist4.get(i);
			if("2".equals(rec.cd) || "6".equals(rec.cd)) continue;//대행사, 안내외근 제외
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			int j = i + 1;
			if(j == ds.curlist4.size() ){
				rx.add ( item, "value", "10" );
				rx.add ( item, "label", "10 아이디");				
			}
		}	
		
		int elec_tax_comp_cd = rx.add(tempData, "elec_tax_comp_cd", "");
		for(int i=0; i<ds.curlist5.size(); i++)
		{
			AD_NMD_5000_MCURLIST5Record rec = (AD_NMD_5000_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( elec_tax_comp_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
		//2012.01.18
		int cb_slip_clsf_cd = rx.add(tempData, "cb_slip_clsf_cd", "");
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_NMD_5000_MCURLIST6Record rec = (AD_NMD_5000_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( cb_slip_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd);
			rx.add ( item, "label", rec.cd_abrv_nm);
		}
		
		rx.add( tempData , "ern" , ds.ern);	
		rx.add( tempData , "dlco_nm" , ds.dlco_nm);	
		rx.add( tempData , "presi_nm" , ds.presi_nm);	
		rx.add( tempData , "addr" , ds.addr);	
		rx.add( tempData , "bizcond" , ds.bizcond);	
		rx.add( tempData , "item" , ds.item);	
		rx.add( tempData , "xx_dlco_clsf_cd" , ds.xx_dlco_clsf_cd);
		rx.add( tempData , "xx_prof_type_cd" , ds.xx_prof_type_cd);
		rx.add( tempData , "xx_tax_item" , ds.xx_tax_item);
		System.out.println("xx_tax_item:::::::::::::::::>>"+ds.xx_tax_item);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>