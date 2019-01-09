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
	AD_PUB_1300_MDataSet ds = (AD_PUB_1300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	int eps_clsf_cd = rx.add( tempData , "eps_clsf_cd" , "");		

	try {
	
		for(int i=0; i<ds.curlist.size(); i++){
			AD_PUB_1300_MCURLISTRecord rec = (AD_PUB_1300_MCURLISTRecord)ds.curlist.get(i);
			int item  = rx.add( eps_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			
		}	
		
		int guid_sec_kind_cd = rx.add( tempData , "guid_sec_kind_cd" , "");
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_1300_MCURLIST2Record rec = (AD_PUB_1300_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( guid_sec_kind_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd  + " " + rec.cd_abrv_nm);
			
		}
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
