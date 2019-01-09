/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무대상조회 (목록조회)
* 작성일자 : 2014.12.29
* 작성자 : 이혁
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


public class FC_ACCT_2631_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_dt;
	public String to_dt;
	public String fr_budg_cd;
	public String to_budg_cd;
	public String dlco_cmpy_cd;
	public String dlco_clsf_cd;
	public String slip_clsf_cd;
	public String budg_clsf_cd;
	public String cnfm_clsf_cd;

	public FC_ACCT_2631_LDM(){}
	public FC_ACCT_2631_LDM(String cmpy_cd, String fr_dt, String to_dt, String fr_budg_cd, String to_budg_cd, String dlco_cmpy_cd, String dlco_clsf_cd, String slip_clsf_cd, String budg_clsf_cd, String cnfm_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.fr_dt = fr_dt;
		this.to_dt = to_dt;
		this.fr_budg_cd = fr_budg_cd;
		this.to_budg_cd = to_budg_cd;
		this.dlco_cmpy_cd = dlco_cmpy_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.budg_clsf_cd = budg_clsf_cd;
		this.cnfm_clsf_cd = cnfm_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_dt(String fr_dt){
		this.fr_dt = fr_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setFr_budg_cd(String fr_budg_cd){
		this.fr_budg_cd = fr_budg_cd;
	}

	public void setTo_budg_cd(String to_budg_cd){
		this.to_budg_cd = to_budg_cd;
	}

	public void setDlco_cmpy_cd(String dlco_cmpy_cd){
		this.dlco_cmpy_cd = dlco_cmpy_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setBudg_clsf_cd(String budg_clsf_cd){
		this.budg_clsf_cd = budg_clsf_cd;
	}

	public void setCnfm_clsf_cd(String cnfm_clsf_cd){
		this.cnfm_clsf_cd = cnfm_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_dt(){
		return this.fr_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getFr_budg_cd(){
		return this.fr_budg_cd;
	}

	public String getTo_budg_cd(){
		return this.to_budg_cd;
	}

	public String getDlco_cmpy_cd(){
		return this.dlco_cmpy_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getBudg_clsf_cd(){
		return this.budg_clsf_cd;
	}

	public String getCnfm_clsf_cd(){
		return this.cnfm_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2631_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2631_LDM dm = (FC_ACCT_2631_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.fr_budg_cd);
		cstmt.setString(7, dm.to_budg_cd);
		cstmt.setString(8, dm.dlco_cmpy_cd);
		cstmt.setString(9, dm.dlco_clsf_cd);
		cstmt.setString(10, dm.slip_clsf_cd);
		cstmt.setString(11, dm.budg_clsf_cd);
		cstmt.setString(12, dm.cnfm_clsf_cd);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, Types.INTEGER);
		cstmt.registerOutParameter(15, Types.INTEGER);
		cstmt.registerOutParameter(16, Types.INTEGER);
		cstmt.registerOutParameter(17, Types.INTEGER);
		cstmt.registerOutParameter(18, Types.INTEGER);
		cstmt.registerOutParameter(19, Types.INTEGER);
		cstmt.registerOutParameter(20, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2631_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_dt = [" + getFr_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("fr_budg_cd = [" + getFr_budg_cd() + "]");
		System.out.println("to_budg_cd = [" + getTo_budg_cd() + "]");
		System.out.println("dlco_cmpy_cd = [" + getDlco_cmpy_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("budg_clsf_cd = [" + getBudg_clsf_cd() + "]");
		System.out.println("cnfm_clsf_cd = [" + getCnfm_clsf_cd() + "]");
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
String fr_dt = req.getParameter("fr_dt");
if( fr_dt == null){
	System.out.println(this.toString+" : fr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_dt is "+fr_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
String fr_budg_cd = req.getParameter("fr_budg_cd");
if( fr_budg_cd == null){
	System.out.println(this.toString+" : fr_budg_cd is null" );
}else{
	System.out.println(this.toString+" : fr_budg_cd is "+fr_budg_cd );
}
String to_budg_cd = req.getParameter("to_budg_cd");
if( to_budg_cd == null){
	System.out.println(this.toString+" : to_budg_cd is null" );
}else{
	System.out.println(this.toString+" : to_budg_cd is "+to_budg_cd );
}
String dlco_cmpy_cd = req.getParameter("dlco_cmpy_cd");
if( dlco_cmpy_cd == null){
	System.out.println(this.toString+" : dlco_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cmpy_cd is "+dlco_cmpy_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String budg_clsf_cd = req.getParameter("budg_clsf_cd");
if( budg_clsf_cd == null){
	System.out.println(this.toString+" : budg_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : budg_clsf_cd is "+budg_clsf_cd );
}
String cnfm_clsf_cd = req.getParameter("cnfm_clsf_cd");
if( cnfm_clsf_cd == null){
	System.out.println(this.toString+" : cnfm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : cnfm_clsf_cd is "+cnfm_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_dt = Util.checkString(req.getParameter("fr_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String fr_budg_cd = Util.checkString(req.getParameter("fr_budg_cd"));
String to_budg_cd = Util.checkString(req.getParameter("to_budg_cd"));
String dlco_cmpy_cd = Util.checkString(req.getParameter("dlco_cmpy_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String budg_clsf_cd = Util.checkString(req.getParameter("budg_clsf_cd"));
String cnfm_clsf_cd = Util.checkString(req.getParameter("cnfm_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String fr_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_budg_cd")));
String to_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_budg_cd")));
String dlco_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cmpy_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String budg_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clsf_cd")));
String cnfm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cnfm_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_dt(fr_dt);
dm.setTo_dt(to_dt);
dm.setFr_budg_cd(fr_budg_cd);
dm.setTo_budg_cd(to_budg_cd);
dm.setDlco_cmpy_cd(dlco_cmpy_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setBudg_clsf_cd(budg_clsf_cd);
dm.setCnfm_clsf_cd(cnfm_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 29 16:22:38 KST 2014 */