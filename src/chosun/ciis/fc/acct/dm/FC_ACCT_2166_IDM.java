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


public class FC_ACCT_2166_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_dt;
	public String impt_dept;
	public String chgcmg_pers;
	public String incmg_pers_ipadd;
	public String budg_yymm;
	public String incmg_pers;
	public String rmks1;

	public FC_ACCT_2166_IDM(){}
	public FC_ACCT_2166_IDM(String cmpy_cd, String incmg_dt, String impt_dept, String chgcmg_pers, String incmg_pers_ipadd, String budg_yymm, String incmg_pers, String rmks1){
		this.cmpy_cd = cmpy_cd;
		this.incmg_dt = incmg_dt;
		this.impt_dept = impt_dept;
		this.chgcmg_pers = chgcmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.budg_yymm = budg_yymm;
		this.incmg_pers = incmg_pers;
		this.rmks1 = rmks1;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setImpt_dept(String impt_dept){
		this.impt_dept = impt_dept;
	}

	public void setChgcmg_pers(String chgcmg_pers){
		this.chgcmg_pers = chgcmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getImpt_dept(){
		return this.impt_dept;
	}

	public String getChgcmg_pers(){
		return this.chgcmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2166_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2166_IDM dm = (FC_ACCT_2166_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_dt);
		cstmt.setString(5, dm.impt_dept);
		cstmt.setString(6, dm.chgcmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.budg_yymm);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.rmks1);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2166_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("impt_dept = [" + getImpt_dept() + "]");
		System.out.println("chgcmg_pers = [" + getChgcmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
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
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String impt_dept = req.getParameter("impt_dept");
if( impt_dept == null){
	System.out.println(this.toString+" : impt_dept is null" );
}else{
	System.out.println(this.toString+" : impt_dept is "+impt_dept );
}
String chgcmg_pers = req.getParameter("chgcmg_pers");
if( chgcmg_pers == null){
	System.out.println(this.toString+" : chgcmg_pers is null" );
}else{
	System.out.println(this.toString+" : chgcmg_pers is "+chgcmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String impt_dept = Util.checkString(req.getParameter("impt_dept"));
String chgcmg_pers = Util.checkString(req.getParameter("chgcmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String impt_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_dept")));
String chgcmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgcmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_dt(incmg_dt);
dm.setImpt_dept(impt_dept);
dm.setChgcmg_pers(chgcmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setBudg_yymm(budg_yymm);
dm.setIncmg_pers(incmg_pers);
dm.setRmks1(rmks1);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 11:51:55 KST 2009 */