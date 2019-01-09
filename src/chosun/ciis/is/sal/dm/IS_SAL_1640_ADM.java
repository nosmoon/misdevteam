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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1640_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_dt;
	public String dlco_clsf_cd_seq;
	public String dlco_clsf_cd_seq_nm;
	public String comp_amt;
	public String prom_amt;
	public String gds_vol_amt;
	public String etc_amt;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_SAL_1640_ADM(){}
	public IS_SAL_1640_ADM(String cmpy_cd, String adjm_dt, String dlco_clsf_cd_seq, String dlco_clsf_cd_seq_nm, String comp_amt, String prom_amt, String gds_vol_amt, String etc_amt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.adjm_dt = adjm_dt;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.dlco_clsf_cd_seq_nm = dlco_clsf_cd_seq_nm;
		this.comp_amt = comp_amt;
		this.prom_amt = prom_amt;
		this.gds_vol_amt = gds_vol_amt;
		this.etc_amt = etc_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_dt(String adjm_dt){
		this.adjm_dt = adjm_dt;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_clsf_cd_seq_nm(String dlco_clsf_cd_seq_nm){
		this.dlco_clsf_cd_seq_nm = dlco_clsf_cd_seq_nm;
	}

	public void setComp_amt(String comp_amt){
		this.comp_amt = comp_amt;
	}

	public void setProm_amt(String prom_amt){
		this.prom_amt = prom_amt;
	}

	public void setGds_vol_amt(String gds_vol_amt){
		this.gds_vol_amt = gds_vol_amt;
	}

	public void setEtc_amt(String etc_amt){
		this.etc_amt = etc_amt;
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

	public String getAdjm_dt(){
		return this.adjm_dt;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_clsf_cd_seq_nm(){
		return this.dlco_clsf_cd_seq_nm;
	}

	public String getComp_amt(){
		return this.comp_amt;
	}

	public String getProm_amt(){
		return this.prom_amt;
	}

	public String getGds_vol_amt(){
		return this.gds_vol_amt;
	}

	public String getEtc_amt(){
		return this.etc_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1640_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1640_ADM dm = (IS_SAL_1640_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_dt);
		cstmt.setString(5, dm.dlco_clsf_cd_seq);
		cstmt.setString(6, dm.dlco_clsf_cd_seq_nm);
		cstmt.setString(7, dm.comp_amt);
		cstmt.setString(8, dm.prom_amt);
		cstmt.setString(9, dm.gds_vol_amt);
		cstmt.setString(10, dm.etc_amt);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1640_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_dt = [" + getAdjm_dt() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("dlco_clsf_cd_seq_nm = [" + getDlco_clsf_cd_seq_nm() + "]");
		System.out.println("comp_amt = [" + getComp_amt() + "]");
		System.out.println("prom_amt = [" + getProm_amt() + "]");
		System.out.println("gds_vol_amt = [" + getGds_vol_amt() + "]");
		System.out.println("etc_amt = [" + getEtc_amt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String adjm_dt = req.getParameter("adjm_dt");
if( adjm_dt == null){
	System.out.println(this.toString+" : adjm_dt is null" );
}else{
	System.out.println(this.toString+" : adjm_dt is "+adjm_dt );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String dlco_clsf_cd_seq_nm = req.getParameter("dlco_clsf_cd_seq_nm");
if( dlco_clsf_cd_seq_nm == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq_nm is "+dlco_clsf_cd_seq_nm );
}
String comp_amt = req.getParameter("comp_amt");
if( comp_amt == null){
	System.out.println(this.toString+" : comp_amt is null" );
}else{
	System.out.println(this.toString+" : comp_amt is "+comp_amt );
}
String prom_amt = req.getParameter("prom_amt");
if( prom_amt == null){
	System.out.println(this.toString+" : prom_amt is null" );
}else{
	System.out.println(this.toString+" : prom_amt is "+prom_amt );
}
String gds_vol_amt = req.getParameter("gds_vol_amt");
if( gds_vol_amt == null){
	System.out.println(this.toString+" : gds_vol_amt is null" );
}else{
	System.out.println(this.toString+" : gds_vol_amt is "+gds_vol_amt );
}
String etc_amt = req.getParameter("etc_amt");
if( etc_amt == null){
	System.out.println(this.toString+" : etc_amt is null" );
}else{
	System.out.println(this.toString+" : etc_amt is "+etc_amt );
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
String adjm_dt = Util.checkString(req.getParameter("adjm_dt"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String dlco_clsf_cd_seq_nm = Util.checkString(req.getParameter("dlco_clsf_cd_seq_nm"));
String comp_amt = Util.checkString(req.getParameter("comp_amt"));
String prom_amt = Util.checkString(req.getParameter("prom_amt"));
String gds_vol_amt = Util.checkString(req.getParameter("gds_vol_amt"));
String etc_amt = Util.checkString(req.getParameter("etc_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_dt")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String dlco_clsf_cd_seq_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq_nm")));
String comp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_amt")));
String prom_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prom_amt")));
String gds_vol_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gds_vol_amt")));
String etc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_dt(adjm_dt);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setDlco_clsf_cd_seq_nm(dlco_clsf_cd_seq_nm);
dm.setComp_amt(comp_amt);
dm.setProm_amt(prom_amt);
dm.setGds_vol_amt(gds_vol_amt);
dm.setEtc_amt(etc_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 14:11:17 KST 2012 */