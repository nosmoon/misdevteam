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


package chosun.ciis.ss.sls.health.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.health.ds.*;
import chosun.ciis.ss.sls.health.rec.*;

/**
 * 
 */


public class SS_A_WORKBOOK_APLCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String aplcdt;
	public String aplcno;
	public String status;

	public SS_A_WORKBOOK_APLCDM(){}
	public SS_A_WORKBOOK_APLCDM(String incmgpers, String aplcdt, String aplcno, String status){
		this.incmgpers = incmgpers;
		this.aplcdt = aplcdt;
		this.aplcno = aplcno;
		this.status = status;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}
	
	public void setStatus(String status){
		this.status = status;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getAplcno(){
		return this.aplcno;
	}
	
	public String getStatus(){
		return this.status;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_WORKBOOK_APLC(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_WORKBOOK_APLCDM dm = (SS_A_WORKBOOK_APLCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.aplcdt);
		cstmt.setString(5, dm.aplcno);
		cstmt.setString(6, dm.status);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.health.ds.SS_A_WORKBOOK_APLCDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("aplcdt = [" + getAplcdt() + "]");
		System.out.println("aplcno = [" + getAplcno() + "]");
		System.out.println("status = [" + getStatus() + "]");
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
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String aplcno = req.getParameter("aplcno");
if( aplcno == null){
	System.out.println(this.toString+" : aplcno is null" );
}else{
	System.out.println(this.toString+" : aplcno is "+aplcno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String aplcno = Util.checkString(req.getParameter("aplcno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAplcdt(aplcdt);
dm.setAplcno(aplcno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Dec 29 16:42:31 KST 2014 */