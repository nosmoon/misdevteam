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
	AD_DEP_2400_MDataSet ds = (AD_DEP_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		
		//매체구분
		int medi_cd = rx.add( tempData , "medi_cd" , "");
		int item  = rx.add( medi_cd , "item" , "");
		//rx.add ( item, "value", "");	
		//rx.add ( item, "label", "전체");
		
		for(int i=0; i<ds.curlist.size(); i++){
			AD_DEP_2400_MCURLISTRecord rec = (AD_DEP_2400_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		//입금주구분
		int rcpm_cd = rx.add( tempData , "rcpm_cd" , "");
		int item2  = rx.add( rcpm_cd , "item" , "");
		//rx.add ( item2, "value", "");	
		//rx.add ( item2, "label", "전체");
		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_DEP_2400_MCURLIST2Record rec = (AD_DEP_2400_MCURLIST2Record)ds.curlist2.get(i);
			item2  = rx.add( rcpm_cd , "item" , "");
			rx.add ( item2, "value", rec.cd );
			rx.add ( item2, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		//어음구분 
		int note_clsf_cd = rx.add( tempData , "note_clsf_cd" , "");
		int item3  = rx.add( note_clsf_cd , "item" , "");
		rx.add ( item3, "value", "");	
		rx.add ( item3, "label", "전체");
		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_DEP_2400_MCURLIST3Record rec = (AD_DEP_2400_MCURLIST3Record)ds.curlist3.get(i);
			item3  = rx.add( note_clsf_cd , "item" , "");
			rx.add ( item3, "value", rec.cd );
			rx.add ( item3, "label", rec.cd +" "+ rec.cdnm);
		}
		
		
		//업무구분
		int work_cd = rx.add( tempData , "work_cd" , "");
		int item4  = rx.add( work_cd , "item" , "");
		//rx.add ( item, "value", "");	
		//rx.add ( item, "label", "전체");
		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_DEP_2400_MCURLIST4Record rec = (AD_DEP_2400_MCURLIST4Record)ds.curlist4.get(i);
			item4  = rx.add( work_cd , "item" , "");
			rx.add ( item4, "value", rec.cd );
			rx.add ( item4, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		//거래처구분 
		int dlco_clsf = rx.add( tempData , "dlco_clsf" , "");
		int item5  = rx.add( dlco_clsf , "item" , "");
		rx.add ( item, "value", "");	
		rx.add ( item, "label", "전체");
		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_DEP_2400_MCURLIST5Record rec = (AD_DEP_2400_MCURLIST5Record)ds.curlist5.get(i);
			item5  = rx.add( dlco_clsf , "item" , "");
			rx.add ( item5, "value", rec.cd );
			rx.add ( item5, "label", rec.cd +" "+ rec.cdnm);
		}
				
	}
	
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

