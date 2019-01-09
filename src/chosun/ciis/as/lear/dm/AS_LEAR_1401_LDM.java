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


package chosun.ciis.as.lear.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.lear.ds.*;
import chosun.ciis.as.lear.rec.*;

/**
 * 
 */


public class AS_LEAR_1401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String bldg_cd;
	public String clam_fr_dt;
	public String clam_to_dt;

	public AS_LEAR_1401_LDM(){}
	public AS_LEAR_1401_LDM(String cmpy_cd, String bldg_cd, String clam_fr_dt, String clam_to_dt){
		this.cmpy_cd = cmpy_cd;
		this.bldg_cd = bldg_cd;
		this.clam_fr_dt = clam_fr_dt;
		this.clam_to_dt = clam_to_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setClam_fr_dt(String clam_fr_dt){
		this.clam_fr_dt = clam_fr_dt;
	}

	public void setClam_to_dt(String clam_to_dt){
		this.clam_to_dt = clam_to_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getClam_fr_dt(){
		return this.clam_fr_dt;
	}

	public String getClam_to_dt(){
		return this.clam_to_dt;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAR_1401_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAR_1401_LDM dm = (AS_LEAR_1401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.bldg_cd);
		cstmt.setString(5, dm.clam_fr_dt);
		cstmt.setString(6, dm.clam_to_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.lear.ds.AS_LEAR_1401_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bldg_cd = [" + getBldg_cd() + "]");
		System.out.println("clam_fr_dt = [" + getClam_fr_dt() + "]");
		System.out.println("clam_to_dt = [" + getClam_to_dt() + "]");
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
String clam_fr_dt = req.getParameter("clam_fr_dt");
if( clam_fr_dt == null){
	System.out.println(this.toString+" : clam_fr_dt is null" );
}else{
	System.out.println(this.toString+" : clam_fr_dt is "+clam_fr_dt );
}
String clam_to_dt = req.getParameter("clam_to_dt");
if( clam_to_dt == null){
	System.out.println(this.toString+" : clam_to_dt is null" );
}else{
	System.out.println(this.toString+" : clam_to_dt is "+clam_to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bldg_cd = Util.checkString(req.getParameter("bldg_cd"));
String clam_fr_dt = Util.checkString(req.getParameter("clam_fr_dt"));
String clam_to_dt = Util.checkString(req.getParameter("clam_to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bldg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bldg_cd")));
String clam_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_fr_dt")));
String clam_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBldg_cd(bldg_cd);
dm.setClam_fr_dt(clam_fr_dt);
dm.setClam_to_dt(clam_to_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 09:47:29 KST 2009 */