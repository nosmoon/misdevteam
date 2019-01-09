/***************************************************************************************************
 * 파일명   : PB_L_TAOCC_PSTCDDM.java
 * 기능     : 공통-우편번호 및 주소 찾기
 * 작성일자 : 2004-03-05
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.ds.*;
import chosun.ciis.ps.pbs.common.rec.*;

/**
 * 공통-우편번호 및 주소 찾기
 */

public class PB_L_TAOCC_PSTCDDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String addr3;
	public String zip;

	public PB_L_TAOCC_PSTCDDM(){}
	public PB_L_TAOCC_PSTCDDM(String addr3, String zip){
		this.addr3 = addr3;
		this.zip = zip;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public String getZip(){
		return this.zip;
	}

	public String getSQL(){
		 return "{ call SP_PB_L_TAOCC_PSTCD( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PB_L_TAOCC_PSTCDDM dm = (PB_L_TAOCC_PSTCDDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.addr3);
		cstmt.setString(4, dm.zip);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.common.ds.PB_L_TAOCC_PSTCDDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String addr3 = req.getParameter("addr3");
if( addr3 == null){
	System.out.println(this.toString+" : addr3 is null" );
}else{
	System.out.println(this.toString+" : addr3 is "+addr3 );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String addr3 = Util.checkString(req.getParameter("addr3"));
String zip = Util.checkString(req.getParameter("zip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAddr3(addr3);
dm.setZip(zip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 05 14:46:20 KST 2004 */