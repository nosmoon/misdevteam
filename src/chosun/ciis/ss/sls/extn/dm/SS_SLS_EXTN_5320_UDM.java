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


public class SS_SLS_EXTN_5320_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String valmm;
	public String bocd;
	public String meda_amt;

	public SS_SLS_EXTN_5320_UDM(){}
	public SS_SLS_EXTN_5320_UDM(String incmgpers, String valmm, String bocd, String meda_amt){
		this.incmgpers = incmgpers;
		this.valmm = valmm;
		this.bocd = bocd;
		this.meda_amt = meda_amt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_5320_U(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_5320_UDM dm = (SS_SLS_EXTN_5320_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.valmm);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.meda_amt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_5320_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("valmm = [" + getValmm() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("meda_amt = [" + getMeda_amt() + "]");
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
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String meda_amt = req.getParameter("meda_amt");
if( meda_amt == null){
	System.out.println(this.toString+" : meda_amt is null" );
}else{
	System.out.println(this.toString+" : meda_amt is "+meda_amt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String valmm = Util.checkString(req.getParameter("valmm"));
String bocd = Util.checkString(req.getParameter("bocd"));
String meda_amt = Util.checkString(req.getParameter("meda_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String meda_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("meda_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setValmm(valmm);
dm.setBocd(bocd);
dm.setMeda_amt(meda_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 11 15:30:58 KST 2017 */