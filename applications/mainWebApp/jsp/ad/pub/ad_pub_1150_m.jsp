<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1150_MDataSet ds = (AD_PUB_1150_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	try {
	
		int medi_cd = rx.add( tempData , "medi_cd" , "");	
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_PUB_1150_MCURLIST1Record rec = (AD_PUB_1150_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			
		}	
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");	
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_1150_MCURLIST2Record rec = (AD_PUB_1150_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			
		}	
	
		int guid_sec_kind_cd = rx.add( tempData , "guid_sec_kind_cd" , "");	
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1150_MCURLIST3Record rec = (AD_PUB_1150_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( guid_sec_kind_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			
		}	
		
		int upd_resn = rx.add( tempData , "upd_resn" , "");	
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_PUB_1150_MCURLIST4Record rec = (AD_PUB_1150_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( upd_resn , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
