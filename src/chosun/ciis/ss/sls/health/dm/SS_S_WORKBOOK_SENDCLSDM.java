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


public class SS_S_WORKBOOK_SENDCLSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clsdt;

	public SS_S_WORKBOOK_SENDCLSDM(){}
	public SS_S_WORKBOOK_SENDCLSDM(String clsdt){
		this.clsdt = clsdt;
	}

	public void setClsdt(String clsdt){
		this.clsdt = clsdt;
	}

	public String getClsdt(){
		return this.clsdt;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_S_WORKBOOK_SENDCLS(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_WORKBOOK_SENDCLSDM dm = (SS_S_WORKBOOK_SENDCLSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clsdt);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.health.ds.SS_S_WORKBOOK_SENDCLSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("clsdt = [" + getClsdt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clsdt = req.getParameter("clsdt");
if( clsdt == null){
	System.out.println(this.toString+" : clsdt is null" );
}else{
	System.out.println(this.toString+" : clsdt is "+clsdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clsdt = Util.checkString(req.getParameter("clsdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clsdt = Util.Uni2Ksc(Util.checkString(req.getParameter("clsdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClsdt(clsdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 05 13:53:59 KST 2015 */