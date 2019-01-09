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


public class HD_AFFR_2314_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String flnm;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String ofcr_clsf;
	public String congr_condl_dt;
	public String congr_condl_cd;
	public String congr_condl_fee;
	public String art_flower;
	public String ofcr_congr_condl_fee;
	public String ofcr_art_flower;
	public String remk;
	public String slip_proc_mang_dt;
	public String slip_proc_mang_seq;
	public String pay_plac_clsf;
	public String incmg_pers_ipadd;
	public String ss_emp_no;

	public HD_AFFR_2314_ADM(){}
	public HD_AFFR_2314_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String flnm, String dept_cd, String dty_cd, String posi_cd, String ofcr_clsf, String congr_condl_dt, String congr_condl_cd, String congr_condl_fee, String art_flower, String ofcr_congr_condl_fee, String ofcr_art_flower, String remk, String slip_proc_mang_dt, String slip_proc_mang_seq, String pay_plac_clsf, String incmg_pers_ipadd, String ss_emp_no){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.dty_cd = dty_cd;
		this.posi_cd = posi_cd;
		this.ofcr_clsf = ofcr_clsf;
		this.congr_condl_dt = congr_condl_dt;
		this.congr_condl_cd = congr_condl_cd;
		this.congr_condl_fee = congr_condl_fee;
		this.art_flower = art_flower;
		this.ofcr_congr_condl_fee = ofcr_congr_condl_fee;
		this.ofcr_art_flower = ofcr_art_flower;
		this.remk = remk;
		this.slip_proc_mang_dt = slip_proc_mang_dt;
		this.slip_proc_mang_seq = slip_proc_mang_seq;
		this.pay_plac_clsf = pay_plac_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.ss_emp_no = ss_emp_no;
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

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setOfcr_clsf(String ofcr_clsf){
		this.ofcr_clsf = ofcr_clsf;
	}

	public void setCongr_condl_dt(String congr_condl_dt){
		this.congr_condl_dt = congr_condl_dt;
	}

	public void setCongr_condl_cd(String congr_condl_cd){
		this.congr_condl_cd = congr_condl_cd;
	}

	public void setCongr_condl_fee(String congr_condl_fee){
		this.congr_condl_fee = congr_condl_fee;
	}

	public void setArt_flower(String art_flower){
		this.art_flower = art_flower;
	}

	public void setOfcr_congr_condl_fee(String ofcr_congr_condl_fee){
		this.ofcr_congr_condl_fee = ofcr_congr_condl_fee;
	}

	public void setOfcr_art_flower(String ofcr_art_flower){
		this.ofcr_art_flower = ofcr_art_flower;
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

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getOfcr_clsf(){
		return this.ofcr_clsf;
	}

	public String getCongr_condl_dt(){
		return this.congr_condl_dt;
	}

	public String getCongr_condl_cd(){
		return this.congr_condl_cd;
	}

	public String getCongr_condl_fee(){
		return this.congr_condl_fee;
	}

	public String getArt_flower(){
		return this.art_flower;
	}

	public String getOfcr_congr_condl_fee(){
		return this.ofcr_congr_condl_fee;
	}

	public String getOfcr_art_flower(){
		return this.ofcr_art_flower;
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

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_2314_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_2314_ADM dm = (HD_AFFR_2314_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.dty_cd);
		cstmt.setString(11, dm.posi_cd);
		cstmt.setString(12, dm.ofcr_clsf);
		cstmt.setString(13, dm.congr_condl_dt);
		cstmt.setString(14, dm.congr_condl_cd);
		cstmt.setString(15, dm.congr_condl_fee);
		cstmt.setString(16, dm.art_flower);
		cstmt.setString(17, dm.ofcr_congr_condl_fee);
		cstmt.setString(18, dm.ofcr_art_flower);
		cstmt.setString(19, dm.remk);
		cstmt.setString(20, dm.slip_proc_mang_dt);
		cstmt.setString(21, dm.slip_proc_mang_seq);
		cstmt.setString(22, dm.pay_plac_clsf);
		cstmt.setString(23, dm.incmg_pers_ipadd);
		cstmt.setString(24, dm.ss_emp_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_2314_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dty_cd = [" + getDty_cd() + "]");
		System.out.println("posi_cd = [" + getPosi_cd() + "]");
		System.out.println("ofcr_clsf = [" + getOfcr_clsf() + "]");
		System.out.println("congr_condl_dt = [" + getCongr_condl_dt() + "]");
		System.out.println("congr_condl_cd = [" + getCongr_condl_cd() + "]");
		System.out.println("congr_condl_fee = [" + getCongr_condl_fee() + "]");
		System.out.println("art_flower = [" + getArt_flower() + "]");
		System.out.println("ofcr_congr_condl_fee = [" + getOfcr_congr_condl_fee() + "]");
		System.out.println("ofcr_art_flower = [" + getOfcr_art_flower() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("slip_proc_mang_dt = [" + getSlip_proc_mang_dt() + "]");
		System.out.println("slip_proc_mang_seq = [" + getSlip_proc_mang_seq() + "]");
		System.out.println("pay_plac_clsf = [" + getPay_plac_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String ofcr_clsf = req.getParameter("ofcr_clsf");
if( ofcr_clsf == null){
	System.out.println(this.toString+" : ofcr_clsf is null" );
}else{
	System.out.println(this.toString+" : ofcr_clsf is "+ofcr_clsf );
}
String congr_condl_dt = req.getParameter("congr_condl_dt");
if( congr_condl_dt == null){
	System.out.println(this.toString+" : congr_condl_dt is null" );
}else{
	System.out.println(this.toString+" : congr_condl_dt is "+congr_condl_dt );
}
String congr_condl_cd = req.getParameter("congr_condl_cd");
if( congr_condl_cd == null){
	System.out.println(this.toString+" : congr_condl_cd is null" );
}else{
	System.out.println(this.toString+" : congr_condl_cd is "+congr_condl_cd );
}
String congr_condl_fee = req.getParameter("congr_condl_fee");
if( congr_condl_fee == null){
	System.out.println(this.toString+" : congr_condl_fee is null" );
}else{
	System.out.println(this.toString+" : congr_condl_fee is "+congr_condl_fee );
}
String art_flower = req.getParameter("art_flower");
if( art_flower == null){
	System.out.println(this.toString+" : art_flower is null" );
}else{
	System.out.println(this.toString+" : art_flower is "+art_flower );
}
String ofcr_congr_condl_fee = req.getParameter("ofcr_congr_condl_fee");
if( ofcr_congr_condl_fee == null){
	System.out.println(this.toString+" : ofcr_congr_condl_fee is null" );
}else{
	System.out.println(this.toString+" : ofcr_congr_condl_fee is "+ofcr_congr_condl_fee );
}
String ofcr_art_flower = req.getParameter("ofcr_art_flower");
if( ofcr_art_flower == null){
	System.out.println(this.toString+" : ofcr_art_flower is null" );
}else{
	System.out.println(this.toString+" : ofcr_art_flower is "+ofcr_art_flower );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dty_cd = Util.checkString(req.getParameter("dty_cd"));
String posi_cd = Util.checkString(req.getParameter("posi_cd"));
String ofcr_clsf = Util.checkString(req.getParameter("ofcr_clsf"));
String congr_condl_dt = Util.checkString(req.getParameter("congr_condl_dt"));
String congr_condl_cd = Util.checkString(req.getParameter("congr_condl_cd"));
String congr_condl_fee = Util.checkString(req.getParameter("congr_condl_fee"));
String art_flower = Util.checkString(req.getParameter("art_flower"));
String ofcr_congr_condl_fee = Util.checkString(req.getParameter("ofcr_congr_condl_fee"));
String ofcr_art_flower = Util.checkString(req.getParameter("ofcr_art_flower"));
String remk = Util.checkString(req.getParameter("remk"));
String slip_proc_mang_dt = Util.checkString(req.getParameter("slip_proc_mang_dt"));
String slip_proc_mang_seq = Util.checkString(req.getParameter("slip_proc_mang_seq"));
String pay_plac_clsf = Util.checkString(req.getParameter("pay_plac_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dty_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dty_cd")));
String posi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_cd")));
String ofcr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ofcr_clsf")));
String congr_condl_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_dt")));
String congr_condl_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_cd")));
String congr_condl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("congr_condl_fee")));
String art_flower = Util.Uni2Ksc(Util.checkString(req.getParameter("art_flower")));
String ofcr_congr_condl_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("ofcr_congr_condl_fee")));
String ofcr_art_flower = Util.Uni2Ksc(Util.checkString(req.getParameter("ofcr_art_flower")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String slip_proc_mang_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_dt")));
String slip_proc_mang_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_mang_seq")));
String pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setDty_cd(dty_cd);
dm.setPosi_cd(posi_cd);
dm.setOfcr_clsf(ofcr_clsf);
dm.setCongr_condl_dt(congr_condl_dt);
dm.setCongr_condl_cd(congr_condl_cd);
dm.setCongr_condl_fee(congr_condl_fee);
dm.setArt_flower(art_flower);
dm.setOfcr_congr_condl_fee(ofcr_congr_condl_fee);
dm.setOfcr_art_flower(ofcr_art_flower);
dm.setRemk(remk);
dm.setSlip_proc_mang_dt(slip_proc_mang_dt);
dm.setSlip_proc_mang_seq(slip_proc_mang_seq);
dm.setPay_plac_clsf(pay_plac_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 26 15:55:31 KST 2009 */