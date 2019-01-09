/***************************************************************************************************
* 파일명 : .java
* 기능 : 임대사업_임대계약관리
* 작성일자 : 2010-01-22
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 임대사업_임대계약관리
 */


public class AS_LEAS_1108_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;
	public String aset_no;
	public String leas_fr_dt;
	public String leas_to_dt;
	public String draft_no;
	public String cntr_leas_amt;
	public String leas_cntr_dt;
	public String cntr_mang_amt;
	public String midw_expy_dt;
	public String cntr_gurt_amt;
	public String cntr_star;
	public String leas_clam_cycl;
	public String mang_clam_cycl;
	public String pymt_clsf;
	public String expy_remk;
	public String good_clsf;
	public String ser_no;
	public String leas_area_size;
	public String remk;
	public String gurt_dlco_ern;
	public String ref_cntr_no;
	public String leas_dlco_ern;
	public String hire_dlco_clsf_cd;
	public String hire_dlco_ern;
	public String end_clsf;
	public String gurt_tot_amt;
	public String gurt_amt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String frex_rcpm_yn;
	public String email;

	public AS_LEAS_1108_IDM(){}
	public AS_LEAS_1108_IDM(String cmpy_cd, String bldg_cd, String cntr_yy, String cntr_seq, String aset_no, String leas_fr_dt, String leas_to_dt, String draft_no, String cntr_leas_amt, String leas_cntr_dt, String cntr_mang_amt, String midw_expy_dt, String cntr_gurt_amt, String cntr_star, String leas_clam_cycl, String mang_clam_cycl, String pymt_clsf, String expy_remk, String good_clsf, String ser_no, String leas_area_size, String remk, String gurt_dlco_ern, String ref_cntr_no, String leas_dlco_ern, String hire_dlco_clsf_cd, String hire_dlco_ern, String end_clsf, String gurt_tot_amt, String gurt_amt, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String frex_rcpm_yn, String email){
		this.cmpy_cd = cmpy_cd;
		this.bldg_cd = bldg_cd;
		this.cntr_yy = cntr_yy;
		this.cntr_seq = cntr_seq;
		this.aset_no = aset_no;
		this.leas_fr_dt = leas_fr_dt;
		this.leas_to_dt = leas_to_dt;
		this.draft_no = draft_no;
		this.cntr_leas_amt = cntr_leas_amt;
		this.leas_cntr_dt = leas_cntr_dt;
		this.cntr_mang_amt = cntr_mang_amt;
		this.midw_expy_dt = midw_expy_dt;
		this.cntr_gurt_amt = cntr_gurt_amt;
		this.cntr_star = cntr_star;
		this.leas_clam_cycl = leas_clam_cycl;
		this.mang_clam_cycl = mang_clam_cycl;
		this.pymt_clsf = pymt_clsf;
		this.expy_remk = expy_remk;
		this.good_clsf = good_clsf;
		this.ser_no = ser_no;
		this.leas_area_size = leas_area_size;
		this.remk = remk;
		this.gurt_dlco_ern = gurt_dlco_ern;
		this.ref_cntr_no = ref_cntr_no;
		this.leas_dlco_ern = leas_dlco_ern;
		this.hire_dlco_clsf_cd = hire_dlco_clsf_cd;
		this.hire_dlco_ern = hire_dlco_ern;
		this.end_clsf = end_clsf;
		this.gurt_tot_amt = gurt_tot_amt;
		this.gurt_amt = gurt_amt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.frex_rcpm_yn = frex_rcpm_yn;
		this.email = email;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setLeas_fr_dt(String leas_fr_dt){
		this.leas_fr_dt = leas_fr_dt;
	}

	public void setLeas_to_dt(String leas_to_dt){
		this.leas_to_dt = leas_to_dt;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setCntr_leas_amt(String cntr_leas_amt){
		this.cntr_leas_amt = cntr_leas_amt;
	}

	public void setLeas_cntr_dt(String leas_cntr_dt){
		this.leas_cntr_dt = leas_cntr_dt;
	}

	public void setCntr_mang_amt(String cntr_mang_amt){
		this.cntr_mang_amt = cntr_mang_amt;
	}

	public void setMidw_expy_dt(String midw_expy_dt){
		this.midw_expy_dt = midw_expy_dt;
	}

	public void setCntr_gurt_amt(String cntr_gurt_amt){
		this.cntr_gurt_amt = cntr_gurt_amt;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public void setLeas_clam_cycl(String leas_clam_cycl){
		this.leas_clam_cycl = leas_clam_cycl;
	}

	public void setMang_clam_cycl(String mang_clam_cycl){
		this.mang_clam_cycl = mang_clam_cycl;
	}

	public void setPymt_clsf(String pymt_clsf){
		this.pymt_clsf = pymt_clsf;
	}

	public void setExpy_remk(String expy_remk){
		this.expy_remk = expy_remk;
	}

	public void setGood_clsf(String good_clsf){
		this.good_clsf = good_clsf;
	}

	public void setSer_no(String ser_no){
		this.ser_no = ser_no;
	}

	public void setLeas_area_size(String leas_area_size){
		this.leas_area_size = leas_area_size;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setGurt_dlco_ern(String gurt_dlco_ern){
		this.gurt_dlco_ern = gurt_dlco_ern;
	}

	public void setRef_cntr_no(String ref_cntr_no){
		this.ref_cntr_no = ref_cntr_no;
	}

	public void setLeas_dlco_ern(String leas_dlco_ern){
		this.leas_dlco_ern = leas_dlco_ern;
	}

	public void setHire_dlco_clsf_cd(String hire_dlco_clsf_cd){
		this.hire_dlco_clsf_cd = hire_dlco_clsf_cd;
	}

	public void setHire_dlco_ern(String hire_dlco_ern){
		this.hire_dlco_ern = hire_dlco_ern;
	}

	public void setEnd_clsf(String end_clsf){
		this.end_clsf = end_clsf;
	}

	public void setGurt_tot_amt(String gurt_tot_amt){
		this.gurt_tot_amt = gurt_tot_amt;
	}

	public void setGurt_amt(String gurt_amt){
		this.gurt_amt = gurt_amt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setFrex_rcpm_yn(String frex_rcpm_yn){
		this.frex_rcpm_yn = frex_rcpm_yn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getLeas_fr_dt(){
		return this.leas_fr_dt;
	}

	public String getLeas_to_dt(){
		return this.leas_to_dt;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getCntr_leas_amt(){
		return this.cntr_leas_amt;
	}

	public String getLeas_cntr_dt(){
		return this.leas_cntr_dt;
	}

	public String getCntr_mang_amt(){
		return this.cntr_mang_amt;
	}

	public String getMidw_expy_dt(){
		return this.midw_expy_dt;
	}

	public String getCntr_gurt_amt(){
		return this.cntr_gurt_amt;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}

	public String getLeas_clam_cycl(){
		return this.leas_clam_cycl;
	}

	public String getMang_clam_cycl(){
		return this.mang_clam_cycl;
	}

	public String getPymt_clsf(){
		return this.pymt_clsf;
	}

	public String getExpy_remk(){
		return this.expy_remk;
	}

	public String getGood_clsf(){
		return this.good_clsf;
	}

	public String getSer_no(){
		return this.ser_no;
	}

	public String getLeas_area_size(){
		return this.leas_area_size;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getGurt_dlco_ern(){
		return this.gurt_dlco_ern;
	}

	public String getRef_cntr_no(){
		return this.ref_cntr_no;
	}

	public String getLeas_dlco_ern(){
		return this.leas_dlco_ern;
	}

	public String getHire_dlco_clsf_cd(){
		return this.hire_dlco_clsf_cd;
	}

	public String getHire_dlco_ern(){
		return this.hire_dlco_ern;
	}

	public String getEnd_clsf(){
		return this.end_clsf;
	}

	public String getGurt_tot_amt(){
		return this.gurt_tot_amt;
	}

	public String getGurt_amt(){
		return this.gurt_amt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getFrex_rcpm_yn(){
		return this.frex_rcpm_yn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1108_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1108_IDM dm = (AS_LEAS_1108_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bldg_cd);
		cstmt.setString(5, dm.cntr_yy);
		cstmt.setString(6, dm.cntr_seq);
		cstmt.setString(7, dm.aset_no);
		cstmt.setString(8, dm.leas_fr_dt);
		cstmt.setString(9, dm.leas_to_dt);
		cstmt.setString(10, dm.draft_no);
		cstmt.setString(11, dm.cntr_leas_amt);
		cstmt.setString(12, dm.leas_cntr_dt);
		cstmt.setString(13, dm.cntr_mang_amt);
		cstmt.setString(14, dm.midw_expy_dt);
		cstmt.setString(15, dm.cntr_gurt_amt);
		cstmt.setString(16, dm.cntr_star);
		cstmt.setString(17, dm.leas_clam_cycl);
		cstmt.setString(18, dm.mang_clam_cycl);
		cstmt.setString(19, dm.pymt_clsf);
		cstmt.setString(20, dm.expy_remk);
		cstmt.setString(21, dm.good_clsf);
		cstmt.setString(22, dm.ser_no);
		cstmt.setString(23, dm.leas_area_size);
		cstmt.setString(24, dm.remk);
		cstmt.setString(25, dm.gurt_dlco_ern);
		cstmt.setString(26, dm.ref_cntr_no);
		cstmt.setString(27, dm.leas_dlco_ern);
		cstmt.setString(28, dm.hire_dlco_clsf_cd);
		cstmt.setString(29, dm.hire_dlco_ern);
		cstmt.setString(30, dm.end_clsf);
		cstmt.setString(31, dm.gurt_tot_amt);
		cstmt.setString(32, dm.gurt_amt);
		cstmt.setString(33, dm.incmg_pers_ipadd);
		cstmt.setString(34, dm.incmg_pers);
		cstmt.setString(35, dm.chg_pers);
		cstmt.setString(36, dm.frex_rcpm_yn);
		cstmt.setString(37, dm.email);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1108_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("cntr_yy = [" + getCntr_yy() + "]");
		System.out.println("cntr_seq = [" + getCntr_seq() + "]");
		System.out.println("aset_no = [" + getAset_no() + "]");
		System.out.println("leas_fr_dt = [" + getLeas_fr_dt() + "]");
		System.out.println("leas_to_dt = [" + getLeas_to_dt() + "]");
		System.out.println("draft_no = [" + getDraft_no() + "]");
		System.out.println("cntr_leas_amt = [" + getCntr_leas_amt() + "]");
		System.out.println("leas_cntr_dt = [" + getLeas_cntr_dt() + "]");
		System.out.println("cntr_mang_amt = [" + getCntr_mang_amt() + "]");
		System.out.println("midw_expy_dt = [" + getMidw_expy_dt() + "]");
		System.out.println("cntr_gurt_amt = [" + getCntr_gurt_amt() + "]");
		System.out.println("cntr_star = [" + getCntr_star() + "]");
		System.out.println("leas_clam_cycl = [" + getLeas_clam_cycl() + "]");
		System.out.println("mang_clam_cycl = [" + getMang_clam_cycl() + "]");
		System.out.println("pymt_clsf = [" + getPymt_clsf() + "]");
		System.out.println("expy_remk = [" + getExpy_remk() + "]");
		System.out.println("good_clsf = [" + getGood_clsf() + "]");
		System.out.println("ser_no = [" + getSer_no() + "]");
		System.out.println("leas_area_size = [" + getLeas_area_size() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("gurt_dlco_ern = [" + getGurt_dlco_ern() + "]");
		System.out.println("ref_cntr_no = [" + getRef_cntr_no() + "]");
		System.out.println("leas_dlco_ern = [" + getLeas_dlco_ern() + "]");
		System.out.println("hire_dlco_clsf_cd = [" + getHire_dlco_clsf_cd() + "]");
		System.out.println("hire_dlco_ern = [" + getHire_dlco_ern() + "]");
		System.out.println("end_clsf = [" + getEnd_clsf() + "]");
		System.out.println("gurt_tot_amt = [" + getGurt_tot_amt() + "]");
		System.out.println("gurt_amt = [" + getGurt_amt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("frex_rcpm_yn = [" + getFrex_rcpm_yn() + "]");
		System.out.println("email = [" + getEmail() + "]");
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
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String cntr_yy = req.getParameter("cntr_yy");
if( cntr_yy == null){
	System.out.println(this.toString+" : cntr_yy is null" );
}else{
	System.out.println(this.toString+" : cntr_yy is "+cntr_yy );
}
String cntr_seq = req.getParameter("cntr_seq");
if( cntr_seq == null){
	System.out.println(this.toString+" : cntr_seq is null" );
}else{
	System.out.println(this.toString+" : cntr_seq is "+cntr_seq );
}
String aset_no = req.getParameter("aset_no");
if( aset_no == null){
	System.out.println(this.toString+" : aset_no is null" );
}else{
	System.out.println(this.toString+" : aset_no is "+aset_no );
}
String leas_fr_dt = req.getParameter("leas_fr_dt");
if( leas_fr_dt == null){
	System.out.println(this.toString+" : leas_fr_dt is null" );
}else{
	System.out.println(this.toString+" : leas_fr_dt is "+leas_fr_dt );
}
String leas_to_dt = req.getParameter("leas_to_dt");
if( leas_to_dt == null){
	System.out.println(this.toString+" : leas_to_dt is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt is "+leas_to_dt );
}
String draft_no = req.getParameter("draft_no");
if( draft_no == null){
	System.out.println(this.toString+" : draft_no is null" );
}else{
	System.out.println(this.toString+" : draft_no is "+draft_no );
}
String cntr_leas_amt = req.getParameter("cntr_leas_amt");
if( cntr_leas_amt == null){
	System.out.println(this.toString+" : cntr_leas_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_leas_amt is "+cntr_leas_amt );
}
String leas_cntr_dt = req.getParameter("leas_cntr_dt");
if( leas_cntr_dt == null){
	System.out.println(this.toString+" : leas_cntr_dt is null" );
}else{
	System.out.println(this.toString+" : leas_cntr_dt is "+leas_cntr_dt );
}
String cntr_mang_amt = req.getParameter("cntr_mang_amt");
if( cntr_mang_amt == null){
	System.out.println(this.toString+" : cntr_mang_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_mang_amt is "+cntr_mang_amt );
}
String midw_expy_dt = req.getParameter("midw_expy_dt");
if( midw_expy_dt == null){
	System.out.println(this.toString+" : midw_expy_dt is null" );
}else{
	System.out.println(this.toString+" : midw_expy_dt is "+midw_expy_dt );
}
String cntr_gurt_amt = req.getParameter("cntr_gurt_amt");
if( cntr_gurt_amt == null){
	System.out.println(this.toString+" : cntr_gurt_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_gurt_amt is "+cntr_gurt_amt );
}
String cntr_star = req.getParameter("cntr_star");
if( cntr_star == null){
	System.out.println(this.toString+" : cntr_star is null" );
}else{
	System.out.println(this.toString+" : cntr_star is "+cntr_star );
}
String leas_clam_cycl = req.getParameter("leas_clam_cycl");
if( leas_clam_cycl == null){
	System.out.println(this.toString+" : leas_clam_cycl is null" );
}else{
	System.out.println(this.toString+" : leas_clam_cycl is "+leas_clam_cycl );
}
String mang_clam_cycl = req.getParameter("mang_clam_cycl");
if( mang_clam_cycl == null){
	System.out.println(this.toString+" : mang_clam_cycl is null" );
}else{
	System.out.println(this.toString+" : mang_clam_cycl is "+mang_clam_cycl );
}
String pymt_clsf = req.getParameter("pymt_clsf");
if( pymt_clsf == null){
	System.out.println(this.toString+" : pymt_clsf is null" );
}else{
	System.out.println(this.toString+" : pymt_clsf is "+pymt_clsf );
}
String expy_remk = req.getParameter("expy_remk");
if( expy_remk == null){
	System.out.println(this.toString+" : expy_remk is null" );
}else{
	System.out.println(this.toString+" : expy_remk is "+expy_remk );
}
String good_clsf = req.getParameter("good_clsf");
if( good_clsf == null){
	System.out.println(this.toString+" : good_clsf is null" );
}else{
	System.out.println(this.toString+" : good_clsf is "+good_clsf );
}
String ser_no = req.getParameter("ser_no");
if( ser_no == null){
	System.out.println(this.toString+" : ser_no is null" );
}else{
	System.out.println(this.toString+" : ser_no is "+ser_no );
}
String leas_area_size = req.getParameter("leas_area_size");
if( leas_area_size == null){
	System.out.println(this.toString+" : leas_area_size is null" );
}else{
	System.out.println(this.toString+" : leas_area_size is "+leas_area_size );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String gurt_dlco_ern = req.getParameter("gurt_dlco_ern");
if( gurt_dlco_ern == null){
	System.out.println(this.toString+" : gurt_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : gurt_dlco_ern is "+gurt_dlco_ern );
}
String ref_cntr_no = req.getParameter("ref_cntr_no");
if( ref_cntr_no == null){
	System.out.println(this.toString+" : ref_cntr_no is null" );
}else{
	System.out.println(this.toString+" : ref_cntr_no is "+ref_cntr_no );
}
String leas_dlco_ern = req.getParameter("leas_dlco_ern");
if( leas_dlco_ern == null){
	System.out.println(this.toString+" : leas_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : leas_dlco_ern is "+leas_dlco_ern );
}
String hire_dlco_clsf_cd = req.getParameter("hire_dlco_clsf_cd");
if( hire_dlco_clsf_cd == null){
	System.out.println(this.toString+" : hire_dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : hire_dlco_clsf_cd is "+hire_dlco_clsf_cd );
}
String hire_dlco_ern = req.getParameter("hire_dlco_ern");
if( hire_dlco_ern == null){
	System.out.println(this.toString+" : hire_dlco_ern is null" );
}else{
	System.out.println(this.toString+" : hire_dlco_ern is "+hire_dlco_ern );
}
String end_clsf = req.getParameter("end_clsf");
if( end_clsf == null){
	System.out.println(this.toString+" : end_clsf is null" );
}else{
	System.out.println(this.toString+" : end_clsf is "+end_clsf );
}
String gurt_tot_amt = req.getParameter("gurt_tot_amt");
if( gurt_tot_amt == null){
	System.out.println(this.toString+" : gurt_tot_amt is null" );
}else{
	System.out.println(this.toString+" : gurt_tot_amt is "+gurt_tot_amt );
}
String gurt_amt = req.getParameter("gurt_amt");
if( gurt_amt == null){
	System.out.println(this.toString+" : gurt_amt is null" );
}else{
	System.out.println(this.toString+" : gurt_amt is "+gurt_amt );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String frex_rcpm_yn = req.getParameter("frex_rcpm_yn");
if( frex_rcpm_yn == null){
	System.out.println(this.toString+" : frex_rcpm_yn is null" );
}else{
	System.out.println(this.toString+" : frex_rcpm_yn is "+frex_rcpm_yn );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String cntr_yy = Util.checkString(req.getParameter("cntr_yy"));
String cntr_seq = Util.checkString(req.getParameter("cntr_seq"));
String aset_no = Util.checkString(req.getParameter("aset_no"));
String leas_fr_dt = Util.checkString(req.getParameter("leas_fr_dt"));
String leas_to_dt = Util.checkString(req.getParameter("leas_to_dt"));
String draft_no = Util.checkString(req.getParameter("draft_no"));
String cntr_leas_amt = Util.checkString(req.getParameter("cntr_leas_amt"));
String leas_cntr_dt = Util.checkString(req.getParameter("leas_cntr_dt"));
String cntr_mang_amt = Util.checkString(req.getParameter("cntr_mang_amt"));
String midw_expy_dt = Util.checkString(req.getParameter("midw_expy_dt"));
String cntr_gurt_amt = Util.checkString(req.getParameter("cntr_gurt_amt"));
String cntr_star = Util.checkString(req.getParameter("cntr_star"));
String leas_clam_cycl = Util.checkString(req.getParameter("leas_clam_cycl"));
String mang_clam_cycl = Util.checkString(req.getParameter("mang_clam_cycl"));
String pymt_clsf = Util.checkString(req.getParameter("pymt_clsf"));
String expy_remk = Util.checkString(req.getParameter("expy_remk"));
String good_clsf = Util.checkString(req.getParameter("good_clsf"));
String ser_no = Util.checkString(req.getParameter("ser_no"));
String leas_area_size = Util.checkString(req.getParameter("leas_area_size"));
String remk = Util.checkString(req.getParameter("remk"));
String gurt_dlco_ern = Util.checkString(req.getParameter("gurt_dlco_ern"));
String ref_cntr_no = Util.checkString(req.getParameter("ref_cntr_no"));
String leas_dlco_ern = Util.checkString(req.getParameter("leas_dlco_ern"));
String hire_dlco_clsf_cd = Util.checkString(req.getParameter("hire_dlco_clsf_cd"));
String hire_dlco_ern = Util.checkString(req.getParameter("hire_dlco_ern"));
String end_clsf = Util.checkString(req.getParameter("end_clsf"));
String gurt_tot_amt = Util.checkString(req.getParameter("gurt_tot_amt"));
String gurt_amt = Util.checkString(req.getParameter("gurt_amt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String frex_rcpm_yn = Util.checkString(req.getParameter("frex_rcpm_yn"));
String email = Util.checkString(req.getParameter("email"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String cntr_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_yy")));
String cntr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_seq")));
String aset_no = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no")));
String leas_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_fr_dt")));
String leas_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt")));
String draft_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_no")));
String cntr_leas_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_leas_amt")));
String leas_cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_cntr_dt")));
String cntr_mang_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_mang_amt")));
String midw_expy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("midw_expy_dt")));
String cntr_gurt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_gurt_amt")));
String cntr_star = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_star")));
String leas_clam_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clam_cycl")));
String mang_clam_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clam_cycl")));
String pymt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_clsf")));
String expy_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("expy_remk")));
String good_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("good_clsf")));
String ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ser_no")));
String leas_area_size = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_area_size")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String gurt_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_dlco_ern")));
String ref_cntr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ref_cntr_no")));
String leas_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_dlco_ern")));
String hire_dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_clsf_cd")));
String hire_dlco_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("hire_dlco_ern")));
String end_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("end_clsf")));
String gurt_tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_tot_amt")));
String gurt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_amt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String frex_rcpm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_rcpm_yn")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBldg_cd(bldg_cd);
dm.setCntr_yy(cntr_yy);
dm.setCntr_seq(cntr_seq);
dm.setAset_no(aset_no);
dm.setLeas_fr_dt(leas_fr_dt);
dm.setLeas_to_dt(leas_to_dt);
dm.setDraft_no(draft_no);
dm.setCntr_leas_amt(cntr_leas_amt);
dm.setLeas_cntr_dt(leas_cntr_dt);
dm.setCntr_mang_amt(cntr_mang_amt);
dm.setMidw_expy_dt(midw_expy_dt);
dm.setCntr_gurt_amt(cntr_gurt_amt);
dm.setCntr_star(cntr_star);
dm.setLeas_clam_cycl(leas_clam_cycl);
dm.setMang_clam_cycl(mang_clam_cycl);
dm.setPymt_clsf(pymt_clsf);
dm.setExpy_remk(expy_remk);
dm.setGood_clsf(good_clsf);
dm.setSer_no(ser_no);
dm.setLeas_area_size(leas_area_size);
dm.setRemk(remk);
dm.setGurt_dlco_ern(gurt_dlco_ern);
dm.setRef_cntr_no(ref_cntr_no);
dm.setLeas_dlco_ern(leas_dlco_ern);
dm.setHire_dlco_clsf_cd(hire_dlco_clsf_cd);
dm.setHire_dlco_ern(hire_dlco_ern);
dm.setEnd_clsf(end_clsf);
dm.setGurt_tot_amt(gurt_tot_amt);
dm.setGurt_amt(gurt_amt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFrex_rcpm_yn(frex_rcpm_yn);
dm.setEmail(email);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 21 10:32:34 KST 2010 */