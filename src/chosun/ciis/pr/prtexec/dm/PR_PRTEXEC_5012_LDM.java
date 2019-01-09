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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_5012_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String issu_pcnt;
	public String clr_pcnt;

	public PR_PRTEXEC_5012_LDM(){}
	public PR_PRTEXEC_5012_LDM(String cmpy_cd, String prt_dt, String issu_dt, String fac_clsf, String medi_cd, String sect_cd, String issu_pcnt, String clr_pcnt){
		this.cmpy_cd = cmpy_cd;
		this.prt_dt = prt_dt;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.issu_pcnt = issu_pcnt;
		this.clr_pcnt = clr_pcnt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_5012_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_5012_LDM dm = (PR_PRTEXEC_5012_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prt_dt);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.medi_cd);
		cstmt.setString(8, dm.sect_cd);
		cstmt.setString(9, dm.issu_pcnt);
		cstmt.setString(10, dm.clr_pcnt);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_5012_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prt_dt = [" + getPrt_dt() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("clr_pcnt = [" + getClr_pcnt() + "]");
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
String prt_dt = req.getParameter("prt_dt");
if( prt_dt == null){
	System.out.println(this.toString+" : prt_dt is null" );
}else{
	System.out.println(this.toString+" : prt_dt is "+prt_dt );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String clr_pcnt = req.getParameter("clr_pcnt");
if( clr_pcnt == null){
	System.out.println(this.toString+" : clr_pcnt is null" );
}else{
	System.out.println(this.toString+" : clr_pcnt is "+clr_pcnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String prt_dt = Util.checkString(req.getParameter("prt_dt"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String clr_pcnt = Util.checkString(req.getParameter("clr_pcnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_dt")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String clr_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("clr_pcnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPrt_dt(prt_dt);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_pcnt(issu_pcnt);
dm.setClr_pcnt(clr_pcnt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 09 02:06:23 KST 2009 */