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


public class SS_SLS_BRMGR_2320_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String yymm;
	public String deptcd;
	public String clsf;
	public String rate_a_min;
	public String rate_a_max;
	public String rate_a_point;
	public String rate_b_min;
	public String rate_b_max;
	public String rate_b_point;
	public String rate_c_min;
	public String rate_c_max;
	public String rate_c_point;
	public String rate_d_min;
	public String rate_d_max;
	public String rate_d_point;
	public String add_point;
	public String incmgpers;

	public SS_SLS_BRMGR_2320_UDM(){}
	public SS_SLS_BRMGR_2320_UDM(String yymm, String deptcd, String clsf, String rate_a_min, String rate_a_max, String rate_a_point, String rate_b_min, String rate_b_max, String rate_b_point, String rate_c_min, String rate_c_max, String rate_c_point, String rate_d_min, String rate_d_max, String rate_d_point, String add_point, String incmgpers){
		this.yymm = yymm;
		this.deptcd = deptcd;
		this.clsf = clsf;
		this.rate_a_min = rate_a_min;
		this.rate_a_max = rate_a_max;
		this.rate_a_point = rate_a_point;
		this.rate_b_min = rate_b_min;
		this.rate_b_max = rate_b_max;
		this.rate_b_point = rate_b_point;
		this.rate_c_min = rate_c_min;
		this.rate_c_max = rate_c_max;
		this.rate_c_point = rate_c_point;
		this.rate_d_min = rate_d_min;
		this.rate_d_max = rate_d_max;
		this.rate_d_point = rate_d_point;
		this.add_point = add_point;
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

	public void setRate_a_min(String rate_a_min){
		this.rate_a_min = rate_a_min;
	}

	public void setRate_a_max(String rate_a_max){
		this.rate_a_max = rate_a_max;
	}

	public void setRate_a_point(String rate_a_point){
		this.rate_a_point = rate_a_point;
	}

	public void setRate_b_min(String rate_b_min){
		this.rate_b_min = rate_b_min;
	}

	public void setRate_b_max(String rate_b_max){
		this.rate_b_max = rate_b_max;
	}

	public void setRate_b_point(String rate_b_point){
		this.rate_b_point = rate_b_point;
	}

	public void setRate_c_min(String rate_c_min){
		this.rate_c_min = rate_c_min;
	}

	public void setRate_c_max(String rate_c_max){
		this.rate_c_max = rate_c_max;
	}

	public void setRate_c_point(String rate_c_point){
		this.rate_c_point = rate_c_point;
	}

	public void setRate_d_min(String rate_d_min){
		this.rate_d_min = rate_d_min;
	}

	public void setRate_d_max(String rate_d_max){
		this.rate_d_max = rate_d_max;
	}

	public void setRate_d_point(String rate_d_point){
		this.rate_d_point = rate_d_point;
	}

	public void setAdd_point(String add_point){
		this.add_point = add_point;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
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

	public String getRate_a_min(){
		return this.rate_a_min;
	}

	public String getRate_a_max(){
		return this.rate_a_max;
	}

	public String getRate_a_point(){
		return this.rate_a_point;
	}

	public String getRate_b_min(){
		return this.rate_b_min;
	}

	public String getRate_b_max(){
		return this.rate_b_max;
	}

	public String getRate_b_point(){
		return this.rate_b_point;
	}

	public String getRate_c_min(){
		return this.rate_c_min;
	}

	public String getRate_c_max(){
		return this.rate_c_max;
	}

	public String getRate_c_point(){
		return this.rate_c_point;
	}

	public String getRate_d_min(){
		return this.rate_d_min;
	}

	public String getRate_d_max(){
		return this.rate_d_max;
	}

	public String getRate_d_point(){
		return this.rate_d_point;
	}

	public String getAdd_point(){
		return this.add_point;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2320_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2320_UDM dm = (SS_SLS_BRMGR_2320_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.yymm);
		cstmt.setString(4, dm.deptcd);
		cstmt.setString(5, dm.clsf);
		cstmt.setString(6, dm.rate_a_min);
		cstmt.setString(7, dm.rate_a_max);
		cstmt.setString(8, dm.rate_a_point);
		cstmt.setString(9, dm.rate_b_min);
		cstmt.setString(10, dm.rate_b_max);
		cstmt.setString(11, dm.rate_b_point);
		cstmt.setString(12, dm.rate_c_min);
		cstmt.setString(13, dm.rate_c_max);
		cstmt.setString(14, dm.rate_c_point);
		cstmt.setString(15, dm.rate_d_min);
		cstmt.setString(16, dm.rate_d_max);
		cstmt.setString(17, dm.rate_d_point);
		cstmt.setString(18, dm.add_point);
		cstmt.setString(19, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2320_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("rate_a_min = [" + getRate_a_min() + "]");
		System.out.println("rate_a_max = [" + getRate_a_max() + "]");
		System.out.println("rate_a_point = [" + getRate_a_point() + "]");
		System.out.println("rate_b_min = [" + getRate_b_min() + "]");
		System.out.println("rate_b_max = [" + getRate_b_max() + "]");
		System.out.println("rate_b_point = [" + getRate_b_point() + "]");
		System.out.println("rate_c_min = [" + getRate_c_min() + "]");
		System.out.println("rate_c_max = [" + getRate_c_max() + "]");
		System.out.println("rate_c_point = [" + getRate_c_point() + "]");
		System.out.println("rate_d_min = [" + getRate_d_min() + "]");
		System.out.println("rate_d_max = [" + getRate_d_max() + "]");
		System.out.println("rate_d_point = [" + getRate_d_point() + "]");
		System.out.println("add_point = [" + getAdd_point() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
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
String rate_a_min = req.getParameter("rate_a_min");
if( rate_a_min == null){
	System.out.println(this.toString+" : rate_a_min is null" );
}else{
	System.out.println(this.toString+" : rate_a_min is "+rate_a_min );
}
String rate_a_max = req.getParameter("rate_a_max");
if( rate_a_max == null){
	System.out.println(this.toString+" : rate_a_max is null" );
}else{
	System.out.println(this.toString+" : rate_a_max is "+rate_a_max );
}
String rate_a_point = req.getParameter("rate_a_point");
if( rate_a_point == null){
	System.out.println(this.toString+" : rate_a_point is null" );
}else{
	System.out.println(this.toString+" : rate_a_point is "+rate_a_point );
}
String rate_b_min = req.getParameter("rate_b_min");
if( rate_b_min == null){
	System.out.println(this.toString+" : rate_b_min is null" );
}else{
	System.out.println(this.toString+" : rate_b_min is "+rate_b_min );
}
String rate_b_max = req.getParameter("rate_b_max");
if( rate_b_max == null){
	System.out.println(this.toString+" : rate_b_max is null" );
}else{
	System.out.println(this.toString+" : rate_b_max is "+rate_b_max );
}
String rate_b_point = req.getParameter("rate_b_point");
if( rate_b_point == null){
	System.out.println(this.toString+" : rate_b_point is null" );
}else{
	System.out.println(this.toString+" : rate_b_point is "+rate_b_point );
}
String rate_c_min = req.getParameter("rate_c_min");
if( rate_c_min == null){
	System.out.println(this.toString+" : rate_c_min is null" );
}else{
	System.out.println(this.toString+" : rate_c_min is "+rate_c_min );
}
String rate_c_max = req.getParameter("rate_c_max");
if( rate_c_max == null){
	System.out.println(this.toString+" : rate_c_max is null" );
}else{
	System.out.println(this.toString+" : rate_c_max is "+rate_c_max );
}
String rate_c_point = req.getParameter("rate_c_point");
if( rate_c_point == null){
	System.out.println(this.toString+" : rate_c_point is null" );
}else{
	System.out.println(this.toString+" : rate_c_point is "+rate_c_point );
}
String rate_d_min = req.getParameter("rate_d_min");
if( rate_d_min == null){
	System.out.println(this.toString+" : rate_d_min is null" );
}else{
	System.out.println(this.toString+" : rate_d_min is "+rate_d_min );
}
String rate_d_max = req.getParameter("rate_d_max");
if( rate_d_max == null){
	System.out.println(this.toString+" : rate_d_max is null" );
}else{
	System.out.println(this.toString+" : rate_d_max is "+rate_d_max );
}
String rate_d_point = req.getParameter("rate_d_point");
if( rate_d_point == null){
	System.out.println(this.toString+" : rate_d_point is null" );
}else{
	System.out.println(this.toString+" : rate_d_point is "+rate_d_point );
}
String add_point = req.getParameter("add_point");
if( add_point == null){
	System.out.println(this.toString+" : add_point is null" );
}else{
	System.out.println(this.toString+" : add_point is "+add_point );
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

String yymm = Util.checkString(req.getParameter("yymm"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String clsf = Util.checkString(req.getParameter("clsf"));
String rate_a_min = Util.checkString(req.getParameter("rate_a_min"));
String rate_a_max = Util.checkString(req.getParameter("rate_a_max"));
String rate_a_point = Util.checkString(req.getParameter("rate_a_point"));
String rate_b_min = Util.checkString(req.getParameter("rate_b_min"));
String rate_b_max = Util.checkString(req.getParameter("rate_b_max"));
String rate_b_point = Util.checkString(req.getParameter("rate_b_point"));
String rate_c_min = Util.checkString(req.getParameter("rate_c_min"));
String rate_c_max = Util.checkString(req.getParameter("rate_c_max"));
String rate_c_point = Util.checkString(req.getParameter("rate_c_point"));
String rate_d_min = Util.checkString(req.getParameter("rate_d_min"));
String rate_d_max = Util.checkString(req.getParameter("rate_d_max"));
String rate_d_point = Util.checkString(req.getParameter("rate_d_point"));
String add_point = Util.checkString(req.getParameter("add_point"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String rate_a_min = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_a_min")));
String rate_a_max = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_a_max")));
String rate_a_point = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_a_point")));
String rate_b_min = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_b_min")));
String rate_b_max = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_b_max")));
String rate_b_point = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_b_point")));
String rate_c_min = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_c_min")));
String rate_c_max = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_c_max")));
String rate_c_point = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_c_point")));
String rate_d_min = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_d_min")));
String rate_d_max = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_d_max")));
String rate_d_point = Util.Uni2Ksc(Util.checkString(req.getParameter("rate_d_point")));
String add_point = Util.Uni2Ksc(Util.checkString(req.getParameter("add_point")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setYymm(yymm);
dm.setDeptcd(deptcd);
dm.setClsf(clsf);
dm.setRate_a_min(rate_a_min);
dm.setRate_a_max(rate_a_max);
dm.setRate_a_point(rate_a_point);
dm.setRate_b_min(rate_b_min);
dm.setRate_b_max(rate_b_max);
dm.setRate_b_point(rate_b_point);
dm.setRate_c_min(rate_c_min);
dm.setRate_c_max(rate_c_max);
dm.setRate_c_point(rate_c_point);
dm.setRate_d_min(rate_d_min);
dm.setRate_d_max(rate_d_max);
dm.setRate_d_point(rate_d_point);
dm.setAdd_point(add_point);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 02 11:11:35 KST 2016 */