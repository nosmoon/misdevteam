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


public class SS_L_RDR_EXTN_BO_RSLT_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String frdt;
	public String stafnm;

	public SS_L_RDR_EXTN_BO_RSLT_PRINTDM(){}
	public SS_L_RDR_EXTN_BO_RSLT_PRINTDM(String frdt, String stafnm){
		this.frdt = frdt;
		this.stafnm = stafnm;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_RDR_EXTN_BO_RSLT_PRINT(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_BO_RSLT_PRINTDM dm = (SS_L_RDR_EXTN_BO_RSLT_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.frdt);
		cstmt.setString(4, dm.stafnm);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("stafnm = [" + getStafnm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String frdt = Util.checkString(req.getParameter("frdt"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setFrdt(frdt);
dm.setStafnm(stafnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 21 09:42:38 KST 2015 */