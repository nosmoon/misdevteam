<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1750_MDataSet ds = (IS_DEP_1750_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		//업무구분
		int slip_clsf = rx.add( tempData , "slip_clsf" , "");	
		for( int i=0; i<ds.curlist1.size(); i++ ){ 
			IS_DEP_1750_MCURLIST1Record rec = (IS_DEP_1750_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( slip_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		//입금주구분
		int rcpm_clsf = rx.add( tempData , "rcpm_clsf" , "");	
		for( int i=0; i<ds.curlist2.size(); i++ ){ 
			IS_DEP_1750_MCURLIST2Record rec = (IS_DEP_1750_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( rcpm_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		//어음구분
		int note_clsf = rx.add( tempData , "note_clsf" , "");	
		for( int i=0; i<ds.curlist3.size(); i++ ){ 
			IS_DEP_1750_MCURLIST3Record rec = (IS_DEP_1750_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( note_clsf , "item" , "");
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
