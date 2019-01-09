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


public class MC_BUDG_5062_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_mm;
	public String sort;

	public MC_BUDG_5062_LDM(){}
	public MC_BUDG_5062_LDM(String cmpy_cd, String fisc_mm, String sort){
		this.cmpy_cd = cmpy_cd;
		this.fisc_mm = fisc_mm;
		this.sort = sort;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_mm(String fisc_mm){
		this.fisc_mm = fisc_mm;
	}

	public void setSort(String sort){
		this.sort = sort;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_mm(){
		return this.fisc_mm;
	}

	public String getSort(){
		return this.sort;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_5062_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_5062_LDM dm = (MC_BUDG_5062_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_mm);
		cstmt.setString(5, dm.sort);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_5062_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_mm = [" + getFisc_mm() + "]");
		System.out.println("sort = [" + getSort() + "]");
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
String fisc_mm = req.getParameter("fisc_mm");
if( fisc_mm == null){
	System.out.println(this.toString+" : fisc_mm is null" );
}else{
	System.out.println(this.toString+" : fisc_mm is "+fisc_mm );
}
String sort = req.getParameter("sort");
if( sort == null){
	System.out.println(this.toString+" : sort is null" );
}else{
	System.out.println(this.toString+" : sort is "+sort );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_mm = Util.checkString(req.getParameter("fisc_mm"));
String sort = Util.checkString(req.getParameter("sort"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_mm")));
String sort = Util.Uni2Ksc(Util.checkString(req.getParameter("sort")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_mm(fisc_mm);
dm.setSort(sort);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 10:17:51 KST 2009 */