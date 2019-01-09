/***************************************************************************************************
 * 파일명   : SP_SS_L_CVSRECP_PRINT
 * 기능     : 지국지원-빌링-편의점수납현황-엑셀다운로드
 * 작성일자 : 2007/04/20
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
**  SP_SS_L_CVSRECP_PRINT
**/

public class SS_L_CVSRECP_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String fromdt;
	public String todt;
	public String bocd;
	public String girono;
	public String recpbankcd;

	public SS_L_CVSRECP_PRINTDM(){}
	public SS_L_CVSRECP_PRINTDM(String fromdt, String todt, String bocd, String girono, String recpbankcd){
		this.fromdt = fromdt;
		this.todt = todt;
		this.bocd = bocd;
		this.girono = girono;
		this.recpbankcd = recpbankcd;
	}

	public void setFromdt(String fromdt){
		this.fromdt = fromdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setRecpbankcd(String recpbankcd){
		this.recpbankcd = recpbankcd;
	}

	public String getFromdt(){
		return this.fromdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getGirono(){
		return this.girono;
	}

	public String getRecpbankcd(){
		return this.recpbankcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CVSRECP_PRINT( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CVSRECP_PRINTDM dm = (SS_L_CVSRECP_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.fromdt);
		cstmt.setString(4, dm.todt);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.girono);
		cstmt.setString(7, dm.recpbankcd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_CVSRECP_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String fromdt = req.getParameter("fromdt");
if( fromdt == null){
	System.out.println(this.toString+" : fromdt is null" );
}else{
	System.out.println(this.toString+" : fromdt is "+fromdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
}
String recpbankcd = req.getParameter("recpbankcd");
if( recpbankcd == null){
	System.out.println(this.toString+" : recpbankcd is null" );
}else{
	System.out.println(this.toString+" : recpbankcd is "+recpbankcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String fromdt = Util.checkString(req.getParameter("fromdt"));
String todt = Util.checkString(req.getParameter("todt"));
String bocd = Util.checkString(req.getParameter("bocd"));
String girono = Util.checkString(req.getParameter("girono"));
String recpbankcd = Util.checkString(req.getParameter("recpbankcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String recpbankcd = Util.Uni2Ksc(Util.checkString(req.getParameter("recpbankcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFromdt(fromdt);
dm.setTodt(todt);
dm.setBocd(bocd);
dm.setGirono(girono);
dm.setRecpbankcd(recpbankcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 20 16:49:10 KST 2007 */