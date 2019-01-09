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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_2503_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String alon_yymm;
	public String cmpy_cd;
	public String emp_no;
	public String flnm;
	public String alon_cd;
	public String budg_cd;
	public String pay_dt;
	public String exst_pay_alon;
	public String actu_slip_no;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_SALY_2503_ADM(){}
	public HD_SALY_2503_ADM(String mode, String alon_yymm, String cmpy_cd, String emp_no, String flnm, String alon_cd, String budg_cd, String pay_dt, String exst_pay_alon, String actu_slip_no, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.alon_yymm = alon_yymm;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.alon_cd = alon_cd;
		this.budg_cd = budg_cd;
		this.pay_dt = pay_dt;
		this.exst_pay_alon = exst_pay_alon;
		this.actu_slip_no = actu_slip_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAlon_yymm(String alon_yymm){
		this.alon_yymm = alon_yymm;
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

	public void setAlon_cd(String alon_cd){
		this.alon_cd = alon_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setExst_pay_alon(String exst_pay_alon){
		this.exst_pay_alon = exst_pay_alon;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
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

	public String getAlon_yymm(){
		return this.alon_yymm;
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

	public String getAlon_cd(){
		return this.alon_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getExst_pay_alon(){
		return this.exst_pay_alon;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_2503_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_2503_ADM dm = (HD_SALY_2503_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.alon_yymm);
		cstmt.setString(5, dm.cmpy_cd);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.alon_cd);
		cstmt.setString(9, dm.budg_cd);
		cstmt.setString(10, dm.pay_dt);
		cstmt.setString(11, dm.exst_pay_alon);
		cstmt.setString(12, dm.actu_slip_no);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_2503_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("alon_yymm = [" + getAlon_yymm() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("alon_cd = [" + getAlon_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("exst_pay_alon = [" + getExst_pay_alon() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
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
String alon_yymm = req.getParameter("alon_yymm");
if( alon_yymm == null){
	System.out.println(this.toString+" : alon_yymm is null" );
}else{
	System.out.println(this.toString+" : alon_yymm is "+alon_yymm );
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
String alon_cd = req.getParameter("alon_cd");
if( alon_cd == null){
	System.out.println(this.toString+" : alon_cd is null" );
}else{
	System.out.println(this.toString+" : alon_cd is "+alon_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String exst_pay_alon = req.getParameter("exst_pay_alon");
if( exst_pay_alon == null){
	System.out.println(this.toString+" : exst_pay_alon is null" );
}else{
	System.out.println(this.toString+" : exst_pay_alon is "+exst_pay_alon );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
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
String alon_yymm = Util.checkString(req.getParameter("alon_yymm"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String alon_cd = Util.checkString(req.getParameter("alon_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String exst_pay_alon = Util.checkString(req.getParameter("exst_pay_alon"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String alon_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_yymm")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String alon_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String exst_pay_alon = Util.Uni2Ksc(Util.checkString(req.getParameter("exst_pay_alon")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setAlon_yymm(alon_yymm);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setAlon_cd(alon_cd);
dm.setBudg_cd(budg_cd);
dm.setPay_dt(pay_dt);
dm.setExst_pay_alon(exst_pay_alon);
dm.setActu_slip_no(actu_slip_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 11:40:06 KST 2015 */