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


package chosun.ciis.ss.sls.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.ds.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 
 */


public class SS_L_TM_CAMPLISTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String search_frdt;
	public String search_todt;

	public SS_L_TM_CAMPLISTDM(){}
	public SS_L_TM_CAMPLISTDM(String search_frdt, String search_todt){
		this.search_frdt = search_frdt;
		this.search_todt = search_todt;
	}

	public void setSearch_frdt(String search_frdt){
		this.search_frdt = search_frdt;
	}

	public void setSearch_todt(String search_todt){
		this.search_todt = search_todt;
	}

	public String getSearch_frdt(){
		return this.search_frdt;
	}

	public String getSearch_todt(){
		return this.search_todt;
	}

	public String getSQL(){
		 return "{ call CRMCCT_CCT.SP_SS_L_TM_CAMPLIST(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_TM_CAMPLISTDM dm = (SS_L_TM_CAMPLISTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.search_frdt);
		cstmt.setString(4, dm.search_todt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.rdr.ds.SS_L_TM_CAMPLISTDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("search_frdt = [" + getSearch_frdt() + "]");
		System.out.println("search_todt = [" + getSearch_todt() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String search_frdt = req.getParameter("search_frdt");
if( search_frdt == null){
	System.out.println(this.toString+" : search_frdt is null" );
}else{
	System.out.println(this.toString+" : search_frdt is "+search_frdt );
}
String search_todt = req.getParameter("search_todt");
if( search_todt == null){
	System.out.println(this.toString+" : search_todt is null" );
}else{
	System.out.println(this.toString+" : search_todt is "+search_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String search_frdt = Util.checkString(req.getParameter("search_frdt"));
String search_todt = Util.checkString(req.getParameter("search_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String search_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_frdt")));
String search_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("search_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSearch_frdt(search_frdt);
dm.setSearch_todt(search_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 29 07:09:24 GMT 2013 */