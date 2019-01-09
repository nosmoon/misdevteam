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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_6214_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String tms;
	public String clsf_cd;
	public String budg_clas_cd;
	public String mm_amt_1;
	public String mm_amt_2;
	public String mm_amt_3;
	public String mm_amt_4;
	public String mm_amt_5;
	public String mm_amt_6;
	public String mm_amt_7;
	public String mm_amt_8;
	public String mm_amt_9;
	public String mm_amt_10;
	public String mm_amt_11;
	public String mm_amt_12;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MC_BUDG_6214_IDM(){}
	public MC_BUDG_6214_IDM(String cmpy_cd, String yy, String tms, String clsf_cd, String budg_clas_cd, String mm_amt_1, String mm_amt_2, String mm_amt_3, String mm_amt_4, String mm_amt_5, String mm_amt_6, String mm_amt_7, String mm_amt_8, String mm_amt_9, String mm_amt_10, String mm_amt_11, String mm_amt_12, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.tms = tms;
		this.clsf_cd = clsf_cd;
		this.budg_clas_cd = budg_clas_cd;
		this.mm_amt_1 = mm_amt_1;
		this.mm_amt_2 = mm_amt_2;
		this.mm_amt_3 = mm_amt_3;
		this.mm_amt_4 = mm_amt_4;
		this.mm_amt_5 = mm_amt_5;
		this.mm_amt_6 = mm_amt_6;
		this.mm_amt_7 = mm_amt_7;
		this.mm_amt_8 = mm_amt_8;
		this.mm_amt_9 = mm_amt_9;
		this.mm_amt_10 = mm_amt_10;
		this.mm_amt_11 = mm_amt_11;
		this.mm_amt_12 = mm_amt_12;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setBudg_clas_cd(String budg_clas_cd){
		this.budg_clas_cd = budg_clas_cd;
	}

	public void setMm_amt_1(String mm_amt_1){
		this.mm_amt_1 = mm_amt_1;
	}

	public void setMm_amt_2(String mm_amt_2){
		this.mm_amt_2 = mm_amt_2;
	}

	public void setMm_amt_3(String mm_amt_3){
		this.mm_amt_3 = mm_amt_3;
	}

	public void setMm_amt_4(String mm_amt_4){
		this.mm_amt_4 = mm_amt_4;
	}

	public void setMm_amt_5(String mm_amt_5){
		this.mm_amt_5 = mm_amt_5;
	}

	public void setMm_amt_6(String mm_amt_6){
		this.mm_amt_6 = mm_amt_6;
	}

	public void setMm_amt_7(String mm_amt_7){
		this.mm_amt_7 = mm_amt_7;
	}

	public void setMm_amt_8(String mm_amt_8){
		this.mm_amt_8 = mm_amt_8;
	}

	public void setMm_amt_9(String mm_amt_9){
		this.mm_amt_9 = mm_amt_9;
	}

	public void setMm_amt_10(String mm_amt_10){
		this.mm_amt_10 = mm_amt_10;
	}

	public void setMm_amt_11(String mm_amt_11){
		this.mm_amt_11 = mm_amt_11;
	}

	public void setMm_amt_12(String mm_amt_12){
		this.mm_amt_12 = mm_amt_12;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getTms(){
		return this.tms;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getBudg_clas_cd(){
		return this.budg_clas_cd;
	}

	public String getMm_amt_1(){
		return this.mm_amt_1;
	}

	public String getMm_amt_2(){
		return this.mm_amt_2;
	}

	public String getMm_amt_3(){
		return this.mm_amt_3;
	}

	public String getMm_amt_4(){
		return this.mm_amt_4;
	}

	public String getMm_amt_5(){
		return this.mm_amt_5;
	}

	public String getMm_amt_6(){
		return this.mm_amt_6;
	}

	public String getMm_amt_7(){
		return this.mm_amt_7;
	}

	public String getMm_amt_8(){
		return this.mm_amt_8;
	}

	public String getMm_amt_9(){
		return this.mm_amt_9;
	}

	public String getMm_amt_10(){
		return this.mm_amt_10;
	}

	public String getMm_amt_11(){
		return this.mm_amt_11;
	}

	public String getMm_amt_12(){
		return this.mm_amt_12;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6214_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6214_IDM dm = (MC_BUDG_6214_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.tms);
		cstmt.setString(6, dm.clsf_cd);
		cstmt.setString(7, dm.budg_clas_cd);
		cstmt.setString(8, dm.mm_amt_1);
		cstmt.setString(9, dm.mm_amt_2);
		cstmt.setString(10, dm.mm_amt_3);
		cstmt.setString(11, dm.mm_amt_4);
		cstmt.setString(12, dm.mm_amt_5);
		cstmt.setString(13, dm.mm_amt_6);
		cstmt.setString(14, dm.mm_amt_7);
		cstmt.setString(15, dm.mm_amt_8);
		cstmt.setString(16, dm.mm_amt_9);
		cstmt.setString(17, dm.mm_amt_10);
		cstmt.setString(18, dm.mm_amt_11);
		cstmt.setString(19, dm.mm_amt_12);
		cstmt.setString(20, dm.incmg_pers_ipadd);
		cstmt.setString(21, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6214_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("budg_clas_cd = [" + getBudg_clas_cd() + "]");
		System.out.println("mm_amt_1 = [" + getMm_amt_1() + "]");
		System.out.println("mm_amt_2 = [" + getMm_amt_2() + "]");
		System.out.println("mm_amt_3 = [" + getMm_amt_3() + "]");
		System.out.println("mm_amt_4 = [" + getMm_amt_4() + "]");
		System.out.println("mm_amt_5 = [" + getMm_amt_5() + "]");
		System.out.println("mm_amt_6 = [" + getMm_amt_6() + "]");
		System.out.println("mm_amt_7 = [" + getMm_amt_7() + "]");
		System.out.println("mm_amt_8 = [" + getMm_amt_8() + "]");
		System.out.println("mm_amt_9 = [" + getMm_amt_9() + "]");
		System.out.println("mm_amt_10 = [" + getMm_amt_10() + "]");
		System.out.println("mm_amt_11 = [" + getMm_amt_11() + "]");
		System.out.println("mm_amt_12 = [" + getMm_amt_12() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String budg_clas_cd = req.getParameter("budg_clas_cd");
if( budg_clas_cd == null){
	System.out.println(this.toString+" : budg_clas_cd is null" );
}else{
	System.out.println(this.toString+" : budg_clas_cd is "+budg_clas_cd );
}
String mm_amt_1 = req.getParameter("mm_amt_1");
if( mm_amt_1 == null){
	System.out.println(this.toString+" : mm_amt_1 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_1 is "+mm_amt_1 );
}
String mm_amt_2 = req.getParameter("mm_amt_2");
if( mm_amt_2 == null){
	System.out.println(this.toString+" : mm_amt_2 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_2 is "+mm_amt_2 );
}
String mm_amt_3 = req.getParameter("mm_amt_3");
if( mm_amt_3 == null){
	System.out.println(this.toString+" : mm_amt_3 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_3 is "+mm_amt_3 );
}
String mm_amt_4 = req.getParameter("mm_amt_4");
if( mm_amt_4 == null){
	System.out.println(this.toString+" : mm_amt_4 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_4 is "+mm_amt_4 );
}
String mm_amt_5 = req.getParameter("mm_amt_5");
if( mm_amt_5 == null){
	System.out.println(this.toString+" : mm_amt_5 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_5 is "+mm_amt_5 );
}
String mm_amt_6 = req.getParameter("mm_amt_6");
if( mm_amt_6 == null){
	System.out.println(this.toString+" : mm_amt_6 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_6 is "+mm_amt_6 );
}
String mm_amt_7 = req.getParameter("mm_amt_7");
if( mm_amt_7 == null){
	System.out.println(this.toString+" : mm_amt_7 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_7 is "+mm_amt_7 );
}
String mm_amt_8 = req.getParameter("mm_amt_8");
if( mm_amt_8 == null){
	System.out.println(this.toString+" : mm_amt_8 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_8 is "+mm_amt_8 );
}
String mm_amt_9 = req.getParameter("mm_amt_9");
if( mm_amt_9 == null){
	System.out.println(this.toString+" : mm_amt_9 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_9 is "+mm_amt_9 );
}
String mm_amt_10 = req.getParameter("mm_amt_10");
if( mm_amt_10 == null){
	System.out.println(this.toString+" : mm_amt_10 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_10 is "+mm_amt_10 );
}
String mm_amt_11 = req.getParameter("mm_amt_11");
if( mm_amt_11 == null){
	System.out.println(this.toString+" : mm_amt_11 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_11 is "+mm_amt_11 );
}
String mm_amt_12 = req.getParameter("mm_amt_12");
if( mm_amt_12 == null){
	System.out.println(this.toString+" : mm_amt_12 is null" );
}else{
	System.out.println(this.toString+" : mm_amt_12 is "+mm_amt_12 );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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
String yy = Util.checkString(req.getParameter("yy"));
String tms = Util.checkString(req.getParameter("tms"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String budg_clas_cd = Util.checkString(req.getParameter("budg_clas_cd"));
String mm_amt_1 = Util.checkString(req.getParameter("mm_amt_1"));
String mm_amt_2 = Util.checkString(req.getParameter("mm_amt_2"));
String mm_amt_3 = Util.checkString(req.getParameter("mm_amt_3"));
String mm_amt_4 = Util.checkString(req.getParameter("mm_amt_4"));
String mm_amt_5 = Util.checkString(req.getParameter("mm_amt_5"));
String mm_amt_6 = Util.checkString(req.getParameter("mm_amt_6"));
String mm_amt_7 = Util.checkString(req.getParameter("mm_amt_7"));
String mm_amt_8 = Util.checkString(req.getParameter("mm_amt_8"));
String mm_amt_9 = Util.checkString(req.getParameter("mm_amt_9"));
String mm_amt_10 = Util.checkString(req.getParameter("mm_amt_10"));
String mm_amt_11 = Util.checkString(req.getParameter("mm_amt_11"));
String mm_amt_12 = Util.checkString(req.getParameter("mm_amt_12"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String budg_clas_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_clas_cd")));
String mm_amt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_1")));
String mm_amt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_2")));
String mm_amt_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_3")));
String mm_amt_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_4")));
String mm_amt_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_5")));
String mm_amt_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_6")));
String mm_amt_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_7")));
String mm_amt_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_8")));
String mm_amt_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_9")));
String mm_amt_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_10")));
String mm_amt_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_11")));
String mm_amt_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt_12")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setTms(tms);
dm.setClsf_cd(clsf_cd);
dm.setBudg_clas_cd(budg_clas_cd);
dm.setMm_amt_1(mm_amt_1);
dm.setMm_amt_2(mm_amt_2);
dm.setMm_amt_3(mm_amt_3);
dm.setMm_amt_4(mm_amt_4);
dm.setMm_amt_5(mm_amt_5);
dm.setMm_amt_6(mm_amt_6);
dm.setMm_amt_7(mm_amt_7);
dm.setMm_amt_8(mm_amt_8);
dm.setMm_amt_9(mm_amt_9);
dm.setMm_amt_10(mm_amt_10);
dm.setMm_amt_11(mm_amt_11);
dm.setMm_amt_12(mm_amt_12);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 16:40:12 KST 2009 */