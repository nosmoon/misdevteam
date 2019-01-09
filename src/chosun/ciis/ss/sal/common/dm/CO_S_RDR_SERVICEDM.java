/***************************************************************************************************
 * 파일명 : CO_S_RDR_SERVICE.java
 * 기능 : 통합회원 서비스 조회
 * 작성일자 : 2006-08-18
 * 작성자 : 노상현
 ***************************************************************************************************/

package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통 - 통합 회원 서비스 조회
 */

public class CO_S_RDR_SERVICEDM extends somo.framework.db.BaseDM implements
		java.io.Serializable {

	public String rdr_no;
	public String medicd;

	public CO_S_RDR_SERVICEDM() {
	}

	public CO_S_RDR_SERVICEDM(String rdr_no, String medicd) {
		this.rdr_no = rdr_no;
		this.medicd = medicd;
	}

	public void setRdr_no(String rdr_no) {
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd) {
		this.medicd = medicd;
	}

	public String getRdr_no() {
		return this.rdr_no;
	}

	public String getMedicd() {
		return this.medicd;
	}

	public String getSQL() {
		return "{ call SP_CO_S_RDR_SERVICE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm)
			throws SQLException {
		CO_S_RDR_SERVICEDM dm = (CO_S_RDR_SERVICEDM) bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no);
		cstmt.setString(4, dm.medicd);
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
	}

	public BaseDataSet createDataSetObject() {
		return new chosun.ciis.ss.sal.common.ds.CO_S_RDR_SERVICEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

 String rdr_no = req.getParameter("rdr_no");
 if( rdr_no == null){
 System.out.println(this.toString+" : rdr_no is null" );
 }else{
 System.out.println(this.toString+" : rdr_no is "+rdr_no );
 }
 String medicd = req.getParameter("medicd");
 if( medicd == null){
 System.out.println(this.toString+" : medicd is null" );
 }else{
 System.out.println(this.toString+" : medicd is "+medicd );
 }
 ----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
 Web Tier에서 req.getParameter() 처리시 사용하십시오.

 String rdr_no = Util.checkString(req.getParameter("rdr_no"));
 String medicd = Util.checkString(req.getParameter("medicd"));
 ----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
 Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

 dm.setRdr_no(rdr_no);
 dm.setMedicd(medicd);
 ----------------------------------------------------------------------------------------------------*/

/* 작성시간 : Fri Aug 18 17:10:48 KST 2006 */