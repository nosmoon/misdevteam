/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_5420_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String valmm;
	public String extn_gb;

	public SS_SLS_EXTN_5420_LDM(){}
	public SS_SLS_EXTN_5420_LDM(String bocd, String valmm, String extn_gb){
		this.bocd = bocd;
		this.valmm = valmm;
		this.extn_gb = extn_gb;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setExtn_gb(String extn_gb){
		this.extn_gb = extn_gb;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getExtn_gb(){
		return this.extn_gb;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5420_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5420_LDM dm = (SS_SLS_EXTN_5420_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.valmm);
		cstmt.setString(5, dm.extn_gb);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5420_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("valmm = [" + getValmm() + "]");
		System.out.println("extn_gb = [" + getExtn_gb() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String extn_gb = req.getParameter("extn_gb");
if( extn_gb == null){
	System.out.println(this.toString+" : extn_gb is null" );
}else{
	System.out.println(this.toString+" : extn_gb is "+extn_gb );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String valmm = Util.checkString(req.getParameter("valmm"));
String extn_gb = Util.checkString(req.getParameter("extn_gb"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String extn_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_gb")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setValmm(valmm);
dm.setExtn_gb(extn_gb);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 15:32:11 KST 2017 */