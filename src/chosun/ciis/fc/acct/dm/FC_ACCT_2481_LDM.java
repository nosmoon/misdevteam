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


public class FC_ACCT_2481_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frbudg_cd;
	public String tobudg_cd;
	public String frfisc_dt;
	public String tofisc_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String medi_cd;
	public String dtls_medi_cd;
	public String mang_clsf_cd;
	public String to_mang_clsf_cd;
	public String evnt_cd;
	public String clam_dept_cd;
	public String to_clam_dept_cd;
	public String use_dept_cd;
	public String to_use_dept_cd;
	public String slip_clsf_cd;
	public String dr_amt;
	public String crdt_amt;
	public String incmg_emp_no;
	public String drcr_clsf1;
	public String drcr_clsf2;
	public String remk;
	public String incm_clsf_cd;
	public String chnl_clsf_cd;
	public String slip_aprv_yn;
	public String prop_equip_cd;

	public FC_ACCT_2481_LDM(){}
	public FC_ACCT_2481_LDM(String cmpy_cd, String frbudg_cd, String tobudg_cd, String frfisc_dt, String tofisc_dt, String dlco_clsf_cd, String dlco_cd, String medi_cd, String dtls_medi_cd, String mang_clsf_cd, String to_mang_clsf_cd, String evnt_cd, String clam_dept_cd, String to_clam_dept_cd, String use_dept_cd, String to_use_dept_cd, String slip_clsf_cd, String dr_amt, String crdt_amt, String incmg_emp_no, String drcr_clsf1, String drcr_clsf2, String remk, String incm_clsf_cd, String chnl_clsf_cd, String slip_aprv_yn, String prop_equip_cd){
		this.cmpy_cd = cmpy_cd;
		this.frbudg_cd = frbudg_cd;
		this.tobudg_cd = tobudg_cd;
		this.frfisc_dt = frfisc_dt;
		this.tofisc_dt = tofisc_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.mang_clsf_cd = mang_clsf_cd;
		this.to_mang_clsf_cd = to_mang_clsf_cd;
		this.evnt_cd = evnt_cd;
		this.clam_dept_cd = clam_dept_cd;
		this.to_clam_dept_cd = to_clam_dept_cd;
		this.use_dept_cd = use_dept_cd;
		this.to_use_dept_cd = to_use_dept_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.dr_amt = dr_amt;
		this.crdt_amt = crdt_amt;
		this.incmg_emp_no = incmg_emp_no;
		this.drcr_clsf1 = drcr_clsf1;
		this.drcr_clsf2 = drcr_clsf2;
		this.remk = remk;
		this.incm_clsf_cd = incm_clsf_cd;
		this.chnl_clsf_cd = chnl_clsf_cd;
		this.slip_aprv_yn = slip_aprv_yn;
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrbudg_cd(String frbudg_cd){
		this.frbudg_cd = frbudg_cd;
	}

	public void setTobudg_cd(String tobudg_cd){
		this.tobudg_cd = tobudg_cd;
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

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setTo_mang_clsf_cd(String to_mang_clsf_cd){
		this.to_mang_clsf_cd = to_mang_clsf_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setTo_clam_dept_cd(String to_clam_dept_cd){
		this.to_clam_dept_cd = to_clam_dept_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setTo_use_dept_cd(String to_use_dept_cd){
		this.to_use_dept_cd = to_use_dept_cd;
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

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setDrcr_clsf1(String drcr_clsf1){
		this.drcr_clsf1 = drcr_clsf1;
	}

	public void setDrcr_clsf2(String drcr_clsf2){
		this.drcr_clsf2 = drcr_clsf2;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrbudg_cd(){
		return this.frbudg_cd;
	}

	public String getTobudg_cd(){
		return this.tobudg_cd;
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

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getTo_mang_clsf_cd(){
		return this.to_mang_clsf_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getTo_clam_dept_cd(){
		return this.to_clam_dept_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getTo_use_dept_cd(){
		return this.to_use_dept_cd;
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

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getDrcr_clsf1(){
		return this.drcr_clsf1;
	}

	public String getDrcr_clsf2(){
		return this.drcr_clsf2;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2481_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2481_LDM dm = (FC_ACCT_2481_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frbudg_cd);
		cstmt.setString(5, dm.tobudg_cd);
		cstmt.setString(6, dm.frfisc_dt);
		cstmt.setString(7, dm.tofisc_dt);
		cstmt.setString(8, dm.dlco_clsf_cd);
		cstmt.setString(9, dm.dlco_cd);
		cstmt.setString(10, dm.medi_cd);
		cstmt.setString(11, dm.dtls_medi_cd);
		cstmt.setString(12, dm.mang_clsf_cd);
		cstmt.setString(13, dm.to_mang_clsf_cd);
		cstmt.setString(14, dm.evnt_cd);
		cstmt.setString(15, dm.clam_dept_cd);
		cstmt.setString(16, dm.to_clam_dept_cd);
		cstmt.setString(17, dm.use_dept_cd);
		cstmt.setString(18, dm.to_use_dept_cd);
		cstmt.setString(19, dm.slip_clsf_cd);
		cstmt.setString(20, dm.dr_amt);
		cstmt.setString(21, dm.crdt_amt);
		cstmt.setString(22, dm.incmg_emp_no);
		cstmt.setString(23, dm.drcr_clsf1);
		cstmt.setString(24, dm.drcr_clsf2);
		cstmt.setString(25, dm.remk);
		cstmt.setString(26, dm.incm_clsf_cd);
		cstmt.setString(27, dm.chnl_clsf_cd);
		cstmt.setString(28, dm.slip_aprv_yn);
		cstmt.setString(29, dm.prop_equip_cd);
		cstmt.registerOutParameter(30, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2481_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frbudg_cd = [" + getFrbudg_cd() + "]");
		System.out.println("tobudg_cd = [" + getTobudg_cd() + "]");
		System.out.println("frfisc_dt = [" + getFrfisc_dt() + "]");
		System.out.println("tofisc_dt = [" + getTofisc_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("to_mang_clsf_cd = [" + getTo_mang_clsf_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("to_clam_dept_cd = [" + getTo_clam_dept_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("to_use_dept_cd = [" + getTo_use_dept_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("crdt_amt = [" + getCrdt_amt() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("drcr_clsf1 = [" + getDrcr_clsf1() + "]");
		System.out.println("drcr_clsf2 = [" + getDrcr_clsf2() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
		System.out.println("slip_aprv_yn = [" + getSlip_aprv_yn() + "]");
		System.out.println("prop_equip_cd = [" + getProp_equip_cd() + "]");
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
String frbudg_cd = req.getParameter("frbudg_cd");
if( frbudg_cd == null){
	System.out.println(this.toString+" : frbudg_cd is null" );
}else{
	System.out.println(this.toString+" : frbudg_cd is "+frbudg_cd );
}
String tobudg_cd = req.getParameter("tobudg_cd");
if( tobudg_cd == null){
	System.out.println(this.toString+" : tobudg_cd is null" );
}else{
	System.out.println(this.toString+" : tobudg_cd is "+tobudg_cd );
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
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String to_mang_clsf_cd = req.getParameter("to_mang_clsf_cd");
if( to_mang_clsf_cd == null){
	System.out.println(this.toString+" : to_mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : to_mang_clsf_cd is "+to_mang_clsf_cd );
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
String to_clam_dept_cd = req.getParameter("to_clam_dept_cd");
if( to_clam_dept_cd == null){
	System.out.println(this.toString+" : to_clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : to_clam_dept_cd is "+to_clam_dept_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String to_use_dept_cd = req.getParameter("to_use_dept_cd");
if( to_use_dept_cd == null){
	System.out.println(this.toString+" : to_use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : to_use_dept_cd is "+to_use_dept_cd );
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
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
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
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
String slip_aprv_yn = req.getParameter("slip_aprv_yn");
if( slip_aprv_yn == null){
	System.out.println(this.toString+" : slip_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : slip_aprv_yn is "+slip_aprv_yn );
}
String prop_equip_cd = req.getParameter("prop_equip_cd");
if( prop_equip_cd == null){
	System.out.println(this.toString+" : prop_equip_cd is null" );
}else{
	System.out.println(this.toString+" : prop_equip_cd is "+prop_equip_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frbudg_cd = Util.checkString(req.getParameter("frbudg_cd"));
String tobudg_cd = Util.checkString(req.getParameter("tobudg_cd"));
String frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
String tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String to_mang_clsf_cd = Util.checkString(req.getParameter("to_mang_clsf_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String to_clam_dept_cd = Util.checkString(req.getParameter("to_clam_dept_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String to_use_dept_cd = Util.checkString(req.getParameter("to_use_dept_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String drcr_clsf1 = Util.checkString(req.getParameter("drcr_clsf1"));
String drcr_clsf2 = Util.checkString(req.getParameter("drcr_clsf2"));
String remk = Util.checkString(req.getParameter("remk"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
String slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
String prop_equip_cd = Util.checkString(req.getParameter("prop_equip_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frbudg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frbudg_cd")));
String tobudg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tobudg_cd")));
String frfisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("frfisc_dt")));
String tofisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tofisc_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String to_mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_mang_clsf_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String to_clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_clam_dept_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String to_use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_use_dept_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String drcr_clsf1 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf1")));
String drcr_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf2")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
String slip_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_aprv_yn")));
String prop_equip_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prop_equip_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrbudg_cd(frbudg_cd);
dm.setTobudg_cd(tobudg_cd);
dm.setFrfisc_dt(frfisc_dt);
dm.setTofisc_dt(tofisc_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setTo_mang_clsf_cd(to_mang_clsf_cd);
dm.setEvnt_cd(evnt_cd);
dm.setClam_dept_cd(clam_dept_cd);
dm.setTo_clam_dept_cd(to_clam_dept_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setTo_use_dept_cd(to_use_dept_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setDr_amt(dr_amt);
dm.setCrdt_amt(crdt_amt);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setDrcr_clsf1(drcr_clsf1);
dm.setDrcr_clsf2(drcr_clsf2);
dm.setRemk(remk);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setChnl_clsf_cd(chnl_clsf_cd);
dm.setSlip_aprv_yn(slip_aprv_yn);
dm.setProp_equip_cd(prop_equip_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 24 17:55:47 KST 2017 */