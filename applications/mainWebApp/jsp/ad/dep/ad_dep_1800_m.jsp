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
%>|

<%
	RwXml rx = new RwXml();
	AD_DEP_1800_MDataSet ds = (AD_DEP_1800_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		//�ŷ�ó����
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");
		int item  = rx.add( hndl_clsf , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "��ü");
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_DEP_1800_MCURLISTRecord rec = (AD_DEP_1800_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int mchrg_pers = rx.add( tempData , "mchrg_pers" , "");	
		int item2  = rx.add( mchrg_pers , "item" , "");
		rx.add ( item2, "value", "");	
		rx.add ( item2, "label", "��ü"); 
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_DEP_1800_MCURLIST2Record rec = (AD_DEP_1800_MCURLIST2Record)ds.curlist2.get(i);
			item2  = rx.add( mchrg_pers , "item" , "");
			rx.add ( item2, "value", rec.acct_id );
			rx.add ( item2, "label", rec.acct_nm );
			
		}
			
	}
	
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

