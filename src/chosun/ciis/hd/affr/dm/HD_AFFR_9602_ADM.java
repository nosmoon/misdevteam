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


public class HD_AFFR_9602_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String mang_no;
	public String seq;
	public String flnm;
	public String memb_clsf;
	public String aply_obj_clsf;
	public String aply_obj_name;
	public String expn_clsf_cd;
	public String expn_cont;
	public String str_dt;
	public String end_dt;
	public String limt_amt;
	public String clam_amt;
	public String excl_amt;
	public String sply_amt;
	public String bank_cd;
	public String acct_no;
	public String deps_per;
	public String reg_dt;
	public String pay_dt;
	public String stlm_desty;
	public String remk;
	public String proc_stat;
	public String expn_resn_cd1;
	public String expn_resn_cd2;
	public String expn_resn_cd3;
	public String spos_name;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_9602_ADM(){}
	public HD_AFFR_9602_ADM(String cmpy_cd, String mode, String mang_no, String seq, String flnm, String memb_clsf, String aply_obj_clsf, String aply_obj_name, String expn_clsf_cd, String expn_cont, String str_dt, String end_dt, String limt_amt, String clam_amt, String excl_amt, String sply_amt, String bank_cd, String acct_no, String deps_per, String reg_dt, String pay_dt, String stlm_desty, String remk, String proc_stat, String expn_resn_cd1, String expn_resn_cd2, String expn_resn_cd3, String spos_name, String incmg_pers_ipadd, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.mang_no = mang_no;
		this.seq = seq;
		this.flnm = flnm;
		this.memb_clsf = memb_clsf;
		this.aply_obj_clsf = aply_obj_clsf;
		this.aply_obj_name = aply_obj_name;
		this.expn_clsf_cd = expn_clsf_cd;
		this.expn_cont = expn_cont;
		this.str_dt = str_dt;
		this.end_dt = end_dt;
		this.limt_amt = limt_amt;
		this.clam_amt = clam_amt;
		this.excl_amt = excl_amt;
		this.sply_amt = sply_amt;
		this.bank_cd = bank_cd;
		this.acct_no = acct_no;
		this.deps_per = deps_per;
		this.reg_dt = reg_dt;
		this.pay_dt = pay_dt;
		this.stlm_desty = stlm_desty;
		this.remk = remk;
		this.proc_stat = proc_stat;
		this.expn_resn_cd1 = expn_resn_cd1;
		this.expn_resn_cd2 = expn_resn_cd2;
		this.expn_resn_cd3 = expn_resn_cd3;
		this.spos_name = spos_name;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMemb_clsf(String memb_clsf){
		this.memb_clsf = memb_clsf;
	}

	public void setAply_obj_clsf(String aply_obj_clsf){
		this.aply_obj_clsf = aply_obj_clsf;
	}

	public void setAply_obj_name(String aply_obj_name){
		this.aply_obj_name = aply_obj_name;
	}

	public void setExpn_clsf_cd(String expn_clsf_cd){
		this.expn_clsf_cd = expn_clsf_cd;
	}

	public void setExpn_cont(String expn_cont){
		this.expn_cont = expn_cont;
	}

	public void setStr_dt(String str_dt){
		this.str_dt = str_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}
	
	public void setLimt_amt(String limt_amt){
		this.limt_amt = limt_amt;
	}
	
	public void setClam_amt(String clam_amt){
		this.clam_amt = clam_amt;
	}

	public void setExcl_amt(String excl_amt){
		this.excl_amt = excl_amt;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_per(String deps_per){
		this.deps_per = deps_per;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setStlm_desty(String stlm_desty){
		this.stlm_desty = stlm_desty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setExpn_resn_cd1(String expn_resn_cd1){
		this.expn_resn_cd1 = expn_resn_cd1;
	}
	
	public void setExpn_resn_cd2(String expn_resn_cd2){
		this.expn_resn_cd2 = expn_resn_cd2;
	}
	
	public void setExpn_resn_cd3(String expn_resn_cd3){
		this.expn_resn_cd3 = expn_resn_cd3;
	}
	
	public void setSpos_name(String spos_name){
		this.spos_name = spos_name;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMemb_clsf(){
		return this.memb_clsf;
	}

	public String getAply_obj_clsf(){
		return this.aply_obj_clsf;
	}

	public String getAply_obj_name(){
		return this.aply_obj_name;
	}

	public String getExpn_clsf_cd(){
		return this.expn_clsf_cd;
	}

	public String getExpn_cont(){
		return this.expn_cont;
	}

	public String getStr_dt(){
		return this.str_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}
	
	public String getLimt_amt(){
		return this.limt_amt;
	}
	
	public String getClam_amt(){
		return this.clam_amt;
	}

	public String getExcl_amt(){
		return this.excl_amt;
	}

	public String getSply_amt(){
		return this.sply_amt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_per(){
		return this.deps_per;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getStlm_desty(){
		return this.stlm_desty;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getExpn_resn_cd1(){
		return this.expn_resn_cd1;
	}
	
	public String getExpn_resn_cd2(){
		return this.expn_resn_cd2;
	}
	
	public String getExpn_resn_cd3(){
		return this.expn_resn_cd3;
	}
	
	public String getSpos_name(){
		return this.spos_name;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_9602_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_9602_ADM dm = (HD_AFFR_9602_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.mang_no);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.memb_clsf);
		cstmt.setString(9, dm.aply_obj_clsf);
		cstmt.setString(10, dm.aply_obj_name);
		cstmt.setString(11, dm.expn_clsf_cd);
		cstmt.setString(12, dm.expn_cont);
		cstmt.setString(13, dm.str_dt);
		cstmt.setString(14, dm.end_dt);
		cstmt.setString(15, dm.limt_amt);
		cstmt.setString(16, dm.clam_amt);
		cstmt.setString(17, dm.excl_amt);
		cstmt.setString(18, dm.sply_amt);
		cstmt.setString(19, dm.bank_cd);
		cstmt.setString(20, dm.acct_no);
		cstmt.setString(21, dm.deps_per);
		cstmt.setString(22, dm.reg_dt);
		cstmt.setString(23, dm.pay_dt);
		cstmt.setString(24, dm.stlm_desty);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.proc_stat);
		cstmt.setString(27, dm.expn_resn_cd1);
		cstmt.setString(28, dm.expn_resn_cd2);
		cstmt.setString(29, dm.expn_resn_cd3);
		cstmt.setString(30, dm.spos_name);
		cstmt.setString(31, dm.incmg_pers_ipadd);
		cstmt.setString(32, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_9602_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("memb_clsf = [" + getMemb_clsf() + "]");
		System.out.println("aply_obj_clsf = [" + getAply_obj_clsf() + "]");
		System.out.println("aply_obj_name = [" + getAply_obj_name() + "]");
		System.out.println("expn_clsf_cd = [" + getExpn_clsf_cd() + "]");
		System.out.println("expn_cont = [" + getExpn_cont() + "]");
		System.out.println("str_dt = [" + getStr_dt() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("limt_amt = [" + getLimt_amt() + "]");
		System.out.println("clam_amt = [" + getClam_amt() + "]");
		System.out.println("excl_amt = [" + getExcl_amt() + "]");
		System.out.println("sply_amt = [" + getSply_amt() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("deps_per = [" + getDeps_per() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("stlm_desty = [" + getStlm_desty() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("expn_resn_cd1 = [" + getExpn_resn_cd1() + "]");
		System.out.println("expn_resn_cd2 = [" + getExpn_resn_cd2() + "]");
		System.out.println("expn_resn_cd3 = [" + getExpn_resn_cd3() + "]");
		System.out.println("spos_name = [" + getSpos_name() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String memb_clsf = req.getParameter("memb_clsf");
if( memb_clsf == null){
	System.out.println(this.toString+" : memb_clsf is null" );
}else{
	System.out.println(this.toString+" : memb_clsf is "+memb_clsf );
}
String aply_obj_clsf = req.getParameter("aply_obj_clsf");
if( aply_obj_clsf == null){
	System.out.println(this.toString+" : aply_obj_clsf is null" );
}else{
	System.out.println(this.toString+" : aply_obj_clsf is "+aply_obj_clsf );
}
String aply_obj_name = req.getParameter("aply_obj_name");
if( aply_obj_name == null){
	System.out.println(this.toString+" : aply_obj_name is null" );
}else{
	System.out.println(this.toString+" : aply_obj_name is "+aply_obj_name );
}
String expn_clsf_cd = req.getParameter("expn_clsf_cd");
if( expn_clsf_cd == null){
	System.out.println(this.toString+" : expn_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : expn_clsf_cd is "+expn_clsf_cd );
}
String expn_cont = req.getParameter("expn_cont");
if( expn_cont == null){
	System.out.println(this.toString+" : expn_cont is null" );
}else{
	System.out.println(this.toString+" : expn_cont is "+expn_cont );
}
String str_dt = req.getParameter("str_dt");
if( str_dt == null){
	System.out.println(this.toString+" : str_dt is null" );
}else{
	System.out.println(this.toString+" : str_dt is "+str_dt );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
String clam_amt = req.getParameter("clam_amt");
if( clam_amt == null){
	System.out.println(this.toString+" : clam_amt is null" );
}else{
	System.out.println(this.toString+" : clam_amt is "+clam_amt );
}
String excl_amt = req.getParameter("excl_amt");
if( excl_amt == null){
	System.out.println(this.toString+" : excl_amt is null" );
}else{
	System.out.println(this.toString+" : excl_amt is "+excl_amt );
}
String sply_amt = req.getParameter("sply_amt");
if( sply_amt == null){
	System.out.println(this.toString+" : sply_amt is null" );
}else{
	System.out.println(this.toString+" : sply_amt is "+sply_amt );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String deps_per = req.getParameter("deps_per");
if( deps_per == null){
	System.out.println(this.toString+" : deps_per is null" );
}else{
	System.out.println(this.toString+" : deps_per is "+deps_per );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String stlm_desty = req.getParameter("stlm_desty");
if( stlm_desty == null){
	System.out.println(this.toString+" : stlm_desty is null" );
}else{
	System.out.println(this.toString+" : stlm_desty is "+stlm_desty );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String expn_resn_cd = req.getParameter("expn_resn_cd");
if( expn_resn_cd == null){
	System.out.println(this.toString+" : expn_resn_cd is null" );
}else{
	System.out.println(this.toString+" : expn_resn_cd is "+expn_resn_cd );
}
String spos_name = req.getParameter("spos_name");
if( spos_name == null){
	System.out.println(this.toString+" : spos_name is null" );
}else{
	System.out.println(this.toString+" : spos_name is "+spos_name );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String memb_clsf = Util.checkString(req.getParameter("memb_clsf"));
String aply_obj_clsf = Util.checkString(req.getParameter("aply_obj_clsf"));
String aply_obj_name = Util.checkString(req.getParameter("aply_obj_name"));
String expn_clsf_cd = Util.checkString(req.getParameter("expn_clsf_cd"));
String expn_cont = Util.checkString(req.getParameter("expn_cont"));
String str_dt = Util.checkString(req.getParameter("str_dt"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String clam_amt = Util.checkString(req.getParameter("clam_amt"));
String excl_amt = Util.checkString(req.getParameter("excl_amt"));
String sply_amt = Util.checkString(req.getParameter("sply_amt"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String deps_per = Util.checkString(req.getParameter("deps_per"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String stlm_desty = Util.checkString(req.getParameter("stlm_desty"));
String remk = Util.checkString(req.getParameter("remk"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String expn_resn_cd = Util.checkString(req.getParameter("expn_resn_cd"));
String spos_name = Util.checkString(req.getParameter("spos_name"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String memb_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("memb_clsf")));
String aply_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_obj_clsf")));
String aply_obj_name = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_obj_name")));
String expn_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_clsf_cd")));
String expn_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_cont")));
String str_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("str_dt")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String clam_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_amt")));
String excl_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("excl_amt")));
String sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_amt")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String deps_per = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_per")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String stlm_desty = Util.Uni2Ksc(Util.checkString(req.getParameter("stlm_desty")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String expn_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("expn_resn_cd")));
String spos_name = Util.Uni2Ksc(Util.checkString(req.getParameter("spos_name")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setMang_no(mang_no);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setMemb_clsf(memb_clsf);
dm.setAply_obj_clsf(aply_obj_clsf);
dm.setAply_obj_name(aply_obj_name);
dm.setExpn_clsf_cd(expn_clsf_cd);
dm.setExpn_cont(expn_cont);
dm.setStr_dt(str_dt);
dm.setEnd_dt(end_dt);
dm.setClam_amt(clam_amt);
dm.setExcl_amt(excl_amt);
dm.setSply_amt(sply_amt);
dm.setBank_cd(bank_cd);
dm.setAcct_no(acct_no);
dm.setDeps_per(deps_per);
dm.setReg_dt(reg_dt);
dm.setPay_dt(pay_dt);
dm.setStlm_desty(stlm_desty);
dm.setRemk(remk);
dm.setProc_stat(proc_stat);
dm.setExpn_resn_cd(expn_resn_cd);
dm.setSpos_name(spos_name);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 19 15:07:20 KST 2017 */