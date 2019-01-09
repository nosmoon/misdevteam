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
    ,   somo.framework.util.*
    , 	chosun.ciis.co.base.util.*;  
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1020_s.jsp
* 기능 : 지국정보관리 - 지국등록탭 조회
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
	SE_BOI_1020_SDataSet ds = (SE_BOI_1020_SDataSet)request.getAttribute("ds");
    
	int root = RwXml.rootNodeID;
	int formData = 0;

	formData  = rx.add(root , "tab1form" , "");
							
	try {

		if(ds != null){
			rx.add(formData, "orgn_clsf" 			 ,ds.orgn_clsf 			   );  	
			rx.add(formData, "bo_cd"     		     ,ds.bo_cd     		       ); 
			rx.add(formData, "bo_seq"     		     ,ds.bo_seq     		   );     
			rx.add(formData, "bo_nm"     		     ,ds.bo_nm     		       ); 
			rx.add(formData, "area_cd"     	         ,ds.area_cd     	       ); 
			rx.add(formData, "srt_seq"     	         ,ds.srt_seq     	       ); 
			rx.add(formData, "div_motr_bo_cd"	     ,ds.div_motr_bo_cd+ds.div_motr_bo_seq); 
			//rx.add(formData, "div_motr_bo_seq"	     ,ds.div_motr_bo_seq	   );     
			rx.add(formData, "div_motr_bo_nm" 	     ,ds.div_motr_bo_nm 	   );     
			rx.add(formData, "ref_bo_cd"     	     ,ds.ref_bo_cd+ds.ref_bo_seq ); 
			//rx.add(formData, "ref_bo_seq"    	     ,ds.ref_bo_seq    	       ); 
			rx.add(formData, "ref_bo_nm"     	     ,ds.ref_bo_nm     	       ); 
			rx.add(formData, "chrg_pers"     	     ,ds.chrg_pers     	       ); 
			rx.add(formData, "chrg_pers_nm"  	     ,ds.chrg_pers_nm  	       ); 
			rx.add(formData, "bo_cntr_dt"     	     ,ds.bo_cntr_dt     	   ); 
			rx.add(formData, "org_bo_cntr_dt"    	 ,ds.bo_cntr_dt    	   	   );     
			rx.add(formData, "bo_expy_dt"     	     ,ds.bo_expy_dt     	   );    
			rx.add(formData, "bo_spcf_clsf"     	 ,ds.bo_spcf_clsf     	   );     
			rx.add(formData, "cntr_doc_1"     	     ,ds.cntr_doc_1     	   );      
			rx.add(formData, "cntr_doc_1_1"          ,"21"     	   			   );    
			rx.add(formData, "cntr_doc_2"     	     ,ds.cntr_doc_2     	   );     
			rx.add(formData, "cntr_stat_clsf" 	     ,ds.cntr_stat_clsf 	   );     
			rx.add(formData, "org_cntr_stat_clsf" 	 ,ds.cntr_stat_clsf 	   );     
			rx.add(formData, "jont_debtgurt_limt_amt" ,ds.jont_debtgurt_limt_amt);
			rx.add(formData, "chg_dt_tm"     		 ,ds.chg_dt_tm     		   ); 
			rx.add(formData, "dlco_no"     		     ,ds.dlco_no     		   ); 
			rx.add(formData, "ern"     			     ,ds.ern     			   ); 
			rx.add(formData, "incmg_dt_tm"    		 ,ds.incmg_dt_tm    	   );   
			rx.addCData(formData, "bo_head_nm"    		 ,ds.bo_head_nm    		   ); 
			rx.add(formData, "bo_head_prn"    		 ,ds.bo_head_prn    	   );    
			rx.add(formData, "tel_no_1_0"     		 ,ds.tel_no_1_0     	   );    
			rx.add(formData, "tel_no_1_1"     		 ,ds.tel_no_1_1     	   );    
			rx.add(formData, "tel_no_1_2"     		 ,ds.tel_no_1_2     	   );    
			rx.add(formData, "tel_no_1_3"     		 ,ds.tel_no_1_3     	   );    
			rx.add(formData, "tel_no_2_0"     		 ,ds.tel_no_2_0     	   );    
			rx.add(formData, "tel_no_2_1"     		 ,ds.tel_no_2_1     	   );    
			rx.add(formData, "tel_no_2_2"     		 ,ds.tel_no_2_2     	   );    
			rx.add(formData, "tel_no_2_3"     		 ,ds.tel_no_2_3     	   );    
			//rx.add(formData, "bo_zip_1"     		 ,ds.bo_zip_1     		   ); 
			//rx.add(formData, "bo_zip_2"     		 ,ds.bo_zip_2     		   );
			rx.add(formData, "bo_zip"     			 ,ds.bo_zip_1+ds.bo_zip_2  );
			rx.add(formData, "bo_addr"     		     ,ds.bo_addr     		   ); 
			rx.add(formData, "bo_dtls_addr"     	 ,StringUtil.replaceToXml(ds.bo_dtls_addr   )  ); 
			//rx.add(formData, "jd_zip_1"     		 ,ds.jd_zip_1     		   ); 
			//rx.add(formData, "jd_zip_2"     		 ,ds.jd_zip_2     		   ); 
			rx.add(formData, "jd_zip"     		 	 ,ds.jd_zip_1+ds.jd_zip_2     		   );
			rx.add(formData, "jd_addr"     		     ,ds.jd_addr     		   ); 
			rx.add(formData, "jd_dtls_addr"     	 ,StringUtil.replaceToXml(ds.jd_dtls_addr )    	   ); 
			//rx.add(formData, "bo_jurs_nwsp_zip_1"	 ,ds.bo_jurs_nwsp_zip_1	   ); 
			//rx.add(formData, "bo_jurs_nwsp_zip_2"	 ,ds.bo_jurs_nwsp_zip_2	   ); 
			rx.add(formData, "bo_jurs_nwsp_zip"	 	 ,ds.bo_jurs_nwsp_zip_1+ds.bo_jurs_nwsp_zip_2	   );
			rx.add(formData, "bo_jurs_nwsp_addr"	 ,ds.bo_jurs_nwsp_addr	   ); 
			rx.add(formData, "bo_feat_clsf"     	 ,ds.bo_feat_clsf     	   ); 
			rx.add(formData, "bo_mang_grad_clas"  	 ,ds.bo_mang_grad_clas     );    
			rx.add(formData, "stmt_crte_clsf"     	 ,ds.stmt_crte_clsf        );    
			rx.add(formData, "jd_sell_net_clsf"  	 ,ds.jd_sell_net_clsf  	   );
			rx.add(formData, "qty_sell_net_clsf"  	 ,ds.qty_sell_net_clsf     );    
			rx.add(formData, "invsg_obj_bo"     	 ,ds.invsg_obj_bo     	   );
			rx.add(formData, "jd_clam"     		     ,ds.jd_clam     		   ); 
			rx.add(formData, "clam_grp"     		 ,ds.clam_grp     		   ); 
			rx.add(formData, "add_snd_bo_cd"     	 ,ds.add_snd_bo_cd+ds.add_snd_bo_seq ); 
			//rx.add(formData, "add_snd_bo_seq"    	 ,ds.add_snd_bo_seq    	   ); 
			rx.add(formData, "add_snd_bo_nm"     	 ,ds.add_snd_bo_nm     	   ); 
			rx.add(formData, "adms_dstc_cd"     	 ,ds.adms_dstc_cd     	   ); 
			rx.add(formData, "adms_unit_clsf"     	 ,ds.adms_unit_clsf        ); 
			rx.add(formData, "sido_gugun_cd"     	 ,ds.sido_gugun_cd     	   ); 
			rx.add(formData, "sido_gugun_nm"         ,ds.sido_gugun_nm         );  
			rx.add(formData, "bo_mang_type"          ,ds.bo_mang_type         );  
			rx.add(formData, "dmang_yn"         	 ,ds.dmang_yn         );  
			rx.add(formData, "bo_resv_reg_dt"     	 ,ds.bo_resv_reg_dt     		   ); 
			rx.add(formData, "bo_reg_dt"     		 ,ds.bo_reg_dt     		   ); 
			rx.add(formData, "elec_tax_stmt_yn"      ,ds.elec_tax_stmt_yn     		   ); 
			rx.add(formData, "email"     		 	 ,ds.email     		   ); 
			rx.add(formData, "bogurt_clsf"     		 ,ds.bogurt_clsf     		   );
				
			
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
