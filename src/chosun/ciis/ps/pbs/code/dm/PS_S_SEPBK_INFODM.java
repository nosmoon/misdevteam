/***************************************************************************************************
 * 파일명   : PS_S_SEPBK_INFODM.java
 * 기능     : 코드-단행본 등록 상세내역
 * 작성일자 : 2004-09-21
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/



package chosun.ciis.ps.pbs.code.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.code.ds.*;
import chosun.ciis.ps.pbs.code.rec.*;

/**
 * 코드-단행본 등록 상세내역
 */

public class PS_S_SEPBK_INFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String sep_bookcd;

	public PS_S_SEPBK_INFODM(){}
	public PS_S_SEPBK_INFODM(String cmpycd, String sep_bookcd){
		this.cmpycd = cmpycd;
		this.sep_bookcd = sep_bookcd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setSep_bookcd(String sep_bookcd){
		this.sep_bookcd = sep_bookcd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSep_bookcd(){
		return this.sep_bookcd;
	}

	public String getSQL(){
		 return "{ call SP_PS_S_SEPBK_INFO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_S_SEPBK_INFODM dm = (PS_S_SEPBK_INFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.sep_bookcd);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.code.ds.PS_S_SEPBK_INFODataSet();
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
String sep_bookcd = req.getParameter("sep_bookcd");
if( sep_bookcd == null){
	System.out.println(this.toString+" : sep_bookcd is null" );
}else{
	System.out.println(this.toString+" : sep_bookcd is "+sep_bookcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String sep_bookcd = Util.checkString(req.getParameter("sep_bookcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String sep_bookcd = Util.Uni2Ksc(Util.checkString(req.getParameter("sep_bookcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setSep_bookcd(sep_bookcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 31 14:22:14 KST 2005 */