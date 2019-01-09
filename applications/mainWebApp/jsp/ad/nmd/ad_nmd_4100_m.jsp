<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	somo.framework.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	String dealmedicd = Util.getSessionParameterValue(request, "dealmedicd", true);
	
	RwXml rx = new RwXml();
	AD_NMD_4100_MDataSet ds = (AD_NMD_4100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	//환경변수
	rx.add(tempData,"xx_note_clsf_cd_001",ds.xx_note_clsf_cd_001);
	rx.add(tempData,"xx_note_clsf_cd_002",ds.xx_note_clsf_cd_002);	
	rx.add(tempData,"xx_note_clsf_cd_003",ds.xx_note_clsf_cd_003);	
	rx.add(tempData,"xx_note_clsf_cd_004",ds.xx_note_clsf_cd_004);	
	rx.add(tempData,"xx_note_clsf_cd_005",ds.xx_note_clsf_cd_005);
	rx.add(tempData,"xx_job_clsf_02",ds.xx_job_clsf_02);
	rx.add(tempData,"xx_cd_clsf_006",ds.xx_cd_clsf_006);
	rx.add(tempData,"xx_medi_cd_001",ds.xx_medi_cd_001);
	rx.add(tempData,"xx_medi_cd_002",ds.xx_medi_cd_002);	
	rx.add(tempData,"xx_cd_clsf_007",ds.xx_cd_clsf_007);		
	try {
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			AD_NMD_4100_MCURLIST1Record rec = (AD_NMD_4100_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
//			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			rx.add ( item, "label", rec.cd +" "+ "법인");
			int j = i + 1;			
			if(j == ds.curlist1.size() ){
				rx.add ( item, "value", "10" );
				rx.add ( item, "label", "10 개인");				
			}			
		}	
	
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			AD_NMD_4100_MCURLIST2Record rec = (AD_NMD_4100_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int issu_cmpy_clsf_cd = rx.add( tempData , "issu_cmpy_clsf_cd" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			AD_NMD_4100_MCURLIST3Record rec = (AD_NMD_4100_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( issu_cmpy_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int depo_job_clsf = rx.add( tempData , "depo_job_clsf" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			AD_NMD_4100_MCURLIST4Record rec = (AD_NMD_4100_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( depo_job_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int note_clsf = rx.add( tempData , "note_clsf" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			AD_NMD_4100_MCURLIST5Record rec = (AD_NMD_4100_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( note_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		int prercpm_medi_cd = rx.add( tempData , "prercpm_medi_cd" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			AD_NMD_4100_MCURLIST6Record rec = (AD_NMD_4100_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( prercpm_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		int budg_cd_l_001 = rx.add( tempData , "budg_cd_l_001" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			AD_NMD_4100_MCURLIST7Record rec = (AD_NMD_4100_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( prercpm_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}	
		int budg_cd_l_002 = rx.add( tempData , "budg_cd_l_002" , "");		
		for(int i=0; i<ds.curlist8.size(); i++){
			AD_NMD_4100_MCURLIST8Record rec = (AD_NMD_4100_MCURLIST8Record)ds.curlist8.get(i);
			int item  = rx.add( prercpm_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}					
		if("5".equals(dealmedicd)){
			rx.add(tempData, "slip_clsf", "24");
		}else if("3".equals(dealmedicd)){
			rx.add(tempData, "slip_clsf", "24");
		}else{
			rx.add(tempData, "slip_clsf", "24");
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