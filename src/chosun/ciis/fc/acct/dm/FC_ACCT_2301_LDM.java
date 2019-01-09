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


public class FC_ACCT_2301_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String vexc_cmpy_cd;
	public String pay_dt;
	public String occr_slip_occr_dt;
	public String mode;

	public FC_ACCT_2301_LDM(){}
	public FC_ACCT_2301_LDM(String cmpy_cd, String vexc_cmpy_cd, String pay_dt, String occr_slip_occr_dt, String mode){
		this.cmpy_cd = cmpy_cd;
		this.vexc_cmpy_cd = vexc_cmpy_cd;
		this.pay_dt = pay_dt;
		this.occr_slip_occr_dt = occr_slip_occr_dt;
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setOccr_slip_occr_dt(String occr_slip_occr_dt){
		this.occr_slip_occr_dt = occr_slip_occr_dt;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getOccr_slip_occr_dt(){
		return this.occr_slip_occr_dt;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2301_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2301_LDM dm = (FC_ACCT_2301_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.vexc_cmpy_cd);
		cstmt.setString(5, dm.pay_dt);
		cstmt.setString(6, dm.occr_slip_occr_dt);
		cstmt.setString(7, dm.mode);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2301_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("vexc_cmpy_cd = [" + getVexc_cmpy_cd() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("occr_slip_occr_dt = [" + getOccr_slip_occr_dt() + "]");
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
String vexc_cmpy_cd = req.getParameter("vexc_cmpy_cd");
if( vexc_cmpy_cd == null){
	System.out.println(this.toString+" : vexc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_cd is "+vexc_cmpy_cd );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String occr_slip_occr_dt = req.getParameter("occr_slip_occr_dt");
if( occr_slip_occr_dt == null){
	System.out.println(this.toString+" : occr_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_slip_occr_dt is "+occr_slip_occr_dt );
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
String vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String occr_slip_occr_dt = Util.checkString(req.getParameter("occr_slip_occr_dt"));
String mode = Util.checkString(req.getParameter("mode"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String vexc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_cd")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String occr_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_occr_dt")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setVexc_cmpy_cd(vexc_cmpy_cd);
dm.setPay_dt(pay_dt);
dm.setOccr_slip_occr_dt(occr_slip_occr_dt);
dm.setMode(mode);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 11:29:31 KST 2009 */