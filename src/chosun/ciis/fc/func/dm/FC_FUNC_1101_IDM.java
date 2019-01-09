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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1101_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String stat_dt;
	public String rmks1;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pch_compnm;
	public String deps_clsf_cd;
	public String patr_budg_cd;
	public String deps_dt;
	public String dhon_resn_cd;
	public String dhon_occr_dt;
	public String incmg_pers;
	public String incmg_pers_ipad;
	public String mtry_dt;
	public String use_dept_cd;
	public String pch_budosayunm;
	public String frex_cd;
	public String exrate;
	public String frex_amt;

	public FC_FUNC_1101_IDM(){}
	public FC_FUNC_1101_IDM(String cmpy_cd, String bank_cd, String note_no, String note_seq, String stat_dt, String rmks1, String dlco_clsf_cd, String dlco_cd, String pch_compnm, String deps_clsf_cd, String patr_budg_cd, String deps_dt, String dhon_resn_cd, String dhon_occr_dt, String incmg_pers, String incmg_pers_ipad, String mtry_dt, String use_dept_cd, String pch_budosayunm, String frex_cd, String exrate, String frex_amt){
		this.cmpy_cd = cmpy_cd;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.stat_dt = stat_dt;
		this.rmks1 = rmks1;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.pch_compnm = pch_compnm;
		this.deps_clsf_cd = deps_clsf_cd;
		this.patr_budg_cd = patr_budg_cd;
		this.deps_dt = deps_dt;
		this.dhon_resn_cd = dhon_resn_cd;
		this.dhon_occr_dt = dhon_occr_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipad = incmg_pers_ipad;
		this.mtry_dt = mtry_dt;
		this.use_dept_cd = use_dept_cd;
		this.pch_budosayunm = pch_budosayunm;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
		this.frex_amt = frex_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setDeps_dt(String deps_dt){
		this.deps_dt = deps_dt;
	}

	public void setDhon_resn_cd(String dhon_resn_cd){
		this.dhon_resn_cd = dhon_resn_cd;
	}

	public void setDhon_occr_dt(String dhon_occr_dt){
		this.dhon_occr_dt = dhon_occr_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipad(String incmg_pers_ipad){
		this.incmg_pers_ipad = incmg_pers_ipad;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setPch_budosayunm(String pch_budosayunm){
		this.pch_budosayunm = pch_budosayunm;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrex_amt(String frex_amt){
		this.frex_amt = frex_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getDeps_dt(){
		return this.deps_dt;
	}

	public String getDhon_resn_cd(){
		return this.dhon_resn_cd;
	}

	public String getDhon_occr_dt(){
		return this.dhon_occr_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipad(){
		return this.incmg_pers_ipad;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getPch_budosayunm(){
		return this.pch_budosayunm;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrex_amt(){
		return this.frex_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1101_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1101_IDM dm = (FC_FUNC_1101_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bank_cd);
		cstmt.setString(5, dm.note_no);
		cstmt.setString(6, dm.note_seq);
		cstmt.setString(7, dm.stat_dt);
		cstmt.setString(8, dm.rmks1);
		cstmt.setString(9, dm.dlco_clsf_cd);
		cstmt.setString(10, dm.dlco_cd);
		cstmt.setString(11, dm.pch_compnm);
		cstmt.setString(12, dm.deps_clsf_cd);
		cstmt.setString(13, dm.patr_budg_cd);
		cstmt.setString(14, dm.deps_dt);
		cstmt.setString(15, dm.dhon_resn_cd);
		cstmt.setString(16, dm.dhon_occr_dt);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipad);
		cstmt.setString(19, dm.mtry_dt);
		cstmt.setString(20, dm.use_dept_cd);
		cstmt.setString(21, dm.pch_budosayunm);
		cstmt.setString(22, dm.frex_cd);
		cstmt.setString(23, dm.exrate);
		cstmt.setString(24, dm.frex_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1101_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("note_no = " + getNote_no());
        System.out.println("note_seq = " + getNote_seq());
        System.out.println("stat_dt = " + getStat_dt());
        System.out.println("rmks1 = " + getRmks1());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("pch_compnm = " + getPch_compnm());
        System.out.println("deps_clsf_cd = " + getDeps_clsf_cd());
        System.out.println("patr_budg_cd = " + getPatr_budg_cd());
        System.out.println("deps_dt = " + getDeps_dt());
        System.out.println("dhon_resn_cd = " + getDhon_resn_cd());
        System.out.println("dhon_occr_dt = " + getDhon_occr_dt());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipad = " + getIncmg_pers_ipad());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
        System.out.println("pch_budosayunm = " + getPch_budosayunm());
        System.out.println("frex_cd = " + getFrex_cd());
        System.out.println("exrate = " + getExrate());
        System.out.println("frex_amt = " + getFrex_amt());
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
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
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
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String deps_clsf_cd = req.getParameter("deps_clsf_cd");
if( deps_clsf_cd == null){
	System.out.println(this.toString+" : deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_clsf_cd is "+deps_clsf_cd );
}
String patr_budg_cd = req.getParameter("patr_budg_cd");
if( patr_budg_cd == null){
	System.out.println(this.toString+" : patr_budg_cd is null" );
}else{
	System.out.println(this.toString+" : patr_budg_cd is "+patr_budg_cd );
}
String deps_dt = req.getParameter("deps_dt");
if( deps_dt == null){
	System.out.println(this.toString+" : deps_dt is null" );
}else{
	System.out.println(this.toString+" : deps_dt is "+deps_dt );
}
String dhon_resn_cd = req.getParameter("dhon_resn_cd");
if( dhon_resn_cd == null){
	System.out.println(this.toString+" : dhon_resn_cd is null" );
}else{
	System.out.println(this.toString+" : dhon_resn_cd is "+dhon_resn_cd );
}
String dhon_occr_dt = req.getParameter("dhon_occr_dt");
if( dhon_occr_dt == null){
	System.out.println(this.toString+" : dhon_occr_dt is null" );
}else{
	System.out.println(this.toString+" : dhon_occr_dt is "+dhon_occr_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipad = req.getParameter("incmg_pers_ipad");
if( incmg_pers_ipad == null){
	System.out.println(this.toString+" : incmg_pers_ipad is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipad is "+incmg_pers_ipad );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String pch_budosayunm = req.getParameter("pch_budosayunm");
if( pch_budosayunm == null){
	System.out.println(this.toString+" : pch_budosayunm is null" );
}else{
	System.out.println(this.toString+" : pch_budosayunm is "+pch_budosayunm );
}
String frex_cd = req.getParameter("frex_cd");
if( frex_cd == null){
	System.out.println(this.toString+" : frex_cd is null" );
}else{
	System.out.println(this.toString+" : frex_cd is "+frex_cd );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String frex_amt = req.getParameter("frex_amt");
if( frex_amt == null){
	System.out.println(this.toString+" : frex_amt is null" );
}else{
	System.out.println(this.toString+" : frex_amt is "+frex_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
String patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
String deps_dt = Util.checkString(req.getParameter("deps_dt"));
String dhon_resn_cd = Util.checkString(req.getParameter("dhon_resn_cd"));
String dhon_occr_dt = Util.checkString(req.getParameter("dhon_occr_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipad = Util.checkString(req.getParameter("incmg_pers_ipad"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String pch_budosayunm = Util.checkString(req.getParameter("pch_budosayunm"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String frex_amt = Util.checkString(req.getParameter("frex_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_clsf_cd")));
String patr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_budg_cd")));
String deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_dt")));
String dhon_resn_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_resn_cd")));
String dhon_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("dhon_occr_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipad = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipad")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String pch_budosayunm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_budosayunm")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setStat_dt(stat_dt);
dm.setRmks1(rmks1);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setDeps_clsf_cd(deps_clsf_cd);
dm.setPatr_budg_cd(patr_budg_cd);
dm.setDeps_dt(deps_dt);
dm.setDhon_resn_cd(dhon_resn_cd);
dm.setDhon_occr_dt(dhon_occr_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipad(incmg_pers_ipad);
dm.setMtry_dt(mtry_dt);
dm.setUse_dept_cd(use_dept_cd);
dm.setPch_budosayunm(pch_budosayunm);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
dm.setFrex_amt(frex_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 13:30:07 KST 2009 */