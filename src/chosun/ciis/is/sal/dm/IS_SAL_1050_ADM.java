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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1050_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String prof_type_cd;
	public String slip_seq;
	public String incmg_dept_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_SAL_1050_ADM(){}
	public IS_SAL_1050_ADM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String prof_type_cd, String slip_seq, String incmg_dept_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.prof_type_cd = prof_type_cd;
		this.slip_seq = slip_seq;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1050_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1050_ADM dm = (IS_SAL_1050_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.prof_type_cd);
		cstmt.setString(7, dm.slip_seq);
		cstmt.setString(8, dm.incmg_dept_cd);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1050_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_seq(slip_seq);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 10 15:27:29 KST 2012 */