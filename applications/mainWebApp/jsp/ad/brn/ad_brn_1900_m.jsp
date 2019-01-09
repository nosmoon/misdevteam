<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.brn.rec.*
	,	chosun.ciis.ad.brn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BRN_1900_MDataSet ds = (AD_BRN_1900_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	int medi_cd = rx.add( tempData , "medi_cd" , "");		
	
	try {
	
		for(int i=0; i<ds.curlist.size(); i++){
			AD_BRN_1900_MCURLISTRecord rec = (AD_BRN_1900_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			System.out.println("medi_cd"+i+"::"+rec.cd+" "+rec.cdnm);
		}	
		
		rx.add ( tempData, "dlco_no"		, ds.preng_advt_bo ); 
		rx.add ( tempData, "dlco_nm"		, ds.dlco_nm ); 
		rx.add ( tempData, "slcrg_pers"		, ds.slcrg_pers ); 
		rx.add ( tempData, "slcrg_pers_nm"	, ds.slcrg_pers_nm ); 
		rx.add ( tempData, "mchrg_pers"		, ds.mchrg_pers ); 
		rx.add ( tempData, "mchrg_pers_nm"	, ds.mchrg_pers_nm ); 
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
