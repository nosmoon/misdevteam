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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_3715_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String rept_no;
	public String sue_chrg_pers;
	public String dlay_rcpm_plan_dt;
	public String clct_dt;
	public String clct_amt;
	public String loss_amt_inclu_yn;
	public String remk;
	public String remk_1;
	public String remk_2;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_3715_UDM(){}
	public IS_DEP_3715_UDM(String cmpy_cd, String mode, String rept_no, String sue_chrg_pers, String dlay_rcpm_plan_dt, String clct_dt, String clct_amt, String loss_amt_inclu_yn, String remk, String remk_1, String remk_2, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.rept_no = rept_no;
		this.sue_chrg_pers = sue_chrg_pers;
		this.dlay_rcpm_plan_dt = dlay_rcpm_plan_dt;
		this.clct_dt = clct_dt;
		this.clct_amt = clct_amt;
		this.loss_amt_inclu_yn = loss_amt_inclu_yn;
		this.remk = remk;
		this.remk_1 = remk_1;
		this.remk_2 = remk_2;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setSue_chrg_pers(String sue_chrg_pers){
		this.sue_chrg_pers = sue_chrg_pers;
	}

	public void setDlay_rcpm_plan_dt(String dlay_rcpm_plan_dt){
		this.dlay_rcpm_plan_dt = dlay_rcpm_plan_dt;
	}

	public void setClct_dt(String clct_dt){
		this.clct_dt = clct_dt;
	}

	public void setClct_amt(String clct_amt){
		this.clct_amt = clct_amt;
	}

	public void setLoss_amt_inclu_yn(String loss_amt_inclu_yn){
		this.loss_amt_inclu_yn = loss_amt_inclu_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRemk_1(String remk_1){
		this.remk_1 = remk_1;
	}

	public void setRemk_2(String remk_2){
		this.remk_2 = remk_2;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getSue_chrg_pers(){
		return this.sue_chrg_pers;
	}

	public String getDlay_rcpm_plan_dt(){
		return this.dlay_rcpm_plan_dt;
	}

	public String getClct_dt(){
		return this.clct_dt;
	}

	public String getClct_amt(){
		return this.clct_amt;
	}

	public String getLoss_amt_inclu_yn(){
		return this.loss_amt_inclu_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRemk_1(){
		return this.remk_1;
	}

	public String getRemk_2(){
		return this.remk_2;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_3715_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_3715_UDM dm = (IS_DEP_3715_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.rept_no);
		cstmt.setString(6, dm.sue_chrg_pers);
		cstmt.setString(7, dm.dlay_rcpm_plan_dt);
		cstmt.setString(8, dm.clct_dt);
		cstmt.setString(9, dm.clct_amt);
		cstmt.setString(10, dm.loss_amt_inclu_yn);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.remk_1);
		cstmt.setString(13, dm.remk_2);
		cstmt.setString(14, dm.incmg_pers_ip);
		cstmt.setString(15, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_3715_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("sue_chrg_pers = [" + getSue_chrg_pers() + "]");
		System.out.println("dlay_rcpm_plan_dt = [" + getDlay_rcpm_plan_dt() + "]");
		System.out.println("clct_dt = [" + getClct_dt() + "]");
		System.out.println("clct_amt = [" + getClct_amt() + "]");
		System.out.println("loss_amt_inclu_yn = [" + getLoss_amt_inclu_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("remk_1 = [" + getRemk_1() + "]");
		System.out.println("remk_2 = [" + getRemk_2() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String sue_chrg_pers = req.getParameter("sue_chrg_pers");
if( sue_chrg_pers == null){
	System.out.println(this.toString+" : sue_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : sue_chrg_pers is "+sue_chrg_pers );
}
String dlay_rcpm_plan_dt = req.getParameter("dlay_rcpm_plan_dt");
if( dlay_rcpm_plan_dt == null){
	System.out.println(this.toString+" : dlay_rcpm_plan_dt is null" );
}else{
	System.out.println(this.toString+" : dlay_rcpm_plan_dt is "+dlay_rcpm_plan_dt );
}
String clct_dt = req.getParameter("clct_dt");
if( clct_dt == null){
	System.out.println(this.toString+" : clct_dt is null" );
}else{
	System.out.println(this.toString+" : clct_dt is "+clct_dt );
}
String clct_amt = req.getParameter("clct_amt");
if( clct_amt == null){
	System.out.println(this.toString+" : clct_amt is null" );
}else{
	System.out.println(this.toString+" : clct_amt is "+clct_amt );
}
String loss_amt_inclu_yn = req.getParameter("loss_amt_inclu_yn");
if( loss_amt_inclu_yn == null){
	System.out.println(this.toString+" : loss_amt_inclu_yn is null" );
}else{
	System.out.println(this.toString+" : loss_amt_inclu_yn is "+loss_amt_inclu_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String remk_1 = req.getParameter("remk_1");
if( remk_1 == null){
	System.out.println(this.toString+" : remk_1 is null" );
}else{
	System.out.println(this.toString+" : remk_1 is "+remk_1 );
}
String remk_2 = req.getParameter("remk_2");
if( remk_2 == null){
	System.out.println(this.toString+" : remk_2 is null" );
}else{
	System.out.println(this.toString+" : remk_2 is "+remk_2 );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String sue_chrg_pers = Util.checkString(req.getParameter("sue_chrg_pers"));
String dlay_rcpm_plan_dt = Util.checkString(req.getParameter("dlay_rcpm_plan_dt"));
String clct_dt = Util.checkString(req.getParameter("clct_dt"));
String clct_amt = Util.checkString(req.getParameter("clct_amt"));
String loss_amt_inclu_yn = Util.checkString(req.getParameter("loss_amt_inclu_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String remk_1 = Util.checkString(req.getParameter("remk_1"));
String remk_2 = Util.checkString(req.getParameter("remk_2"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String sue_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("sue_chrg_pers")));
String dlay_rcpm_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dlay_rcpm_plan_dt")));
String clct_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clct_dt")));
String clct_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("clct_amt")));
String loss_amt_inclu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("loss_amt_inclu_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String remk_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_1")));
String remk_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk_2")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setRept_no(rept_no);
dm.setSue_chrg_pers(sue_chrg_pers);
dm.setDlay_rcpm_plan_dt(dlay_rcpm_plan_dt);
dm.setClct_dt(clct_dt);
dm.setClct_amt(clct_amt);
dm.setLoss_amt_inclu_yn(loss_amt_inclu_yn);
dm.setRemk(remk);
dm.setRemk_1(remk_1);
dm.setRemk_2(remk_2);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 10:54:41 KST 2012 */