/***************************************************************************************************
 * 파일명   : SSExtn2280.java
 * 기능     : 일괄확장 등록
 * 작성일자 : 2011-03-30
 * 작성자   : 김태희
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


public class SS_L_BATCH_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no_list;

	public SS_L_BATCH_EXTNDM(){}
	public SS_L_BATCH_EXTNDM(String rdr_no_list){
		this.rdr_no_list = rdr_no_list;
	}

	public void setRdr_no_list(String rdr_no_list){
		this.rdr_no_list = rdr_no_list;
	}

	public String getRdr_no_list(){
		return this.rdr_no_list;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BATCH_EXTN( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BATCH_EXTNDM dm = (SS_L_BATCH_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no_list);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_BATCH_EXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_no_list = req.getParameter("rdr_no_list");
if( rdr_no_list == null){
	System.out.println(this.toString+" : rdr_no_list is null" );
}else{
	System.out.println(this.toString+" : rdr_no_list is "+rdr_no_list );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_no_list = Util.checkString(req.getParameter("rdr_no_list"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no_list")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no_list(rdr_no_list);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 05 10:56:32 KST 2011 */