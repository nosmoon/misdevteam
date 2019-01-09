/***************************************************************************************************
 * 파일명   : SP_SS_L_WEEKSND_CLOS_PRINT
 * 기능     : 지국지원-주간조선관리-송금목록 엑셀저장 
 * 작성일자 : 2007/05/14
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
**  SP_SS_L_WEEKSND_CLOS_PRINT
**/

public class SS_L_WEEKSND_CLOS_PRINTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closyymm;

	public SS_L_WEEKSND_CLOS_PRINTDM(){}
	public SS_L_WEEKSND_CLOS_PRINTDM(String closyymm){
		this.closyymm = closyymm;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_WEEKSND_CLOS_PRINT( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_WEEKSND_CLOS_PRINTDM dm = (SS_L_WEEKSND_CLOS_PRINTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closyymm);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_WEEKSND_CLOS_PRINTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String closyymm = Util.checkString(req.getParameter("closyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosyymm(closyymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 16 11:16:39 KST 2007 */