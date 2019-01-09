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
	AD_DEP_1700_MDataSet ds = (AD_DEP_1700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		int proc_clsf = rx.add( tempData , "proc_clsf" , "");	
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_DEP_1700_MCURLIST1Record rec = (AD_DEP_1700_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( proc_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}	
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_DEP_1700_MCURLIST2Record rec = (AD_DEP_1700_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}	
	
		int medi_cd = rx.add( tempData , "medi_cd" , "");	 	
		for(int i=0; i<ds.curlist3.size(); i++){ 
			AD_DEP_1700_MCURLIST3Record rec = (AD_DEP_1700_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}			
		
		int acct_cd = rx.add( tempData , "acct_cd" , "");	
		for(int i=0; i<ds.curlist4.size(); i++){ 
			AD_DEP_1700_MCURLIST4Record rec = (AD_DEP_1700_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( acct_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}			
	}
	
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* �ۼ��ð� : Wed Jan 21 21:10:45 KST 2009 */ %>