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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_6001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt;
	public String oil_clsf_1;
	public String oil_clsf_2;
	public String oil_clsf_3;
	public String oil_clsf_4;
	public String oil_clsf_5;
	public String oil_clsf_6;
	public String gubun;
	public String incmg_pers;
	public String incmg_pers_ipaddr;

	public MT_ETCCAR_6001_ADM(){}
	public MT_ETCCAR_6001_ADM(String cmpy_cd, String aply_dt, String oil_clsf_1, String oil_clsf_2, String oil_clsf_3, String oil_clsf_4, String oil_clsf_5, String oil_clsf_6, String gubun, String incmg_pers, String incmg_pers_ipaddr){
		this.cmpy_cd = cmpy_cd;
		this.aply_dt = aply_dt;
		this.oil_clsf_1 = oil_clsf_1;
		this.oil_clsf_2 = oil_clsf_2;
		this.oil_clsf_3 = oil_clsf_3;
		this.oil_clsf_4 = oil_clsf_4;
		this.oil_clsf_5 = oil_clsf_5;
		this.oil_clsf_6 = oil_clsf_6;
		this.gubun = gubun;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setOil_clsf_1(String oil_clsf_1){
		this.oil_clsf_1 = oil_clsf_1;
	}

	public void setOil_clsf_2(String oil_clsf_2){
		this.oil_clsf_2 = oil_clsf_2;
	}

	public void setOil_clsf_3(String oil_clsf_3){
		this.oil_clsf_3 = oil_clsf_3;
	}

	public void setOil_clsf_4(String oil_clsf_4){
		this.oil_clsf_4 = oil_clsf_4;
	}

	public void setOil_clsf_5(String oil_clsf_5){
		this.oil_clsf_5 = oil_clsf_5;
	}

	public void setOil_clsf_6(String oil_clsf_6){
		this.oil_clsf_6 = oil_clsf_6;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getOil_clsf_1(){
		return this.oil_clsf_1;
	}

	public String getOil_clsf_2(){
		return this.oil_clsf_2;
	}

	public String getOil_clsf_3(){
		return this.oil_clsf_3;
	}

	public String getOil_clsf_4(){
		return this.oil_clsf_4;
	}

	public String getOil_clsf_5(){
		return this.oil_clsf_5;
	}

	public String getOil_clsf_6(){
		return this.oil_clsf_6;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_6001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_6001_ADM dm = (MT_ETCCAR_6001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aply_dt);
		cstmt.setString(5, dm.oil_clsf_1);
		cstmt.setString(6, dm.oil_clsf_2);
		cstmt.setString(7, dm.oil_clsf_3);
		cstmt.setString(8, dm.oil_clsf_4);
		cstmt.setString(9, dm.oil_clsf_5);
		cstmt.setString(10, dm.oil_clsf_6);
		cstmt.setString(11, dm.gubun);
		cstmt.setString(12, dm.incmg_pers);
		cstmt.setString(13, dm.incmg_pers_ipaddr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_6001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aply_dt = [" + getAply_dt() + "]");
		System.out.println("oil_clsf_1 = [" + getOil_clsf_1() + "]");
		System.out.println("oil_clsf_2 = [" + getOil_clsf_2() + "]");
		System.out.println("oil_clsf_3 = [" + getOil_clsf_3() + "]");
		System.out.println("oil_clsf_4 = [" + getOil_clsf_4() + "]");
		System.out.println("oil_clsf_5 = [" + getOil_clsf_5() + "]");
		System.out.println("oil_clsf_6 = [" + getOil_clsf_6() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
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
String oil_clsf_1 = req.getParameter("oil_clsf_1");
if( oil_clsf_1 == null){
	System.out.println(this.toString+" : oil_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : oil_clsf_1 is "+oil_clsf_1 );
}
String oil_clsf_2 = req.getParameter("oil_clsf_2");
if( oil_clsf_2 == null){
	System.out.println(this.toString+" : oil_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : oil_clsf_2 is "+oil_clsf_2 );
}
String oil_clsf_3 = req.getParameter("oil_clsf_3");
if( oil_clsf_3 == null){
	System.out.println(this.toString+" : oil_clsf_3 is null" );
}else{
	System.out.println(this.toString+" : oil_clsf_3 is "+oil_clsf_3 );
}
String oil_clsf_4 = req.getParameter("oil_clsf_4");
if( oil_clsf_4 == null){
	System.out.println(this.toString+" : oil_clsf_4 is null" );
}else{
	System.out.println(this.toString+" : oil_clsf_4 is "+oil_clsf_4 );
}
String oil_clsf_5 = req.getParameter("oil_clsf_5");
if( oil_clsf_5 == null){
	System.out.println(this.toString+" : oil_clsf_5 is null" );
}else{
	System.out.println(this.toString+" : oil_clsf_5 is "+oil_clsf_5 );
}
String oil_clsf_6 = req.getParameter("oil_clsf_6");
if( oil_clsf_6 == null){
	System.out.println(this.toString+" : oil_clsf_6 is null" );
}else{
	System.out.println(this.toString+" : oil_clsf_6 is "+oil_clsf_6 );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aply_dt = Util.checkString(req.getParameter("aply_dt"));
String oil_clsf_1 = Util.checkString(req.getParameter("oil_clsf_1"));
String oil_clsf_2 = Util.checkString(req.getParameter("oil_clsf_2"));
String oil_clsf_3 = Util.checkString(req.getParameter("oil_clsf_3"));
String oil_clsf_4 = Util.checkString(req.getParameter("oil_clsf_4"));
String oil_clsf_5 = Util.checkString(req.getParameter("oil_clsf_5"));
String oil_clsf_6 = Util.checkString(req.getParameter("oil_clsf_6"));
String gubun = Util.checkString(req.getParameter("gubun"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aply_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_dt")));
String oil_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf_1")));
String oil_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf_2")));
String oil_clsf_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf_3")));
String oil_clsf_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf_4")));
String oil_clsf_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf_5")));
String oil_clsf_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_clsf_6")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAply_dt(aply_dt);
dm.setOil_clsf_1(oil_clsf_1);
dm.setOil_clsf_2(oil_clsf_2);
dm.setOil_clsf_3(oil_clsf_3);
dm.setOil_clsf_4(oil_clsf_4);
dm.setOil_clsf_5(oil_clsf_5);
dm.setOil_clsf_6(oil_clsf_6);
dm.setGubun(gubun);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 18:46:48 KST 2009 */