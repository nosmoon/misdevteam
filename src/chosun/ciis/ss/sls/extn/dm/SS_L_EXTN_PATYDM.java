/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황/단체확장/사람찾기  
* 작성일자 : 2009-06-02
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황/단체확장/사람찾기
 */

public class SS_L_EXTN_PATYDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String srch_word;

	public SS_L_EXTN_PATYDM(){}
	public SS_L_EXTN_PATYDM(String cmpycd, String srch_word){
		this.cmpycd = cmpycd;
		this.srch_word = srch_word;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setSrch_word(String srch_word){
		this.srch_word = srch_word;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSrch_word(){
		return this.srch_word;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTN_PATY( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_PATYDM dm = (SS_L_EXTN_PATYDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.srch_word);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_PATYDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String srch_word = req.getParameter("srch_word");
if( srch_word == null){
	System.out.println(this.toString+" : srch_word is null" );
}else{
	System.out.println(this.toString+" : srch_word is "+srch_word );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String srch_word = Util.checkString(req.getParameter("srch_word"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setSrch_word(srch_word);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 17:41:22 KST 2009 */