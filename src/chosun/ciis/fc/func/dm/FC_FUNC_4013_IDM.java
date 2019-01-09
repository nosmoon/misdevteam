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


public class FC_FUNC_4013_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pay_note_no;
	public String comp_dt;
	public String mtry_dt;
	public String note_amt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String patr_budg_cd;
	public String rmks1;
	public String rmks2;
	public String setoff_yn;
	public String issu_clsf_cd;
	public String incm_tax;
	public String res_tax;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String dlco_nm;
	public String use_dept_cd;

	public FC_FUNC_4013_IDM(){}
	public FC_FUNC_4013_IDM(String cmpy_cd, String pay_note_no, String comp_dt, String mtry_dt, String note_amt, String dlco_clsf_cd, String dlco_cd, String patr_budg_cd, String rmks1, String rmks2, String setoff_yn, String issu_clsf_cd, String incm_tax, String res_tax, String incmg_pers, String incmg_pers_ipadd, String dlco_nm, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.pay_note_no = pay_note_no;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.note_amt = note_amt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.patr_budg_cd = patr_budg_cd;
		this.rmks1 = rmks1;
		this.rmks2 = rmks2;
		this.setoff_yn = setoff_yn;
		this.issu_clsf_cd = issu_clsf_cd;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.dlco_nm = dlco_nm;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPay_note_no(String pay_note_no){
		this.pay_note_no = pay_note_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPatr_budg_cd(String patr_budg_cd){
		this.patr_budg_cd = patr_budg_cd;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setIssu_clsf_cd(String issu_clsf_cd){
		this.issu_clsf_cd = issu_clsf_cd;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPay_note_no(){
		return this.pay_note_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPatr_budg_cd(){
		return this.patr_budg_cd;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getIssu_clsf_cd(){
		return this.issu_clsf_cd;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4013_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4013_IDM dm = (FC_FUNC_4013_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pay_note_no);
		cstmt.setString(5, dm.comp_dt);
		cstmt.setString(6, dm.mtry_dt);
		cstmt.setString(7, dm.note_amt);
		cstmt.setString(8, dm.dlco_clsf_cd);
		cstmt.setString(9, dm.dlco_cd);
		cstmt.setString(10, dm.patr_budg_cd);
		cstmt.setString(11, dm.rmks1);
		cstmt.setString(12, dm.rmks2);
		cstmt.setString(13, dm.setoff_yn);
		cstmt.setString(14, dm.issu_clsf_cd);
		cstmt.setString(15, dm.incm_tax);
		cstmt.setString(16, dm.res_tax);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.incmg_pers_ipadd);
		cstmt.setString(19, dm.dlco_nm);
		cstmt.setString(20, dm.use_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4013_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pay_note_no = " + getPay_note_no());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("note_amt = " + getNote_amt());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("patr_budg_cd = " + getPatr_budg_cd());
        System.out.println("rmks1 = " + getRmks1());
        System.out.println("rmks2 = " + getRmks2());
        System.out.println("setoff_yn = " + getSetoff_yn());
        System.out.println("issu_clsf_cd = " + getIssu_clsf_cd());
        System.out.println("incm_tax = " + getIncm_tax());
        System.out.println("res_tax = " + getRes_tax());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("dlco_nm = " + getDlco_nm());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
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
String pay_note_no = req.getParameter("pay_note_no");
if( pay_note_no == null){
	System.out.println(this.toString+" : pay_note_no is null" );
}else{
	System.out.println(this.toString+" : pay_note_no is "+pay_note_no );
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
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
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
String patr_budg_cd = req.getParameter("patr_budg_cd");
if( patr_budg_cd == null){
	System.out.println(this.toString+" : patr_budg_cd is null" );
}else{
	System.out.println(this.toString+" : patr_budg_cd is "+patr_budg_cd );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String setoff_yn = req.getParameter("setoff_yn");
if( setoff_yn == null){
	System.out.println(this.toString+" : setoff_yn is null" );
}else{
	System.out.println(this.toString+" : setoff_yn is "+setoff_yn );
}
String issu_clsf_cd = req.getParameter("issu_clsf_cd");
if( issu_clsf_cd == null){
	System.out.println(this.toString+" : issu_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : issu_clsf_cd is "+issu_clsf_cd );
}
String incm_tax = req.getParameter("incm_tax");
if( incm_tax == null){
	System.out.println(this.toString+" : incm_tax is null" );
}else{
	System.out.println(this.toString+" : incm_tax is "+incm_tax );
}
String res_tax = req.getParameter("res_tax");
if( res_tax == null){
	System.out.println(this.toString+" : res_tax is null" );
}else{
	System.out.println(this.toString+" : res_tax is "+res_tax );
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
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String patr_budg_cd = Util.checkString(req.getParameter("patr_budg_cd"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String setoff_yn = Util.checkString(req.getParameter("setoff_yn"));
String issu_clsf_cd = Util.checkString(req.getParameter("issu_clsf_cd"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pay_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_note_no")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String patr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("patr_budg_cd")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String setoff_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_yn")));
String issu_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_clsf_cd")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPay_note_no(pay_note_no);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setNote_amt(note_amt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPatr_budg_cd(patr_budg_cd);
dm.setRmks1(rmks1);
dm.setRmks2(rmks2);
dm.setSetoff_yn(setoff_yn);
dm.setIssu_clsf_cd(issu_clsf_cd);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDlco_nm(dlco_nm);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 11:53:38 KST 2009 */