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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_1150_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_no;
	public String cntr_type;
	public String cntr_prd_frdt;
	public String cntr_prd_todt;
	public String fndt_dt;
	public String capt_amt;
	public String mang_clsf;
	public String grp_cmpy_cd;
	public String evlu_frdt;
	public String evlu_todt;
	public String dhon_dt;
	public String cntr_frdt;
	public String cntr_todt;
	public String gnr_advcs_yn;
	public String arow_advcs_yn;
	public String agn_yn;
	public String nmd_agn_yn;
	public String advt_bo_yn;
	public String bo_bof_yn;
	public String del_yn;
	public String deal_ptcr_unissu_yn;
	public String slcrg_pers;
	public String mchrg_pers;
	public String incmg_pers;
	public String incmg_pers_ip;
	public String mode;
	public String seq;
	public String repl_rtcn_cnfm1;
	public String repl_rtcn_cnfm3;
	public String mortg_clsf;
	public String mortg_cont;
	public String mortg_amt;
	public String acct_no;
	public String gurt_frdt;
	public String gurt_todt;
	public String ewh_dt;
	public String ewh_cnfm;
	public String owh_cnfm;
	public String remk;
	public String setup_pers;
	public String eip_stat;
	public String gurt_pers;
	public String gurt_pers_addr;
	public String gurt_pers_prn;
	public String chrg_mode;
	public String chrg_seq;
	public String dept_nm;
	public String chrg_pers_nm;
	public String cntc_plac;

	public AD_BAS_1150_ADM(){}
	public AD_BAS_1150_ADM(String cmpy_cd, String dlco_no, String cntr_type, String cntr_prd_frdt, String cntr_prd_todt, String fndt_dt, String capt_amt, String mang_clsf, String grp_cmpy_cd, String evlu_frdt, String evlu_todt, String dhon_dt, String cntr_frdt, String cntr_todt, String gnr_advcs_yn, String arow_advcs_yn, String agn_yn, String nmd_agn_yn, String advt_bo_yn, String bo_bof_yn, String del_yn, String deal_ptcr_unissu_yn, String slcrg_pers, String mchrg_pers, String incmg_pers, String incmg_pers_ip, String mode, String seq, String repl_rtcn_cnfm1, String repl_rtcn_cnfm3, String mortg_clsf, String mortg_cont, String mortg_amt, String acct_no, String gurt_frdt, String gurt_todt, String ewh_dt, String ewh_cnfm, String owh_cnfm, String remk, String setup_pers, String eip_stat, String gurt_pers, String gurt_pers_addr, String gurt_pers_prn, String chrg_mode, String chrg_seq, String dept_nm, String chrg_pers_nm, String cntc_plac){
		this.cmpy_cd = cmpy_cd;
		this.dlco_no = dlco_no;
		this.cntr_type = cntr_type;
		this.cntr_prd_frdt = cntr_prd_frdt;
		this.cntr_prd_todt = cntr_prd_todt;
		this.fndt_dt = fndt_dt;
		this.capt_amt = capt_amt;
		this.mang_clsf = mang_clsf;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.evlu_frdt = evlu_frdt;
		this.evlu_todt = evlu_todt;
		this.dhon_dt = dhon_dt;
		this.cntr_frdt = cntr_frdt;
		this.cntr_todt = cntr_todt;
		this.gnr_advcs_yn = gnr_advcs_yn;
		this.arow_advcs_yn = arow_advcs_yn;
		this.agn_yn = agn_yn;
		this.nmd_agn_yn = nmd_agn_yn;
		this.advt_bo_yn = advt_bo_yn;
		this.bo_bof_yn = bo_bof_yn;
		this.del_yn = del_yn;
		this.deal_ptcr_unissu_yn = deal_ptcr_unissu_yn;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
		this.mode = mode;
		this.seq = seq;
		this.repl_rtcn_cnfm1 = repl_rtcn_cnfm1;
		this.repl_rtcn_cnfm3 = repl_rtcn_cnfm3;
		this.mortg_clsf = mortg_clsf;
		this.mortg_cont = mortg_cont;
		this.mortg_amt = mortg_amt;
		this.acct_no = acct_no;
		this.gurt_frdt = gurt_frdt;
		this.gurt_todt = gurt_todt;
		this.ewh_dt = ewh_dt;
		this.ewh_cnfm = ewh_cnfm;
		this.owh_cnfm = owh_cnfm;
		this.remk = remk;
		this.setup_pers = setup_pers;
		this.eip_stat = eip_stat;
		this.gurt_pers = gurt_pers;
		this.gurt_pers_addr = gurt_pers_addr;
		this.gurt_pers_prn = gurt_pers_prn;
		this.chrg_mode = chrg_mode;
		this.chrg_seq = chrg_seq;
		this.dept_nm = dept_nm;
		this.chrg_pers_nm = chrg_pers_nm;
		this.cntc_plac = cntc_plac;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCntr_type(String cntr_type){
		this.cntr_type = cntr_type;
	}

	public void setCntr_prd_frdt(String cntr_prd_frdt){
		this.cntr_prd_frdt = cntr_prd_frdt;
	}

	public void setCntr_prd_todt(String cntr_prd_todt){
		this.cntr_prd_todt = cntr_prd_todt;
	}

	public void setFndt_dt(String fndt_dt){
		this.fndt_dt = fndt_dt;
	}

	public void setCapt_amt(String capt_amt){
		this.capt_amt = capt_amt;
	}

	public void setMang_clsf(String mang_clsf){
		this.mang_clsf = mang_clsf;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setEvlu_frdt(String evlu_frdt){
		this.evlu_frdt = evlu_frdt;
	}

	public void setEvlu_todt(String evlu_todt){
		this.evlu_todt = evlu_todt;
	}

	public void setDhon_dt(String dhon_dt){
		this.dhon_dt = dhon_dt;
	}

	public void setCntr_frdt(String cntr_frdt){
		this.cntr_frdt = cntr_frdt;
	}

	public void setCntr_todt(String cntr_todt){
		this.cntr_todt = cntr_todt;
	}

	public void setGnr_advcs_yn(String gnr_advcs_yn){
		this.gnr_advcs_yn = gnr_advcs_yn;
	}

	public void setArow_advcs_yn(String arow_advcs_yn){
		this.arow_advcs_yn = arow_advcs_yn;
	}

	public void setAgn_yn(String agn_yn){
		this.agn_yn = agn_yn;
	}

	public void setNmd_agn_yn(String nmd_agn_yn){
		this.nmd_agn_yn = nmd_agn_yn;
	}

	public void setAdvt_bo_yn(String advt_bo_yn){
		this.advt_bo_yn = advt_bo_yn;
	}

	public void setBo_bof_yn(String bo_bof_yn){
		this.bo_bof_yn = bo_bof_yn;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public void setDeal_ptcr_unissu_yn(String deal_ptcr_unissu_yn){
		this.deal_ptcr_unissu_yn = deal_ptcr_unissu_yn;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRepl_rtcn_cnfm1(String repl_rtcn_cnfm1){
		this.repl_rtcn_cnfm1 = repl_rtcn_cnfm1;
	}

	public void setRepl_rtcn_cnfm3(String repl_rtcn_cnfm3){
		this.repl_rtcn_cnfm3 = repl_rtcn_cnfm3;
	}

	public void setMortg_clsf(String mortg_clsf){
		this.mortg_clsf = mortg_clsf;
	}

	public void setMortg_cont(String mortg_cont){
		this.mortg_cont = mortg_cont;
	}

	public void setMortg_amt(String mortg_amt){
		this.mortg_amt = mortg_amt;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setGurt_frdt(String gurt_frdt){
		this.gurt_frdt = gurt_frdt;
	}

	public void setGurt_todt(String gurt_todt){
		this.gurt_todt = gurt_todt;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_cnfm(String ewh_cnfm){
		this.ewh_cnfm = ewh_cnfm;
	}

	public void setOwh_cnfm(String owh_cnfm){
		this.owh_cnfm = owh_cnfm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSetup_pers(String setup_pers){
		this.setup_pers = setup_pers;
	}

	public void setEip_stat(String eip_stat){
		this.eip_stat = eip_stat;
	}

	public void setGurt_pers(String gurt_pers){
		this.gurt_pers = gurt_pers;
	}

	public void setGurt_pers_addr(String gurt_pers_addr){
		this.gurt_pers_addr = gurt_pers_addr;
	}

	public void setGurt_pers_prn(String gurt_pers_prn){
		this.gurt_pers_prn = gurt_pers_prn;
	}

	public void setChrg_mode(String chrg_mode){
		this.chrg_mode = chrg_mode;
	}

	public void setChrg_seq(String chrg_seq){
		this.chrg_seq = chrg_seq;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setCntc_plac(String cntc_plac){
		this.cntc_plac = cntc_plac;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCntr_type(){
		return this.cntr_type;
	}

	public String getCntr_prd_frdt(){
		return this.cntr_prd_frdt;
	}

	public String getCntr_prd_todt(){
		return this.cntr_prd_todt;
	}

	public String getFndt_dt(){
		return this.fndt_dt;
	}

	public String getCapt_amt(){
		return this.capt_amt;
	}

	public String getMang_clsf(){
		return this.mang_clsf;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getEvlu_frdt(){
		return this.evlu_frdt;
	}

	public String getEvlu_todt(){
		return this.evlu_todt;
	}

	public String getDhon_dt(){
		return this.dhon_dt;
	}

	public String getCntr_frdt(){
		return this.cntr_frdt;
	}

	public String getCntr_todt(){
		return this.cntr_todt;
	}

	public String getGnr_advcs_yn(){
		return this.gnr_advcs_yn;
	}

	public String getArow_advcs_yn(){
		return this.arow_advcs_yn;
	}

	public String getAgn_yn(){
		return this.agn_yn;
	}

	public String getNmd_agn_yn(){
		return this.nmd_agn_yn;
	}

	public String getAdvt_bo_yn(){
		return this.advt_bo_yn;
	}

	public String getBo_bof_yn(){
		return this.bo_bof_yn;
	}

	public String getDel_yn(){
		return this.del_yn;
	}

	public String getDeal_ptcr_unissu_yn(){
		return this.deal_ptcr_unissu_yn;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRepl_rtcn_cnfm1(){
		return this.repl_rtcn_cnfm1;
	}

	public String getRepl_rtcn_cnfm3(){
		return this.repl_rtcn_cnfm3;
	}

	public String getMortg_clsf(){
		return this.mortg_clsf;
	}

	public String getMortg_cont(){
		return this.mortg_cont;
	}

	public String getMortg_amt(){
		return this.mortg_amt;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getGurt_frdt(){
		return this.gurt_frdt;
	}

	public String getGurt_todt(){
		return this.gurt_todt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_cnfm(){
		return this.ewh_cnfm;
	}

	public String getOwh_cnfm(){
		return this.owh_cnfm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSetup_pers(){
		return this.setup_pers;
	}

	public String getEip_stat(){
		return this.eip_stat;
	}

	public String getGurt_pers(){
		return this.gurt_pers;
	}

	public String getGurt_pers_addr(){
		return this.gurt_pers_addr;
	}

	public String getGurt_pers_prn(){
		return this.gurt_pers_prn;
	}

	public String getChrg_mode(){
		return this.chrg_mode;
	}

	public String getChrg_seq(){
		return this.chrg_seq;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getCntc_plac(){
		return this.cntc_plac;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_1150_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_1150_ADM dm = (AD_BAS_1150_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_no);
		cstmt.setString(5, dm.cntr_type);
		cstmt.setString(6, dm.cntr_prd_frdt);
		cstmt.setString(7, dm.cntr_prd_todt);
		cstmt.setString(8, dm.fndt_dt);
		cstmt.setString(9, dm.capt_amt);
		cstmt.setString(10, dm.mang_clsf);
		cstmt.setString(11, dm.grp_cmpy_cd);
		cstmt.setString(12, dm.evlu_frdt);
		cstmt.setString(13, dm.evlu_todt);
		cstmt.setString(14, dm.dhon_dt);
		cstmt.setString(15, dm.cntr_frdt);
		cstmt.setString(16, dm.cntr_todt);
		cstmt.setString(17, dm.gnr_advcs_yn);
		cstmt.setString(18, dm.arow_advcs_yn);
		cstmt.setString(19, dm.agn_yn);
		cstmt.setString(20, dm.nmd_agn_yn);
		cstmt.setString(21, dm.advt_bo_yn);
		cstmt.setString(22, dm.bo_bof_yn);
		cstmt.setString(23, dm.del_yn);
		cstmt.setString(24, dm.deal_ptcr_unissu_yn);
		cstmt.setString(25, dm.slcrg_pers);
		cstmt.setString(26, dm.mchrg_pers);
		cstmt.setString(27, dm.incmg_pers);
		cstmt.setString(28, dm.incmg_pers_ip);
		cstmt.setString(29, dm.mode);
		cstmt.setString(30, dm.seq);
		cstmt.setString(31, dm.repl_rtcn_cnfm1);
		cstmt.setString(32, dm.repl_rtcn_cnfm3);
		cstmt.setString(33, dm.mortg_clsf);
		cstmt.setString(34, dm.mortg_cont);
		cstmt.setString(35, dm.mortg_amt);
		cstmt.setString(36, dm.acct_no);
		cstmt.setString(37, dm.gurt_frdt);
		cstmt.setString(38, dm.gurt_todt);
		cstmt.setString(39, dm.ewh_dt);
		cstmt.setString(40, dm.ewh_cnfm);
		cstmt.setString(41, dm.owh_cnfm);
		cstmt.setString(42, dm.remk);
		cstmt.setString(43, dm.setup_pers);
		cstmt.setString(44, dm.eip_stat);
		cstmt.setString(45, dm.gurt_pers);
		cstmt.setString(46, dm.gurt_pers_addr);
		cstmt.setString(47, dm.gurt_pers_prn);
		cstmt.setString(48, dm.chrg_mode);
		cstmt.setString(49, dm.chrg_seq);
		cstmt.setString(50, dm.dept_nm);
		cstmt.setString(51, dm.chrg_pers_nm);
		cstmt.setString(52, dm.cntc_plac);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_1150_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("cntr_type = [" + getCntr_type() + "]");
		System.out.println("cntr_prd_frdt = [" + getCntr_prd_frdt() + "]");
		System.out.println("cntr_prd_todt = [" + getCntr_prd_todt() + "]");
		System.out.println("fndt_dt = [" + getFndt_dt() + "]");
		System.out.println("capt_amt = [" + getCapt_amt() + "]");
		System.out.println("mang_clsf = [" + getMang_clsf() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("evlu_frdt = [" + getEvlu_frdt() + "]");
		System.out.println("evlu_todt = [" + getEvlu_todt() + "]");
		System.out.println("dhon_dt = [" + getDhon_dt() + "]");
		System.out.println("cntr_frdt = [" + getCntr_frdt() + "]");
		System.out.println("cntr_todt = [" + getCntr_todt() + "]");
		System.out.println("gnr_advcs_yn = [" + getGnr_advcs_yn() + "]");
		System.out.println("arow_advcs_yn = [" + getArow_advcs_yn() + "]");
		System.out.println("agn_yn = [" + getAgn_yn() + "]");
		System.out.println("nmd_agn_yn = [" + getNmd_agn_yn() + "]");
		System.out.println("advt_bo_yn = [" + getAdvt_bo_yn() + "]");
		System.out.println("bo_bof_yn = [" + getBo_bof_yn() + "]");
		System.out.println("del_yn = [" + getDel_yn() + "]");
		System.out.println("deal_ptcr_unissu_yn = [" + getDeal_ptcr_unissu_yn() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("repl_rtcn_cnfm1 = [" + getRepl_rtcn_cnfm1() + "]");
		System.out.println("repl_rtcn_cnfm3 = [" + getRepl_rtcn_cnfm3() + "]");
		System.out.println("mortg_clsf = [" + getMortg_clsf() + "]");
		System.out.println("mortg_cont = [" + getMortg_cont() + "]");
		System.out.println("mortg_amt = [" + getMortg_amt() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("gurt_frdt = [" + getGurt_frdt() + "]");
		System.out.println("gurt_todt = [" + getGurt_todt() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("ewh_cnfm = [" + getEwh_cnfm() + "]");
		System.out.println("owh_cnfm = [" + getOwh_cnfm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("setup_pers = [" + getSetup_pers() + "]");
		System.out.println("eip_stat = [" + getEip_stat() + "]");
		System.out.println("gurt_pers = [" + getGurt_pers() + "]");
		System.out.println("gurt_pers_addr = [" + getGurt_pers_addr() + "]");
		System.out.println("gurt_pers_prn = [" + getGurt_pers_prn() + "]");
		System.out.println("chrg_mode = [" + getChrg_mode() + "]");
		System.out.println("chrg_seq = [" + getChrg_seq() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("chrg_pers_nm = [" + getChrg_pers_nm() + "]");
		System.out.println("cntc_plac = [" + getCntc_plac() + "]");
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
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String cntr_type = req.getParameter("cntr_type");
if( cntr_type == null){
	System.out.println(this.toString+" : cntr_type is null" );
}else{
	System.out.println(this.toString+" : cntr_type is "+cntr_type );
}
String cntr_prd_frdt = req.getParameter("cntr_prd_frdt");
if( cntr_prd_frdt == null){
	System.out.println(this.toString+" : cntr_prd_frdt is null" );
}else{
	System.out.println(this.toString+" : cntr_prd_frdt is "+cntr_prd_frdt );
}
String cntr_prd_todt = req.getParameter("cntr_prd_todt");
if( cntr_prd_todt == null){
	System.out.println(this.toString+" : cntr_prd_todt is null" );
}else{
	System.out.println(this.toString+" : cntr_prd_todt is "+cntr_prd_todt );
}
String fndt_dt = req.getParameter("fndt_dt");
if( fndt_dt == null){
	System.out.println(this.toString+" : fndt_dt is null" );
}else{
	System.out.println(this.toString+" : fndt_dt is "+fndt_dt );
}
String capt_amt = req.getParameter("capt_amt");
if( capt_amt == null){
	System.out.println(this.toString+" : capt_amt is null" );
}else{
	System.out.println(this.toString+" : capt_amt is "+capt_amt );
}
String mang_clsf = req.getParameter("mang_clsf");
if( mang_clsf == null){
	System.out.println(this.toString+" : mang_clsf is null" );
}else{
	System.out.println(this.toString+" : mang_clsf is "+mang_clsf );
}
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
String evlu_frdt = req.getParameter("evlu_frdt");
if( evlu_frdt == null){
	System.out.println(this.toString+" : evlu_frdt is null" );
}else{
	System.out.println(this.toString+" : evlu_frdt is "+evlu_frdt );
}
String evlu_todt = req.getParameter("evlu_todt");
if( evlu_todt == null){
	System.out.println(this.toString+" : evlu_todt is null" );
}else{
	System.out.println(this.toString+" : evlu_todt is "+evlu_todt );
}
String dhon_dt = req.getParameter("dhon_dt");
if( dhon_dt == null){
	System.out.println(this.toString+" : dhon_dt is null" );
}else{
	System.out.println(this.toString+" : dhon_dt is "+dhon_dt );
}
String cntr_frdt = req.getParameter("cntr_frdt");
if( cntr_frdt == null){
	System.out.println(this.toString+" : cntr_frdt is null" );
}else{
	System.out.println(this.toString+" : cntr_frdt is "+cntr_frdt );
}
String cntr_todt = req.getParameter("cntr_todt");
if( cntr_todt == null){
	System.out.println(this.toString+" : cntr_todt is null" );
}else{
	System.out.println(this.toString+" : cntr_todt is "+cntr_todt );
}
String gnr_advcs_yn = req.getParameter("gnr_advcs_yn");
if( gnr_advcs_yn == null){
	System.out.println(this.toString+" : gnr_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : gnr_advcs_yn is "+gnr_advcs_yn );
}
String arow_advcs_yn = req.getParameter("arow_advcs_yn");
if( arow_advcs_yn == null){
	System.out.println(this.toString+" : arow_advcs_yn is null" );
}else{
	System.out.println(this.toString+" : arow_advcs_yn is "+arow_advcs_yn );
}
String agn_yn = req.getParameter("agn_yn");
if( agn_yn == null){
	System.out.println(this.toString+" : agn_yn is null" );
}else{
	System.out.println(this.toString+" : agn_yn is "+agn_yn );
}
String nmd_agn_yn = req.getParameter("nmd_agn_yn");
if( nmd_agn_yn == null){
	System.out.println(this.toString+" : nmd_agn_yn is null" );
}else{
	System.out.println(this.toString+" : nmd_agn_yn is "+nmd_agn_yn );
}
String advt_bo_yn = req.getParameter("advt_bo_yn");
if( advt_bo_yn == null){
	System.out.println(this.toString+" : advt_bo_yn is null" );
}else{
	System.out.println(this.toString+" : advt_bo_yn is "+advt_bo_yn );
}
String bo_bof_yn = req.getParameter("bo_bof_yn");
if( bo_bof_yn == null){
	System.out.println(this.toString+" : bo_bof_yn is null" );
}else{
	System.out.println(this.toString+" : bo_bof_yn is "+bo_bof_yn );
}
String del_yn = req.getParameter("del_yn");
if( del_yn == null){
	System.out.println(this.toString+" : del_yn is null" );
}else{
	System.out.println(this.toString+" : del_yn is "+del_yn );
}
String deal_ptcr_unissu_yn = req.getParameter("deal_ptcr_unissu_yn");
if( deal_ptcr_unissu_yn == null){
	System.out.println(this.toString+" : deal_ptcr_unissu_yn is null" );
}else{
	System.out.println(this.toString+" : deal_ptcr_unissu_yn is "+deal_ptcr_unissu_yn );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String repl_rtcn_cnfm1 = req.getParameter("repl_rtcn_cnfm1");
if( repl_rtcn_cnfm1 == null){
	System.out.println(this.toString+" : repl_rtcn_cnfm1 is null" );
}else{
	System.out.println(this.toString+" : repl_rtcn_cnfm1 is "+repl_rtcn_cnfm1 );
}
String repl_rtcn_cnfm3 = req.getParameter("repl_rtcn_cnfm3");
if( repl_rtcn_cnfm3 == null){
	System.out.println(this.toString+" : repl_rtcn_cnfm3 is null" );
}else{
	System.out.println(this.toString+" : repl_rtcn_cnfm3 is "+repl_rtcn_cnfm3 );
}
String mortg_clsf = req.getParameter("mortg_clsf");
if( mortg_clsf == null){
	System.out.println(this.toString+" : mortg_clsf is null" );
}else{
	System.out.println(this.toString+" : mortg_clsf is "+mortg_clsf );
}
String mortg_cont = req.getParameter("mortg_cont");
if( mortg_cont == null){
	System.out.println(this.toString+" : mortg_cont is null" );
}else{
	System.out.println(this.toString+" : mortg_cont is "+mortg_cont );
}
String mortg_amt = req.getParameter("mortg_amt");
if( mortg_amt == null){
	System.out.println(this.toString+" : mortg_amt is null" );
}else{
	System.out.println(this.toString+" : mortg_amt is "+mortg_amt );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String gurt_frdt = req.getParameter("gurt_frdt");
if( gurt_frdt == null){
	System.out.println(this.toString+" : gurt_frdt is null" );
}else{
	System.out.println(this.toString+" : gurt_frdt is "+gurt_frdt );
}
String gurt_todt = req.getParameter("gurt_todt");
if( gurt_todt == null){
	System.out.println(this.toString+" : gurt_todt is null" );
}else{
	System.out.println(this.toString+" : gurt_todt is "+gurt_todt );
}
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String ewh_cnfm = req.getParameter("ewh_cnfm");
if( ewh_cnfm == null){
	System.out.println(this.toString+" : ewh_cnfm is null" );
}else{
	System.out.println(this.toString+" : ewh_cnfm is "+ewh_cnfm );
}
String owh_cnfm = req.getParameter("owh_cnfm");
if( owh_cnfm == null){
	System.out.println(this.toString+" : owh_cnfm is null" );
}else{
	System.out.println(this.toString+" : owh_cnfm is "+owh_cnfm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String setup_pers = req.getParameter("setup_pers");
if( setup_pers == null){
	System.out.println(this.toString+" : setup_pers is null" );
}else{
	System.out.println(this.toString+" : setup_pers is "+setup_pers );
}
String eip_stat = req.getParameter("eip_stat");
if( eip_stat == null){
	System.out.println(this.toString+" : eip_stat is null" );
}else{
	System.out.println(this.toString+" : eip_stat is "+eip_stat );
}
String gurt_pers = req.getParameter("gurt_pers");
if( gurt_pers == null){
	System.out.println(this.toString+" : gurt_pers is null" );
}else{
	System.out.println(this.toString+" : gurt_pers is "+gurt_pers );
}
String gurt_pers_addr = req.getParameter("gurt_pers_addr");
if( gurt_pers_addr == null){
	System.out.println(this.toString+" : gurt_pers_addr is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_addr is "+gurt_pers_addr );
}
String gurt_pers_prn = req.getParameter("gurt_pers_prn");
if( gurt_pers_prn == null){
	System.out.println(this.toString+" : gurt_pers_prn is null" );
}else{
	System.out.println(this.toString+" : gurt_pers_prn is "+gurt_pers_prn );
}
String chrg_mode = req.getParameter("chrg_mode");
if( chrg_mode == null){
	System.out.println(this.toString+" : chrg_mode is null" );
}else{
	System.out.println(this.toString+" : chrg_mode is "+chrg_mode );
}
String chrg_seq = req.getParameter("chrg_seq");
if( chrg_seq == null){
	System.out.println(this.toString+" : chrg_seq is null" );
}else{
	System.out.println(this.toString+" : chrg_seq is "+chrg_seq );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String chrg_pers_nm = req.getParameter("chrg_pers_nm");
if( chrg_pers_nm == null){
	System.out.println(this.toString+" : chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_nm is "+chrg_pers_nm );
}
String cntc_plac = req.getParameter("cntc_plac");
if( cntc_plac == null){
	System.out.println(this.toString+" : cntc_plac is null" );
}else{
	System.out.println(this.toString+" : cntc_plac is "+cntc_plac );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String cntr_type = Util.checkString(req.getParameter("cntr_type"));
String cntr_prd_frdt = Util.checkString(req.getParameter("cntr_prd_frdt"));
String cntr_prd_todt = Util.checkString(req.getParameter("cntr_prd_todt"));
String fndt_dt = Util.checkString(req.getParameter("fndt_dt"));
String capt_amt = Util.checkString(req.getParameter("capt_amt"));
String mang_clsf = Util.checkString(req.getParameter("mang_clsf"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String evlu_frdt = Util.checkString(req.getParameter("evlu_frdt"));
String evlu_todt = Util.checkString(req.getParameter("evlu_todt"));
String dhon_dt = Util.checkString(req.getParameter("dhon_dt"));
String cntr_frdt = Util.checkString(req.getParameter("cntr_frdt"));
String cntr_todt = Util.checkString(req.getParameter("cntr_todt"));
String gnr_advcs_yn = Util.checkString(req.getParameter("gnr_advcs_yn"));
String arow_advcs_yn = Util.checkString(req.getParameter("arow_advcs_yn"));
String agn_yn = Util.checkString(req.getParameter("agn_yn"));
String nmd_agn_yn = Util.checkString(req.getParameter("nmd_agn_yn"));
String advt_bo_yn = Util.checkString(req.getParameter("advt_bo_yn"));
String bo_bof_yn = Util.checkString(req.getParameter("bo_bof_yn"));
String del_yn = Util.checkString(req.getParameter("del_yn"));
String deal_ptcr_unissu_yn = Util.checkString(req.getParameter("deal_ptcr_unissu_yn"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String repl_rtcn_cnfm1 = Util.checkString(req.getParameter("repl_rtcn_cnfm1"));
String repl_rtcn_cnfm3 = Util.checkString(req.getParameter("repl_rtcn_cnfm3"));
String mortg_clsf = Util.checkString(req.getParameter("mortg_clsf"));
String mortg_cont = Util.checkString(req.getParameter("mortg_cont"));
String mortg_amt = Util.checkString(req.getParameter("mortg_amt"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String gurt_frdt = Util.checkString(req.getParameter("gurt_frdt"));
String gurt_todt = Util.checkString(req.getParameter("gurt_todt"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String ewh_cnfm = Util.checkString(req.getParameter("ewh_cnfm"));
String owh_cnfm = Util.checkString(req.getParameter("owh_cnfm"));
String remk = Util.checkString(req.getParameter("remk"));
String setup_pers = Util.checkString(req.getParameter("setup_pers"));
String eip_stat = Util.checkString(req.getParameter("eip_stat"));
String gurt_pers = Util.checkString(req.getParameter("gurt_pers"));
String gurt_pers_addr = Util.checkString(req.getParameter("gurt_pers_addr"));
String gurt_pers_prn = Util.checkString(req.getParameter("gurt_pers_prn"));
String chrg_mode = Util.checkString(req.getParameter("chrg_mode"));
String chrg_seq = Util.checkString(req.getParameter("chrg_seq"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String chrg_pers_nm = Util.checkString(req.getParameter("chrg_pers_nm"));
String cntc_plac = Util.checkString(req.getParameter("cntc_plac"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String cntr_type = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_type")));
String cntr_prd_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_prd_frdt")));
String cntr_prd_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_prd_todt")));
String fndt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fndt_dt")));
String capt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("capt_amt")));
String mang_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String evlu_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_frdt")));
String evlu_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_todt")));
String dhon_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_dt")));
String cntr_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_frdt")));
String cntr_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_todt")));
String gnr_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("gnr_advcs_yn")));
String arow_advcs_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("arow_advcs_yn")));
String agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("agn_yn")));
String nmd_agn_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nmd_agn_yn")));
String advt_bo_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_bo_yn")));
String bo_bof_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_bof_yn")));
String del_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("del_yn")));
String deal_ptcr_unissu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_ptcr_unissu_yn")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String repl_rtcn_cnfm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("repl_rtcn_cnfm1")));
String repl_rtcn_cnfm3 = Util.Uni2Ksc(Util.checkString(req.getParameter("repl_rtcn_cnfm3")));
String mortg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mortg_clsf")));
String mortg_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("mortg_cont")));
String mortg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mortg_amt")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String gurt_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_frdt")));
String gurt_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_todt")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String ewh_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_cnfm")));
String owh_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_cnfm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String setup_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("setup_pers")));
String eip_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("eip_stat")));
String gurt_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers")));
String gurt_pers_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_addr")));
String gurt_pers_prn = Util.Uni2Ksc(Util.checkString(req.getParameter("gurt_pers_prn")));
String chrg_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_mode")));
String chrg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_seq")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_nm")));
String cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("cntc_plac")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_no(dlco_no);
dm.setCntr_type(cntr_type);
dm.setCntr_prd_frdt(cntr_prd_frdt);
dm.setCntr_prd_todt(cntr_prd_todt);
dm.setFndt_dt(fndt_dt);
dm.setCapt_amt(capt_amt);
dm.setMang_clsf(mang_clsf);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setEvlu_frdt(evlu_frdt);
dm.setEvlu_todt(evlu_todt);
dm.setDhon_dt(dhon_dt);
dm.setCntr_frdt(cntr_frdt);
dm.setCntr_todt(cntr_todt);
dm.setGnr_advcs_yn(gnr_advcs_yn);
dm.setArow_advcs_yn(arow_advcs_yn);
dm.setAgn_yn(agn_yn);
dm.setNmd_agn_yn(nmd_agn_yn);
dm.setAdvt_bo_yn(advt_bo_yn);
dm.setBo_bof_yn(bo_bof_yn);
dm.setDel_yn(del_yn);
dm.setDeal_ptcr_unissu_yn(deal_ptcr_unissu_yn);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setMode(mode);
dm.setSeq(seq);
dm.setRepl_rtcn_cnfm1(repl_rtcn_cnfm1);
dm.setRepl_rtcn_cnfm3(repl_rtcn_cnfm3);
dm.setMortg_clsf(mortg_clsf);
dm.setMortg_cont(mortg_cont);
dm.setMortg_amt(mortg_amt);
dm.setAcct_no(acct_no);
dm.setGurt_frdt(gurt_frdt);
dm.setGurt_todt(gurt_todt);
dm.setEwh_dt(ewh_dt);
dm.setEwh_cnfm(ewh_cnfm);
dm.setOwh_cnfm(owh_cnfm);
dm.setRemk(remk);
dm.setSetup_pers(setup_pers);
dm.setEip_stat(eip_stat);
dm.setGurt_pers(gurt_pers);
dm.setGurt_pers_addr(gurt_pers_addr);
dm.setGurt_pers_prn(gurt_pers_prn);
dm.setChrg_mode(chrg_mode);
dm.setChrg_seq(chrg_seq);
dm.setDept_nm(dept_nm);
dm.setChrg_pers_nm(chrg_pers_nm);
dm.setCntc_plac(cntc_plac);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 05 17:43:59 KST 2013 */