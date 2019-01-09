<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_1000_MDataSet ds = (TN_LNK_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	try {
	
		int bank_clsf = rx.add( tempData , "bank_clsf" , "");	
		for(int i=0; i<ds.curlist1.size(); i++){
			TN_LNK_1000_MCURLIST1Record rec = (TN_LNK_1000_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( bank_clsf , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			
		}	
	
		int memb_clsf = rx.add( tempData , "memb_clsf" , "");	
		for(int i=0; i<ds.curlist2.size(); i++){
			TN_LNK_1000_MCURLIST2Record rec = (TN_LNK_1000_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( memb_clsf , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			
		}	
	
		int acct_clsf = rx.add( tempData , "acct_clsf" , "");	
		int item3  = rx.add( acct_clsf , "item" , "");
		rx.add ( item3, "value", "");	
		rx.add ( item3, "label", "°èÁÂ¼±ÅÃ");		
		for(int i=0; i<ds.curlist3.size(); i++){
			TN_LNK_1000_MCURLIST3Record rec = (TN_LNK_1000_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( acct_clsf , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cdnm); 
			
		}	
		
		int dept_clsf = rx.add( tempData , "dept_clsf" , "");	
		for(int i=0; i<ds.curlist4.size(); i++){
			TN_LNK_1000_MCURLIST4Record rec = (TN_LNK_1000_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( dept_clsf , "item" , "");
			rx.add ( item, "value", rec.cd ); 
			rx.add ( item, "label", rec.cd + " " + rec.cdnm); 
			
		}	
		
		int paymthd_clsf = rx.add( tempData , "paymthd_clsf" , "");	
		for(int i=0; i<ds.curlist5.size(); i++){
			TN_LNK_1000_MCURLIST5Record rec = (TN_LNK_1000_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( paymthd_clsf , "item" , "");
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
