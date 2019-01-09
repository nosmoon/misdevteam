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


package chosun.ciis.hd.evlu.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.evlu.ds.*;
import chosun.ciis.hd.evlu.rec.*;

/**
 * 
 */


public class HD_EVLU_5705_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evlu_yy;
	public String tms_clsf;
	public String evlu_grp_cd;
	public String emp_no;
	public String dept_cd;
	public String obj_excl_clsf;
	public String up_emp_no1;
	public String up_emp_no2;
	public String in_cmpy_dt;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String flag;

	public HD_EVLU_5705_ADM(){}
	public HD_EVLU_5705_ADM(String cmpy_cd, String evlu_yy, String tms_clsf, String evlu_grp_cd, String emp_no, String dept_cd, String obj_excl_clsf, String up_emp_no1, String up_emp_no2, String in_cmpy_dt, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String flag){
		this.cmpy_cd = cmpy_cd;
		this.evlu_yy = evlu_yy;
		this.tms_clsf = tms_clsf;
		this.evlu_grp_cd = evlu_grp_cd;
		this.emp_no = emp_no;
		this.dept_cd = dept_cd;
		this.obj_excl_clsf = obj_excl_clsf;
		this.up_emp_no1 = up_emp_no1;
		this.up_emp_no2 = up_emp_no2;
		this.in_cmpy_dt = in_cmpy_dt;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setObj_excl_clsf(String obj_excl_clsf){
		this.obj_excl_clsf = obj_excl_clsf;
	}

	public void setUp_emp_no1(String up_emp_no1){
		this.up_emp_no1 = up_emp_no1;
	}

	public void setUp_emp_no2(String up_emp_no2){
		this.up_emp_no2 = up_emp_no2;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getObj_excl_clsf(){
		return this.obj_excl_clsf;
	}

	public String getUp_emp_no1(){
		return this.up_emp_no1;
	}

	public String getUp_emp_no2(){
		return this.up_emp_no2;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_EVLU_5705_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_EVLU_5705_ADM dm = (HD_EVLU_5705_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.evlu_yy);
		cstmt.setString(6, dm.tms_clsf);
		cstmt.setString(7, dm.evlu_grp_cd);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.obj_excl_clsf);
		cstmt.setString(11, dm.up_emp_no1);
		cstmt.setString(12, dm.up_emp_no2);
		cstmt.setString(13, dm.in_cmpy_dt);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.chg_pers);
		cstmt.setString(17, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_EVLU_5705_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evlu_yy = [" + getEvlu_yy() + "]");
		System.out.println("tms_clsf = [" + getTms_clsf() + "]");
		System.out.println("evlu_grp_cd = [" + getEvlu_grp_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("obj_excl_clsf = [" + getObj_excl_clsf() + "]");
		System.out.println("up_emp_no1 = [" + getUp_emp_no1() + "]");
		System.out.println("up_emp_no2 = [" + getUp_emp_no2() + "]");
		System.out.println("in_cmpy_dt = [" + getIn_cmpy_dt() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String evlu_yy = req.getParameter("evlu_yy");
if( evlu_yy == null){
	System.out.println(this.toString+" : evlu_yy is null" );
}else{
	System.out.println(this.toString+" : evlu_yy is "+evlu_yy );
}
String tms_clsf = req.getParameter("tms_clsf");
if( tms_clsf == null){
	System.out.println(this.toString+" : tms_clsf is null" );
}else{
	System.out.println(this.toString+" : tms_clsf is "+tms_clsf );
}
String evlu_grp_cd = req.getParameter("evlu_grp_cd");
if( evlu_grp_cd == null){
	System.out.println(this.toString+" : evlu_grp_cd is null" );
}else{
	System.out.println(this.toString+" : evlu_grp_cd is "+evlu_grp_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String obj_excl_clsf = req.getParameter("obj_excl_clsf");
if( obj_excl_clsf == null){
	System.out.println(this.toString+" : obj_excl_clsf is null" );
}else{
	System.out.println(this.toString+" : obj_excl_clsf is "+obj_excl_clsf );
}
String up_emp_no1 = req.getParameter("up_emp_no1");
if( up_emp_no1 == null){
	System.out.println(this.toString+" : up_emp_no1 is null" );
}else{
	System.out.println(this.toString+" : up_emp_no1 is "+up_emp_no1 );
}
String up_emp_no2 = req.getParameter("up_emp_no2");
if( up_emp_no2 == null){
	System.out.println(this.toString+" : up_emp_no2 is null" );
}else{
	System.out.println(this.toString+" : up_emp_no2 is "+up_emp_no2 );
}
String in_cmpy_dt = req.getParameter("in_cmpy_dt");
if( in_cmpy_dt == null){
	System.out.println(this.toString+" : in_cmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_cmpy_dt is "+in_cmpy_dt );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evlu_yy = Util.checkString(req.getParameter("evlu_yy"));
String tms_clsf = Util.checkString(req.getParameter("tms_clsf"));
String evlu_grp_cd = Util.checkString(req.getParameter("evlu_grp_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String obj_excl_clsf = Util.checkString(req.getParameter("obj_excl_clsf"));
String up_emp_no1 = Util.checkString(req.getParameter("up_emp_no1"));
String up_emp_no2 = Util.checkString(req.getParameter("up_emp_no2"));
String in_cmpy_dt = Util.checkString(req.getParameter("in_cmpy_dt"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evlu_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_yy")));
String tms_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tms_clsf")));
String evlu_grp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evlu_grp_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String obj_excl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_excl_clsf")));
String up_emp_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("up_emp_no1")));
String up_emp_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("up_emp_no2")));
String in_cmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpy_dt")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvlu_yy(evlu_yy);
dm.setTms_clsf(tms_clsf);
dm.setEvlu_grp_cd(evlu_grp_cd);
dm.setEmp_no(emp_no);
dm.setDept_cd(dept_cd);
dm.setObj_excl_clsf(obj_excl_clsf);
dm.setUp_emp_no1(up_emp_no1);
dm.setUp_emp_no2(up_emp_no2);
dm.setIn_cmpy_dt(in_cmpy_dt);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 15:32:51 KST 2009 */