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


public class SS_SLS_BRMGR_2720_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String yymm;
	public String deptcd;
	public String clsf;

	public SS_SLS_BRMGR_2720_SDM(){}
	public SS_SLS_BRMGR_2720_SDM(String yymm, String deptcd, String clsf){
		this.yymm = yymm;
		this.deptcd = deptcd;
		this.clsf = clsf;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2720_S(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2720_SDM dm = (SS_SLS_BRMGR_2720_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.yymm);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.clsf);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2720_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String yymm = Util.checkString(req.getParameter("yymm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String clsf = Util.checkString(req.getParameter("clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setYymm(yymm);
dm.setDeptcd(deptcd);
dm.setClsf(clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 24 14:24:52 KST 2016 */