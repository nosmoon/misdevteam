/***************************************************************************************************
 * 파일명   : SP_SS_L_CAMP_EVENT_LIST.java
 * 기능     : 캠페인확장
 * 작성일자 : 2005/05/26
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.camp.ds.*;
import chosun.ciis.ss.sls.camp.rec.*;

/**
 * 캠페인확장
 */

public class SS_L_CAMP_EVENT_LISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String camptypecd;

	public SS_L_CAMP_EVENT_LISTDM(){}
	public SS_L_CAMP_EVENT_LISTDM(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public void setCamptypecd(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public String getCamptypecd(){
		return this.camptypecd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_CAMP_EVENT_LIST( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_CAMP_EVENT_LISTDM dm = (SS_L_CAMP_EVENT_LISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.camptypecd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.camp.ds.SS_L_CAMP_EVENT_LISTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String camptypecd = req.getParameter("camptypecd");
if( camptypecd == null){
	System.out.println(this.toString+" : camptypecd is null" );
}else{
	System.out.println(this.toString+" : camptypecd is "+camptypecd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String camptypecd = Util.checkString(req.getParameter("camptypecd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String camptypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("camptypecd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCamptypecd(camptypecd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 27 14:31:44 KST 2005 */