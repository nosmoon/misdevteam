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


public class FC_ACCT_8001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frfisc_dt;
	public String tofisc_dt;
	public String acct_cd1;
	public String acct_cd2;
	public String setoff_slip_occr_dt;
	public String setoff_slip_clsf_cd;
	public String setoff_slip_seq;
	public String setoff_slip_sub_seq;
	public String incm_clsf_cd;
	public String mode;

	public FC_ACCT_8001_LDM(){}
	public FC_ACCT_8001_LDM(String cmpy_cd, String frfisc_dt, String tofisc_dt, String acct_cd1, String acct_cd2, String setoff_slip_occr_dt, String setoff_slip_clsf_cd, String setoff_slip_seq, String setoff_slip_sub_seq, String incm_clsf_cd, String mode){
		this.cmpy_cd = cmpy_cd;
		this.frfisc_dt = frfisc_dt;
		this.tofisc_dt = tofisc_dt;
		this.acct_cd1 = acct_cd1;
		this.acct_cd2 = acct_cd2;
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
		this.setoff_slip_seq = setoff_slip_seq;
		this.setoff_slip_sub_seq = setoff_slip_sub_seq;
		this.incm_clsf_cd = incm_clsf_cd;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrfisc_dt(String frfisc_dt){
		this.frfisc_dt = frfisc_dt;
	}

	public void setTofisc_dt(String tofisc_dt){
		this.tofisc_dt = tofisc_dt;
	}

	public void setAcct_cd1(String acct_cd1){
		this.acct_cd1 = acct_cd1;
	}

	public void setAcct_cd2(String acct_cd2){
		this.acct_cd2 = acct_cd2;
	}

	public void setSetoff_slip_occr_dt(String setoff_slip_occr_dt){
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
	}

	public void setSetoff_slip_clsf_cd(String setoff_slip_clsf_cd){
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
	}

	public void setSetoff_slip_seq(String setoff_slip_seq){
		this.setoff_slip_seq = setoff_slip_seq;
	}

	public void setSetoff_slip_sub_seq(String setoff_slip_sub_seq){
		this.setoff_slip_sub_seq = setoff_slip_sub_seq;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrfisc_dt(){
		return this.frfisc_dt;
	}

	public String getTofisc_dt(){
		return this.tofisc_dt;
	}

	public String getAcct_cd1(){
		return this.acct_cd1;
	}

	public String getAcct_cd2(){
		return this.acct_cd2;
	}

	public String getSetoff_slip_occr_dt(){
		return this.setoff_slip_occr_dt;
	}

	public String getSetoff_slip_clsf_cd(){
		return this.setoff_slip_clsf_cd;
	}

	public String getSetoff_slip_seq(){
		return this.setoff_slip_seq;
	}

	public String getSetoff_slip_sub_seq(){
		return this.setoff_slip_sub_seq;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_8001_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_8001_LDM dm = (FC_ACCT_8001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frfisc_dt);
		cstmt.setString(5, dm.tofisc_dt);
		cstmt.setString(6, dm.acct_cd1);
		cstmt.setString(7, dm.acct_cd2);
		cstmt.setString(8, dm.setoff_slip_occr_dt);
		cstmt.setString(9, dm.setoff_slip_clsf_cd);
		cstmt.setString(10, dm.setoff_slip_seq);
		cstmt.setString(11, dm.setoff_slip_sub_seq);
		cstmt.setString(12, dm.incm_clsf_cd);
		cstmt.setString(13, dm.mode);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_8001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frfisc_dt = [" + getFrfisc_dt() + "]");
		System.out.println("tofisc_dt = [" + getTofisc_dt() + "]");
		System.out.println("acct_cd1 = [" + getAcct_cd1() + "]");
		System.out.println("acct_cd2 = [" + getAcct_cd2() + "]");
		System.out.println("setoff_slip_occr_dt = [" + getSetoff_slip_occr_dt() + "]");
		System.out.println("setoff_slip_clsf_cd = [" + getSetoff_slip_clsf_cd() + "]");
		System.out.println("setoff_slip_seq = [" + getSetoff_slip_seq() + "]");
		System.out.println("setoff_slip_sub_seq = [" + getSetoff_slip_sub_seq() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
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
String frfisc_dt = req.getParameter("frfisc_dt");
if( frfisc_dt == null){
	System.out.println(this.toString+" : frfisc_dt is null" );
}else{
	System.out.println(this.toString+" : frfisc_dt is "+frfisc_dt );
}
String tofisc_dt = req.getParameter("tofisc_dt");
if( tofisc_dt == null){
	System.out.println(this.toString+" : tofisc_dt is null" );
}else{
	System.out.println(this.toString+" : tofisc_dt is "+tofisc_dt );
}
String acct_cd1 = req.getParameter("acct_cd1");
if( acct_cd1 == null){
	System.out.println(this.toString+" : acct_cd1 is null" );
}else{
	System.out.println(this.toString+" : acct_cd1 is "+acct_cd1 );
}
String acct_cd2 = req.getParameter("acct_cd2");
if( acct_cd2 == null){
	System.out.println(this.toString+" : acct_cd2 is null" );
}else{
	System.out.println(this.toString+" : acct_cd2 is "+acct_cd2 );
}
String setoff_slip_occr_dt = req.getParameter("setoff_slip_occr_dt");
if( setoff_slip_occr_dt == null){
	System.out.println(this.toString+" : setoff_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_occr_dt is "+setoff_slip_occr_dt );
}
String setoff_slip_clsf_cd = req.getParameter("setoff_slip_clsf_cd");
if( setoff_slip_clsf_cd == null){
	System.out.println(this.toString+" : setoff_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_clsf_cd is "+setoff_slip_clsf_cd );
}
String setoff_slip_seq = req.getParameter("setoff_slip_seq");
if( setoff_slip_seq == null){
	System.out.println(this.toString+" : setoff_slip_seq is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_seq is "+setoff_slip_seq );
}
String setoff_slip_sub_seq = req.getParameter("setoff_slip_sub_seq");
if( setoff_slip_sub_seq == null){
	System.out.println(this.toString+" : setoff_slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_sub_seq is "+setoff_slip_sub_seq );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
String tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
String acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
String acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
String setoff_slip_occr_dt = Util.checkString(req.getParameter("setoff_slip_occr_dt"));
String setoff_slip_clsf_cd = Util.checkString(req.getParameter("setoff_slip_clsf_cd"));
String setoff_slip_seq = Util.checkString(req.getParameter("setoff_slip_seq"));
String setoff_slip_sub_seq = Util.checkString(req.getParameter("setoff_slip_sub_seq"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frfisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("frfisc_dt")));
String tofisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tofisc_dt")));
String acct_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd1")));
String acct_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd2")));
String setoff_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_occr_dt")));
String setoff_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_clsf_cd")));
String setoff_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_seq")));
String setoff_slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_sub_seq")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrfisc_dt(frfisc_dt);
dm.setTofisc_dt(tofisc_dt);
dm.setAcct_cd1(acct_cd1);
dm.setAcct_cd2(acct_cd2);
dm.setSetoff_slip_occr_dt(setoff_slip_occr_dt);
dm.setSetoff_slip_clsf_cd(setoff_slip_clsf_cd);
dm.setSetoff_slip_seq(setoff_slip_seq);
dm.setSetoff_slip_sub_seq(setoff_slip_sub_seq);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 30 10:21:50 KST 2009 */