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


public class IS_SAL_1630_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String purc_adjm_reg_dt;
	public String purc_adjm_reg_seq;
	public String dlco_clsf_cd_seq;
	public String txn_clsf;
	public String suply_amt;
	public String vat_amt;
	public String dduc_amt;
	public String comp_amt;
	public String prom_amt;
	public String gds_vol_amt;
	public String etc_amt;
	public String stot_amt;
	public String incmg_pers;
	public String incmg_pers_ip;

	public IS_SAL_1630_ADM(){}
	public IS_SAL_1630_ADM(String cmpy_cd, String mode, String purc_adjm_reg_dt, String purc_adjm_reg_seq, String dlco_clsf_cd_seq, String txn_clsf, String suply_amt, String vat_amt, String dduc_amt, String comp_amt, String prom_amt, String gds_vol_amt, String etc_amt, String stot_amt, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.purc_adjm_reg_dt = purc_adjm_reg_dt;
		this.purc_adjm_reg_seq = purc_adjm_reg_seq;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.txn_clsf = txn_clsf;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.dduc_amt = dduc_amt;
		this.comp_amt = comp_amt;
		this.prom_amt = prom_amt;
		this.gds_vol_amt = gds_vol_amt;
		this.etc_amt = etc_amt;
		this.stot_amt = stot_amt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setPurc_adjm_reg_dt(String purc_adjm_reg_dt){
		this.purc_adjm_reg_dt = purc_adjm_reg_dt;
	}

	public void setPurc_adjm_reg_seq(String purc_adjm_reg_seq){
		this.purc_adjm_reg_seq = purc_adjm_reg_seq;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setTxn_clsf(String txn_clsf){
		this.txn_clsf = txn_clsf;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setDduc_amt(String dduc_amt){
		this.dduc_amt = dduc_amt;
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

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
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

	public String getMode(){
		return this.mode;
	}

	public String getPurc_adjm_reg_dt(){
		return this.purc_adjm_reg_dt;
	}

	public String getPurc_adjm_reg_seq(){
		return this.purc_adjm_reg_seq;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getTxn_clsf(){
		return this.txn_clsf;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getDduc_amt(){
		return this.dduc_amt;
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

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1630_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1630_ADM dm = (IS_SAL_1630_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.purc_adjm_reg_dt);
		cstmt.setString(6, dm.purc_adjm_reg_seq);
		cstmt.setString(7, dm.dlco_clsf_cd_seq);
		cstmt.setString(8, dm.txn_clsf);
		cstmt.setString(9, dm.suply_amt);
		cstmt.setString(10, dm.vat_amt);
		cstmt.setString(11, dm.dduc_amt);
		cstmt.setString(12, dm.comp_amt);
		cstmt.setString(13, dm.prom_amt);
		cstmt.setString(14, dm.gds_vol_amt);
		cstmt.setString(15, dm.etc_amt);
		cstmt.setString(16, dm.stot_amt);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1630_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("purc_adjm_reg_dt = [" + getPurc_adjm_reg_dt() + "]");
		System.out.println("purc_adjm_reg_seq = [" + getPurc_adjm_reg_seq() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("txn_clsf = [" + getTxn_clsf() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("dduc_amt = [" + getDduc_amt() + "]");
		System.out.println("comp_amt = [" + getComp_amt() + "]");
		System.out.println("prom_amt = [" + getProm_amt() + "]");
		System.out.println("gds_vol_amt = [" + getGds_vol_amt() + "]");
		System.out.println("etc_amt = [" + getEtc_amt() + "]");
		System.out.println("stot_amt = [" + getStot_amt() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String purc_adjm_reg_dt = req.getParameter("purc_adjm_reg_dt");
if( purc_adjm_reg_dt == null){
	System.out.println(this.toString+" : purc_adjm_reg_dt is null" );
}else{
	System.out.println(this.toString+" : purc_adjm_reg_dt is "+purc_adjm_reg_dt );
}
String purc_adjm_reg_seq = req.getParameter("purc_adjm_reg_seq");
if( purc_adjm_reg_seq == null){
	System.out.println(this.toString+" : purc_adjm_reg_seq is null" );
}else{
	System.out.println(this.toString+" : purc_adjm_reg_seq is "+purc_adjm_reg_seq );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String txn_clsf = req.getParameter("txn_clsf");
if( txn_clsf == null){
	System.out.println(this.toString+" : txn_clsf is null" );
}else{
	System.out.println(this.toString+" : txn_clsf is "+txn_clsf );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String dduc_amt = req.getParameter("dduc_amt");
if( dduc_amt == null){
	System.out.println(this.toString+" : dduc_amt is null" );
}else{
	System.out.println(this.toString+" : dduc_amt is "+dduc_amt );
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
String stot_amt = req.getParameter("stot_amt");
if( stot_amt == null){
	System.out.println(this.toString+" : stot_amt is null" );
}else{
	System.out.println(this.toString+" : stot_amt is "+stot_amt );
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
String mode = Util.checkString(req.getParameter("mode"));
String purc_adjm_reg_dt = Util.checkString(req.getParameter("purc_adjm_reg_dt"));
String purc_adjm_reg_seq = Util.checkString(req.getParameter("purc_adjm_reg_seq"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String txn_clsf = Util.checkString(req.getParameter("txn_clsf"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String dduc_amt = Util.checkString(req.getParameter("dduc_amt"));
String comp_amt = Util.checkString(req.getParameter("comp_amt"));
String prom_amt = Util.checkString(req.getParameter("prom_amt"));
String gds_vol_amt = Util.checkString(req.getParameter("gds_vol_amt"));
String etc_amt = Util.checkString(req.getParameter("etc_amt"));
String stot_amt = Util.checkString(req.getParameter("stot_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String purc_adjm_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_adjm_reg_dt")));
String purc_adjm_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_adjm_reg_seq")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String txn_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("txn_clsf")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String dduc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dduc_amt")));
String comp_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_amt")));
String prom_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("prom_amt")));
String gds_vol_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("gds_vol_amt")));
String etc_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_amt")));
String stot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("stot_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setPurc_adjm_reg_dt(purc_adjm_reg_dt);
dm.setPurc_adjm_reg_seq(purc_adjm_reg_seq);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setTxn_clsf(txn_clsf);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setDduc_amt(dduc_amt);
dm.setComp_amt(comp_amt);
dm.setProm_amt(prom_amt);
dm.setGds_vol_amt(gds_vol_amt);
dm.setEtc_amt(etc_amt);
dm.setStot_amt(stot_amt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 14:10:37 KST 2012 */