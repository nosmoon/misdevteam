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


public class PR_PRTCNSG_1321_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String aply_dt;
	public String papcmpy_cd;
	public String paper_uprc;
	public String paper_portage;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public PR_PRTCNSG_1321_ADM(){}
	public PR_PRTCNSG_1321_ADM(String cmpy_cd, String fac_clsf, String aply_dt, String papcmpy_cd, String paper_uprc, String paper_portage, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.aply_dt = aply_dt;
		this.papcmpy_cd = papcmpy_cd;
		this.paper_uprc = paper_uprc;
		this.paper_portage = paper_portage;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
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

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
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
		 return "{ call MISMAT.SP_PR_PRTCNSG_1321_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTCNSG_1321_ADM dm = (PR_PRTCNSG_1321_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.aply_dt);
		cstmt.setString(6, dm.papcmpy_cd);
		cstmt.setString(7, dm.paper_uprc);
		cstmt.setString(8, dm.paper_portage);
		cstmt.setString(9, dm.incmg_pers_ipaddr);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtcnsg.ds.PR_PRTCNSG_1321_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("paper_uprc = [" + getPaper_uprc() + "]");
		System.out.println("paper_portage = [" + getPaper_portage() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String aply_dt = req.getParameter("aply_dt");
if( aply_dt == null){
	System.out.println(this.toString+" : aply_dt is null" );
}else{
	System.out.println(this.toString+" : aply_dt is "+aply_dt );
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
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String paper_uprc = Util.checkString(req.getParameter("paper_uprc"));
String paper_portage = Util.checkString(req.getParameter("paper_portage"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String paper_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_uprc")));
String paper_portage = Util.Uni2Ksc(Util.checkString(req.getParameter("paper_portage")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setAply_dt(aply_dt);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setPaper_uprc(paper_uprc);
dm.setPaper_portage(paper_portage);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 10:05:41 KST 2009 */