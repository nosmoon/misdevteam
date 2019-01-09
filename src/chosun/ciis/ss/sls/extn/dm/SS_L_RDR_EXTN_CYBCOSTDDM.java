/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_CYBCOSTDDM.java
* 기능 : 확장현황-사이버확장-비용관리-목록상세
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
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
 * 확장현황-사이버확장-비용관리-목록상세
 *
 */

public class SS_L_RDR_EXTN_CYBCOSTDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String basidt;
	public String bocd;

	public SS_L_RDR_EXTN_CYBCOSTDDM(){}
	public SS_L_RDR_EXTN_CYBCOSTDDM(String basidt, String bocd){
		this.basidt = basidt;
		this.bocd = bocd;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_EXTN_CYBCOSTD( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_EXTN_CYBCOSTDDM dm = (SS_L_RDR_EXTN_CYBCOSTDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.basidt);
		cstmt.setString(4, dm.bocd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_RDR_EXTN_CYBCOSTDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String basidt = Util.checkString(req.getParameter("basidt"));
String bocd = Util.checkString(req.getParameter("bocd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBasidt(basidt);
dm.setBocd(bocd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 09 16:13:59 KST 2004 */