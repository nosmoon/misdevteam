/***************************************************************************************************
* 파일명 : CO_L_CDV_CICDGBDM.java
* 기능 : 관리자-공통코드-코드구분 목록을 위한 DM
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-공통코드-코드구분 목록을 위한 DM
 */

public class CO_L_CDV_CICDGBDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String ciymgbcd;

	public CO_L_CDV_CICDGBDM(){}
	public CO_L_CDV_CICDGBDM(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getSQL(){
		 return "{ call SP_CO_L_CDV_CICDGB( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_CDV_CICDGBDM dm = (CO_L_CDV_CICDGBDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.ciymgbcd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.CO_L_CDV_CICDGBDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String ciymgbcd = req.getParameter("ciymgbcd");
if( ciymgbcd == null){
	System.out.println(this.toString+" : ciymgbcd is null" );
}else{
	System.out.println(this.toString+" : ciymgbcd is "+ciymgbcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String ciymgbcd = Util.checkString(req.getParameter("ciymgbcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String ciymgbcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ciymgbcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCiymgbcd(ciymgbcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 09 13:57:19 KST 2004 */