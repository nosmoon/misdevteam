/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.ds.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_2130_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String area_cd;
	public String incmg_pers;
	public String divn_dt1;
	public String divn_dt2;

	public SE_BNS_2130_LDM(){}
	public SE_BNS_2130_LDM(String cmpy_cd, String area_cd, String incmg_pers, String divn_dt1, String divn_dt2){
		this.cmpy_cd = cmpy_cd;
		this.area_cd = area_cd;
		this.incmg_pers = incmg_pers;
		this.divn_dt1 = divn_dt1;
		this.divn_dt2 = divn_dt2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setDivn_dt1(String divn_dt1){
		this.divn_dt1 = divn_dt1;
	}

	public void setDivn_dt2(String divn_dt2){
		this.divn_dt2 = divn_dt2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDivn_dt1(){
		return this.divn_dt1;
	}

	public String getDivn_dt2(){
		return this.divn_dt2;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_BNS_2130_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BNS_2130_LDM dm = (SE_BNS_2130_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.area_cd);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.divn_dt1);
		cstmt.setString(7, dm.divn_dt2);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.bns.ds.SE_BNS_2130_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("divn_dt1 = [" + getDivn_dt1() + "]");
		System.out.println("divn_dt2 = [" + getDivn_dt2() + "]");
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
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String divn_dt1 = req.getParameter("divn_dt1");
if( divn_dt1 == null){
	System.out.println(this.toString+" : divn_dt1 is null" );
}else{
	System.out.println(this.toString+" : divn_dt1 is "+divn_dt1 );
}
String divn_dt2 = req.getParameter("divn_dt2");
if( divn_dt2 == null){
	System.out.println(this.toString+" : divn_dt2 is null" );
}else{
	System.out.println(this.toString+" : divn_dt2 is "+divn_dt2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String divn_dt1 = Util.checkString(req.getParameter("divn_dt1"));
String divn_dt2 = Util.checkString(req.getParameter("divn_dt2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String divn_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_dt1")));
String divn_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("divn_dt2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setArea_cd(area_cd);
dm.setIncmg_pers(incmg_pers);
dm.setDivn_dt1(divn_dt1);
dm.setDivn_dt2(divn_dt2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */