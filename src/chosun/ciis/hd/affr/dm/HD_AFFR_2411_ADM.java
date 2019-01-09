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


public class HD_AFFR_2411_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String chk_dt;
	public String prn;
	public String chk_obj_pers_rshp;
	public String chk_pers_nm;
	public String chk_hosp_nm;
	public String real_chk_fee;
	public String sply_chk_fee;
	public String ocom_subm_yn;
	public String remk;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String pay_plac_clsf;

	public HD_AFFR_2411_ADM(){}
	public HD_AFFR_2411_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String seq, String occr_dt, String incmg_pers_ipadd, String ss_emp_no, String chk_dt, String prn, String chk_obj_pers_rshp, String chk_pers_nm, String chk_hosp_nm, String real_chk_fee, String sply_chk_fee, String ocom_subm_yn, String remk, String slip_proc_mang_dt, String slip_proc_mang_seq, String pay_plac_clsf){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.chk_dt = chk_dt;
		this.prn = prn;
		this.chk_obj_pers_rshp = chk_obj_pers_rshp;
		this.chk_pers_nm = chk_pers_nm;
		this.chk_hosp_nm = chk_hosp_nm;
		this.real_chk_fee = real_chk_fee;
		this.sply_chk_fee = sply_chk_fee;
		this.ocom_subm_yn = ocom_subm_yn;
		this.remk = remk;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.pay_plac_clsf = pay_plac_clsf;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
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

	public void setChk_dt(String chk_dt){
		this.chk_dt = chk_dt;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setChk_obj_pers_rshp(String chk_obj_pers_rshp){
		this.chk_obj_pers_rshp = chk_obj_pers_rshp;
	}

	public void setChk_pers_nm(String chk_pers_nm){
		this.chk_pers_nm = chk_pers_nm;
	}

	public void setChk_hosp_nm(String chk_hosp_nm){
		this.chk_hosp_nm = chk_hosp_nm;
	}

	public void setReal_chk_fee(String real_chk_fee){
		this.real_chk_fee = real_chk_fee;
	}

	public void setSply_chk_fee(String sply_chk_fee){
		this.sply_chk_fee = sply_chk_fee;
	}

	public void setOcom_subm_yn(String ocom_subm_yn){
		this.ocom_subm_yn = ocom_subm_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSlip_proc_mang_dt(String slip_proc_mang_dt){
		this.slip_proc_mang_dt = slip_proc_mang_dt;
	}

	public void setSlip_proc_mang_seq(String slip_proc_mang_seq){
		this.slip_proc_mang_seq = slip_proc_mang_seq;
	}

	public void setPay_plac_clsf(String pay_plac_clsf){
		this.pay_plac_clsf = pay_plac_clsf;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
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

	public String getChk_dt(){
		return this.chk_dt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getChk_obj_pers_rshp(){
		return this.chk_obj_pers_rshp;
	}

	public String getChk_pers_nm(){
		return this.chk_pers_nm;
	}

	public String getChk_hosp_nm(){
		return this.chk_hosp_nm;
	}

	public String getReal_chk_fee(){
		return this.real_chk_fee;
	}

	public String getSply_chk_fee(){
		return this.sply_chk_fee;
	}

	public String getOcom_subm_yn(){
		return this.ocom_subm_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlip_proc_mang_dt(){
		return this.slip_proc_mang_dt;
	}

	public String getSlip_proc_mang_seq(){
		return this.slip_proc_mang_seq;
	}

	public String getPay_plac_clsf(){
		return this.pay_plac_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2411_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2411_ADM dm = (HD_AFFR_2411_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.dty_cd);
		cstmt.setString(9, dm.posi_cd);
		cstmt.setString(10, dm.seq);
		cstmt.setString(11, dm.occr_dt);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.ss_emp_no);
		cstmt.setString(14, dm.chk_dt);
		cstmt.setString(15, dm.prn);
		cstmt.setString(16, dm.chk_obj_pers_rshp);
		cstmt.setString(17, dm.chk_pers_nm);
		cstmt.setString(18, dm.chk_hosp_nm);
		cstmt.setString(19, dm.real_chk_fee);
		cstmt.setString(20, dm.sply_chk_fee);
		cstmt.setString(21, dm.ocom_subm_yn);
		cstmt.setString(22, dm.remk);
		cstmt.setString(23, dm.slip_proc_mang_dt);
		cstmt.setString(24, dm.slip_proc_mang_seq);
		cstmt.setString(25, dm.pay_plac_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2411_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("chk_dt = [" + getChk_dt() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("chk_obj_pers_rshp = [" + getChk_obj_pers_rshp() + "]");
		System.out.println("chk_pers_nm = [" + getChk_pers_nm() + "]");
		System.out.println("chk_hosp_nm = [" + getChk_hosp_nm() + "]");
		System.out.println("real_chk_fee = [" + getReal_chk_fee() + "]");
		System.out.println("sply_chk_fee = [" + getSply_chk_fee() + "]");
		System.out.println("ocom_subm_yn = [" + getOcom_subm_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dty_cd = req.getParameter("dty_cd");
if( dty_cd == null){
	System.out.println(this.toString+" : dty_cd is null" );
}else{
	System.out.println(this.toString+" : dty_cd is "+dty_cd );
}
String posi_cd = req.getParameter("posi_cd");
if( posi_cd == null){
	System.out.println(this.toString+" : posi_cd is null" );
}else{
	System.out.println(this.toString+" : posi_cd is "+posi_cd );
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
String chk_dt = req.getParameter("chk_dt");
if( chk_dt == null){
	System.out.println(this.toString+" : chk_dt is null" );
}else{
	System.out.println(this.toString+" : chk_dt is "+chk_dt );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String chk_obj_pers_rshp = req.getParameter("chk_obj_pers_rshp");
if( chk_obj_pers_rshp == null){
	System.out.println(this.toString+" : chk_obj_pers_rshp is null" );
}else{
	System.out.println(this.toString+" : chk_obj_pers_rshp is "+chk_obj_pers_rshp );
}
String chk_pers_nm = req.getParameter("chk_pers_nm");
if( chk_pers_nm == null){
	System.out.println(this.toString+" : chk_pers_nm is null" );
}else{
	System.out.println(this.toString+" : chk_pers_nm is "+chk_pers_nm );
}
String chk_hosp_nm = req.getParameter("chk_hosp_nm");
if( chk_hosp_nm == null){
	System.out.println(this.toString+" : chk_hosp_nm is null" );
}else{
	System.out.println(this.toString+" : chk_hosp_nm is "+chk_hosp_nm );
}
String real_chk_fee = req.getParameter("real_chk_fee");
if( real_chk_fee == null){
	System.out.println(this.toString+" : real_chk_fee is null" );
}else{
	System.out.println(this.toString+" : real_chk_fee is "+real_chk_fee );
}
String sply_chk_fee = req.getParameter("sply_chk_fee");
if( sply_chk_fee == null){
	System.out.println(this.toString+" : sply_chk_fee is null" );
}else{
	System.out.println(this.toString+" : sply_chk_fee is "+sply_chk_fee );
}
String ocom_subm_yn = req.getParameter("ocom_subm_yn");
if( ocom_subm_yn == null){
	System.out.println(this.toString+" : ocom_subm_yn is null" );
}else{
	System.out.println(this.toString+" : ocom_subm_yn is "+ocom_subm_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String slip_proc_mang_dt = req.getParameter("slip_proc_mang_dt");
if( slip_proc_mang_dt == null){
	System.out.println(this.toString+" : slip_proc_mang_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_dt is "+slip_proc_mang_dt );
}
String slip_proc_mang_seq = req.getParameter("slip_proc_mang_seq");
if( slip_proc_mang_seq == null){
	System.out.println(this.toString+" : slip_proc_mang_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_mang_seq is "+slip_proc_mang_seq );
}
String pay_plac_clsf = req.getParameter("pay_plac_clsf");
if( pay_plac_clsf == null){
	System.out.println(this.toString+" : pay_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_plac_clsf is "+pay_plac_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String chk_dt = Util.checkString(req.getParameter("chk_dt"));
String prn = Util.checkString(req.getParameter("prn"));
String chk_obj_pers_rshp = Util.checkString(req.getParameter("chk_obj_pers_rshp"));
String chk_pers_nm = Util.checkString(req.getParameter("chk_pers_nm"));
String chk_hosp_nm = Util.checkString(req.getParameter("chk_hosp_nm"));
String real_chk_fee = Util.checkString(req.getParameter("real_chk_fee"));
String sply_chk_fee = Util.checkString(req.getParameter("sply_chk_fee"));
String ocom_subm_yn = Util.checkString(req.getParameter("ocom_subm_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String chk_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_dt")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String chk_obj_pers_rshp = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_obj_pers_rshp")));
String chk_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_pers_nm")));
String chk_hosp_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_hosp_nm")));
String real_chk_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("real_chk_fee")));
String sply_chk_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_chk_fee")));
String ocom_subm_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("ocom_subm_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setChk_dt(chk_dt);
dm.setPrn(prn);
dm.setChk_obj_pers_rshp(chk_obj_pers_rshp);
dm.setChk_pers_nm(chk_pers_nm);
dm.setChk_hosp_nm(chk_hosp_nm);
dm.setReal_chk_fee(real_chk_fee);
dm.setSply_chk_fee(sply_chk_fee);
dm.setOcom_subm_yn(ocom_subm_yn);
dm.setRemk(remk);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setPay_plac_clsf(pay_plac_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 26 16:37:03 KST 2012 */