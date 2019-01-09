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
	AD_BRN_1000_MDataSet ds = (AD_BRN_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_BRN_1000_MCURLIST1Record rec = (AD_BRN_1000_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			
		}	
	
		int advt_clas = rx.add( tempData , "advt_clas" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_BRN_1000_MCURLIST2Record rec = (AD_BRN_1000_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( advt_clas , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int chro_clsf = rx.add( tempData , "chro_clsf" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_BRN_1000_MCURLIST3Record rec = (AD_BRN_1000_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int pubc_clas = rx.add( tempData , "pubc_clas" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_BRN_1000_MCURLIST4Record rec = (AD_BRN_1000_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( pubc_clas , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int grp_cmpy_cd = rx.add( tempData , "grp_cmpy_cd" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_BRN_1000_MCURLIST5Record rec = (AD_BRN_1000_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( grp_cmpy_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int mony_kind = rx.add( tempData , "mony_kind" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_BRN_1000_MCURLIST6Record rec = (AD_BRN_1000_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( mony_kind , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int edt_clsf = rx.add( tempData , "edt_clsf" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_BRN_1000_MCURLIST7Record rec = (AD_BRN_1000_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( edt_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	

		int dtls_medi_cd = rx.add( tempData , "dtls_medi_cd" , "");		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_BRN_1000_MCURLIST8Record rec = (AD_BRN_1000_MCURLIST8Record)ds.curlist8.get(i);
			int item  = rx.add( dtls_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	

		int pubc_clas_350 = rx.add( tempData , "pubc_clas_350" , "");		
		for(int i=0; i<ds.curlist9.size(); i++){
			AD_BRN_1000_MCURLIST9Record rec = (AD_BRN_1000_MCURLIST9Record)ds.curlist9.get(i);
			int item  = rx.add( pubc_clas_350 , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}
						
		rx.add( tempData , "mchrg_pers" , ds.mchrg_pers);		
		rx.add( tempData , "mchrg_pers_nm" , ds.mchrg_pers_nm);		
		rx.add( tempData , "hndl_plac_cd" , ds.preng_advt_bo);		
		rx.add( tempData , "hndl_plac_nm" , ds.preng_advt_bo_nm);	 	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<sun/>
			<mon/>
			<tue/>
			<wed/>
			<thr/>
			<fri/>
			<sat/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>