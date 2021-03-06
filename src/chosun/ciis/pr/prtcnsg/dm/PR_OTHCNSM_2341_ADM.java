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


public class PR_OTHCNSM_2341_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt;
	public String medi_cd;
	public String sect_cd;
	public String ink_matr;
	public String ink_clsf;
	public String ink_uprc;
	public String fac_clsf;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public PR_OTHCNSM_2341_ADM(){}
	public PR_OTHCNSM_2341_ADM(String cmpy_cd, String aply_dt, String medi_cd, String sect_cd, String ink_matr, String ink_clsf, String ink_uprc, String fac_clsf, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.ink_matr = ink_matr;
		this.ink_clsf = ink_clsf;
		this.ink_uprc = ink_uprc;
		this.fac_clsf = fac_clsf;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setInk_matr(String ink_matr){
		this.ink_matr = ink_matr;
	}

	public void setInk_clsf(String ink_clsf){
		this.ink_clsf = ink_clsf;
	}

	public void setInk_uprc(String ink_uprc){
		this.ink_uprc = ink_uprc;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getInk_matr(){
		return this.ink_matr;
	}

	public String getInk_clsf(){
		return this.ink_clsf;
	}

	public String getInk_uprc(){
		return this.ink_uprc;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_OTHCNSM_2341_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_OTHCNSM_2341_ADM dm = (PR_OTHCNSM_2341_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.sect_cd);
		cstmt.setString(7, dm.ink_matr);
		cstmt.setString(8, dm.ink_clsf);
		cstmt.setString(9, dm.ink_uprc);
		cstmt.setString(10, dm.fac_clsf);
		cstmt.setString(11, dm.incmg_pers_ipaddr);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_OTHCNSM_2341_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("ink_matr = [" + getInk_matr() + "]");
		System.out.println("ink_clsf = [" + getInk_clsf() + "]");
		System.out.println("ink_uprc = [" + getInk_uprc() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String ink_matr = req.getParameter("ink_matr");
if( ink_matr == null){
	System.out.println(this.toString+" : ink_matr is null" );
}else{
	System.out.println(this.toString+" : ink_matr is "+ink_matr );
}
String ink_clsf = req.getParameter("ink_clsf");
if( ink_clsf == null){
	System.out.println(this.toString+" : ink_clsf is null" );
}else{
	System.out.println(this.toString+" : ink_clsf is "+ink_clsf );
}
String ink_uprc = req.getParameter("ink_uprc");
if( ink_uprc == null){
	System.out.println(this.toString+" : ink_uprc is null" );
}else{
	System.out.println(this.toString+" : ink_uprc is "+ink_uprc );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String ink_matr = Util.checkString(req.getParameter("ink_matr"));
String ink_clsf = Util.checkString(req.getParameter("ink_clsf"));
String ink_uprc = Util.checkString(req.getParameter("ink_uprc"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String ink_matr = Util.Uni2Ksc(Util.checkString(req.getParameter("ink_matr")));
String ink_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ink_clsf")));
String ink_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("ink_uprc")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setInk_matr(ink_matr);
dm.setInk_clsf(ink_clsf);
dm.setInk_uprc(ink_uprc);
dm.setFac_clsf(fac_clsf);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 23 14:10:45 KST 2009 */