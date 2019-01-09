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


public class HD_INFO_7200_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String pay_mm;
	public String flnm;
	public String proc_stat;
	public String actu_slip_no;
	public String ss_emp_no;

	public HD_INFO_7200_LDM(){}
	public HD_INFO_7200_LDM(String cmpy_cd, String dept_cd, String pay_mm, String flnm, String proc_stat, String actu_slip_no, String ss_emp_no){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.pay_mm = pay_mm;
		this.flnm = flnm;
		this.proc_stat = proc_stat;
		this.actu_slip_no = actu_slip_no;
		this.ss_emp_no = ss_emp_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPay_mm(String pay_mm){
		this.pay_mm = pay_mm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
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

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPay_mm(){
		return this.pay_mm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7200_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7200_LDM dm = (HD_INFO_7200_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.pay_mm);
		cstmt.setString(6, dm.flnm);
		cstmt.setString(7, dm.proc_stat);
		cstmt.setString(8, dm.actu_slip_no);
		cstmt.setString(9, dm.ss_emp_no);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7200_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("pay_mm = [" + getPay_mm() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String pay_mm = req.getParameter("pay_mm");
if( pay_mm == null){
	System.out.println(this.toString+" : pay_mm is null" );
}else{
	System.out.println(this.toString+" : pay_mm is "+pay_mm );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
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
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String pay_mm = Util.checkString(req.getParameter("pay_mm"));
String flnm = Util.checkString(req.getParameter("flnm"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String actu_slip_no = Util.checkString(req.getParameter("actu_slip_no"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String pay_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_mm")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String actu_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("actu_slip_no")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setPay_mm(pay_mm);
dm.setFlnm(flnm);
dm.setProc_stat(proc_stat);
dm.setActu_slip_no(actu_slip_no);
dm.setSs_emp_no(ss_emp_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 25 14:54:40 KST 2013 */