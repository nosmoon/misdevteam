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


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2330_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String jobclsf;
	public String yymm;
	public String incmgpers;

	public SS_SLS_BRMGR_2330_UDM(){}
	public SS_SLS_BRMGR_2330_UDM(String jobclsf, String yymm, String incmgpers){
		this.jobclsf = jobclsf;
		this.yymm = yymm;
		this.incmgpers = incmgpers;
	}

	public void setJobclsf(String jobclsf){
		this.jobclsf = jobclsf;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getJobclsf(){
		return this.jobclsf;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2330_U(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2330_UDM dm = (SS_SLS_BRMGR_2330_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.jobclsf);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2330_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("jobclsf = [" + getJobclsf() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String jobclsf = req.getParameter("jobclsf");
if( jobclsf == null){
	System.out.println(this.toString+" : jobclsf is null" );
}else{
	System.out.println(this.toString+" : jobclsf is "+jobclsf );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String jobclsf = Util.checkString(req.getParameter("jobclsf"));
String yymm = Util.checkString(req.getParameter("yymm"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String jobclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("jobclsf")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setJobclsf(jobclsf);
dm.setYymm(yymm);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 02 11:31:11 KST 2016 */