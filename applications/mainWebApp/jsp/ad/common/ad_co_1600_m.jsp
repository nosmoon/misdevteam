<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_1600_MDataSet ds = (AD_CO_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		int bank_cd = rx.add( tempData , "bank_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_CO_1600_MCURLISTRecord rec = (AD_CO_1600_MCURLISTRecord)ds.curlist1.get(i);
			int item  = rx.add( bank_cd, "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
		
		int note_clsf_cd = rx.add( tempData , "note_clsf_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){ 
			AD_CO_1600_MCURLISTRecord rec = (AD_CO_1600_MCURLISTRecord)ds.curlist2.get(i);
			int item  = rx.add( note_clsf_cd, "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
		
		int rcpm_acct = rx.add( tempData , "rcpm_acct" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){ 
			AD_CO_1600_MCURLISTRecord rec = (AD_CO_1600_MCURLISTRecord)ds.curlist3.get(i);
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

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>