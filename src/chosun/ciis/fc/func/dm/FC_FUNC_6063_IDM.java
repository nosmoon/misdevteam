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


public class FC_FUNC_6063_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String deps_isav_clsf_cd;
	public String deps_isav_no;
	public String deps_isav_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String comp_dt;
	public String mtry_dt;
	public String pymt_mm;
	public String tot_pymt_amt;
	public String cntr_amt;
	public String tot_int;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String int_rate;
	public String insr_amt;
	public String isav_amt;

	public FC_FUNC_6063_IDM(){}
	public FC_FUNC_6063_IDM(String cmpy_cd, String deps_isav_clsf_cd, String deps_isav_no, String deps_isav_nm, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String comp_dt, String mtry_dt, String pymt_mm, String tot_pymt_amt, String cntr_amt, String tot_int, String incmg_pers, String incmg_pers_ipadd, String int_rate, String insr_amt, String isav_amt){
		this.cmpy_cd = cmpy_cd;
		this.deps_isav_clsf_cd = deps_isav_clsf_cd;
		this.deps_isav_no = deps_isav_no;
		this.deps_isav_nm = deps_isav_nm;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.pymt_mm = pymt_mm;
		this.tot_pymt_amt = tot_pymt_amt;
		this.cntr_amt = cntr_amt;
		this.tot_int = tot_int;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.int_rate = int_rate;
		this.insr_amt = insr_amt;
		this.isav_amt = isav_amt;
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

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPymt_mm(String pymt_mm){
		this.pymt_mm = pymt_mm;
	}

	public void setTot_pymt_amt(String tot_pymt_amt){
		this.tot_pymt_amt = tot_pymt_amt;
	}

	public void setCntr_amt(String cntr_amt){
		this.cntr_amt = cntr_amt;
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

	public void setInsr_amt(String insr_amt){
		this.insr_amt = insr_amt;
	}

	public void setIsav_amt(String isav_amt){
		this.isav_amt = isav_amt;
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

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPymt_mm(){
		return this.pymt_mm;
	}

	public String getTot_pymt_amt(){
		return this.tot_pymt_amt;
	}

	public String getCntr_amt(){
		return this.cntr_amt;
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

	public String getInsr_amt(){
		return this.insr_amt;
	}

	public String getIsav_amt(){
		return this.isav_amt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_6063_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_6063_IDM dm = (FC_FUNC_6063_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.deps_isav_clsf_cd);
		cstmt.setString(5, dm.deps_isav_no);
		cstmt.setString(6, dm.deps_isav_nm);
		cstmt.setString(7, dm.dlco_clsf_cd);
		cstmt.setString(8, dm.dlco_cd);
		cstmt.setString(9, dm.dlco_nm);
		cstmt.setString(10, dm.comp_dt);
		cstmt.setString(11, dm.mtry_dt);
		cstmt.setString(12, dm.pymt_mm);
		cstmt.setString(13, dm.tot_pymt_amt);
		cstmt.setString(14, dm.cntr_amt);
		cstmt.setString(15, dm.tot_int);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.incmg_pers_ipadd);
		cstmt.setString(18, dm.int_rate);
		cstmt.setString(19, dm.insr_amt);
		cstmt.setString(20, dm.isav_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_6063_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("deps_isav_clsf_cd = [" + getDeps_isav_clsf_cd() + "]");
		System.out.println("deps_isav_no = [" + getDeps_isav_no() + "]");
		System.out.println("deps_isav_nm = [" + getDeps_isav_nm() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("pymt_mm = [" + getPymt_mm() + "]");
		System.out.println("tot_pymt_amt = [" + getTot_pymt_amt() + "]");
		System.out.println("cntr_amt = [" + getCntr_amt() + "]");
		System.out.println("tot_int = [" + getTot_int() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("insr_amt = [" + getInsr_amt() + "]");
		System.out.println("isav_amt = [" + getIsav_amt() + "]");
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
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
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
String pymt_mm = req.getParameter("pymt_mm");
if( pymt_mm == null){
	System.out.println(this.toString+" : pymt_mm is null" );
}else{
	System.out.println(this.toString+" : pymt_mm is "+pymt_mm );
}
String tot_pymt_amt = req.getParameter("tot_pymt_amt");
if( tot_pymt_amt == null){
	System.out.println(this.toString+" : tot_pymt_amt is null" );
}else{
	System.out.println(this.toString+" : tot_pymt_amt is "+tot_pymt_amt );
}
String cntr_amt = req.getParameter("cntr_amt");
if( cntr_amt == null){
	System.out.println(this.toString+" : cntr_amt is null" );
}else{
	System.out.println(this.toString+" : cntr_amt is "+cntr_amt );
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
String insr_amt = req.getParameter("insr_amt");
if( insr_amt == null){
	System.out.println(this.toString+" : insr_amt is null" );
}else{
	System.out.println(this.toString+" : insr_amt is "+insr_amt );
}
String isav_amt = req.getParameter("isav_amt");
if( isav_amt == null){
	System.out.println(this.toString+" : isav_amt is null" );
}else{
	System.out.println(this.toString+" : isav_amt is "+isav_amt );
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
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String pymt_mm = Util.checkString(req.getParameter("pymt_mm"));
String tot_pymt_amt = Util.checkString(req.getParameter("tot_pymt_amt"));
String cntr_amt = Util.checkString(req.getParameter("cntr_amt"));
String tot_int = Util.checkString(req.getParameter("tot_int"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String insr_amt = Util.checkString(req.getParameter("insr_amt"));
String isav_amt = Util.checkString(req.getParameter("isav_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String deps_isav_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_clsf_cd")));
String deps_isav_no = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_no")));
String deps_isav_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_isav_nm")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String pymt_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_mm")));
String tot_pymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_pymt_amt")));
String cntr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_amt")));
String tot_int = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_int")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String insr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_amt")));
String isav_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("isav_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDeps_isav_clsf_cd(deps_isav_clsf_cd);
dm.setDeps_isav_no(deps_isav_no);
dm.setDeps_isav_nm(deps_isav_nm);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setPymt_mm(pymt_mm);
dm.setTot_pymt_amt(tot_pymt_amt);
dm.setCntr_amt(cntr_amt);
dm.setTot_int(tot_int);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setInt_rate(int_rate);
dm.setInsr_amt(insr_amt);
dm.setIsav_amt(isav_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 20 11:45:46 KST 2009 */