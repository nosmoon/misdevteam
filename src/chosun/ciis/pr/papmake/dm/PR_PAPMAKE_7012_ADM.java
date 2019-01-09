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


public class PR_PAPMAKE_7012_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ispt_cd;
	public String ispt_nm;
	public String fac_clsf;
	public String ispt_clsf;
	public String ispt_clas1;
	public String ispt_clas2;
	public String ispt_clas3;
	public String ispt_clas4;
	public String ispt_months;
	public String ispt_days;
	public String remk;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public PR_PAPMAKE_7012_ADM(){}
	public PR_PAPMAKE_7012_ADM(String cmpy_cd, String ispt_cd, String ispt_nm, String fac_clsf,  String ispt_clsf, String ispt_clas1, String ispt_clas2, String ispt_clas3, String ispt_clas4, String ispt_months, String remk, String ispt_days, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.ispt_cd = ispt_cd;
		this.ispt_nm = ispt_nm;
		this.fac_clsf = fac_clsf;
		this.ispt_clsf = ispt_clsf;
		this.ispt_clas1 = ispt_clas1;
		this.ispt_clas2 = ispt_clas2;
		this.ispt_clas3 = ispt_clas3;
		this.ispt_clas4 = ispt_clas4;
		this.ispt_months = ispt_months;
		this.ispt_days = ispt_days;
		this.remk = remk;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIspt_cd(String ispt_cd){
		this.ispt_cd = ispt_cd;
	}

	public void setIspt_nm(String ispt_nm){
		this.ispt_nm = ispt_nm;
	}

	public void setIspt_clsf(String ispt_clsf){
		this.ispt_clsf = ispt_clsf;
	}
	
	public void setFac_clsf(String fac_clsf) {
		this.fac_clsf = fac_clsf;
	}
	
	public void setIspt_clas1(String ispt_clas1){
		this.ispt_clas1 = ispt_clas1;
	}

	public void setIspt_clas2(String ispt_clas2){
		this.ispt_clas2 = ispt_clas2;
	}
	
	public void setIspt_clas3(String ispt_clas3){
		this.ispt_clas3 = ispt_clas3;
	}

	public void setIspt_clas4(String ispt_clas4){
		this.ispt_clas4 = ispt_clas4;
	}

	public void setIspt_months(String ispt_months){
		this.ispt_months = ispt_months;
	}
	
	public void setIspt_days(String ispt_days) {
		this.ispt_days = ispt_days;
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

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIspt_cd(){
		return this.ispt_cd;
	}

	public String getIspt_nm(){
		return this.ispt_nm;
	}
	
	public String getFac_clsf() {
		return fac_clsf;
	}
	
	public String getIspt_clsf(){
		return this.ispt_clsf;
	}

	public String getIspt_clas1(){
		return this.ispt_clas1;
	}

	public String getIspt_clas2(){
		return this.ispt_clas2;
	}

	public String getIspt_clas3(){
		return this.ispt_clas3;
	}

	public String getIspt_clas4(){
		return this.ispt_clas4;
	}

	public String getIspt_months(){
		return this.ispt_months;
	}
	
	public String getIspt_days() {
		return ispt_days;
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

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_7012_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_7012_ADM dm = (PR_PAPMAKE_7012_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ispt_cd);
		cstmt.setString(5, dm.ispt_nm);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.ispt_clsf);
		cstmt.setString(8, dm.ispt_clas1);
		cstmt.setString(9, dm.ispt_clas2);
		cstmt.setString(10, dm.ispt_clas3);
		cstmt.setString(11, dm.ispt_clas4);
		cstmt.setString(12, dm.ispt_months);
		cstmt.setString(13, dm.ispt_days);
		cstmt.setString(14, dm.remk);
		cstmt.setString(15, dm.incmg_pers_ipaddr);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.gubun);
		cstmt.registerOutParameter(18, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_7012_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ispt_cd = [" + getIspt_cd() + "]");
		System.out.println("ispt_nm = [" + getIspt_nm() + "]");
		System.out.println("ispt_clsf = [" + getIspt_clsf() + "]");
		System.out.println("ispt_clas1 = [" + getIspt_clas1() + "]");
		System.out.println("ispt_clas2 = [" + getIspt_clas2() + "]");
		System.out.println("ispt_clas3 = [" + getIspt_clas3() + "]");
		System.out.println("ispt_clas4 = [" + getIspt_clas4() + "]");
		System.out.println("ispt_months = [" + getIspt_months() + "]");
		System.out.println("ispt_months = [" + getIspt_days() + "]");
		System.out.println("remk = [" + getRemk() + "]");
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
String ispt_cd = req.getParameter("ispt_cd");
if( ispt_cd == null){
	System.out.println(this.toString+" : ispt_cd is null" );
}else{
	System.out.println(this.toString+" : ispt_cd is "+ispt_cd );
}
String ispt_nm = req.getParameter("ispt_nm");
if( ispt_nm == null){
	System.out.println(this.toString+" : ispt_nm is null" );
}else{
	System.out.println(this.toString+" : ispt_nm is "+ispt_nm );
}
String ispt_clsf = req.getParameter("ispt_clsf");
if( ispt_clsf == null){
	System.out.println(this.toString+" : ispt_clsf is null" );
}else{
	System.out.println(this.toString+" : ispt_clsf is "+ispt_clsf );
}
String ispt_clas1 = req.getParameter("ispt_clas1");
if( ispt_clas1 == null){
	System.out.println(this.toString+" : ispt_clas1 is null" );
}else{
	System.out.println(this.toString+" : ispt_clas1 is "+ispt_clas1 );
}
String ispt_clas2 = req.getParameter("ispt_clas2");
if( ispt_clas2 == null){
	System.out.println(this.toString+" : ispt_clas2 is null" );
}else{
	System.out.println(this.toString+" : ispt_clas2 is "+ispt_clas2 );
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
String ispt_months = req.getParameter("ispt_months");
if( ispt_months == null){
	System.out.println(this.toString+" : ispt_months is null" );
}else{
	System.out.println(this.toString+" : ispt_months is "+ispt_months );
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
String ispt_cd = Util.checkString(req.getParameter("ispt_cd"));
String ispt_nm = Util.checkString(req.getParameter("ispt_nm"));
String ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
String ispt_clas1 = Util.checkString(req.getParameter("ispt_clas1"));
String ispt_clas2 = Util.checkString(req.getParameter("ispt_clas2"));
String ispt_clas3 = Util.checkString(req.getParameter("ispt_clas3"));
String ispt_clas4 = Util.checkString(req.getParameter("ispt_clas4"));
String ispt_months = Util.checkString(req.getParameter("ispt_months"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ispt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_cd")));
String ispt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_nm")));
String ispt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clsf")));
String ispt_clas1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clas1")));
String ispt_clas2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clas2")));
String ispt_clas3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clas3")));
String ispt_clas4 = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clas4")));
String ispt_months = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_months")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIspt_cd(ispt_cd);
dm.setIspt_nm(ispt_nm);
dm.setIspt_clsf(ispt_clsf);
dm.setIspt_clas1(ispt_clas1);
dm.setIspt_clas2(ispt_clas2);
dm.setIspt_clas3(ispt_clas3);
dm.setIspt_clas4(ispt_clas4);
dm.setIspt_months(ispt_months);
dm.setRemk(remk);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 30 14:53:20 KST 2015 */