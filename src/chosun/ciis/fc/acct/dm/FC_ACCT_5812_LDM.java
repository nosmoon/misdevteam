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


public class FC_ACCT_5812_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frbudg_cd;
	public String tobudg_cd;
	public String frfisc_dt;
	public String tofisc_dt;

	public FC_ACCT_5812_LDM(){}
	public FC_ACCT_5812_LDM(String cmpy_cd, String frbudg_cd, String tobudg_cd, String frfisc_dt, String tofisc_dt){
		this.cmpy_cd = cmpy_cd;
		this.frbudg_cd = frbudg_cd;
		this.tobudg_cd = tobudg_cd;
		this.frfisc_dt = frfisc_dt;
		this.tofisc_dt = tofisc_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrbudg_cd(String frbudg_cd){
		this.frbudg_cd = frbudg_cd;
	}

	public void setTobudg_cd(String tobudg_cd){
		this.tobudg_cd = tobudg_cd;
	}

	public void setFrfisc_dt(String frfisc_dt){
		this.frfisc_dt = frfisc_dt;
	}

	public void setTofisc_dt(String tofisc_dt){
		this.tofisc_dt = tofisc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrbudg_cd(){
		return this.frbudg_cd;
	}

	public String getTobudg_cd(){
		return this.tobudg_cd;
	}

	public String getFrfisc_dt(){
		return this.frfisc_dt;
	}

	public String getTofisc_dt(){
		return this.tofisc_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5812_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5812_LDM dm = (FC_ACCT_5812_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frbudg_cd);
		cstmt.setString(5, dm.tobudg_cd);
		cstmt.setString(6, dm.frfisc_dt);
		cstmt.setString(7, dm.tofisc_dt);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5812_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frbudg_cd = [" + getFrbudg_cd() + "]");
		System.out.println("tobudg_cd = [" + getTobudg_cd() + "]");
		System.out.println("frfisc_dt = [" + getFrfisc_dt() + "]");
		System.out.println("tofisc_dt = [" + getTofisc_dt() + "]");
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
String frbudg_cd = req.getParameter("frbudg_cd");
if( frbudg_cd == null){
	System.out.println(this.toString+" : frbudg_cd is null" );
}else{
	System.out.println(this.toString+" : frbudg_cd is "+frbudg_cd );
}
String tobudg_cd = req.getParameter("tobudg_cd");
if( tobudg_cd == null){
	System.out.println(this.toString+" : tobudg_cd is null" );
}else{
	System.out.println(this.toString+" : tobudg_cd is "+tobudg_cd );
}
String frfisc_dt = req.getParameter("frfisc_dt");
if( frfisc_dt == null){
	System.out.println(this.toString+" : frfisc_dt is null" );
}else{
	System.out.println(this.toString+" : frfisc_dt is "+frfisc_dt );
}
String tofisc_dt = req.getParameter("tofisc_dt");
if( tofisc_dt == null){
	System.out.println(this.toString+" : tofisc_dt is null" );
}else{
	System.out.println(this.toString+" : tofisc_dt is "+tofisc_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frbudg_cd = Util.checkString(req.getParameter("frbudg_cd"));
String tobudg_cd = Util.checkString(req.getParameter("tobudg_cd"));
String frfisc_dt = Util.checkString(req.getParameter("frfisc_dt"));
String tofisc_dt = Util.checkString(req.getParameter("tofisc_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frbudg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frbudg_cd")));
String tobudg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tobudg_cd")));
String frfisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("frfisc_dt")));
String tofisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("tofisc_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrbudg_cd(frbudg_cd);
dm.setTobudg_cd(tobudg_cd);
dm.setFrfisc_dt(frfisc_dt);
dm.setTofisc_dt(tofisc_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 26 09:46:59 KST 2018 */