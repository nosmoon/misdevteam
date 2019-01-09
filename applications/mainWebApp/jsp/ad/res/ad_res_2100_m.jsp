<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_2100_MDataSet ds = (AD_RES_2100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
						
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_RES_2100_MCURLIST1Record rec = (AD_RES_2100_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			
		}	
	
		int chro_clsf = rx.add( tempData , "chro_clsf" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_RES_2100_MCURLIST2Record rec = (AD_RES_2100_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int mony_kind = rx.add( tempData , "mony_kind" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_RES_2100_MCURLIST3Record rec = (AD_RES_2100_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( mony_kind , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int nwsp_type_clsf = rx.add( tempData , "nwsp_type_clsf" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_RES_2100_MCURLIST4Record rec = (AD_RES_2100_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( nwsp_type_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", StringUtil.substr(rec.cd,1,2) +" "+ rec.cdnm);
		}	
		
		int book_appndx_clsf = rx.add( tempData , "book_appndx_clsf" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_RES_2100_MCURLIST5Record rec = (AD_RES_2100_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( book_appndx_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int publ_std = rx.add( tempData , "publ_std" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_RES_2100_MCURLIST6Record rec = (AD_RES_2100_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( publ_std , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_RES_2100_MCURLIST7Record rec = (AD_RES_2100_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}			
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>


<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>