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
	AD_NMD_4150_MDataSet ds = (AD_NMD_4150_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
	
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_NMD_4150_MCURLIST1Record rec = (AD_NMD_4150_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int rcpm_plac_clsf = rx.add( tempData , "rcpm_plac_clsf" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){ 
			AD_NMD_4150_MCURLIST2Record rec = (AD_NMD_4150_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( rcpm_plac_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
//			rx.add ( item, "label", rec.cdnm);
			rx.add ( item, "label", "법인");
			int j = i + 1;			
			if(j == ds.curlist2.size() ){
				rx.add ( item, "value", "10" );
				rx.add ( item, "label", "개인");				
			}				
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