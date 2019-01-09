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


public class SS_SLS_EXTN_4840_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String valmm;
	public String clos;
	public String paydt;

	public SS_SLS_EXTN_4840_UDM(){}
	public SS_SLS_EXTN_4840_UDM(String incmgpers, String valmm, String clos, String paydt){
		this.incmgpers = incmgpers;
		this.valmm = valmm;
		this.clos = clos;
		this.paydt = paydt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setClos(String clos){
		this.clos = clos;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getClos(){
		return this.clos;
	}

	public String getPaydt(){
		return this.paydt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4840_U(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4840_UDM dm = (SS_SLS_EXTN_4840_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.valmm);
		cstmt.setString(5, dm.clos);
		cstmt.setString(6, dm.paydt);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4840_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("valmm = [" + getValmm() + "]");
		System.out.println("clos = [" + getClos() + "]");
		System.out.println("paydt = [" + getPaydt() + "]");
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
String clos = req.getParameter("clos");
if( clos == null){
	System.out.println(this.toString+" : clos is null" );
}else{
	System.out.println(this.toString+" : clos is "+clos );
}
String paydt = req.getParameter("paydt");
if( paydt == null){
	System.out.println(this.toString+" : paydt is null" );
}else{
	System.out.println(this.toString+" : paydt is "+paydt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String valmm = Util.checkString(req.getParameter("valmm"));
String clos = Util.checkString(req.getParameter("clos"));
String paydt = Util.checkString(req.getParameter("paydt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String clos = Util.Uni2Ksc(Util.checkString(req.getParameter("clos")));
String paydt = Util.Uni2Ksc(Util.checkString(req.getParameter("paydt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setValmm(valmm);
dm.setClos(clos);
dm.setPaydt(paydt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 20 15:14:05 KST 2016 */