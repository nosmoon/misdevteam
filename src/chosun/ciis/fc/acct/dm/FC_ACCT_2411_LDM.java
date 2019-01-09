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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2411_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String acct_cd;
	public String frfisc_dt;
	public String tofisc_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String medi_cd;
	public String mang_clsf_cd;
	public String evnt_cd;
	public String clam_dept_cd;
	public String slip_clsf_cd;
	public String dr_amt;
	public String crdt_amt;
	public String incmg_pers;
	public String drcr_clsf1;
	public String drcr_clsf2;
	public String pch_x;
	public String tran_slip_clsf;
	public String dt_clsf;
	public String chnl_clsf_cd;

	public FC_ACCT_2411_LDM(){}
	public FC_ACCT_2411_LDM(String cmpy_cd, String acct_cd, String frfisc_dt, String tofisc_dt, String dlco_clsf_cd, String dlco_cd, String medi_cd, String mang_clsf_cd, String evnt_cd, String clam_dept_cd, String slip_clsf_cd, String dr_amt, String crdt_amt, String incmg_pers, String drcr_clsf1, String drcr_clsf2, String pch_x, String tran_slip_clsf, String dt_clsf, String chnl_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.acct_cd = acct_cd;
		this.frfisc_dt = frfisc_dt;
		this.tofisc_dt = tofisc_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.medi_cd = medi_cd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.evnt_cd = evnt_cd;
		this.clam_dept_cd = clam_dept_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.dr_amt = dr_amt;
		this.crdt_amt = crdt_amt;
		this.incmg_pers = incmg_pers;
		this.drcr_clsf1 = drcr_clsf1;
		this.drcr_clsf2 = drcr_clsf2;
		this.pch_x = pch_x;
		this.tran_slip_clsf = tran_slip_clsf;
		this.dt_clsf = dt_clsf;
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setFrfisc_dt(String frfisc_dt){
		this.frfisc_dt = frfisc_dt;
	}

	public void setTofisc_dt(String tofisc_dt){
		this.tofisc_dt = tofisc_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setDrcr_clsf1(String drcr_clsf1){
		this.drcr_clsf1 = drcr_clsf1;
	}

	public void setDrcr_clsf2(String drcr_clsf2){
		this.drcr_clsf2 = drcr_clsf2;
	}

	public void setPch_x(String pch_x){
		this.pch_x = pch_x;
	}

	public void setTran_slip_clsf(String tran_slip_clsf){
		this.tran_slip_clsf = tran_slip_clsf;
	}

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getFrfisc_dt(){
		return this.frfisc_dt;
	}

	public String getTofisc_dt(){
		return this.tofisc_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDrcr_clsf1(){
		return this.drcr_clsf1;
	}

	public String getDrcr_clsf2(){
		return this.drcr_clsf2;
	}

	public String getPch_x(){
		return this.pch_x;
	}

	public String getTran_slip_clsf(){
		return this.tran_slip_clsf;
	}

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2411_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2411_LDM dm = (FC_ACCT_2411_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.acct_cd);
		cstmt.setString(5, dm.frfisc_dt);
		cstmt.setString(6, dm.tofisc_dt);
		cstmt.setString(7, dm.dlco_clsf_cd);
		cstmt.setString(8, dm.dlco_cd);
		cstmt.setString(9, dm.medi_cd);
		cstmt.setString(10, dm.mang_clsf_cd);
		cstmt.setString(11, dm.evnt_cd);
		cstmt.setString(12, dm.clam_dept_cd);
		cstmt.setString(13, dm.slip_clsf_cd);
		cstmt.setString(14, dm.dr_amt);
		cstmt.setString(15, dm.crdt_amt);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.drcr_clsf1);
		cstmt.setString(18, dm.drcr_clsf2);
		cstmt.setString(19, dm.pch_x);
		cstmt.setString(20, dm.tran_slip_clsf);
		cstmt.setString(21, dm.dt_clsf);
		cstmt.setString(22, dm.chnl_clsf_cd);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2411_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("acct_cd = [" + getAcct_cd() + "]");
		System.out.println("frfisc_dt = [" + getFrfisc_dt() + "]");
		System.out.println("tofisc_dt = [" + getTofisc_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("crdt_amt = [" + getCrdt_amt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("drcr_clsf1 = [" + getDrcr_clsf1() + "]");
		System.out.println("drcr_clsf2 = [" + getDrcr_clsf2() + "]");
		System.out.println("pch_x = [" + getPch_x() + "]");
		System.out.println("tran_slip_clsf = [" + getTran_slip_clsf() + "]");
		System.out.println("dt_clsf = [" + getDt_clsf() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
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
String acct_cd = req.getParameter("acct_cd");
if( acct_cd == null){
	System.out.println(this.toString+" : acct_cd is null" );
}else{
	System.out.println(this.toString+" : acct_cd is "+acct_cd );
}
String frfisc_dt = req.getParameter("frfisc_dt");
if( frfisc_dt == null){
	System.out.println(this.toString+" : frfisc_dt is null" );
}else{
	System.out.println(this.toString+" : frfisc_dt is "+frfisc_dt );
}
String tofisc_dt = req.getParameter("tofisc_dt");
if( tofisc_dt == null){
	System.out.println(this.toString+" : tofisc_dt is null" );
}else{
	System.out.println(this.toString+" : tofisc_dt is "+tofisc_dt );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String crdt_amt = req.getParameter("crdt_amt");
if( crdt_amt == null){
	System.out.println(this.toString+" : crdt_amt is null" );
}else{
	System.out.println(this.toString+" : crdt_amt is "+crdt_amt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String drcr_clsf1 = req.getParameter("drcr_clsf1");
if( drcr_clsf1 == null){
	System.out.println(this.toString+" : drcr_clsf1 is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf1 is "+drcr_clsf1 );
}
String drcr_clsf2 = req.getParameter("drcr_clsf2");
if( drcr_clsf2 == null){
	System.out.println(this.toString+" : drcr_clsf2 is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf2 is "+drcr_clsf2 );
}
String pch_x = req.getParameter("pch_x");
if( pch_x == null){
	System.out.println(this.toString+" : pch_x is null" );
}else{
	System.out.println(this.toString+" : pch_x is "+pch_x );
}
String tran_slip_clsf = req.getParameter("tran_slip_clsf");
if( tran_slip_clsf == null){
	System.out.println(this.toString+" : tran_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : tran_slip_clsf is "+tran_slip_clsf );
}
String dt_clsf = req.getParameter("dt_clsf");
if( dt_clsf == null){
	System.out.println(this.toString+" : dt_clsf is null" );
}else{
	System.out.println(this.toString+" : dt_clsf is "+dt_clsf );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String acct_cd = Util.checkString(req.getParameter("acct_cd"));
String frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
String tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
String drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));
String pch_x = Util.checkString(req.getParameter("pch_x"));
String tran_slip_clsf = Util.checkString(req.getParameter("tran_slip_clsf"));
String dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd")));
String frfisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("frfisc_dt")));
String tofisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tofisc_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String drcr_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf1")));
String drcr_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf2")));
String pch_x = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_x")));
String tran_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_slip_clsf")));
String dt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dt_clsf")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAcct_cd(acct_cd);
dm.setFrfisc_dt(frfisc_dt);
dm.setTofisc_dt(tofisc_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setMedi_cd(medi_cd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setEvnt_cd(evnt_cd);
dm.setClam_dept_cd(clam_dept_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setDr_amt(dr_amt);
dm.setCrdt_amt(crdt_amt);
dm.setIncmg_pers(incmg_pers);
dm.setDrcr_clsf1(drcr_clsf1);
dm.setDrcr_clsf2(drcr_clsf2);
dm.setPch_x(pch_x);
dm.setTran_slip_clsf(tran_slip_clsf);
dm.setDt_clsf(dt_clsf);
dm.setChnl_clsf_cd(chnl_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 16 17:40:22 KST 2018 */