/***************************************************************************************************
* 파일명 : SS_L_DSCTSTAT_TMDM.java
* 기능 : 상담원-불편통계를 위한 DM
* 작성일자 : 2004-07-24
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 * 상담원-불편통계를 위한 DM
 */


public class SS_L_DSCTSTAT_TMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String jobcd;
	public String srchdt;

	public SS_L_DSCTSTAT_TMDM(){}
	public SS_L_DSCTSTAT_TMDM(String jobcd, String srchdt){
		this.jobcd = jobcd;
		this.srchdt = srchdt;
	}

	public void setJobcd(String jobcd){
		this.jobcd = jobcd;
	}

	public void setSrchdt(String srchdt){
		this.srchdt = srchdt;
	}

	public String getJobcd(){
		return this.jobcd;
	}

	public String getSrchdt(){
		return this.srchdt;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_DSCTSTAT_TM( ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_DSCTSTAT_TMDM dm = (SS_L_DSCTSTAT_TMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.jobcd);
		cstmt.setString(4, dm.srchdt);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
		cstmt.registerOutParameter(6, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.cns.ds.SS_L_DSCTSTAT_TMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String jobcd = req.getParameter("jobcd");
if( jobcd == null){
	System.out.println(this.toString+" : jobcd is null" );
}else{
	System.out.println(this.toString+" : jobcd is "+jobcd );
}
String srchdt = req.getParameter("srchdt");
if( srchdt == null){
	System.out.println(this.toString+" : srchdt is null" );
}else{
	System.out.println(this.toString+" : srchdt is "+srchdt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String jobcd = Util.checkString(req.getParameter("jobcd"));
String srchdt = Util.checkString(req.getParameter("srchdt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String jobcd = Util.Uni2Ksc(Util.checkString(req.getParameter("jobcd")));
String srchdt = Util.Uni2Ksc(Util.checkString(req.getParameter("srchdt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setJobcd(jobcd);
dm.setSrchdt(srchdt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 23 20:54:08 KST 2004 */