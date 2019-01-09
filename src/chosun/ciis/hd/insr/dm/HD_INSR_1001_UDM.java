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


package chosun.ciis.hd.insr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.ds.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1001_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String np_entr_dt;
	public String np_mtry_dt;
	public String np_no;
	public String np_slf_ctrb_amt;
	public String np_cmpy_burd_amt;
	public String chg_pers;

	public HD_INSR_1001_UDM(){}
	public HD_INSR_1001_UDM(String cmpy_cd, String emp_no, String np_entr_dt, String np_mtry_dt, String np_no, String np_slf_ctrb_amt, String np_cmpy_burd_amt, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.np_entr_dt = np_entr_dt;
		this.np_mtry_dt = np_mtry_dt;
		this.np_no = np_no;
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
		this.np_cmpy_burd_amt = np_cmpy_burd_amt;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNp_entr_dt(String np_entr_dt){
		this.np_entr_dt = np_entr_dt;
	}

	public void setNp_mtry_dt(String np_mtry_dt){
		this.np_mtry_dt = np_mtry_dt;
	}

	public void setNp_no(String np_no){
		this.np_no = np_no;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public void setNp_cmpy_burd_amt(String np_cmpy_burd_amt){
		this.np_cmpy_burd_amt = np_cmpy_burd_amt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNp_entr_dt(){
		return this.np_entr_dt;
	}

	public String getNp_mtry_dt(){
		return this.np_mtry_dt;
	}

	public String getNp_no(){
		return this.np_no;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}

	public String getNp_cmpy_burd_amt(){
		return this.np_cmpy_burd_amt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INSR_1001_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INSR_1001_UDM dm = (HD_INSR_1001_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.np_entr_dt);
		cstmt.setString(7, dm.np_mtry_dt);
		cstmt.setString(8, dm.np_no);
		cstmt.setString(9, dm.np_slf_ctrb_amt);
		cstmt.setString(10, dm.np_cmpy_burd_amt);
		cstmt.setString(11, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INSR_1001_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("np_entr_dt = [" + getNp_entr_dt() + "]");
		System.out.println("np_mtry_dt = [" + getNp_mtry_dt() + "]");
		System.out.println("np_no = [" + getNp_no() + "]");
		System.out.println("np_slf_ctrb_amt = [" + getNp_slf_ctrb_amt() + "]");
		System.out.println("np_cmpy_burd_amt = [" + getNp_cmpy_burd_amt() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String np_entr_dt = req.getParameter("np_entr_dt");
if( np_entr_dt == null){
	System.out.println(this.toString+" : np_entr_dt is null" );
}else{
	System.out.println(this.toString+" : np_entr_dt is "+np_entr_dt );
}
String np_mtry_dt = req.getParameter("np_mtry_dt");
if( np_mtry_dt == null){
	System.out.println(this.toString+" : np_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : np_mtry_dt is "+np_mtry_dt );
}
String np_no = req.getParameter("np_no");
if( np_no == null){
	System.out.println(this.toString+" : np_no is null" );
}else{
	System.out.println(this.toString+" : np_no is "+np_no );
}
String np_slf_ctrb_amt = req.getParameter("np_slf_ctrb_amt");
if( np_slf_ctrb_amt == null){
	System.out.println(this.toString+" : np_slf_ctrb_amt is null" );
}else{
	System.out.println(this.toString+" : np_slf_ctrb_amt is "+np_slf_ctrb_amt );
}
String np_cmpy_burd_amt = req.getParameter("np_cmpy_burd_amt");
if( np_cmpy_burd_amt == null){
	System.out.println(this.toString+" : np_cmpy_burd_amt is null" );
}else{
	System.out.println(this.toString+" : np_cmpy_burd_amt is "+np_cmpy_burd_amt );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String np_entr_dt = Util.checkString(req.getParameter("np_entr_dt"));
String np_mtry_dt = Util.checkString(req.getParameter("np_mtry_dt"));
String np_no = Util.checkString(req.getParameter("np_no"));
String np_slf_ctrb_amt = Util.checkString(req.getParameter("np_slf_ctrb_amt"));
String np_cmpy_burd_amt = Util.checkString(req.getParameter("np_cmpy_burd_amt"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String np_entr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_entr_dt")));
String np_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_mtry_dt")));
String np_no = Util.Uni2Ksc(Util.checkString(req.getParameter("np_no")));
String np_slf_ctrb_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_slf_ctrb_amt")));
String np_cmpy_burd_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("np_cmpy_burd_amt")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setNp_entr_dt(np_entr_dt);
dm.setNp_mtry_dt(np_mtry_dt);
dm.setNp_no(np_no);
dm.setNp_slf_ctrb_amt(np_slf_ctrb_amt);
dm.setNp_cmpy_burd_amt(np_cmpy_burd_amt);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 14:50:19 KST 2009 */