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


public class FC_ACCT_8003_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;
	public String acct_cd1;
	public String acct_cd2;
	public String incm_clsf_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_ACCT_8003_IDM(){}
	public FC_ACCT_8003_IDM(String cmpy_cd, String from_fisc_dt, String to_fisc_dt, String acct_cd1, String acct_cd2, String incm_clsf_cd, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.from_fisc_dt = from_fisc_dt;
		this.to_fisc_dt = to_fisc_dt;
		this.acct_cd1 = acct_cd1;
		this.acct_cd2 = acct_cd2;
		this.incm_clsf_cd = incm_clsf_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_fisc_dt(String from_fisc_dt){
		this.from_fisc_dt = from_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public void setAcct_cd1(String acct_cd1){
		this.acct_cd1 = acct_cd1;
	}

	public void setAcct_cd2(String acct_cd2){
		this.acct_cd2 = acct_cd2;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_fisc_dt(){
		return this.from_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}

	public String getAcct_cd1(){
		return this.acct_cd1;
	}

	public String getAcct_cd2(){
		return this.acct_cd2;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_8003_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_8003_IDM dm = (FC_ACCT_8003_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_fisc_dt);
		cstmt.setString(5, dm.to_fisc_dt);
		cstmt.setString(6, dm.acct_cd1);
		cstmt.setString(7, dm.acct_cd2);
		cstmt.setString(8, dm.incm_clsf_cd);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_8003_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_fisc_dt = [" + getFrom_fisc_dt() + "]");
		System.out.println("to_fisc_dt = [" + getTo_fisc_dt() + "]");
		System.out.println("acct_cd1 = [" + getAcct_cd1() + "]");
		System.out.println("acct_cd2 = [" + getAcct_cd2() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String from_fisc_dt = req.getParameter("from_fisc_dt");
if( from_fisc_dt == null){
	System.out.println(this.toString+" : from_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : from_fisc_dt is "+from_fisc_dt );
}
String to_fisc_dt = req.getParameter("to_fisc_dt");
if( to_fisc_dt == null){
	System.out.println(this.toString+" : to_fisc_dt is null" );
}else{
	System.out.println(this.toString+" : to_fisc_dt is "+to_fisc_dt );
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
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_fisc_dt = Util.checkString(req.getParameter("from_fisc_dt"));
String to_fisc_dt = Util.checkString(req.getParameter("to_fisc_dt"));
String acct_cd1 = Util.checkString(req.getParameter("acct_cd1"));
String acct_cd2 = Util.checkString(req.getParameter("acct_cd2"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_fisc_dt")));
String to_fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_fisc_dt")));
String acct_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd1")));
String acct_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_cd2")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_fisc_dt(from_fisc_dt);
dm.setTo_fisc_dt(to_fisc_dt);
dm.setAcct_cd1(acct_cd1);
dm.setAcct_cd2(acct_cd2);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 15:18:51 KST 2009 */