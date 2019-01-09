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


public class MT_PAPINOUT_2224_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String inout_dt;
	public String fac_clsf_fr;
	public String fac_clsf_to;
	public String inout_clsf;

	public MT_PAPINOUT_2224_LDM(){}
	public MT_PAPINOUT_2224_LDM(String cmpy_cd, String inout_dt, String fac_clsf_fr, String fac_clsf_to, String inout_clsf){
		this.cmpy_cd = cmpy_cd;
		this.inout_dt = inout_dt;
		this.fac_clsf_fr = fac_clsf_fr;
		this.fac_clsf_to = fac_clsf_to;
		this.inout_clsf = inout_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInout_dt(String inout_dt){
		this.inout_dt = inout_dt;
	}

	public void setFac_clsf_fr(String fac_clsf_fr){
		this.fac_clsf_fr = fac_clsf_fr;
	}

	public void setFac_clsf_to(String fac_clsf_to){
		this.fac_clsf_to = fac_clsf_to;
	}

	public void setInout_clsf(String inout_clsf){
		this.inout_clsf = inout_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInout_dt(){
		return this.inout_dt;
	}

	public String getFac_clsf_fr(){
		return this.fac_clsf_fr;
	}

	public String getFac_clsf_to(){
		return this.fac_clsf_to;
	}

	public String getInout_clsf(){
		return this.inout_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2224_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2224_LDM dm = (MT_PAPINOUT_2224_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.inout_dt);
		cstmt.setString(5, dm.fac_clsf_fr);
		cstmt.setString(6, dm.fac_clsf_to);
		cstmt.setString(7, dm.inout_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2224_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("inout_dt = [" + getInout_dt() + "]");
		System.out.println("fac_clsf_fr = [" + getFac_clsf_fr() + "]");
		System.out.println("fac_clsf_to = [" + getFac_clsf_to() + "]");
		System.out.println("inout_clsf = [" + getInout_clsf() + "]");
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
String inout_dt = req.getParameter("inout_dt");
if( inout_dt == null){
	System.out.println(this.toString+" : inout_dt is null" );
}else{
	System.out.println(this.toString+" : inout_dt is "+inout_dt );
}
String fac_clsf_fr = req.getParameter("fac_clsf_fr");
if( fac_clsf_fr == null){
	System.out.println(this.toString+" : fac_clsf_fr is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_fr is "+fac_clsf_fr );
}
String fac_clsf_to = req.getParameter("fac_clsf_to");
if( fac_clsf_to == null){
	System.out.println(this.toString+" : fac_clsf_to is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_to is "+fac_clsf_to );
}
String inout_clsf = req.getParameter("inout_clsf");
if( inout_clsf == null){
	System.out.println(this.toString+" : inout_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_clsf is "+inout_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String inout_dt = Util.checkString(req.getParameter("inout_dt"));
String fac_clsf_fr = Util.checkString(req.getParameter("fac_clsf_fr"));
String fac_clsf_to = Util.checkString(req.getParameter("fac_clsf_to"));
String inout_clsf = Util.checkString(req.getParameter("inout_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String inout_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_dt")));
String fac_clsf_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_fr")));
String fac_clsf_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_to")));
String inout_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInout_dt(inout_dt);
dm.setFac_clsf_fr(fac_clsf_fr);
dm.setFac_clsf_to(fac_clsf_to);
dm.setInout_clsf(inout_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Dec 05 16:35:09 KST 2009 */