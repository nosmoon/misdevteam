/***************************************************************************************************
* 파일명 : SS_S_ACCTCDDM.java
* 기능 : 관리자-계정코드-상세를 위한 DM
* 작성일자 : 2004-04-24
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
 * 관리자-계정코드-상세를 위한 DM
 */


public class SS_S_ACCTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String acctcd;

	public SS_S_ACCTCDDM(){}
	public SS_S_ACCTCDDM(String acctcd){
		this.acctcd = acctcd;
	}

	public void setAcctcd(String acctcd){
		this.acctcd = acctcd;
	}

	public String getAcctcd(){
		return this.acctcd;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_ACCTCD( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_ACCTCDDM dm = (SS_S_ACCTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.acctcd);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_S_ACCTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String acctcd = req.getParameter("acctcd");
if( acctcd == null){
	System.out.println(this.toString+" : acctcd is null" );
}else{
	System.out.println(this.toString+" : acctcd is "+acctcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String acctcd = Util.checkString(req.getParameter("acctcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String acctcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acctcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAcctcd(acctcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jul 03 17:43:58 KST 2004 */