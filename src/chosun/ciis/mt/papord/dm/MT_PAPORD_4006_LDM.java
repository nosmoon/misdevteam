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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_4006_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt_fr;
	public String issu_dt_to;
	public String fac_clsf;

	public MT_PAPORD_4006_LDM(){}
	public MT_PAPORD_4006_LDM(String cmpy_cd, String issu_dt_fr, String issu_dt_to, String fac_clsf){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt_fr = issu_dt_fr;
		this.issu_dt_to = issu_dt_to;
		this.fac_clsf = fac_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt_fr(String issu_dt_fr){
		this.issu_dt_fr = issu_dt_fr;
	}

	public void setIssu_dt_to(String issu_dt_to){
		this.issu_dt_to = issu_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt_fr(){
		return this.issu_dt_fr;
	}

	public String getIssu_dt_to(){
		return this.issu_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_4006_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_4006_LDM dm = (MT_PAPORD_4006_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt_fr);
		cstmt.setString(5, dm.issu_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_4006_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt_fr = [" + getIssu_dt_fr() + "]");
		System.out.println("issu_dt_to = [" + getIssu_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
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
String issu_dt_fr = req.getParameter("issu_dt_fr");
if( issu_dt_fr == null){
	System.out.println(this.toString+" : issu_dt_fr is null" );
}else{
	System.out.println(this.toString+" : issu_dt_fr is "+issu_dt_fr );
}
String issu_dt_to = req.getParameter("issu_dt_to");
if( issu_dt_to == null){
	System.out.println(this.toString+" : issu_dt_to is null" );
}else{
	System.out.println(this.toString+" : issu_dt_to is "+issu_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
String issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_fr")));
String issu_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt_fr(issu_dt_fr);
dm.setIssu_dt_to(issu_dt_to);
dm.setFac_clsf(fac_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 20:00:26 KST 2009 */