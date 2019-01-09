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


package chosun.ciis.hd.duty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.ds.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String duty_dt;
	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_tm;
	public String gubun;
	public String addm_rest_minute;
	public String duty_clsf;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_DUTY_1201_ADM(){}
	public HD_DUTY_1201_ADM(String mode, String cmpy_cd, String emp_no, String duty_dt, String prsnt_tm, String finish_dd_clsf, String finish_tm, String gubun, String addm_rest_minute, String duty_clsf, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.duty_dt = duty_dt;
		this.prsnt_tm = prsnt_tm;
		this.finish_dd_clsf = finish_dd_clsf;
		this.finish_tm = finish_tm;
		this.gubun = gubun;
		this.addm_rest_minute = addm_rest_minute;
		this.duty_clsf = duty_clsf;
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

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setAddm_rest_minute(String addm_rest_minute){
		this.addm_rest_minute = addm_rest_minute;
	}

	public void setDuty_clsf(String duty_clsf){
		this.duty_clsf = duty_clsf;
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

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getAddm_rest_minute(){
		return this.addm_rest_minute;
	}

	public String getDuty_clsf(){
		return this.duty_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DUTY_1201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DUTY_1201_ADM dm = (HD_DUTY_1201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.duty_dt);
		cstmt.setString(7, dm.prsnt_tm);
		cstmt.setString(8, dm.finish_dd_clsf);
		cstmt.setString(9, dm.finish_tm);
		cstmt.setString(10, dm.gubun);
		cstmt.setString(11, dm.addm_rest_minute);
		cstmt.setString(12, dm.duty_clsf);
		cstmt.setString(13, dm.incmg_pers_ipadd);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.duty.ds.HD_DUTY_1201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("duty_dt = [" + getDuty_dt() + "]");
		System.out.println("prsnt_tm = [" + getPrsnt_tm() + "]");
		System.out.println("finish_dd_clsf = [" + getFinish_dd_clsf() + "]");
		System.out.println("finish_tm = [" + getFinish_tm() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("addm_rest_minute = [" + getAddm_rest_minute() + "]");
		System.out.println("duty_clsf = [" + getDuty_clsf() + "]");
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
String duty_dt = req.getParameter("duty_dt");
if( duty_dt == null){
	System.out.println(this.toString+" : duty_dt is null" );
}else{
	System.out.println(this.toString+" : duty_dt is "+duty_dt );
}
String prsnt_tm = req.getParameter("prsnt_tm");
if( prsnt_tm == null){
	System.out.println(this.toString+" : prsnt_tm is null" );
}else{
	System.out.println(this.toString+" : prsnt_tm is "+prsnt_tm );
}
String finish_dd_clsf = req.getParameter("finish_dd_clsf");
if( finish_dd_clsf == null){
	System.out.println(this.toString+" : finish_dd_clsf is null" );
}else{
	System.out.println(this.toString+" : finish_dd_clsf is "+finish_dd_clsf );
}
String finish_tm = req.getParameter("finish_tm");
if( finish_tm == null){
	System.out.println(this.toString+" : finish_tm is null" );
}else{
	System.out.println(this.toString+" : finish_tm is "+finish_tm );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String addm_rest_minute = req.getParameter("addm_rest_minute");
if( addm_rest_minute == null){
	System.out.println(this.toString+" : addm_rest_minute is null" );
}else{
	System.out.println(this.toString+" : addm_rest_minute is "+addm_rest_minute );
}
String duty_clsf = req.getParameter("duty_clsf");
if( duty_clsf == null){
	System.out.println(this.toString+" : duty_clsf is null" );
}else{
	System.out.println(this.toString+" : duty_clsf is "+duty_clsf );
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
String duty_dt = Util.checkString(req.getParameter("duty_dt"));
String prsnt_tm = Util.checkString(req.getParameter("prsnt_tm"));
String finish_dd_clsf = Util.checkString(req.getParameter("finish_dd_clsf"));
String finish_tm = Util.checkString(req.getParameter("finish_tm"));
String gubun = Util.checkString(req.getParameter("gubun"));
String addm_rest_minute = Util.checkString(req.getParameter("addm_rest_minute"));
String duty_clsf = Util.checkString(req.getParameter("duty_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String duty_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_dt")));
String prsnt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("prsnt_tm")));
String finish_dd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_dd_clsf")));
String finish_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("finish_tm")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String addm_rest_minute = Util.Uni2Ksc(Util.checkString(req.getParameter("addm_rest_minute")));
String duty_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setDuty_dt(duty_dt);
dm.setPrsnt_tm(prsnt_tm);
dm.setFinish_dd_clsf(finish_dd_clsf);
dm.setFinish_tm(finish_tm);
dm.setGubun(gubun);
dm.setAddm_rest_minute(addm_rest_minute);
dm.setDuty_clsf(duty_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 15:15:56 KST 2018 */