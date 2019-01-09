/***************************************************************************************************
 * 파일명 : SS_S_RDR_RDRAREADM.java
 * 기능 : 확장현황-센터비독자관리(상세조회)
 * 작성일자 : 2013.06.27
 * 작성자 : 이혁
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
 * 독자-지역독자관리(상세조회)
 * 
 */

public class SS_S_RDR_RDRAREADM extends somo.framework.db.BaseDM implements
		java.io.Serializable {

	public String bocd;
	public String areardr_no;

	public SS_S_RDR_RDRAREADM() {
	}

	public SS_S_RDR_RDRAREADM(String bocd, String areardr_no) {
		this.bocd = bocd;
		this.areardr_no = areardr_no;
	}

	public void setBocd(String bocd) {
		this.bocd = bocd;
	}

	public void setAreardr_no(String areardr_no) {
		this.areardr_no = areardr_no;
	}

	public String getBocd() {
		return this.bocd;
	}

	public String getAreardr_no() {
		return this.areardr_no;
	}

	public String getSQL() {
		return "{ call SP_SS_S_RDR_RDRAREA( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm)
			throws SQLException {
		SS_S_RDR_RDRAREADM dm = (SS_S_RDR_RDRAREADM) bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.areardr_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject() {
		return new chosun.ciis.ss.sls.extn.ds.SS_S_RDR_RDRAREADataSet();
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
 String areardr_no = req.getParameter("areardr_no");
 if( areardr_no == null){
 System.out.println(this.toString+" : areardr_no is null" );
 }else{
 System.out.println(this.toString+" : areardr_no is "+areardr_no );
 }
 ----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 req.getParameter() 처리시 사용하십시오.

 String bocd = Util.checkString(req.getParameter("bocd"));
 String areardr_no = Util.checkString(req.getParameter("areardr_no"));
 ----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String areardr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("areardr_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
 Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

 dm.setBocd(bocd);
 dm.setAreardr_no(areardr_no);
 ----------------------------------------------------------------------------------------------------*/

/* 작성시간 : Mon May 24 15:33:30 KST 2004 */