<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1000_MDataSet ds = (AD_PUB_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){
			AD_PUB_1000_MCURLIST1Record rec = (AD_PUB_1000_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			
		}	
	
		int advt_clas = rx.add( tempData , "advt_clas" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_PUB_1000_MCURLIST2Record rec = (AD_PUB_1000_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( advt_clas , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int chro_clsf = rx.add( tempData , "chro_clsf" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_PUB_1000_MCURLIST3Record rec = (AD_PUB_1000_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( chro_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int pubc_clsf = rx.add( tempData , "pubc_clsf" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_PUB_1000_MCURLIST4Record rec = (AD_PUB_1000_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( pubc_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int grp_cmpy_cd = rx.add( tempData , "grp_cmpy_cd" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_PUB_1000_MCURLIST5Record rec = (AD_PUB_1000_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( grp_cmpy_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int mony_kind = rx.add( tempData , "mony_kind" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_PUB_1000_MCURLIST6Record rec = (AD_PUB_1000_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( mony_kind , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int edt_clsf = rx.add( tempData , "edt_clsf" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_PUB_1000_MCURLIST7Record rec = (AD_PUB_1000_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( edt_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//�η��ڵ�		
		int appndx_clsf = rx.add( tempData , "appndx_clsf" , "");		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_PUB_1000_MCURLIST8Record rec = (AD_PUB_1000_MCURLIST8Record)ds.curlist8.get(i);
			int item  = rx.add( appndx_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//��������		
		int upd_resn = rx.add( tempData , "upd_resn" , "");		
		for(int i=0; i<ds.curlist9.size(); i++){
			AD_PUB_1000_MCURLIST9Record rec = (AD_PUB_1000_MCURLIST9Record)ds.curlist9.get(i);
			int item  = rx.add( upd_resn , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//��ü�ڵ�		
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist10.size(); i++){
			AD_PUB_1000_MCURLIST10Record rec = (AD_PUB_1000_MCURLIST10Record)ds.curlist10.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
//�԰ݱ���		
		int std_clsf = rx.add( tempData , "std_clsf" , "");		
		for(int i=0; i<ds.curlist11.size(); i++){
			AD_PUB_1000_MCURLIST11Record rec = (AD_PUB_1000_MCURLIST11Record)ds.curlist11.get(i);
			int item  = rx.add( std_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
//����Ⱓ		
		int pubc_prd = rx.add( tempData , "pubc_prd" , "");		
		for(int i=0; i<ds.curlist12.size(); i++){
			AD_PUB_1000_MCURLIST12Record rec = (AD_PUB_1000_MCURLIST12Record)ds.curlist12.get(i);
			int item  = rx.add( pubc_prd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
//�����Ǳ���		
		int hp_edt_clsf = rx.add( tempData , "hp_edt_clsf" , "");		
		for(int i=0; i<ds.curlist13.size(); i++){
			AD_PUB_1000_MCURLIST13Record rec = (AD_PUB_1000_MCURLIST13Record)ds.curlist13.get(i);
			int item  = rx.add( hp_edt_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
//��������		
		int nwsp_side_type = rx.add( tempData , "nwsp_side_type" , "");		
		for(int i=0; i<ds.curlist14.size(); i++){
			AD_PUB_1000_MCURLIST14Record rec = (AD_PUB_1000_MCURLIST14Record)ds.curlist14.get(i);
			int item  = rx.add( nwsp_side_type , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
//���̵�� - �󼼸�ü�ڵ�		
		int dtls_medi_cd = rx.add( tempData , "dtls_medi_cd" , "");		
		for(int i=0; i<ds.curlist15.size(); i++){
			AD_PUB_1000_MCURLIST15Record rec = (AD_PUB_1000_MCURLIST15Record)ds.curlist15.get(i);
			int item  = rx.add( nwsp_side_type , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}			
	//������ - �󼼸�ü�ڵ�		
		int dtnb_medi_cd = rx.add( tempData , "dtnb_medi_cd" , "");		
		for(int i=0; i<ds.curlist16.size(); i++){ 
			AD_PUB_1000_MCURLIST16Record rec = (AD_PUB_1000_MCURLIST16Record)ds.curlist16.get(i);
			int item  = rx.add( nwsp_side_type , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
	//����ڵ� ����
	//���⵵
		int evnt_yy = rx.add( tempData , "evnt_yy" , "");
		String chk_cd = "";
		String sub_cd = "";
		for(int i=0; i<ds.curlist17.size(); i++){ 
			AD_PUB_1000_MCURLIST17Record rec = (AD_PUB_1000_MCURLIST17Record)ds.curlist17.get(i);
			String cd = rec.cd;
			sub_cd = cd.substring(0,4);
			
			if(!chk_cd.equals(sub_cd)){
				int item  = rx.add( evnt_yy , "item" , "");
				rx.add ( item, "value", sub_cd);
				rx.add ( item, "label", sub_cd);
				chk_cd = sub_cd;
			}
		}			
		//�����⵵�� ����⵵���� �������
		GregorianCalendar today = new GregorianCalendar ( );
		int year = today.get(today.YEAR);
		int Int_cd = Integer.parseInt(sub_cd);
		if(Int_cd < year){
			int item  = rx.add( evnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(year));
			rx.add ( item, "label", Integer.toString(year));		
		}		
	//����ڵ�
		int evnt_cd = rx.add( tempData , "evnt_cd" , "");		
		for(int i=0; i<ds.curlist17.size(); i++){ 
			AD_PUB_1000_MCURLIST17Record rec = (AD_PUB_1000_MCURLIST17Record)ds.curlist17.get(i);
			int item  = rx.add( evnt_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
			rx.add ( item, "pcode", rec.cd.substring(0,4));
		}	
		//����ڵ� ��
		
		//alc ����
		//���⵵
		int alc_evnt_yy = rx.add( tempData , "alc_evnt_yy" , "");
		String alc_chk_cd = "";
		String alc_sub_cd = "";
		for(int i=0; i<ds.curlist17.size(); i++){ 
			AD_PUB_1000_MCURLIST17Record rec = (AD_PUB_1000_MCURLIST17Record)ds.curlist17.get(i);
			String cd = rec.cd;
			alc_sub_cd = cd.substring(0,4);
			
			if(!alc_chk_cd.equals(alc_sub_cd)){
				int item  = rx.add( alc_evnt_yy , "item" , "");
				rx.add ( item, "value", alc_sub_cd);
				rx.add ( item, "label", alc_sub_cd);
				alc_chk_cd = alc_sub_cd;
			}
		}			
		//�����⵵�� ����⵵���� �������
		GregorianCalendar alc_today = new GregorianCalendar ( );
		int alc_year = today.get(alc_today.YEAR);
		int alc_Int_cd = Integer.parseInt(alc_sub_cd);
		if(alc_Int_cd < alc_year){
			int item  = rx.add( alc_evnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(alc_year));
			rx.add ( item, "label", Integer.toString(alc_year));		
		}		
	//alc ����ڵ�
		int alc_evnt_cd = rx.add( tempData , "alc_evnt_cd" , "");		
		for(int i=0; i<ds.curlist17.size(); i++){ 
			AD_PUB_1000_MCURLIST17Record rec = (AD_PUB_1000_MCURLIST17Record)ds.curlist17.get(i);
			if(rec.cdnm.contains("ALC")){
				int item  = rx.add( alc_evnt_cd , "item" , "");
				rx.add ( item, "value", rec.cd );
				rx.add ( item, "label", rec.cd+" "+rec.cdnm);
				rx.add ( item, "pcode", rec.cd.substring(0,4));
			}
		}
	//alc ��
	
	//������ ���- �󼼸�ü�ڵ�		
		int dtev_medi_cd = rx.add( tempData , "dtev_medi_cd" , "");		
		for(int i=0; i<ds.curlist18.size(); i++){ 
			AD_PUB_1000_MCURLIST18Record rec = (AD_PUB_1000_MCURLIST18Record)ds.curlist18.get(i);
			int item  = rx.add( dtev_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}	
	//��ȭ��� ����
	//���⵵
		int Mevnt_yy = rx.add( tempData , "Mevnt_yy" , "");
		String Mchk_cd = "";
		String Msub_cd = "";
		for(int i=0; i<ds.curlist19.size(); i++){ 
			AD_PUB_1000_MCURLIST19Record rec = (AD_PUB_1000_MCURLIST19Record)ds.curlist19.get(i);
			String cd = rec.cd;
			Msub_cd = cd.substring(0,4);
			
			if(!Mchk_cd.equals(Msub_cd)){
				int item  = rx.add( Mevnt_yy , "item" , "");
				rx.add ( item, "value", Msub_cd);
				rx.add ( item, "label", Msub_cd);
				Mchk_cd = Msub_cd;
			}
		}			
		//�����⵵�� ����⵵���� �������
		GregorianCalendar Mtoday = new GregorianCalendar ( );
		int Myear = Mtoday.get(Mtoday.YEAR);
		int MInt_cd = Integer.parseInt(Msub_cd);
		if(MInt_cd < Myear){
			int item  = rx.add( Mevnt_yy , "item" , "");
			rx.add ( item, "value", Integer.toString(Myear));
			rx.add ( item, "label", Integer.toString(Myear));		
		}		
	//����ڵ�
		int Mevnt_cd = rx.add( tempData , "Mevnt_cd" , "");		
		for(int i=0; i<ds.curlist19.size(); i++){ 
			AD_PUB_1000_MCURLIST19Record rec = (AD_PUB_1000_MCURLIST19Record)ds.curlist19.get(i);
			int item  = rx.add( Mevnt_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
			rx.add ( item, "pcode", rec.cd.substring(0,4));
		}								
	//��ȭ��� ��		
		
		int pubc_clsf_nmd = rx.add( tempData , "pubc_clsf_nmd" , "");		
		for(int i=0; i<ds.curlist20.size(); i++){
			AD_PUB_1000_MCURLIST20Record rec = (AD_PUB_1000_MCURLIST20Record)ds.curlist20.get(i);
			int item  = rx.add( pubc_clsf_nmd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
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