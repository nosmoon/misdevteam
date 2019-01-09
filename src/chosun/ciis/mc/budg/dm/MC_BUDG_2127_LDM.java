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


public class MC_BUDG_2127_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String budg_yyyy;

	public MC_BUDG_2127_LDM(){}
	public MC_BUDG_2127_LDM(String cmpy_cd, String budg_yyyy){
		this.cmpy_cd = cmpy_cd;
		this.budg_yyyy = budg_yyyy;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBudg_yyyy(String budg_yyyy){
		this.budg_yyyy = budg_yyyy;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBudg_yyyy(){
		return this.budg_yyyy;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2127_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2127_LDM dm = (MC_BUDG_2127_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.budg_yyyy);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2127_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("budg_yyyy = [" + getBudg_yyyy() + "]");
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
String budg_yyyy = req.getParameter("budg_yyyy");
if( budg_yyyy == null){
	System.out.println(this.toString+" : budg_yyyy is null" );
}else{
	System.out.println(this.toString+" : budg_yyyy is "+budg_yyyy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String budg_yyyy = Util.checkString(req.getParameter("budg_yyyy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String budg_yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yyyy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBudg_yyyy(budg_yyyy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 14:40:43 KST 2009 */