/***************************************************************************************************
 * 파일명 : CO_L_NEWGUGUNDM.java_모바일용
 * 기능 : 공통-구군목록검색
 * 작성일자 : 2017-02-17
 * 작성자 : 장선희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/

package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 *
 */


public class CO_L_NEWGUGUNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String searchgb;
	public String searchnm;

	public CO_L_NEWGUGUNDM(){}
	public CO_L_NEWGUGUNDM(String searchgb, String searchnm){
		this.searchgb = searchgb;
		this.searchnm = searchnm;
	}

	public void setSearchgb(String searchgb){
		this.searchgb = searchgb;
	}

	public void setSearchnm(String searchnm){
		this.searchnm = searchnm;
	}

	public String getSearchgb(){
		return this.searchgb;
	}

	public String getSearchnm(){
		return this.searchnm;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_CO_L_NEWGUGUN(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_L_NEWGUGUNDM dm = (CO_L_NEWGUGUNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.searchgb);
		cstmt.setString(4, dm.searchnm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.CO_L_NEWGUGUNDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("searchgb = [" + getSearchgb() + "]");
		System.out.println("searchnm = [" + getSearchnm() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String searchgb = req.getParameter("searchgb");
if( searchgb == null){
	System.out.println(this.toString+" : searchgb is null" );
}else{
	System.out.println(this.toString+" : searchgb is "+searchgb );
}
String searchnm = req.getParameter("searchnm");
if( searchnm == null){
	System.out.println(this.toString+" : searchnm is null" );
}else{
	System.out.println(this.toString+" : searchnm is "+searchnm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String searchgb = Util.checkString(req.getParameter("searchgb"));
String searchnm = Util.checkString(req.getParameter("searchnm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String searchgb = Util.Uni2Ksc(Util.checkString(req.getParameter("searchgb")));
String searchnm = Util.Uni2Ksc(Util.checkString(req.getParameter("searchnm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSearchgb(searchgb);
dm.setSearchnm(searchnm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 24 10:03:03 KST 2015 */