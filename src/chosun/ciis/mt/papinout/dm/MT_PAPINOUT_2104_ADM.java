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


public class MT_PAPINOUT_2104_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String base_dt;
	public String mg_yn_10;
	public String mg_yn_20;
	public String pers_ip_addr;
	public String pers_id;

	public MT_PAPINOUT_2104_ADM(){}
	public MT_PAPINOUT_2104_ADM(String cmpy_cd, String base_dt, String mg_yn_10, String mg_yn_20, String pers_ip_addr, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.base_dt = base_dt;
		this.mg_yn_10 = mg_yn_10;
		this.mg_yn_20 = mg_yn_20;
		this.pers_ip_addr = pers_ip_addr;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setMg_yn_10(String mg_yn_10){
		this.mg_yn_10 = mg_yn_10;
	}

	public void setMg_yn_20(String mg_yn_20){
		this.mg_yn_20 = mg_yn_20;
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

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getMg_yn_10(){
		return this.mg_yn_10;
	}

	public String getMg_yn_20(){
		return this.mg_yn_20;
	}

	public String getPers_ip_addr(){
		return this.pers_ip_addr;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2104_A(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2104_ADM dm = (MT_PAPINOUT_2104_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.base_dt);
		cstmt.setString(5, dm.mg_yn_10);
		cstmt.setString(6, dm.mg_yn_20);
		cstmt.setString(7, dm.pers_ip_addr);
		cstmt.setString(8, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2104_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
		System.out.println("mg_yn_10 = [" + getMg_yn_10() + "]");
		System.out.println("mg_yn_20 = [" + getMg_yn_20() + "]");
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
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
String mg_yn_10 = req.getParameter("mg_yn_10");
if( mg_yn_10 == null){
	System.out.println(this.toString+" : mg_yn_10 is null" );
}else{
	System.out.println(this.toString+" : mg_yn_10 is "+mg_yn_10 );
}
String mg_yn_20 = req.getParameter("mg_yn_20");
if( mg_yn_20 == null){
	System.out.println(this.toString+" : mg_yn_20 is null" );
}else{
	System.out.println(this.toString+" : mg_yn_20 is "+mg_yn_20 );
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
String base_dt = Util.checkString(req.getParameter("base_dt"));
String mg_yn_10 = Util.checkString(req.getParameter("mg_yn_10"));
String mg_yn_20 = Util.checkString(req.getParameter("mg_yn_20"));
String pers_ip_addr = Util.checkString(req.getParameter("pers_ip_addr"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
String mg_yn_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_yn_10")));
String mg_yn_20 = Util.Uni2Ksc(Util.checkString(req.getParameter("mg_yn_20")));
String pers_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_ip_addr")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBase_dt(base_dt);
dm.setMg_yn_10(mg_yn_10);
dm.setMg_yn_20(mg_yn_20);
dm.setPers_ip_addr(pers_ip_addr);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 23 22:29:44 KST 2009 */