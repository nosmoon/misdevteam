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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7130_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String frlc_no;
	public String mang_no;
	public String flnm;
	public String dept_cd;
	public String prn;
	public String tel_no;
	public String zip_code;
	public String addr;
	public String dtls_addr;
	public String chrg_posk_cd;
	public String medi_cd;
	public String thrw_pgm;
	public String medi_cd2;
	public String thrw_pgm2;
	public String cntr_dt;
	public String cntr_expr_dt;
	public String lvcmpy_dt;
	public String work_yn;
	public String pay_cycl;
	public String servcost;
	public String serv_pay_cond;
	public String draft_no;
	public String draft_dept_cd;
	public String supr_dept_cd;
	public String incm_clsf_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chrg_posk_nm;
	public String all_insr_dduc_yn;
	public String remk;

	public HD_INFO_7130_ADM(){}
	public HD_INFO_7130_ADM(String mode, String cmpy_cd, String frlc_no, String mang_no, String flnm, String dept_cd, String prn, String tel_no, String zip_code, String addr, String dtls_addr, String chrg_posk_cd, String medi_cd, String thrw_pgm, String medi_cd2, String thrw_pgm2, String cntr_dt, String cntr_expr_dt, String lvcmpy_dt, String work_yn, String pay_cycl, String servcost, String serv_pay_cond, String draft_no, String draft_dept_cd, String supr_dept_cd, String incm_clsf_cd, String incmg_pers_ipadd, String incmg_pers, String incmg_dt_tm, String chrg_posk_nm, String all_insr_dduc_yn, String remk){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.frlc_no = frlc_no;
		this.mang_no = mang_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.prn = prn;
		this.tel_no = tel_no;
		this.zip_code = zip_code;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.chrg_posk_cd = chrg_posk_cd;
		this.medi_cd = medi_cd;
		this.thrw_pgm = thrw_pgm;
		this.medi_cd2 = medi_cd2;
		this.thrw_pgm2 = thrw_pgm2;
		this.cntr_dt = cntr_dt;
		this.cntr_expr_dt = cntr_expr_dt;
		this.lvcmpy_dt = lvcmpy_dt;
		this.work_yn = work_yn;
		this.pay_cycl = pay_cycl;
		this.servcost = servcost;
		this.serv_pay_cond = serv_pay_cond;
		this.draft_no = draft_no;
		this.draft_dept_cd = draft_dept_cd;
		this.supr_dept_cd = supr_dept_cd;
		this.incm_clsf_cd = incm_clsf_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.incmg_dt_tm = incmg_dt_tm;
		this.chrg_posk_nm = chrg_posk_nm;
		this.all_insr_dduc_yn = all_insr_dduc_yn;
		this.remk = remk;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setZip_code(String zip_code){
		this.zip_code = zip_code;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setThrw_pgm2(String thrw_pgm2){
		this.thrw_pgm2 = thrw_pgm2;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setWork_yn(String work_yn){
		this.work_yn = work_yn;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setServ_pay_cond(String serv_pay_cond){
		this.serv_pay_cond = serv_pay_cond;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setDraft_dept_cd(String draft_dept_cd){
		this.draft_dept_cd = draft_dept_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChrg_posk_nm(String chrg_posk_nm){
		this.chrg_posk_nm = chrg_posk_nm;
	}

	public void setAll_insr_dduc_yn(String all_insr_dduc_yn){
		this.all_insr_dduc_yn = all_insr_dduc_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getZip_code(){
		return this.zip_code;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getThrw_pgm2(){
		return this.thrw_pgm2;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getWork_yn(){
		return this.work_yn;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getServ_pay_cond(){
		return this.serv_pay_cond;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getDraft_dept_cd(){
		return this.draft_dept_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChrg_posk_nm(){
		return this.chrg_posk_nm;
	}

	public String getAll_insr_dduc_yn(){
		return this.all_insr_dduc_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7130_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7130_ADM dm = (HD_INFO_7130_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.frlc_no);
		cstmt.setString(6, dm.mang_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.prn);
		cstmt.setString(10, dm.tel_no);
		cstmt.setString(11, dm.zip_code);
		cstmt.setString(12, dm.addr);
		cstmt.setString(13, dm.dtls_addr);
		cstmt.setString(14, dm.chrg_posk_cd);
		cstmt.setString(15, dm.medi_cd);
		cstmt.setString(16, dm.thrw_pgm);
		cstmt.setString(17, dm.medi_cd2);
		cstmt.setString(18, dm.thrw_pgm2);
		cstmt.setString(19, dm.cntr_dt);
		cstmt.setString(20, dm.cntr_expr_dt);
		cstmt.setString(21, dm.lvcmpy_dt);
		cstmt.setString(22, dm.work_yn);
		cstmt.setString(23, dm.pay_cycl);
		cstmt.setString(24, dm.servcost);
		cstmt.setString(25, dm.serv_pay_cond);
		cstmt.setString(26, dm.draft_no);
		cstmt.setString(27, dm.draft_dept_cd);
		cstmt.setString(28, dm.supr_dept_cd);
		cstmt.setString(29, dm.incm_clsf_cd);
		cstmt.setString(30, dm.incmg_pers_ipadd);
		cstmt.setString(31, dm.incmg_pers);
		cstmt.setString(32, dm.incmg_dt_tm);
		cstmt.setString(33, dm.chrg_posk_nm);
		cstmt.setString(34, dm.all_insr_dduc_yn);
		cstmt.setString(35, dm.remk);
		cstmt.registerOutParameter(36, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7130_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frlc_no = [" + getFrlc_no() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("zip_code = [" + getZip_code() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("chrg_posk_cd = [" + getChrg_posk_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("thrw_pgm = [" + getThrw_pgm() + "]");
		System.out.println("medi_cd2 = [" + getMedi_cd2() + "]");
		System.out.println("thrw_pgm2 = [" + getThrw_pgm2() + "]");
		System.out.println("cntr_dt = [" + getCntr_dt() + "]");
		System.out.println("cntr_expr_dt = [" + getCntr_expr_dt() + "]");
		System.out.println("lvcmpy_dt = [" + getLvcmpy_dt() + "]");
		System.out.println("work_yn = [" + getWork_yn() + "]");
		System.out.println("pay_cycl = [" + getPay_cycl() + "]");
		System.out.println("servcost = [" + getServcost() + "]");
		System.out.println("serv_pay_cond = [" + getServ_pay_cond() + "]");
		System.out.println("draft_no = [" + getDraft_no() + "]");
		System.out.println("draft_dept_cd = [" + getDraft_dept_cd() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("chrg_posk_nm = [" + getChrg_posk_nm() + "]");
		System.out.println("all_insr_dduc_yn = [" + getAll_insr_dduc_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String frlc_no = req.getParameter("frlc_no");
if( frlc_no == null){
	System.out.println(this.toString+" : frlc_no is null" );
}else{
	System.out.println(this.toString+" : frlc_no is "+frlc_no );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String zip_code = req.getParameter("zip_code");
if( zip_code == null){
	System.out.println(this.toString+" : zip_code is null" );
}else{
	System.out.println(this.toString+" : zip_code is "+zip_code );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String chrg_posk_cd = req.getParameter("chrg_posk_cd");
if( chrg_posk_cd == null){
	System.out.println(this.toString+" : chrg_posk_cd is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_cd is "+chrg_posk_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String thrw_pgm = req.getParameter("thrw_pgm");
if( thrw_pgm == null){
	System.out.println(this.toString+" : thrw_pgm is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm is "+thrw_pgm );
}
String medi_cd2 = req.getParameter("medi_cd2");
if( medi_cd2 == null){
	System.out.println(this.toString+" : medi_cd2 is null" );
}else{
	System.out.println(this.toString+" : medi_cd2 is "+medi_cd2 );
}
String thrw_pgm2 = req.getParameter("thrw_pgm2");
if( thrw_pgm2 == null){
	System.out.println(this.toString+" : thrw_pgm2 is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm2 is "+thrw_pgm2 );
}
String cntr_dt = req.getParameter("cntr_dt");
if( cntr_dt == null){
	System.out.println(this.toString+" : cntr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_dt is "+cntr_dt );
}
String cntr_expr_dt = req.getParameter("cntr_expr_dt");
if( cntr_expr_dt == null){
	System.out.println(this.toString+" : cntr_expr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_expr_dt is "+cntr_expr_dt );
}
String lvcmpy_dt = req.getParameter("lvcmpy_dt");
if( lvcmpy_dt == null){
	System.out.println(this.toString+" : lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : lvcmpy_dt is "+lvcmpy_dt );
}
String work_yn = req.getParameter("work_yn");
if( work_yn == null){
	System.out.println(this.toString+" : work_yn is null" );
}else{
	System.out.println(this.toString+" : work_yn is "+work_yn );
}
String pay_cycl = req.getParameter("pay_cycl");
if( pay_cycl == null){
	System.out.println(this.toString+" : pay_cycl is null" );
}else{
	System.out.println(this.toString+" : pay_cycl is "+pay_cycl );
}
String servcost = req.getParameter("servcost");
if( servcost == null){
	System.out.println(this.toString+" : servcost is null" );
}else{
	System.out.println(this.toString+" : servcost is "+servcost );
}
String serv_pay_cond = req.getParameter("serv_pay_cond");
if( serv_pay_cond == null){
	System.out.println(this.toString+" : serv_pay_cond is null" );
}else{
	System.out.println(this.toString+" : serv_pay_cond is "+serv_pay_cond );
}
String draft_no = req.getParameter("draft_no");
if( draft_no == null){
	System.out.println(this.toString+" : draft_no is null" );
}else{
	System.out.println(this.toString+" : draft_no is "+draft_no );
}
String draft_dept_cd = req.getParameter("draft_dept_cd");
if( draft_dept_cd == null){
	System.out.println(this.toString+" : draft_dept_cd is null" );
}else{
	System.out.println(this.toString+" : draft_dept_cd is "+draft_dept_cd );
}
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
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
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String chrg_posk_nm = req.getParameter("chrg_posk_nm");
if( chrg_posk_nm == null){
	System.out.println(this.toString+" : chrg_posk_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_nm is "+chrg_posk_nm );
}
String all_insr_dduc_yn = req.getParameter("all_insr_dduc_yn");
if( all_insr_dduc_yn == null){
	System.out.println(this.toString+" : all_insr_dduc_yn is null" );
}else{
	System.out.println(this.toString+" : all_insr_dduc_yn is "+all_insr_dduc_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frlc_no = Util.checkString(req.getParameter("frlc_no"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String prn = Util.checkString(req.getParameter("prn"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String zip_code = Util.checkString(req.getParameter("zip_code"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
String medi_cd2 = Util.checkString(req.getParameter("medi_cd2"));
String thrw_pgm2 = Util.checkString(req.getParameter("thrw_pgm2"));
String cntr_dt = Util.checkString(req.getParameter("cntr_dt"));
String cntr_expr_dt = Util.checkString(req.getParameter("cntr_expr_dt"));
String lvcmpy_dt = Util.checkString(req.getParameter("lvcmpy_dt"));
String work_yn = Util.checkString(req.getParameter("work_yn"));
String pay_cycl = Util.checkString(req.getParameter("pay_cycl"));
String servcost = Util.checkString(req.getParameter("servcost"));
String serv_pay_cond = Util.checkString(req.getParameter("serv_pay_cond"));
String draft_no = Util.checkString(req.getParameter("draft_no"));
String draft_dept_cd = Util.checkString(req.getParameter("draft_dept_cd"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String chrg_posk_nm = Util.checkString(req.getParameter("chrg_posk_nm"));
String all_insr_dduc_yn = Util.checkString(req.getParameter("all_insr_dduc_yn"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frlc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("frlc_no")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String zip_code = Util.Uni2Ksc(Util.checkString(req.getParameter("zip_code")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String chrg_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String thrw_pgm = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm")));
String medi_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd2")));
String thrw_pgm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm2")));
String cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_dt")));
String cntr_expr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_expr_dt")));
String lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpy_dt")));
String work_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yn")));
String pay_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cycl")));
String servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost")));
String serv_pay_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("serv_pay_cond")));
String draft_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_no")));
String draft_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_dept_cd")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String chrg_posk_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_nm")));
String all_insr_dduc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("all_insr_dduc_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setFrlc_no(frlc_no);
dm.setMang_no(mang_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setPrn(prn);
dm.setTel_no(tel_no);
dm.setZip_code(zip_code);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setChrg_posk_cd(chrg_posk_cd);
dm.setMedi_cd(medi_cd);
dm.setThrw_pgm(thrw_pgm);
dm.setMedi_cd2(medi_cd2);
dm.setThrw_pgm2(thrw_pgm2);
dm.setCntr_dt(cntr_dt);
dm.setCntr_expr_dt(cntr_expr_dt);
dm.setLvcmpy_dt(lvcmpy_dt);
dm.setWork_yn(work_yn);
dm.setPay_cycl(pay_cycl);
dm.setServcost(servcost);
dm.setServ_pay_cond(serv_pay_cond);
dm.setDraft_no(draft_no);
dm.setDraft_dept_cd(draft_dept_cd);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setChrg_posk_nm(chrg_posk_nm);
dm.setAll_insr_dduc_yn(all_insr_dduc_yn);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 13 14:14:09 KST 2018 */