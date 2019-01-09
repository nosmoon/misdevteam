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


public class PR_PAPMAKE_4050_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String fac_clsf;

	public PR_PAPMAKE_4050_DDM(){}
	public PR_PAPMAKE_4050_DDM(String cmpy_cd, String yymm, String fac_clsf){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.fac_clsf = fac_clsf;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_4050_D(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_4050_DDM dm = (PR_PAPMAKE_4050_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.fac_clsf);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_4050_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
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
String base_servcost = req.getParameter("base_servcost");
if( base_servcost == null){
	System.out.println(this.toString+" : base_servcost is null" );
}else{
	System.out.println(this.toString+" : base_servcost is "+base_servcost );
}
String basi_excs_servcost = req.getParameter("basi_excs_servcost");
if( basi_excs_servcost == null){
	System.out.println(this.toString+" : basi_excs_servcost is null" );
}else{
	System.out.println(this.toString+" : basi_excs_servcost is "+basi_excs_servcost );
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
String base_servcost = Util.checkString(req.getParameter("base_servcost"));
String basi_excs_servcost = Util.checkString(req.getParameter("basi_excs_servcost"));
String basi_sep_prtn_servcost = Util.checkString(req.getParameter("basi_sep_prtn_servcost"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String base_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("base_servcost")));
String basi_excs_servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_excs_servcost")));
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
dm.setBase_servcost(base_servcost);
dm.setBasi_excs_servcost(basi_excs_servcost);
dm.setBasi_sep_prtn_servcost(basi_sep_prtn_servcost);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 09:02:49 KST 2009 */