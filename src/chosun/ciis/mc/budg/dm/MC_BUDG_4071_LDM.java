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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4071_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String date_fr;
	public String date_to;

	public MC_BUDG_4071_LDM(){}
	public MC_BUDG_4071_LDM(String cmpy_cd, String date_fr, String date_to){
		this.cmpy_cd = cmpy_cd;
		this.date_fr = date_fr;
		this.date_to = date_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDate_fr(String date_fr){
		this.date_fr = date_fr;
	}

	public void setDate_to(String date_to){
		this.date_to = date_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDate_fr(){
		return this.date_fr;
	}

	public String getDate_to(){
		return this.date_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4071_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4071_LDM dm = (MC_BUDG_4071_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.date_fr);
		cstmt.setString(5, dm.date_to);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4071_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("date_fr = [" + getDate_fr() + "]");
		System.out.println("date_to = [" + getDate_to() + "]");
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
String date_fr = req.getParameter("date_fr");
if( date_fr == null){
	System.out.println(this.toString+" : date_fr is null" );
}else{
	System.out.println(this.toString+" : date_fr is "+date_fr );
}
String date_to = req.getParameter("date_to");
if( date_to == null){
	System.out.println(this.toString+" : date_to is null" );
}else{
	System.out.println(this.toString+" : date_to is "+date_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String date_fr = Util.checkString(req.getParameter("date_fr"));
String date_to = Util.checkString(req.getParameter("date_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String date_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("date_fr")));
String date_to = Util.Uni2Ksc(Util.checkString(req.getParameter("date_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDate_fr(date_fr);
dm.setDate_to(date_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 11:32:51 KST 2009 */