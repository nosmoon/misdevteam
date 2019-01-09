/***************************************************************************************************
 * 파일명   : SL_L_COMM_APT_RESULTDM.java
 * 기능     : 지국경영-아파트투입율-투입결과조회
 * 작성일자 : 2005/11/07
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  지국경영-아파트투입율-투입결과조회
**/

public class SL_L_COMM_APT_RESULTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String invsgdt1;
	public String invsgdt2;

	public SL_L_COMM_APT_RESULTDM(){}
	public SL_L_COMM_APT_RESULTDM(String bocd, String invsgdt1, String invsgdt2){
		this.bocd = bocd;
		this.invsgdt1 = invsgdt1;
		this.invsgdt2 = invsgdt2;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt1(String invsgdt1){
		this.invsgdt1 = invsgdt1;
	}

	public void setInvsgdt2(String invsgdt2){
		this.invsgdt2 = invsgdt2;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt1(){
		return this.invsgdt1;
	}

	public String getInvsgdt2(){
		return this.invsgdt2;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_COMM_APT_RESULT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_COMM_APT_RESULTDM dm = (SL_L_COMM_APT_RESULTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.invsgdt1);
		cstmt.setString(5, dm.invsgdt2);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, Types.INTEGER);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_L_COMM_APT_RESULTDataSet();
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
String invsgdt1 = req.getParameter("invsgdt1");
if( invsgdt1 == null){
	System.out.println(this.toString+" : invsgdt1 is null" );
}else{
	System.out.println(this.toString+" : invsgdt1 is "+invsgdt1 );
}
String invsgdt2 = req.getParameter("invsgdt2");
if( invsgdt2 == null){
	System.out.println(this.toString+" : invsgdt2 is null" );
}else{
	System.out.println(this.toString+" : invsgdt2 is "+invsgdt2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));
String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String invsgdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt1")));
String invsgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setInvsgdt1(invsgdt1);
dm.setInvsgdt2(invsgdt2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Nov 07 19:57:01 KST 2005 */