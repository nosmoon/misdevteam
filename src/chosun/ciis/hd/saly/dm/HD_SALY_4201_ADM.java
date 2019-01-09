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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_4201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String adv_clsf;
	public String adv_dt;
	public String flnm;
	public String mtry_months;
	public String adv_prcp;
	public String mm_pymt_prcp;
	public String pymt_acml_tms;
	public String rmn_amt;
	public String end_yn;
	public String end_dt;
	public String u_ipadd;
	public String u_id;

	public HD_SALY_4201_ADM(){}
	public HD_SALY_4201_ADM(String mode, String cmpy_cd, String emp_no, String adv_clsf, String adv_dt, String flnm, String mtry_months, String adv_prcp, String mm_pymt_prcp, String pymt_acml_tms, String rmn_amt, String end_yn, String end_dt, String u_ipadd, String u_id){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.adv_clsf = adv_clsf;
		this.adv_dt = adv_dt;
		this.flnm = flnm;
		this.mtry_months = mtry_months;
		this.adv_prcp = adv_prcp;
		this.mm_pymt_prcp = mm_pymt_prcp;
		this.pymt_acml_tms = pymt_acml_tms;
		this.rmn_amt = rmn_amt;
		this.end_yn = end_yn;
		this.end_dt = end_dt;
		this.u_ipadd = u_ipadd;
		this.u_id = u_id;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setAdv_clsf(String adv_clsf){
		this.adv_clsf = adv_clsf;
	}

	public void setAdv_dt(String adv_dt){
		this.adv_dt = adv_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMtry_months(String mtry_months){
		this.mtry_months = mtry_months;
	}

	public void setAdv_prcp(String adv_prcp){
		this.adv_prcp = adv_prcp;
	}

	public void setMm_pymt_prcp(String mm_pymt_prcp){
		this.mm_pymt_prcp = mm_pymt_prcp;
	}

	public void setPymt_acml_tms(String pymt_acml_tms){
		this.pymt_acml_tms = pymt_acml_tms;
	}

	public void setRmn_amt(String rmn_amt){
		this.rmn_amt = rmn_amt;
	}

	public void setEnd_yn(String end_yn){
		this.end_yn = end_yn;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public void setU_ipadd(String u_ipadd){
		this.u_ipadd = u_ipadd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getAdv_clsf(){
		return this.adv_clsf;
	}

	public String getAdv_dt(){
		return this.adv_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMtry_months(){
		return this.mtry_months;
	}

	public String getAdv_prcp(){
		return this.adv_prcp;
	}

	public String getMm_pymt_prcp(){
		return this.mm_pymt_prcp;
	}

	public String getPymt_acml_tms(){
		return this.pymt_acml_tms;
	}

	public String getRmn_amt(){
		return this.rmn_amt;
	}

	public String getEnd_yn(){
		return this.end_yn;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}

	public String getU_ipadd(){
		return this.u_ipadd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_4201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_4201_ADM dm = (HD_SALY_4201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.adv_clsf);
		cstmt.setString(7, dm.adv_dt);
		cstmt.setString(8, dm.flnm);
		cstmt.setString(9, dm.mtry_months);
		cstmt.setString(10, dm.adv_prcp);
		cstmt.setString(11, dm.mm_pymt_prcp);
		cstmt.setString(12, dm.pymt_acml_tms);
		cstmt.setString(13, dm.rmn_amt);
		cstmt.setString(14, dm.end_yn);
		cstmt.setString(15, dm.end_dt);
		cstmt.setString(16, dm.u_ipadd);
		cstmt.setString(17, dm.u_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_4201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("adv_clsf = [" + getAdv_clsf() + "]");
		System.out.println("adv_dt = [" + getAdv_dt() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("mtry_months = [" + getMtry_months() + "]");
		System.out.println("adv_prcp = [" + getAdv_prcp() + "]");
		System.out.println("mm_pymt_prcp = [" + getMm_pymt_prcp() + "]");
		System.out.println("pymt_acml_tms = [" + getPymt_acml_tms() + "]");
		System.out.println("rmn_amt = [" + getRmn_amt() + "]");
		System.out.println("end_yn = [" + getEnd_yn() + "]");
		System.out.println("end_dt = [" + getEnd_dt() + "]");
		System.out.println("u_ipadd = [" + getU_ipadd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String adv_clsf = req.getParameter("adv_clsf");
if( adv_clsf == null){
	System.out.println(this.toString+" : adv_clsf is null" );
}else{
	System.out.println(this.toString+" : adv_clsf is "+adv_clsf );
}
String adv_dt = req.getParameter("adv_dt");
if( adv_dt == null){
	System.out.println(this.toString+" : adv_dt is null" );
}else{
	System.out.println(this.toString+" : adv_dt is "+adv_dt );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String mtry_months = req.getParameter("mtry_months");
if( mtry_months == null){
	System.out.println(this.toString+" : mtry_months is null" );
}else{
	System.out.println(this.toString+" : mtry_months is "+mtry_months );
}
String adv_prcp = req.getParameter("adv_prcp");
if( adv_prcp == null){
	System.out.println(this.toString+" : adv_prcp is null" );
}else{
	System.out.println(this.toString+" : adv_prcp is "+adv_prcp );
}
String mm_pymt_prcp = req.getParameter("mm_pymt_prcp");
if( mm_pymt_prcp == null){
	System.out.println(this.toString+" : mm_pymt_prcp is null" );
}else{
	System.out.println(this.toString+" : mm_pymt_prcp is "+mm_pymt_prcp );
}
String pymt_acml_tms = req.getParameter("pymt_acml_tms");
if( pymt_acml_tms == null){
	System.out.println(this.toString+" : pymt_acml_tms is null" );
}else{
	System.out.println(this.toString+" : pymt_acml_tms is "+pymt_acml_tms );
}
String rmn_amt = req.getParameter("rmn_amt");
if( rmn_amt == null){
	System.out.println(this.toString+" : rmn_amt is null" );
}else{
	System.out.println(this.toString+" : rmn_amt is "+rmn_amt );
}
String end_yn = req.getParameter("end_yn");
if( end_yn == null){
	System.out.println(this.toString+" : end_yn is null" );
}else{
	System.out.println(this.toString+" : end_yn is "+end_yn );
}
String end_dt = req.getParameter("end_dt");
if( end_dt == null){
	System.out.println(this.toString+" : end_dt is null" );
}else{
	System.out.println(this.toString+" : end_dt is "+end_dt );
}
String u_ipadd = req.getParameter("u_ipadd");
if( u_ipadd == null){
	System.out.println(this.toString+" : u_ipadd is null" );
}else{
	System.out.println(this.toString+" : u_ipadd is "+u_ipadd );
}
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String adv_clsf = Util.checkString(req.getParameter("adv_clsf"));
String adv_dt = Util.checkString(req.getParameter("adv_dt"));
String flnm = Util.checkString(req.getParameter("flnm"));
String mtry_months = Util.checkString(req.getParameter("mtry_months"));
String adv_prcp = Util.checkString(req.getParameter("adv_prcp"));
String mm_pymt_prcp = Util.checkString(req.getParameter("mm_pymt_prcp"));
String pymt_acml_tms = Util.checkString(req.getParameter("pymt_acml_tms"));
String rmn_amt = Util.checkString(req.getParameter("rmn_amt"));
String end_yn = Util.checkString(req.getParameter("end_yn"));
String end_dt = Util.checkString(req.getParameter("end_dt"));
String u_ipadd = Util.checkString(req.getParameter("u_ipadd"));
String u_id = Util.checkString(req.getParameter("u_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String adv_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_clsf")));
String adv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_dt")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String mtry_months = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_months")));
String adv_prcp = Util.Uni2Ksc(Util.checkString(req.getParameter("adv_prcp")));
String mm_pymt_prcp = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_pymt_prcp")));
String pymt_acml_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("pymt_acml_tms")));
String rmn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rmn_amt")));
String end_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("end_yn")));
String end_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_dt")));
String u_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("u_ipadd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setAdv_clsf(adv_clsf);
dm.setAdv_dt(adv_dt);
dm.setFlnm(flnm);
dm.setMtry_months(mtry_months);
dm.setAdv_prcp(adv_prcp);
dm.setMm_pymt_prcp(mm_pymt_prcp);
dm.setPymt_acml_tms(pymt_acml_tms);
dm.setRmn_amt(rmn_amt);
dm.setEnd_yn(end_yn);
dm.setEnd_dt(end_dt);
dm.setU_ipadd(u_ipadd);
dm.setU_id(u_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 15:40:50 KST 2009 */