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


public class PR_PRTEXEC_6020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String gubun;
	public String cmpy_cd;
	public String aply_strt_yymm;
	public String medi_clsf;
	public String ecnt;
	public String edt_nm;
	public String use_frdt;
	public String use_susp_dt;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String chg_pers;

	public PR_PRTEXEC_6020_ADM(){}
	public PR_PRTEXEC_6020_ADM(String gubun, String cmpy_cd, String aply_strt_yymm, String medi_clsf, String ecnt, String edt_nm, String use_frdt, String use_susp_dt, String remk, String incmg_pers_ipaddr, String incmg_pers, String chg_pers){
		this.gubun = gubun;
		this.cmpy_cd = cmpy_cd;
		this.aply_strt_yymm = aply_strt_yymm;
		this.medi_clsf = medi_clsf;
		this.ecnt = ecnt;
		this.edt_nm = edt_nm;
		this.use_frdt = use_frdt;
		this.use_susp_dt = use_susp_dt;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_strt_yymm(String aply_strt_yymm){
		this.aply_strt_yymm = aply_strt_yymm;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setEdt_nm(String edt_nm){
		this.edt_nm = edt_nm;
	}

	public void setUse_frdt(String use_frdt){
		this.use_frdt = use_frdt;
	}

	public void setUse_susp_dt(String use_susp_dt){
		this.use_susp_dt = use_susp_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_strt_yymm(){
		return this.aply_strt_yymm;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getEdt_nm(){
		return this.edt_nm;
	}

	public String getUse_frdt(){
		return this.use_frdt;
	}

	public String getUse_susp_dt(){
		return this.use_susp_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PRTEXEC_6020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_6020_ADM dm = (PR_PRTEXEC_6020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.gubun);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.aply_strt_yymm);
		cstmt.setString(6, dm.medi_clsf);
		cstmt.setString(7, dm.ecnt);
		cstmt.setString(8, dm.edt_nm);
		cstmt.setString(9, dm.use_frdt);
		cstmt.setString(10, dm.use_susp_dt);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.incmg_pers_ipaddr);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_6020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_strt_yymm = [" + getAply_strt_yymm() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("ecnt = [" + getEcnt() + "]");
		System.out.println("edt_nm = [" + getEdt_nm() + "]");
		System.out.println("use_frdt = [" + getUse_frdt() + "]");
		System.out.println("use_susp_dt = [" + getUse_susp_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String aply_strt_yymm = req.getParameter("aply_strt_yymm");
if( aply_strt_yymm == null){
	System.out.println(this.toString+" : aply_strt_yymm is null" );
}else{
	System.out.println(this.toString+" : aply_strt_yymm is "+aply_strt_yymm );
}
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
}
String ecnt = req.getParameter("ecnt");
if( ecnt == null){
	System.out.println(this.toString+" : ecnt is null" );
}else{
	System.out.println(this.toString+" : ecnt is "+ecnt );
}
String edt_nm = req.getParameter("edt_nm");
if( edt_nm == null){
	System.out.println(this.toString+" : edt_nm is null" );
}else{
	System.out.println(this.toString+" : edt_nm is "+edt_nm );
}
String use_frdt = req.getParameter("use_frdt");
if( use_frdt == null){
	System.out.println(this.toString+" : use_frdt is null" );
}else{
	System.out.println(this.toString+" : use_frdt is "+use_frdt );
}
String use_susp_dt = req.getParameter("use_susp_dt");
if( use_susp_dt == null){
	System.out.println(this.toString+" : use_susp_dt is null" );
}else{
	System.out.println(this.toString+" : use_susp_dt is "+use_susp_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String gubun = Util.checkString(req.getParameter("gubun"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_strt_yymm = Util.checkString(req.getParameter("aply_strt_yymm"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String ecnt = Util.checkString(req.getParameter("ecnt"));
String edt_nm = Util.checkString(req.getParameter("edt_nm"));
String use_frdt = Util.checkString(req.getParameter("use_frdt"));
String use_susp_dt = Util.checkString(req.getParameter("use_susp_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_strt_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_strt_yymm")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String ecnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ecnt")));
String edt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_nm")));
String use_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_frdt")));
String use_susp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("use_susp_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setGubun(gubun);
dm.setCmpy_cd(cmpy_cd);
dm.setAply_strt_yymm(aply_strt_yymm);
dm.setMedi_clsf(medi_clsf);
dm.setEcnt(ecnt);
dm.setEdt_nm(edt_nm);
dm.setUse_frdt(use_frdt);
dm.setUse_susp_dt(use_susp_dt);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 30 17:20:21 KST 2009 */