/***************************************************************************************************
* 파일명 : SS_L_JIYEOGCDDM.java
* 기능 : 공통-지역코드,코드명 목록을 위한 DM
* 작성일자 : 2003-11-15
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.common.ds.*;
import chosun.ciis.ss.sls.common.rec.*;

/**
 * 공통-지역코드,코드명 목록을 위한 DM
 */

public class SS_L_JIYEOGCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;

	public SS_L_JIYEOGCDDM(){}
	public SS_L_JIYEOGCDDM(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_JIYEOGCD( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_JIYEOGCDDM dm = (SS_L_JIYEOGCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SS_L_JIYEOGCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String Deptcd = req.getParameter("Deptcd");
if( Deptcd == null){
	System.out.println(this.toString+" : Deptcd is null" );
}else{
	System.out.println(this.toString+" : Deptcd is "+Deptcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String Deptcd = req.getParameter("Deptcd");
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 19 14:18:54 KST 2003 */