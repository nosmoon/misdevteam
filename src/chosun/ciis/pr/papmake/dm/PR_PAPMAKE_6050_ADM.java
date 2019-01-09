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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_6050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String mode;
	public String slip_proc_seq;
	public String tax_stmt_dt;
	public String tax_stmt_seq;
	public String slip_proc_occr_dt;
	public String yymm;
	public String fac_clsf;

	public PR_PAPMAKE_6050_ADM(){}
	public PR_PAPMAKE_6050_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String mode, String slip_proc_seq, String tax_stmt_dt, String tax_stmt_seq, String slip_proc_occr_dt, String yymm, String fac_clsf){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.mode = mode;
		this.slip_proc_seq = slip_proc_seq;
		this.tax_stmt_dt = tax_stmt_dt;
		this.tax_stmt_seq = tax_stmt_seq;
		this.slip_proc_occr_dt = slip_proc_occr_dt;
		this.yymm = yymm;
		this.fac_clsf = fac_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setTax_stmt_dt(String tax_stmt_dt){
		this.tax_stmt_dt = tax_stmt_dt;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getTax_stmt_dt(){
		return this.tax_stmt_dt;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_6050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_6050_ADM dm = (PR_PAPMAKE_6050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.mode);
		cstmt.setString(7, dm.slip_proc_seq);
		cstmt.setString(8, dm.tax_stmt_dt);
		cstmt.setString(9, dm.tax_stmt_seq);
		cstmt.setString(10, dm.slip_proc_occr_dt);
		cstmt.setString(11, dm.yymm);
		cstmt.setString(12, dm.fac_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_6050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("slip_proc_seq = [" + getSlip_proc_seq() + "]");
		System.out.println("tax_stmt_dt = [" + getTax_stmt_dt() + "]");
		System.out.println("tax_stmt_seq = [" + getTax_stmt_seq() + "]");
		System.out.println("slip_proc_occr_dt = [" + getSlip_proc_occr_dt() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
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
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String slip_proc_seq = req.getParameter("slip_proc_seq");
if( slip_proc_seq == null){
	System.out.println(this.toString+" : slip_proc_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_seq is "+slip_proc_seq );
}
String tax_stmt_dt = req.getParameter("tax_stmt_dt");
if( tax_stmt_dt == null){
	System.out.println(this.toString+" : tax_stmt_dt is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_dt is "+tax_stmt_dt );
}
String tax_stmt_seq = req.getParameter("tax_stmt_seq");
if( tax_stmt_seq == null){
	System.out.println(this.toString+" : tax_stmt_seq is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_seq is "+tax_stmt_seq );
}
String slip_proc_occr_dt = req.getParameter("slip_proc_occr_dt");
if( slip_proc_occr_dt == null){
	System.out.println(this.toString+" : slip_proc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_proc_occr_dt is "+slip_proc_occr_dt );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String mode = Util.checkString(req.getParameter("mode"));
String slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
String tax_stmt_dt = Util.checkString(req.getParameter("tax_stmt_dt"));
String tax_stmt_seq = Util.checkString(req.getParameter("tax_stmt_seq"));
String slip_proc_occr_dt = Util.checkString(req.getParameter("slip_proc_occr_dt"));
String yymm = Util.checkString(req.getParameter("yymm"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String slip_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_seq")));
String tax_stmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_dt")));
String tax_stmt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_seq")));
String slip_proc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_occr_dt")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setMode(mode);
dm.setSlip_proc_seq(slip_proc_seq);
dm.setTax_stmt_dt(tax_stmt_dt);
dm.setTax_stmt_seq(tax_stmt_seq);
dm.setSlip_proc_occr_dt(slip_proc_occr_dt);
dm.setYymm(yymm);
dm.setFac_clsf(fac_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 30 16:43:24 KST 2009 */