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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_5020_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String fac_clsf;
	public String base_make_servcost;
	public String base_make_servcost1;
	public String basi_sep_prtn_servcost;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String chg_pers;

	public PR_PAPMAKE_5020_ADM(){}
	public PR_PAPMAKE_5020_ADM(String cmpy_cd, String yymm, String fac_clsf, String base_make_servcost, String base_make_servcost1, String basi_sep_prtn_servcost, String incmg_pers_ipaddr, String incmg_pers, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.fac_clsf = fac_clsf;
		this.base_make_servcost = base_make_servcost;
		this.base_make_servcost1 = base_make_servcost1;
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setBase_make_servcost(String base_make_servcost){
		this.base_make_servcost = base_make_servcost;
	}

	public void setBase_make_servcost1(String base_make_servcost1){
		this.base_make_servcost1 = base_make_servcost1;
	}

	public void setBasi_sep_prtn_servcost(String basi_sep_prtn_servcost){
		this.basi_sep_prtn_servcost = basi_sep_prtn_servcost;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getBase_make_servcost(){
		return this.base_make_servcost;
	}

	public String getBase_make_servcost1(){
		return this.base_make_servcost1;
	}

	public String getBasi_sep_prtn_servcost(){
		return this.basi_sep_prtn_servcost;
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
		 return "{ call MISMAT.SP_PR_PAPMAKE_5020_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_5020_ADM dm = (PR_PAPMAKE_5020_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.base_make_servcost);
		cstmt.setString(7, dm.base_make_servcost1);
		cstmt.setString(8, dm.basi_sep_prtn_servcost);
		cstmt.setString(9, dm.incmg_pers_ipaddr);
		cstmt.setString(10, dm.incmg_pers);
		cstmt.setString(11, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_5020_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("base_make_servcost = [" + getBase_make_servcost() + "]");
		System.out.println("base_make_servcost1 = [" + getBase_make_servcost1() + "]");
		System.out.println("basi_sep_prtn_servcost = [" + getBasi_sep_prtn_servcost() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String base_make_servcost = req.getParameter("base_make_servcost");
if( base_make_servcost == null){
	System.out.println(this.toString+" : base_make_servcost is null" );
}else{
	System.out.println(this.toString+" : base_make_servcost is "+base_make_servcost );
}
String base_make_servcost1 = req.getParameter("base_make_servcost1");
if( base_make_servcost1 == null){
	System.out.println(this.toString+" : base_make_servcost1 is null" );
}else{
	System.out.println(this.toString+" : base_make_servcost1 is "+base_make_servcost1 );
}
String basi_sep_prtn_servcost = req.getParameter("basi_sep_prtn_servcost");
if( basi_sep_prtn_servcost == null){
	System.out.println(this.toString+" : basi_sep_prtn_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_sep_prtn_servcost is "+basi_sep_prtn_servcost );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String base_make_servcost = Util.checkString(req.getParameter("base_make_servcost"));
String base_make_servcost1 = Util.checkString(req.getParameter("base_make_servcost1"));
String basi_sep_prtn_servcost = Util.checkString(req.getParameter("basi_sep_prtn_servcost"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String base_make_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("base_make_servcost")));
String base_make_servcost1 = Util.Uni2Ksc(Util.checkString(req.getParameter("base_make_servcost1")));
String basi_sep_prtn_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_sep_prtn_servcost")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setFac_clsf(fac_clsf);
dm.setBase_make_servcost(base_make_servcost);
dm.setBase_make_servcost1(base_make_servcost1);
dm.setBasi_sep_prtn_servcost(basi_sep_prtn_servcost);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 11 14:55:12 KST 2009 */