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
	AD_PUB_1600_MDataSet ds = (AD_PUB_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");


	try {

//취급구분
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_PUB_1600_MCURLIST1Record rec = (AD_PUB_1600_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			
		}	
//지종구분	 
		int nwsp_type_clsf = rx.add( tempData , "nwsp_type_clsf" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_1600_MCURLIST2Record rec = (AD_PUB_1600_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( nwsp_type_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", StringUtil.substr(rec.cd,1,2) +" "+ rec.cdnm);
		}	
//색도구분		
		int chro_clsf = rx.add( tempData , "chro_clsf" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1600_MCURLIST3Record rec = (AD_PUB_1600_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//본책부록구분		
		int book_appndx_clsf = rx.add( tempData , "book_appndx_clsf" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_PUB_1600_MCURLIST4Record rec = (AD_PUB_1600_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( book_appndx_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//화폐종류		
		int mony_kind = rx.add( tempData , "mony_kind" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_PUB_1600_MCURLIST5Record rec = (AD_PUB_1600_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( mony_kind , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//수정사유		
		int upd_resn = rx.add( tempData , "upd_resn" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_PUB_1600_MCURLIST6Record rec = (AD_PUB_1600_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( upd_resn , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//매체구분		
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_PUB_1600_MCURLIST7Record rec = (AD_PUB_1600_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//출판규격		
		int publ_std = rx.add( tempData , "publ_std" , "");		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_PUB_1600_MCURLIST8Record rec = (AD_PUB_1600_MCURLIST8Record)ds.curlist8.get(i);
			int item  = rx.add( publ_std , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd  + " " + rec.cdnm);
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