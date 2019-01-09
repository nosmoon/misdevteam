<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_2300_MDataSet ds = (AD_RES_2300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
			
	try {
		//매체코드
		int medi_cd = rx.add( tempData , "medi_cd" , "");
		for(int i=0; i<ds.curlist.size(); i++){
			AD_RES_2300_MCURLISTRecord rec = (AD_RES_2300_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			
		}	
		//영업담당
		int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_RES_2300_MCURLIST2Record rec = (AD_RES_2300_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( slcrg_pers , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			
		}
		//관리담당
		int mchrg_pers = rx.add( tempData , "mchrg_pers" , "");
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_RES_2300_MCURLIST3Record rec = (AD_RES_2300_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( mchrg_pers , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			
		}			
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
