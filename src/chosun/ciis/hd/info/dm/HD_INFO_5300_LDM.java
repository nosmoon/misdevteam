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


public class HD_INFO_5300_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String st_occr_dt;
	public String et_occr_dt;
	public String proc_stat;

	public HD_INFO_5300_LDM(){}
	public HD_INFO_5300_LDM(String cmpy_cd, String emp_no, String st_occr_dt, String et_occr_dt, String proc_stat){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.st_occr_dt = st_occr_dt;
		this.et_occr_dt = et_occr_dt;
		this.proc_stat = proc_stat;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSt_occr_dt(String st_occr_dt){
		this.st_occr_dt = st_occr_dt;
	}

	public void setEt_occr_dt(String et_occr_dt){
		this.et_occr_dt = et_occr_dt;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSt_occr_dt(){
		return this.st_occr_dt;
	}

	public String getEt_occr_dt(){
		return this.et_occr_dt;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_5300_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_5300_LDM dm = (HD_INFO_5300_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.st_occr_dt);
		cstmt.setString(6, dm.et_occr_dt);
		cstmt.setString(7, dm.proc_stat);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_5300_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("st_occr_dt = [" + getSt_occr_dt() + "]");
		System.out.println("et_occr_dt = [" + getEt_occr_dt() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String st_occr_dt = req.getParameter("st_occr_dt");
if( st_occr_dt == null){
	System.out.println(this.toString+" : st_occr_dt is null" );
}else{
	System.out.println(this.toString+" : st_occr_dt is "+st_occr_dt );
}
String et_occr_dt = req.getParameter("et_occr_dt");
if( et_occr_dt == null){
	System.out.println(this.toString+" : et_occr_dt is null" );
}else{
	System.out.println(this.toString+" : et_occr_dt is "+et_occr_dt );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String st_occr_dt = Util.checkString(req.getParameter("st_occr_dt"));
String et_occr_dt = Util.checkString(req.getParameter("et_occr_dt"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String st_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_occr_dt")));
String et_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_occr_dt")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSt_occr_dt(st_occr_dt);
dm.setEt_occr_dt(et_occr_dt);
dm.setProc_stat(proc_stat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 04 15:24:28 KST 2009 */