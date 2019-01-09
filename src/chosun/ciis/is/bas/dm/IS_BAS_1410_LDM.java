/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1410_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf;
	public String dlco_cd_seq_fr;
	public String dlco_cd_seq_to;
	public String dlco_nm;
	public String ern;
	public String presi_nm;
	public String cntr_stat_clsf;
	public String leaf_sale_yn;
	public String leaf_purc_yn;
	public String dmang_bo_yn;
	public String outsd_leaf_cmpy_yn;
	public String vexc_cmpy_yn;
	public String design_cmpy_yn;
	public String excep_main_prt_plac_yn;
	public String isgrp_yn;
	public String sp_deal_yn;

	public IS_BAS_1410_LDM(){}
	public IS_BAS_1410_LDM(String cmpy_cd, String dlco_clsf, String dlco_cd_seq_fr, String dlco_cd_seq_to, String dlco_nm, String ern, String presi_nm, String cntr_stat_clsf, String leaf_sale_yn, String leaf_purc_yn, String dmang_bo_yn, String outsd_leaf_cmpy_yn, String vexc_cmpy_yn, String design_cmpy_yn, String excep_main_prt_plac_yn, String isgrp_yn, String sp_deal_yn){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf = dlco_clsf;
		this.dlco_cd_seq_fr = dlco_cd_seq_fr;
		this.dlco_cd_seq_to = dlco_cd_seq_to;
		this.dlco_nm = dlco_nm;
		this.ern = ern;
		this.presi_nm = presi_nm;
		this.cntr_stat_clsf = cntr_stat_clsf;
		this.leaf_sale_yn = leaf_sale_yn;
		this.leaf_purc_yn = leaf_purc_yn;
		this.dmang_bo_yn = dmang_bo_yn;
		this.outsd_leaf_cmpy_yn = outsd_leaf_cmpy_yn;
		this.vexc_cmpy_yn = vexc_cmpy_yn;
		this.design_cmpy_yn = design_cmpy_yn;
		this.excep_main_prt_plac_yn = excep_main_prt_plac_yn;
		this.isgrp_yn = isgrp_yn;
		this.sp_deal_yn = sp_deal_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd_seq_fr(String dlco_cd_seq_fr){
		this.dlco_cd_seq_fr = dlco_cd_seq_fr;
	}

	public void setDlco_cd_seq_to(String dlco_cd_seq_to){
		this.dlco_cd_seq_to = dlco_cd_seq_to;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setLeaf_sale_yn(String leaf_sale_yn){
		this.leaf_sale_yn = leaf_sale_yn;
	}

	public void setLeaf_purc_yn(String leaf_purc_yn){
		this.leaf_purc_yn = leaf_purc_yn;
	}

	public void setDmang_bo_yn(String dmang_bo_yn){
		this.dmang_bo_yn = dmang_bo_yn;
	}

	public void setOutsd_leaf_cmpy_yn(String outsd_leaf_cmpy_yn){
		this.outsd_leaf_cmpy_yn = outsd_leaf_cmpy_yn;
	}

	public void setVexc_cmpy_yn(String vexc_cmpy_yn){
		this.vexc_cmpy_yn = vexc_cmpy_yn;
	}

	public void setDesign_cmpy_yn(String design_cmpy_yn){
		this.design_cmpy_yn = design_cmpy_yn;
	}

	public void setExcep_main_prt_plac_yn(String excep_main_prt_plac_yn){
		this.excep_main_prt_plac_yn = excep_main_prt_plac_yn;
	}

	public void setIsgrp_yn(String isgrp_yn){
		this.isgrp_yn = isgrp_yn;
	}

	public void setSp_deal_yn(String sp_deal_yn){
		this.sp_deal_yn = sp_deal_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd_seq_fr(){
		return this.dlco_cd_seq_fr;
	}

	public String getDlco_cd_seq_to(){
		return this.dlco_cd_seq_to;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getLeaf_sale_yn(){
		return this.leaf_sale_yn;
	}

	public String getLeaf_purc_yn(){
		return this.leaf_purc_yn;
	}

	public String getDmang_bo_yn(){
		return this.dmang_bo_yn;
	}

	public String getOutsd_leaf_cmpy_yn(){
		return this.outsd_leaf_cmpy_yn;
	}

	public String getVexc_cmpy_yn(){
		return this.vexc_cmpy_yn;
	}

	public String getDesign_cmpy_yn(){
		return this.design_cmpy_yn;
	}

	public String getExcep_main_prt_plac_yn(){
		return this.excep_main_prt_plac_yn;
	}

	public String getIsgrp_yn(){
		return this.isgrp_yn;
	}

	public String getSp_deal_yn(){
		return this.sp_deal_yn;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1410_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1410_LDM dm = (IS_BAS_1410_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf);
		cstmt.setString(5, dm.dlco_cd_seq_fr);
		cstmt.setString(6, dm.dlco_cd_seq_to);
		cstmt.setString(7, dm.dlco_nm);
		cstmt.setString(8, dm.ern);
		cstmt.setString(9, dm.presi_nm);
		cstmt.setString(10, dm.cntr_stat_clsf);
		cstmt.setString(11, dm.leaf_sale_yn);
		cstmt.setString(12, dm.leaf_purc_yn);
		cstmt.setString(13, dm.dmang_bo_yn);
		cstmt.setString(14, dm.outsd_leaf_cmpy_yn);
		cstmt.setString(15, dm.vexc_cmpy_yn);
		cstmt.setString(16, dm.design_cmpy_yn);
		cstmt.setString(17, dm.excep_main_prt_plac_yn);
		cstmt.setString(18, dm.isgrp_yn);
		cstmt.setString(19, dm.sp_deal_yn);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1410_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("dlco_cd_seq_fr = [" + getDlco_cd_seq_fr() + "]");
		System.out.println("dlco_cd_seq_to = [" + getDlco_cd_seq_to() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("cntr_stat_clsf = [" + getCntr_stat_clsf() + "]");
		System.out.println("leaf_sale_yn = [" + getLeaf_sale_yn() + "]");
		System.out.println("leaf_purc_yn = [" + getLeaf_purc_yn() + "]");
		System.out.println("dmang_bo_yn = [" + getDmang_bo_yn() + "]");
		System.out.println("outsd_leaf_cmpy_yn = [" + getOutsd_leaf_cmpy_yn() + "]");
		System.out.println("vexc_cmpy_yn = [" + getVexc_cmpy_yn() + "]");
		System.out.println("design_cmpy_yn = [" + getDesign_cmpy_yn() + "]");
		System.out.println("excep_main_prt_plac_yn = [" + getExcep_main_prt_plac_yn() + "]");
		System.out.println("isgrp_yn = [" + getIsgrp_yn() + "]");
		System.out.println("sp_deal_yn = [" + getSp_deal_yn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String dlco_cd_seq_fr = req.getParameter("dlco_cd_seq_fr");
if( dlco_cd_seq_fr == null){
	System.out.println(this.toString+" : dlco_cd_seq_fr is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_seq_fr is "+dlco_cd_seq_fr );
}
String dlco_cd_seq_to = req.getParameter("dlco_cd_seq_to");
if( dlco_cd_seq_to == null){
	System.out.println(this.toString+" : dlco_cd_seq_to is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_seq_to is "+dlco_cd_seq_to );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String cntr_stat_clsf = req.getParameter("cntr_stat_clsf");
if( cntr_stat_clsf == null){
	System.out.println(this.toString+" : cntr_stat_clsf is null" );
}else{
	System.out.println(this.toString+" : cntr_stat_clsf is "+cntr_stat_clsf );
}
String leaf_sale_yn = req.getParameter("leaf_sale_yn");
if( leaf_sale_yn == null){
	System.out.println(this.toString+" : leaf_sale_yn is null" );
}else{
	System.out.println(this.toString+" : leaf_sale_yn is "+leaf_sale_yn );
}
String leaf_purc_yn = req.getParameter("leaf_purc_yn");
if( leaf_purc_yn == null){
	System.out.println(this.toString+" : leaf_purc_yn is null" );
}else{
	System.out.println(this.toString+" : leaf_purc_yn is "+leaf_purc_yn );
}
String dmang_bo_yn = req.getParameter("dmang_bo_yn");
if( dmang_bo_yn == null){
	System.out.println(this.toString+" : dmang_bo_yn is null" );
}else{
	System.out.println(this.toString+" : dmang_bo_yn is "+dmang_bo_yn );
}
String outsd_leaf_cmpy_yn = req.getParameter("outsd_leaf_cmpy_yn");
if( outsd_leaf_cmpy_yn == null){
	System.out.println(this.toString+" : outsd_leaf_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : outsd_leaf_cmpy_yn is "+outsd_leaf_cmpy_yn );
}
String vexc_cmpy_yn = req.getParameter("vexc_cmpy_yn");
if( vexc_cmpy_yn == null){
	System.out.println(this.toString+" : vexc_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_yn is "+vexc_cmpy_yn );
}
String design_cmpy_yn = req.getParameter("design_cmpy_yn");
if( design_cmpy_yn == null){
	System.out.println(this.toString+" : design_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : design_cmpy_yn is "+design_cmpy_yn );
}
String excep_main_prt_plac_yn = req.getParameter("excep_main_prt_plac_yn");
if( excep_main_prt_plac_yn == null){
	System.out.println(this.toString+" : excep_main_prt_plac_yn is null" );
}else{
	System.out.println(this.toString+" : excep_main_prt_plac_yn is "+excep_main_prt_plac_yn );
}
String isgrp_yn = req.getParameter("isgrp_yn");
if( isgrp_yn == null){
	System.out.println(this.toString+" : isgrp_yn is null" );
}else{
	System.out.println(this.toString+" : isgrp_yn is "+isgrp_yn );
}
String sp_deal_yn = req.getParameter("sp_deal_yn");
if( sp_deal_yn == null){
	System.out.println(this.toString+" : sp_deal_yn is null" );
}else{
	System.out.println(this.toString+" : sp_deal_yn is "+sp_deal_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String dlco_cd_seq_fr = Util.checkString(req.getParameter("dlco_cd_seq_fr"));
String dlco_cd_seq_to = Util.checkString(req.getParameter("dlco_cd_seq_to"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String ern = Util.checkString(req.getParameter("ern"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String cntr_stat_clsf = Util.checkString(req.getParameter("cntr_stat_clsf"));
String leaf_sale_yn = Util.checkString(req.getParameter("leaf_sale_yn"));
String leaf_purc_yn = Util.checkString(req.getParameter("leaf_purc_yn"));
String dmang_bo_yn = Util.checkString(req.getParameter("dmang_bo_yn"));
String outsd_leaf_cmpy_yn = Util.checkString(req.getParameter("outsd_leaf_cmpy_yn"));
String vexc_cmpy_yn = Util.checkString(req.getParameter("vexc_cmpy_yn"));
String design_cmpy_yn = Util.checkString(req.getParameter("design_cmpy_yn"));
String excep_main_prt_plac_yn = Util.checkString(req.getParameter("excep_main_prt_plac_yn"));
String isgrp_yn = Util.checkString(req.getParameter("isgrp_yn"));
String sp_deal_yn = Util.checkString(req.getParameter("sp_deal_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String dlco_cd_seq_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_seq_fr")));
String dlco_cd_seq_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_seq_to")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String cntr_stat_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_stat_clsf")));
String leaf_sale_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_sale_yn")));
String leaf_purc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_purc_yn")));
String dmang_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("dmang_bo_yn")));
String outsd_leaf_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_leaf_cmpy_yn")));
String vexc_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_yn")));
String design_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("design_cmpy_yn")));
String excep_main_prt_plac_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("excep_main_prt_plac_yn")));
String isgrp_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("isgrp_yn")));
String sp_deal_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sp_deal_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf(dlco_clsf);
dm.setDlco_cd_seq_fr(dlco_cd_seq_fr);
dm.setDlco_cd_seq_to(dlco_cd_seq_to);
dm.setDlco_nm(dlco_nm);
dm.setErn(ern);
dm.setPresi_nm(presi_nm);
dm.setCntr_stat_clsf(cntr_stat_clsf);
dm.setLeaf_sale_yn(leaf_sale_yn);
dm.setLeaf_purc_yn(leaf_purc_yn);
dm.setDmang_bo_yn(dmang_bo_yn);
dm.setOutsd_leaf_cmpy_yn(outsd_leaf_cmpy_yn);
dm.setVexc_cmpy_yn(vexc_cmpy_yn);
dm.setDesign_cmpy_yn(design_cmpy_yn);
dm.setExcep_main_prt_plac_yn(excep_main_prt_plac_yn);
dm.setIsgrp_yn(isgrp_yn);
dm.setSp_deal_yn(sp_deal_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 26 16:34:03 KST 2012 */