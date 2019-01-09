/***************************************************************************************************
* 파일명 : .java
* 기능 :  자산 - 임대사업 - 임대사업조회 - 임대사업현황
* 작성일자 : 2011-03-30
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.lear.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.ds.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 자산 - 임대사업 - 임대사업조회 - 임대사업현황
 */


public class AS_LEAR_1501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bldg_cd;
	public String clam_yymm1;
	public String clam_yymm2;
	public String base_dt;
	public String cntr_star;

	public AS_LEAR_1501_LDM(){}
	public AS_LEAR_1501_LDM(String cmpy_cd, String bldg_cd, String clam_yymm1, String clam_yymm2, String base_dt, String cntr_star){
		this.cmpy_cd = cmpy_cd;
		this.bldg_cd = bldg_cd;
		this.clam_yymm1 = clam_yymm1;
		this.clam_yymm2 = clam_yymm2;
		this.base_dt = base_dt;
		this.cntr_star = cntr_star;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setClam_yymm1(String clam_yymm1){
		this.clam_yymm1 = clam_yymm1;
	}

	public void setClam_yymm2(String clam_yymm2){
		this.clam_yymm2 = clam_yymm2;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setCntr_star(String cntr_star){
		this.cntr_star = cntr_star;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getClam_yymm1(){
		return this.clam_yymm1;
	}

	public String getClam_yymm2(){
		return this.clam_yymm2;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getCntr_star(){
		return this.cntr_star;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAR_1501_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAR_1501_LDM dm = (AS_LEAR_1501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bldg_cd);
		cstmt.setString(5, dm.clam_yymm1);
		cstmt.setString(6, dm.clam_yymm2);
		cstmt.setString(7, dm.base_dt);
		cstmt.setString(8, dm.cntr_star);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.lear.ds.AS_LEAR_1501_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("clam_yymm1 = [" + getClam_yymm1() + "]");
		System.out.println("clam_yymm2 = [" + getClam_yymm2() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
		System.out.println("cntr_star = [" + getCntr_star() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bldg_cd = req.getParameter("bldg_cd");
if( bldg_cd == null){
	System.out.println(this.toString+" : bldg_cd is null" );
}else{
	System.out.println(this.toString+" : bldg_cd is "+bldg_cd );
}
String clam_yymm1 = req.getParameter("clam_yymm1");
if( clam_yymm1 == null){
	System.out.println(this.toString+" : clam_yymm1 is null" );
}else{
	System.out.println(this.toString+" : clam_yymm1 is "+clam_yymm1 );
}
String clam_yymm2 = req.getParameter("clam_yymm2");
if( clam_yymm2 == null){
	System.out.println(this.toString+" : clam_yymm2 is null" );
}else{
	System.out.println(this.toString+" : clam_yymm2 is "+clam_yymm2 );
}
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
String cntr_star = req.getParameter("cntr_star");
if( cntr_star == null){
	System.out.println(this.toString+" : cntr_star is null" );
}else{
	System.out.println(this.toString+" : cntr_star is "+cntr_star );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String clam_yymm1 = Util.checkString(req.getParameter("clam_yymm1"));
String clam_yymm2 = Util.checkString(req.getParameter("clam_yymm2"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
String cntr_star = Util.checkString(req.getParameter("cntr_star"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String clam_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm1")));
String clam_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_yymm2")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
String cntr_star = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_star")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBldg_cd(bldg_cd);
dm.setClam_yymm1(clam_yymm1);
dm.setClam_yymm2(clam_yymm2);
dm.setBase_dt(base_dt);
dm.setCntr_star(cntr_star);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 30 21:01:21 KST 2011 */