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


public class FC_ACCT_2373_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_occr_dt2;
	public String slip_clsf_cd;
	public String slip_seq_fr;
	public String slip_seq_to;
	public String slip_aprv_yn;

	public FC_ACCT_2373_LDM(){}
	public FC_ACCT_2373_LDM(String cmpy_cd, String slip_occr_dt, String slip_occr_dt2, String slip_clsf_cd, String slip_seq_fr, String slip_seq_to, String slip_aprv_yn){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_occr_dt2 = slip_occr_dt2;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq_fr = slip_seq_fr;
		this.slip_seq_to = slip_seq_to;
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_occr_dt2(String slip_occr_dt2){
		this.slip_occr_dt2 = slip_occr_dt2;
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

	public void setSlip_aprv_yn(String slip_aprv_yn){
		this.slip_aprv_yn = slip_aprv_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_occr_dt2(){
		return this.slip_occr_dt2;
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

	public String getSlip_aprv_yn(){
		return this.slip_aprv_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2373_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2373_LDM dm = (FC_ACCT_2373_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_occr_dt2);
		cstmt.setString(6, dm.slip_clsf_cd);
		cstmt.setString(7, dm.slip_seq_fr);
		cstmt.setString(8, dm.slip_seq_to);
		cstmt.setString(9, dm.slip_aprv_yn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2373_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_occr_dt2 = [" + getSlip_occr_dt2() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq_fr = [" + getSlip_seq_fr() + "]");
		System.out.println("slip_seq_to = [" + getSlip_seq_to() + "]");
		System.out.println("slip_aprv_yn = [" + getSlip_aprv_yn() + "]");
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
String slip_occr_dt2 = req.getParameter("slip_occr_dt2");
if( slip_occr_dt2 == null){
	System.out.println(this.toString+" : slip_occr_dt2 is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt2 is "+slip_occr_dt2 );
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
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_occr_dt2 = Util.checkString(req.getParameter("slip_occr_dt2"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq_fr = Util.checkString(req.getParameter("slip_seq_fr"));
String slip_seq_to = Util.checkString(req.getParameter("slip_seq_to"));
String slip_aprv_yn = Util.checkString(req.getParameter("slip_aprv_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_occr_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt2")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq_fr")));
String slip_seq_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq_to")));
String slip_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_aprv_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_occr_dt2(slip_occr_dt2);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq_fr(slip_seq_fr);
dm.setSlip_seq_to(slip_seq_to);
dm.setSlip_aprv_yn(slip_aprv_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 10 10:03:55 KST 2018 */