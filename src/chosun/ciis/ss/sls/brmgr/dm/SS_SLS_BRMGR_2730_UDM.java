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


public class SS_SLS_BRMGR_2730_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String incmgpers;
	public String yymm;
	public String deptcd;
	public String clsf;
	public String point_min;
	public String point_max;

	public SS_SLS_BRMGR_2730_UDM(){}
	public SS_SLS_BRMGR_2730_UDM(String mode, String incmgpers, String yymm, String deptcd, String clsf, String point_min, String point_max){
		this.mode = mode;
		this.incmgpers = incmgpers;
		this.yymm = yymm;
		this.deptcd = deptcd;
		this.clsf = clsf;
		this.point_min = point_min;
		this.point_max = point_max;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
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

	public void setPoint_min(String point_min){
		this.point_min = point_min;
	}

	public void setPoint_max(String point_max){
		this.point_max = point_max;
	}

	public String getMode(){
		return this.mode;
	}

	public String getIncmgpers(){
		return this.incmgpers;
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

	public String getPoint_min(){
		return this.point_min;
	}

	public String getPoint_max(){
		return this.point_max;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2730_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2730_UDM dm = (SS_SLS_BRMGR_2730_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.deptcd);
		cstmt.setString(7, dm.clsf);
		cstmt.setString(8, dm.point_min);
		cstmt.setString(9, dm.point_max);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2730_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("point_min = [" + getPoint_min() + "]");
		System.out.println("point_max = [" + getPoint_max() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
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
String point_min = req.getParameter("point_min");
if( point_min == null){
	System.out.println(this.toString+" : point_min is null" );
}else{
	System.out.println(this.toString+" : point_min is "+point_min );
}
String point_max = req.getParameter("point_max");
if( point_max == null){
	System.out.println(this.toString+" : point_max is null" );
}else{
	System.out.println(this.toString+" : point_max is "+point_max );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String yymm = Util.checkString(req.getParameter("yymm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String clsf = Util.checkString(req.getParameter("clsf"));
String point_min = Util.checkString(req.getParameter("point_min"));
String point_max = Util.checkString(req.getParameter("point_max"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String point_min = Util.Uni2Ksc(Util.checkString(req.getParameter("point_min")));
String point_max = Util.Uni2Ksc(Util.checkString(req.getParameter("point_max")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setIncmgpers(incmgpers);
dm.setYymm(yymm);
dm.setDeptcd(deptcd);
dm.setClsf(clsf);
dm.setPoint_min(point_min);
dm.setPoint_max(point_max);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 24 14:46:05 KST 2016 */