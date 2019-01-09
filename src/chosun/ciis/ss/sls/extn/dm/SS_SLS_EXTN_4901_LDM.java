/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4901_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String searchnm;

	public SS_SLS_EXTN_4901_LDM(){}
	public SS_SLS_EXTN_4901_LDM(String searchnm){
		this.searchnm = searchnm;
	}

	public void setSearchnm(String searchnm){
		this.searchnm = searchnm;
	}

	public String getSearchnm(){
		return this.searchnm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4901_L(? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4901_LDM dm = (SS_SLS_EXTN_4901_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.searchnm);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4901_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("searchnm = [" + getSearchnm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String searchnm = req.getParameter("searchnm");
if( searchnm == null){
	System.out.println(this.toString+" : searchnm is null" );
}else{
	System.out.println(this.toString+" : searchnm is "+searchnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String searchnm = Util.checkString(req.getParameter("searchnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String searchnm = Util.Uni2Ksc(Util.checkString(req.getParameter("searchnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSearchnm(searchnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 22 10:20:51 KST 2016 */