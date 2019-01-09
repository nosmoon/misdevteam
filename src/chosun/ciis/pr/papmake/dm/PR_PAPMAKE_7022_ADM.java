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


public class PR_PAPMAKE_7022_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ispt_dt;
	public String ispt_cd;
	public String ispt_clsf;
	public String fac_clsf;
	public String ispt_clas1;
	public String ispt_clas2;
	public String ispt_rslt;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PAPMAKE_7022_ADM(){}
	public PR_PAPMAKE_7022_ADM(String cmpy_cd, String ispt_dt, String ispt_cd, String ispt_clsf, String fac_clsf, String ispt_clas1, String ispt_clas2, String ispt_rslt, String remk, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.ispt_dt = ispt_dt;
		this.ispt_cd = ispt_cd;
		this.ispt_clsf = ispt_clsf;
		this.fac_clsf = fac_clsf;
		this.ispt_clas1 = ispt_clas1;
		this.ispt_clas2 = ispt_clas2;
		this.ispt_rslt = ispt_rslt;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIspt_dt(String ispt_dt){
		this.ispt_dt = ispt_dt;
	}

	public void setIspt_cd(String ispt_cd){
		this.ispt_cd = ispt_cd;
	}

	public void setIspt_clsf(String ispt_clsf){
		this.ispt_clsf = ispt_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIspt_clas1(String ispt_clas1){
		this.ispt_clas1 = ispt_clas1;
	}

	public void setIspt_clas2(String ispt_clas2){
		this.ispt_clas2 = ispt_clas2;
	}

	public void setIspt_rslt(String ispt_rslt){
		this.ispt_rslt = ispt_rslt;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIspt_dt(){
		return this.ispt_dt;
	}

	public String getIspt_cd(){
		return this.ispt_cd;
	}

	public String getIspt_clsf(){
		return this.ispt_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIspt_clas1(){
		return this.ispt_clas1;
	}

	public String getIspt_clas2(){
		return this.ispt_clas2;
	}

	public String getIspt_rslt(){
		return this.ispt_rslt;
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

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_7022_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_7022_ADM dm = (PR_PAPMAKE_7022_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ispt_dt);
		cstmt.setString(5, dm.ispt_cd);
		cstmt.setString(6, dm.ispt_clsf);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.ispt_clas1);
		cstmt.setString(9, dm.ispt_clas2);
		cstmt.setString(10, dm.ispt_rslt);
		cstmt.setString(11, dm.remk);
		cstmt.setString(12, dm.incmg_pers_ipaddr);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_7022_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ispt_dt = [" + getIspt_dt() + "]");
		System.out.println("ispt_cd = [" + getIspt_cd() + "]");
		System.out.println("ispt_clsf = [" + getIspt_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("ispt_clas1 = [" + getIspt_clas1() + "]");
		System.out.println("ispt_clas2 = [" + getIspt_clas2() + "]");
		System.out.println("ispt_rslt = [" + getIspt_rslt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String ispt_dt = req.getParameter("ispt_dt");
if( ispt_dt == null){
	System.out.println(this.toString+" : ispt_dt is null" );
}else{
	System.out.println(this.toString+" : ispt_dt is "+ispt_dt );
}
String ispt_cd = req.getParameter("ispt_cd");
if( ispt_cd == null){
	System.out.println(this.toString+" : ispt_cd is null" );
}else{
	System.out.println(this.toString+" : ispt_cd is "+ispt_cd );
}
String ispt_clsf = req.getParameter("ispt_clsf");
if( ispt_clsf == null){
	System.out.println(this.toString+" : ispt_clsf is null" );
}else{
	System.out.println(this.toString+" : ispt_clsf is "+ispt_clsf );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String ispt_clas3 = req.getParameter("ispt_clas3");
if( ispt_clas3 == null){
	System.out.println(this.toString+" : ispt_clas3 is null" );
}else{
	System.out.println(this.toString+" : ispt_clas3 is "+ispt_clas3 );
}
String ispt_clas4 = req.getParameter("ispt_clas4");
if( ispt_clas4 == null){
	System.out.println(this.toString+" : ispt_clas4 is null" );
}else{
	System.out.println(this.toString+" : ispt_clas4 is "+ispt_clas4 );
}
String ispt_rslt = req.getParameter("ispt_rslt");
if( ispt_rslt == null){
	System.out.println(this.toString+" : ispt_rslt is null" );
}else{
	System.out.println(this.toString+" : ispt_rslt is "+ispt_rslt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ispt_dt = Util.checkString(req.getParameter("ispt_dt"));
String ispt_cd = Util.checkString(req.getParameter("ispt_cd"));
String ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String ispt_clas3 = Util.checkString(req.getParameter("ispt_clas3"));
String ispt_clas4 = Util.checkString(req.getParameter("ispt_clas4"));
String ispt_rslt = Util.checkString(req.getParameter("ispt_rslt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ispt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_dt")));
String ispt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_cd")));
String ispt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clsf")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String ispt_clas3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clas3")));
String ispt_clas4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clas4")));
String ispt_rslt = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_rslt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIspt_dt(ispt_dt);
dm.setIspt_cd(ispt_cd);
dm.setIspt_clsf(ispt_clsf);
dm.setFac_clsf(fac_clsf);
dm.setIspt_clas3(ispt_clas3);
dm.setIspt_clas4(ispt_clas4);
dm.setIspt_rslt(ispt_rslt);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 08 17:35:48 KST 2016 */