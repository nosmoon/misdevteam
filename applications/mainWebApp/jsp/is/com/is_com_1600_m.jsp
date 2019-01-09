<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.com.rec.*
	,	chosun.ciis.is.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_COM_1600_MDataSet ds = (IS_COM_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		int bank_cd = rx.add( tempData , "bank_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			IS_COM_1600_MCURLIST1Record rec = (IS_COM_1600_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( bank_cd, "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
		
		int note_clsf_cd = rx.add( tempData , "note_clsf_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){ 
			IS_COM_1600_MCURLIST2Record rec = (IS_COM_1600_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( note_clsf_cd, "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
		
		int rcpm_acct = rx.add( tempData , "rcpm_acct" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){ 
			IS_COM_1600_MCURLIST3Record rec = (IS_COM_1600_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( rcpm_acct, "item" , "");
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
