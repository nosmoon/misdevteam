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


public class MC_BUDG_2126_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_budg_clas_cd;
	public String to_budg_clas_cd;
	public String evnt_cd;

	public MC_BUDG_2126_LDM(){}
	public MC_BUDG_2126_LDM(String cmpy_cd, String from_budg_clas_cd, String to_budg_clas_cd, String evnt_cd){
		this.cmpy_cd = cmpy_cd;
		this.from_budg_clas_cd = from_budg_clas_cd;
		this.to_budg_clas_cd = to_budg_clas_cd;
		this.evnt_cd = evnt_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_budg_clas_cd(String from_budg_clas_cd){
		this.from_budg_clas_cd = from_budg_clas_cd;
	}

	public void setTo_budg_clas_cd(String to_budg_clas_cd){
		this.to_budg_clas_cd = to_budg_clas_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_budg_clas_cd(){
		return this.from_budg_clas_cd;
	}

	public String getTo_budg_clas_cd(){
		return this.to_budg_clas_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_2126_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_2126_LDM dm = (MC_BUDG_2126_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_budg_clas_cd);
		cstmt.setString(5, dm.to_budg_clas_cd);
		cstmt.setString(6, dm.evnt_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_2126_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_budg_clas_cd = [" + getFrom_budg_clas_cd() + "]");
		System.out.println("to_budg_clas_cd = [" + getTo_budg_clas_cd() + "]");
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
String from_budg_clas_cd = req.getParameter("from_budg_clas_cd");
if( from_budg_clas_cd == null){
	System.out.println(this.toString+" : from_budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : from_budg_clas_cd is "+from_budg_clas_cd );
}
String to_budg_clas_cd = req.getParameter("to_budg_clas_cd");
if( to_budg_clas_cd == null){
	System.out.println(this.toString+" : to_budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : to_budg_clas_cd is "+to_budg_clas_cd );
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
String from_budg_clas_cd = Util.checkString(req.getParameter("from_budg_clas_cd"));
String to_budg_clas_cd = Util.checkString(req.getParameter("to_budg_clas_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("from_budg_clas_cd")));
String to_budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("to_budg_clas_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_budg_clas_cd(from_budg_clas_cd);
dm.setTo_budg_clas_cd(to_budg_clas_cd);
dm.setEvnt_cd(evnt_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 27 13:35:43 KST 2009 */