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


public class FC_FUNC_5002_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insr_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String mtry_dt;
	public String medi_cd;
	public String dtls_medi_cd;
	public String use_dept_cd;
	public String insr_amt;
	public String insr_rate;
	public String frex_cd;
	public String exrate;
	public String frcr_amt;
	public String won_amt;
	public String pymt_rmks;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String insr_clsf_cd;
	public String insr_no;
	public String comp_dt;

	public FC_FUNC_5002_IDM(){}
	public FC_FUNC_5002_IDM(String cmpy_cd, String insr_nm, String dlco_clsf_cd, String dlco_cd, String mtry_dt, String medi_cd, String dtls_medi_cd, String use_dept_cd, String insr_amt, String insr_rate, String frex_cd, String exrate, String frcr_amt, String won_amt, String pymt_rmks, String incmg_pers, String incmg_pers_ipadd, String insr_clsf_cd, String insr_no, String comp_dt){
		this.cmpy_cd = cmpy_cd;
		this.insr_nm = insr_nm;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.mtry_dt = mtry_dt;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.use_dept_cd = use_dept_cd;
		this.insr_amt = insr_amt;
		this.insr_rate = insr_rate;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
		this.frcr_amt = frcr_amt;
		this.won_amt = won_amt;
		this.pymt_rmks = pymt_rmks;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.insr_clsf_cd = insr_clsf_cd;
		this.insr_no = insr_no;
		this.comp_dt = comp_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInsr_nm(String insr_nm){
		this.insr_nm = insr_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setInsr_amt(String insr_amt){
		this.insr_amt = insr_amt;
	}

	public void setInsr_rate(String insr_rate){
		this.insr_rate = insr_rate;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setWon_amt(String won_amt){
		this.won_amt = won_amt;
	}

	public void setPymt_rmks(String pymt_rmks){
		this.pymt_rmks = pymt_rmks;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setInsr_clsf_cd(String insr_clsf_cd){
		this.insr_clsf_cd = insr_clsf_cd;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInsr_nm(){
		return this.insr_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getInsr_amt(){
		return this.insr_amt;
	}

	public String getInsr_rate(){
		return this.insr_rate;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getWon_amt(){
		return this.won_amt;
	}

	public String getPymt_rmks(){
		return this.pymt_rmks;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getInsr_clsf_cd(){
		return this.insr_clsf_cd;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_5002_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_5002_IDM dm = (FC_FUNC_5002_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insr_nm);
		cstmt.setString(5, dm.dlco_clsf_cd);
		cstmt.setString(6, dm.dlco_cd);
		cstmt.setString(7, dm.mtry_dt);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.dtls_medi_cd);
		cstmt.setString(10, dm.use_dept_cd);
		cstmt.setString(11, dm.insr_amt);
		cstmt.setString(12, dm.insr_rate);
		cstmt.setString(13, dm.frex_cd);
		cstmt.setString(14, dm.exrate);
		cstmt.setString(15, dm.frcr_amt);
		cstmt.setString(16, dm.won_amt);
		cstmt.setString(17, dm.pymt_rmks);
		cstmt.setString(18, dm.incmg_pers);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.insr_clsf_cd);
		cstmt.setString(21, dm.insr_no);
		cstmt.setString(22, dm.comp_dt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_5002_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insr_nm = [" + getInsr_nm() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("insr_amt = [" + getInsr_amt() + "]");
		System.out.println("insr_rate = [" + getInsr_rate() + "]");
		System.out.println("frex_cd = [" + getFrex_cd() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("frcr_amt = [" + getFrcr_amt() + "]");
		System.out.println("won_amt = [" + getWon_amt() + "]");
		System.out.println("pymt_rmks = [" + getPymt_rmks() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("insr_clsf_cd = [" + getInsr_clsf_cd() + "]");
		System.out.println("insr_no = [" + getInsr_no() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
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
String insr_nm = req.getParameter("insr_nm");
if( insr_nm == null){
	System.out.println(this.toString+" : insr_nm is null" );
}else{
	System.out.println(this.toString+" : insr_nm is "+insr_nm );
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
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String insr_amt = req.getParameter("insr_amt");
if( insr_amt == null){
	System.out.println(this.toString+" : insr_amt is null" );
}else{
	System.out.println(this.toString+" : insr_amt is "+insr_amt );
}
String insr_rate = req.getParameter("insr_rate");
if( insr_rate == null){
	System.out.println(this.toString+" : insr_rate is null" );
}else{
	System.out.println(this.toString+" : insr_rate is "+insr_rate );
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
String frcr_amt = req.getParameter("frcr_amt");
if( frcr_amt == null){
	System.out.println(this.toString+" : frcr_amt is null" );
}else{
	System.out.println(this.toString+" : frcr_amt is "+frcr_amt );
}
String won_amt = req.getParameter("won_amt");
if( won_amt == null){
	System.out.println(this.toString+" : won_amt is null" );
}else{
	System.out.println(this.toString+" : won_amt is "+won_amt );
}
String pymt_rmks = req.getParameter("pymt_rmks");
if( pymt_rmks == null){
	System.out.println(this.toString+" : pymt_rmks is null" );
}else{
	System.out.println(this.toString+" : pymt_rmks is "+pymt_rmks );
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
String insr_clsf_cd = req.getParameter("insr_clsf_cd");
if( insr_clsf_cd == null){
	System.out.println(this.toString+" : insr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : insr_clsf_cd is "+insr_clsf_cd );
}
String insr_no = req.getParameter("insr_no");
if( insr_no == null){
	System.out.println(this.toString+" : insr_no is null" );
}else{
	System.out.println(this.toString+" : insr_no is "+insr_no );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insr_nm = Util.checkString(req.getParameter("insr_nm"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String insr_amt = Util.checkString(req.getParameter("insr_amt"));
String insr_rate = Util.checkString(req.getParameter("insr_rate"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
String won_amt = Util.checkString(req.getParameter("won_amt"));
String pymt_rmks = Util.checkString(req.getParameter("pymt_rmks"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
String insr_no = Util.checkString(req.getParameter("insr_no"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_nm")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String insr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_amt")));
String insr_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_rate")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String frcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt")));
String won_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("won_amt")));
String pymt_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_rmks")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String insr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_clsf_cd")));
String insr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_no")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInsr_nm(insr_nm);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setMtry_dt(mtry_dt);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setInsr_amt(insr_amt);
dm.setInsr_rate(insr_rate);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
dm.setFrcr_amt(frcr_amt);
dm.setWon_amt(won_amt);
dm.setPymt_rmks(pymt_rmks);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setInsr_clsf_cd(insr_clsf_cd);
dm.setInsr_no(insr_no);
dm.setComp_dt(comp_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 17:51:11 KST 2009 */