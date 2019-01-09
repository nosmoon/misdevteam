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


package chosun.ciis.hd.duty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.ds.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1502_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String search_dt;
	public String last_dt;
	public String dept_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_DUTY_1502_ADM(){}
	public HD_DUTY_1502_ADM(String cmpy_cd, String emp_no, String search_dt, String last_dt, String dept_cd, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.search_dt = search_dt;
		this.last_dt = last_dt;
		this.dept_cd = dept_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSearch_dt(String search_dt){
		this.search_dt = search_dt;
	}

	public void setLast_dt(String last_dt){
		this.last_dt = last_dt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
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

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSearch_dt(){
		return this.search_dt;
	}

	public String getLast_dt(){
		return this.last_dt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DUTY_1502_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DUTY_1502_ADM dm = (HD_DUTY_1502_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.search_dt);
		cstmt.setString(6, dm.last_dt);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.duty.ds.HD_DUTY_1502_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("emp_no = " + getEmp_no());
        System.out.println("search_dt = " + getSearch_dt());
        System.out.println("last_dt = " + getLast_dt());
        System.out.println("dept_cd = " + getDept_cd());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String search_dt = req.getParameter("search_dt");
if( search_dt == null){
	System.out.println(this.toString+" : search_dt is null" );
}else{
	System.out.println(this.toString+" : search_dt is "+search_dt );
}
String last_dt = req.getParameter("last_dt");
if( last_dt == null){
	System.out.println(this.toString+" : last_dt is null" );
}else{
	System.out.println(this.toString+" : last_dt is "+last_dt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
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
String emp_no = Util.checkString(req.getParameter("emp_no"));
String search_dt = Util.checkString(req.getParameter("search_dt"));
String last_dt = Util.checkString(req.getParameter("last_dt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String search_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt")));
String last_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_dt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSearch_dt(search_dt);
dm.setLast_dt(last_dt);
dm.setDept_cd(dept_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 10:12:20 KST 2009 */