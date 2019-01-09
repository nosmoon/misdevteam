/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 :
* 작성자 :
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String etc_saly_cd;
	public String budg_cd;
	public String fisc_dt;
	public String dr_amt;
	public String crdt_amt_1;
	public String crdt_amt_2;
	public String cal_pay_amt;
	public String emp_amt;
	public String np_amt;
	public String hlth_amt;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_2001_ADM(){}
	public HD_LVCMPY_2001_ADM(String mode, String cmpy_cd, String emp_no, String flnm, String etc_saly_cd, String budg_cd, String fisc_dt, String dr_amt, String crdt_amt_1, String crdt_amt_2, String cal_pay_amt, String emp_amt, String np_amt, String hlth_amt, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String slip_arow_no, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.etc_saly_cd = etc_saly_cd;
		this.budg_cd = budg_cd;
		this.fisc_dt = fisc_dt;
		this.dr_amt = dr_amt;
		this.crdt_amt_1 = crdt_amt_1;
		this.crdt_amt_2 = crdt_amt_2;
		this.cal_pay_amt = cal_pay_amt;
		this.emp_amt = emp_amt;
		this.np_amt = np_amt;
		this.hlth_amt = hlth_amt;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.slip_arow_no = slip_arow_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setEtc_saly_cd(String etc_saly_cd){
		this.etc_saly_cd = etc_saly_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt_1(String crdt_amt_1){
		this.crdt_amt_1 = crdt_amt_1;
	}

	public void setCrdt_amt_2(String crdt_amt_2){
		this.crdt_amt_2 = crdt_amt_2;
	}

	public void setCal_pay_amt(String cal_pay_amt){
		this.cal_pay_amt = cal_pay_amt;
	}

	public void setEmp_amt(String emp_amt){
		this.emp_amt = emp_amt;
	}

	public void setNp_amt(String np_amt){
		this.np_amt = np_amt;
	}

	public void setHlth_amt(String hlth_amt){
		this.hlth_amt = hlth_amt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getEtc_saly_cd(){
		return this.etc_saly_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt_1(){
		return this.crdt_amt_1;
	}

	public String getCrdt_amt_2(){
		return this.crdt_amt_2;
	}

	public String getCal_pay_amt(){
		return this.cal_pay_amt;
	}

	public String getEmp_amt(){
		return this.emp_amt;
	}

	public String getNp_amt(){
		return this.np_amt;
	}

	public String getHlth_amt(){
		return this.hlth_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2001_ADM dm = (HD_LVCMPY_2001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.etc_saly_cd);
		cstmt.setString(8, dm.budg_cd);
		cstmt.setString(9, dm.fisc_dt);
		cstmt.setString(10, dm.dr_amt);
		cstmt.setString(11, dm.crdt_amt_1);
		cstmt.setString(12, dm.crdt_amt_2);
		cstmt.setString(13, dm.cal_pay_amt);
		cstmt.setString(14, dm.emp_amt);
		cstmt.setString(15, dm.np_amt);
		cstmt.setString(16, dm.hlth_amt);
		cstmt.setString(17, dm.slip_occr_dt);
		cstmt.setString(18, dm.slip_clsf_cd);
		cstmt.setString(19, dm.slip_seq);
		cstmt.setString(20, dm.slip_sub_seq);
		cstmt.setString(21, dm.slip_arow_no);
		cstmt.setString(22, dm.incmg_pers_ipadd);
		cstmt.setString(23, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("etc_saly_cd = [" + getEtc_saly_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("crdt_amt_1 = [" + getCrdt_amt_1() + "]");
		System.out.println("crdt_amt_2 = [" + getCrdt_amt_2() + "]");
		System.out.println("cal_pay_amt = [" + getCal_pay_amt() + "]");
		System.out.println("emp_amt = [" + getEmp_amt() + "]");
		System.out.println("np_amt = [" + getNp_amt() + "]");
		System.out.println("hlth_amt = [" + getHlth_amt() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
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
String etc_saly_cd = req.getParameter("etc_saly_cd");
if( etc_saly_cd == null){
	System.out.println(this.toString+" : etc_saly_cd is null" );
}else{
	System.out.println(this.toString+" : etc_saly_cd is "+etc_saly_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String crdt_amt_1 = req.getParameter("crdt_amt_1");
if( crdt_amt_1 == null){
	System.out.println(this.toString+" : crdt_amt_1 is null" );
}else{
	System.out.println(this.toString+" : crdt_amt_1 is "+crdt_amt_1 );
}
String crdt_amt_2 = req.getParameter("crdt_amt_2");
if( crdt_amt_2 == null){
	System.out.println(this.toString+" : crdt_amt_2 is null" );
}else{
	System.out.println(this.toString+" : crdt_amt_2 is "+crdt_amt_2 );
}
String cal_pay_amt = req.getParameter("cal_pay_amt");
if( cal_pay_amt == null){
	System.out.println(this.toString+" : cal_pay_amt is null" );
}else{
	System.out.println(this.toString+" : cal_pay_amt is "+cal_pay_amt );
}
String emp_amt = req.getParameter("emp_amt");
if( emp_amt == null){
	System.out.println(this.toString+" : emp_amt is null" );
}else{
	System.out.println(this.toString+" : emp_amt is "+emp_amt );
}
String np_amt = req.getParameter("np_amt");
if( np_amt == null){
	System.out.println(this.toString+" : np_amt is null" );
}else{
	System.out.println(this.toString+" : np_amt is "+np_amt );
}
String hlth_amt = req.getParameter("hlth_amt");
if( hlth_amt == null){
	System.out.println(this.toString+" : hlth_amt is null" );
}else{
	System.out.println(this.toString+" : hlth_amt is "+hlth_amt );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String etc_saly_cd = Util.checkString(req.getParameter("etc_saly_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String crdt_amt_1 = Util.checkString(req.getParameter("crdt_amt_1"));
String crdt_amt_2 = Util.checkString(req.getParameter("crdt_amt_2"));
String cal_pay_amt = Util.checkString(req.getParameter("cal_pay_amt"));
String emp_amt = Util.checkString(req.getParameter("emp_amt"));
String np_amt = Util.checkString(req.getParameter("np_amt"));
String hlth_amt = Util.checkString(req.getParameter("hlth_amt"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String etc_saly_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_saly_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String crdt_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt_1")));
String crdt_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt_2")));
String cal_pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cal_pay_amt")));
String emp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_amt")));
String np_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_amt")));
String hlth_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("hlth_amt")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setEtc_saly_cd(etc_saly_cd);
dm.setBudg_cd(budg_cd);
dm.setFisc_dt(fisc_dt);
dm.setDr_amt(dr_amt);
dm.setCrdt_amt_1(crdt_amt_1);
dm.setCrdt_amt_2(crdt_amt_2);
dm.setCal_pay_amt(cal_pay_amt);
dm.setEmp_amt(emp_amt);
dm.setNp_amt(np_amt);
dm.setHlth_amt(hlth_amt);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setSlip_arow_no(slip_arow_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 04 19:04:35 KST 2012 */