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


public class MT_PAPINOUT_2214_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String fac_clsf;

	public MT_PAPINOUT_2214_LDM(){}
	public MT_PAPINOUT_2214_LDM(String cmpy_cd, String ewh_dt, String fac_clsf){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.fac_clsf = fac_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2214_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2214_LDM dm = (MT_PAPINOUT_2214_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2214_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
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
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setFac_clsf(fac_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 20:40:13 KST 2009 */