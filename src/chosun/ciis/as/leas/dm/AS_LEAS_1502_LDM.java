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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1502_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_to_dt1;
	public String leas_to_dt2;
	public String bldg_cd;

	public AS_LEAS_1502_LDM(){}
	public AS_LEAS_1502_LDM(String cmpy_cd, String leas_to_dt1, String leas_to_dt2, String bldg_cd){
		this.cmpy_cd = cmpy_cd;
		this.leas_to_dt1 = leas_to_dt1;
		this.leas_to_dt2 = leas_to_dt2;
		this.bldg_cd = bldg_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_to_dt1(String leas_to_dt1){
		this.leas_to_dt1 = leas_to_dt1;
	}

	public void setLeas_to_dt2(String leas_to_dt2){
		this.leas_to_dt2 = leas_to_dt2;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_to_dt1(){
		return this.leas_to_dt1;
	}

	public String getLeas_to_dt2(){
		return this.leas_to_dt2;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1502_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1502_LDM dm = (AS_LEAS_1502_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.leas_to_dt1);
		cstmt.setString(5, dm.leas_to_dt2);
		cstmt.setString(6, dm.bldg_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1502_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("leas_to_dt1 = [" + getLeas_to_dt1() + "]");
		System.out.println("leas_to_dt2 = [" + getLeas_to_dt2() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
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
String leas_to_dt1 = req.getParameter("leas_to_dt1");
if( leas_to_dt1 == null){
	System.out.println(this.toString+" : leas_to_dt1 is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt1 is "+leas_to_dt1 );
}
String leas_to_dt2 = req.getParameter("leas_to_dt2");
if( leas_to_dt2 == null){
	System.out.println(this.toString+" : leas_to_dt2 is null" );
}else{
	System.out.println(this.toString+" : leas_to_dt2 is "+leas_to_dt2 );
}
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String leas_to_dt1 = Util.checkString(req.getParameter("leas_to_dt1"));
String leas_to_dt2 = Util.checkString(req.getParameter("leas_to_dt2"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String leas_to_dt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt1")));
String leas_to_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_to_dt2")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setLeas_to_dt1(leas_to_dt1);
dm.setLeas_to_dt2(leas_to_dt2);
dm.setBldg_cd(bldg_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 13:47:38 KST 2009 */