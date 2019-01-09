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


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1120_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String accflag;
	public String yyyy;
	public String mode;
	public String basi_yymm;
	public String rcpm_yymm;
	public String thmm_1tms_rcpm_dt;
	public String thmm_1tms_rcpm_wkdy;
	public String thmm_2tms_rcpm_dt;
	public String thmm_2tms_rcpm_wkdy;
	public String thmm_1tms_encur_amt;
	public String thmm_2tms_encur_amt;
	public String thmm_un_pymt_encur_amt;
	public String thmm_db_encur_amt;
	public String prvmm_1tms_encur_amt;
	public String prvmm_2tms_encur_amt;
	public String prvmm_un_pymt_encur_amt;
	public String boy_fpymt_encur_amt;
	public String boy_un_pymt_encur_amt;
	public String stetsell_fpymt_encur_amt;
	public String stetsell_un_pymt_encur_amt;
	public String edus_fpymt_encur_amt;
	public String edus_un_pymt_encur_amt;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_SAL_1120_ADM(){}
	public SE_SAL_1120_ADM(String cmpy_cd, String accflag, String yyyy, String mode, String basi_yymm, String rcpm_yymm, String thmm_1tms_rcpm_dt, String thmm_1tms_rcpm_wkdy, String thmm_2tms_rcpm_dt, String thmm_2tms_rcpm_wkdy, String thmm_1tms_encur_amt, String thmm_2tms_encur_amt, String thmm_un_pymt_encur_amt, String thmm_db_encur_amt, String prvmm_1tms_encur_amt, String prvmm_2tms_encur_amt, String prvmm_un_pymt_encur_amt, String boy_fpymt_encur_amt, String boy_un_pymt_encur_amt, String stetsell_fpymt_encur_amt, String stetsell_un_pymt_encur_amt, String edus_fpymt_encur_amt, String edus_un_pymt_encur_amt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.accflag = accflag;
		this.yyyy = yyyy;
		this.mode = mode;
		this.basi_yymm = basi_yymm;
		this.rcpm_yymm = rcpm_yymm;
		this.thmm_1tms_rcpm_dt = thmm_1tms_rcpm_dt;
		this.thmm_1tms_rcpm_wkdy = thmm_1tms_rcpm_wkdy;
		this.thmm_2tms_rcpm_dt = thmm_2tms_rcpm_dt;
		this.thmm_2tms_rcpm_wkdy = thmm_2tms_rcpm_wkdy;
		this.thmm_1tms_encur_amt = thmm_1tms_encur_amt;
		this.thmm_2tms_encur_amt = thmm_2tms_encur_amt;
		this.thmm_un_pymt_encur_amt = thmm_un_pymt_encur_amt;
		this.thmm_db_encur_amt = thmm_db_encur_amt;
		this.prvmm_1tms_encur_amt = prvmm_1tms_encur_amt;
		this.prvmm_2tms_encur_amt = prvmm_2tms_encur_amt;
		this.prvmm_un_pymt_encur_amt = prvmm_un_pymt_encur_amt;
		this.boy_fpymt_encur_amt = boy_fpymt_encur_amt;
		this.boy_un_pymt_encur_amt = boy_un_pymt_encur_amt;
		this.stetsell_fpymt_encur_amt = stetsell_fpymt_encur_amt;
		this.stetsell_un_pymt_encur_amt = stetsell_un_pymt_encur_amt;
		this.edus_fpymt_encur_amt = edus_fpymt_encur_amt;
		this.edus_un_pymt_encur_amt = edus_un_pymt_encur_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setRcpm_yymm(String rcpm_yymm){
		this.rcpm_yymm = rcpm_yymm;
	}

	public void setThmm_1tms_rcpm_dt(String thmm_1tms_rcpm_dt){
		this.thmm_1tms_rcpm_dt = thmm_1tms_rcpm_dt;
	}

	public void setThmm_1tms_rcpm_wkdy(String thmm_1tms_rcpm_wkdy){
		this.thmm_1tms_rcpm_wkdy = thmm_1tms_rcpm_wkdy;
	}

	public void setThmm_2tms_rcpm_dt(String thmm_2tms_rcpm_dt){
		this.thmm_2tms_rcpm_dt = thmm_2tms_rcpm_dt;
	}

	public void setThmm_2tms_rcpm_wkdy(String thmm_2tms_rcpm_wkdy){
		this.thmm_2tms_rcpm_wkdy = thmm_2tms_rcpm_wkdy;
	}

	public void setThmm_1tms_encur_amt(String thmm_1tms_encur_amt){
		this.thmm_1tms_encur_amt = thmm_1tms_encur_amt;
	}

	public void setThmm_2tms_encur_amt(String thmm_2tms_encur_amt){
		this.thmm_2tms_encur_amt = thmm_2tms_encur_amt;
	}

	public void setThmm_un_pymt_encur_amt(String thmm_un_pymt_encur_amt){
		this.thmm_un_pymt_encur_amt = thmm_un_pymt_encur_amt;
	}

	public void setThmm_db_encur_amt(String thmm_db_encur_amt){
		this.thmm_db_encur_amt = thmm_db_encur_amt;
	}

	public void setPrvmm_1tms_encur_amt(String prvmm_1tms_encur_amt){
		this.prvmm_1tms_encur_amt = prvmm_1tms_encur_amt;
	}

	public void setPrvmm_2tms_encur_amt(String prvmm_2tms_encur_amt){
		this.prvmm_2tms_encur_amt = prvmm_2tms_encur_amt;
	}

	public void setPrvmm_un_pymt_encur_amt(String prvmm_un_pymt_encur_amt){
		this.prvmm_un_pymt_encur_amt = prvmm_un_pymt_encur_amt;
	}

	public void setBoy_fpymt_encur_amt(String boy_fpymt_encur_amt){
		this.boy_fpymt_encur_amt = boy_fpymt_encur_amt;
	}

	public void setBoy_un_pymt_encur_amt(String boy_un_pymt_encur_amt){
		this.boy_un_pymt_encur_amt = boy_un_pymt_encur_amt;
	}

	public void setStetsell_fpymt_encur_amt(String stetsell_fpymt_encur_amt){
		this.stetsell_fpymt_encur_amt = stetsell_fpymt_encur_amt;
	}

	public void setStetsell_un_pymt_encur_amt(String stetsell_un_pymt_encur_amt){
		this.stetsell_un_pymt_encur_amt = stetsell_un_pymt_encur_amt;
	}

	public void setEdus_fpymt_encur_amt(String edus_fpymt_encur_amt){
		this.edus_fpymt_encur_amt = edus_fpymt_encur_amt;
	}

	public void setEdus_un_pymt_encur_amt(String edus_un_pymt_encur_amt){
		this.edus_un_pymt_encur_amt = edus_un_pymt_encur_amt;
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

	public String getAccflag(){
		return this.accflag;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getMode(){
		return this.mode;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getRcpm_yymm(){
		return this.rcpm_yymm;
	}

	public String getThmm_1tms_rcpm_dt(){
		return this.thmm_1tms_rcpm_dt;
	}

	public String getThmm_1tms_rcpm_wkdy(){
		return this.thmm_1tms_rcpm_wkdy;
	}

	public String getThmm_2tms_rcpm_dt(){
		return this.thmm_2tms_rcpm_dt;
	}

	public String getThmm_2tms_rcpm_wkdy(){
		return this.thmm_2tms_rcpm_wkdy;
	}

	public String getThmm_1tms_encur_amt(){
		return this.thmm_1tms_encur_amt;
	}

	public String getThmm_2tms_encur_amt(){
		return this.thmm_2tms_encur_amt;
	}

	public String getThmm_un_pymt_encur_amt(){
		return this.thmm_un_pymt_encur_amt;
	}

	public String getThmm_db_encur_amt(){
		return this.thmm_db_encur_amt;
	}

	public String getPrvmm_1tms_encur_amt(){
		return this.prvmm_1tms_encur_amt;
	}

	public String getPrvmm_2tms_encur_amt(){
		return this.prvmm_2tms_encur_amt;
	}

	public String getPrvmm_un_pymt_encur_amt(){
		return this.prvmm_un_pymt_encur_amt;
	}

	public String getBoy_fpymt_encur_amt(){
		return this.boy_fpymt_encur_amt;
	}

	public String getBoy_un_pymt_encur_amt(){
		return this.boy_un_pymt_encur_amt;
	}

	public String getStetsell_fpymt_encur_amt(){
		return this.stetsell_fpymt_encur_amt;
	}

	public String getStetsell_un_pymt_encur_amt(){
		return this.stetsell_un_pymt_encur_amt;
	}

	public String getEdus_fpymt_encur_amt(){
		return this.edus_fpymt_encur_amt;
	}

	public String getEdus_un_pymt_encur_amt(){
		return this.edus_un_pymt_encur_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_1120_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1120_ADM dm = (SE_SAL_1120_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.yyyy);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.basi_yymm);
		cstmt.setString(8, dm.rcpm_yymm);
		cstmt.setString(9, dm.thmm_1tms_rcpm_dt);
		cstmt.setString(10, dm.thmm_1tms_rcpm_wkdy);
		cstmt.setString(11, dm.thmm_2tms_rcpm_dt);
		cstmt.setString(12, dm.thmm_2tms_rcpm_wkdy);
		cstmt.setString(13, dm.thmm_1tms_encur_amt);
		cstmt.setString(14, dm.thmm_2tms_encur_amt);
		cstmt.setString(15, dm.thmm_un_pymt_encur_amt);
		cstmt.setString(16, dm.thmm_db_encur_amt);
		cstmt.setString(17, dm.prvmm_1tms_encur_amt);
		cstmt.setString(18, dm.prvmm_2tms_encur_amt);
		cstmt.setString(19, dm.prvmm_un_pymt_encur_amt);
		cstmt.setString(20, dm.boy_fpymt_encur_amt);
		cstmt.setString(21, dm.boy_un_pymt_encur_amt);
		cstmt.setString(22, dm.stetsell_fpymt_encur_amt);
		cstmt.setString(23, dm.stetsell_un_pymt_encur_amt);
		cstmt.setString(24, dm.edus_fpymt_encur_amt);
		cstmt.setString(25, dm.edus_un_pymt_encur_amt);
		cstmt.setString(26, dm.incmg_pers);
		cstmt.setString(27, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1120_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("accflag = " + getAccflag());
        System.out.println("yyyy = " + getYyyy());
        System.out.println("mode = " + getMode());
        System.out.println("basi_yymm = " + getBasi_yymm());
        System.out.println("rcpm_yymm = " + getRcpm_yymm());
        System.out.println("thmm_1tms_rcpm_dt = " + getThmm_1tms_rcpm_dt());
        System.out.println("thmm_1tms_rcpm_wkdy = " + getThmm_1tms_rcpm_wkdy());
        System.out.println("thmm_2tms_rcpm_dt = " + getThmm_2tms_rcpm_dt());
        System.out.println("thmm_2tms_rcpm_wkdy = " + getThmm_2tms_rcpm_wkdy());
        System.out.println("thmm_1tms_encur_amt = " + getThmm_1tms_encur_amt());
        System.out.println("thmm_2tms_encur_amt = " + getThmm_2tms_encur_amt());
        System.out.println("thmm_un_pymt_encur_amt = " + getThmm_un_pymt_encur_amt());
        System.out.println("thmm_db_encur_amt = " + getThmm_db_encur_amt());
        System.out.println("prvmm_1tms_encur_amt = " + getPrvmm_1tms_encur_amt());
        System.out.println("prvmm_2tms_encur_amt = " + getPrvmm_2tms_encur_amt());
        System.out.println("prvmm_un_pymt_encur_amt = " + getPrvmm_un_pymt_encur_amt());
        System.out.println("boy_fpymt_encur_amt = " + getBoy_fpymt_encur_amt());
        System.out.println("boy_un_pymt_encur_amt = " + getBoy_un_pymt_encur_amt());
        System.out.println("stetsell_fpymt_encur_amt = " + getStetsell_fpymt_encur_amt());
        System.out.println("stetsell_un_pymt_encur_amt = " + getStetsell_un_pymt_encur_amt());
        System.out.println("edus_fpymt_encur_amt = " + getEdus_fpymt_encur_amt());
        System.out.println("edus_un_pymt_encur_amt = " + getEdus_un_pymt_encur_amt());
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String basi_yymm = req.getParameter("basi_yymm");
if( basi_yymm == null){
	System.out.println(this.toString+" : basi_yymm is null" );
}else{
	System.out.println(this.toString+" : basi_yymm is "+basi_yymm );
}
String rcpm_yymm = req.getParameter("rcpm_yymm");
if( rcpm_yymm == null){
	System.out.println(this.toString+" : rcpm_yymm is null" );
}else{
	System.out.println(this.toString+" : rcpm_yymm is "+rcpm_yymm );
}
String thmm_1tms_rcpm_dt = req.getParameter("thmm_1tms_rcpm_dt");
if( thmm_1tms_rcpm_dt == null){
	System.out.println(this.toString+" : thmm_1tms_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : thmm_1tms_rcpm_dt is "+thmm_1tms_rcpm_dt );
}
String thmm_1tms_rcpm_wkdy = req.getParameter("thmm_1tms_rcpm_wkdy");
if( thmm_1tms_rcpm_wkdy == null){
	System.out.println(this.toString+" : thmm_1tms_rcpm_wkdy is null" );
}else{
	System.out.println(this.toString+" : thmm_1tms_rcpm_wkdy is "+thmm_1tms_rcpm_wkdy );
}
String thmm_2tms_rcpm_dt = req.getParameter("thmm_2tms_rcpm_dt");
if( thmm_2tms_rcpm_dt == null){
	System.out.println(this.toString+" : thmm_2tms_rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : thmm_2tms_rcpm_dt is "+thmm_2tms_rcpm_dt );
}
String thmm_2tms_rcpm_wkdy = req.getParameter("thmm_2tms_rcpm_wkdy");
if( thmm_2tms_rcpm_wkdy == null){
	System.out.println(this.toString+" : thmm_2tms_rcpm_wkdy is null" );
}else{
	System.out.println(this.toString+" : thmm_2tms_rcpm_wkdy is "+thmm_2tms_rcpm_wkdy );
}
String thmm_1tms_encur_amt = req.getParameter("thmm_1tms_encur_amt");
if( thmm_1tms_encur_amt == null){
	System.out.println(this.toString+" : thmm_1tms_encur_amt is null" );
}else{
	System.out.println(this.toString+" : thmm_1tms_encur_amt is "+thmm_1tms_encur_amt );
}
String thmm_2tms_encur_amt = req.getParameter("thmm_2tms_encur_amt");
if( thmm_2tms_encur_amt == null){
	System.out.println(this.toString+" : thmm_2tms_encur_amt is null" );
}else{
	System.out.println(this.toString+" : thmm_2tms_encur_amt is "+thmm_2tms_encur_amt );
}
String thmm_un_pymt_encur_amt = req.getParameter("thmm_un_pymt_encur_amt");
if( thmm_un_pymt_encur_amt == null){
	System.out.println(this.toString+" : thmm_un_pymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : thmm_un_pymt_encur_amt is "+thmm_un_pymt_encur_amt );
}
String thmm_db_encur_amt = req.getParameter("thmm_db_encur_amt");
if( thmm_db_encur_amt == null){
	System.out.println(this.toString+" : thmm_db_encur_amt is null" );
}else{
	System.out.println(this.toString+" : thmm_db_encur_amt is "+thmm_db_encur_amt );
}
String prvmm_1tms_encur_amt = req.getParameter("prvmm_1tms_encur_amt");
if( prvmm_1tms_encur_amt == null){
	System.out.println(this.toString+" : prvmm_1tms_encur_amt is null" );
}else{
	System.out.println(this.toString+" : prvmm_1tms_encur_amt is "+prvmm_1tms_encur_amt );
}
String prvmm_2tms_encur_amt = req.getParameter("prvmm_2tms_encur_amt");
if( prvmm_2tms_encur_amt == null){
	System.out.println(this.toString+" : prvmm_2tms_encur_amt is null" );
}else{
	System.out.println(this.toString+" : prvmm_2tms_encur_amt is "+prvmm_2tms_encur_amt );
}
String prvmm_un_pymt_encur_amt = req.getParameter("prvmm_un_pymt_encur_amt");
if( prvmm_un_pymt_encur_amt == null){
	System.out.println(this.toString+" : prvmm_un_pymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : prvmm_un_pymt_encur_amt is "+prvmm_un_pymt_encur_amt );
}
String boy_fpymt_encur_amt = req.getParameter("boy_fpymt_encur_amt");
if( boy_fpymt_encur_amt == null){
	System.out.println(this.toString+" : boy_fpymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : boy_fpymt_encur_amt is "+boy_fpymt_encur_amt );
}
String boy_un_pymt_encur_amt = req.getParameter("boy_un_pymt_encur_amt");
if( boy_un_pymt_encur_amt == null){
	System.out.println(this.toString+" : boy_un_pymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : boy_un_pymt_encur_amt is "+boy_un_pymt_encur_amt );
}
String stetsell_fpymt_encur_amt = req.getParameter("stetsell_fpymt_encur_amt");
if( stetsell_fpymt_encur_amt == null){
	System.out.println(this.toString+" : stetsell_fpymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : stetsell_fpymt_encur_amt is "+stetsell_fpymt_encur_amt );
}
String stetsell_un_pymt_encur_amt = req.getParameter("stetsell_un_pymt_encur_amt");
if( stetsell_un_pymt_encur_amt == null){
	System.out.println(this.toString+" : stetsell_un_pymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : stetsell_un_pymt_encur_amt is "+stetsell_un_pymt_encur_amt );
}
String edus_fpymt_encur_amt = req.getParameter("edus_fpymt_encur_amt");
if( edus_fpymt_encur_amt == null){
	System.out.println(this.toString+" : edus_fpymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : edus_fpymt_encur_amt is "+edus_fpymt_encur_amt );
}
String edus_un_pymt_encur_amt = req.getParameter("edus_un_pymt_encur_amt");
if( edus_un_pymt_encur_amt == null){
	System.out.println(this.toString+" : edus_un_pymt_encur_amt is null" );
}else{
	System.out.println(this.toString+" : edus_un_pymt_encur_amt is "+edus_un_pymt_encur_amt );
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
String accflag = Util.checkString(req.getParameter("accflag"));
String yyyy = Util.checkString(req.getParameter("yyyy"));
String mode = Util.checkString(req.getParameter("mode"));
String basi_yymm = Util.checkString(req.getParameter("basi_yymm"));
String rcpm_yymm = Util.checkString(req.getParameter("rcpm_yymm"));
String thmm_1tms_rcpm_dt = Util.checkString(req.getParameter("thmm_1tms_rcpm_dt"));
String thmm_1tms_rcpm_wkdy = Util.checkString(req.getParameter("thmm_1tms_rcpm_wkdy"));
String thmm_2tms_rcpm_dt = Util.checkString(req.getParameter("thmm_2tms_rcpm_dt"));
String thmm_2tms_rcpm_wkdy = Util.checkString(req.getParameter("thmm_2tms_rcpm_wkdy"));
String thmm_1tms_encur_amt = Util.checkString(req.getParameter("thmm_1tms_encur_amt"));
String thmm_2tms_encur_amt = Util.checkString(req.getParameter("thmm_2tms_encur_amt"));
String thmm_un_pymt_encur_amt = Util.checkString(req.getParameter("thmm_un_pymt_encur_amt"));
String thmm_db_encur_amt = Util.checkString(req.getParameter("thmm_db_encur_amt"));
String prvmm_1tms_encur_amt = Util.checkString(req.getParameter("prvmm_1tms_encur_amt"));
String prvmm_2tms_encur_amt = Util.checkString(req.getParameter("prvmm_2tms_encur_amt"));
String prvmm_un_pymt_encur_amt = Util.checkString(req.getParameter("prvmm_un_pymt_encur_amt"));
String boy_fpymt_encur_amt = Util.checkString(req.getParameter("boy_fpymt_encur_amt"));
String boy_un_pymt_encur_amt = Util.checkString(req.getParameter("boy_un_pymt_encur_amt"));
String stetsell_fpymt_encur_amt = Util.checkString(req.getParameter("stetsell_fpymt_encur_amt"));
String stetsell_un_pymt_encur_amt = Util.checkString(req.getParameter("stetsell_un_pymt_encur_amt"));
String edus_fpymt_encur_amt = Util.checkString(req.getParameter("edus_fpymt_encur_amt"));
String edus_un_pymt_encur_amt = Util.checkString(req.getParameter("edus_un_pymt_encur_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String basi_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yymm")));
String rcpm_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_yymm")));
String thmm_1tms_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_1tms_rcpm_dt")));
String thmm_1tms_rcpm_wkdy = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_1tms_rcpm_wkdy")));
String thmm_2tms_rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_2tms_rcpm_dt")));
String thmm_2tms_rcpm_wkdy = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_2tms_rcpm_wkdy")));
String thmm_1tms_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_1tms_encur_amt")));
String thmm_2tms_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_2tms_encur_amt")));
String thmm_un_pymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_un_pymt_encur_amt")));
String thmm_db_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_db_encur_amt")));
String prvmm_1tms_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_1tms_encur_amt")));
String prvmm_2tms_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_2tms_encur_amt")));
String prvmm_un_pymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_un_pymt_encur_amt")));
String boy_fpymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("boy_fpymt_encur_amt")));
String boy_un_pymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("boy_un_pymt_encur_amt")));
String stetsell_fpymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("stetsell_fpymt_encur_amt")));
String stetsell_un_pymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("stetsell_un_pymt_encur_amt")));
String edus_fpymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("edus_fpymt_encur_amt")));
String edus_un_pymt_encur_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("edus_un_pymt_encur_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAccflag(accflag);
dm.setYyyy(yyyy);
dm.setMode(mode);
dm.setBasi_yymm(basi_yymm);
dm.setRcpm_yymm(rcpm_yymm);
dm.setThmm_1tms_rcpm_dt(thmm_1tms_rcpm_dt);
dm.setThmm_1tms_rcpm_wkdy(thmm_1tms_rcpm_wkdy);
dm.setThmm_2tms_rcpm_dt(thmm_2tms_rcpm_dt);
dm.setThmm_2tms_rcpm_wkdy(thmm_2tms_rcpm_wkdy);
dm.setThmm_1tms_encur_amt(thmm_1tms_encur_amt);
dm.setThmm_2tms_encur_amt(thmm_2tms_encur_amt);
dm.setThmm_un_pymt_encur_amt(thmm_un_pymt_encur_amt);
dm.setThmm_db_encur_amt(thmm_db_encur_amt);
dm.setPrvmm_1tms_encur_amt(prvmm_1tms_encur_amt);
dm.setPrvmm_2tms_encur_amt(prvmm_2tms_encur_amt);
dm.setPrvmm_un_pymt_encur_amt(prvmm_un_pymt_encur_amt);
dm.setBoy_fpymt_encur_amt(boy_fpymt_encur_amt);
dm.setBoy_un_pymt_encur_amt(boy_un_pymt_encur_amt);
dm.setStetsell_fpymt_encur_amt(stetsell_fpymt_encur_amt);
dm.setStetsell_un_pymt_encur_amt(stetsell_un_pymt_encur_amt);
dm.setEdus_fpymt_encur_amt(edus_fpymt_encur_amt);
dm.setEdus_un_pymt_encur_amt(edus_un_pymt_encur_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 16 20:38:39 KST 2009 */