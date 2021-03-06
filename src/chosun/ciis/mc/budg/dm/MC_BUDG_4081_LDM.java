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


public class MC_BUDG_4081_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_cd;

	public MC_BUDG_4081_LDM(){}
	public MC_BUDG_4081_LDM(String cmpy_cd, String evnt_cd){
		this.cmpy_cd = cmpy_cd;
		this.evnt_cd = evnt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_4081_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_4081_LDM dm = (MC_BUDG_4081_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_4081_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
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
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_cd(evnt_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 14:24:01 KST 2009 */