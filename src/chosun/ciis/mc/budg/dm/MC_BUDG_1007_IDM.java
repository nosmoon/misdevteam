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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_1007_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_cd;
	public String budg_clas_cd;
	public String prt_clsf_cd;
	public String budg_type_cd;
	public String budg_cdnm;
	public String budg_cdynm;
	public String clas_cd1;
	public String clas_cd2;
	public String clas_cd3;
	public String clas_cd4;
	public String gain_reso_yn;
	public String cyov_yn;
	public String lesd_yn;
	public String advc_cndt_yn;
	public String limt_chk_yn;
	public String posbfee_yn;
	public String fixfee_yn;
	public String medi_dstb_cd;
	public String dtls_medi_dstb_cd;
	public String whco_ndstb_cd;
	public String whco_comn_cost_yn;
	public String via_dept_cd;
	public String dstb_acct_cd;
	public String drcr_bal_clsf;
	public String use_bgn_dt;
	public String use_end_dt;
	public String use_yn;
	public String incmg_pers;
	public String chg_pers;
	public String dlco_clsf;
	public String mang_item_cd;
	public String mang_item_nm;
	public String mang_item_val;
	public String incmg_pers_ipadd;
	public String other_cmpy_cd;

	public MC_BUDG_1007_IDM(){}
	public MC_BUDG_1007_IDM(String cmpy_cd, String budg_cd, String budg_clas_cd, String prt_clsf_cd, String budg_type_cd, String budg_cdnm, String budg_cdynm, String clas_cd1, String clas_cd2, String clas_cd3, String clas_cd4, String gain_reso_yn, String cyov_yn, String lesd_yn, String advc_cndt_yn, String limt_chk_yn, String posbfee_yn, String fixfee_yn, String medi_dstb_cd, String dtls_medi_dstb_cd, String whco_ndstb_cd, String whco_comn_cost_yn, String via_dept_cd, String dstb_acct_cd, String drcr_bal_clsf, String use_bgn_dt, String use_end_dt, String use_yn, String incmg_pers, String chg_pers, String dlco_clsf, String mang_item_cd, String mang_item_nm, String mang_item_val, String incmg_pers_ipadd, String other_cmpy_cd){
		this.cmpy_cd = cmpy_cd;
		this.budg_cd = budg_cd;
		this.budg_clas_cd = budg_clas_cd;
		this.prt_clsf_cd = prt_clsf_cd;
		this.budg_type_cd = budg_type_cd;
		this.budg_cdnm = budg_cdnm;
		this.budg_cdynm = budg_cdynm;
		this.clas_cd1 = clas_cd1;
		this.clas_cd2 = clas_cd2;
		this.clas_cd3 = clas_cd3;
		this.clas_cd4 = clas_cd4;
		this.gain_reso_yn = gain_reso_yn;
		this.cyov_yn = cyov_yn;
		this.lesd_yn = lesd_yn;
		this.advc_cndt_yn = advc_cndt_yn;
		this.limt_chk_yn = limt_chk_yn;
		this.posbfee_yn = posbfee_yn;
		this.fixfee_yn = fixfee_yn;
		this.medi_dstb_cd = medi_dstb_cd;
		this.dtls_medi_dstb_cd = dtls_medi_dstb_cd;
		this.whco_ndstb_cd = whco_ndstb_cd;
		this.whco_comn_cost_yn = whco_comn_cost_yn;
		this.via_dept_cd = via_dept_cd;
		this.dstb_acct_cd = dstb_acct_cd;
		this.drcr_bal_clsf = drcr_bal_clsf;
		this.use_bgn_dt = use_bgn_dt;
		this.use_end_dt = use_end_dt;
		this.use_yn = use_yn;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.dlco_clsf = dlco_clsf;
		this.mang_item_cd = mang_item_cd;
		this.mang_item_nm = mang_item_nm;
		this.mang_item_val = mang_item_val;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.other_cmpy_cd = other_cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setPrt_clsf_cd(String prt_clsf_cd){
		this.prt_clsf_cd = prt_clsf_cd;
	}

	public void setBudg_type_cd(String budg_type_cd){
		this.budg_type_cd = budg_type_cd;
	}

	public void setBudg_cdnm(String budg_cdnm){
		this.budg_cdnm = budg_cdnm;
	}

	public void setBudg_cdynm(String budg_cdynm){
		this.budg_cdynm = budg_cdynm;
	}

	public void setClas_cd1(String clas_cd1){
		this.clas_cd1 = clas_cd1;
	}

	public void setClas_cd2(String clas_cd2){
		this.clas_cd2 = clas_cd2;
	}

	public void setClas_cd3(String clas_cd3){
		this.clas_cd3 = clas_cd3;
	}

	public void setClas_cd4(String clas_cd4){
		this.clas_cd4 = clas_cd4;
	}

	public void setGain_reso_yn(String gain_reso_yn){
		this.gain_reso_yn = gain_reso_yn;
	}

	public void setCyov_yn(String cyov_yn){
		this.cyov_yn = cyov_yn;
	}

	public void setLesd_yn(String lesd_yn){
		this.lesd_yn = lesd_yn;
	}

	public void setAdvc_cndt_yn(String advc_cndt_yn){
		this.advc_cndt_yn = advc_cndt_yn;
	}

	public void setLimt_chk_yn(String limt_chk_yn){
		this.limt_chk_yn = limt_chk_yn;
	}

	public void setPosbfee_yn(String posbfee_yn){
		this.posbfee_yn = posbfee_yn;
	}

	public void setFixfee_yn(String fixfee_yn){
		this.fixfee_yn = fixfee_yn;
	}

	public void setMedi_dstb_cd(String medi_dstb_cd){
		this.medi_dstb_cd = medi_dstb_cd;
	}

	public void setDtls_medi_dstb_cd(String dtls_medi_dstb_cd){
		this.dtls_medi_dstb_cd = dtls_medi_dstb_cd;
	}

	public void setWhco_ndstb_cd(String whco_ndstb_cd){
		this.whco_ndstb_cd = whco_ndstb_cd;
	}

	public void setWhco_comn_cost_yn(String whco_comn_cost_yn){
		this.whco_comn_cost_yn = whco_comn_cost_yn;
	}

	public void setVia_dept_cd(String via_dept_cd){
		this.via_dept_cd = via_dept_cd;
	}

	public void setDstb_acct_cd(String dstb_acct_cd){
		this.dstb_acct_cd = dstb_acct_cd;
	}

	public void setDrcr_bal_clsf(String drcr_bal_clsf){
		this.drcr_bal_clsf = drcr_bal_clsf;
	}

	public void setUse_bgn_dt(String use_bgn_dt){
		this.use_bgn_dt = use_bgn_dt;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setMang_item_nm(String mang_item_nm){
		this.mang_item_nm = mang_item_nm;
	}

	public void setMang_item_val(String mang_item_val){
		this.mang_item_val = mang_item_val;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setOther_cmpy_cd(String other_cmpy_cd){
		this.other_cmpy_cd = other_cmpy_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getPrt_clsf_cd(){
		return this.prt_clsf_cd;
	}

	public String getBudg_type_cd(){
		return this.budg_type_cd;
	}

	public String getBudg_cdnm(){
		return this.budg_cdnm;
	}

	public String getBudg_cdynm(){
		return this.budg_cdynm;
	}

	public String getClas_cd1(){
		return this.clas_cd1;
	}

	public String getClas_cd2(){
		return this.clas_cd2;
	}

	public String getClas_cd3(){
		return this.clas_cd3;
	}

	public String getClas_cd4(){
		return this.clas_cd4;
	}

	public String getGain_reso_yn(){
		return this.gain_reso_yn;
	}

	public String getCyov_yn(){
		return this.cyov_yn;
	}

	public String getLesd_yn(){
		return this.lesd_yn;
	}

	public String getAdvc_cndt_yn(){
		return this.advc_cndt_yn;
	}

	public String getLimt_chk_yn(){
		return this.limt_chk_yn;
	}

	public String getPosbfee_yn(){
		return this.posbfee_yn;
	}

	public String getFixfee_yn(){
		return this.fixfee_yn;
	}

	public String getMedi_dstb_cd(){
		return this.medi_dstb_cd;
	}

	public String getDtls_medi_dstb_cd(){
		return this.dtls_medi_dstb_cd;
	}

	public String getWhco_ndstb_cd(){
		return this.whco_ndstb_cd;
	}

	public String getWhco_comn_cost_yn(){
		return this.whco_comn_cost_yn;
	}

	public String getVia_dept_cd(){
		return this.via_dept_cd;
	}

	public String getDstb_acct_cd(){
		return this.dstb_acct_cd;
	}

	public String getDrcr_bal_clsf(){
		return this.drcr_bal_clsf;
	}

	public String getUse_bgn_dt(){
		return this.use_bgn_dt;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getMang_item_nm(){
		return this.mang_item_nm;
	}

	public String getMang_item_val(){
		return this.mang_item_val;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getOther_cmpy_cd(){
		return this.other_cmpy_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1007_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1007_IDM dm = (MC_BUDG_1007_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_cd);
		cstmt.setString(5, dm.budg_clas_cd);
		cstmt.setString(6, dm.prt_clsf_cd);
		cstmt.setString(7, dm.budg_type_cd);
		cstmt.setString(8, dm.budg_cdnm);
		cstmt.setString(9, dm.budg_cdynm);
		cstmt.setString(10, dm.clas_cd1);
		cstmt.setString(11, dm.clas_cd2);
		cstmt.setString(12, dm.clas_cd3);
		cstmt.setString(13, dm.clas_cd4);
		cstmt.setString(14, dm.gain_reso_yn);
		cstmt.setString(15, dm.cyov_yn);
		cstmt.setString(16, dm.lesd_yn);
		cstmt.setString(17, dm.advc_cndt_yn);
		cstmt.setString(18, dm.limt_chk_yn);
		cstmt.setString(19, dm.posbfee_yn);
		cstmt.setString(20, dm.fixfee_yn);
		cstmt.setString(21, dm.medi_dstb_cd);
		cstmt.setString(22, dm.dtls_medi_dstb_cd);
		cstmt.setString(23, dm.whco_ndstb_cd);
		cstmt.setString(24, dm.whco_comn_cost_yn);
		cstmt.setString(25, dm.via_dept_cd);
		cstmt.setString(26, dm.dstb_acct_cd);
		cstmt.setString(27, dm.drcr_bal_clsf);
		cstmt.setString(28, dm.use_bgn_dt);
		cstmt.setString(29, dm.use_end_dt);
		cstmt.setString(30, dm.use_yn);
		cstmt.setString(31, dm.incmg_pers);
		cstmt.setString(32, dm.chg_pers);
		cstmt.setString(33, dm.dlco_clsf);
		cstmt.setString(34, dm.mang_item_cd);
		cstmt.setString(35, dm.mang_item_nm);
		cstmt.setString(36, dm.mang_item_val);
		cstmt.setString(37, dm.incmg_pers_ipadd);
		cstmt.setString(38, dm.other_cmpy_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1007_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("budg_clas_cd = [" + getBudg_clas_cd() + "]");
		System.out.println("prt_clsf_cd = [" + getPrt_clsf_cd() + "]");
		System.out.println("budg_type_cd = [" + getBudg_type_cd() + "]");
		System.out.println("budg_cdnm = [" + getBudg_cdnm() + "]");
		System.out.println("budg_cdynm = [" + getBudg_cdynm() + "]");
		System.out.println("clas_cd1 = [" + getClas_cd1() + "]");
		System.out.println("clas_cd2 = [" + getClas_cd2() + "]");
		System.out.println("clas_cd3 = [" + getClas_cd3() + "]");
		System.out.println("clas_cd4 = [" + getClas_cd4() + "]");
		System.out.println("gain_reso_yn = [" + getGain_reso_yn() + "]");
		System.out.println("cyov_yn = [" + getCyov_yn() + "]");
		System.out.println("lesd_yn = [" + getLesd_yn() + "]");
		System.out.println("advc_cndt_yn = [" + getAdvc_cndt_yn() + "]");
		System.out.println("limt_chk_yn = [" + getLimt_chk_yn() + "]");
		System.out.println("posbfee_yn = [" + getPosbfee_yn() + "]");
		System.out.println("fixfee_yn = [" + getFixfee_yn() + "]");
		System.out.println("medi_dstb_cd = [" + getMedi_dstb_cd() + "]");
		System.out.println("dtls_medi_dstb_cd = [" + getDtls_medi_dstb_cd() + "]");
		System.out.println("whco_ndstb_cd = [" + getWhco_ndstb_cd() + "]");
		System.out.println("whco_comn_cost_yn = [" + getWhco_comn_cost_yn() + "]");
		System.out.println("via_dept_cd = [" + getVia_dept_cd() + "]");
		System.out.println("dstb_acct_cd = [" + getDstb_acct_cd() + "]");
		System.out.println("drcr_bal_clsf = [" + getDrcr_bal_clsf() + "]");
		System.out.println("use_bgn_dt = [" + getUse_bgn_dt() + "]");
		System.out.println("use_end_dt = [" + getUse_end_dt() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("mang_item_cd = [" + getMang_item_cd() + "]");
		System.out.println("mang_item_nm = [" + getMang_item_nm() + "]");
		System.out.println("mang_item_val = [" + getMang_item_val() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("other_cmpy_cd = [" + getOther_cmpy_cd() + "]");
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
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String budg_clas_cd = req.getParameter("budg_clas_cd");
if( budg_clas_cd == null){
	System.out.println(this.toString+" : budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_cd is "+budg_clas_cd );
}
String prt_clsf_cd = req.getParameter("prt_clsf_cd");
if( prt_clsf_cd == null){
	System.out.println(this.toString+" : prt_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : prt_clsf_cd is "+prt_clsf_cd );
}
String budg_type_cd = req.getParameter("budg_type_cd");
if( budg_type_cd == null){
	System.out.println(this.toString+" : budg_type_cd is null" );
}else{
	System.out.println(this.toString+" : budg_type_cd is "+budg_type_cd );
}
String budg_cdnm = req.getParameter("budg_cdnm");
if( budg_cdnm == null){
	System.out.println(this.toString+" : budg_cdnm is null" );
}else{
	System.out.println(this.toString+" : budg_cdnm is "+budg_cdnm );
}
String budg_cdynm = req.getParameter("budg_cdynm");
if( budg_cdynm == null){
	System.out.println(this.toString+" : budg_cdynm is null" );
}else{
	System.out.println(this.toString+" : budg_cdynm is "+budg_cdynm );
}
String clas_cd1 = req.getParameter("clas_cd1");
if( clas_cd1 == null){
	System.out.println(this.toString+" : clas_cd1 is null" );
}else{
	System.out.println(this.toString+" : clas_cd1 is "+clas_cd1 );
}
String clas_cd2 = req.getParameter("clas_cd2");
if( clas_cd2 == null){
	System.out.println(this.toString+" : clas_cd2 is null" );
}else{
	System.out.println(this.toString+" : clas_cd2 is "+clas_cd2 );
}
String clas_cd3 = req.getParameter("clas_cd3");
if( clas_cd3 == null){
	System.out.println(this.toString+" : clas_cd3 is null" );
}else{
	System.out.println(this.toString+" : clas_cd3 is "+clas_cd3 );
}
String clas_cd4 = req.getParameter("clas_cd4");
if( clas_cd4 == null){
	System.out.println(this.toString+" : clas_cd4 is null" );
}else{
	System.out.println(this.toString+" : clas_cd4 is "+clas_cd4 );
}
String gain_reso_yn = req.getParameter("gain_reso_yn");
if( gain_reso_yn == null){
	System.out.println(this.toString+" : gain_reso_yn is null" );
}else{
	System.out.println(this.toString+" : gain_reso_yn is "+gain_reso_yn );
}
String cyov_yn = req.getParameter("cyov_yn");
if( cyov_yn == null){
	System.out.println(this.toString+" : cyov_yn is null" );
}else{
	System.out.println(this.toString+" : cyov_yn is "+cyov_yn );
}
String lesd_yn = req.getParameter("lesd_yn");
if( lesd_yn == null){
	System.out.println(this.toString+" : lesd_yn is null" );
}else{
	System.out.println(this.toString+" : lesd_yn is "+lesd_yn );
}
String advc_cndt_yn = req.getParameter("advc_cndt_yn");
if( advc_cndt_yn == null){
	System.out.println(this.toString+" : advc_cndt_yn is null" );
}else{
	System.out.println(this.toString+" : advc_cndt_yn is "+advc_cndt_yn );
}
String limt_chk_yn = req.getParameter("limt_chk_yn");
if( limt_chk_yn == null){
	System.out.println(this.toString+" : limt_chk_yn is null" );
}else{
	System.out.println(this.toString+" : limt_chk_yn is "+limt_chk_yn );
}
String posbfee_yn = req.getParameter("posbfee_yn");
if( posbfee_yn == null){
	System.out.println(this.toString+" : posbfee_yn is null" );
}else{
	System.out.println(this.toString+" : posbfee_yn is "+posbfee_yn );
}
String fixfee_yn = req.getParameter("fixfee_yn");
if( fixfee_yn == null){
	System.out.println(this.toString+" : fixfee_yn is null" );
}else{
	System.out.println(this.toString+" : fixfee_yn is "+fixfee_yn );
}
String medi_dstb_cd = req.getParameter("medi_dstb_cd");
if( medi_dstb_cd == null){
	System.out.println(this.toString+" : medi_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : medi_dstb_cd is "+medi_dstb_cd );
}
String dtls_medi_dstb_cd = req.getParameter("dtls_medi_dstb_cd");
if( dtls_medi_dstb_cd == null){
	System.out.println(this.toString+" : dtls_medi_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_dstb_cd is "+dtls_medi_dstb_cd );
}
String whco_ndstb_cd = req.getParameter("whco_ndstb_cd");
if( whco_ndstb_cd == null){
	System.out.println(this.toString+" : whco_ndstb_cd is null" );
}else{
	System.out.println(this.toString+" : whco_ndstb_cd is "+whco_ndstb_cd );
}
String whco_comn_cost_yn = req.getParameter("whco_comn_cost_yn");
if( whco_comn_cost_yn == null){
	System.out.println(this.toString+" : whco_comn_cost_yn is null" );
}else{
	System.out.println(this.toString+" : whco_comn_cost_yn is "+whco_comn_cost_yn );
}
String via_dept_cd = req.getParameter("via_dept_cd");
if( via_dept_cd == null){
	System.out.println(this.toString+" : via_dept_cd is null" );
}else{
	System.out.println(this.toString+" : via_dept_cd is "+via_dept_cd );
}
String dstb_acct_cd = req.getParameter("dstb_acct_cd");
if( dstb_acct_cd == null){
	System.out.println(this.toString+" : dstb_acct_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_acct_cd is "+dstb_acct_cd );
}
String drcr_bal_clsf = req.getParameter("drcr_bal_clsf");
if( drcr_bal_clsf == null){
	System.out.println(this.toString+" : drcr_bal_clsf is null" );
}else{
	System.out.println(this.toString+" : drcr_bal_clsf is "+drcr_bal_clsf );
}
String use_bgn_dt = req.getParameter("use_bgn_dt");
if( use_bgn_dt == null){
	System.out.println(this.toString+" : use_bgn_dt is null" );
}else{
	System.out.println(this.toString+" : use_bgn_dt is "+use_bgn_dt );
}
String use_end_dt = req.getParameter("use_end_dt");
if( use_end_dt == null){
	System.out.println(this.toString+" : use_end_dt is null" );
}else{
	System.out.println(this.toString+" : use_end_dt is "+use_end_dt );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String mang_item_cd = req.getParameter("mang_item_cd");
if( mang_item_cd == null){
	System.out.println(this.toString+" : mang_item_cd is null" );
}else{
	System.out.println(this.toString+" : mang_item_cd is "+mang_item_cd );
}
String mang_item_nm = req.getParameter("mang_item_nm");
if( mang_item_nm == null){
	System.out.println(this.toString+" : mang_item_nm is null" );
}else{
	System.out.println(this.toString+" : mang_item_nm is "+mang_item_nm );
}
String mang_item_val = req.getParameter("mang_item_val");
if( mang_item_val == null){
	System.out.println(this.toString+" : mang_item_val is null" );
}else{
	System.out.println(this.toString+" : mang_item_val is "+mang_item_val );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String other_cmpy_cd = req.getParameter("other_cmpy_cd");
if( other_cmpy_cd == null){
	System.out.println(this.toString+" : other_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : other_cmpy_cd is "+other_cmpy_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
String prt_clsf_cd = Util.checkString(req.getParameter("prt_clsf_cd"));
String budg_type_cd = Util.checkString(req.getParameter("budg_type_cd"));
String budg_cdnm = Util.checkString(req.getParameter("budg_cdnm"));
String budg_cdynm = Util.checkString(req.getParameter("budg_cdynm"));
String clas_cd1 = Util.checkString(req.getParameter("clas_cd1"));
String clas_cd2 = Util.checkString(req.getParameter("clas_cd2"));
String clas_cd3 = Util.checkString(req.getParameter("clas_cd3"));
String clas_cd4 = Util.checkString(req.getParameter("clas_cd4"));
String gain_reso_yn = Util.checkString(req.getParameter("gain_reso_yn"));
String cyov_yn = Util.checkString(req.getParameter("cyov_yn"));
String lesd_yn = Util.checkString(req.getParameter("lesd_yn"));
String advc_cndt_yn = Util.checkString(req.getParameter("advc_cndt_yn"));
String limt_chk_yn = Util.checkString(req.getParameter("limt_chk_yn"));
String posbfee_yn = Util.checkString(req.getParameter("posbfee_yn"));
String fixfee_yn = Util.checkString(req.getParameter("fixfee_yn"));
String medi_dstb_cd = Util.checkString(req.getParameter("medi_dstb_cd"));
String dtls_medi_dstb_cd = Util.checkString(req.getParameter("dtls_medi_dstb_cd"));
String whco_ndstb_cd = Util.checkString(req.getParameter("whco_ndstb_cd"));
String whco_comn_cost_yn = Util.checkString(req.getParameter("whco_comn_cost_yn"));
String via_dept_cd = Util.checkString(req.getParameter("via_dept_cd"));
String dstb_acct_cd = Util.checkString(req.getParameter("dstb_acct_cd"));
String drcr_bal_clsf = Util.checkString(req.getParameter("drcr_bal_clsf"));
String use_bgn_dt = Util.checkString(req.getParameter("use_bgn_dt"));
String use_end_dt = Util.checkString(req.getParameter("use_end_dt"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String mang_item_cd = Util.checkString(req.getParameter("mang_item_cd"));
String mang_item_nm = Util.checkString(req.getParameter("mang_item_nm"));
String mang_item_val = Util.checkString(req.getParameter("mang_item_val"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String other_cmpy_cd = Util.checkString(req.getParameter("other_cmpy_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_cd")));
String prt_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf_cd")));
String budg_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_type_cd")));
String budg_cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cdnm")));
String budg_cdynm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cdynm")));
String clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd1")));
String clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd2")));
String clas_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd3")));
String clas_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("clas_cd4")));
String gain_reso_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("gain_reso_yn")));
String cyov_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("cyov_yn")));
String lesd_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("lesd_yn")));
String advc_cndt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advc_cndt_yn")));
String limt_chk_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("limt_chk_yn")));
String posbfee_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("posbfee_yn")));
String fixfee_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("fixfee_yn")));
String medi_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_dstb_cd")));
String dtls_medi_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_dstb_cd")));
String whco_ndstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_ndstb_cd")));
String whco_comn_cost_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("whco_comn_cost_yn")));
String via_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("via_dept_cd")));
String dstb_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_acct_cd")));
String drcr_bal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_bal_clsf")));
String use_bgn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_bgn_dt")));
String use_end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_end_dt")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String mang_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_cd")));
String mang_item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_nm")));
String mang_item_val = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_val")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String other_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("other_cmpy_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_cd(budg_cd);
dm.setBudg_clas_cd(budg_clas_cd);
dm.setPrt_clsf_cd(prt_clsf_cd);
dm.setBudg_type_cd(budg_type_cd);
dm.setBudg_cdnm(budg_cdnm);
dm.setBudg_cdynm(budg_cdynm);
dm.setClas_cd1(clas_cd1);
dm.setClas_cd2(clas_cd2);
dm.setClas_cd3(clas_cd3);
dm.setClas_cd4(clas_cd4);
dm.setGain_reso_yn(gain_reso_yn);
dm.setCyov_yn(cyov_yn);
dm.setLesd_yn(lesd_yn);
dm.setAdvc_cndt_yn(advc_cndt_yn);
dm.setLimt_chk_yn(limt_chk_yn);
dm.setPosbfee_yn(posbfee_yn);
dm.setFixfee_yn(fixfee_yn);
dm.setMedi_dstb_cd(medi_dstb_cd);
dm.setDtls_medi_dstb_cd(dtls_medi_dstb_cd);
dm.setWhco_ndstb_cd(whco_ndstb_cd);
dm.setWhco_comn_cost_yn(whco_comn_cost_yn);
dm.setVia_dept_cd(via_dept_cd);
dm.setDstb_acct_cd(dstb_acct_cd);
dm.setDrcr_bal_clsf(drcr_bal_clsf);
dm.setUse_bgn_dt(use_bgn_dt);
dm.setUse_end_dt(use_end_dt);
dm.setUse_yn(use_yn);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setDlco_clsf(dlco_clsf);
dm.setMang_item_cd(mang_item_cd);
dm.setMang_item_nm(mang_item_nm);
dm.setMang_item_val(mang_item_val);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setOther_cmpy_cd(other_cmpy_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 15:03:00 KST 2009 */