<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.base.util.*
    ,   somo.framework.util.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1030_s.jsp
* 기능 : 지국정보관리 - 지국장탭 조회
* 작성일자 : 2009-02-06
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	
	RwXml rx = new RwXml();
	SE_BOI_1030_SDataSet ds = (SE_BOI_1030_SDataSet)request.getAttribute("ds");
    
	int root = RwXml.rootNodeID;
	int formData = 0;
	int dtlform = 0;
	int dtlgrid1 = 0;
	int dtlgrid2 = 0;
	int dtlgrid3 = 0;
	int record = 0;
	int sub1 = 0;
	int sub2 = 0;

	formData  = rx.add(root , "tab2form" , "");
	dtlform  = rx.add(formData , "dtlform" , "");
				
	try {

		if(ds != null){
				
			rx.add(dtlform, "accflag" ,""); 
			rx.add(dtlform, "multiUpdateData1" ,""); 
			rx.add(dtlform, "multiUpdateData2" ,""); 
			rx.add(dtlform, "multiUpdateData3" ,"");  
			
	
			rx.addCData(dtlform, "bo_head_nm" 		,ds.bo_head_nm 	);  	
			rx.add(dtlform, "bo_head_prn"    	,ds.bo_head_prn	); 
			rx.add(dtlform, "tel_no_0"     		,ds.tel_no_0  	);     
			rx.add(dtlform, "tel_no_1"     		,ds.tel_no_1  	); 
			rx.add(dtlform, "tel_no_2"     	 	,ds.tel_no_2  	); 
			rx.add(dtlform, "tel_no_3"     	 	,ds.tel_no_3	); 
			rx.add(dtlform, "ptph_no_1"	     	,ds.ptph_no_1	); 
			rx.add(dtlform, "ptph_no_2"	     	,ds.ptph_no_2	);     
			rx.add(dtlform, "ptph_no_3" 	    ,ds.ptph_no_3 	);     
			rx.add(dtlform, "bo_head_bidt"     	,ds.bo_head_bidt	); 
			rx.add(dtlform, "luso_clsf"    	  	,ds.luso_clsf	); 
			rx.add(dtlform, "wedd_anvy_dd"   	,ds.wedd_anvy_dd 	); 
			//rx.add(dtlform, "zip_1"     	    ,ds.zip_1   	); 
			//rx.add(dtlform, "zip_2"  	     	,ds.zip_2  	 	); 
			rx.add(dtlform, "zip"  	     		,ds.zip_1+ds.zip_2  	 	);
			rx.add(dtlform, "addr"     	     	,ds.addr     	);     
			rx.add(dtlform, "dtls_addr"     	,ds.dtls_addr 	);     
			rx.add(dtlform, "nativ"     		,ds.nativ 	);     
			rx.add(dtlform, "hby"     			,ds.hby 	);     
			rx.add(dtlform, "relg"     			,ds.relg 	);     
			rx.add(dtlform, "drink_qunt"     	,ds.drink_qunt 	);     
			rx.add(dtlform, "smok_yn"     		,ds.smok_yn 	);   
			//rx.add(dtlform, "bo_head_phot"     	,ds.bo_head_phot	);  
			rx.add(dtlform, "phot_size"     	,ds.phot_size 	);     
			rx.add(dtlform, "dlco_no"     	    ,ds.dlco_no 	); 
			rx.add(dtlform, "ern"     	        ,ds.ern 	); 
			rx.add(dtlform, "acct_info"     	," "+ds.bank_nm+" "+ds.acct_no+" "+ds.rcpm_main_nm 	); 
			
			if(ds.bo_head_phot != null || !"".equals(ds.phot_size)){
	       		String filenm = ds.bo_head_prn + ".gif";
	       		//String filepath = request.getRealPath("") +"/images/photo/";
	       		String imgpath = "/jsp/se/boi/bohead_img/";
	       		File f = new File(request.getRealPath("")+imgpath);
      					if (!f.exists()){
      						f.mkdirs();            					
            		}
	       		String filepath = request.getRealPath("") + imgpath;
	       		ImageUtil.savePhoto(filepath, filenm, ds.bo_head_phot);
				rx.add(dtlform, "bo_head_phot"     	,imgpath+filenm	);  
	       	}else{
				rx.add(dtlform, "bo_head_phot"     	,""	);  
	       	}
            		
		}
		
		dtlgrid1  = rx.add(formData , "dtlgrid1" , "");
		for(int i = 0; i < ds.boheadhstycur.size(); i++) {
			SE_BOI_1030_SBOHEADHSTYCURRecord rec = (SE_BOI_1030_SBOHEADHSTYCURRecord)ds.boheadhstycur.get(i);
			
			record = rx.add(dtlgrid1, "record", "");
			rx.add(record, "hsty_seq", rec.hsty_seq);
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "hsty_matt", rec.hsty_matt);
		}
	
		dtlgrid2  = rx.add(formData , "dtlgrid2" , "");
		for(int i = 0; i < ds.boheadfamcur.size(); i++) {
			SE_BOI_1030_SBOHEADFAMCURRecord rec = (SE_BOI_1030_SBOHEADFAMCURRecord)ds.boheadfamcur.get(i);
			
			record = rx.add(dtlgrid2, "record", "");
			rx.add(record, "faml_seq", rec.faml_seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "bidt", rec.bidt);
			rx.add(record, "luso_clsf", rec.luso_clsf);
		}
		
		dtlgrid3  = rx.add(formData , "dtlgrid3" , "");
		for(int i = 0; i < ds.boheadideacur.size(); i++) {
			SE_BOI_1030_SBOHEADIDEACURRecord rec = (SE_BOI_1030_SBOHEADIDEACURRecord)ds.boheadideacur.get(i);
			
			record = rx.add(dtlgrid3, "record", "");
			rx.add(record, "idea_seq", rec.idea_seq);
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			rx.add(record, "idea", rec.idea);
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
