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


public class FC_ACCT_2231_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_cd;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;
	public String ask_dept_cd;
	public String unrcp_yn;

	public FC_ACCT_2231_LDM(){}
	public FC_ACCT_2231_LDM(String cmpy_cd, String dlco_cd, String slip_occr_dt_fr, String slip_occr_dt_to, String ask_dept_cd, String unrcp_yn){
		this.cmpy_cd = cmpy_cd;
		this.dlco_cd = dlco_cd;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
		this.ask_dept_cd = ask_dept_cd;
		this.unrcp_yn = unrcp_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setUnrcp_yn(String unrcp_yn){
		this.unrcp_yn = unrcp_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getUnrcp_yn(){
		return this.unrcp_yn;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2231_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2231_LDM dm = (FC_ACCT_2231_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_cd);
		cstmt.setString(5, dm.slip_occr_dt_fr);
		cstmt.setString(6, dm.slip_occr_dt_to);
		cstmt.setString(7, dm.ask_dept_cd);
		cstmt.setString(8, dm.unrcp_yn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2231_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("slip_occr_dt_fr = [" + getSlip_occr_dt_fr() + "]");
		System.out.println("slip_occr_dt_to = [" + getSlip_occr_dt_to() + "]");
		System.out.println("ask_dept_cd = [" + getAsk_dept_cd() + "]");
		System.out.println("unrcp_yn = [" + getUnrcp_yn() + "]");
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
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
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
String ask_dept_cd = req.getParameter("ask_dept_cd");
if( ask_dept_cd == null){
	System.out.println(this.toString+" : ask_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ask_dept_cd is "+ask_dept_cd );
}
String unrcp_yn = req.getParameter("unrcp_yn");
if( unrcp_yn == null){
	System.out.println(this.toString+" : unrcp_yn is null" );
}else{
	System.out.println(this.toString+" : unrcp_yn is "+unrcp_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String unrcp_yn = Util.checkString(req.getParameter("unrcp_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String unrcp_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("unrcp_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_cd(dlco_cd);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setUnrcp_yn(unrcp_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 17:51:21 KST 2009 */