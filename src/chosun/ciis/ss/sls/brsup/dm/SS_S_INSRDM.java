/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국지원-상해보험-등록-상세
* 작성일자 : 2010-01-26
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 *  지국지원-상해보험-등록-상세
 */

public class SS_S_INSRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cntryy;

	public SS_S_INSRDM(){}
	public SS_S_INSRDM(String cntryy){
		this.cntryy = cntryy;
	}

	public void setCntryy(String cntryy){
		this.cntryy = cntryy;
	}

	public String getCntryy(){
		return this.cntryy;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_INSR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_INSRDM dm = (SS_S_INSRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cntryy);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_S_INSRDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cntryy = req.getParameter("cntryy");
if( cntryy == null){
	System.out.println(this.toString+" : cntryy is null" );
}else{
	System.out.println(this.toString+" : cntryy is "+cntryy );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cntryy = Util.checkString(req.getParameter("cntryy"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cntryy = Util.Uni2Ksc(Util.checkString(req.getParameter("cntryy")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCntryy(cntryy);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 08 10:23:25 KST 2010 */