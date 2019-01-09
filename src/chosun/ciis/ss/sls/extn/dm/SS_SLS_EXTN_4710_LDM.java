/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String dncomp;
	public String ern;
	public String budg_cd;
	public String from_make_dt;
	public String to_make_dt;
	public String aprvyn;

	public SS_SLS_EXTN_4710_LDM(){}
	public SS_SLS_EXTN_4710_LDM(String dncomp, String ern, String budg_cd, String from_make_dt, String to_make_dt, String aprvyn){
		this.dncomp = dncomp;
		this.ern = ern;
		this.budg_cd = budg_cd;
		this.from_make_dt = from_make_dt;
		this.to_make_dt = to_make_dt;
		this.aprvyn = aprvyn;
	}

	public void setDncomp(String dncomp){
		this.dncomp = dncomp;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setFrom_make_dt(String from_make_dt){
		this.from_make_dt = from_make_dt;
	}

	public void setTo_make_dt(String to_make_dt){
		this.to_make_dt = to_make_dt;
	}

	public void setAprvyn(String aprvyn){
		this.aprvyn = aprvyn;
	}

	public String getDncomp(){
		return this.dncomp;
	}

	public String getErn(){
		return this.ern;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getFrom_make_dt(){
		return this.from_make_dt;
	}

	public String getTo_make_dt(){
		return this.to_make_dt;
	}

	public String getAprvyn(){
		return this.aprvyn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4710_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4710_LDM dm = (SS_SLS_EXTN_4710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.dncomp);
		cstmt.setString(4, dm.ern);
		cstmt.setString(5, dm.budg_cd);
		cstmt.setString(6, dm.from_make_dt);
		cstmt.setString(7, dm.to_make_dt);
		cstmt.setString(8, dm.aprvyn);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("dncomp = [" + getDncomp() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("from_make_dt = [" + getFrom_make_dt() + "]");
		System.out.println("to_make_dt = [" + getTo_make_dt() + "]");
		System.out.println("aprvyn = [" + getAprvyn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String dncomp = req.getParameter("dncomp");
if( dncomp == null){
	System.out.println(this.toString+" : dncomp is null" );
}else{
	System.out.println(this.toString+" : dncomp is "+dncomp );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String from_make_dt = req.getParameter("from_make_dt");
if( from_make_dt == null){
	System.out.println(this.toString+" : from_make_dt is null" );
}else{
	System.out.println(this.toString+" : from_make_dt is "+from_make_dt );
}
String to_make_dt = req.getParameter("to_make_dt");
if( to_make_dt == null){
	System.out.println(this.toString+" : to_make_dt is null" );
}else{
	System.out.println(this.toString+" : to_make_dt is "+to_make_dt );
}
String aprvyn = req.getParameter("aprvyn");
if( aprvyn == null){
	System.out.println(this.toString+" : aprvyn is null" );
}else{
	System.out.println(this.toString+" : aprvyn is "+aprvyn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String dncomp = Util.checkString(req.getParameter("dncomp"));
String ern = Util.checkString(req.getParameter("ern"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String from_make_dt = Util.checkString(req.getParameter("from_make_dt"));
String to_make_dt = Util.checkString(req.getParameter("to_make_dt"));
String aprvyn = Util.checkString(req.getParameter("aprvyn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String from_make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_make_dt")));
String to_make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_make_dt")));
String aprvyn = Util.Uni2Ksc(Util.checkString(req.getParameter("aprvyn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDncomp(dncomp);
dm.setErn(ern);
dm.setBudg_cd(budg_cd);
dm.setFrom_make_dt(from_make_dt);
dm.setTo_make_dt(to_make_dt);
dm.setAprvyn(aprvyn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 23 17:01:46 KST 2016 */