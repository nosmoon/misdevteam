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
	IS_DEP_2400_MDataSet ds = (IS_DEP_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		//어음구분
		int note_clsf_cd = rx.add( tempData , "note_clsf_cd" , "");
		int item  = rx.add( note_clsf_cd , "item" , "");
		
		for(int i=0; i<ds.curlist.size(); i++){
			IS_DEP_2400_MCURLISTRecord rec = (IS_DEP_2400_MCURLISTRecord)ds.curlist.get(i);
			item  = rx.add( note_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		//업무구분
		int slip_clsf = rx.add( tempData , "slip_clsf" , "");
		
		for(int i=0; i<ds.curlist1.size(); i++){
			IS_DEP_2400_MCURLIST1Record rec = (IS_DEP_2400_MCURLIST1Record)ds.curlist1.get(i);
			item  = rx.add( slip_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
