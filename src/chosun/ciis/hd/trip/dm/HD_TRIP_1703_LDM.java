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


public class HD_TRIP_1703_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String u_id;
	public String busi_trip_frdt;
	public String busi_trip_todt;
	public String stay_clsf;
	public String dept_cd;
	public String ss_dept_cd;

	public HD_TRIP_1703_LDM(){}
	public HD_TRIP_1703_LDM(String cmpy_cd, String u_id, String busi_trip_frdt, String busi_trip_todt, String stay_clsf, String dept_cd, String ss_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.u_id = u_id;
		this.busi_trip_frdt = busi_trip_frdt;
		this.busi_trip_todt = busi_trip_todt;
		this.stay_clsf = stay_clsf;
		this.dept_cd = dept_cd;
		this.ss_dept_cd = ss_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setU_id(String u_id){
		this.u_id = u_id;
	}

	public void setBusi_trip_frdt(String busi_trip_frdt){
		this.busi_trip_frdt = busi_trip_frdt;
	}

	public void setBusi_trip_todt(String busi_trip_todt){
		this.busi_trip_todt = busi_trip_todt;
	}

	public void setStay_clsf(String stay_clsf){
		this.stay_clsf = stay_clsf;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSs_dept_cd(String ss_dept_cd){
		this.ss_dept_cd = ss_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getU_id(){
		return this.u_id;
	}

	public String getBusi_trip_frdt(){
		return this.busi_trip_frdt;
	}

	public String getBusi_trip_todt(){
		return this.busi_trip_todt;
	}

	public String getStay_clsf(){
		return this.stay_clsf;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSs_dept_cd(){
		return this.ss_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_1703_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_1703_LDM dm = (HD_TRIP_1703_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.u_id);
		cstmt.setString(5, dm.busi_trip_frdt);
		cstmt.setString(6, dm.busi_trip_todt);
		cstmt.setString(7, dm.stay_clsf);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.ss_dept_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_1703_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("u_id = [" + getU_id() + "]");
		System.out.println("busi_trip_frdt = [" + getBusi_trip_frdt() + "]");
		System.out.println("busi_trip_todt = [" + getBusi_trip_todt() + "]");
		System.out.println("stay_clsf = [" + getStay_clsf() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("ss_dept_cd = [" + getSs_dept_cd() + "]");
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
String u_id = req.getParameter("u_id");
if( u_id == null){
	System.out.println(this.toString+" : u_id is null" );
}else{
	System.out.println(this.toString+" : u_id is "+u_id );
}
String busi_trip_frdt = req.getParameter("busi_trip_frdt");
if( busi_trip_frdt == null){
	System.out.println(this.toString+" : busi_trip_frdt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_frdt is "+busi_trip_frdt );
}
String busi_trip_todt = req.getParameter("busi_trip_todt");
if( busi_trip_todt == null){
	System.out.println(this.toString+" : busi_trip_todt is null" );
}else{
	System.out.println(this.toString+" : busi_trip_todt is "+busi_trip_todt );
}
String stay_clsf = req.getParameter("stay_clsf");
if( stay_clsf == null){
	System.out.println(this.toString+" : stay_clsf is null" );
}else{
	System.out.println(this.toString+" : stay_clsf is "+stay_clsf );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String ss_dept_cd = req.getParameter("ss_dept_cd");
if( ss_dept_cd == null){
	System.out.println(this.toString+" : ss_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ss_dept_cd is "+ss_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String u_id = Util.checkString(req.getParameter("u_id"));
String busi_trip_frdt = Util.checkString(req.getParameter("busi_trip_frdt"));
String busi_trip_todt = Util.checkString(req.getParameter("busi_trip_todt"));
String stay_clsf = Util.checkString(req.getParameter("stay_clsf"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String ss_dept_cd = Util.checkString(req.getParameter("ss_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String u_id = Util.Uni2Ksc(Util.checkString(req.getParameter("u_id")));
String busi_trip_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_frdt")));
String busi_trip_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_todt")));
String stay_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stay_clsf")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String ss_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ss_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setU_id(u_id);
dm.setBusi_trip_frdt(busi_trip_frdt);
dm.setBusi_trip_todt(busi_trip_todt);
dm.setStay_clsf(stay_clsf);
dm.setDept_cd(dept_cd);
dm.setSs_dept_cd(ss_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 07 15:15:05 KST 2009 */