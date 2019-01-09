/***************************************************************************************************
* 파일명 : SS_L_QTYAPLC_ILGYEDM.java
* 기능 : 지국경영 - 부수증감 - 본지(담당) - 지역단위 부수현황 조회
* 작성일자 : 2009-04-30
* 작성자 : 황성진
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_L_QTYAPLC_ILGYEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String arealist;

	public SS_L_QTYAPLC_ILGYEDM(){}
	public SS_L_QTYAPLC_ILGYEDM(String arealist){
		this.arealist = arealist;
	}

	public void setArealist(String arealist){
		this.arealist = arealist;
	}

	public String getArealist(){
		return this.arealist;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_QTYAPLC_ILGYE( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_QTYAPLC_ILGYEDM dm = (SS_L_QTYAPLC_ILGYEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.arealist);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLC_ILGYEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String arealist = req.getParameter("arealist");
if( arealist == null){
	System.out.println(this.toString+" : arealist is null" );
}else{
	System.out.println(this.toString+" : arealist is "+arealist );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String arealist = Util.checkString(req.getParameter("arealist"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String arealist = Util.Uni2Ksc(Util.checkString(req.getParameter("arealist")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setArealist(arealist);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 17:41:27 KST 2009 */