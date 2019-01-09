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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chcode;
	public String stdmonth;
	public String pubc_occr_dt;
	public String cuscode;
	public String agentcode;
	public String acct_trn_cnfm;
	public String salecode;
	public String incmg_pers;

	public AD_PUB_3110_LDM(){}
	public AD_PUB_3110_LDM(String cmpy_cd, String chcode, String stdmonth, String pubc_occr_dt, String cuscode, String agentcode, String acct_trn_cnfm, String salecode, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.chcode = chcode;
		this.stdmonth = stdmonth;
		this.pubc_occr_dt = pubc_occr_dt;
		this.cuscode = cuscode;
		this.agentcode = agentcode;
		this.acct_trn_cnfm = acct_trn_cnfm;
		this.salecode = salecode;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChcode(String chcode){
		this.chcode = chcode;
	}

	public void setStdmonth(String stdmonth){
		this.stdmonth = stdmonth;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setCuscode(String cuscode){
		this.cuscode = cuscode;
	}

	public void setAgentcode(String agentcode){
		this.agentcode = agentcode;
	}

	public void setAcct_trn_cnfm(String acct_trn_cnfm){
		this.acct_trn_cnfm = acct_trn_cnfm;
	}

	public void setSalecode(String salecode){
		this.salecode = salecode;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChcode(){
		return this.chcode;
	}

	public String getStdmonth(){
		return this.stdmonth;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getCuscode(){
		return this.cuscode;
	}

	public String getAgentcode(){
		return this.agentcode;
	}

	public String getAcct_trn_cnfm(){
		return this.acct_trn_cnfm;
	}

	public String getSalecode(){
		return this.salecode;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_PUB_3110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3110_LDM dm = (AD_PUB_3110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chcode);
		cstmt.setString(5, dm.stdmonth);
		cstmt.setString(6, dm.pubc_occr_dt);
		cstmt.setString(7, dm.cuscode);
		cstmt.setString(8, dm.agentcode);
		cstmt.setString(9, dm.acct_trn_cnfm);
		cstmt.setString(10, dm.salecode);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chcode = [" + getChcode() + "]");
		System.out.println("stdmonth = [" + getStdmonth() + "]");
		System.out.println("pubc_occr_dt = [" + getPubc_occr_dt() + "]");
		System.out.println("cuscode = [" + getCuscode() + "]");
		System.out.println("agentcode = [" + getAgentcode() + "]");
		System.out.println("acct_trn_cnfm = [" + getAcct_trn_cnfm() + "]");
		System.out.println("salecode = [" + getSalecode() + "]");
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
String chcode = req.getParameter("chcode");
if( chcode == null){
	System.out.println(this.toString+" : chcode is null" );
}else{
	System.out.println(this.toString+" : chcode is "+chcode );
}
String stdmonth = req.getParameter("stdmonth");
if( stdmonth == null){
	System.out.println(this.toString+" : stdmonth is null" );
}else{
	System.out.println(this.toString+" : stdmonth is "+stdmonth );
}
String pubc_occr_dt = req.getParameter("pubc_occr_dt");
if( pubc_occr_dt == null){
	System.out.println(this.toString+" : pubc_occr_dt is null" );
}else{
	System.out.println(this.toString+" : pubc_occr_dt is "+pubc_occr_dt );
}
String cuscode = req.getParameter("cuscode");
if( cuscode == null){
	System.out.println(this.toString+" : cuscode is null" );
}else{
	System.out.println(this.toString+" : cuscode is "+cuscode );
}
String agentcode = req.getParameter("agentcode");
if( agentcode == null){
	System.out.println(this.toString+" : agentcode is null" );
}else{
	System.out.println(this.toString+" : agentcode is "+agentcode );
}
String acct_trn_cnfm = req.getParameter("acct_trn_cnfm");
if( acct_trn_cnfm == null){
	System.out.println(this.toString+" : acct_trn_cnfm is null" );
}else{
	System.out.println(this.toString+" : acct_trn_cnfm is "+acct_trn_cnfm );
}
String salecode = req.getParameter("salecode");
if( salecode == null){
	System.out.println(this.toString+" : salecode is null" );
}else{
	System.out.println(this.toString+" : salecode is "+salecode );
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
String chcode = Util.checkString(req.getParameter("chcode"));
String stdmonth = Util.checkString(req.getParameter("stdmonth"));
String pubc_occr_dt = Util.checkString(req.getParameter("pubc_occr_dt"));
String cuscode = Util.checkString(req.getParameter("cuscode"));
String agentcode = Util.checkString(req.getParameter("agentcode"));
String acct_trn_cnfm = Util.checkString(req.getParameter("acct_trn_cnfm"));
String salecode = Util.checkString(req.getParameter("salecode"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chcode = Util.Uni2Ksc(Util.checkString(req.getParameter("chcode")));
String stdmonth = Util.Uni2Ksc(Util.checkString(req.getParameter("stdmonth")));
String pubc_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_occr_dt")));
String cuscode = Util.Uni2Ksc(Util.checkString(req.getParameter("cuscode")));
String agentcode = Util.Uni2Ksc(Util.checkString(req.getParameter("agentcode")));
String acct_trn_cnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_trn_cnfm")));
String salecode = Util.Uni2Ksc(Util.checkString(req.getParameter("salecode")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChcode(chcode);
dm.setStdmonth(stdmonth);
dm.setPubc_occr_dt(pubc_occr_dt);
dm.setCuscode(cuscode);
dm.setAgentcode(agentcode);
dm.setAcct_trn_cnfm(acct_trn_cnfm);
dm.setSalecode(salecode);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 17:53:37 KST 2015 */