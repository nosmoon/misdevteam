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


package chosun.ciis.pr.prtcnsg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtcnsg.ds.*;
import chosun.ciis.pr.prtcnsg.rec.*;

/**
 * 
 */


public class PR_OTHCNSM_1320_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt;
	public String fac_clsf;
	public String papcmpy_cd;
	public String paper_uprc;
	public String paper_portage;

	public PR_OTHCNSM_1320_LDM(){}
	public PR_OTHCNSM_1320_LDM(String cmpy_cd, String aply_dt, String fac_clsf, String papcmpy_cd, String paper_uprc, String paper_portage){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.paper_uprc = paper_uprc;
		this.paper_portage = paper_portage;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPaper_uprc(String paper_uprc){
		this.paper_uprc = paper_uprc;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPaper_uprc(){
		return this.paper_uprc;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_OTHCNSM_1320_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_OTHCNSM_1320_LDM dm = (PR_OTHCNSM_1320_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.papcmpy_cd);
		cstmt.setString(7, dm.paper_uprc);
		cstmt.setString(8, dm.paper_portage);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_OTHCNSM_1320_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("paper_uprc = [" + getPaper_uprc() + "]");
		System.out.println("paper_portage = [" + getPaper_portage() + "]");
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
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String paper_uprc = req.getParameter("paper_uprc");
if( paper_uprc == null){
	System.out.println(this.toString+" : paper_uprc is null" );
}else{
	System.out.println(this.toString+" : paper_uprc is "+paper_uprc );
}
String paper_portage = req.getParameter("paper_portage");
if( paper_portage == null){
	System.out.println(this.toString+" : paper_portage is null" );
}else{
	System.out.println(this.toString+" : paper_portage is "+paper_portage );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String paper_uprc = Util.checkString(req.getParameter("paper_uprc"));
String paper_portage = Util.checkString(req.getParameter("paper_portage"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String paper_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_uprc")));
String paper_portage = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_portage")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setPaper_uprc(paper_uprc);
dm.setPaper_portage(paper_portage);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 18:05:01 KST 2009 */