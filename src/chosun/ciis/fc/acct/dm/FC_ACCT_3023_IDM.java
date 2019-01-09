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


public class FC_ACCT_3023_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stlm_dt;
	public String rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String prelae_pay_clsf_cd;
	public String mang_clsf_cd;
	public String mang_no;
	public String comp_dt;
	public String mtry_dt;
	public String face_val_amt;
	public String dds;
	public String int_rate;
	public String prvmm_bal;
	public String thmm_dr;
	public String thmm_crdt;
	public String thmm_bal;
	public String clam_dept_cd;
	public String incmg_dt;

	public FC_ACCT_3023_IDM(){}
	public FC_ACCT_3023_IDM(String cmpy_cd, String stlm_dt, String rmks, String incmg_pers, String incmg_pers_ipadd, String prelae_pay_clsf_cd, String mang_clsf_cd, String mang_no, String comp_dt, String mtry_dt, String face_val_amt, String dds, String int_rate, String prvmm_bal, String thmm_dr, String thmm_crdt, String thmm_bal, String clam_dept_cd, String incmg_dt){
		this.cmpy_cd = cmpy_cd;
		this.stlm_dt = stlm_dt;
		this.rmks = rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.mang_no = mang_no;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.face_val_amt = face_val_amt;
		this.dds = dds;
		this.int_rate = int_rate;
		this.prvmm_bal = prvmm_bal;
		this.thmm_dr = thmm_dr;
		this.thmm_crdt = thmm_crdt;
		this.thmm_bal = thmm_bal;
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

	public void setPrelae_pay_clsf_cd(String prelae_pay_clsf_cd){
		this.prelae_pay_clsf_cd = prelae_pay_clsf_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setFace_val_amt(String face_val_amt){
		this.face_val_amt = face_val_amt;
	}

	public void setDds(String dds){
		this.dds = dds;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
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

	public String getPrelae_pay_clsf_cd(){
		return this.prelae_pay_clsf_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getFace_val_amt(){
		return this.face_val_amt;
	}

	public String getDds(){
		return this.dds;
	}

	public String getInt_rate(){
		return this.int_rate;
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

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_3023_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_3023_IDM dm = (FC_ACCT_3023_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stlm_dt);
		cstmt.setString(5, dm.rmks);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.prelae_pay_clsf_cd);
		cstmt.setString(9, dm.mang_clsf_cd);
		cstmt.setString(10, dm.mang_no);
		cstmt.setString(11, dm.comp_dt);
		cstmt.setString(12, dm.mtry_dt);
		cstmt.setString(13, dm.face_val_amt);
		cstmt.setString(14, dm.dds);
		cstmt.setString(15, dm.int_rate);
		cstmt.setString(16, dm.prvmm_bal);
		cstmt.setString(17, dm.thmm_dr);
		cstmt.setString(18, dm.thmm_crdt);
		cstmt.setString(19, dm.thmm_bal);
		cstmt.setString(20, dm.clam_dept_cd);
		cstmt.setString(21, dm.incmg_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_3023_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("stlm_dt = " + getStlm_dt());
        System.out.println("rmks = " + getRmks());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("prelae_pay_clsf_cd = " + getPrelae_pay_clsf_cd());
        System.out.println("mang_clsf_cd = " + getMang_clsf_cd());
        System.out.println("mang_no = " + getMang_no());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("face_val_amt = " + getFace_val_amt());
        System.out.println("dds = " + getDds());
        System.out.println("int_rate = " + getInt_rate());
        System.out.println("prvmm_bal = " + getPrvmm_bal());
        System.out.println("thmm_dr = " + getThmm_dr());
        System.out.println("thmm_crdt = " + getThmm_crdt());
        System.out.println("thmm_bal = " + getThmm_bal());
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
String prelae_pay_clsf_cd = req.getParameter("prelae_pay_clsf_cd");
if( prelae_pay_clsf_cd == null){
	System.out.println(this.toString+" : prelae_pay_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : prelae_pay_clsf_cd is "+prelae_pay_clsf_cd );
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
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String face_val_amt = req.getParameter("face_val_amt");
if( face_val_amt == null){
	System.out.println(this.toString+" : face_val_amt is null" );
}else{
	System.out.println(this.toString+" : face_val_amt is "+face_val_amt );
}
String dds = req.getParameter("dds");
if( dds == null){
	System.out.println(this.toString+" : dds is null" );
}else{
	System.out.println(this.toString+" : dds is "+dds );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
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
String prelae_pay_clsf_cd = Util.checkString(req.getParameter("prelae_pay_clsf_cd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String face_val_amt = Util.checkString(req.getParameter("face_val_amt"));
String dds = Util.checkString(req.getParameter("dds"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String prvmm_bal = Util.checkString(req.getParameter("prvmm_bal"));
String thmm_dr = Util.checkString(req.getParameter("thmm_dr"));
String thmm_crdt = Util.checkString(req.getParameter("thmm_crdt"));
String thmm_bal = Util.checkString(req.getParameter("thmm_bal"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stlm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stlm_dt")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String prelae_pay_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prelae_pay_clsf_cd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String face_val_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("face_val_amt")));
String dds = Util.Uni2Ksc(Util.checkString(req.getParameter("dds")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String prvmm_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("prvmm_bal")));
String thmm_dr = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_dr")));
String thmm_crdt = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_crdt")));
String thmm_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("thmm_bal")));
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
dm.setPrelae_pay_clsf_cd(prelae_pay_clsf_cd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setMang_no(mang_no);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setFace_val_amt(face_val_amt);
dm.setDds(dds);
dm.setInt_rate(int_rate);
dm.setPrvmm_bal(prvmm_bal);
dm.setThmm_dr(thmm_dr);
dm.setThmm_crdt(thmm_crdt);
dm.setThmm_bal(thmm_bal);
dm.setClam_dept_cd(clam_dept_cd);
dm.setIncmg_dt(incmg_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 19:54:04 KST 2009 */