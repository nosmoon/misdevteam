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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2217_MDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String job_clsf;
	public String inout_clsf;
	public String fac_clsf;
	public String pers_ip_addr;
	public String pers_id;

	public MT_PAPINOUT_2217_MDM(){}
	public MT_PAPINOUT_2217_MDM(String cmpy_cd, String ewh_dt, String job_clsf, String inout_clsf, String fac_clsf, String pers_ip_addr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.job_clsf = job_clsf;
		this.inout_clsf = inout_clsf;
		this.fac_clsf = fac_clsf;
		this.pers_ip_addr = pers_ip_addr;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setInout_clsf(String inout_clsf){
		this.inout_clsf = inout_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPers_ip_addr(String pers_ip_addr){
		this.pers_ip_addr = pers_ip_addr;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getInout_clsf(){
		return this.inout_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPers_ip_addr(){
		return this.pers_ip_addr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2217_M(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2217_MDM dm = (MT_PAPINOUT_2217_MDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.job_clsf);
		cstmt.setString(6, dm.inout_clsf);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.pers_ip_addr);
		cstmt.setString(9, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2217_MDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("job_clsf = [" + getJob_clsf() + "]");
		System.out.println("inout_clsf = [" + getInout_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("pers_ip_addr = [" + getPers_ip_addr() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String inout_clsf = req.getParameter("inout_clsf");
if( inout_clsf == null){
	System.out.println(this.toString+" : inout_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_clsf is "+inout_clsf );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String pers_ip_addr = req.getParameter("pers_ip_addr");
if( pers_ip_addr == null){
	System.out.println(this.toString+" : pers_ip_addr is null" );
}else{
	System.out.println(this.toString+" : pers_ip_addr is "+pers_ip_addr );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String pers_ip_addr = Util.checkString(req.getParameter("pers_ip_addr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String inout_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_clsf")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String pers_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ip_addr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setJob_clsf(job_clsf);
dm.setInout_clsf(inout_clsf);
dm.setFac_clsf(fac_clsf);
dm.setPers_ip_addr(pers_ip_addr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Sep 19 17:12:18 KST 2009 */