<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_1600_MDataSet ds = (AD_DEP_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		//매체구분
		int medi_cd = rx.add( tempData , "medi_cd" , "");
		int item  = rx.add( medi_cd , "item" , "");
		//rx.add ( item, "value", "");	
		//rx.add ( item, "label", "전체");
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_DEP_1600_MCURLISTRecord rec = (AD_DEP_1600_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
	
		//거래처구분 
		int dlco_clsf = rx.add( tempData , "dlco_clsf" , "");
		int item2  = rx.add( dlco_clsf , "item" , "");
		//rx.add ( item2, "value", "");	
		//rx.add ( item2, "label", "전체");
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_DEP_1600_MCURLIST2Record rec = (AD_DEP_1600_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( dlco_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}
	
		//담당자 
	    int slcrg_pers = rx.add( tempData , "slcrg_pers" , "");	
		int item3  = rx.add( slcrg_pers , "item" , "");
		rx.add ( item3, "value", "");	
		rx.add ( item3, "label", "전체"); 
		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_DEP_1600_MCURLIST3Record rec = (AD_DEP_1600_MCURLIST3Record)ds.curlist3.get(i);
			item  = rx.add( slcrg_pers , "item" , "");
			rx.add ( item3, "value", rec.acct_id ); 
			rx.add ( item3, "label", rec.acct_nm ); 
			
		}	
		
			
	}
	
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

