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


package chosun.ciis.hd.orga.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.orga.ds.*;
import chosun.ciis.hd.orga.rec.*;

/**
 * 
 */


public class HD_ORGA_1006_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String dept_cd;
	public String dept_nm;
	public String use_bgn_dt;
	public String use_end_dt;
	public String engl_nm;
	public String abrv_nm;
	public String natn_cd;
	public String duty_area;
	public String now_use_yn;
	public String cost_dept_clsf;
	public String make_dept_clsf;
	public String prt_plac_yn;
	public String medi_cd;
	public String cmpy_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_ORGA_1006_ADM(){}
	public HD_ORGA_1006_ADM(String mode, String dept_cd, String dept_nm, String use_bgn_dt, String use_end_dt, String engl_nm, String abrv_nm, String natn_cd, String duty_area, String now_use_yn, String cost_dept_clsf, String make_dept_clsf, String prt_plac_yn, String medi_cd, String cmpy_cd, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.dept_cd = dept_cd;
		this.dept_nm = dept_nm;
		this.use_bgn_dt = use_bgn_dt;
		this.use_end_dt = use_end_dt;
		this.engl_nm = engl_nm;
		this.abrv_nm = abrv_nm;
		this.natn_cd = natn_cd;
		this.duty_area = duty_area;
		this.now_use_yn = now_use_yn;
		this.cost_dept_clsf = cost_dept_clsf;
		this.make_dept_clsf = make_dept_clsf;
		this.prt_plac_yn = prt_plac_yn;
		this.medi_cd = medi_cd;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setUse_bgn_dt(String use_bgn_dt){
		this.use_bgn_dt = use_bgn_dt;
	}

	public void setUse_end_dt(String use_end_dt){
		this.use_end_dt = use_end_dt;
	}

	public void setEngl_nm(String engl_nm){
		this.engl_nm = engl_nm;
	}

	public void setAbrv_nm(String abrv_nm){
		this.abrv_nm = abrv_nm;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setDuty_area(String duty_area){
		this.duty_area = duty_area;
	}

	public void setNow_use_yn(String now_use_yn){
		this.now_use_yn = now_use_yn;
	}

	public void setCost_dept_clsf(String cost_dept_clsf){
		this.cost_dept_clsf = cost_dept_clsf;
	}

	public void setMake_dept_clsf(String make_dept_clsf){
		this.make_dept_clsf = make_dept_clsf;
	}

	public void setPrt_plac_yn(String prt_plac_yn){
		this.prt_plac_yn = prt_plac_yn;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getUse_bgn_dt(){
		return this.use_bgn_dt;
	}

	public String getUse_end_dt(){
		return this.use_end_dt;
	}

	public String getEngl_nm(){
		return this.engl_nm;
	}

	public String getAbrv_nm(){
		return this.abrv_nm;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getDuty_area(){
		return this.duty_area;
	}

	public String getNow_use_yn(){
		return this.now_use_yn;
	}

	public String getCost_dept_clsf(){
		return this.cost_dept_clsf;
	}

	public String getMake_dept_clsf(){
		return this.make_dept_clsf;
	}

	public String getPrt_plac_yn(){
		return this.prt_plac_yn;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_ORGA_1006_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_ORGA_1006_ADM dm = (HD_ORGA_1006_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.dept_nm);
		cstmt.setString(6, dm.use_bgn_dt);
		cstmt.setString(7, dm.use_end_dt);
		cstmt.setString(8, dm.engl_nm);
		cstmt.setString(9, dm.abrv_nm);
		cstmt.setString(10, dm.natn_cd);
		cstmt.setString(11, dm.duty_area);
		cstmt.setString(12, dm.now_use_yn);
		cstmt.setString(13, dm.cost_dept_clsf);
		cstmt.setString(14, dm.make_dept_clsf);
		cstmt.setString(15, dm.prt_plac_yn);
		cstmt.setString(16, dm.medi_cd);
		cstmt.setString(17, dm.cmpy_cd);
		cstmt.setString(18, dm.incmg_pers_ipadd);
		cstmt.setString(19, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.orga.ds.HD_ORGA_1006_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("use_bgn_dt = [" + getUse_bgn_dt() + "]");
		System.out.println("use_end_dt = [" + getUse_end_dt() + "]");
		System.out.println("engl_nm = [" + getEngl_nm() + "]");
		System.out.println("abrv_nm = [" + getAbrv_nm() + "]");
		System.out.println("natn_cd = [" + getNatn_cd() + "]");
		System.out.println("duty_area = [" + getDuty_area() + "]");
		System.out.println("now_use_yn = [" + getNow_use_yn() + "]");
		System.out.println("cost_dept_clsf = [" + getCost_dept_clsf() + "]");
		System.out.println("make_dept_clsf = [" + getMake_dept_clsf() + "]");
		System.out.println("prt_plac_yn = [" + getPrt_plac_yn() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String use_bgn_dt = req.getParameter("use_bgn_dt");
if( use_bgn_dt == null){
	System.out.println(this.toString+" : use_bgn_dt is null" );
}else{
	System.out.println(this.toString+" : use_bgn_dt is "+use_bgn_dt );
}
String use_end_dt = req.getParameter("use_end_dt");
if( use_end_dt == null){
	System.out.println(this.toString+" : use_end_dt is null" );
}else{
	System.out.println(this.toString+" : use_end_dt is "+use_end_dt );
}
String engl_nm = req.getParameter("engl_nm");
if( engl_nm == null){
	System.out.println(this.toString+" : engl_nm is null" );
}else{
	System.out.println(this.toString+" : engl_nm is "+engl_nm );
}
String abrv_nm = req.getParameter("abrv_nm");
if( abrv_nm == null){
	System.out.println(this.toString+" : abrv_nm is null" );
}else{
	System.out.println(this.toString+" : abrv_nm is "+abrv_nm );
}
String natn_cd = req.getParameter("natn_cd");
if( natn_cd == null){
	System.out.println(this.toString+" : natn_cd is null" );
}else{
	System.out.println(this.toString+" : natn_cd is "+natn_cd );
}
String duty_area = req.getParameter("duty_area");
if( duty_area == null){
	System.out.println(this.toString+" : duty_area is null" );
}else{
	System.out.println(this.toString+" : duty_area is "+duty_area );
}
String now_use_yn = req.getParameter("now_use_yn");
if( now_use_yn == null){
	System.out.println(this.toString+" : now_use_yn is null" );
}else{
	System.out.println(this.toString+" : now_use_yn is "+now_use_yn );
}
String cost_dept_clsf = req.getParameter("cost_dept_clsf");
if( cost_dept_clsf == null){
	System.out.println(this.toString+" : cost_dept_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_dept_clsf is "+cost_dept_clsf );
}
String make_dept_clsf = req.getParameter("make_dept_clsf");
if( make_dept_clsf == null){
	System.out.println(this.toString+" : make_dept_clsf is null" );
}else{
	System.out.println(this.toString+" : make_dept_clsf is "+make_dept_clsf );
}
String prt_plac_yn = req.getParameter("prt_plac_yn");
if( prt_plac_yn == null){
	System.out.println(this.toString+" : prt_plac_yn is null" );
}else{
	System.out.println(this.toString+" : prt_plac_yn is "+prt_plac_yn );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String use_bgn_dt = Util.checkString(req.getParameter("use_bgn_dt"));
String use_end_dt = Util.checkString(req.getParameter("use_end_dt"));
String engl_nm = Util.checkString(req.getParameter("engl_nm"));
String abrv_nm = Util.checkString(req.getParameter("abrv_nm"));
String natn_cd = Util.checkString(req.getParameter("natn_cd"));
String duty_area = Util.checkString(req.getParameter("duty_area"));
String now_use_yn = Util.checkString(req.getParameter("now_use_yn"));
String cost_dept_clsf = Util.checkString(req.getParameter("cost_dept_clsf"));
String make_dept_clsf = Util.checkString(req.getParameter("make_dept_clsf"));
String prt_plac_yn = Util.checkString(req.getParameter("prt_plac_yn"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String use_bgn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_bgn_dt")));
String use_end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_end_dt")));
String engl_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("engl_nm")));
String abrv_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("abrv_nm")));
String natn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("natn_cd")));
String duty_area = Util.Uni2Ksc(Util.checkString(req.getParameter("duty_area")));
String now_use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("now_use_yn")));
String cost_dept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dept_clsf")));
String make_dept_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dept_clsf")));
String prt_plac_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_yn")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setUse_bgn_dt(use_bgn_dt);
dm.setUse_end_dt(use_end_dt);
dm.setEngl_nm(engl_nm);
dm.setAbrv_nm(abrv_nm);
dm.setNatn_cd(natn_cd);
dm.setDuty_area(duty_area);
dm.setNow_use_yn(now_use_yn);
dm.setCost_dept_clsf(cost_dept_clsf);
dm.setMake_dept_clsf(make_dept_clsf);
dm.setPrt_plac_yn(prt_plac_yn);
dm.setMedi_cd(medi_cd);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 20 16:52:56 KST 2014 */