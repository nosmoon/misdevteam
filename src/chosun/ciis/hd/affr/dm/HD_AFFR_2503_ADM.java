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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_2503_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String prn;
	public String chk_dt;
	public String chk_hosp_nm;
	public String kidny;
	public String wgt;
	public String std_wgt;
	public String fatt_prov;
	public String blod_pres_high;
	public String blod_pres_low;
	public String puls;
	public String nkd_sght_lft;
	public String nkd_sght_rht;
	public String rvis_sght_lft;
	public String rvis_sght_rht;
	public String spc_idea;
	public String cmpt_idea_ill_nm_cd_1;
	public String cmpt_idea_remk_1;
	public String cmpt_idea_ill_nm_cd_2;
	public String cmpt_idea_remk_2;
	public String cmpt_idea_ill_nm_cd_3;
	public String cmpt_idea_remk_3;
	public String cmpt_idea_ill_nm_cd_4;
	public String cmpt_idea_remk_4;
	public String cmpt_idea_ill_nm_cd_5;
	public String cmpt_idea_remk_5;
	public String blod_sug;
	public String a_blod_hep;
	public String b_blod_hep;
	public String adv_cont;

	public HD_AFFR_2503_ADM(){}
	public HD_AFFR_2503_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String seq, String occr_dt, String incmg_pers_ipadd, String ss_emp_no, String prn, String chk_dt, String chk_hosp_nm, String kidny, String wgt, String std_wgt, String fatt_prov, String blod_pres_high, String blod_pres_low, String puls, String nkd_sght_lft, String nkd_sght_rht, String rvis_sght_lft, String rvis_sght_rht, String spc_idea, String cmpt_idea_ill_nm_cd_1, String cmpt_idea_remk_1, String cmpt_idea_ill_nm_cd_2, String cmpt_idea_remk_2, String cmpt_idea_ill_nm_cd_3, String cmpt_idea_remk_3, String cmpt_idea_ill_nm_cd_4, String cmpt_idea_remk_4, String cmpt_idea_ill_nm_cd_5, String cmpt_idea_remk_5, String blod_sug, String a_blod_hep, String b_blod_hep, String adv_cont){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.prn = prn;
		this.chk_dt = chk_dt;
		this.chk_hosp_nm = chk_hosp_nm;
		this.kidny = kidny;
		this.wgt = wgt;
		this.std_wgt = std_wgt;
		this.fatt_prov = fatt_prov;
		this.blod_pres_high = blod_pres_high;
		this.blod_pres_low = blod_pres_low;
		this.puls = puls;
		this.nkd_sght_lft = nkd_sght_lft;
		this.nkd_sght_rht = nkd_sght_rht;
		this.rvis_sght_lft = rvis_sght_lft;
		this.rvis_sght_rht = rvis_sght_rht;
		this.spc_idea = spc_idea;
		this.cmpt_idea_ill_nm_cd_1 = cmpt_idea_ill_nm_cd_1;
		this.cmpt_idea_remk_1 = cmpt_idea_remk_1;
		this.cmpt_idea_ill_nm_cd_2 = cmpt_idea_ill_nm_cd_2;
		this.cmpt_idea_remk_2 = cmpt_idea_remk_2;
		this.cmpt_idea_ill_nm_cd_3 = cmpt_idea_ill_nm_cd_3;
		this.cmpt_idea_remk_3 = cmpt_idea_remk_3;
		this.cmpt_idea_ill_nm_cd_4 = cmpt_idea_ill_nm_cd_4;
		this.cmpt_idea_remk_4 = cmpt_idea_remk_4;
		this.cmpt_idea_ill_nm_cd_5 = cmpt_idea_ill_nm_cd_5;
		this.cmpt_idea_remk_5 = cmpt_idea_remk_5;
		this.blod_sug = blod_sug;
		this.a_blod_hep = a_blod_hep;
		this.b_blod_hep = b_blod_hep;
		this.adv_cont = adv_cont;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setChk_hosp_nm(String chk_hosp_nm){
		this.chk_hosp_nm = chk_hosp_nm;
	}

	public void setKidny(String kidny){
		this.kidny = kidny;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setStd_wgt(String std_wgt){
		this.std_wgt = std_wgt;
	}

	public void setFatt_prov(String fatt_prov){
		this.fatt_prov = fatt_prov;
	}

	public void setBlod_pres_high(String blod_pres_high){
		this.blod_pres_high = blod_pres_high;
	}

	public void setBlod_pres_low(String blod_pres_low){
		this.blod_pres_low = blod_pres_low;
	}

	public void setPuls(String puls){
		this.puls = puls;
	}

	public void setNkd_sght_lft(String nkd_sght_lft){
		this.nkd_sght_lft = nkd_sght_lft;
	}

	public void setNkd_sght_rht(String nkd_sght_rht){
		this.nkd_sght_rht = nkd_sght_rht;
	}

	public void setRvis_sght_lft(String rvis_sght_lft){
		this.rvis_sght_lft = rvis_sght_lft;
	}

	public void setRvis_sght_rht(String rvis_sght_rht){
		this.rvis_sght_rht = rvis_sght_rht;
	}

	public void setSpc_idea(String spc_idea){
		this.spc_idea = spc_idea;
	}

	public void setCmpt_idea_ill_nm_cd_1(String cmpt_idea_ill_nm_cd_1){
		this.cmpt_idea_ill_nm_cd_1 = cmpt_idea_ill_nm_cd_1;
	}

	public void setCmpt_idea_remk_1(String cmpt_idea_remk_1){
		this.cmpt_idea_remk_1 = cmpt_idea_remk_1;
	}

	public void setCmpt_idea_ill_nm_cd_2(String cmpt_idea_ill_nm_cd_2){
		this.cmpt_idea_ill_nm_cd_2 = cmpt_idea_ill_nm_cd_2;
	}

	public void setCmpt_idea_remk_2(String cmpt_idea_remk_2){
		this.cmpt_idea_remk_2 = cmpt_idea_remk_2;
	}

	public void setCmpt_idea_ill_nm_cd_3(String cmpt_idea_ill_nm_cd_3){
		this.cmpt_idea_ill_nm_cd_3 = cmpt_idea_ill_nm_cd_3;
	}

	public void setCmpt_idea_remk_3(String cmpt_idea_remk_3){
		this.cmpt_idea_remk_3 = cmpt_idea_remk_3;
	}

	public void setCmpt_idea_ill_nm_cd_4(String cmpt_idea_ill_nm_cd_4){
		this.cmpt_idea_ill_nm_cd_4 = cmpt_idea_ill_nm_cd_4;
	}

	public void setCmpt_idea_remk_4(String cmpt_idea_remk_4){
		this.cmpt_idea_remk_4 = cmpt_idea_remk_4;
	}

	public void setCmpt_idea_ill_nm_cd_5(String cmpt_idea_ill_nm_cd_5){
		this.cmpt_idea_ill_nm_cd_5 = cmpt_idea_ill_nm_cd_5;
	}

	public void setCmpt_idea_remk_5(String cmpt_idea_remk_5){
		this.cmpt_idea_remk_5 = cmpt_idea_remk_5;
	}

	public void setBlod_sug(String blod_sug){
		this.blod_sug = blod_sug;
	}

	public void setA_blod_hep(String a_blod_hep){
		this.a_blod_hep = a_blod_hep;
	}

	public void setB_blod_hep(String b_blod_hep){
		this.b_blod_hep = b_blod_hep;
	}

	public void setAdv_cont(String adv_cont){
		this.adv_cont = adv_cont;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getChk_hosp_nm(){
		return this.chk_hosp_nm;
	}

	public String getKidny(){
		return this.kidny;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getStd_wgt(){
		return this.std_wgt;
	}

	public String getFatt_prov(){
		return this.fatt_prov;
	}

	public String getBlod_pres_high(){
		return this.blod_pres_high;
	}

	public String getBlod_pres_low(){
		return this.blod_pres_low;
	}

	public String getPuls(){
		return this.puls;
	}

	public String getNkd_sght_lft(){
		return this.nkd_sght_lft;
	}

	public String getNkd_sght_rht(){
		return this.nkd_sght_rht;
	}

	public String getRvis_sght_lft(){
		return this.rvis_sght_lft;
	}

	public String getRvis_sght_rht(){
		return this.rvis_sght_rht;
	}

	public String getSpc_idea(){
		return this.spc_idea;
	}

	public String getCmpt_idea_ill_nm_cd_1(){
		return this.cmpt_idea_ill_nm_cd_1;
	}

	public String getCmpt_idea_remk_1(){
		return this.cmpt_idea_remk_1;
	}

	public String getCmpt_idea_ill_nm_cd_2(){
		return this.cmpt_idea_ill_nm_cd_2;
	}

	public String getCmpt_idea_remk_2(){
		return this.cmpt_idea_remk_2;
	}

	public String getCmpt_idea_ill_nm_cd_3(){
		return this.cmpt_idea_ill_nm_cd_3;
	}

	public String getCmpt_idea_remk_3(){
		return this.cmpt_idea_remk_3;
	}

	public String getCmpt_idea_ill_nm_cd_4(){
		return this.cmpt_idea_ill_nm_cd_4;
	}

	public String getCmpt_idea_remk_4(){
		return this.cmpt_idea_remk_4;
	}

	public String getCmpt_idea_ill_nm_cd_5(){
		return this.cmpt_idea_ill_nm_cd_5;
	}

	public String getCmpt_idea_remk_5(){
		return this.cmpt_idea_remk_5;
	}

	public String getBlod_sug(){
		return this.blod_sug;
	}

	public String getA_blod_hep(){
		return this.a_blod_hep;
	}

	public String getB_blod_hep(){
		return this.b_blod_hep;
	}

	public String getAdv_cont(){
		return this.adv_cont;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2503_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2503_ADM dm = (HD_AFFR_2503_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.incmg_pers_ipadd);
		cstmt.setString(10, dm.ss_emp_no);
		cstmt.setString(11, dm.prn);
		cstmt.setString(12, dm.chk_dt);
		cstmt.setString(13, dm.chk_hosp_nm);
		cstmt.setString(14, dm.kidny);
		cstmt.setString(15, dm.wgt);
		cstmt.setString(16, dm.std_wgt);
		cstmt.setString(17, dm.fatt_prov);
		cstmt.setString(18, dm.blod_pres_high);
		cstmt.setString(19, dm.blod_pres_low);
		cstmt.setString(20, dm.puls);
		cstmt.setString(21, dm.nkd_sght_lft);
		cstmt.setString(22, dm.nkd_sght_rht);
		cstmt.setString(23, dm.rvis_sght_lft);
		cstmt.setString(24, dm.rvis_sght_rht);
		cstmt.setString(25, dm.spc_idea);
		cstmt.setString(26, dm.cmpt_idea_ill_nm_cd_1);
		cstmt.setString(27, dm.cmpt_idea_remk_1);
		cstmt.setString(28, dm.cmpt_idea_ill_nm_cd_2);
		cstmt.setString(29, dm.cmpt_idea_remk_2);
		cstmt.setString(30, dm.cmpt_idea_ill_nm_cd_3);
		cstmt.setString(31, dm.cmpt_idea_remk_3);
		cstmt.setString(32, dm.cmpt_idea_ill_nm_cd_4);
		cstmt.setString(33, dm.cmpt_idea_remk_4);
		cstmt.setString(34, dm.cmpt_idea_ill_nm_cd_5);
		cstmt.setString(35, dm.cmpt_idea_remk_5);
		cstmt.setString(36, dm.blod_sug);
		cstmt.setString(37, dm.a_blod_hep);
		cstmt.setString(38, dm.b_blod_hep);
		cstmt.setString(39, dm.adv_cont);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2503_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("chk_dt = [" + getChk_dt() + "]");
		System.out.println("chk_hosp_nm = [" + getChk_hosp_nm() + "]");
		System.out.println("kidny = [" + getKidny() + "]");
		System.out.println("wgt = [" + getWgt() + "]");
		System.out.println("std_wgt = [" + getStd_wgt() + "]");
		System.out.println("fatt_prov = [" + getFatt_prov() + "]");
		System.out.println("blod_pres_high = [" + getBlod_pres_high() + "]");
		System.out.println("blod_pres_low = [" + getBlod_pres_low() + "]");
		System.out.println("puls = [" + getPuls() + "]");
		System.out.println("nkd_sght_lft = [" + getNkd_sght_lft() + "]");
		System.out.println("nkd_sght_rht = [" + getNkd_sght_rht() + "]");
		System.out.println("rvis_sght_lft = [" + getRvis_sght_lft() + "]");
		System.out.println("rvis_sght_rht = [" + getRvis_sght_rht() + "]");
		System.out.println("spc_idea = [" + getSpc_idea() + "]");
		System.out.println("cmpt_idea_ill_nm_cd_1 = [" + getCmpt_idea_ill_nm_cd_1() + "]");
		System.out.println("cmpt_idea_remk_1 = [" + getCmpt_idea_remk_1() + "]");
		System.out.println("cmpt_idea_ill_nm_cd_2 = [" + getCmpt_idea_ill_nm_cd_2() + "]");
		System.out.println("cmpt_idea_remk_2 = [" + getCmpt_idea_remk_2() + "]");
		System.out.println("cmpt_idea_ill_nm_cd_3 = [" + getCmpt_idea_ill_nm_cd_3() + "]");
		System.out.println("cmpt_idea_remk_3 = [" + getCmpt_idea_remk_3() + "]");
		System.out.println("cmpt_idea_ill_nm_cd_4 = [" + getCmpt_idea_ill_nm_cd_4() + "]");
		System.out.println("cmpt_idea_remk_4 = [" + getCmpt_idea_remk_4() + "]");
		System.out.println("cmpt_idea_ill_nm_cd_5 = [" + getCmpt_idea_ill_nm_cd_5() + "]");
		System.out.println("cmpt_idea_remk_5 = [" + getCmpt_idea_remk_5() + "]");
		System.out.println("blod_sug = [" + getBlod_sug() + "]");
		System.out.println("a_blod_hep = [" + getA_blod_hep() + "]");
		System.out.println("b_blod_hep = [" + getB_blod_hep() + "]");
		System.out.println("adv_cont = [" + getAdv_cont() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String chk_dt = req.getParameter("chk_dt");
if( chk_dt == null){
	System.out.println(this.toString+" : chk_dt is null" );
}else{
	System.out.println(this.toString+" : chk_dt is "+chk_dt );
}
String chk_hosp_nm = req.getParameter("chk_hosp_nm");
if( chk_hosp_nm == null){
	System.out.println(this.toString+" : chk_hosp_nm is null" );
}else{
	System.out.println(this.toString+" : chk_hosp_nm is "+chk_hosp_nm );
}
String kidny = req.getParameter("kidny");
if( kidny == null){
	System.out.println(this.toString+" : kidny is null" );
}else{
	System.out.println(this.toString+" : kidny is "+kidny );
}
String wgt = req.getParameter("wgt");
if( wgt == null){
	System.out.println(this.toString+" : wgt is null" );
}else{
	System.out.println(this.toString+" : wgt is "+wgt );
}
String std_wgt = req.getParameter("std_wgt");
if( std_wgt == null){
	System.out.println(this.toString+" : std_wgt is null" );
}else{
	System.out.println(this.toString+" : std_wgt is "+std_wgt );
}
String fatt_prov = req.getParameter("fatt_prov");
if( fatt_prov == null){
	System.out.println(this.toString+" : fatt_prov is null" );
}else{
	System.out.println(this.toString+" : fatt_prov is "+fatt_prov );
}
String blod_pres_high = req.getParameter("blod_pres_high");
if( blod_pres_high == null){
	System.out.println(this.toString+" : blod_pres_high is null" );
}else{
	System.out.println(this.toString+" : blod_pres_high is "+blod_pres_high );
}
String blod_pres_low = req.getParameter("blod_pres_low");
if( blod_pres_low == null){
	System.out.println(this.toString+" : blod_pres_low is null" );
}else{
	System.out.println(this.toString+" : blod_pres_low is "+blod_pres_low );
}
String puls = req.getParameter("puls");
if( puls == null){
	System.out.println(this.toString+" : puls is null" );
}else{
	System.out.println(this.toString+" : puls is "+puls );
}
String nkd_sght_lft = req.getParameter("nkd_sght_lft");
if( nkd_sght_lft == null){
	System.out.println(this.toString+" : nkd_sght_lft is null" );
}else{
	System.out.println(this.toString+" : nkd_sght_lft is "+nkd_sght_lft );
}
String nkd_sght_rht = req.getParameter("nkd_sght_rht");
if( nkd_sght_rht == null){
	System.out.println(this.toString+" : nkd_sght_rht is null" );
}else{
	System.out.println(this.toString+" : nkd_sght_rht is "+nkd_sght_rht );
}
String rvis_sght_lft = req.getParameter("rvis_sght_lft");
if( rvis_sght_lft == null){
	System.out.println(this.toString+" : rvis_sght_lft is null" );
}else{
	System.out.println(this.toString+" : rvis_sght_lft is "+rvis_sght_lft );
}
String rvis_sght_rht = req.getParameter("rvis_sght_rht");
if( rvis_sght_rht == null){
	System.out.println(this.toString+" : rvis_sght_rht is null" );
}else{
	System.out.println(this.toString+" : rvis_sght_rht is "+rvis_sght_rht );
}
String spc_idea = req.getParameter("spc_idea");
if( spc_idea == null){
	System.out.println(this.toString+" : spc_idea is null" );
}else{
	System.out.println(this.toString+" : spc_idea is "+spc_idea );
}
String cmpt_idea_ill_nm_cd_1 = req.getParameter("cmpt_idea_ill_nm_cd_1");
if( cmpt_idea_ill_nm_cd_1 == null){
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_1 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_1 is "+cmpt_idea_ill_nm_cd_1 );
}
String cmpt_idea_remk_1 = req.getParameter("cmpt_idea_remk_1");
if( cmpt_idea_remk_1 == null){
	System.out.println(this.toString+" : cmpt_idea_remk_1 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_remk_1 is "+cmpt_idea_remk_1 );
}
String cmpt_idea_ill_nm_cd_2 = req.getParameter("cmpt_idea_ill_nm_cd_2");
if( cmpt_idea_ill_nm_cd_2 == null){
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_2 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_2 is "+cmpt_idea_ill_nm_cd_2 );
}
String cmpt_idea_remk_2 = req.getParameter("cmpt_idea_remk_2");
if( cmpt_idea_remk_2 == null){
	System.out.println(this.toString+" : cmpt_idea_remk_2 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_remk_2 is "+cmpt_idea_remk_2 );
}
String cmpt_idea_ill_nm_cd_3 = req.getParameter("cmpt_idea_ill_nm_cd_3");
if( cmpt_idea_ill_nm_cd_3 == null){
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_3 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_3 is "+cmpt_idea_ill_nm_cd_3 );
}
String cmpt_idea_remk_3 = req.getParameter("cmpt_idea_remk_3");
if( cmpt_idea_remk_3 == null){
	System.out.println(this.toString+" : cmpt_idea_remk_3 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_remk_3 is "+cmpt_idea_remk_3 );
}
String cmpt_idea_ill_nm_cd_4 = req.getParameter("cmpt_idea_ill_nm_cd_4");
if( cmpt_idea_ill_nm_cd_4 == null){
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_4 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_4 is "+cmpt_idea_ill_nm_cd_4 );
}
String cmpt_idea_remk_4 = req.getParameter("cmpt_idea_remk_4");
if( cmpt_idea_remk_4 == null){
	System.out.println(this.toString+" : cmpt_idea_remk_4 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_remk_4 is "+cmpt_idea_remk_4 );
}
String cmpt_idea_ill_nm_cd_5 = req.getParameter("cmpt_idea_ill_nm_cd_5");
if( cmpt_idea_ill_nm_cd_5 == null){
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_5 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_ill_nm_cd_5 is "+cmpt_idea_ill_nm_cd_5 );
}
String cmpt_idea_remk_5 = req.getParameter("cmpt_idea_remk_5");
if( cmpt_idea_remk_5 == null){
	System.out.println(this.toString+" : cmpt_idea_remk_5 is null" );
}else{
	System.out.println(this.toString+" : cmpt_idea_remk_5 is "+cmpt_idea_remk_5 );
}
String blod_sug = req.getParameter("blod_sug");
if( blod_sug == null){
	System.out.println(this.toString+" : blod_sug is null" );
}else{
	System.out.println(this.toString+" : blod_sug is "+blod_sug );
}
String a_blod_hep = req.getParameter("a_blod_hep");
if( a_blod_hep == null){
	System.out.println(this.toString+" : a_blod_hep is null" );
}else{
	System.out.println(this.toString+" : a_blod_hep is "+a_blod_hep );
}
String b_blod_hep = req.getParameter("b_blod_hep");
if( b_blod_hep == null){
	System.out.println(this.toString+" : b_blod_hep is null" );
}else{
	System.out.println(this.toString+" : b_blod_hep is "+b_blod_hep );
}
String adv_cont = req.getParameter("adv_cont");
if( adv_cont == null){
	System.out.println(this.toString+" : adv_cont is null" );
}else{
	System.out.println(this.toString+" : adv_cont is "+adv_cont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String prn = Util.checkString(req.getParameter("prn"));
String chk_dt = Util.checkString(req.getParameter("chk_dt"));
String chk_hosp_nm = Util.checkString(req.getParameter("chk_hosp_nm"));
String kidny = Util.checkString(req.getParameter("kidny"));
String wgt = Util.checkString(req.getParameter("wgt"));
String std_wgt = Util.checkString(req.getParameter("std_wgt"));
String fatt_prov = Util.checkString(req.getParameter("fatt_prov"));
String blod_pres_high = Util.checkString(req.getParameter("blod_pres_high"));
String blod_pres_low = Util.checkString(req.getParameter("blod_pres_low"));
String puls = Util.checkString(req.getParameter("puls"));
String nkd_sght_lft = Util.checkString(req.getParameter("nkd_sght_lft"));
String nkd_sght_rht = Util.checkString(req.getParameter("nkd_sght_rht"));
String rvis_sght_lft = Util.checkString(req.getParameter("rvis_sght_lft"));
String rvis_sght_rht = Util.checkString(req.getParameter("rvis_sght_rht"));
String spc_idea = Util.checkString(req.getParameter("spc_idea"));
String cmpt_idea_ill_nm_cd_1 = Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_1"));
String cmpt_idea_remk_1 = Util.checkString(req.getParameter("cmpt_idea_remk_1"));
String cmpt_idea_ill_nm_cd_2 = Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_2"));
String cmpt_idea_remk_2 = Util.checkString(req.getParameter("cmpt_idea_remk_2"));
String cmpt_idea_ill_nm_cd_3 = Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_3"));
String cmpt_idea_remk_3 = Util.checkString(req.getParameter("cmpt_idea_remk_3"));
String cmpt_idea_ill_nm_cd_4 = Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_4"));
String cmpt_idea_remk_4 = Util.checkString(req.getParameter("cmpt_idea_remk_4"));
String cmpt_idea_ill_nm_cd_5 = Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_5"));
String cmpt_idea_remk_5 = Util.checkString(req.getParameter("cmpt_idea_remk_5"));
String blod_sug = Util.checkString(req.getParameter("blod_sug"));
String a_blod_hep = Util.checkString(req.getParameter("a_blod_hep"));
String b_blod_hep = Util.checkString(req.getParameter("b_blod_hep"));
String adv_cont = Util.checkString(req.getParameter("adv_cont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String chk_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_dt")));
String chk_hosp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_hosp_nm")));
String kidny = Util.Uni2Ksc(Util.checkString(req.getParameter("kidny")));
String wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt")));
String std_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_wgt")));
String fatt_prov = Util.Uni2Ksc(Util.checkString(req.getParameter("fatt_prov")));
String blod_pres_high = Util.Uni2Ksc(Util.checkString(req.getParameter("blod_pres_high")));
String blod_pres_low = Util.Uni2Ksc(Util.checkString(req.getParameter("blod_pres_low")));
String puls = Util.Uni2Ksc(Util.checkString(req.getParameter("puls")));
String nkd_sght_lft = Util.Uni2Ksc(Util.checkString(req.getParameter("nkd_sght_lft")));
String nkd_sght_rht = Util.Uni2Ksc(Util.checkString(req.getParameter("nkd_sght_rht")));
String rvis_sght_lft = Util.Uni2Ksc(Util.checkString(req.getParameter("rvis_sght_lft")));
String rvis_sght_rht = Util.Uni2Ksc(Util.checkString(req.getParameter("rvis_sght_rht")));
String spc_idea = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_idea")));
String cmpt_idea_ill_nm_cd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_1")));
String cmpt_idea_remk_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_remk_1")));
String cmpt_idea_ill_nm_cd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_2")));
String cmpt_idea_remk_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_remk_2")));
String cmpt_idea_ill_nm_cd_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_3")));
String cmpt_idea_remk_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_remk_3")));
String cmpt_idea_ill_nm_cd_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_4")));
String cmpt_idea_remk_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_remk_4")));
String cmpt_idea_ill_nm_cd_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_ill_nm_cd_5")));
String cmpt_idea_remk_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpt_idea_remk_5")));
String blod_sug = Util.Uni2Ksc(Util.checkString(req.getParameter("blod_sug")));
String a_blod_hep = Util.Uni2Ksc(Util.checkString(req.getParameter("a_blod_hep")));
String b_blod_hep = Util.Uni2Ksc(Util.checkString(req.getParameter("b_blod_hep")));
String adv_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_cont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setPrn(prn);
dm.setChk_dt(chk_dt);
dm.setChk_hosp_nm(chk_hosp_nm);
dm.setKidny(kidny);
dm.setWgt(wgt);
dm.setStd_wgt(std_wgt);
dm.setFatt_prov(fatt_prov);
dm.setBlod_pres_high(blod_pres_high);
dm.setBlod_pres_low(blod_pres_low);
dm.setPuls(puls);
dm.setNkd_sght_lft(nkd_sght_lft);
dm.setNkd_sght_rht(nkd_sght_rht);
dm.setRvis_sght_lft(rvis_sght_lft);
dm.setRvis_sght_rht(rvis_sght_rht);
dm.setSpc_idea(spc_idea);
dm.setCmpt_idea_ill_nm_cd_1(cmpt_idea_ill_nm_cd_1);
dm.setCmpt_idea_remk_1(cmpt_idea_remk_1);
dm.setCmpt_idea_ill_nm_cd_2(cmpt_idea_ill_nm_cd_2);
dm.setCmpt_idea_remk_2(cmpt_idea_remk_2);
dm.setCmpt_idea_ill_nm_cd_3(cmpt_idea_ill_nm_cd_3);
dm.setCmpt_idea_remk_3(cmpt_idea_remk_3);
dm.setCmpt_idea_ill_nm_cd_4(cmpt_idea_ill_nm_cd_4);
dm.setCmpt_idea_remk_4(cmpt_idea_remk_4);
dm.setCmpt_idea_ill_nm_cd_5(cmpt_idea_ill_nm_cd_5);
dm.setCmpt_idea_remk_5(cmpt_idea_remk_5);
dm.setBlod_sug(blod_sug);
dm.setA_blod_hep(a_blod_hep);
dm.setB_blod_hep(b_blod_hep);
dm.setAdv_cont(adv_cont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 18 14:44:55 KST 2013 */