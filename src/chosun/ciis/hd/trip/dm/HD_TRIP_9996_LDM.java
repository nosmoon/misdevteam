/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_9996_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String area_clsf;
	public String cost_clsf;
	public String posi_clsf;
	public String aply_dt;
	public String aply_frdt;
	public String aply_todt;

	public HD_TRIP_9996_LDM(){}
	public HD_TRIP_9996_LDM(String cmpy_cd, String area_clsf, String cost_clsf, String posi_clsf, String aply_dt, String aply_frdt, String aply_todt){
		this.cmpy_cd = cmpy_cd;
		this.area_clsf = area_clsf;
		this.cost_clsf = cost_clsf;
		this.posi_clsf = posi_clsf;
		this.aply_dt = aply_dt;
		this.aply_frdt = aply_frdt;
		this.aply_todt = aply_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArea_clsf(String area_clsf){
		this.area_clsf = area_clsf;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setPosi_clsf(String posi_clsf){
		this.posi_clsf = posi_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setAply_frdt(String aply_frdt){
		this.aply_frdt = aply_frdt;
	}

	public void setAply_todt(String aply_todt){
		this.aply_todt = aply_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArea_clsf(){
		return this.area_clsf;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getPosi_clsf(){
		return this.posi_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getAply_frdt(){
		return this.aply_frdt;
	}

	public String getAply_todt(){
		return this.aply_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_9996_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_9996_LDM dm = (HD_TRIP_9996_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.area_clsf);
		cstmt.setString(5, dm.cost_clsf);
		cstmt.setString(6, dm.posi_clsf);
		cstmt.setString(7, dm.aply_dt);
		cstmt.setString(8, dm.aply_frdt);
		cstmt.setString(9, dm.aply_todt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_9996_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("area_clsf = [" + getArea_clsf() + "]");
		System.out.println("cost_clsf = [" + getCost_clsf() + "]");
		System.out.println("posi_clsf = [" + getPosi_clsf() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("aply_frdt = [" + getAply_frdt() + "]");
		System.out.println("aply_todt = [" + getAply_todt() + "]");
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
String area_clsf = req.getParameter("area_clsf");
if( area_clsf == null){
	System.out.println(this.toString+" : area_clsf is null" );
}else{
	System.out.println(this.toString+" : area_clsf is "+area_clsf );
}
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
}
String posi_clsf = req.getParameter("posi_clsf");
if( posi_clsf == null){
	System.out.println(this.toString+" : posi_clsf is null" );
}else{
	System.out.println(this.toString+" : posi_clsf is "+posi_clsf );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String aply_frdt = req.getParameter("aply_frdt");
if( aply_frdt == null){
	System.out.println(this.toString+" : aply_frdt is null" );
}else{
	System.out.println(this.toString+" : aply_frdt is "+aply_frdt );
}
String aply_todt = req.getParameter("aply_todt");
if( aply_todt == null){
	System.out.println(this.toString+" : aply_todt is null" );
}else{
	System.out.println(this.toString+" : aply_todt is "+aply_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String area_clsf = Util.checkString(req.getParameter("area_clsf"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
String posi_clsf = Util.checkString(req.getParameter("posi_clsf"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String aply_frdt = Util.checkString(req.getParameter("aply_frdt"));
String aply_todt = Util.checkString(req.getParameter("aply_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String area_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("area_clsf")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
String posi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_clsf")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String aply_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_frdt")));
String aply_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setArea_clsf(area_clsf);
dm.setCost_clsf(cost_clsf);
dm.setPosi_clsf(posi_clsf);
dm.setAply_dt(aply_dt);
dm.setAply_frdt(aply_frdt);
dm.setAply_todt(aply_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Aug 09 14:28:17 KST 2009 */