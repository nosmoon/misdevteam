<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_TAX_1100_MDataSet ds = (AD_TAX_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		//매체코드 
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_TAX_1100_MCURLIST1Record rec = (AD_TAX_1100_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}
		//전자세금계산서업체
		int elec_tax_comp_cd = rx.add( tempData , "elec_tax_comp_cd" , "");
		for(int i=0; i<ds.curlist2.size(); i++){ 
			AD_TAX_1100_MCURLIST2Record rec = (AD_TAX_1100_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( elec_tax_comp_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
		}	
		//2012.01.18
		int cb_slip_clsf_cd = rx.add( tempData , "cb_slip_clsf_cd" , "");
		for(int i=0; i<ds.curlist3.size(); i++){ 
			AD_TAX_1100_MCURLIST3Record rec = (AD_TAX_1100_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( cb_slip_clsf_cd , "item" , "");
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

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>