<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1200_MDataSet ds = (AD_RES_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_RES_1200_MCURLIST1Record rec = (AD_RES_1200_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
			
		}	
	
		int advt_clas = rx.add( tempData , "advt_clas" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_RES_1200_MCURLIST2Record rec = (AD_RES_1200_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( advt_clas , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int chro_clsf = rx.add( tempData , "chro_clsf" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_RES_1200_MCURLIST3Record rec = (AD_RES_1200_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int pubc_clas = rx.add( tempData , "pubc_clas" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_RES_1200_MCURLIST4Record rec = (AD_RES_1200_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( pubc_clas , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int grp_cmpy_cd = rx.add( tempData , "grp_cmpy_cd" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_RES_1200_MCURLIST5Record rec = (AD_RES_1200_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( grp_cmpy_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int mony_kind = rx.add( tempData , "mony_kind" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_RES_1200_MCURLIST6Record rec = (AD_RES_1200_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( mony_kind , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int edt_clsf = rx.add( tempData , "edt_clsf" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_RES_1200_MCURLIST7Record rec = (AD_RES_1200_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( edt_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	

		int nwsp_side_type = rx.add( tempData , "nwsp_side_type" , "");		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_RES_1200_MCURLIST8Record rec = (AD_RES_1200_MCURLIST8Record)ds.curlist8.get(i);
			int item  = rx.add( nwsp_side_type , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		

		//매체코드		
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist9.size(); i++){
			AD_RES_1200_MCURLIST9Record rec = (AD_RES_1200_MCURLIST9Record)ds.curlist9.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}
		//뉴비즈 - 상세매체코드		
		int dtnb_medi_cd = rx.add( tempData , "dtnb_medi_cd" , "");		
		for(int i=0; i<ds.curlist10.size(); i++){ 
			AD_RES_1200_MCURLIST10Record rec = (AD_RES_1200_MCURLIST10Record)ds.curlist10.get(i);
			int item  = rx.add( nwsp_side_type , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		//디지털 - 상세매체코드		
		int dtls_medi_cd = rx.add( tempData , "dtls_medi_cd" , "");		
		for(int i=0; i<ds.curlist11.size(); i++){ 
			AD_RES_1200_MCURLIST11Record rec = (AD_RES_1200_MCURLIST11Record)ds.curlist11.get(i);
			int item  = rx.add( dtls_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}	
		//디지털 - 게재구분		
		int pubc_clas_350 = rx.add( tempData , "pubc_clas_350" , "");		
		for(int i=0; i<ds.curlist12.size(); i++){ 
			AD_RES_1200_MCURLIST12Record rec = (AD_RES_1200_MCURLIST12Record)ds.curlist12.get(i);
			int item  = rx.add( pubc_clas_350 , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}	
		//행사년도 시작
		int evnt_yy = rx.add( tempData , "evnt_yy" , "");
		String chk_cd = "";
		String sub_cd = "";
		for(int i=0; i<ds.curlist13.size(); i++){ 
			AD_RES_1200_MCURLIST13Record rec = (AD_RES_1200_MCURLIST13Record)ds.curlist13.get(i);
			String cd = rec.cd;
			sub_cd = cd.substring(0,4);
			
			if(!chk_cd.equals(sub_cd)){
				int item  = rx.add( evnt_yy , "item" , "");
				rx.add ( item, "value", sub_cd);
				rx.add ( item, "label", sub_cd);
				chk_cd = sub_cd;
			}
		}			
		//최종년도가 현재년도보다 작은경우
		GregorianCalendar today = new GregorianCalendar ( );
		int year = today.get(today.YEAR);
		int Int_cd = Integer.parseInt(sub_cd);
		if(Int_cd < year){
			int item  = rx.add( evnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(year));
			rx.add ( item, "label", Integer.toString(year));		
		}		
		//행사코드
		int evnt_cd = rx.add( tempData , "evnt_cd" , "");		
		for(int i=0; i<ds.curlist13.size(); i++){ 
			AD_RES_1200_MCURLIST13Record rec = (AD_RES_1200_MCURLIST13Record)ds.curlist13.get(i);
			int item  = rx.add( evnt_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
			rx.add ( item, "pcode", rec.cd.substring(0,4));
		}	
		//행사년도 끝
		
		//ALC행사년도 시작
		int alc_evnt_yy = rx.add( tempData , "alc_evnt_yy" , "");
		String alc_chk_cd = "";
		String alc_sub_cd = "";
		for(int i=0; i<ds.curlist13.size(); i++){ 
			AD_RES_1200_MCURLIST13Record rec = (AD_RES_1200_MCURLIST13Record)ds.curlist13.get(i);
			String cd = rec.cd;
			alc_sub_cd = cd.substring(0,4);
			
			if(!alc_chk_cd.equals(alc_sub_cd)){
				int item  = rx.add( alc_evnt_yy , "item" , "");
				rx.add ( item, "value", alc_sub_cd);
				rx.add ( item, "label", alc_sub_cd);
				alc_chk_cd = alc_sub_cd;
			}
		}			
		//최종년도가 현재년도보다 작은경우
		GregorianCalendar alc_today = new GregorianCalendar ( );
		int alc_year = alc_today.get(alc_today.YEAR);
		int alc_Int_cd = Integer.parseInt(alc_sub_cd);
		if(alc_Int_cd < alc_year){
			int item  = rx.add( alc_evnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(alc_year));
			rx.add ( item, "label", Integer.toString(alc_year));		
		}		
		//alc 행사코드
		int alc_evnt_cd = rx.add( tempData , "alc_evnt_cd" , "");		
		for(int i=0; i<ds.curlist13.size(); i++){ 
			AD_RES_1200_MCURLIST13Record rec = (AD_RES_1200_MCURLIST13Record)ds.curlist13.get(i);
			if(rec.cdnm.contains("ALC")){
				int item  = rx.add( alc_evnt_cd , "item" , "");
				rx.add ( item, "value", rec.cd );
				rx.add ( item, "label", rec.cd+" "+rec.cdnm);
				rx.add ( item, "pcode", rec.cd.substring(0,4));
			}
		}	
		//ALC행사년도 끝
		
	//문화사업 시작
	//행사년도
		int Mevnt_yy = rx.add( tempData , "Mevnt_yy" , "");
		String Mchk_cd = "";
		String Msub_cd = "";
		for(int i=0; i<ds.curlist14.size(); i++){ 
			AD_RES_1200_MCURLIST14Record rec = (AD_RES_1200_MCURLIST14Record)ds.curlist14.get(i);
			String cd = rec.cd;
			Msub_cd = cd.substring(0,4);
			
			if(!Mchk_cd.equals(Msub_cd)){
				int item  = rx.add( Mevnt_yy , "item" , "");
				rx.add ( item, "value", Msub_cd);
				rx.add ( item, "label", Msub_cd);
				Mchk_cd = Msub_cd;
			}
		}			
		//최종년도가 현재년도보다 작은경우
		GregorianCalendar Mtoday = new GregorianCalendar ( );
		int Myear = Mtoday.get(Mtoday.YEAR);
		int MInt_cd = Integer.parseInt(Msub_cd);
		if(MInt_cd < Myear){
			int item  = rx.add( Mevnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(Myear));
			rx.add ( item, "label", Integer.toString(Myear));		
		}		
	//행사코드
		int Mevnt_cd = rx.add( tempData , "Mevnt_cd" , "");		
		for(int i=0; i<ds.curlist14.size(); i++){ 
			AD_RES_1200_MCURLIST14Record rec = (AD_RES_1200_MCURLIST14Record)ds.curlist14.get(i);
			int item  = rx.add( Mevnt_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
			rx.add ( item, "pcode", rec.cd.substring(0,4));
		}								
	//문화사업 끝	
									
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