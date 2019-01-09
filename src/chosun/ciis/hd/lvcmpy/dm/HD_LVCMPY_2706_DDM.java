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


package chosun.ciis.hd.lvcmpy.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.ds.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2706_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String in_lvcmpy_dt;
	public String in_slip_occr_dt;
	public String in_slip_seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_LVCMPY_2706_DDM(){}
	public HD_LVCMPY_2706_DDM(String cmpy_cd, String emp_no, String in_lvcmpy_dt, String in_slip_occr_dt, String in_slip_seq, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.in_lvcmpy_dt = in_lvcmpy_dt;
		this.in_slip_occr_dt = in_slip_occr_dt;
		this.in_slip_seq = in_slip_seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIn_lvcmpy_dt(String in_lvcmpy_dt){
		this.in_lvcmpy_dt = in_lvcmpy_dt;
	}

	public void setIn_slip_occr_dt(String in_slip_occr_dt){
		this.in_slip_occr_dt = in_slip_occr_dt;
	}

	public void setIn_slip_seq(String in_slip_seq){
		this.in_slip_seq = in_slip_seq;
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

	public String getIn_lvcmpy_dt(){
		return this.in_lvcmpy_dt;
	}

	public String getIn_slip_occr_dt(){
		return this.in_slip_occr_dt;
	}

	public String getIn_slip_seq(){
		return this.in_slip_seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_LVCMPY_2706_D(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_LVCMPY_2706_DDM dm = (HD_LVCMPY_2706_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.in_lvcmpy_dt);
		cstmt.setString(6, dm.in_slip_occr_dt);
		cstmt.setString(7, dm.in_slip_seq);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.lvcmpy.ds.HD_LVCMPY_2706_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("in_lvcmpy_dt = [" + getIn_lvcmpy_dt() + "]");
		System.out.println("in_slip_occr_dt = [" + getIn_slip_occr_dt() + "]");
		System.out.println("in_slip_seq = [" + getIn_slip_seq() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String in_lvcmpy_dt = req.getParameter("in_lvcmpy_dt");
if( in_lvcmpy_dt == null){
	System.out.println(this.toString+" : in_lvcmpy_dt is null" );
}else{
	System.out.println(this.toString+" : in_lvcmpy_dt is "+in_lvcmpy_dt );
}
String in_slip_occr_dt = req.getParameter("in_slip_occr_dt");
if( in_slip_occr_dt == null){
	System.out.println(this.toString+" : in_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : in_slip_occr_dt is "+in_slip_occr_dt );
}
String in_slip_seq = req.getParameter("in_slip_seq");
if( in_slip_seq == null){
	System.out.println(this.toString+" : in_slip_seq is null" );
}else{
	System.out.println(this.toString+" : in_slip_seq is "+in_slip_seq );
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
String in_lvcmpy_dt = Util.checkString(req.getParameter("in_lvcmpy_dt"));
String in_slip_occr_dt = Util.checkString(req.getParameter("in_slip_occr_dt"));
String in_slip_seq = Util.checkString(req.getParameter("in_slip_seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String in_lvcmpy_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_lvcmpy_dt")));
String in_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_occr_dt")));
String in_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("in_slip_seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setIn_lvcmpy_dt(in_lvcmpy_dt);
dm.setIn_slip_occr_dt(in_slip_occr_dt);
dm.setIn_slip_seq(in_slip_seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 05 17:41:04 KST 2009 */