/***************************************************************************************************
* 파일명 : SS_L_VS_AREABODM.java
* 기능 : 독자현황-VacationStop-휴가지코드및 지국정보 목록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-VacationStop-휴가지코드및 지국정보 목록을 위한 DM
 */


public class SS_L_VS_AREABODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String vaca_arearegncd;

	public SS_L_VS_AREABODM(){}
	public SS_L_VS_AREABODM(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public void setVaca_arearegncd(String vaca_arearegncd){
		this.vaca_arearegncd = vaca_arearegncd;
	}

	public String getVaca_arearegncd(){
		return this.vaca_arearegncd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_VS_AREABO( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_VS_AREABODM dm = (SS_L_VS_AREABODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.vaca_arearegncd);
		cstmt.registerOutParameter(4, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_VS_AREABODataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String vaca_arearegncd = req.getParameter("vaca_arearegncd");
if( vaca_arearegncd == null){
	System.out.println(this.toString+" : vaca_arearegncd is null" );
}else{
	System.out.println(this.toString+" : vaca_arearegncd is "+vaca_arearegncd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String vaca_arearegncd = Util.checkString(req.getParameter("vaca_arearegncd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String vaca_arearegncd = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_arearegncd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setVaca_arearegncd(vaca_arearegncd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 16 10:55:48 KST 2004 */