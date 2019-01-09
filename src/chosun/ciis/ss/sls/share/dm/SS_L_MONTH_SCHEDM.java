/***************************************************************************************************
* 파일명 : SS_L_MONTH_SCHEDM.java
* 기능 : 정보공유-메인페이지-월별 일정 목록을 위한 DM
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/

package chosun.ciis.ss.sls.share.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.share.ds.*;
import chosun.ciis.ss.sls.share.rec.*;

/**
 * 정보공유-메인페이지-월별 일정 목록을 위한 DM
 */

public class SS_L_MONTH_SCHEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String incmgpers;
	public String yyyymm;

	public SS_L_MONTH_SCHEDM(){}
	public SS_L_MONTH_SCHEDM(String deptcd, String incmgpers, String yyyymm){
		this.deptcd = deptcd;
		this.incmgpers = incmgpers;
		this.yyyymm = yyyymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_MONTH_SCHE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_MONTH_SCHEDM dm = (SS_L_MONTH_SCHEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.yyyymm);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
		cstmt.registerOutParameter(19, OracleTypes.CURSOR);
		cstmt.registerOutParameter(20, OracleTypes.CURSOR);
		cstmt.registerOutParameter(21, OracleTypes.CURSOR);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
		cstmt.registerOutParameter(27, OracleTypes.CURSOR);
		cstmt.registerOutParameter(28, OracleTypes.CURSOR);
		cstmt.registerOutParameter(29, OracleTypes.CURSOR);
		cstmt.registerOutParameter(30, OracleTypes.CURSOR);
		cstmt.registerOutParameter(31, OracleTypes.CURSOR);
		cstmt.registerOutParameter(32, OracleTypes.CURSOR);
		cstmt.registerOutParameter(33, OracleTypes.CURSOR);
		cstmt.registerOutParameter(34, OracleTypes.CURSOR);
		cstmt.registerOutParameter(35, OracleTypes.CURSOR);
		cstmt.registerOutParameter(36, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.share.ds.SS_L_MONTH_SCHEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setIncmgpers(incmgpers);
dm.setYyyymm(yyyymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 07 14:07:49 KST 2004 */