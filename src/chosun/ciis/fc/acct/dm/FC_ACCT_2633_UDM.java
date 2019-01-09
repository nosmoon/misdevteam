/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무대상조회 (마감)
* 작성일자 : 2014.12.30
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


public class FC_ACCT_2633_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String obj_cmpy_cd;
	public String fisc_ym;
	public String clos_clsf;
	public String wrk_clsf;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_2633_UDM(){}
	public FC_ACCT_2633_UDM(String cmpy_cd, String obj_cmpy_cd, String fisc_ym, String clos_clsf, String wrk_clsf, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.obj_cmpy_cd = obj_cmpy_cd;
		this.fisc_ym = fisc_ym;
		this.wrk_clsf = wrk_clsf;
		this.clos_clsf = clos_clsf;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setObj_cmpy_cd(String obj_cmpy_cd){
		this.obj_cmpy_cd = obj_cmpy_cd;
	}

	public void setFisc_ym(String fisc_ym){
		this.fisc_ym = fisc_ym;
	}

	public void setWrk_clsf(String wrk_clsf){
		this.wrk_clsf = wrk_clsf;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}
	
	public String getObj_cmpy_cd(){
		return this.obj_cmpy_cd;
	}

	public String getFisc_ym(){
		return this.fisc_ym;
	}

	public String getWrk_clsf(){
		return this.wrk_clsf;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2633_U(? ,?, ? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2633_UDM dm = (FC_ACCT_2633_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.obj_cmpy_cd);
		cstmt.setString(5, dm.fisc_ym);
		cstmt.setString(6, dm.clos_clsf);
		cstmt.setString(7, dm.wrk_clsf);
		cstmt.setString(8, dm.incmg_pers_ipadd);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2633_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("obj_cmpy_cd = [" + getObj_cmpy_cd() + "]");
		System.out.println("fisc_ym = [" + getFisc_ym() + "]");
		System.out.println("wrk_clsf = [" + getWrk_clsf() + "]");
		System.out.println("clos_clsf = [" + getClos_clsf() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String fisc_ym = req.getParameter("fisc_ym");
if( fisc_ym == null){
	System.out.println(this.toString+" : fisc_ym is null" );
}else{
	System.out.println(this.toString+" : fisc_ym is "+fisc_ym );
}
String wrk_clsf = req.getParameter("wrk_clsf");
if( wrk_clsf == null){
	System.out.println(this.toString+" : wrk_clsf is null" );
}else{
	System.out.println(this.toString+" : wrk_clsf is "+wrk_clsf );
}
String clos_clsf = req.getParameter("clos_clsf");
if( clos_clsf == null){
	System.out.println(this.toString+" : clos_clsf is null" );
}else{
	System.out.println(this.toString+" : clos_clsf is "+clos_clsf );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String fisc_ym = Util.checkString(req.getParameter("fisc_ym"));
String wrk_clsf = Util.checkString(req.getParameter("wrk_clsf"));
String clos_clsf = Util.checkString(req.getParameter("clos_clsf"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_ym = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_ym")));
String wrk_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("wrk_clsf")));
String clos_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_clsf")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_ym(fisc_ym);
dm.setWrk_clsf(wrk_clsf);
dm.setClos_clsf(clos_clsf);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 30 18:07:09 KST 2014 */