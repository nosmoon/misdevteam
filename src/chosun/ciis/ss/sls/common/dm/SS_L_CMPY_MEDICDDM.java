/***************************************************************************************************
* 파일명 : SS_L_CMPY_MEDICDDM.java
* 기능 : 공통-매체코드검색(회사별)을 위한 DM
* 작성일자 : 2004-03-20
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
 * 공통-매체코드검색(회사별)을 위한 DM
 */

public class SS_L_CMPY_MEDICDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;

	public SS_L_CMPY_MEDICDDM(){}
	public SS_L_CMPY_MEDICDDM(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CMPY_MEDICD( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CMPY_MEDICDDM dm = (SS_L_CMPY_MEDICDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SS_L_CMPY_MEDICDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 20 14:45:18 KST 2004 */