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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2101_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String emp_no;
	public String flnm;
	public String dept_cd;
	public String flnm_engl;
	public String real_fee_paymt_amt;
	public String issu_resn;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_INFO_2101_ADM(){}
	public HD_INFO_2101_ADM(String cmpy_cd, String mode, String emp_no, String flnm, String dept_cd, String flnm_engl, String real_fee_paymt_amt, String issu_resn, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.dept_cd = dept_cd;
		this.flnm_engl = flnm_engl;
		this.real_fee_paymt_amt = real_fee_paymt_amt;
		this.issu_resn = issu_resn;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setFlnm_engl(String flnm_engl){
		this.flnm_engl = flnm_engl;
	}

	public void setReal_fee_paymt_amt(String real_fee_paymt_amt){
		this.real_fee_paymt_amt = real_fee_paymt_amt;
	}

	public void setIssu_resn(String issu_resn){
		this.issu_resn = issu_resn;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getFlnm_engl(){
		return this.flnm_engl;
	}

	public String getReal_fee_paymt_amt(){
		return this.real_fee_paymt_amt;
	}

	public String getIssu_resn(){
		return this.issu_resn;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2101_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2101_ADM dm = (HD_INFO_2101_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.flnm_engl);
		cstmt.setString(9, dm.real_fee_paymt_amt);
		cstmt.setString(10, dm.issu_resn);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_2101_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("flnm_engl = [" + getFlnm_engl() + "]");
		System.out.println("real_fee_paymt_amt = [" + getReal_fee_paymt_amt() + "]");
		System.out.println("issu_resn = [" + getIssu_resn() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String flnm_engl = req.getParameter("flnm_engl");
if( flnm_engl == null){
	System.out.println(this.toString+" : flnm_engl is null" );
}else{
	System.out.println(this.toString+" : flnm_engl is "+flnm_engl );
}
String real_fee_paymt_amt = req.getParameter("real_fee_paymt_amt");
if( real_fee_paymt_amt == null){
	System.out.println(this.toString+" : real_fee_paymt_amt is null" );
}else{
	System.out.println(this.toString+" : real_fee_paymt_amt is "+real_fee_paymt_amt );
}
String issu_resn = req.getParameter("issu_resn");
if( issu_resn == null){
	System.out.println(this.toString+" : issu_resn is null" );
}else{
	System.out.println(this.toString+" : issu_resn is "+issu_resn );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String mode = Util.checkString(req.getParameter("mode"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String flnm_engl = Util.checkString(req.getParameter("flnm_engl"));
String real_fee_paymt_amt = Util.checkString(req.getParameter("real_fee_paymt_amt"));
String issu_resn = Util.checkString(req.getParameter("issu_resn"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String flnm_engl = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm_engl")));
String real_fee_paymt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("real_fee_paymt_amt")));
String issu_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_resn")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setDept_cd(dept_cd);
dm.setFlnm_engl(flnm_engl);
dm.setReal_fee_paymt_amt(real_fee_paymt_amt);
dm.setIssu_resn(issu_resn);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 28 20:38:43 KST 2009 */