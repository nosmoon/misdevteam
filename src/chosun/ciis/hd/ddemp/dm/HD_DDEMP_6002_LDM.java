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


package chosun.ciis.hd.ddemp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.ddemp.ds.*;
import chosun.ciis.hd.ddemp.rec.*;

/**
 * 
 */


public class HD_DDEMP_6002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String supr_dept_cd;
	public String dept_cd;
	public String chrg_posk_cd;
	public String flnm;
	public String medi_cd;
	public String thrw_pgm;
	public String work_yn;
	public String ss_emp_no;
	public String chrg_posk_nm;

	public HD_DDEMP_6002_LDM(){}
	public HD_DDEMP_6002_LDM(String cmpy_cd, String supr_dept_cd, String dept_cd, String chrg_posk_cd, String flnm, String medi_cd, String thrw_pgm, String work_yn, String ss_emp_no, String chrg_posk_nm){
		this.cmpy_cd = cmpy_cd;
		this.supr_dept_cd = supr_dept_cd;
		this.dept_cd = dept_cd;
		this.chrg_posk_cd = chrg_posk_cd;
		this.flnm = flnm;
		this.medi_cd = medi_cd;
		this.thrw_pgm = thrw_pgm;
		this.work_yn = work_yn;
		this.ss_emp_no = ss_emp_no;
		this.chrg_posk_nm = chrg_posk_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setWork_yn(String work_yn){
		this.work_yn = work_yn;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setChrg_posk_nm(String chrg_posk_nm){
		this.chrg_posk_nm = chrg_posk_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getWork_yn(){
		return this.work_yn;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getChrg_posk_nm(){
		return this.chrg_posk_nm;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DDEMP_6002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DDEMP_6002_LDM dm = (HD_DDEMP_6002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.supr_dept_cd);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setString(6, dm.chrg_posk_cd);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.thrw_pgm);
		cstmt.setString(10, dm.work_yn);
		cstmt.setString(11, dm.ss_emp_no);
		cstmt.setString(12, dm.chrg_posk_nm);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.ddemp.ds.HD_DDEMP_6002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("supr_dept_cd = [" + getSupr_dept_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("chrg_posk_cd = [" + getChrg_posk_cd() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("thrw_pgm = [" + getThrw_pgm() + "]");
		System.out.println("work_yn = [" + getWork_yn() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("chrg_posk_nm = [" + getChrg_posk_nm() + "]");
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
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String chrg_posk_cd = req.getParameter("chrg_posk_cd");
if( chrg_posk_cd == null){
	System.out.println(this.toString+" : chrg_posk_cd is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_cd is "+chrg_posk_cd );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String thrw_pgm = req.getParameter("thrw_pgm");
if( thrw_pgm == null){
	System.out.println(this.toString+" : thrw_pgm is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm is "+thrw_pgm );
}
String work_yn = req.getParameter("work_yn");
if( work_yn == null){
	System.out.println(this.toString+" : work_yn is null" );
}else{
	System.out.println(this.toString+" : work_yn is "+work_yn );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
String chrg_posk_nm = req.getParameter("chrg_posk_nm");
if( chrg_posk_nm == null){
	System.out.println(this.toString+" : chrg_posk_nm is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_nm is "+chrg_posk_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
String flnm = Util.checkString(req.getParameter("flnm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
String work_yn = Util.checkString(req.getParameter("work_yn"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String chrg_posk_nm = Util.checkString(req.getParameter("chrg_posk_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String chrg_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_cd")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String thrw_pgm = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm")));
String work_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("work_yn")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String chrg_posk_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setDept_cd(dept_cd);
dm.setChrg_posk_cd(chrg_posk_cd);
dm.setFlnm(flnm);
dm.setMedi_cd(medi_cd);
dm.setThrw_pgm(thrw_pgm);
dm.setWork_yn(work_yn);
dm.setSs_emp_no(ss_emp_no);
dm.setChrg_posk_nm(chrg_posk_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 09 16:44:00 KST 2018 */