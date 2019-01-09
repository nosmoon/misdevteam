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


package chosun.ciis.sp.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.dep.ds.*;
import chosun.ciis.sp.dep.rec.*;

/**
 * 
 */


public class SP_DEP_1510_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String reg_dt;
	public String occr_slip_clsf;
	public String occr_slip;
	public String dlco_no;
	public String sale_yymm;
	public String sale_item_cd;
	public String amt;
	public String incmg_dept_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_DEP_1510_ADM(){}
	public SP_DEP_1510_ADM(String cmpy_cd, String reg_dt, String occr_slip_clsf, String occr_slip, String dlco_no, String sale_yymm, String sale_item_cd, String amt, String incmg_dept_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.reg_dt = reg_dt;
		this.occr_slip_clsf = occr_slip_clsf;
		this.occr_slip = occr_slip;
		this.dlco_no = dlco_no;
		this.sale_yymm = sale_yymm;
		this.sale_item_cd = sale_item_cd;
		this.amt = amt;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
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

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_DEP_1510_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_DEP_1510_ADM dm = (SP_DEP_1510_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.reg_dt);
		cstmt.setString(5, dm.occr_slip_clsf);
		cstmt.setString(6, dm.occr_slip);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.sale_yymm);
		cstmt.setString(9, dm.sale_item_cd);
		cstmt.setString(10, dm.amt);
		cstmt.setString(11, dm.incmg_dept_cd);
		cstmt.setString(12, dm.incmg_pers_ip);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.registerOutParameter(14, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.dep.ds.SP_DEP_1510_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("occr_slip_clsf = [" + getOccr_slip_clsf() + "]");
		System.out.println("occr_slip = [" + getOccr_slip() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("sale_yymm = [" + getSale_yymm() + "]");
		System.out.println("sale_item_cd = [" + getSale_item_cd() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
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
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String occr_slip_clsf = req.getParameter("occr_slip_clsf");
if( occr_slip_clsf == null){
	System.out.println(this.toString+" : occr_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : occr_slip_clsf is "+occr_slip_clsf );
}
String occr_slip = req.getParameter("occr_slip");
if( occr_slip == null){
	System.out.println(this.toString+" : occr_slip is null" );
}else{
	System.out.println(this.toString+" : occr_slip is "+occr_slip );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String sale_yymm = req.getParameter("sale_yymm");
if( sale_yymm == null){
	System.out.println(this.toString+" : sale_yymm is null" );
}else{
	System.out.println(this.toString+" : sale_yymm is "+sale_yymm );
}
String sale_item_cd = req.getParameter("sale_item_cd");
if( sale_item_cd == null){
	System.out.println(this.toString+" : sale_item_cd is null" );
}else{
	System.out.println(this.toString+" : sale_item_cd is "+sale_item_cd );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
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
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String occr_slip_clsf = Util.checkString(req.getParameter("occr_slip_clsf"));
String occr_slip = Util.checkString(req.getParameter("occr_slip"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String sale_yymm = Util.checkString(req.getParameter("sale_yymm"));
String sale_item_cd = Util.checkString(req.getParameter("sale_item_cd"));
String amt = Util.checkString(req.getParameter("amt"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String occr_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_clsf")));
String occr_slip = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String sale_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_yymm")));
String sale_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_item_cd")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setReg_dt(reg_dt);
dm.setOccr_slip_clsf(occr_slip_clsf);
dm.setOccr_slip(occr_slip);
dm.setDlco_no(dlco_no);
dm.setSale_yymm(sale_yymm);
dm.setSale_item_cd(sale_item_cd);
dm.setAmt(amt);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 07 15:07:07 KST 2013 */