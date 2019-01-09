/***************************************************************************************************
* 파일명 : SS_L_PYMT_CNTRDM.java
* 기능 : 지국업무지원-Billing자동이체-납부계약목록
* 작성일자 : 2004-03-18
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국업무지원-Billing자동이체-납부계약목록
 *
 */


public class SS_L_PYMT_CNTRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String subsstat;

	public SS_L_PYMT_CNTRDM(){}
	public SS_L_PYMT_CNTRDM(String subsstat){
		this.subsstat = subsstat;
	}

	public void setSubsstat(String subsstat){
		this.subsstat = subsstat;
	}

	public String getSubsstat(){
		return this.subsstat;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_PYMT_CNTR( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_PYMT_CNTRDM dm = (SS_L_PYMT_CNTRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.subsstat);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_PYMT_CNTRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String subsstat = req.getParameter("subsstat");
if( subsstat == null){
	System.out.println(this.toString+" : subsstat is null" );
}else{
	System.out.println(this.toString+" : subsstat is "+subsstat );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String subsstat = Util.checkString(req.getParameter("subsstat"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String subsstat = Util.Uni2Ksc(Util.checkString(req.getParameter("subsstat")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSubsstat(subsstat);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 22 22:02:33 KST 2004 */