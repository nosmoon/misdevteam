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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_8001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{
	
	public String cmpy_cd;
	public String drvr_cd;
	public String drvr_nm;
	public String use_yn;

	public MT_ETCCAR_8001_LDM(){}
	public MT_ETCCAR_8001_LDM(String cmpy_cd, String drvr_cd, String drvr_nm, String use_yn){
		this.cmpy_cd = cmpy_cd;
		this.drvr_cd = drvr_cd;
		this.drvr_nm = drvr_nm;
		this.use_yn = use_yn;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}
	
	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDrvr_cd(){
		return this.drvr_cd;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_8001_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_8001_LDM dm = (MT_ETCCAR_8001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.drvr_cd);
		cstmt.setString(5, dm.drvr_nm);
		cstmt.setString(6, dm.use_yn);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_8001_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("drvr_cd = [" + getDrvr_cd() + "]");
		System.out.println("drvr_nm = [" + getDrvr_nm() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String driver_cd = req.getParameter("driver_cd");
if( driver_cd == null){
	System.out.println(this.toString+" : driver_cd is null" );
}else{
	System.out.println(this.toString+" : driver_cd is "+driver_cd );
}
String driver_nm = req.getParameter("driver_nm");
if( driver_nm == null){
	System.out.println(this.toString+" : driver_nm is null" );
}else{
	System.out.println(this.toString+" : driver_nm is "+driver_nm );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String driver_cd = Util.checkString(req.getParameter("driver_cd"));
String driver_nm = Util.checkString(req.getParameter("driver_nm"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String driver_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("driver_cd")));
String driver_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("driver_nm")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDriver_cd(driver_cd);
dm.setDriver_nm(driver_nm);
dm.setUse_yn(use_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 21 16:57:55 KST 2012 */