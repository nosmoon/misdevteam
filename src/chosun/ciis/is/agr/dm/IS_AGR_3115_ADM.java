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


package chosun.ciis.is.agr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.agr.ds.*;
import chosun.ciis.is.agr.rec.*;

/**
 * 
 */


public class IS_AGR_3115_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String flag;
	public String cmpy_cd;
	public String make_ask_reg_dt;
	public String make_ask_reg_seq;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_nm;
	public String dlco_chrg_pers_nm;
	public String dlco_chrg_pers_cntc_plac;
	public String advt_nm;
	public String draft_end_dt;
	public String dlvs_dt;
	public String acwr_incmg_dt_tm;
	public String work_kind;
	public String make_clsf;
	public String std_cd;
	public String clr_cd;
	public String prt_paper;
	public String rvord_qunt;
	public String rvord_uprc;
	public String rvord_amt;
	public String dlvs_plac;
	public String remk;
	public String chrg_pers_tel_no;
	public String plan_chrg_ptph_no;
	public String proc_stat;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String a_mode;
	public String a_make_ask_dtls_seq;
	public String a_dlco_clsf_cd_seq;
	public String a_purc_clsf;
	public String a_uprc;
	public String a_qunt;
	public String a_purc_amt;
	public String a_stmt_recp_yn;
	public String a_remk;

	public IS_AGR_3115_ADM(){}
	public IS_AGR_3115_ADM(String flag, String cmpy_cd, String make_ask_reg_dt, String make_ask_reg_seq, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_nm, String dlco_chrg_pers_nm, String dlco_chrg_pers_cntc_plac, String advt_nm, String draft_end_dt, String dlvs_dt, String acwr_incmg_dt_tm, String work_kind, String make_clsf, String std_cd, String clr_cd, String prt_paper, String rvord_qunt, String rvord_uprc, String rvord_amt, String dlvs_plac, String remk, String chrg_pers_tel_no, String plan_chrg_ptph_no, String proc_stat, String incmg_pers_ip, String incmg_pers, String a_mode, String a_make_ask_dtls_seq, String a_dlco_clsf_cd_seq, String a_purc_clsf, String a_uprc, String a_qunt, String a_purc_amt, String a_stmt_recp_yn, String a_remk){
		this.flag = flag;
		this.cmpy_cd = cmpy_cd;
		this.make_ask_reg_dt = make_ask_reg_dt;
		this.make_ask_reg_seq = make_ask_reg_seq;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_nm = dlco_nm;
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
		this.advt_nm = advt_nm;
		this.draft_end_dt = draft_end_dt;
		this.dlvs_dt = dlvs_dt;
		this.acwr_incmg_dt_tm = acwr_incmg_dt_tm;
		this.work_kind = work_kind;
		this.make_clsf = make_clsf;
		this.std_cd = std_cd;
		this.clr_cd = clr_cd;
		this.prt_paper = prt_paper;
		this.rvord_qunt = rvord_qunt;
		this.rvord_uprc = rvord_uprc;
		this.rvord_amt = rvord_amt;
		this.dlvs_plac = dlvs_plac;
		this.remk = remk;
		this.chrg_pers_tel_no = chrg_pers_tel_no;
		this.plan_chrg_ptph_no = plan_chrg_ptph_no;
		this.proc_stat = proc_stat;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.a_mode = a_mode;
		this.a_make_ask_dtls_seq = a_make_ask_dtls_seq;
		this.a_dlco_clsf_cd_seq = a_dlco_clsf_cd_seq;
		this.a_purc_clsf = a_purc_clsf;
		this.a_uprc = a_uprc;
		this.a_qunt = a_qunt;
		this.a_purc_amt = a_purc_amt;
		this.a_stmt_recp_yn = a_stmt_recp_yn;
		this.a_remk = a_remk;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMake_ask_reg_dt(String make_ask_reg_dt){
		this.make_ask_reg_dt = make_ask_reg_dt;
	}

	public void setMake_ask_reg_seq(String make_ask_reg_seq){
		this.make_ask_reg_seq = make_ask_reg_seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDlco_chrg_pers_nm(String dlco_chrg_pers_nm){
		this.dlco_chrg_pers_nm = dlco_chrg_pers_nm;
	}

	public void setDlco_chrg_pers_cntc_plac(String dlco_chrg_pers_cntc_plac){
		this.dlco_chrg_pers_cntc_plac = dlco_chrg_pers_cntc_plac;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setDraft_end_dt(String draft_end_dt){
		this.draft_end_dt = draft_end_dt;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setAcwr_incmg_dt_tm(String acwr_incmg_dt_tm){
		this.acwr_incmg_dt_tm = acwr_incmg_dt_tm;
	}

	public void setWork_kind(String work_kind){
		this.work_kind = work_kind;
	}

	public void setMake_clsf(String make_clsf){
		this.make_clsf = make_clsf;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setClr_cd(String clr_cd){
		this.clr_cd = clr_cd;
	}

	public void setPrt_paper(String prt_paper){
		this.prt_paper = prt_paper;
	}

	public void setRvord_qunt(String rvord_qunt){
		this.rvord_qunt = rvord_qunt;
	}

	public void setRvord_uprc(String rvord_uprc){
		this.rvord_uprc = rvord_uprc;
	}

	public void setRvord_amt(String rvord_amt){
		this.rvord_amt = rvord_amt;
	}

	public void setDlvs_plac(String dlvs_plac){
		this.dlvs_plac = dlvs_plac;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setChrg_pers_tel_no(String chrg_pers_tel_no){
		this.chrg_pers_tel_no = chrg_pers_tel_no;
	}

	public void setPlan_chrg_ptph_no(String plan_chrg_ptph_no){
		this.plan_chrg_ptph_no = plan_chrg_ptph_no;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setA_mode(String a_mode){
		this.a_mode = a_mode;
	}

	public void setA_make_ask_dtls_seq(String a_make_ask_dtls_seq){
		this.a_make_ask_dtls_seq = a_make_ask_dtls_seq;
	}

	public void setA_dlco_clsf_cd_seq(String a_dlco_clsf_cd_seq){
		this.a_dlco_clsf_cd_seq = a_dlco_clsf_cd_seq;
	}

	public void setA_purc_clsf(String a_purc_clsf){
		this.a_purc_clsf = a_purc_clsf;
	}

	public void setA_uprc(String a_uprc){
		this.a_uprc = a_uprc;
	}

	public void setA_qunt(String a_qunt){
		this.a_qunt = a_qunt;
	}

	public void setA_purc_amt(String a_purc_amt){
		this.a_purc_amt = a_purc_amt;
	}

	public void setA_stmt_recp_yn(String a_stmt_recp_yn){
		this.a_stmt_recp_yn = a_stmt_recp_yn;
	}

	public void setA_remk(String a_remk){
		this.a_remk = a_remk;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMake_ask_reg_dt(){
		return this.make_ask_reg_dt;
	}

	public String getMake_ask_reg_seq(){
		return this.make_ask_reg_seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDlco_chrg_pers_nm(){
		return this.dlco_chrg_pers_nm;
	}

	public String getDlco_chrg_pers_cntc_plac(){
		return this.dlco_chrg_pers_cntc_plac;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getDraft_end_dt(){
		return this.draft_end_dt;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getAcwr_incmg_dt_tm(){
		return this.acwr_incmg_dt_tm;
	}

	public String getWork_kind(){
		return this.work_kind;
	}

	public String getMake_clsf(){
		return this.make_clsf;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getClr_cd(){
		return this.clr_cd;
	}

	public String getPrt_paper(){
		return this.prt_paper;
	}

	public String getRvord_qunt(){
		return this.rvord_qunt;
	}

	public String getRvord_uprc(){
		return this.rvord_uprc;
	}

	public String getRvord_amt(){
		return this.rvord_amt;
	}

	public String getDlvs_plac(){
		return this.dlvs_plac;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getChrg_pers_tel_no(){
		return this.chrg_pers_tel_no;
	}

	public String getPlan_chrg_ptph_no(){
		return this.plan_chrg_ptph_no;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getA_mode(){
		return this.a_mode;
	}

	public String getA_make_ask_dtls_seq(){
		return this.a_make_ask_dtls_seq;
	}

	public String getA_dlco_clsf_cd_seq(){
		return this.a_dlco_clsf_cd_seq;
	}

	public String getA_purc_clsf(){
		return this.a_purc_clsf;
	}

	public String getA_uprc(){
		return this.a_uprc;
	}

	public String getA_qunt(){
		return this.a_qunt;
	}

	public String getA_purc_amt(){
		return this.a_purc_amt;
	}

	public String getA_stmt_recp_yn(){
		return this.a_stmt_recp_yn;
	}

	public String getA_remk(){
		return this.a_remk;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_AGR_3115_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_AGR_3115_ADM dm = (IS_AGR_3115_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.flag);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.make_ask_reg_dt);
		cstmt.setString(6, dm.make_ask_reg_seq);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.sub_dept_cd);
		cstmt.setString(9, dm.chrg_pers);
		cstmt.setString(10, dm.dlco_nm);
		cstmt.setString(11, dm.dlco_chrg_pers_nm);
		cstmt.setString(12, dm.dlco_chrg_pers_cntc_plac);
		cstmt.setString(13, dm.advt_nm);
		cstmt.setString(14, dm.draft_end_dt);
		cstmt.setString(15, dm.dlvs_dt);
		cstmt.setString(16, dm.acwr_incmg_dt_tm);
		cstmt.setString(17, dm.work_kind);
		cstmt.setString(18, dm.make_clsf);
		cstmt.setString(19, dm.std_cd);
		cstmt.setString(20, dm.clr_cd);
		cstmt.setString(21, dm.prt_paper);
		cstmt.setString(22, dm.rvord_qunt);
		cstmt.setString(23, dm.rvord_uprc);
		cstmt.setString(24, dm.rvord_amt);
		cstmt.setString(25, dm.dlvs_plac);
		cstmt.setString(26, dm.remk);
		cstmt.setString(27, dm.chrg_pers_tel_no);
		cstmt.setString(28, dm.plan_chrg_ptph_no);
		cstmt.setString(29, dm.proc_stat);
		cstmt.setString(30, dm.incmg_pers_ip);
		cstmt.setString(31, dm.incmg_pers);
		cstmt.setString(32, dm.a_mode);
		cstmt.setString(33, dm.a_make_ask_dtls_seq);
		cstmt.setString(34, dm.a_dlco_clsf_cd_seq);
		cstmt.setString(35, dm.a_purc_clsf);
		cstmt.setString(36, dm.a_uprc);
		cstmt.setString(37, dm.a_qunt);
		cstmt.setString(38, dm.a_purc_amt);
		cstmt.setString(39, dm.a_stmt_recp_yn);
		cstmt.setString(40, dm.a_remk);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.agr.ds.IS_AGR_3115_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("make_ask_reg_dt = [" + getMake_ask_reg_dt() + "]");
		System.out.println("make_ask_reg_seq = [" + getMake_ask_reg_seq() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("dlco_chrg_pers_nm = [" + getDlco_chrg_pers_nm() + "]");
		System.out.println("dlco_chrg_pers_cntc_plac = [" + getDlco_chrg_pers_cntc_plac() + "]");
		System.out.println("advt_nm = [" + getAdvt_nm() + "]");
		System.out.println("draft_end_dt = [" + getDraft_end_dt() + "]");
		System.out.println("dlvs_dt = [" + getDlvs_dt() + "]");
		System.out.println("acwr_incmg_dt_tm = [" + getAcwr_incmg_dt_tm() + "]");
		System.out.println("work_kind = [" + getWork_kind() + "]");
		System.out.println("make_clsf = [" + getMake_clsf() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("clr_cd = [" + getClr_cd() + "]");
		System.out.println("prt_paper = [" + getPrt_paper() + "]");
		System.out.println("rvord_qunt = [" + getRvord_qunt() + "]");
		System.out.println("rvord_uprc = [" + getRvord_uprc() + "]");
		System.out.println("rvord_amt = [" + getRvord_amt() + "]");
		System.out.println("dlvs_plac = [" + getDlvs_plac() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("chrg_pers_tel_no = [" + getChrg_pers_tel_no() + "]");
		System.out.println("plan_chrg_ptph_no = [" + getPlan_chrg_ptph_no() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("a_mode = [" + getA_mode() + "]");
		System.out.println("a_make_ask_dtls_seq = [" + getA_make_ask_dtls_seq() + "]");
		System.out.println("a_dlco_clsf_cd_seq = [" + getA_dlco_clsf_cd_seq() + "]");
		System.out.println("a_purc_clsf = [" + getA_purc_clsf() + "]");
		System.out.println("a_uprc = [" + getA_uprc() + "]");
		System.out.println("a_qunt = [" + getA_qunt() + "]");
		System.out.println("a_purc_amt = [" + getA_purc_amt() + "]");
		System.out.println("a_stmt_recp_yn = [" + getA_stmt_recp_yn() + "]");
		System.out.println("a_remk = [" + getA_remk() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String make_ask_reg_dt = req.getParameter("make_ask_reg_dt");
if( make_ask_reg_dt == null){
	System.out.println(this.toString+" : make_ask_reg_dt is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_dt is "+make_ask_reg_dt );
}
String make_ask_reg_seq = req.getParameter("make_ask_reg_seq");
if( make_ask_reg_seq == null){
	System.out.println(this.toString+" : make_ask_reg_seq is null" );
}else{
	System.out.println(this.toString+" : make_ask_reg_seq is "+make_ask_reg_seq );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String dlco_chrg_pers_nm = req.getParameter("dlco_chrg_pers_nm");
if( dlco_chrg_pers_nm == null){
	System.out.println(this.toString+" : dlco_chrg_pers_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_chrg_pers_nm is "+dlco_chrg_pers_nm );
}
String dlco_chrg_pers_cntc_plac = req.getParameter("dlco_chrg_pers_cntc_plac");
if( dlco_chrg_pers_cntc_plac == null){
	System.out.println(this.toString+" : dlco_chrg_pers_cntc_plac is null" );
}else{
	System.out.println(this.toString+" : dlco_chrg_pers_cntc_plac is "+dlco_chrg_pers_cntc_plac );
}
String advt_nm = req.getParameter("advt_nm");
if( advt_nm == null){
	System.out.println(this.toString+" : advt_nm is null" );
}else{
	System.out.println(this.toString+" : advt_nm is "+advt_nm );
}
String draft_end_dt = req.getParameter("draft_end_dt");
if( draft_end_dt == null){
	System.out.println(this.toString+" : draft_end_dt is null" );
}else{
	System.out.println(this.toString+" : draft_end_dt is "+draft_end_dt );
}
String dlvs_dt = req.getParameter("dlvs_dt");
if( dlvs_dt == null){
	System.out.println(this.toString+" : dlvs_dt is null" );
}else{
	System.out.println(this.toString+" : dlvs_dt is "+dlvs_dt );
}
String acwr_incmg_dt_tm = req.getParameter("acwr_incmg_dt_tm");
if( acwr_incmg_dt_tm == null){
	System.out.println(this.toString+" : acwr_incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : acwr_incmg_dt_tm is "+acwr_incmg_dt_tm );
}
String work_kind = req.getParameter("work_kind");
if( work_kind == null){
	System.out.println(this.toString+" : work_kind is null" );
}else{
	System.out.println(this.toString+" : work_kind is "+work_kind );
}
String make_clsf = req.getParameter("make_clsf");
if( make_clsf == null){
	System.out.println(this.toString+" : make_clsf is null" );
}else{
	System.out.println(this.toString+" : make_clsf is "+make_clsf );
}
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String clr_cd = req.getParameter("clr_cd");
if( clr_cd == null){
	System.out.println(this.toString+" : clr_cd is null" );
}else{
	System.out.println(this.toString+" : clr_cd is "+clr_cd );
}
String prt_paper = req.getParameter("prt_paper");
if( prt_paper == null){
	System.out.println(this.toString+" : prt_paper is null" );
}else{
	System.out.println(this.toString+" : prt_paper is "+prt_paper );
}
String rvord_qunt = req.getParameter("rvord_qunt");
if( rvord_qunt == null){
	System.out.println(this.toString+" : rvord_qunt is null" );
}else{
	System.out.println(this.toString+" : rvord_qunt is "+rvord_qunt );
}
String rvord_uprc = req.getParameter("rvord_uprc");
if( rvord_uprc == null){
	System.out.println(this.toString+" : rvord_uprc is null" );
}else{
	System.out.println(this.toString+" : rvord_uprc is "+rvord_uprc );
}
String rvord_amt = req.getParameter("rvord_amt");
if( rvord_amt == null){
	System.out.println(this.toString+" : rvord_amt is null" );
}else{
	System.out.println(this.toString+" : rvord_amt is "+rvord_amt );
}
String dlvs_plac = req.getParameter("dlvs_plac");
if( dlvs_plac == null){
	System.out.println(this.toString+" : dlvs_plac is null" );
}else{
	System.out.println(this.toString+" : dlvs_plac is "+dlvs_plac );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String chrg_pers_tel_no = req.getParameter("chrg_pers_tel_no");
if( chrg_pers_tel_no == null){
	System.out.println(this.toString+" : chrg_pers_tel_no is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_tel_no is "+chrg_pers_tel_no );
}
String plan_chrg_ptph_no = req.getParameter("plan_chrg_ptph_no");
if( plan_chrg_ptph_no == null){
	System.out.println(this.toString+" : plan_chrg_ptph_no is null" );
}else{
	System.out.println(this.toString+" : plan_chrg_ptph_no is "+plan_chrg_ptph_no );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String a_mode = req.getParameter("a_mode");
if( a_mode == null){
	System.out.println(this.toString+" : a_mode is null" );
}else{
	System.out.println(this.toString+" : a_mode is "+a_mode );
}
String a_make_ask_dtls_seq = req.getParameter("a_make_ask_dtls_seq");
if( a_make_ask_dtls_seq == null){
	System.out.println(this.toString+" : a_make_ask_dtls_seq is null" );
}else{
	System.out.println(this.toString+" : a_make_ask_dtls_seq is "+a_make_ask_dtls_seq );
}
String a_dlco_clsf_cd_seq = req.getParameter("a_dlco_clsf_cd_seq");
if( a_dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : a_dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : a_dlco_clsf_cd_seq is "+a_dlco_clsf_cd_seq );
}
String a_purc_clsf = req.getParameter("a_purc_clsf");
if( a_purc_clsf == null){
	System.out.println(this.toString+" : a_purc_clsf is null" );
}else{
	System.out.println(this.toString+" : a_purc_clsf is "+a_purc_clsf );
}
String a_uprc = req.getParameter("a_uprc");
if( a_uprc == null){
	System.out.println(this.toString+" : a_uprc is null" );
}else{
	System.out.println(this.toString+" : a_uprc is "+a_uprc );
}
String a_qunt = req.getParameter("a_qunt");
if( a_qunt == null){
	System.out.println(this.toString+" : a_qunt is null" );
}else{
	System.out.println(this.toString+" : a_qunt is "+a_qunt );
}
String a_purc_amt = req.getParameter("a_purc_amt");
if( a_purc_amt == null){
	System.out.println(this.toString+" : a_purc_amt is null" );
}else{
	System.out.println(this.toString+" : a_purc_amt is "+a_purc_amt );
}
String a_stmt_recp_yn = req.getParameter("a_stmt_recp_yn");
if( a_stmt_recp_yn == null){
	System.out.println(this.toString+" : a_stmt_recp_yn is null" );
}else{
	System.out.println(this.toString+" : a_stmt_recp_yn is "+a_stmt_recp_yn );
}
String a_remk = req.getParameter("a_remk");
if( a_remk == null){
	System.out.println(this.toString+" : a_remk is null" );
}else{
	System.out.println(this.toString+" : a_remk is "+a_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String flag = Util.checkString(req.getParameter("flag"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String make_ask_reg_dt = Util.checkString(req.getParameter("make_ask_reg_dt"));
String make_ask_reg_seq = Util.checkString(req.getParameter("make_ask_reg_seq"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String dlco_chrg_pers_nm = Util.checkString(req.getParameter("dlco_chrg_pers_nm"));
String dlco_chrg_pers_cntc_plac = Util.checkString(req.getParameter("dlco_chrg_pers_cntc_plac"));
String advt_nm = Util.checkString(req.getParameter("advt_nm"));
String draft_end_dt = Util.checkString(req.getParameter("draft_end_dt"));
String dlvs_dt = Util.checkString(req.getParameter("dlvs_dt"));
String acwr_incmg_dt_tm = Util.checkString(req.getParameter("acwr_incmg_dt_tm"));
String work_kind = Util.checkString(req.getParameter("work_kind"));
String make_clsf = Util.checkString(req.getParameter("make_clsf"));
String std_cd = Util.checkString(req.getParameter("std_cd"));
String clr_cd = Util.checkString(req.getParameter("clr_cd"));
String prt_paper = Util.checkString(req.getParameter("prt_paper"));
String rvord_qunt = Util.checkString(req.getParameter("rvord_qunt"));
String rvord_uprc = Util.checkString(req.getParameter("rvord_uprc"));
String rvord_amt = Util.checkString(req.getParameter("rvord_amt"));
String dlvs_plac = Util.checkString(req.getParameter("dlvs_plac"));
String remk = Util.checkString(req.getParameter("remk"));
String chrg_pers_tel_no = Util.checkString(req.getParameter("chrg_pers_tel_no"));
String plan_chrg_ptph_no = Util.checkString(req.getParameter("plan_chrg_ptph_no"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String a_mode = Util.checkString(req.getParameter("a_mode"));
String a_make_ask_dtls_seq = Util.checkString(req.getParameter("a_make_ask_dtls_seq"));
String a_dlco_clsf_cd_seq = Util.checkString(req.getParameter("a_dlco_clsf_cd_seq"));
String a_purc_clsf = Util.checkString(req.getParameter("a_purc_clsf"));
String a_uprc = Util.checkString(req.getParameter("a_uprc"));
String a_qunt = Util.checkString(req.getParameter("a_qunt"));
String a_purc_amt = Util.checkString(req.getParameter("a_purc_amt"));
String a_stmt_recp_yn = Util.checkString(req.getParameter("a_stmt_recp_yn"));
String a_remk = Util.checkString(req.getParameter("a_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String make_ask_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_dt")));
String make_ask_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("make_ask_reg_seq")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String dlco_chrg_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_chrg_pers_nm")));
String dlco_chrg_pers_cntc_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_chrg_pers_cntc_plac")));
String advt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_nm")));
String draft_end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_end_dt")));
String dlvs_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_dt")));
String acwr_incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("acwr_incmg_dt_tm")));
String work_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("work_kind")));
String make_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("make_clsf")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String clr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_cd")));
String prt_paper = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_paper")));
String rvord_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_qunt")));
String rvord_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_uprc")));
String rvord_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_amt")));
String dlvs_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvs_plac")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String chrg_pers_tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_tel_no")));
String plan_chrg_ptph_no = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_chrg_ptph_no")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String a_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("a_mode")));
String a_make_ask_dtls_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("a_make_ask_dtls_seq")));
String a_dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("a_dlco_clsf_cd_seq")));
String a_purc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("a_purc_clsf")));
String a_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("a_uprc")));
String a_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_qunt")));
String a_purc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_purc_amt")));
String a_stmt_recp_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("a_stmt_recp_yn")));
String a_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("a_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFlag(flag);
dm.setCmpy_cd(cmpy_cd);
dm.setMake_ask_reg_dt(make_ask_reg_dt);
dm.setMake_ask_reg_seq(make_ask_reg_seq);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_nm(dlco_nm);
dm.setDlco_chrg_pers_nm(dlco_chrg_pers_nm);
dm.setDlco_chrg_pers_cntc_plac(dlco_chrg_pers_cntc_plac);
dm.setAdvt_nm(advt_nm);
dm.setDraft_end_dt(draft_end_dt);
dm.setDlvs_dt(dlvs_dt);
dm.setAcwr_incmg_dt_tm(acwr_incmg_dt_tm);
dm.setWork_kind(work_kind);
dm.setMake_clsf(make_clsf);
dm.setStd_cd(std_cd);
dm.setClr_cd(clr_cd);
dm.setPrt_paper(prt_paper);
dm.setRvord_qunt(rvord_qunt);
dm.setRvord_uprc(rvord_uprc);
dm.setRvord_amt(rvord_amt);
dm.setDlvs_plac(dlvs_plac);
dm.setRemk(remk);
dm.setChrg_pers_tel_no(chrg_pers_tel_no);
dm.setPlan_chrg_ptph_no(plan_chrg_ptph_no);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setA_mode(a_mode);
dm.setA_make_ask_dtls_seq(a_make_ask_dtls_seq);
dm.setA_dlco_clsf_cd_seq(a_dlco_clsf_cd_seq);
dm.setA_purc_clsf(a_purc_clsf);
dm.setA_uprc(a_uprc);
dm.setA_qunt(a_qunt);
dm.setA_purc_amt(a_purc_amt);
dm.setA_stmt_recp_yn(a_stmt_recp_yn);
dm.setA_remk(a_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 07 13:14:30 KST 2012 */