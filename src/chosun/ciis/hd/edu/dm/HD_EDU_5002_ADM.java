/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.edu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.edu.ds.*;
import chosun.ciis.hd.edu.rec.*;

/**
 * 
 */


public class HD_EDU_5002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String aplc_dt;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String phon_num;
	public String out_class_type;
	public String acty_type;
	public String acty_etc;
	public String req_instt_nm;
	public String req_presi_nm;
	public String req_chrg_dept_nm;
	public String req_chrg_nm;
	public String req_phon_nm;
	public String req_resn;
	public String out_class_subj_nm;
	public String out_class_plac;
	public String out_class_fr_dt;
	public String out_class_to_dt;
	public String out_class_fr_tm;
	public String out_class_to_tm;
	public String yy_avg_tms;
	public String mm_avg_tms;
	public String tms_avg_tm;
	public String tot_amt;
	public String tms_avg_amt;
	public String trff_stay_amt;
	public String tms_avg_trff_stay_amt;
	public String proc_stat;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_EDU_5002_ADM(){}
	public HD_EDU_5002_ADM(String mode, String cmpy_cd, String aplc_dt, String emp_no, String flnm, String dept_cd, String dty_cd, String posi_cd, String phon_num, String out_class_type, String acty_type, String acty_etc, String req_instt_nm, String req_presi_nm, String req_chrg_dept_nm, String req_chrg_nm, String req_phon_nm, String req_resn, String out_class_subj_nm, String out_class_plac, String out_class_fr_dt, String out_class_to_dt, String out_class_fr_tm, String out_class_to_tm, String yy_avg_tms, String mm_avg_tms, String tms_avg_tm, String tot_amt, String tms_avg_amt, String trff_stay_amt, String tms_avg_trff_stay_amt, String proc_stat, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.aplc_dt = aplc_dt;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.phon_num = phon_num;
		this.out_class_type = out_class_type;
		this.acty_type = acty_type;
		this.acty_etc = acty_etc;
		this.req_instt_nm = req_instt_nm;
		this.req_presi_nm = req_presi_nm;
		this.req_chrg_dept_nm = req_chrg_dept_nm;
		this.req_chrg_nm = req_chrg_nm;
		this.req_phon_nm = req_phon_nm;
		this.req_resn = req_resn;
		this.out_class_subj_nm = out_class_subj_nm;
		this.out_class_plac = out_class_plac;
		this.out_class_fr_dt = out_class_fr_dt;
		this.out_class_to_dt = out_class_to_dt;
		this.out_class_fr_tm = out_class_fr_tm;
		this.out_class_to_tm = out_class_to_tm;
		this.yy_avg_tms = yy_avg_tms;
		this.mm_avg_tms = mm_avg_tms;
		this.tms_avg_tm = tms_avg_tm;
		this.tot_amt = tot_amt;
		this.tms_avg_amt = tms_avg_amt;
		this.trff_stay_amt = trff_stay_amt;
		this.tms_avg_trff_stay_amt = tms_avg_trff_stay_amt;
		this.proc_stat = proc_stat;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
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

	public void setPhon_num(String phon_num){
		this.phon_num = phon_num;
	}

	public void setOut_class_type(String out_class_type){
		this.out_class_type = out_class_type;
	}

	public void setActy_type(String acty_type){
		this.acty_type = acty_type;
	}

	public void setActy_etc(String acty_etc){
		this.acty_etc = acty_etc;
	}

	public void setReq_instt_nm(String req_instt_nm){
		this.req_instt_nm = req_instt_nm;
	}

	public void setReq_presi_nm(String req_presi_nm){
		this.req_presi_nm = req_presi_nm;
	}

	public void setReq_chrg_dept_nm(String req_chrg_dept_nm){
		this.req_chrg_dept_nm = req_chrg_dept_nm;
	}

	public void setReq_chrg_nm(String req_chrg_nm){
		this.req_chrg_nm = req_chrg_nm;
	}

	public void setReq_phon_nm(String req_phon_nm){
		this.req_phon_nm = req_phon_nm;
	}

	public void setReq_resn(String req_resn){
		this.req_resn = req_resn;
	}

	public void setOut_class_subj_nm(String out_class_subj_nm){
		this.out_class_subj_nm = out_class_subj_nm;
	}

	public void setOut_class_plac(String out_class_plac){
		this.out_class_plac = out_class_plac;
	}

	public void setOut_class_fr_dt(String out_class_fr_dt){
		this.out_class_fr_dt = out_class_fr_dt;
	}

	public void setOut_class_to_dt(String out_class_to_dt){
		this.out_class_to_dt = out_class_to_dt;
	}

	public void setOut_class_fr_tm(String out_class_fr_tm){
		this.out_class_fr_tm = out_class_fr_tm;
	}

	public void setOut_class_to_tm(String out_class_to_tm){
		this.out_class_to_tm = out_class_to_tm;
	}

	public void setYy_avg_tms(String yy_avg_tms){
		this.yy_avg_tms = yy_avg_tms;
	}

	public void setMm_avg_tms(String mm_avg_tms){
		this.mm_avg_tms = mm_avg_tms;
	}

	public void setTms_avg_tm(String tms_avg_tm){
		this.tms_avg_tm = tms_avg_tm;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setTms_avg_amt(String tms_avg_amt){
		this.tms_avg_amt = tms_avg_amt;
	}

	public void setTrff_stay_amt(String trff_stay_amt){
		this.trff_stay_amt = trff_stay_amt;
	}

	public void setTms_avg_trff_stay_amt(String tms_avg_trff_stay_amt){
		this.tms_avg_trff_stay_amt = tms_avg_trff_stay_amt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
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

	public String getPhon_num(){
		return this.phon_num;
	}

	public String getOut_class_type(){
		return this.out_class_type;
	}

	public String getActy_type(){
		return this.acty_type;
	}

	public String getActy_etc(){
		return this.acty_etc;
	}

	public String getReq_instt_nm(){
		return this.req_instt_nm;
	}

	public String getReq_presi_nm(){
		return this.req_presi_nm;
	}

	public String getReq_chrg_dept_nm(){
		return this.req_chrg_dept_nm;
	}

	public String getReq_chrg_nm(){
		return this.req_chrg_nm;
	}

	public String getReq_phon_nm(){
		return this.req_phon_nm;
	}

	public String getReq_resn(){
		return this.req_resn;
	}

	public String getOut_class_subj_nm(){
		return this.out_class_subj_nm;
	}

	public String getOut_class_plac(){
		return this.out_class_plac;
	}

	public String getOut_class_fr_dt(){
		return this.out_class_fr_dt;
	}

	public String getOut_class_to_dt(){
		return this.out_class_to_dt;
	}

	public String getOut_class_fr_tm(){
		return this.out_class_fr_tm;
	}

	public String getOut_class_to_tm(){
		return this.out_class_to_tm;
	}

	public String getYy_avg_tms(){
		return this.yy_avg_tms;
	}

	public String getMm_avg_tms(){
		return this.mm_avg_tms;
	}

	public String getTms_avg_tm(){
		return this.tms_avg_tm;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getTms_avg_amt(){
		return this.tms_avg_amt;
	}

	public String getTrff_stay_amt(){
		return this.trff_stay_amt;
	}

	public String getTms_avg_trff_stay_amt(){
		return this.tms_avg_trff_stay_amt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EDU_5002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EDU_5002_ADM dm = (HD_EDU_5002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.aplc_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.dty_cd);
		cstmt.setString(10, dm.posi_cd);
		cstmt.setString(11, dm.phon_num);
		cstmt.setString(12, dm.out_class_type);
		cstmt.setString(13, dm.acty_type);
		cstmt.setString(14, dm.acty_etc);
		cstmt.setString(15, dm.req_instt_nm);
		cstmt.setString(16, dm.req_presi_nm);
		cstmt.setString(17, dm.req_chrg_dept_nm);
		cstmt.setString(18, dm.req_chrg_nm);
		cstmt.setString(19, dm.req_phon_nm);
		cstmt.setString(20, dm.req_resn);
		cstmt.setString(21, dm.out_class_subj_nm);
		cstmt.setString(22, dm.out_class_plac);
		cstmt.setString(23, dm.out_class_fr_dt);
		cstmt.setString(24, dm.out_class_to_dt);
		cstmt.setString(25, dm.out_class_fr_tm);
		cstmt.setString(26, dm.out_class_to_tm);
		cstmt.setString(27, dm.yy_avg_tms);
		cstmt.setString(28, dm.mm_avg_tms);
		cstmt.setString(29, dm.tms_avg_tm);
		cstmt.setString(30, dm.tot_amt);
		cstmt.setString(31, dm.tms_avg_amt);
		cstmt.setString(32, dm.trff_stay_amt);
		cstmt.setString(33, dm.tms_avg_trff_stay_amt);
		cstmt.setString(34, dm.proc_stat);
		cstmt.setString(35, dm.incmg_pers_ipadd);
		cstmt.setString(36, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.edu.ds.HD_EDU_5002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("phon_num = [" + getPhon_num() + "]");
		System.out.println("out_class_type = [" + getOut_class_type() + "]");
		System.out.println("acty_type = [" + getActy_type() + "]");
		System.out.println("acty_etc = [" + getActy_etc() + "]");
		System.out.println("req_instt_nm = [" + getReq_instt_nm() + "]");
		System.out.println("req_presi_nm = [" + getReq_presi_nm() + "]");
		System.out.println("req_chrg_dept_nm = [" + getReq_chrg_dept_nm() + "]");
		System.out.println("req_chrg_nm = [" + getReq_chrg_nm() + "]");
		System.out.println("req_phon_nm = [" + getReq_phon_nm() + "]");
		System.out.println("req_resn = [" + getReq_resn() + "]");
		System.out.println("out_class_subj_nm = [" + getOut_class_subj_nm() + "]");
		System.out.println("out_class_plac = [" + getOut_class_plac() + "]");
		System.out.println("out_class_fr_dt = [" + getOut_class_fr_dt() + "]");
		System.out.println("out_class_to_dt = [" + getOut_class_to_dt() + "]");
		System.out.println("out_class_fr_tm = [" + getOut_class_fr_tm() + "]");
		System.out.println("out_class_to_tm = [" + getOut_class_to_tm() + "]");
		System.out.println("yy_avg_tms = [" + getYy_avg_tms() + "]");
		System.out.println("mm_avg_tms = [" + getMm_avg_tms() + "]");
		System.out.println("tms_avg_tm = [" + getTms_avg_tm() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
		System.out.println("tms_avg_amt = [" + getTms_avg_amt() + "]");
		System.out.println("trff_stay_amt = [" + getTrff_stay_amt() + "]");
		System.out.println("tms_avg_trff_stay_amt = [" + getTms_avg_trff_stay_amt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
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
String phon_num = req.getParameter("phon_num");
if( phon_num == null){
	System.out.println(this.toString+" : phon_num is null" );
}else{
	System.out.println(this.toString+" : phon_num is "+phon_num );
}
String out_class_type = req.getParameter("out_class_type");
if( out_class_type == null){
	System.out.println(this.toString+" : out_class_type is null" );
}else{
	System.out.println(this.toString+" : out_class_type is "+out_class_type );
}
String acty_type = req.getParameter("acty_type");
if( acty_type == null){
	System.out.println(this.toString+" : acty_type is null" );
}else{
	System.out.println(this.toString+" : acty_type is "+acty_type );
}
String acty_etc = req.getParameter("acty_etc");
if( acty_etc == null){
	System.out.println(this.toString+" : acty_etc is null" );
}else{
	System.out.println(this.toString+" : acty_etc is "+acty_etc );
}
String req_instt_nm = req.getParameter("req_instt_nm");
if( req_instt_nm == null){
	System.out.println(this.toString+" : req_instt_nm is null" );
}else{
	System.out.println(this.toString+" : req_instt_nm is "+req_instt_nm );
}
String req_presi_nm = req.getParameter("req_presi_nm");
if( req_presi_nm == null){
	System.out.println(this.toString+" : req_presi_nm is null" );
}else{
	System.out.println(this.toString+" : req_presi_nm is "+req_presi_nm );
}
String req_chrg_dept_nm = req.getParameter("req_chrg_dept_nm");
if( req_chrg_dept_nm == null){
	System.out.println(this.toString+" : req_chrg_dept_nm is null" );
}else{
	System.out.println(this.toString+" : req_chrg_dept_nm is "+req_chrg_dept_nm );
}
String req_chrg_nm = req.getParameter("req_chrg_nm");
if( req_chrg_nm == null){
	System.out.println(this.toString+" : req_chrg_nm is null" );
}else{
	System.out.println(this.toString+" : req_chrg_nm is "+req_chrg_nm );
}
String req_phon_nm = req.getParameter("req_phon_nm");
if( req_phon_nm == null){
	System.out.println(this.toString+" : req_phon_nm is null" );
}else{
	System.out.println(this.toString+" : req_phon_nm is "+req_phon_nm );
}
String req_resn = req.getParameter("req_resn");
if( req_resn == null){
	System.out.println(this.toString+" : req_resn is null" );
}else{
	System.out.println(this.toString+" : req_resn is "+req_resn );
}
String out_class_subj_nm = req.getParameter("out_class_subj_nm");
if( out_class_subj_nm == null){
	System.out.println(this.toString+" : out_class_subj_nm is null" );
}else{
	System.out.println(this.toString+" : out_class_subj_nm is "+out_class_subj_nm );
}
String out_class_plac = req.getParameter("out_class_plac");
if( out_class_plac == null){
	System.out.println(this.toString+" : out_class_plac is null" );
}else{
	System.out.println(this.toString+" : out_class_plac is "+out_class_plac );
}
String out_class_fr_dt = req.getParameter("out_class_fr_dt");
if( out_class_fr_dt == null){
	System.out.println(this.toString+" : out_class_fr_dt is null" );
}else{
	System.out.println(this.toString+" : out_class_fr_dt is "+out_class_fr_dt );
}
String out_class_to_dt = req.getParameter("out_class_to_dt");
if( out_class_to_dt == null){
	System.out.println(this.toString+" : out_class_to_dt is null" );
}else{
	System.out.println(this.toString+" : out_class_to_dt is "+out_class_to_dt );
}
String out_class_fr_tm = req.getParameter("out_class_fr_tm");
if( out_class_fr_tm == null){
	System.out.println(this.toString+" : out_class_fr_tm is null" );
}else{
	System.out.println(this.toString+" : out_class_fr_tm is "+out_class_fr_tm );
}
String out_class_to_tm = req.getParameter("out_class_to_tm");
if( out_class_to_tm == null){
	System.out.println(this.toString+" : out_class_to_tm is null" );
}else{
	System.out.println(this.toString+" : out_class_to_tm is "+out_class_to_tm );
}
String yy_avg_tms = req.getParameter("yy_avg_tms");
if( yy_avg_tms == null){
	System.out.println(this.toString+" : yy_avg_tms is null" );
}else{
	System.out.println(this.toString+" : yy_avg_tms is "+yy_avg_tms );
}
String mm_avg_tms = req.getParameter("mm_avg_tms");
if( mm_avg_tms == null){
	System.out.println(this.toString+" : mm_avg_tms is null" );
}else{
	System.out.println(this.toString+" : mm_avg_tms is "+mm_avg_tms );
}
String tms_avg_tm = req.getParameter("tms_avg_tm");
if( tms_avg_tm == null){
	System.out.println(this.toString+" : tms_avg_tm is null" );
}else{
	System.out.println(this.toString+" : tms_avg_tm is "+tms_avg_tm );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String tms_avg_amt = req.getParameter("tms_avg_amt");
if( tms_avg_amt == null){
	System.out.println(this.toString+" : tms_avg_amt is null" );
}else{
	System.out.println(this.toString+" : tms_avg_amt is "+tms_avg_amt );
}
String trff_stay_amt = req.getParameter("trff_stay_amt");
if( trff_stay_amt == null){
	System.out.println(this.toString+" : trff_stay_amt is null" );
}else{
	System.out.println(this.toString+" : trff_stay_amt is "+trff_stay_amt );
}
String tms_avg_trff_stay_amt = req.getParameter("tms_avg_trff_stay_amt");
if( tms_avg_trff_stay_amt == null){
	System.out.println(this.toString+" : tms_avg_trff_stay_amt is null" );
}else{
	System.out.println(this.toString+" : tms_avg_trff_stay_amt is "+tms_avg_trff_stay_amt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String phon_num = Util.checkString(req.getParameter("phon_num"));
String out_class_type = Util.checkString(req.getParameter("out_class_type"));
String acty_type = Util.checkString(req.getParameter("acty_type"));
String acty_etc = Util.checkString(req.getParameter("acty_etc"));
String req_instt_nm = Util.checkString(req.getParameter("req_instt_nm"));
String req_presi_nm = Util.checkString(req.getParameter("req_presi_nm"));
String req_chrg_dept_nm = Util.checkString(req.getParameter("req_chrg_dept_nm"));
String req_chrg_nm = Util.checkString(req.getParameter("req_chrg_nm"));
String req_phon_nm = Util.checkString(req.getParameter("req_phon_nm"));
String req_resn = Util.checkString(req.getParameter("req_resn"));
String out_class_subj_nm = Util.checkString(req.getParameter("out_class_subj_nm"));
String out_class_plac = Util.checkString(req.getParameter("out_class_plac"));
String out_class_fr_dt = Util.checkString(req.getParameter("out_class_fr_dt"));
String out_class_to_dt = Util.checkString(req.getParameter("out_class_to_dt"));
String out_class_fr_tm = Util.checkString(req.getParameter("out_class_fr_tm"));
String out_class_to_tm = Util.checkString(req.getParameter("out_class_to_tm"));
String yy_avg_tms = Util.checkString(req.getParameter("yy_avg_tms"));
String mm_avg_tms = Util.checkString(req.getParameter("mm_avg_tms"));
String tms_avg_tm = Util.checkString(req.getParameter("tms_avg_tm"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String tms_avg_amt = Util.checkString(req.getParameter("tms_avg_amt"));
String trff_stay_amt = Util.checkString(req.getParameter("trff_stay_amt"));
String tms_avg_trff_stay_amt = Util.checkString(req.getParameter("tms_avg_trff_stay_amt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String phon_num = Util.Uni2Ksc(Util.checkString(req.getParameter("phon_num")));
String out_class_type = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_type")));
String acty_type = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_type")));
String acty_etc = Util.Uni2Ksc(Util.checkString(req.getParameter("acty_etc")));
String req_instt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("req_instt_nm")));
String req_presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("req_presi_nm")));
String req_chrg_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("req_chrg_dept_nm")));
String req_chrg_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("req_chrg_nm")));
String req_phon_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("req_phon_nm")));
String req_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("req_resn")));
String out_class_subj_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_subj_nm")));
String out_class_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_plac")));
String out_class_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_fr_dt")));
String out_class_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_to_dt")));
String out_class_fr_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_fr_tm")));
String out_class_to_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("out_class_to_tm")));
String yy_avg_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("yy_avg_tms")));
String mm_avg_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_avg_tms")));
String tms_avg_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_avg_tm")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String tms_avg_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_avg_amt")));
String trff_stay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("trff_stay_amt")));
String tms_avg_trff_stay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_avg_trff_stay_amt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setAplc_dt(aplc_dt);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setPhon_num(phon_num);
dm.setOut_class_type(out_class_type);
dm.setActy_type(acty_type);
dm.setActy_etc(acty_etc);
dm.setReq_instt_nm(req_instt_nm);
dm.setReq_presi_nm(req_presi_nm);
dm.setReq_chrg_dept_nm(req_chrg_dept_nm);
dm.setReq_chrg_nm(req_chrg_nm);
dm.setReq_phon_nm(req_phon_nm);
dm.setReq_resn(req_resn);
dm.setOut_class_subj_nm(out_class_subj_nm);
dm.setOut_class_plac(out_class_plac);
dm.setOut_class_fr_dt(out_class_fr_dt);
dm.setOut_class_to_dt(out_class_to_dt);
dm.setOut_class_fr_tm(out_class_fr_tm);
dm.setOut_class_to_tm(out_class_to_tm);
dm.setYy_avg_tms(yy_avg_tms);
dm.setMm_avg_tms(mm_avg_tms);
dm.setTms_avg_tm(tms_avg_tm);
dm.setTot_amt(tot_amt);
dm.setTms_avg_amt(tms_avg_amt);
dm.setTrff_stay_amt(trff_stay_amt);
dm.setTms_avg_trff_stay_amt(tms_avg_trff_stay_amt);
dm.setProc_stat(proc_stat);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 23 16:25:54 KST 2016 */