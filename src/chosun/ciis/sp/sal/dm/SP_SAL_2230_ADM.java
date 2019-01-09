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


package chosun.ciis.sp.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.sp.sal.ds.*;
import chosun.ciis.sp.sal.rec.*;

/**
 * 
 */


public class SP_SAL_2230_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String work_yymm;
	public String purc_adjm_clsf;
	public String reg_clsf;
	public String rcpm_dt;
	public String c_dlco_no;
	public String b_dlco_no;
	public String amt;
	public String rdr_nm;
	public String rdr_addr;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SP_SAL_2230_ADM(){}
	public SP_SAL_2230_ADM(String cmpy_cd, String work_yymm, String purc_adjm_clsf, String reg_clsf, String rcpm_dt, String c_dlco_no, String b_dlco_no, String amt, String rdr_nm, String rdr_addr, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.work_yymm = work_yymm;
		this.purc_adjm_clsf = purc_adjm_clsf;
		this.reg_clsf = reg_clsf;
		this.rcpm_dt = rcpm_dt;
		this.c_dlco_no = c_dlco_no;
		this.b_dlco_no = b_dlco_no;
		this.amt = amt;
		this.rdr_nm = rdr_nm;
		this.rdr_addr = rdr_addr;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setWork_yymm(String work_yymm){
		this.work_yymm = work_yymm;
	}

	public void setPurc_adjm_clsf(String purc_adjm_clsf){
		this.purc_adjm_clsf = purc_adjm_clsf;
	}

	public void setReg_clsf(String reg_clsf){
		this.reg_clsf = reg_clsf;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setC_dlco_no(String c_dlco_no){
		this.c_dlco_no = c_dlco_no;
	}

	public void setB_dlco_no(String b_dlco_no){
		this.b_dlco_no = b_dlco_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setRdr_addr(String rdr_addr){
		this.rdr_addr = rdr_addr;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getWork_yymm(){
		return this.work_yymm;
	}

	public String getPurc_adjm_clsf(){
		return this.purc_adjm_clsf;
	}

	public String getReg_clsf(){
		return this.reg_clsf;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getC_dlco_no(){
		return this.c_dlco_no;
	}

	public String getB_dlco_no(){
		return this.b_dlco_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getRdr_addr(){
		return this.rdr_addr;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_SP_SAL_2230_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SP_SAL_2230_ADM dm = (SP_SAL_2230_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.work_yymm);
		cstmt.setString(5, dm.purc_adjm_clsf);
		cstmt.setString(6, dm.reg_clsf);
		cstmt.setString(7, dm.rcpm_dt);
		cstmt.setString(8, dm.c_dlco_no);
		cstmt.setString(9, dm.b_dlco_no);
		cstmt.setString(10, dm.amt);
		cstmt.setString(11, dm.rdr_nm);
		cstmt.setString(12, dm.rdr_addr);
		cstmt.setString(13, dm.incmg_pers_ip);
		cstmt.setString(14, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.sp.sal.ds.SP_SAL_2230_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("work_yymm = [" + getWork_yymm() + "]");
		System.out.println("purc_adjm_clsf = [" + getPurc_adjm_clsf() + "]");
		System.out.println("reg_clsf = [" + getReg_clsf() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("c_dlco_no = [" + getC_dlco_no() + "]");
		System.out.println("b_dlco_no = [" + getB_dlco_no() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("rdr_nm = [" + getRdr_nm() + "]");
		System.out.println("rdr_addr = [" + getRdr_addr() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String work_yymm = req.getParameter("work_yymm");
if( work_yymm == null){
	System.out.println(this.toString+" : work_yymm is null" );
}else{
	System.out.println(this.toString+" : work_yymm is "+work_yymm );
}
String purc_adjm_clsf = req.getParameter("purc_adjm_clsf");
if( purc_adjm_clsf == null){
	System.out.println(this.toString+" : purc_adjm_clsf is null" );
}else{
	System.out.println(this.toString+" : purc_adjm_clsf is "+purc_adjm_clsf );
}
String reg_clsf = req.getParameter("reg_clsf");
if( reg_clsf == null){
	System.out.println(this.toString+" : reg_clsf is null" );
}else{
	System.out.println(this.toString+" : reg_clsf is "+reg_clsf );
}
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String c_dlco_no = req.getParameter("c_dlco_no");
if( c_dlco_no == null){
	System.out.println(this.toString+" : c_dlco_no is null" );
}else{
	System.out.println(this.toString+" : c_dlco_no is "+c_dlco_no );
}
String b_dlco_no = req.getParameter("b_dlco_no");
if( b_dlco_no == null){
	System.out.println(this.toString+" : b_dlco_no is null" );
}else{
	System.out.println(this.toString+" : b_dlco_no is "+b_dlco_no );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String rdr_nm = req.getParameter("rdr_nm");
if( rdr_nm == null){
	System.out.println(this.toString+" : rdr_nm is null" );
}else{
	System.out.println(this.toString+" : rdr_nm is "+rdr_nm );
}
String rdr_addr = req.getParameter("rdr_addr");
if( rdr_addr == null){
	System.out.println(this.toString+" : rdr_addr is null" );
}else{
	System.out.println(this.toString+" : rdr_addr is "+rdr_addr );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String work_yymm = Util.checkString(req.getParameter("work_yymm"));
String purc_adjm_clsf = Util.checkString(req.getParameter("purc_adjm_clsf"));
String reg_clsf = Util.checkString(req.getParameter("reg_clsf"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String c_dlco_no = Util.checkString(req.getParameter("c_dlco_no"));
String b_dlco_no = Util.checkString(req.getParameter("b_dlco_no"));
String amt = Util.checkString(req.getParameter("amt"));
String rdr_nm = Util.checkString(req.getParameter("rdr_nm"));
String rdr_addr = Util.checkString(req.getParameter("rdr_addr"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String work_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yymm")));
String purc_adjm_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_adjm_clsf")));
String reg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_clsf")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String c_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("c_dlco_no")));
String b_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("b_dlco_no")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String rdr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_nm")));
String rdr_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_addr")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setWork_yymm(work_yymm);
dm.setPurc_adjm_clsf(purc_adjm_clsf);
dm.setReg_clsf(reg_clsf);
dm.setRcpm_dt(rcpm_dt);
dm.setC_dlco_no(c_dlco_no);
dm.setB_dlco_no(b_dlco_no);
dm.setAmt(amt);
dm.setRdr_nm(rdr_nm);
dm.setRdr_addr(rdr_addr);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 09 15:06:50 KST 2012 */