/***************************************************************************************************
* 파일명 : FC_ACCT_2901_L.java
* 기능 :   
* 작성일자 : 
* 작성자 : 전현표
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

public class FC_ACCT_2952_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt_in;
	public String slip_clsf_cd_in;
	public String slip_seq_in;
	public String incmg_emp_no;
	public String incmg_emp_no_ipadd;
	public String prof_type_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_ACCT_2952_DDM(){}
	public FC_ACCT_2952_DDM(String cmpy_cd, String slip_occr_dt_in, String slip_clsf_cd_in, String slip_seq_in, String incmg_emp_no, String incmg_emp_no_ipadd, String prof_type_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt_in = slip_occr_dt_in;
		this.slip_clsf_cd_in = slip_clsf_cd_in;
		this.slip_seq_in = slip_seq_in;
		this.incmg_emp_no = incmg_emp_no;
		this.incmg_emp_no_ipadd = incmg_emp_no_ipadd;
		this.prof_type_cd = prof_type_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt_in(String slip_occr_dt_in){
		this.slip_occr_dt_in = slip_occr_dt_in;
	}

	public void setSlip_clsf_cd_in(String slip_clsf_cd_in){
		this.slip_clsf_cd_in = slip_clsf_cd_in;
	}

	public void setSlip_seq_in(String slip_seq_in){
		this.slip_seq_in = slip_seq_in;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setIncmg_emp_no_ipadd(String incmg_emp_no_ipadd){
		this.incmg_emp_no_ipadd = incmg_emp_no_ipadd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt_in(){
		return this.slip_occr_dt_in;
	}

	public String getSlip_clsf_cd_in(){
		return this.slip_clsf_cd_in;
	}

	public String getSlip_seq_in(){
		return this.slip_seq_in;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getIncmg_emp_no_ipadd(){
		return this.incmg_emp_no_ipadd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2952_D(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2952_DDM dm = (FC_ACCT_2952_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt_in);
		cstmt.setString(5, dm.slip_clsf_cd_in);
		cstmt.setString(6, dm.slip_seq_in);
		cstmt.setString(7, dm.incmg_emp_no);
		cstmt.setString(8, dm.incmg_emp_no_ipadd);
		cstmt.setString(9, dm.prof_type_cd);
		cstmt.setString(10, dm.slip_occr_dt);
		cstmt.setString(11, dm.slip_clsf_cd);
		cstmt.setString(12, dm.slip_seq);
		cstmt.registerOutParameter(13, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2952_DDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_occr_dt_in = " + getSlip_occr_dt_in());
        System.out.println("slip_clsf_cd_in = " + getSlip_clsf_cd_in());
        System.out.println("slip_seq_in = " + getSlip_seq_in());
        System.out.println("incmg_emp_no = " + getIncmg_emp_no());
        System.out.println("incmg_emp_no_ipadd = " + getIncmg_emp_no_ipadd());
        System.out.println("prof_type_cd = " + getProf_type_cd());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("slip_seq = " + getSlip_seq());
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
String slip_occr_dt_in = req.getParameter("slip_occr_dt_in");
if( slip_occr_dt_in == null){
	System.out.println(this.toString+" : slip_occr_dt_in is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_in is "+slip_occr_dt_in );
}
String slip_clsf_cd_in = req.getParameter("slip_clsf_cd_in");
if( slip_clsf_cd_in == null){
	System.out.println(this.toString+" : slip_clsf_cd_in is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd_in is "+slip_clsf_cd_in );
}
String slip_seq_in = req.getParameter("slip_seq_in");
if( slip_seq_in == null){
	System.out.println(this.toString+" : slip_seq_in is null" );
}else{
	System.out.println(this.toString+" : slip_seq_in is "+slip_seq_in );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String incmg_emp_no_ipadd = req.getParameter("incmg_emp_no_ipadd");
if( incmg_emp_no_ipadd == null){
	System.out.println(this.toString+" : incmg_emp_no_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no_ipadd is "+incmg_emp_no_ipadd );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
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
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt_in = Util.checkString(req.getParameter("slip_occr_dt_in"));
String slip_clsf_cd_in = Util.checkString(req.getParameter("slip_clsf_cd_in"));
String slip_seq_in = Util.checkString(req.getParameter("slip_seq_in"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String incmg_emp_no_ipadd = Util.checkString(req.getParameter("incmg_emp_no_ipadd"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt_in = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_in")));
String slip_clsf_cd_in = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd_in")));
String slip_seq_in = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq_in")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String incmg_emp_no_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no_ipadd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt_in(slip_occr_dt_in);
dm.setSlip_clsf_cd_in(slip_clsf_cd_in);
dm.setSlip_seq_in(slip_seq_in);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setIncmg_emp_no_ipadd(incmg_emp_no_ipadd);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 03 20:25:41 KST 2009 */