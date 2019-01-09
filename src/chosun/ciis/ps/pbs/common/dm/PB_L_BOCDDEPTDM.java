/***************************************************************************************************
 * 파일명   : PB_L_BOCDDEPTDM.java
 * 기능     : 공통-지사별 부서검색
 * 작성일자 : 2004-03-08
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * 공통-지사별 부서검색
 */

public class PB_L_BOCDDEPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;

	public PB_L_BOCDDEPTDM(){}
	public PB_L_BOCDDEPTDM(String bocd, String incmgpers){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_PB_L_BOCDDEPT( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PB_L_BOCDDEPTDM dm = (PB_L_BOCDDEPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.common.ds.PB_L_BOCDDEPTDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 08 16:18:05 KST 2004 */