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
    ,   somo.framework.util.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1040_s.jsp
* 기능 : 지국정보관리 - 지국기타정보탭 조회
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
	SE_BOI_1040_SDataSet ds = (SE_BOI_1040_SDataSet)request.getAttribute("ds");
    
	int root = RwXml.rootNodeID;
	int formData = 0;
	int dtlform = 0;
	int dtlgrid1 = 0;
	int dtlgrid2 = 0;
	int dtlgrid3 = 0;
	int record = 0;
	int sub1 = 0;
	int sub2 = 0;

	formData  = rx.add(root , "tab3form" , "");
	dtlform  = rx.add(formData , "dtlform" , "");
				
	try {

		if(ds != null){
			rx.add(dtlform, "jont_debtgurt_limt_amt", ds.getJont_debtgurt_limt_amt() 	);
			rx.add(dtlform, "bogurt_clsf", ds.getBogurt_clsf() 	);
			rx.add(dtlform, "add_bogurt_amt", ds.getAdd_bogurt_amt() 	);
			rx.add(dtlform, "mort_amt", ds.getMort_amt() 	);
			rx.add(dtlform, "insr_clsf", ds.getInsr_clsf() 	);
			rx.add(dtlform, "insr_cmpy", ds.getInsr_cmpy() 	);
			rx.add(dtlform, "insr_no", ds.getInsr_no() 	);
			rx.add(dtlform, "insr_rmk", ds.getInsr_rmk() 	);
			rx.add(dtlform, "insr_amt", ds.getInsr_amt() 	);
			rx.add(dtlform, "insr_prem", ds.getInsr_prem() 	);
			rx.add(dtlform, "insr_fr_dt", ds.getInsr_fr_dt() 	);
			rx.add(dtlform, "insr_to_dt", ds.getInsr_to_dt() 	);
			rx.add(dtlform, "insr_seq", ds.getInsr_seq() 	);
			rx.add(dtlform, "net_sale_amt", ds.getNet_sale_amt() 	);
			
		}
		
		dtlgrid1  = rx.add(formData , "dtlgrid1" , "");
		for(int i = 0; i < ds.tasem_bogurtperscur.size(); i++) {
			SE_BOI_1040_STASEM_BOGURTPERSCURRecord rec = (SE_BOI_1040_STASEM_BOGURTPERSCURRecord)ds.tasem_bogurtperscur.get(i);
			
			record = rx.add(dtlgrid1, "record", "");
			rx.add(record, "gurt_pers_flnm", rec.gurt_pers_flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "zip", rec.zip_1+rec.zip_2);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "dtls_addr", rec.dtls_addr);
			rx.add(record, "tel_no_1", rec.tel_no_1);
			rx.add(record, "tel_no_2", rec.tel_no_2);
			rx.add(record, "tel_no_3", rec.tel_no_3);
			rx.add(record, "ptph_no_1", rec.ptph_no_1);
			rx.add(record, "ptph_no_2", rec.ptph_no_2);
			rx.add(record, "ptph_no_3", rec.ptph_no_3);
			rx.add(record, "gurt_dt", rec.gurt_dt);
			rx.add(record, "reg_resn", rec.reg_resn);
		}
	
		dtlgrid2  = rx.add(formData , "dtlgrid2" , "");
		for(int i = 0; i < ds.bojursdongcur.size(); i++) {
			SE_BOI_1040_SBOJURSDONGCURRecord rec = (SE_BOI_1040_SBOJURSDONGCURRecord)ds.bojursdongcur.get(i);
			
			record = rx.add(dtlgrid2, "record", "");
			rx.add(record, "dongnm", rec.dongnm);
			rx.add(record, "apt_cnt", rec.apt_cnt);
			rx.add(record, "hous_cnt", rec.hous_cnt);
			rx.add(record, "shop_cnt", rec.shop_cnt);
			rx.add(record, "offi_room_cnt", rec.offi_room_cnt);
			rx.add(record, "dongtot", rec.dongtot);
		}
		
		dtlgrid3  = rx.add(formData , "dtlgrid3" , "");
		for(int i = 0; i < ds.bocomndlcocur.size(); i++) {
			SE_BOI_1040_SBOCOMNDLCOCURRecord rec = (SE_BOI_1040_SBOCOMNDLCOCURRecord)ds.bocomndlcocur.get(i);
			
			record = rx.add(dtlgrid3, "record", "");
			rx.add(record, "chg_seq", rec.chg_seq);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "incmg_dt", rec.incmg_dt);
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
