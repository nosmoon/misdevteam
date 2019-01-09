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


public class MT_PAPINOUT_5201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt_fr;
	public String aply_dt_to;
	public String pj_kind;

	public MT_PAPINOUT_5201_LDM(){}
	public MT_PAPINOUT_5201_LDM(String cmpy_cd, String aply_dt_fr, String aply_dt_to, String pj_kind){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt_fr = aply_dt_fr;
		this.aply_dt_to = aply_dt_to;
		this.pj_kind = pj_kind;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt_fr(String aply_dt_fr){
		this.aply_dt_fr = aply_dt_fr;
	}

	public void setAply_dt_to(String aply_dt_to){
		this.aply_dt_to = aply_dt_to;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt_fr(){
		return this.aply_dt_fr;
	}

	public String getAply_dt_to(){
		return this.aply_dt_to;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_5201_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_5201_LDM dm = (MT_PAPINOUT_5201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt_fr);
		cstmt.setString(5, dm.aply_dt_to);
		cstmt.setString(6, dm.pj_kind);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt_fr = [" + getAply_dt_fr() + "]");
		System.out.println("aply_dt_to = [" + getAply_dt_to() + "]");
		System.out.println("pj_kind = [" + getPj_kind() + "]");
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
String aply_dt_fr = req.getParameter("aply_dt_fr");
if( aply_dt_fr == null){
	System.out.println(this.toString+" : aply_dt_fr is null" );
}else{
	System.out.println(this.toString+" : aply_dt_fr is "+aply_dt_fr );
}
String aply_dt_to = req.getParameter("aply_dt_to");
if( aply_dt_to == null){
	System.out.println(this.toString+" : aply_dt_to is null" );
}else{
	System.out.println(this.toString+" : aply_dt_to is "+aply_dt_to );
}
String pj_kind = req.getParameter("pj_kind");
if( pj_kind == null){
	System.out.println(this.toString+" : pj_kind is null" );
}else{
	System.out.println(this.toString+" : pj_kind is "+pj_kind );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt_fr = Util.checkString(req.getParameter("aply_dt_fr"));
String aply_dt_to = Util.checkString(req.getParameter("aply_dt_to"));
String pj_kind = Util.checkString(req.getParameter("pj_kind"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_fr")));
String aply_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt_to")));
String pj_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("pj_kind")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt_fr(aply_dt_fr);
dm.setAply_dt_to(aply_dt_to);
dm.setPj_kind(pj_kind);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 15:11:17 KST 2009 */