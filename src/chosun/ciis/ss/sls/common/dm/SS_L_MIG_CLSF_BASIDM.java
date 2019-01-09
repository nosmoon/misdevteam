/***************************************************************************************************
* 파일명 : SS_L_MIG_CLSF_BASIDM.java
* 기능 : 공통-지급기준코드(기급구분별)(마일리지)을 위한 DM
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
 * 공통-지급기준코드(기급구분별)(마일리지)을 위한 DM
 */

public class SS_L_MIG_CLSF_BASIDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String payclsfcd;

	public SS_L_MIG_CLSF_BASIDM(){}
	public SS_L_MIG_CLSF_BASIDM(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public void setPayclsfcd(String payclsfcd){
		this.payclsfcd = payclsfcd;
	}

	public String getPayclsfcd(){
		return this.payclsfcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MIG_CLSF_BASI( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MIG_CLSF_BASIDM dm = (SS_L_MIG_CLSF_BASIDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.payclsfcd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.common.ds.SS_L_MIG_CLSF_BASIDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String payclsfcd = req.getParameter("payclsfcd");
if( payclsfcd == null){
	System.out.println(this.toString+" : payclsfcd is null" );
}else{
	System.out.println(this.toString+" : payclsfcd is "+payclsfcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String payclsfcd = Util.checkString(req.getParameter("payclsfcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String payclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("payclsfcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setPayclsfcd(payclsfcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 20 16:47:30 KST 2004 */