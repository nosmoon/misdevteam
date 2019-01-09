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
	AD_BRN_1300_MDataSet ds = (AD_BRN_1300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		//매체구분
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_BRN_1300_MCURLIST1Record rec = (AD_BRN_1300_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}	
	
		//증빙유형코드
		int prof_type_cd = rx.add( tempData , "prof_type_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_BRN_1300_MCURLIST2Record rec = (AD_BRN_1300_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( prof_type_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}	
		
		//거래처구분
		int re_issu_resn_cd = rx.add( tempData , "re_issu_resn_cd" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_BRN_1300_MCURLIST3Record rec = (AD_BRN_1300_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( re_issu_resn_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}
		 
		//전자계산서업체
		int elec_tax_comp_cd = rx.add(tempData, "elec_tax_comp_cd", "");
		for(int i=0; i<ds.curlist4.size(); i++)
		{
			AD_BRN_1300_MCURLIST4Record rec = (AD_BRN_1300_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( elec_tax_comp_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}	
		
		rx.add( tempData , "ern" , ds.ern);	
		rx.add( tempData , "dlco_nm" , ds.dlco_nm);	
		rx.add( tempData , "presi_nm" , ds.presi_nm);	
		rx.add( tempData , "addr" , ds.addr);	
		rx.add( tempData , "bizcond" , ds.bizcond);	
		rx.add( tempData , "item" , ds.item);	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>