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


package chosun.ciis.as.aset.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.ds.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1502_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String chg_dt;
	public String aset_no_list;

	public AS_ASET_1502_LDM(){}
	public AS_ASET_1502_LDM(String cmpy_cd, String chg_dt, String aset_no_list){
		this.cmpy_cd = cmpy_cd;
		this.chg_dt = chg_dt;
		this.aset_no_list = aset_no_list;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setAset_no_list(String aset_no_list){
		this.aset_no_list = aset_no_list;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getAset_no_list(){
		return this.aset_no_list;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASET_1502_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASET_1502_LDM dm = (AS_ASET_1502_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.chg_dt);
		cstmt.setString(5, dm.aset_no_list);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.aset.ds.AS_ASET_1502_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("chg_dt = [" + getChg_dt() + "]");
		System.out.println("aset_no_list = [" + getAset_no_list() + "]");
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
String chg_dt = req.getParameter("chg_dt");
if( chg_dt == null){
	System.out.println(this.toString+" : chg_dt is null" );
}else{
	System.out.println(this.toString+" : chg_dt is "+chg_dt );
}
String aset_no_list = req.getParameter("aset_no_list");
if( aset_no_list == null){
	System.out.println(this.toString+" : aset_no_list is null" );
}else{
	System.out.println(this.toString+" : aset_no_list is "+aset_no_list );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String chg_dt = Util.checkString(req.getParameter("chg_dt"));
String aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_dt")));
String aset_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_list")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setChg_dt(chg_dt);
dm.setAset_no_list(aset_no_list);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 14 14:02:05 KST 2009 */