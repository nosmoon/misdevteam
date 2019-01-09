/***************************************************************************************************
* 파일명 : SS_S_RCPCMSBSDM.java
* 기능 : 지국지원-빌링-수납수수료-기준-상세
* 작성일자 : 2004-02-23
* 작성자 : 김영윤
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
 * 지국지원-빌링-수납수수료-기준-상세
 *
 */


public class SS_S_RCPCMSBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String comscd;

	public SS_S_RCPCMSBSDM(){}
	public SS_S_RCPCMSBSDM(String comscd){
		this.comscd = comscd;
	}

	public void setComscd(String comscd){
		this.comscd = comscd;
	}

	public String getComscd(){
		return this.comscd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_RCPCMSBS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_RCPCMSBSDM dm = (SS_S_RCPCMSBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.comscd);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_RCPCMSBSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String comscd = req.getParameter("comscd");
if( comscd == null){
	System.out.println(this.toString+" : comscd is null" );
}else{
	System.out.println(this.toString+" : comscd is "+comscd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String comscd = Util.checkString(req.getParameter("comscd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String comscd = Util.Uni2Ksc(Util.checkString(req.getParameter("comscd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setComscd(comscd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 25 11:24:46 KST 2004 */