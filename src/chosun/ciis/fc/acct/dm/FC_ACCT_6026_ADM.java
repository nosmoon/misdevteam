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


public class FC_ACCT_6026_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String proc_yymm;
	public String in_budg_cd;
	public String in_medi_cd;
	public String incmg_pers;
	public String fisc_dt;
	public String rmks1;
	public String rmks2;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String canc_flag;
	public String incmg_dt;
	public String hclam_dept_cd;

	public FC_ACCT_6026_ADM(){}
	public FC_ACCT_6026_ADM(String cmpy_cd, String proc_yymm, String in_budg_cd, String in_medi_cd, String incmg_pers, String fisc_dt, String rmks1, String rmks2, String chg_pers, String incmg_pers_ipadd, String canc_flag, String incmg_dt, String hclam_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.proc_yymm = proc_yymm;
		this.in_budg_cd = in_budg_cd;
		this.in_medi_cd = in_medi_cd;
		this.incmg_pers = incmg_pers;
		this.fisc_dt = fisc_dt;
		this.rmks1 = rmks1;
		this.rmks2 = rmks2;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.canc_flag = canc_flag;
		this.incmg_dt = incmg_dt;
		this.hclam_dept_cd = hclam_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProc_yymm(String proc_yymm){
		this.proc_yymm = proc_yymm;
	}

	public void setIn_budg_cd(String in_budg_cd){
		this.in_budg_cd = in_budg_cd;
	}

	public void setIn_medi_cd(String in_medi_cd){
		this.in_medi_cd = in_medi_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCanc_flag(String canc_flag){
		this.canc_flag = canc_flag;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setHclam_dept_cd(String hclam_dept_cd){
		this.hclam_dept_cd = hclam_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProc_yymm(){
		return this.proc_yymm;
	}

	public String getIn_budg_cd(){
		return this.in_budg_cd;
	}

	public String getIn_medi_cd(){
		return this.in_medi_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCanc_flag(){
		return this.canc_flag;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getHclam_dept_cd(){
		return this.hclam_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6026_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6026_ADM dm = (FC_ACCT_6026_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.proc_yymm);
		cstmt.setString(5, dm.in_budg_cd);
		cstmt.setString(6, dm.in_medi_cd);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.fisc_dt);
		cstmt.setString(9, dm.rmks1);
		cstmt.setString(10, dm.rmks2);
		cstmt.setString(11, dm.chg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.canc_flag);
		cstmt.setString(14, dm.incmg_dt);
		cstmt.setString(15, dm.hclam_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6026_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("proc_yymm = [" + getProc_yymm() + "]");
		System.out.println("in_budg_cd = [" + getIn_budg_cd() + "]");
		System.out.println("in_medi_cd = [" + getIn_medi_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("canc_flag = [" + getCanc_flag() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("hclam_dept_cd = [" + getHclam_dept_cd() + "]");
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
String proc_yymm = req.getParameter("proc_yymm");
if( proc_yymm == null){
	System.out.println(this.toString+" : proc_yymm is null" );
}else{
	System.out.println(this.toString+" : proc_yymm is "+proc_yymm );
}
String in_budg_cd = req.getParameter("in_budg_cd");
if( in_budg_cd == null){
	System.out.println(this.toString+" : in_budg_cd is null" );
}else{
	System.out.println(this.toString+" : in_budg_cd is "+in_budg_cd );
}
String in_medi_cd = req.getParameter("in_medi_cd");
if( in_medi_cd == null){
	System.out.println(this.toString+" : in_medi_cd is null" );
}else{
	System.out.println(this.toString+" : in_medi_cd is "+in_medi_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String canc_flag = req.getParameter("canc_flag");
if( canc_flag == null){
	System.out.println(this.toString+" : canc_flag is null" );
}else{
	System.out.println(this.toString+" : canc_flag is "+canc_flag );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String hclam_dept_cd = req.getParameter("hclam_dept_cd");
if( hclam_dept_cd == null){
	System.out.println(this.toString+" : hclam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : hclam_dept_cd is "+hclam_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String proc_yymm = Util.checkString(req.getParameter("proc_yymm"));
String in_budg_cd = Util.checkString(req.getParameter("in_budg_cd"));
String in_medi_cd = Util.checkString(req.getParameter("in_medi_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String canc_flag = Util.checkString(req.getParameter("canc_flag"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String hclam_dept_cd = Util.checkString(req.getParameter("hclam_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String proc_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_yymm")));
String in_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_budg_cd")));
String in_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("in_medi_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String canc_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_flag")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String hclam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hclam_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProc_yymm(proc_yymm);
dm.setIn_budg_cd(in_budg_cd);
dm.setIn_medi_cd(in_medi_cd);
dm.setIncmg_pers(incmg_pers);
dm.setFisc_dt(fisc_dt);
dm.setRmks1(rmks1);
dm.setRmks2(rmks2);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCanc_flag(canc_flag);
dm.setIncmg_dt(incmg_dt);
dm.setHclam_dept_cd(hclam_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 10:01:15 KST 2009 */