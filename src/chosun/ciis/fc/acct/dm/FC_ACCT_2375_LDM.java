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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2375_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq_fr;
	public String slip_seq_to;
	public String incmg_emp_no;
	public String fisc_dt;

	public FC_ACCT_2375_LDM(){}
	public FC_ACCT_2375_LDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq_fr, String slip_seq_to, String incmg_emp_no, String fisc_dt){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq_fr = slip_seq_fr;
		this.slip_seq_to = slip_seq_to;
		this.incmg_emp_no = incmg_emp_no;
		this.fisc_dt = fisc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq_fr(String slip_seq_fr){
		this.slip_seq_fr = slip_seq_fr;
	}

	public void setSlip_seq_to(String slip_seq_to){
		this.slip_seq_to = slip_seq_to;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq_fr(){
		return this.slip_seq_fr;
	}

	public String getSlip_seq_to(){
		return this.slip_seq_to;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2375_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2375_LDM dm = (FC_ACCT_2375_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq_fr);
		cstmt.setString(7, dm.slip_seq_to);
		cstmt.setString(8, dm.incmg_emp_no);
		cstmt.setString(9, dm.fisc_dt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2375_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq_fr = [" + getSlip_seq_fr() + "]");
		System.out.println("slip_seq_to = [" + getSlip_seq_to() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq_fr = req.getParameter("slip_seq_fr");
if( slip_seq_fr == null){
	System.out.println(this.toString+" : slip_seq_fr is null" );
}else{
	System.out.println(this.toString+" : slip_seq_fr is "+slip_seq_fr );
}
String slip_seq_to = req.getParameter("slip_seq_to");
if( slip_seq_to == null){
	System.out.println(this.toString+" : slip_seq_to is null" );
}else{
	System.out.println(this.toString+" : slip_seq_to is "+slip_seq_to );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
String slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq_fr")));
String slip_seq_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq_to")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq_fr(slip_seq_fr);
dm.setSlip_seq_to(slip_seq_to);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setFisc_dt(fisc_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 18:04:47 KST 2009 */