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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1703_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String srch_flnm;
	public String srch_emp_no;
	public String srch_use_fr_aplc_dt;
	public String srch_use_to_aplc_dt;
	public String srch_scl_exps_pay_yy;
	public String srch_scl_exps_pay_qq;
	public String srch_scl_exps_clsf;
	public String srch_scl_exps_pay_plac_clsf;
	public String srch_proc_stat;
	public String actu_slip_no;
	public String ss_emp_no;

	public HD_AFFR_1703_LDM(){}
	public HD_AFFR_1703_LDM(String cmpy_cd, String srch_flnm, String srch_emp_no, String srch_use_fr_aplc_dt, String srch_use_to_aplc_dt, String srch_scl_exps_pay_yy, String srch_scl_exps_pay_qq, String srch_scl_exps_clsf, String srch_scl_exps_pay_plac_clsf, String srch_proc_stat, String actu_slip_no, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.srch_flnm = srch_flnm;
		this.srch_emp_no = srch_emp_no;
		this.srch_use_fr_aplc_dt = srch_use_fr_aplc_dt;
		this.srch_use_to_aplc_dt = srch_use_to_aplc_dt;
		this.srch_scl_exps_pay_yy = srch_scl_exps_pay_yy;
		this.srch_scl_exps_pay_qq = srch_scl_exps_pay_qq;
		this.srch_scl_exps_clsf = srch_scl_exps_clsf;
		this.srch_scl_exps_pay_plac_clsf = srch_scl_exps_pay_plac_clsf;
		this.srch_proc_stat = srch_proc_stat;
		this.actu_slip_no = actu_slip_no;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSrch_flnm(String srch_flnm){
		this.srch_flnm = srch_flnm;
	}

	public void setSrch_emp_no(String srch_emp_no){
		this.srch_emp_no = srch_emp_no;
	}

	public void setSrch_use_fr_aplc_dt(String srch_use_fr_aplc_dt){
		this.srch_use_fr_aplc_dt = srch_use_fr_aplc_dt;
	}

	public void setSrch_use_to_aplc_dt(String srch_use_to_aplc_dt){
		this.srch_use_to_aplc_dt = srch_use_to_aplc_dt;
	}

	public void setSrch_scl_exps_pay_yy(String srch_scl_exps_pay_yy){
		this.srch_scl_exps_pay_yy = srch_scl_exps_pay_yy;
	}

	public void setSrch_scl_exps_pay_qq(String srch_scl_exps_pay_qq){
		this.srch_scl_exps_pay_qq = srch_scl_exps_pay_qq;
	}

	public void setSrch_scl_exps_clsf(String srch_scl_exps_clsf){
		this.srch_scl_exps_clsf = srch_scl_exps_clsf;
	}

	public void setSrch_scl_exps_pay_plac_clsf(String srch_scl_exps_pay_plac_clsf){
		this.srch_scl_exps_pay_plac_clsf = srch_scl_exps_pay_plac_clsf;
	}

	public void setSrch_proc_stat(String srch_proc_stat){
		this.srch_proc_stat = srch_proc_stat;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSrch_flnm(){
		return this.srch_flnm;
	}

	public String getSrch_emp_no(){
		return this.srch_emp_no;
	}

	public String getSrch_use_fr_aplc_dt(){
		return this.srch_use_fr_aplc_dt;
	}

	public String getSrch_use_to_aplc_dt(){
		return this.srch_use_to_aplc_dt;
	}

	public String getSrch_scl_exps_pay_yy(){
		return this.srch_scl_exps_pay_yy;
	}

	public String getSrch_scl_exps_pay_qq(){
		return this.srch_scl_exps_pay_qq;
	}

	public String getSrch_scl_exps_clsf(){
		return this.srch_scl_exps_clsf;
	}

	public String getSrch_scl_exps_pay_plac_clsf(){
		return this.srch_scl_exps_pay_plac_clsf;
	}

	public String getSrch_proc_stat(){
		return this.srch_proc_stat;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_1703_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_1703_LDM dm = (HD_AFFR_1703_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.srch_flnm);
		cstmt.setString(5, dm.srch_emp_no);
		cstmt.setString(6, dm.srch_use_fr_aplc_dt);
		cstmt.setString(7, dm.srch_use_to_aplc_dt);
		cstmt.setString(8, dm.srch_scl_exps_pay_yy);
		cstmt.setString(9, dm.srch_scl_exps_pay_qq);
		cstmt.setString(10, dm.srch_scl_exps_clsf);
		cstmt.setString(11, dm.srch_scl_exps_pay_plac_clsf);
		cstmt.setString(12, dm.srch_proc_stat);
		cstmt.setString(13, dm.actu_slip_no);
		cstmt.setString(14, dm.ss_emp_no);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_1703_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("srch_flnm = [" + getSrch_flnm() + "]");
		System.out.println("srch_emp_no = [" + getSrch_emp_no() + "]");
		System.out.println("srch_use_fr_aplc_dt = [" + getSrch_use_fr_aplc_dt() + "]");
		System.out.println("srch_use_to_aplc_dt = [" + getSrch_use_to_aplc_dt() + "]");
		System.out.println("srch_scl_exps_pay_yy = [" + getSrch_scl_exps_pay_yy() + "]");
		System.out.println("srch_scl_exps_pay_qq = [" + getSrch_scl_exps_pay_qq() + "]");
		System.out.println("srch_scl_exps_clsf = [" + getSrch_scl_exps_clsf() + "]");
		System.out.println("srch_scl_exps_pay_plac_clsf = [" + getSrch_scl_exps_pay_plac_clsf() + "]");
		System.out.println("srch_proc_stat = [" + getSrch_proc_stat() + "]");
		System.out.println("actu_slip_no = [" + getActu_slip_no() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
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
String srch_flnm = req.getParameter("srch_flnm");
if( srch_flnm == null){
	System.out.println(this.toString+" : srch_flnm is null" );
}else{
	System.out.println(this.toString+" : srch_flnm is "+srch_flnm );
}
String srch_emp_no = req.getParameter("srch_emp_no");
if( srch_emp_no == null){
	System.out.println(this.toString+" : srch_emp_no is null" );
}else{
	System.out.println(this.toString+" : srch_emp_no is "+srch_emp_no );
}
String srch_use_fr_aplc_dt = req.getParameter("srch_use_fr_aplc_dt");
if( srch_use_fr_aplc_dt == null){
	System.out.println(this.toString+" : srch_use_fr_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : srch_use_fr_aplc_dt is "+srch_use_fr_aplc_dt );
}
String srch_use_to_aplc_dt = req.getParameter("srch_use_to_aplc_dt");
if( srch_use_to_aplc_dt == null){
	System.out.println(this.toString+" : srch_use_to_aplc_dt is null" );
}else{
	System.out.println(this.toString+" : srch_use_to_aplc_dt is "+srch_use_to_aplc_dt );
}
String srch_scl_exps_pay_yy = req.getParameter("srch_scl_exps_pay_yy");
if( srch_scl_exps_pay_yy == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_yy is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_yy is "+srch_scl_exps_pay_yy );
}
String srch_scl_exps_pay_qq = req.getParameter("srch_scl_exps_pay_qq");
if( srch_scl_exps_pay_qq == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_qq is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_qq is "+srch_scl_exps_pay_qq );
}
String srch_scl_exps_clsf = req.getParameter("srch_scl_exps_clsf");
if( srch_scl_exps_clsf == null){
	System.out.println(this.toString+" : srch_scl_exps_clsf is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_clsf is "+srch_scl_exps_clsf );
}
String srch_scl_exps_pay_plac_clsf = req.getParameter("srch_scl_exps_pay_plac_clsf");
if( srch_scl_exps_pay_plac_clsf == null){
	System.out.println(this.toString+" : srch_scl_exps_pay_plac_clsf is null" );
}else{
	System.out.println(this.toString+" : srch_scl_exps_pay_plac_clsf is "+srch_scl_exps_pay_plac_clsf );
}
String srch_proc_stat = req.getParameter("srch_proc_stat");
if( srch_proc_stat == null){
	System.out.println(this.toString+" : srch_proc_stat is null" );
}else{
	System.out.println(this.toString+" : srch_proc_stat is "+srch_proc_stat );
}
String actu_slip_no = req.getParameter("actu_slip_no");
if( actu_slip_no == null){
	System.out.println(this.toString+" : actu_slip_no is null" );
}else{
	System.out.println(this.toString+" : actu_slip_no is "+actu_slip_no );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String srch_flnm = Util.checkString(req.getParameter("srch_flnm"));
String srch_emp_no = Util.checkString(req.getParameter("srch_emp_no"));
String srch_use_fr_aplc_dt = Util.checkString(req.getParameter("srch_use_fr_aplc_dt"));
String srch_use_to_aplc_dt = Util.checkString(req.getParameter("srch_use_to_aplc_dt"));
String srch_scl_exps_pay_yy = Util.checkString(req.getParameter("srch_scl_exps_pay_yy"));
String srch_scl_exps_pay_qq = Util.checkString(req.getParameter("srch_scl_exps_pay_qq"));
String srch_scl_exps_clsf = Util.checkString(req.getParameter("srch_scl_exps_clsf"));
String srch_scl_exps_pay_plac_clsf = Util.checkString(req.getParameter("srch_scl_exps_pay_plac_clsf"));
String srch_proc_stat = Util.checkString(req.getParameter("srch_proc_stat"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String srch_flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_flnm")));
String srch_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_emp_no")));
String srch_use_fr_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_use_fr_aplc_dt")));
String srch_use_to_aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_use_to_aplc_dt")));
String srch_scl_exps_pay_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_yy")));
String srch_scl_exps_pay_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_qq")));
String srch_scl_exps_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_clsf")));
String srch_scl_exps_pay_plac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_scl_exps_pay_plac_clsf")));
String srch_proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_proc_stat")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSrch_flnm(srch_flnm);
dm.setSrch_emp_no(srch_emp_no);
dm.setSrch_use_fr_aplc_dt(srch_use_fr_aplc_dt);
dm.setSrch_use_to_aplc_dt(srch_use_to_aplc_dt);
dm.setSrch_scl_exps_pay_yy(srch_scl_exps_pay_yy);
dm.setSrch_scl_exps_pay_qq(srch_scl_exps_pay_qq);
dm.setSrch_scl_exps_clsf(srch_scl_exps_clsf);
dm.setSrch_scl_exps_pay_plac_clsf(srch_scl_exps_pay_plac_clsf);
dm.setSrch_proc_stat(srch_proc_stat);
dm.setActu_slip_no(actu_slip_no);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 07 19:19:48 KST 2012 */