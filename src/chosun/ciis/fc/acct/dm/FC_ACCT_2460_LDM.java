/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
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
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2460_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;
	public String fisc_dt_fr;
	public String fisc_dt_to;
	public String incmg_dt_fr;
	public String incmg_dt_to;
	public String slip_clsf_cd;
	public String incmg_emp_no;
	public String slip_aprv_yn;

	public FC_ACCT_2460_LDM(){}
	public FC_ACCT_2460_LDM(String cmpy_cd, String slip_occr_dt_fr, String slip_occr_dt_to, String fisc_dt_fr, String fisc_dt_to, String incmg_dt_fr, String incmg_dt_to, String slip_clsf_cd, String incmg_emp_no, String slip_aprv_yn){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
		this.fisc_dt_fr = fisc_dt_fr;
		this.fisc_dt_to = fisc_dt_to;
		this.incmg_dt_fr = incmg_dt_fr;
		this.incmg_dt_to = incmg_dt_to;
		this.slip_clsf_cd = slip_clsf_cd;
		this.incmg_emp_no = incmg_emp_no;
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setFisc_dt_fr(String fisc_dt_fr){
		this.fisc_dt_fr = fisc_dt_fr;
	}

	public void setFisc_dt_to(String fisc_dt_to){
		this.fisc_dt_to = fisc_dt_to;
	}

	public void setIncmg_dt_fr(String incmg_dt_fr){
		this.incmg_dt_fr = incmg_dt_fr;
	}

	public void setIncmg_dt_to(String incmg_dt_to){
		this.incmg_dt_to = incmg_dt_to;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getFisc_dt_fr(){
		return this.fisc_dt_fr;
	}

	public String getFisc_dt_to(){
		return this.fisc_dt_to;
	}

	public String getIncmg_dt_fr(){
		return this.incmg_dt_fr;
	}

	public String getIncmg_dt_to(){
		return this.incmg_dt_to;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2460_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2460_LDM dm = (FC_ACCT_2460_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt_fr);
		cstmt.setString(5, dm.slip_occr_dt_to);
		cstmt.setString(6, dm.fisc_dt_fr);
		cstmt.setString(7, dm.fisc_dt_to);
		cstmt.setString(8, dm.incmg_dt_fr);
		cstmt.setString(9, dm.incmg_dt_to);
		cstmt.setString(10, dm.slip_clsf_cd);
		cstmt.setString(11, dm.incmg_emp_no);
		cstmt.setString(12, dm.slip_aprv_yn);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2460_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_occr_dt_fr = " + getSlip_occr_dt_fr());
        System.out.println("slip_occr_dt_to = " + getSlip_occr_dt_to());
        System.out.println("fisc_dt_fr = " + getFisc_dt_fr());
        System.out.println("fisc_dt_to = " + getFisc_dt_to());
        System.out.println("incmg_dt_fr = " + getIncmg_dt_fr());
        System.out.println("incmg_dt_to = " + getIncmg_dt_to());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("incmg_emp_no = " + getIncmg_emp_no());
        System.out.println("slip_aprv_yn = " + getSlip_aprv_yn());
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
String slip_occr_dt_fr = req.getParameter("slip_occr_dt_fr");
if( slip_occr_dt_fr == null){
	System.out.println(this.toString+" : slip_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_fr is "+slip_occr_dt_fr );
}
String slip_occr_dt_to = req.getParameter("slip_occr_dt_to");
if( slip_occr_dt_to == null){
	System.out.println(this.toString+" : slip_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_to is "+slip_occr_dt_to );
}
String fisc_dt_fr = req.getParameter("fisc_dt_fr");
if( fisc_dt_fr == null){
	System.out.println(this.toString+" : fisc_dt_fr is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_fr is "+fisc_dt_fr );
}
String fisc_dt_to = req.getParameter("fisc_dt_to");
if( fisc_dt_to == null){
	System.out.println(this.toString+" : fisc_dt_to is null" );
}else{
	System.out.println(this.toString+" : fisc_dt_to is "+fisc_dt_to );
}
String incmg_dt_fr = req.getParameter("incmg_dt_fr");
if( incmg_dt_fr == null){
	System.out.println(this.toString+" : incmg_dt_fr is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_fr is "+incmg_dt_fr );
}
String incmg_dt_to = req.getParameter("incmg_dt_to");
if( incmg_dt_to == null){
	System.out.println(this.toString+" : incmg_dt_to is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_to is "+incmg_dt_to );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String slip_aprv_yn = req.getParameter("slip_aprv_yn");
if( slip_aprv_yn == null){
	System.out.println(this.toString+" : slip_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : slip_aprv_yn is "+slip_aprv_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
String fisc_dt_fr = Util.checkString(req.getParameter("fisc_dt_fr"));
String fisc_dt_to = Util.checkString(req.getParameter("fisc_dt_to"));
String incmg_dt_fr = Util.checkString(req.getParameter("incmg_dt_fr"));
String incmg_dt_to = Util.checkString(req.getParameter("incmg_dt_to"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
String fisc_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_fr")));
String fisc_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt_to")));
String incmg_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_fr")));
String incmg_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_to")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String slip_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_aprv_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
dm.setFisc_dt_fr(fisc_dt_fr);
dm.setFisc_dt_to(fisc_dt_to);
dm.setIncmg_dt_fr(incmg_dt_fr);
dm.setIncmg_dt_to(incmg_dt_to);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setSlip_aprv_yn(slip_aprv_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 20 11:04:25 KST 2009 */