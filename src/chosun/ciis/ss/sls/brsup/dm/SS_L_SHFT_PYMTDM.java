/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMTDM.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부자목록
* 작성일자 : 2004-04-01
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
 * 지국업무지원-Billing자동이체-납부자관리-납부자목록
 *
 */


public class SS_L_SHFT_PYMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sechcond;
	public String sechcont;

	public SS_L_SHFT_PYMTDM(){}
	public SS_L_SHFT_PYMTDM(String sechcond, String sechcont){
		this.sechcond = sechcond;
		this.sechcont = sechcont;
	}

	public void setSechcond(String sechcond){
		this.sechcond = sechcond;
	}

	public void setSechcont(String sechcont){
		this.sechcont = sechcont;
	}

	public String getSechcond(){
		return this.sechcond;
	}

	public String getSechcont(){
		return this.sechcont;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFT_PYMT( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFT_PYMTDM dm = (SS_L_SHFT_PYMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sechcond);
		cstmt.setString(4, dm.sechcont);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFT_PYMTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String sechcond = req.getParameter("sechcond");
if( sechcond == null){
	System.out.println(this.toString+" : sechcond is null" );
}else{
	System.out.println(this.toString+" : sechcond is "+sechcond );
}
String sechcont = req.getParameter("sechcont");
if( sechcont == null){
	System.out.println(this.toString+" : sechcont is null" );
}else{
	System.out.println(this.toString+" : sechcont is "+sechcont );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String sechcond = Util.checkString(req.getParameter("sechcond"));
String sechcont = Util.checkString(req.getParameter("sechcont"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String sechcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcond")));
String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSechcond(sechcond);
dm.setSechcont(sechcont);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 09 13:58:55 KST 2004 */