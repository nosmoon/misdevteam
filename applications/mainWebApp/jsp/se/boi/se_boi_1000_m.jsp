<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1000_m.jsp
* 기능 : 지국정보관리 - 초기화면
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
	SE_BOI_1000_MDataSet ds = (SE_BOI_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	//initData = rx.add(root, "initData", "");
	//comboSet = rx.add(initData, "comboSet", "");
	comboSet = rx.add(root, "comboSet", "");

	try {
		int teamlist = rx.add(comboSet, "teamlist", "");		
		for(int i = 0; i < ds.team_cdcur.size(); i++) {
			SE_BOI_1000_MTEAM_CDCURRecord rec = (SE_BOI_1000_MTEAM_CDCURRecord)ds.team_cdcur.get(i);
			int record = rx.add(teamlist, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm", rec.dept_nm);			//부서명
		}
		int partlist_temp = rx.add(comboSet, "partlist_temp", "");
		for(int i = 0; i < ds.part_cdcur.size(); i++) {
			SE_BOI_1000_MPART_CDCURRecord rec = (SE_BOI_1000_MPART_CDCURRecord)ds.part_cdcur.get(i);
			int record = rx.add(partlist_temp, "record", "");
			rx.add(record, "dept_cd"		, rec.dept_cd);  		//부서코드
			rx.add(record, "dept_nm"		, rec.dept_nm);			//부서명
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);	//상위부서코드
		}
		int arealist_temp = rx.add(comboSet, "arealist_temp", "");
		for(int i = 0; i < ds.area_cdcur.size(); i++) {
			SE_BOI_1000_MAREA_CDCURRecord rec = (SE_BOI_1000_MAREA_CDCURRecord)ds.area_cdcur.get(i);
			int record = rx.add(arealist_temp, "record", "");
			rx.add(record, "area_cd"		, rec.area_cd);  		//지역코드
			rx.add(record, "area_nm"		, rec.area_nm);			//지역코드명
			rx.add(record, "dept_cd"		, rec.dept_cd);			//부서코드
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd);    //상위부서코드
		}
		int orgn_clsf = rx.add(comboSet, "orgn_clsf", "");	
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR1Record rec = (SE_BOI_1000_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			
			int item  = rx.add( orgn_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		int area_cd = rx.add(comboSet, "area_cd", "");
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR2Record rec = (SE_BOI_1000_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			
			int item  = rx.add( area_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
			rx.add ( item, "chrg_pers", rec.chrg_pers );
			rx.add ( item, "chrg_persnm", rec.chrg_persnm );
		}
		
		int cntr_stat_clsf = rx.add(comboSet, "cntr_stat_clsf", "");
		int item1  = rx.add( cntr_stat_clsf , "item" , "");
		rx.add ( item1, "value", "");
		rx.add ( item1, "label", "전체");
		for(int i = 0; i < ds.commcdcur3.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR3Record rec = (SE_BOI_1000_MCOMMCDCUR3Record)ds.commcdcur3.get(i);
			
			int item  = rx.add( cntr_stat_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int cntr_stat_clsf2 = rx.add(comboSet, "cntr_stat_clsf2", "");
		int item2  = rx.add( cntr_stat_clsf2 , "item" , "");
		rx.add ( item2, "value", "");
		rx.add ( item2, "label", "");
		for(int i = 0; i < ds.commcdcur3.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR3Record rec = (SE_BOI_1000_MCOMMCDCUR3Record)ds.commcdcur3.get(i);
			
			int item  = rx.add( cntr_stat_clsf2 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int bo_feat_clsf = rx.add(comboSet, "bo_feat_clsf", "");
		int item3  = rx.add( bo_feat_clsf , "item" , "");
		rx.add ( item3, "value", "");
		rx.add ( item3, "label", "");
		for(int i = 0; i < ds.commcdcur4.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR4Record rec = (SE_BOI_1000_MCOMMCDCUR4Record)ds.commcdcur4.get(i);
			
			int item  = rx.add( bo_feat_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int bo_mang_grad_clas = rx.add(comboSet, "bo_mang_grad_clas", "");
		int item4  = rx.add( bo_mang_grad_clas , "item" , "");
		rx.add ( item4, "value", "");
		rx.add ( item4, "label", "");
		for(int i = 0; i < ds.commcdcur5.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR5Record rec = (SE_BOI_1000_MCOMMCDCUR5Record)ds.commcdcur5.get(i);
			
			int item  = rx.add( bo_mang_grad_clas , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int stmt_crte_clsf = rx.add(comboSet, "stmt_crte_clsf", "");
		int item5  = rx.add( stmt_crte_clsf , "item" , "");
		rx.add ( item5, "value", "");
		rx.add ( item5, "label", "");
		for(int i = 0; i < ds.commcdcur6.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR6Record rec = (SE_BOI_1000_MCOMMCDCUR6Record)ds.commcdcur6.get(i);
			
			int item  = rx.add( stmt_crte_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int jd_sell_net_clsf = rx.add(comboSet, "jd_sell_net_clsf", "");
		int item6  = rx.add( jd_sell_net_clsf , "item" , "");
		rx.add ( item6, "value", "");
		rx.add ( item6, "label", "");
		for(int i = 0; i < ds.commcdcur7.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR7Record rec = (SE_BOI_1000_MCOMMCDCUR7Record)ds.commcdcur7.get(i);
			
			int item  = rx.add( jd_sell_net_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int qty_sell_net_clsf = rx.add(comboSet, "qty_sell_net_clsf", "");
		int item7  = rx.add( qty_sell_net_clsf , "item" , "");
		rx.add ( item7, "value", "");
		rx.add ( item7, "label", "");
		for(int i = 0; i < ds.commcdcur7.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR7Record rec = (SE_BOI_1000_MCOMMCDCUR7Record)ds.commcdcur7.get(i);
			
			int item  = rx.add( qty_sell_net_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int clam_grp = rx.add(comboSet, "clam_grp", "");
		int item8  = rx.add( clam_grp , "item" , "");
		rx.add ( item8, "value", "");
		rx.add ( item8, "label", "");
		for(int i = 0; i < ds.commcdcur8.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR8Record rec = (SE_BOI_1000_MCOMMCDCUR8Record)ds.commcdcur8.get(i);
			
			int item  = rx.add( clam_grp , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int adms_dstc_cd = rx.add(comboSet, "adms_dstc_cd", "");
		int item9  = rx.add( adms_dstc_cd , "item" , "");
		rx.add ( item9, "value", "");
		rx.add ( item9, "label", "");
		for(int i = 0; i < ds.commcdcur9.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR9Record rec = (SE_BOI_1000_MCOMMCDCUR9Record)ds.commcdcur9.get(i);
			
			int item  = rx.add( adms_dstc_cd , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int adms_unit_clsf = rx.add(comboSet, "adms_unit_clsf", "");
		int item10  = rx.add( adms_unit_clsf , "item" , "");
		rx.add ( item10, "value", "");
		rx.add ( item10, "label", "");
		for(int i = 0; i < ds.commcdcur10.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR10Record rec = (SE_BOI_1000_MCOMMCDCUR10Record)ds.commcdcur10.get(i);
			
			int item  = rx.add( adms_unit_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int luso_clsf = rx.add(comboSet, "luso_clsf", "");
		for(int i = 0; i < ds.commcdcur11.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR11Record rec = (SE_BOI_1000_MCOMMCDCUR11Record)ds.commcdcur11.get(i);
			
			int item  = rx.add( luso_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		
		int fam_clsf = rx.add(comboSet, "fam_clsf", "");
		for(int i = 0; i < ds.commcdcur12.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR12Record rec = (SE_BOI_1000_MCOMMCDCUR12Record)ds.commcdcur12.get(i);
			
			int item  = rx.add( fam_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int inn_ptcr_clsf = rx.add(comboSet, "inn_ptcr_clsf", "");
		for(int i = 0; i < ds.commcdcur13.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR13Record rec = (SE_BOI_1000_MCOMMCDCUR13Record)ds.commcdcur13.get(i);
			
			int item  = rx.add( inn_ptcr_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int exp_ptcr_clsf = rx.add(comboSet, "exp_ptcr_clsf", "");
		for(int i = 0; i < ds.commcdcur14.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR14Record rec = (SE_BOI_1000_MCOMMCDCUR14Record)ds.commcdcur14.get(i);
			
			int item  = rx.add( exp_ptcr_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int relg = rx.add(comboSet, "relg", "");
		for(int i = 0; i < ds.commcdcur15.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR15Record rec = (SE_BOI_1000_MCOMMCDCUR15Record)ds.commcdcur15.get(i);
			
			int item  = rx.add( relg , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		int ptph_no_1 = rx.add(comboSet, "ptph_no_1", "");
		for(int i = 0; i < ds.commcdcur17.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR17Record rec = (SE_BOI_1000_MCOMMCDCUR17Record)ds.commcdcur17.get(i);
			
			int item  = rx.add( ptph_no_1 , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd);
		}
		
		int bo_mang_type = rx.add(comboSet, "bo_mang_type", "");
		for(int i = 0; i < ds.commcdcur18.size(); i++) {
			SE_BOI_1000_MCOMMCDCUR18Record rec = (SE_BOI_1000_MCOMMCDCUR18Record)ds.commcdcur18.get(i);
			
			int item  = rx.add( bo_mang_type , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}
		
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
