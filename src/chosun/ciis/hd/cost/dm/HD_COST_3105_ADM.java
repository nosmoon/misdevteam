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


package chosun.ciis.hd.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.cost.ds.*;
import chosun.ciis.hd.cost.rec.*;

/**
 * 
 */


public class HD_COST_3105_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String aplc_dt;
	public String emp_no;
	public String slip_proc_seq;
	public String ss_emp_no;
	public String incmg_pers_ipadd;

	public HD_COST_3105_ADM(){}
	public HD_COST_3105_ADM(String cmpy_cd, String mode, String aplc_dt, String emp_no, String slip_proc_seq, String ss_emp_no, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.aplc_dt = aplc_dt;
		this.emp_no = emp_no;
		this.slip_proc_seq = slip_proc_seq;
		this.ss_emp_no = ss_emp_no;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setSs_emp_no(String ss_emp_no){
		this.ss_emp_no = ss_emp_no;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getSs_emp_no(){
		return this.ss_emp_no;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_COST_3105_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_COST_3105_ADM dm = (HD_COST_3105_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.aplc_dt);
		cstmt.setString(6, dm.emp_no);
		cstmt.setString(7, dm.slip_proc_seq);
		cstmt.setString(8, dm.ss_emp_no);
		cstmt.setString(9, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.cost.ds.HD_COST_3105_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("slip_proc_seq = [" + getSlip_proc_seq() + "]");
		System.out.println("ss_emp_no = [" + getSs_emp_no() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String slip_proc_seq = req.getParameter("slip_proc_seq");
if( slip_proc_seq == null){
	System.out.println(this.toString+" : slip_proc_seq is null" );
}else{
	System.out.println(this.toString+" : slip_proc_seq is "+slip_proc_seq );
}
String ss_emp_no = req.getParameter("ss_emp_no");
if( ss_emp_no == null){
	System.out.println(this.toString+" : ss_emp_no is null" );
}else{
	System.out.println(this.toString+" : ss_emp_no is "+ss_emp_no );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String slip_proc_seq = Util.checkString(req.getParameter("slip_proc_seq"));
String ss_emp_no = Util.checkString(req.getParameter("ss_emp_no"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String slip_proc_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_proc_seq")));
String ss_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_emp_no")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setAplc_dt(aplc_dt);
dm.setEmp_no(emp_no);
dm.setSlip_proc_seq(slip_proc_seq);
dm.setSs_emp_no(ss_emp_no);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 13 13:48:34 KST 2012 */