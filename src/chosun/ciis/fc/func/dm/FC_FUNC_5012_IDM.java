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


public class FC_FUNC_5012_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String insr_clsf_cd;
	public String insr_no;
	public String comp_dt;
	public String cctr_dt;
	public String cctr_amt;
	public String cctr_rmks;
	public String nomach_adpay_bal;
	public String cost_gain_stot;
	public String rcpay_amt_stot;
	public String sum_cost_gain_stot;
	public String sum_rcpay_amt_stot;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String medi_cd;
	public String dtls_medi_cd;
	public String mtry_dt;
	public String use_dept_cd;

	public FC_FUNC_5012_IDM(){}
	public FC_FUNC_5012_IDM(String cmpy_cd, String insr_clsf_cd, String insr_no, String comp_dt, String cctr_dt, String cctr_amt, String cctr_rmks, String nomach_adpay_bal, String cost_gain_stot, String rcpay_amt_stot, String sum_cost_gain_stot, String sum_rcpay_amt_stot, String incmg_pers, String incmg_pers_ipadd, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String medi_cd, String dtls_medi_cd, String mtry_dt, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.insr_clsf_cd = insr_clsf_cd;
		this.insr_no = insr_no;
		this.comp_dt = comp_dt;
		this.cctr_dt = cctr_dt;
		this.cctr_amt = cctr_amt;
		this.cctr_rmks = cctr_rmks;
		this.nomach_adpay_bal = nomach_adpay_bal;
		this.cost_gain_stot = cost_gain_stot;
		this.rcpay_amt_stot = rcpay_amt_stot;
		this.sum_cost_gain_stot = sum_cost_gain_stot;
		this.sum_rcpay_amt_stot = sum_rcpay_amt_stot;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.mtry_dt = mtry_dt;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public void setCctr_amt(String cctr_amt){
		this.cctr_amt = cctr_amt;
	}

	public void setCctr_rmks(String cctr_rmks){
		this.cctr_rmks = cctr_rmks;
	}

	public void setNomach_adpay_bal(String nomach_adpay_bal){
		this.nomach_adpay_bal = nomach_adpay_bal;
	}

	public void setCost_gain_stot(String cost_gain_stot){
		this.cost_gain_stot = cost_gain_stot;
	}

	public void setRcpay_amt_stot(String rcpay_amt_stot){
		this.rcpay_amt_stot = rcpay_amt_stot;
	}

	public void setSum_cost_gain_stot(String sum_cost_gain_stot){
		this.sum_cost_gain_stot = sum_cost_gain_stot;
	}

	public void setSum_rcpay_amt_stot(String sum_rcpay_amt_stot){
		this.sum_rcpay_amt_stot = sum_rcpay_amt_stot;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getCctr_amt(){
		return this.cctr_amt;
	}

	public String getCctr_rmks(){
		return this.cctr_rmks;
	}

	public String getNomach_adpay_bal(){
		return this.nomach_adpay_bal;
	}

	public String getCost_gain_stot(){
		return this.cost_gain_stot;
	}

	public String getRcpay_amt_stot(){
		return this.rcpay_amt_stot;
	}

	public String getSum_cost_gain_stot(){
		return this.sum_cost_gain_stot;
	}

	public String getSum_rcpay_amt_stot(){
		return this.sum_rcpay_amt_stot;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_5012_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_5012_IDM dm = (FC_FUNC_5012_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.insr_clsf_cd);
		cstmt.setString(5, dm.insr_no);
		cstmt.setString(6, dm.comp_dt);
		cstmt.setString(7, dm.cctr_dt);
		cstmt.setString(8, dm.cctr_amt);
		cstmt.setString(9, dm.cctr_rmks);
		cstmt.setString(10, dm.nomach_adpay_bal);
		cstmt.setString(11, dm.cost_gain_stot);
		cstmt.setString(12, dm.rcpay_amt_stot);
		cstmt.setString(13, dm.sum_cost_gain_stot);
		cstmt.setString(14, dm.sum_rcpay_amt_stot);
		cstmt.setString(15, dm.incmg_pers);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.dlco_clsf_cd);
		cstmt.setString(18, dm.dlco_cd);
		cstmt.setString(19, dm.dlco_nm);
		cstmt.setString(20, dm.medi_cd);
		cstmt.setString(21, dm.dtls_medi_cd);
		cstmt.setString(22, dm.mtry_dt);
		cstmt.setString(23, dm.use_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_5012_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("insr_clsf_cd = [" + getInsr_clsf_cd() + "]");
		System.out.println("insr_no = [" + getInsr_no() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("cctr_dt = [" + getCctr_dt() + "]");
		System.out.println("cctr_amt = [" + getCctr_amt() + "]");
		System.out.println("cctr_rmks = [" + getCctr_rmks() + "]");
		System.out.println("nomach_adpay_bal = [" + getNomach_adpay_bal() + "]");
		System.out.println("cost_gain_stot = [" + getCost_gain_stot() + "]");
		System.out.println("rcpay_amt_stot = [" + getRcpay_amt_stot() + "]");
		System.out.println("sum_cost_gain_stot = [" + getSum_cost_gain_stot() + "]");
		System.out.println("sum_rcpay_amt_stot = [" + getSum_rcpay_amt_stot() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
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
String cctr_dt = req.getParameter("cctr_dt");
if( cctr_dt == null){
	System.out.println(this.toString+" : cctr_dt is null" );
}else{
	System.out.println(this.toString+" : cctr_dt is "+cctr_dt );
}
String cctr_amt = req.getParameter("cctr_amt");
if( cctr_amt == null){
	System.out.println(this.toString+" : cctr_amt is null" );
}else{
	System.out.println(this.toString+" : cctr_amt is "+cctr_amt );
}
String cctr_rmks = req.getParameter("cctr_rmks");
if( cctr_rmks == null){
	System.out.println(this.toString+" : cctr_rmks is null" );
}else{
	System.out.println(this.toString+" : cctr_rmks is "+cctr_rmks );
}
String nomach_adpay_bal = req.getParameter("nomach_adpay_bal");
if( nomach_adpay_bal == null){
	System.out.println(this.toString+" : nomach_adpay_bal is null" );
}else{
	System.out.println(this.toString+" : nomach_adpay_bal is "+nomach_adpay_bal );
}
String cost_gain_stot = req.getParameter("cost_gain_stot");
if( cost_gain_stot == null){
	System.out.println(this.toString+" : cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : cost_gain_stot is "+cost_gain_stot );
}
String rcpay_amt_stot = req.getParameter("rcpay_amt_stot");
if( rcpay_amt_stot == null){
	System.out.println(this.toString+" : rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt_stot is "+rcpay_amt_stot );
}
String sum_cost_gain_stot = req.getParameter("sum_cost_gain_stot");
if( sum_cost_gain_stot == null){
	System.out.println(this.toString+" : sum_cost_gain_stot is null" );
}else{
	System.out.println(this.toString+" : sum_cost_gain_stot is "+sum_cost_gain_stot );
}
String sum_rcpay_amt_stot = req.getParameter("sum_rcpay_amt_stot");
if( sum_rcpay_amt_stot == null){
	System.out.println(this.toString+" : sum_rcpay_amt_stot is null" );
}else{
	System.out.println(this.toString+" : sum_rcpay_amt_stot is "+sum_rcpay_amt_stot );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String insr_clsf_cd = Util.checkString(req.getParameter("insr_clsf_cd"));
String insr_no = Util.checkString(req.getParameter("insr_no"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String cctr_dt = Util.checkString(req.getParameter("cctr_dt"));
String cctr_amt = Util.checkString(req.getParameter("cctr_amt"));
String cctr_rmks = Util.checkString(req.getParameter("cctr_rmks"));
String nomach_adpay_bal = Util.checkString(req.getParameter("nomach_adpay_bal"));
String cost_gain_stot = Util.checkString(req.getParameter("cost_gain_stot"));
String rcpay_amt_stot = Util.checkString(req.getParameter("rcpay_amt_stot"));
String sum_cost_gain_stot = Util.checkString(req.getParameter("sum_cost_gain_stot"));
String sum_rcpay_amt_stot = Util.checkString(req.getParameter("sum_rcpay_amt_stot"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String insr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_clsf_cd")));
String insr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_no")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String cctr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cctr_dt")));
String cctr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("cctr_amt")));
String cctr_rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("cctr_rmks")));
String nomach_adpay_bal = Util.Uni2Ksc(Util.checkString(req.getParameter("nomach_adpay_bal")));
String cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_gain_stot")));
String rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt_stot")));
String sum_cost_gain_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_cost_gain_stot")));
String sum_rcpay_amt_stot = Util.Uni2Ksc(Util.checkString(req.getParameter("sum_rcpay_amt_stot")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInsr_clsf_cd(insr_clsf_cd);
dm.setInsr_no(insr_no);
dm.setComp_dt(comp_dt);
dm.setCctr_dt(cctr_dt);
dm.setCctr_amt(cctr_amt);
dm.setCctr_rmks(cctr_rmks);
dm.setNomach_adpay_bal(nomach_adpay_bal);
dm.setCost_gain_stot(cost_gain_stot);
dm.setRcpay_amt_stot(rcpay_amt_stot);
dm.setSum_cost_gain_stot(sum_cost_gain_stot);
dm.setSum_rcpay_amt_stot(sum_rcpay_amt_stot);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setMtry_dt(mtry_dt);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 19:51:56 KST 2009 */