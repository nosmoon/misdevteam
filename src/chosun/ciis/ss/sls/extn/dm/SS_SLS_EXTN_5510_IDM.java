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


public class SS_SLS_EXTN_5510_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String yymm;
	public String bocd;
	public String extnaloncd;
	public String amt;

	public SS_SLS_EXTN_5510_IDM(){}
	public SS_SLS_EXTN_5510_IDM(String incmgpers, String yymm, String bocd, String extnaloncd, String amt){
		this.incmgpers = incmgpers;
		this.yymm = yymm;
		this.bocd = bocd;
		this.extnaloncd = extnaloncd;
		this.amt = amt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setExtnaloncd(String extnaloncd){
		this.extnaloncd = extnaloncd;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getExtnaloncd(){
		return this.extnaloncd;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5510_I(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5510_IDM dm = (SS_SLS_EXTN_5510_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.extnaloncd);
		cstmt.setString(7, dm.amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5510_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("extnaloncd = [" + getExtnaloncd() + "]");
		System.out.println("amt = [" + getAmt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String extnaloncd = req.getParameter("extnaloncd");
if( extnaloncd == null){
	System.out.println(this.toString+" : extnaloncd is null" );
}else{
	System.out.println(this.toString+" : extnaloncd is "+extnaloncd );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yymm = Util.checkString(req.getParameter("yymm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String extnaloncd = Util.checkString(req.getParameter("extnaloncd"));
String amt = Util.checkString(req.getParameter("amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String extnaloncd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnaloncd")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setYymm(yymm);
dm.setBocd(bocd);
dm.setExtnaloncd(extnaloncd);
dm.setAmt(amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 31 15:43:48 KST 2017 */