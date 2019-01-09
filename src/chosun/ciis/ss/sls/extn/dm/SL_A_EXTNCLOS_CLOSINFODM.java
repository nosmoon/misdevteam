/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매 확장점검부실 점검마감여부 조회
* 작성일자 : 2012-01-12
* 작성자 : 이혁
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


public class SL_A_EXTNCLOS_CLOSINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String closmm;

	public SL_A_EXTNCLOS_CLOSINFODM(){}
	public SL_A_EXTNCLOS_CLOSINFODM(String closmm){
		this.closmm = closmm;
	}

	public void setClosmm(String closmm){
		this.closmm = closmm;
	}

	public String getClosmm(){
		return this.closmm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SL_A_EXTNCLOS_CLOSINFO(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_EXTNCLOS_CLOSINFODM dm = (SL_A_EXTNCLOS_CLOSINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.closmm);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.registerOutParameter(5, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SL_A_EXTNCLOS_CLOSINFODataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("closmm = [" + getClosmm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String closmm = req.getParameter("closmm");
if( closmm == null){
	System.out.println(this.toString+" : closmm is null" );
}else{
	System.out.println(this.toString+" : closmm is "+closmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String closmm = Util.checkString(req.getParameter("closmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String closmm = Util.Uni2Ksc(Util.checkString(req.getParameter("closmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClosmm(closmm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 12 16:41:20 KST 2012 */