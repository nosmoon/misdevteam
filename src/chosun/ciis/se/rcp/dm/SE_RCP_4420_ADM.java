/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.rcp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.rcp.ds.*;
import chosun.ciis.se.rcp.rec.*;

/**
 * 
 */


public class SE_RCP_4420_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String bgn_rcpm_dt;
	public String end_rcpm_dt;
	public String mode_ar;
	public String dept_cd_ar;
	public String part_cd_ar;
	public String area_cd_ar;
	public String meda_amt_ar;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_RCP_4420_ADM(){}
	public SE_RCP_4420_ADM(String cmpy_cd, String yymm, String bgn_rcpm_dt, String end_rcpm_dt, String mode_ar, String dept_cd_ar, String part_cd_ar, String area_cd_ar, String meda_amt_ar, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.bgn_rcpm_dt = bgn_rcpm_dt;
		this.end_rcpm_dt = end_rcpm_dt;
		this.mode_ar = mode_ar;
		this.dept_cd_ar = dept_cd_ar;
		this.part_cd_ar = part_cd_ar;
		this.area_cd_ar = area_cd_ar;
		this.meda_amt_ar = meda_amt_ar;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBgn_rcpm_dt(String bgn_rcpm_dt){
		this.bgn_rcpm_dt = bgn_rcpm_dt;
	}

	public void setEnd_rcpm_dt(String end_rcpm_dt){
		this.end_rcpm_dt = end_rcpm_dt;
	}

	public void setMode_ar(String mode_ar){
		this.mode_ar = mode_ar;
	}

	public void setDept_cd_ar(String dept_cd_ar){
		this.dept_cd_ar = dept_cd_ar;
	}

	public void setPart_cd_ar(String part_cd_ar){
		this.part_cd_ar = part_cd_ar;
	}

	public void setArea_cd_ar(String area_cd_ar){
		this.area_cd_ar = area_cd_ar;
	}

	public void setMeda_amt_ar(String meda_amt_ar){
		this.meda_amt_ar = meda_amt_ar;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBgn_rcpm_dt(){
		return this.bgn_rcpm_dt;
	}

	public String getEnd_rcpm_dt(){
		return this.end_rcpm_dt;
	}

	public String getMode_ar(){
		return this.mode_ar;
	}

	public String getDept_cd_ar(){
		return this.dept_cd_ar;
	}

	public String getPart_cd_ar(){
		return this.part_cd_ar;
	}

	public String getArea_cd_ar(){
		return this.area_cd_ar;
	}

	public String getMeda_amt_ar(){
		return this.meda_amt_ar;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_RCP_4420_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_RCP_4420_ADM dm = (SE_RCP_4420_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.bgn_rcpm_dt);
		cstmt.setString(6, dm.end_rcpm_dt);
		cstmt.setString(7, dm.mode_ar);
		cstmt.setString(8, dm.dept_cd_ar);
		cstmt.setString(9, dm.part_cd_ar);
		cstmt.setString(10, dm.area_cd_ar);
		cstmt.setString(11, dm.meda_amt_ar);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.rcp.ds.SE_RCP_4420_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yymm = " + getYymm());
        System.out.println("bgn_rcpm_dt = " + getBgn_rcpm_dt());
        System.out.println("end_rcpm_dt = " + getEnd_rcpm_dt());
        System.out.println("mode_ar = " + getMode_ar());
        System.out.println("dept_cd_ar = " + getDept_cd_ar());
        System.out.println("part_cd_ar = " + getPart_cd_ar());
        System.out.println("area_cd_ar = " + getArea_cd_ar());
        System.out.println("meda_amt_ar = " + getMeda_amt_ar());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String bgn_rcpm_dt = req.getParameter("bgn_rcpm_dt");
if( bgn_rcpm_dt == null){
	System.out.println(this.toString+" : bgn_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_rcpm_dt is "+bgn_rcpm_dt );
}
String end_rcpm_dt = req.getParameter("end_rcpm_dt");
if( end_rcpm_dt == null){
	System.out.println(this.toString+" : end_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : end_rcpm_dt is "+end_rcpm_dt );
}
String mode_ar = req.getParameter("mode_ar");
if( mode_ar == null){
	System.out.println(this.toString+" : mode_ar is null" );
}else{
	System.out.println(this.toString+" : mode_ar is "+mode_ar );
}
String dept_cd_ar = req.getParameter("dept_cd_ar");
if( dept_cd_ar == null){
	System.out.println(this.toString+" : dept_cd_ar is null" );
}else{
	System.out.println(this.toString+" : dept_cd_ar is "+dept_cd_ar );
}
String part_cd_ar = req.getParameter("part_cd_ar");
if( part_cd_ar == null){
	System.out.println(this.toString+" : part_cd_ar is null" );
}else{
	System.out.println(this.toString+" : part_cd_ar is "+part_cd_ar );
}
String area_cd_ar = req.getParameter("area_cd_ar");
if( area_cd_ar == null){
	System.out.println(this.toString+" : area_cd_ar is null" );
}else{
	System.out.println(this.toString+" : area_cd_ar is "+area_cd_ar );
}
String meda_amt_ar = req.getParameter("meda_amt_ar");
if( meda_amt_ar == null){
	System.out.println(this.toString+" : meda_amt_ar is null" );
}else{
	System.out.println(this.toString+" : meda_amt_ar is "+meda_amt_ar );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String bgn_rcpm_dt = Util.checkString(req.getParameter("bgn_rcpm_dt"));
String end_rcpm_dt = Util.checkString(req.getParameter("end_rcpm_dt"));
String mode_ar = Util.checkString(req.getParameter("mode_ar"));
String dept_cd_ar = Util.checkString(req.getParameter("dept_cd_ar"));
String part_cd_ar = Util.checkString(req.getParameter("part_cd_ar"));
String area_cd_ar = Util.checkString(req.getParameter("area_cd_ar"));
String meda_amt_ar = Util.checkString(req.getParameter("meda_amt_ar"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String bgn_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_rcpm_dt")));
String end_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_rcpm_dt")));
String mode_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_ar")));
String dept_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_ar")));
String part_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("part_cd_ar")));
String area_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd_ar")));
String meda_amt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_amt_ar")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setBgn_rcpm_dt(bgn_rcpm_dt);
dm.setEnd_rcpm_dt(end_rcpm_dt);
dm.setMode_ar(mode_ar);
dm.setDept_cd_ar(dept_cd_ar);
dm.setPart_cd_ar(part_cd_ar);
dm.setArea_cd_ar(area_cd_ar);
dm.setMeda_amt_ar(meda_amt_ar);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 21:05:04 KST 2009 */