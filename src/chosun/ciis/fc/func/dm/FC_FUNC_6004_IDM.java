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


public class FC_FUNC_6004_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String deps_isav_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String compnm;
	public String comp_dt;
	public String mtry_dt;
	public String tot_pymt_amt;
	public String mm_int;
	public String tot_int;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String int_rate;
	public String rmks;
	public String use_dept_cd;
	public String frex_cd;
	public String exrate;
	public String frex_amt;

	public FC_FUNC_6004_IDM(){}
	public FC_FUNC_6004_IDM(String cmpy_cd, String deps_isav_clsf_cd, String deps_isav_no, String deps_isav_nm, String dlco_clsf_cd, String dlco_cd, String compnm, String comp_dt, String mtry_dt, String tot_pymt_amt, String mm_int, String tot_int, String incmg_pers, String incmg_pers_ipadd, String int_rate, String rmks, String use_dept_cd, String frex_cd, String exrate, String frex_amt){
		this.cmpy_cd = cmpy_cd;
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
		this.deps_isav_no = deps_isav_no;
		this.deps_isav_nm = deps_isav_nm;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.compnm = compnm;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.tot_pymt_amt = tot_pymt_amt;
		this.mm_int = mm_int;
		this.tot_int = tot_int;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.int_rate = int_rate;
		this.rmks = rmks;
		this.use_dept_cd = use_dept_cd;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
		this.frex_amt = frex_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDeps_isav_clsf_cd(String deps_isav_clsf_cd){
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
	}

	public void setDeps_isav_no(String deps_isav_no){
		this.deps_isav_no = deps_isav_no;
	}

	public void setDeps_isav_nm(String deps_isav_nm){
		this.deps_isav_nm = deps_isav_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setMm_int(String mm_int){
		this.mm_int = mm_int;
	}

	public void setTot_int(String tot_int){
		this.tot_int = tot_int;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
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

	public String getDeps_isav_clsf_cd(){
		return this.deps_isav_clsf_cd;
	}

	public String getDeps_isav_no(){
		return this.deps_isav_no;
	}

	public String getDeps_isav_nm(){
		return this.deps_isav_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getMm_int(){
		return this.mm_int;
	}

	public String getTot_int(){
		return this.tot_int;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
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
		 return "{ call MISFNC.SP_FC_FUNC_6004_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6004_IDM dm = (FC_FUNC_6004_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deps_isav_clsf_cd);
		cstmt.setString(5, dm.deps_isav_no);
		cstmt.setString(6, dm.deps_isav_nm);
		cstmt.setString(7, dm.dlco_clsf_cd);
		cstmt.setString(8, dm.dlco_cd);
		cstmt.setString(9, dm.compnm);
		cstmt.setString(10, dm.comp_dt);
		cstmt.setString(11, dm.mtry_dt);
		cstmt.setString(12, dm.tot_pymt_amt);
		cstmt.setString(13, dm.mm_int);
		cstmt.setString(14, dm.tot_int);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.int_rate);
		cstmt.setString(18, dm.rmks);
		cstmt.setString(19, dm.use_dept_cd);
		cstmt.setString(20, dm.frex_cd);
		cstmt.setString(21, dm.exrate);
		cstmt.setString(22, dm.frex_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6004_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("deps_isav_clsf_cd = " + getDeps_isav_clsf_cd());
        System.out.println("deps_isav_no = " + getDeps_isav_no());
        System.out.println("deps_isav_nm = " + getDeps_isav_nm());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("compnm = " + getCompnm());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("tot_pymt_amt = " + getTot_pymt_amt());
        System.out.println("mm_int = " + getMm_int());
        System.out.println("tot_int = " + getTot_int());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("int_rate = " + getInt_rate());
        System.out.println("rmks = " + getRmks());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
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
String deps_isav_clsf_cd = req.getParameter("deps_isav_clsf_cd");
if( deps_isav_clsf_cd == null){
	System.out.println(this.toString+" : deps_isav_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_isav_clsf_cd is "+deps_isav_clsf_cd );
}
String deps_isav_no = req.getParameter("deps_isav_no");
if( deps_isav_no == null){
	System.out.println(this.toString+" : deps_isav_no is null" );
}else{
	System.out.println(this.toString+" : deps_isav_no is "+deps_isav_no );
}
String deps_isav_nm = req.getParameter("deps_isav_nm");
if( deps_isav_nm == null){
	System.out.println(this.toString+" : deps_isav_nm is null" );
}else{
	System.out.println(this.toString+" : deps_isav_nm is "+deps_isav_nm );
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
String compnm = req.getParameter("compnm");
if( compnm == null){
	System.out.println(this.toString+" : compnm is null" );
}else{
	System.out.println(this.toString+" : compnm is "+compnm );
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
String tot_pymt_amt = req.getParameter("tot_pymt_amt");
if( tot_pymt_amt == null){
	System.out.println(this.toString+" : tot_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : tot_pymt_amt is "+tot_pymt_amt );
}
String mm_int = req.getParameter("mm_int");
if( mm_int == null){
	System.out.println(this.toString+" : mm_int is null" );
}else{
	System.out.println(this.toString+" : mm_int is "+mm_int );
}
String tot_int = req.getParameter("tot_int");
if( tot_int == null){
	System.out.println(this.toString+" : tot_int is null" );
}else{
	System.out.println(this.toString+" : tot_int is "+tot_int );
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
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
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
String deps_isav_clsf_cd = Util.checkString(req.getParameter("deps_isav_clsf_cd"));
String deps_isav_no = Util.checkString(req.getParameter("deps_isav_no"));
String deps_isav_nm = Util.checkString(req.getParameter("deps_isav_nm"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String compnm = Util.checkString(req.getParameter("compnm"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String tot_pymt_amt = Util.checkString(req.getParameter("tot_pymt_amt"));
String mm_int = Util.checkString(req.getParameter("mm_int"));
String tot_int = Util.checkString(req.getParameter("tot_int"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String rmks = Util.checkString(req.getParameter("rmks"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String frex_amt = Util.checkString(req.getParameter("frex_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String deps_isav_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_clsf_cd")));
String deps_isav_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_no")));
String deps_isav_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_nm")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("compnm")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String tot_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_pymt_amt")));
String mm_int = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_int")));
String tot_int = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_int")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDeps_isav_clsf_cd(deps_isav_clsf_cd);
dm.setDeps_isav_no(deps_isav_no);
dm.setDeps_isav_nm(deps_isav_nm);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setCompnm(compnm);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setTot_pymt_amt(tot_pymt_amt);
dm.setMm_int(mm_int);
dm.setTot_int(tot_int);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setInt_rate(int_rate);
dm.setRmks(rmks);
dm.setUse_dept_cd(use_dept_cd);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
dm.setFrex_amt(frex_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 16 14:03:37 KST 2009 */