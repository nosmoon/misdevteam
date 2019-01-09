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


public class HD_AFFR_2012_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String child_flnm;
	public String child_seqo;
	public String sply_amt;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String pay_plac_clsf;
	public String incmg_pers_ipadd;
	public String ss_emp_no;
	public String ch_seq;
	public String ch_occr_dt;

	public HD_AFFR_2012_ADM(){}
	public HD_AFFR_2012_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String child_flnm, String child_seqo, String sply_amt, String slip_proc_mang_dt, String slip_proc_mang_seq, String pay_plac_clsf, String incmg_pers_ipadd, String ss_emp_no, String ch_seq, String ch_occr_dt){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.child_flnm = child_flnm;
		this.child_seqo = child_seqo;
		this.sply_amt = sply_amt;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.pay_plac_clsf = pay_plac_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
		this.ch_seq = ch_seq;
		this.ch_occr_dt = ch_occr_dt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setChild_flnm(String child_flnm){
		this.child_flnm = child_flnm;
	}

	public void setChild_seqo(String child_seqo){
		this.child_seqo = child_seqo;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
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

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setCh_seq(String ch_seq){
		this.ch_seq = ch_seq;
	}

	public void setCh_occr_dt(String ch_occr_dt){
		this.ch_occr_dt = ch_occr_dt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getChild_flnm(){
		return this.child_flnm;
	}

	public String getChild_seqo(){
		return this.child_seqo;
	}

	public String getSply_amt(){
		return this.sply_amt;
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

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getCh_seq(){
		return this.ch_seq;
	}

	public String getCh_occr_dt(){
		return this.ch_occr_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2012_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2012_ADM dm = (HD_AFFR_2012_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.child_flnm);
		cstmt.setString(10, dm.child_seqo);
		cstmt.setString(11, dm.sply_amt);
		cstmt.setString(12, dm.slip_proc_mang_dt);
		cstmt.setString(13, dm.slip_proc_mang_seq);
		cstmt.setString(14, dm.pay_plac_clsf);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.ss_emp_no);
		cstmt.setString(17, dm.ch_seq);
		cstmt.setString(18, dm.ch_occr_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2012_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("child_flnm = [" + getChild_flnm() + "]");
		System.out.println("child_seqo = [" + getChild_seqo() + "]");
		System.out.println("sply_amt = [" + getSply_amt() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("ch_seq = [" + getCh_seq() + "]");
		System.out.println("ch_occr_dt = [" + getCh_occr_dt() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
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
String child_flnm = req.getParameter("child_flnm");
if( child_flnm == null){
	System.out.println(this.toString+" : child_flnm is null" );
}else{
	System.out.println(this.toString+" : child_flnm is "+child_flnm );
}
String child_seqo = req.getParameter("child_seqo");
if( child_seqo == null){
	System.out.println(this.toString+" : child_seqo is null" );
}else{
	System.out.println(this.toString+" : child_seqo is "+child_seqo );
}
String sply_amt = req.getParameter("sply_amt");
if( sply_amt == null){
	System.out.println(this.toString+" : sply_amt is null" );
}else{
	System.out.println(this.toString+" : sply_amt is "+sply_amt );
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
String ch_seq = req.getParameter("ch_seq");
if( ch_seq == null){
	System.out.println(this.toString+" : ch_seq is null" );
}else{
	System.out.println(this.toString+" : ch_seq is "+ch_seq );
}
String ch_occr_dt = req.getParameter("ch_occr_dt");
if( ch_occr_dt == null){
	System.out.println(this.toString+" : ch_occr_dt is null" );
}else{
	System.out.println(this.toString+" : ch_occr_dt is "+ch_occr_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String child_flnm = Util.checkString(req.getParameter("child_flnm"));
String child_seqo = Util.checkString(req.getParameter("child_seqo"));
String sply_amt = Util.checkString(req.getParameter("sply_amt"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String ch_seq = Util.checkString(req.getParameter("ch_seq"));
String ch_occr_dt = Util.checkString(req.getParameter("ch_occr_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String child_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("child_flnm")));
String child_seqo = Util.Uni2Ksc(Util.checkString(req.getParameter("child_seqo")));
String sply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sply_amt")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String ch_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ch_seq")));
String ch_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ch_occr_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setChild_flnm(child_flnm);
dm.setChild_seqo(child_seqo);
dm.setSply_amt(sply_amt);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setPay_plac_clsf(pay_plac_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
dm.setCh_seq(ch_seq);
dm.setCh_occr_dt(ch_occr_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 03 14:26:02 KST 2009 */