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


package chosun.ciis.ss.sls.move.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.ds.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_A_MOVM_RDR_TEMP_CLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String yyyymm;

	public SS_A_MOVM_RDR_TEMP_CLOSDM(){}
	public SS_A_MOVM_RDR_TEMP_CLOSDM(String incmgpers, String yyyymm){
		this.incmgpers = incmgpers;
		this.yyyymm = yyyymm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_MOVM_RDR_TEMP_CLOS(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_MOVM_RDR_TEMP_CLOSDM dm = (SS_A_MOVM_RDR_TEMP_CLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.yyyymm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.move.ds.SS_A_MOVM_RDR_TEMP_CLOSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setYyyymm(yyyymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 03 09:33:49 GMT 2014 */