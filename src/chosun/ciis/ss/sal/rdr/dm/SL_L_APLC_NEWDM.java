/***************************************************************************************************
* 파일명 : SL_L_APLC_NEWDM.java
* 기능 : 독자정보관리(이체신청팝업-신규신청 초기화)
* 작성일자 : 2004-07-29
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(이체신청팝업-신규신청 초기화)
 *
 */

public class SL_L_APLC_NEWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String rdr_no;

	public SL_L_APLC_NEWDM(){}
	public SL_L_APLC_NEWDM(String bocd, String rdr_no){
		this.bocd = bocd;
		this.rdr_no = rdr_no;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_APLC_NEW( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_APLC_NEWDM dm = (SL_L_APLC_NEWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.rdr_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_L_APLC_NEWDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 06 20:41:47 KST 2004 */