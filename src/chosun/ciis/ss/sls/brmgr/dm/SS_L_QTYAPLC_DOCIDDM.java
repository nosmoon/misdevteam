/***************************************************************************************************
* 파일명 : SS_L_QTYAPLC_DOCIDDM.java
* 기능 : 지국경영 - 부수증감 - 본지(담당) - 결재문서ID 조회
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


public class SS_L_QTYAPLC_DOCIDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String documenttype;

	public SS_L_QTYAPLC_DOCIDDM(){}
	public SS_L_QTYAPLC_DOCIDDM(String documenttype){
		this.documenttype = documenttype;
	}

	public void setDocumenttype(String documenttype){
		this.documenttype = documenttype;
	}

	public String getDocumenttype(){
		return this.documenttype;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_QTYAPLC_DOCID( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_QTYAPLC_DOCIDDM dm = (SS_L_QTYAPLC_DOCIDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.documenttype);
		cstmt.registerOutParameter(4, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_L_QTYAPLC_DOCIDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String documenttype = req.getParameter("documenttype");
if( documenttype == null){
	System.out.println(this.toString+" : documenttype is null" );
}else{
	System.out.println(this.toString+" : documenttype is "+documenttype );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String documenttype = Util.checkString(req.getParameter("documenttype"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String documenttype = Util.Uni2Ksc(Util.checkString(req.getParameter("documenttype")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDocumenttype(documenttype);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 15:53:20 KST 2009 */