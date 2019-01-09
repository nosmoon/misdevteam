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


public class FC_ACCT_3034_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stlm_dt;
	public String rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String mang_clsf_cd;
	public String mang_no;
	public String mang_no2;
	public String prvmm_bal;
	public String thmm_dr;
	public String thmm_crdt;
	public String thmm_bal;
	public String dds;
	public String mtry_dt;
	public String clam_dept_cd;
	public String incmg_dt;

	public FC_ACCT_3034_IDM(){}
	public FC_ACCT_3034_IDM(String cmpy_cd, String stlm_dt, String rmks, String incmg_pers, String incmg_pers_ipadd, String mang_clsf_cd, String mang_no, String mang_no2, String prvmm_bal, String thmm_dr, String thmm_crdt, String thmm_bal, String dds, String mtry_dt, String clam_dept_cd, String incmg_dt){
		this.cmpy_cd = cmpy_cd;
		this.stlm_dt = stlm_dt;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.mang_no = mang_no;
		this.mang_no2 = mang_no2;
		this.prvmm_bal = prvmm_bal;
		this.thmm_dr = thmm_dr;
		this.thmm_crdt = thmm_crdt;
		this.thmm_bal = thmm_bal;
		this.dds = dds;
		this.mtry_dt = mtry_dt;
		this.clam_dept_cd = clam_dept_cd;
		this.incmg_dt = incmg_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStlm_dt(String stlm_dt){
		this.stlm_dt = stlm_dt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setMang_no2(String mang_no2){
		this.mang_no2 = mang_no2;
	}

	public void setPrvmm_bal(String prvmm_bal){
		this.prvmm_bal = prvmm_bal;
	}

	public void setThmm_dr(String thmm_dr){
		this.thmm_dr = thmm_dr;
	}

	public void setThmm_crdt(String thmm_crdt){
		this.thmm_crdt = thmm_crdt;
	}

	public void setThmm_bal(String thmm_bal){
		this.thmm_bal = thmm_bal;
	}

	public void setDds(String dds){
		this.dds = dds;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStlm_dt(){
		return this.stlm_dt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getMang_no2(){
		return this.mang_no2;
	}

	public String getPrvmm_bal(){
		return this.prvmm_bal;
	}

	public String getThmm_dr(){
		return this.thmm_dr;
	}

	public String getThmm_crdt(){
		return this.thmm_crdt;
	}

	public String getThmm_bal(){
		return this.thmm_bal;
	}

	public String getDds(){
		return this.dds;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_3034_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_3034_IDM dm = (FC_ACCT_3034_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stlm_dt);
		cstmt.setString(5, dm.rmks);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.mang_clsf_cd);
		cstmt.setString(9, dm.mang_no);
		cstmt.setString(10, dm.mang_no2);
		cstmt.setString(11, dm.prvmm_bal);
		cstmt.setString(12, dm.thmm_dr);
		cstmt.setString(13, dm.thmm_crdt);
		cstmt.setString(14, dm.thmm_bal);
		cstmt.setString(15, dm.dds);
		cstmt.setString(16, dm.mtry_dt);
		cstmt.setString(17, dm.clam_dept_cd);
		cstmt.setString(18, dm.incmg_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_3034_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("stlm_dt = " + getStlm_dt());
        System.out.println("rmks = " + getRmks());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("mang_clsf_cd = " + getMang_clsf_cd());
        System.out.println("mang_no = " + getMang_no());
        System.out.println("mang_no2 = " + getMang_no2());
        System.out.println("prvmm_bal = " + getPrvmm_bal());
        System.out.println("thmm_dr = " + getThmm_dr());
        System.out.println("thmm_crdt = " + getThmm_crdt());
        System.out.println("thmm_bal = " + getThmm_bal());
        System.out.println("dds = " + getDds());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("clam_dept_cd = " + getClam_dept_cd());
        System.out.println("incmg_dt = " + getIncmg_dt());
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
String stlm_dt = req.getParameter("stlm_dt");
if( stlm_dt == null){
	System.out.println(this.toString+" : stlm_dt is null" );
}else{
	System.out.println(this.toString+" : stlm_dt is "+stlm_dt );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String mang_no2 = req.getParameter("mang_no2");
if( mang_no2 == null){
	System.out.println(this.toString+" : mang_no2 is null" );
}else{
	System.out.println(this.toString+" : mang_no2 is "+mang_no2 );
}
String prvmm_bal = req.getParameter("prvmm_bal");
if( prvmm_bal == null){
	System.out.println(this.toString+" : prvmm_bal is null" );
}else{
	System.out.println(this.toString+" : prvmm_bal is "+prvmm_bal );
}
String thmm_dr = req.getParameter("thmm_dr");
if( thmm_dr == null){
	System.out.println(this.toString+" : thmm_dr is null" );
}else{
	System.out.println(this.toString+" : thmm_dr is "+thmm_dr );
}
String thmm_crdt = req.getParameter("thmm_crdt");
if( thmm_crdt == null){
	System.out.println(this.toString+" : thmm_crdt is null" );
}else{
	System.out.println(this.toString+" : thmm_crdt is "+thmm_crdt );
}
String thmm_bal = req.getParameter("thmm_bal");
if( thmm_bal == null){
	System.out.println(this.toString+" : thmm_bal is null" );
}else{
	System.out.println(this.toString+" : thmm_bal is "+thmm_bal );
}
String dds = req.getParameter("dds");
if( dds == null){
	System.out.println(this.toString+" : dds is null" );
}else{
	System.out.println(this.toString+" : dds is "+dds );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stlm_dt = Util.checkString(req.getParameter("stlm_dt"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String mang_no2 = Util.checkString(req.getParameter("mang_no2"));
String prvmm_bal = Util.checkString(req.getParameter("prvmm_bal"));
String thmm_dr = Util.checkString(req.getParameter("thmm_dr"));
String thmm_crdt = Util.checkString(req.getParameter("thmm_crdt"));
String thmm_bal = Util.checkString(req.getParameter("thmm_bal"));
String dds = Util.checkString(req.getParameter("dds"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stlm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stlm_dt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String mang_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no2")));
String prvmm_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_bal")));
String thmm_dr = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_dr")));
String thmm_crdt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_crdt")));
String thmm_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_bal")));
String dds = Util.Uni2Ksc(Util.checkString(req.getParameter("dds")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStlm_dt(stlm_dt);
dm.setRmks(rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setMang_no(mang_no);
dm.setMang_no2(mang_no2);
dm.setPrvmm_bal(prvmm_bal);
dm.setThmm_dr(thmm_dr);
dm.setThmm_crdt(thmm_crdt);
dm.setThmm_bal(thmm_bal);
dm.setDds(dds);
dm.setMtry_dt(mtry_dt);
dm.setClam_dept_cd(clam_dept_cd);
dm.setIncmg_dt(incmg_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 04 19:48:45 KST 2009 */