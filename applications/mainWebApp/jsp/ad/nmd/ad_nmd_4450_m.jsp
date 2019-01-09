<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*	
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4450_MDataSet ds = (AD_NMD_4450_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	//System.out.println("ad_nmd_4450_m jsp start!!");
	try {
		
		int medi_cd = rx.add( tempData , "medi_cd" , "");
		for( int i=0; i<ds.curlist1.size(); i++ )
		{ 
			AD_NMD_4450_MCURLISTRecord rec = (AD_NMD_4450_MCURLISTRecord)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}
		
		int rcpm_plac_clsf = rx.add( tempData , "rcpm_plac_clsf" , "");
		for( int i=0; i<ds.curlist2.size(); i++ )
		{
			AD_NMD_4450_MCURLISTRecord rec = (AD_NMD_4450_MCURLISTRecord)ds.curlist2.get(i);
			int item  = rx.add( rcpm_plac_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
			int j = i + 1;			
			if(j == ds.curlist2.size() ){
				rx.add ( item, "value", "10" );
				rx.add ( item, "label", "10 아이디");				
			}			
		}
		
		int rcpm_clsf = rx.add( tempData , "rcpm_clsf" , "");	
		for( int i=0; i<ds.curlist3.size(); i++ )
		{ 
			AD_NMD_4450_MCURLISTRecord rec = (AD_NMD_4450_MCURLISTRecord)ds.curlist3.get(i);
			int item  = rx.add( rcpm_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int note_clsf = rx.add( tempData , "note_clsf" , "");	
		for( int i=0; i<ds.curlist4.size(); i++ )
		{ 
			AD_NMD_4450_MCURLISTRecord rec = (AD_NMD_4450_MCURLISTRecord)ds.curlist4.get(i);
			int item  = rx.add( note_clsf , "item" , "");
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

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>