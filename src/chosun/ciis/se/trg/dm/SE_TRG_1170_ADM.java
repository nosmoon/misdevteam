/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.trg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.trg.ds.*;
import chosun.ciis.se.trg.rec.*;

/**
 * 
 */


public class SE_TRG_1170_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyy;
	public String area_cd;
	public String bo_cdseq;
	public String trgt1_1;
	public String trgt1_2;
	public String trgt1_3;
	public String trgt1_4;
	public String trgt1_5;
	public String trgt1_6;
	public String trgt1_7;
	public String trgt1_8;
	public String trgt1_9;
	public String trgt1_10;
	public String trgt1_11;
	public String trgt1_12;
	public String trgt2_1;
	public String trgt2_2;
	public String trgt2_3;
	public String trgt2_4;
	public String trgt2_5;
	public String trgt2_6;
	public String trgt2_7;
	public String trgt2_8;
	public String trgt2_9;
	public String trgt2_10;
	public String trgt2_11;
	public String trgt2_12;
	public String trgt3_1;
	public String trgt3_2;
	public String trgt3_3;
	public String trgt3_4;
	public String trgt3_5;
	public String trgt3_6;
	public String trgt3_7;
	public String trgt3_8;
	public String trgt3_9;
	public String trgt3_10;
	public String trgt3_11;
	public String trgt3_12;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_TRG_1170_ADM(){}
	public SE_TRG_1170_ADM(String cmpy_cd, String yyyy, String area_cd, String bo_cdseq, String trgt1_1, String trgt1_2, String trgt1_3, String trgt1_4, String trgt1_5, String trgt1_6, String trgt1_7, String trgt1_8, String trgt1_9, String trgt1_10, String trgt1_11, String trgt1_12, String trgt2_1, String trgt2_2, String trgt2_3, String trgt2_4, String trgt2_5, String trgt2_6, String trgt2_7, String trgt2_8, String trgt2_9, String trgt2_10, String trgt2_11, String trgt2_12, String trgt3_1, String trgt3_2, String trgt3_3, String trgt3_4, String trgt3_5, String trgt3_6, String trgt3_7, String trgt3_8, String trgt3_9, String trgt3_10, String trgt3_11, String trgt3_12, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yyyy = yyyy;
		this.area_cd = area_cd;
		this.bo_cdseq = bo_cdseq;
		this.trgt1_1 = trgt1_1;
		this.trgt1_2 = trgt1_2;
		this.trgt1_3 = trgt1_3;
		this.trgt1_4 = trgt1_4;
		this.trgt1_5 = trgt1_5;
		this.trgt1_6 = trgt1_6;
		this.trgt1_7 = trgt1_7;
		this.trgt1_8 = trgt1_8;
		this.trgt1_9 = trgt1_9;
		this.trgt1_10 = trgt1_10;
		this.trgt1_11 = trgt1_11;
		this.trgt1_12 = trgt1_12;
		this.trgt2_1 = trgt2_1;
		this.trgt2_2 = trgt2_2;
		this.trgt2_3 = trgt2_3;
		this.trgt2_4 = trgt2_4;
		this.trgt2_5 = trgt2_5;
		this.trgt2_6 = trgt2_6;
		this.trgt2_7 = trgt2_7;
		this.trgt2_8 = trgt2_8;
		this.trgt2_9 = trgt2_9;
		this.trgt2_10 = trgt2_10;
		this.trgt2_11 = trgt2_11;
		this.trgt2_12 = trgt2_12;
		this.trgt3_1 = trgt3_1;
		this.trgt3_2 = trgt3_2;
		this.trgt3_3 = trgt3_3;
		this.trgt3_4 = trgt3_4;
		this.trgt3_5 = trgt3_5;
		this.trgt3_6 = trgt3_6;
		this.trgt3_7 = trgt3_7;
		this.trgt3_8 = trgt3_8;
		this.trgt3_9 = trgt3_9;
		this.trgt3_10 = trgt3_10;
		this.trgt3_11 = trgt3_11;
		this.trgt3_12 = trgt3_12;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyy(String yyyy){
		this.yyyy = yyyy;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_cdseq(String bo_cdseq){
		this.bo_cdseq = bo_cdseq;
	}

	public void setTrgt1_1(String trgt1_1){
		this.trgt1_1 = trgt1_1;
	}

	public void setTrgt1_2(String trgt1_2){
		this.trgt1_2 = trgt1_2;
	}

	public void setTrgt1_3(String trgt1_3){
		this.trgt1_3 = trgt1_3;
	}

	public void setTrgt1_4(String trgt1_4){
		this.trgt1_4 = trgt1_4;
	}

	public void setTrgt1_5(String trgt1_5){
		this.trgt1_5 = trgt1_5;
	}

	public void setTrgt1_6(String trgt1_6){
		this.trgt1_6 = trgt1_6;
	}

	public void setTrgt1_7(String trgt1_7){
		this.trgt1_7 = trgt1_7;
	}

	public void setTrgt1_8(String trgt1_8){
		this.trgt1_8 = trgt1_8;
	}

	public void setTrgt1_9(String trgt1_9){
		this.trgt1_9 = trgt1_9;
	}

	public void setTrgt1_10(String trgt1_10){
		this.trgt1_10 = trgt1_10;
	}

	public void setTrgt1_11(String trgt1_11){
		this.trgt1_11 = trgt1_11;
	}

	public void setTrgt1_12(String trgt1_12){
		this.trgt1_12 = trgt1_12;
	}

	public void setTrgt2_1(String trgt2_1){
		this.trgt2_1 = trgt2_1;
	}

	public void setTrgt2_2(String trgt2_2){
		this.trgt2_2 = trgt2_2;
	}

	public void setTrgt2_3(String trgt2_3){
		this.trgt2_3 = trgt2_3;
	}

	public void setTrgt2_4(String trgt2_4){
		this.trgt2_4 = trgt2_4;
	}

	public void setTrgt2_5(String trgt2_5){
		this.trgt2_5 = trgt2_5;
	}

	public void setTrgt2_6(String trgt2_6){
		this.trgt2_6 = trgt2_6;
	}

	public void setTrgt2_7(String trgt2_7){
		this.trgt2_7 = trgt2_7;
	}

	public void setTrgt2_8(String trgt2_8){
		this.trgt2_8 = trgt2_8;
	}

	public void setTrgt2_9(String trgt2_9){
		this.trgt2_9 = trgt2_9;
	}

	public void setTrgt2_10(String trgt2_10){
		this.trgt2_10 = trgt2_10;
	}

	public void setTrgt2_11(String trgt2_11){
		this.trgt2_11 = trgt2_11;
	}

	public void setTrgt2_12(String trgt2_12){
		this.trgt2_12 = trgt2_12;
	}

	public void setTrgt3_1(String trgt3_1){
		this.trgt3_1 = trgt3_1;
	}

	public void setTrgt3_2(String trgt3_2){
		this.trgt3_2 = trgt3_2;
	}

	public void setTrgt3_3(String trgt3_3){
		this.trgt3_3 = trgt3_3;
	}

	public void setTrgt3_4(String trgt3_4){
		this.trgt3_4 = trgt3_4;
	}

	public void setTrgt3_5(String trgt3_5){
		this.trgt3_5 = trgt3_5;
	}

	public void setTrgt3_6(String trgt3_6){
		this.trgt3_6 = trgt3_6;
	}

	public void setTrgt3_7(String trgt3_7){
		this.trgt3_7 = trgt3_7;
	}

	public void setTrgt3_8(String trgt3_8){
		this.trgt3_8 = trgt3_8;
	}

	public void setTrgt3_9(String trgt3_9){
		this.trgt3_9 = trgt3_9;
	}

	public void setTrgt3_10(String trgt3_10){
		this.trgt3_10 = trgt3_10;
	}

	public void setTrgt3_11(String trgt3_11){
		this.trgt3_11 = trgt3_11;
	}

	public void setTrgt3_12(String trgt3_12){
		this.trgt3_12 = trgt3_12;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyy(){
		return this.yyyy;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_cdseq(){
		return this.bo_cdseq;
	}

	public String getTrgt1_1(){
		return this.trgt1_1;
	}

	public String getTrgt1_2(){
		return this.trgt1_2;
	}

	public String getTrgt1_3(){
		return this.trgt1_3;
	}

	public String getTrgt1_4(){
		return this.trgt1_4;
	}

	public String getTrgt1_5(){
		return this.trgt1_5;
	}

	public String getTrgt1_6(){
		return this.trgt1_6;
	}

	public String getTrgt1_7(){
		return this.trgt1_7;
	}

	public String getTrgt1_8(){
		return this.trgt1_8;
	}

	public String getTrgt1_9(){
		return this.trgt1_9;
	}

	public String getTrgt1_10(){
		return this.trgt1_10;
	}

	public String getTrgt1_11(){
		return this.trgt1_11;
	}

	public String getTrgt1_12(){
		return this.trgt1_12;
	}

	public String getTrgt2_1(){
		return this.trgt2_1;
	}

	public String getTrgt2_2(){
		return this.trgt2_2;
	}

	public String getTrgt2_3(){
		return this.trgt2_3;
	}

	public String getTrgt2_4(){
		return this.trgt2_4;
	}

	public String getTrgt2_5(){
		return this.trgt2_5;
	}

	public String getTrgt2_6(){
		return this.trgt2_6;
	}

	public String getTrgt2_7(){
		return this.trgt2_7;
	}

	public String getTrgt2_8(){
		return this.trgt2_8;
	}

	public String getTrgt2_9(){
		return this.trgt2_9;
	}

	public String getTrgt2_10(){
		return this.trgt2_10;
	}

	public String getTrgt2_11(){
		return this.trgt2_11;
	}

	public String getTrgt2_12(){
		return this.trgt2_12;
	}

	public String getTrgt3_1(){
		return this.trgt3_1;
	}

	public String getTrgt3_2(){
		return this.trgt3_2;
	}

	public String getTrgt3_3(){
		return this.trgt3_3;
	}

	public String getTrgt3_4(){
		return this.trgt3_4;
	}

	public String getTrgt3_5(){
		return this.trgt3_5;
	}

	public String getTrgt3_6(){
		return this.trgt3_6;
	}

	public String getTrgt3_7(){
		return this.trgt3_7;
	}

	public String getTrgt3_8(){
		return this.trgt3_8;
	}

	public String getTrgt3_9(){
		return this.trgt3_9;
	}

	public String getTrgt3_10(){
		return this.trgt3_10;
	}

	public String getTrgt3_11(){
		return this.trgt3_11;
	}

	public String getTrgt3_12(){
		return this.trgt3_12;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_TRG_1170_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_TRG_1170_ADM dm = (SE_TRG_1170_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyy);
		cstmt.setString(5, dm.area_cd);
		cstmt.setString(6, dm.bo_cdseq);
		cstmt.setString(7, dm.trgt1_1);
		cstmt.setString(8, dm.trgt1_2);
		cstmt.setString(9, dm.trgt1_3);
		cstmt.setString(10, dm.trgt1_4);
		cstmt.setString(11, dm.trgt1_5);
		cstmt.setString(12, dm.trgt1_6);
		cstmt.setString(13, dm.trgt1_7);
		cstmt.setString(14, dm.trgt1_8);
		cstmt.setString(15, dm.trgt1_9);
		cstmt.setString(16, dm.trgt1_10);
		cstmt.setString(17, dm.trgt1_11);
		cstmt.setString(18, dm.trgt1_12);
		cstmt.setString(19, dm.trgt2_1);
		cstmt.setString(20, dm.trgt2_2);
		cstmt.setString(21, dm.trgt2_3);
		cstmt.setString(22, dm.trgt2_4);
		cstmt.setString(23, dm.trgt2_5);
		cstmt.setString(24, dm.trgt2_6);
		cstmt.setString(25, dm.trgt2_7);
		cstmt.setString(26, dm.trgt2_8);
		cstmt.setString(27, dm.trgt2_9);
		cstmt.setString(28, dm.trgt2_10);
		cstmt.setString(29, dm.trgt2_11);
		cstmt.setString(30, dm.trgt2_12);
		cstmt.setString(31, dm.trgt3_1);
		cstmt.setString(32, dm.trgt3_2);
		cstmt.setString(33, dm.trgt3_3);
		cstmt.setString(34, dm.trgt3_4);
		cstmt.setString(35, dm.trgt3_5);
		cstmt.setString(36, dm.trgt3_6);
		cstmt.setString(37, dm.trgt3_7);
		cstmt.setString(38, dm.trgt3_8);
		cstmt.setString(39, dm.trgt3_9);
		cstmt.setString(40, dm.trgt3_10);
		cstmt.setString(41, dm.trgt3_11);
		cstmt.setString(42, dm.trgt3_12);
		cstmt.setString(43, dm.incmg_pers_ip);
		cstmt.setString(44, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.trg.ds.SE_TRG_1170_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yyyy = " + getYyyy());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("bo_cdseq = " + getBo_cdseq());
        System.out.println("trgt1_1 = " + getTrgt1_1());
        System.out.println("trgt1_2 = " + getTrgt1_2());
        System.out.println("trgt1_3 = " + getTrgt1_3());
        System.out.println("trgt1_4 = " + getTrgt1_4());
        System.out.println("trgt1_5 = " + getTrgt1_5());
        System.out.println("trgt1_6 = " + getTrgt1_6());
        System.out.println("trgt1_7 = " + getTrgt1_7());
        System.out.println("trgt1_8 = " + getTrgt1_8());
        System.out.println("trgt1_9 = " + getTrgt1_9());
        System.out.println("trgt1_10 = " + getTrgt1_10());
        System.out.println("trgt1_11 = " + getTrgt1_11());
        System.out.println("trgt1_12 = " + getTrgt1_12());
        System.out.println("trgt2_1 = " + getTrgt2_1());
        System.out.println("trgt2_2 = " + getTrgt2_2());
        System.out.println("trgt2_3 = " + getTrgt2_3());
        System.out.println("trgt2_4 = " + getTrgt2_4());
        System.out.println("trgt2_5 = " + getTrgt2_5());
        System.out.println("trgt2_6 = " + getTrgt2_6());
        System.out.println("trgt2_7 = " + getTrgt2_7());
        System.out.println("trgt2_8 = " + getTrgt2_8());
        System.out.println("trgt2_9 = " + getTrgt2_9());
        System.out.println("trgt2_10 = " + getTrgt2_10());
        System.out.println("trgt2_11 = " + getTrgt2_11());
        System.out.println("trgt2_12 = " + getTrgt2_12());
        System.out.println("trgt3_1 = " + getTrgt3_1());
        System.out.println("trgt3_2 = " + getTrgt3_2());
        System.out.println("trgt3_3 = " + getTrgt3_3());
        System.out.println("trgt3_4 = " + getTrgt3_4());
        System.out.println("trgt3_5 = " + getTrgt3_5());
        System.out.println("trgt3_6 = " + getTrgt3_6());
        System.out.println("trgt3_7 = " + getTrgt3_7());
        System.out.println("trgt3_8 = " + getTrgt3_8());
        System.out.println("trgt3_9 = " + getTrgt3_9());
        System.out.println("trgt3_10 = " + getTrgt3_10());
        System.out.println("trgt3_11 = " + getTrgt3_11());
        System.out.println("trgt3_12 = " + getTrgt3_12());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String yyyy = req.getParameter("yyyy");
if( yyyy == null){
	System.out.println(this.toString+" : yyyy is null" );
}else{
	System.out.println(this.toString+" : yyyy is "+yyyy );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String bo_cdseq = req.getParameter("bo_cdseq");
if( bo_cdseq == null){
	System.out.println(this.toString+" : bo_cdseq is null" );
}else{
	System.out.println(this.toString+" : bo_cdseq is "+bo_cdseq );
}
String trgt1_1 = req.getParameter("trgt1_1");
if( trgt1_1 == null){
	System.out.println(this.toString+" : trgt1_1 is null" );
}else{
	System.out.println(this.toString+" : trgt1_1 is "+trgt1_1 );
}
String trgt1_2 = req.getParameter("trgt1_2");
if( trgt1_2 == null){
	System.out.println(this.toString+" : trgt1_2 is null" );
}else{
	System.out.println(this.toString+" : trgt1_2 is "+trgt1_2 );
}
String trgt1_3 = req.getParameter("trgt1_3");
if( trgt1_3 == null){
	System.out.println(this.toString+" : trgt1_3 is null" );
}else{
	System.out.println(this.toString+" : trgt1_3 is "+trgt1_3 );
}
String trgt1_4 = req.getParameter("trgt1_4");
if( trgt1_4 == null){
	System.out.println(this.toString+" : trgt1_4 is null" );
}else{
	System.out.println(this.toString+" : trgt1_4 is "+trgt1_4 );
}
String trgt1_5 = req.getParameter("trgt1_5");
if( trgt1_5 == null){
	System.out.println(this.toString+" : trgt1_5 is null" );
}else{
	System.out.println(this.toString+" : trgt1_5 is "+trgt1_5 );
}
String trgt1_6 = req.getParameter("trgt1_6");
if( trgt1_6 == null){
	System.out.println(this.toString+" : trgt1_6 is null" );
}else{
	System.out.println(this.toString+" : trgt1_6 is "+trgt1_6 );
}
String trgt1_7 = req.getParameter("trgt1_7");
if( trgt1_7 == null){
	System.out.println(this.toString+" : trgt1_7 is null" );
}else{
	System.out.println(this.toString+" : trgt1_7 is "+trgt1_7 );
}
String trgt1_8 = req.getParameter("trgt1_8");
if( trgt1_8 == null){
	System.out.println(this.toString+" : trgt1_8 is null" );
}else{
	System.out.println(this.toString+" : trgt1_8 is "+trgt1_8 );
}
String trgt1_9 = req.getParameter("trgt1_9");
if( trgt1_9 == null){
	System.out.println(this.toString+" : trgt1_9 is null" );
}else{
	System.out.println(this.toString+" : trgt1_9 is "+trgt1_9 );
}
String trgt1_10 = req.getParameter("trgt1_10");
if( trgt1_10 == null){
	System.out.println(this.toString+" : trgt1_10 is null" );
}else{
	System.out.println(this.toString+" : trgt1_10 is "+trgt1_10 );
}
String trgt1_11 = req.getParameter("trgt1_11");
if( trgt1_11 == null){
	System.out.println(this.toString+" : trgt1_11 is null" );
}else{
	System.out.println(this.toString+" : trgt1_11 is "+trgt1_11 );
}
String trgt1_12 = req.getParameter("trgt1_12");
if( trgt1_12 == null){
	System.out.println(this.toString+" : trgt1_12 is null" );
}else{
	System.out.println(this.toString+" : trgt1_12 is "+trgt1_12 );
}
String trgt2_1 = req.getParameter("trgt2_1");
if( trgt2_1 == null){
	System.out.println(this.toString+" : trgt2_1 is null" );
}else{
	System.out.println(this.toString+" : trgt2_1 is "+trgt2_1 );
}
String trgt2_2 = req.getParameter("trgt2_2");
if( trgt2_2 == null){
	System.out.println(this.toString+" : trgt2_2 is null" );
}else{
	System.out.println(this.toString+" : trgt2_2 is "+trgt2_2 );
}
String trgt2_3 = req.getParameter("trgt2_3");
if( trgt2_3 == null){
	System.out.println(this.toString+" : trgt2_3 is null" );
}else{
	System.out.println(this.toString+" : trgt2_3 is "+trgt2_3 );
}
String trgt2_4 = req.getParameter("trgt2_4");
if( trgt2_4 == null){
	System.out.println(this.toString+" : trgt2_4 is null" );
}else{
	System.out.println(this.toString+" : trgt2_4 is "+trgt2_4 );
}
String trgt2_5 = req.getParameter("trgt2_5");
if( trgt2_5 == null){
	System.out.println(this.toString+" : trgt2_5 is null" );
}else{
	System.out.println(this.toString+" : trgt2_5 is "+trgt2_5 );
}
String trgt2_6 = req.getParameter("trgt2_6");
if( trgt2_6 == null){
	System.out.println(this.toString+" : trgt2_6 is null" );
}else{
	System.out.println(this.toString+" : trgt2_6 is "+trgt2_6 );
}
String trgt2_7 = req.getParameter("trgt2_7");
if( trgt2_7 == null){
	System.out.println(this.toString+" : trgt2_7 is null" );
}else{
	System.out.println(this.toString+" : trgt2_7 is "+trgt2_7 );
}
String trgt2_8 = req.getParameter("trgt2_8");
if( trgt2_8 == null){
	System.out.println(this.toString+" : trgt2_8 is null" );
}else{
	System.out.println(this.toString+" : trgt2_8 is "+trgt2_8 );
}
String trgt2_9 = req.getParameter("trgt2_9");
if( trgt2_9 == null){
	System.out.println(this.toString+" : trgt2_9 is null" );
}else{
	System.out.println(this.toString+" : trgt2_9 is "+trgt2_9 );
}
String trgt2_10 = req.getParameter("trgt2_10");
if( trgt2_10 == null){
	System.out.println(this.toString+" : trgt2_10 is null" );
}else{
	System.out.println(this.toString+" : trgt2_10 is "+trgt2_10 );
}
String trgt2_11 = req.getParameter("trgt2_11");
if( trgt2_11 == null){
	System.out.println(this.toString+" : trgt2_11 is null" );
}else{
	System.out.println(this.toString+" : trgt2_11 is "+trgt2_11 );
}
String trgt2_12 = req.getParameter("trgt2_12");
if( trgt2_12 == null){
	System.out.println(this.toString+" : trgt2_12 is null" );
}else{
	System.out.println(this.toString+" : trgt2_12 is "+trgt2_12 );
}
String trgt3_1 = req.getParameter("trgt3_1");
if( trgt3_1 == null){
	System.out.println(this.toString+" : trgt3_1 is null" );
}else{
	System.out.println(this.toString+" : trgt3_1 is "+trgt3_1 );
}
String trgt3_2 = req.getParameter("trgt3_2");
if( trgt3_2 == null){
	System.out.println(this.toString+" : trgt3_2 is null" );
}else{
	System.out.println(this.toString+" : trgt3_2 is "+trgt3_2 );
}
String trgt3_3 = req.getParameter("trgt3_3");
if( trgt3_3 == null){
	System.out.println(this.toString+" : trgt3_3 is null" );
}else{
	System.out.println(this.toString+" : trgt3_3 is "+trgt3_3 );
}
String trgt3_4 = req.getParameter("trgt3_4");
if( trgt3_4 == null){
	System.out.println(this.toString+" : trgt3_4 is null" );
}else{
	System.out.println(this.toString+" : trgt3_4 is "+trgt3_4 );
}
String trgt3_5 = req.getParameter("trgt3_5");
if( trgt3_5 == null){
	System.out.println(this.toString+" : trgt3_5 is null" );
}else{
	System.out.println(this.toString+" : trgt3_5 is "+trgt3_5 );
}
String trgt3_6 = req.getParameter("trgt3_6");
if( trgt3_6 == null){
	System.out.println(this.toString+" : trgt3_6 is null" );
}else{
	System.out.println(this.toString+" : trgt3_6 is "+trgt3_6 );
}
String trgt3_7 = req.getParameter("trgt3_7");
if( trgt3_7 == null){
	System.out.println(this.toString+" : trgt3_7 is null" );
}else{
	System.out.println(this.toString+" : trgt3_7 is "+trgt3_7 );
}
String trgt3_8 = req.getParameter("trgt3_8");
if( trgt3_8 == null){
	System.out.println(this.toString+" : trgt3_8 is null" );
}else{
	System.out.println(this.toString+" : trgt3_8 is "+trgt3_8 );
}
String trgt3_9 = req.getParameter("trgt3_9");
if( trgt3_9 == null){
	System.out.println(this.toString+" : trgt3_9 is null" );
}else{
	System.out.println(this.toString+" : trgt3_9 is "+trgt3_9 );
}
String trgt3_10 = req.getParameter("trgt3_10");
if( trgt3_10 == null){
	System.out.println(this.toString+" : trgt3_10 is null" );
}else{
	System.out.println(this.toString+" : trgt3_10 is "+trgt3_10 );
}
String trgt3_11 = req.getParameter("trgt3_11");
if( trgt3_11 == null){
	System.out.println(this.toString+" : trgt3_11 is null" );
}else{
	System.out.println(this.toString+" : trgt3_11 is "+trgt3_11 );
}
String trgt3_12 = req.getParameter("trgt3_12");
if( trgt3_12 == null){
	System.out.println(this.toString+" : trgt3_12 is null" );
}else{
	System.out.println(this.toString+" : trgt3_12 is "+trgt3_12 );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String yyyy = Util.checkString(req.getParameter("yyyy"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String bo_cdseq = Util.checkString(req.getParameter("bo_cdseq"));
String trgt1_1 = Util.checkString(req.getParameter("trgt1_1"));
String trgt1_2 = Util.checkString(req.getParameter("trgt1_2"));
String trgt1_3 = Util.checkString(req.getParameter("trgt1_3"));
String trgt1_4 = Util.checkString(req.getParameter("trgt1_4"));
String trgt1_5 = Util.checkString(req.getParameter("trgt1_5"));
String trgt1_6 = Util.checkString(req.getParameter("trgt1_6"));
String trgt1_7 = Util.checkString(req.getParameter("trgt1_7"));
String trgt1_8 = Util.checkString(req.getParameter("trgt1_8"));
String trgt1_9 = Util.checkString(req.getParameter("trgt1_9"));
String trgt1_10 = Util.checkString(req.getParameter("trgt1_10"));
String trgt1_11 = Util.checkString(req.getParameter("trgt1_11"));
String trgt1_12 = Util.checkString(req.getParameter("trgt1_12"));
String trgt2_1 = Util.checkString(req.getParameter("trgt2_1"));
String trgt2_2 = Util.checkString(req.getParameter("trgt2_2"));
String trgt2_3 = Util.checkString(req.getParameter("trgt2_3"));
String trgt2_4 = Util.checkString(req.getParameter("trgt2_4"));
String trgt2_5 = Util.checkString(req.getParameter("trgt2_5"));
String trgt2_6 = Util.checkString(req.getParameter("trgt2_6"));
String trgt2_7 = Util.checkString(req.getParameter("trgt2_7"));
String trgt2_8 = Util.checkString(req.getParameter("trgt2_8"));
String trgt2_9 = Util.checkString(req.getParameter("trgt2_9"));
String trgt2_10 = Util.checkString(req.getParameter("trgt2_10"));
String trgt2_11 = Util.checkString(req.getParameter("trgt2_11"));
String trgt2_12 = Util.checkString(req.getParameter("trgt2_12"));
String trgt3_1 = Util.checkString(req.getParameter("trgt3_1"));
String trgt3_2 = Util.checkString(req.getParameter("trgt3_2"));
String trgt3_3 = Util.checkString(req.getParameter("trgt3_3"));
String trgt3_4 = Util.checkString(req.getParameter("trgt3_4"));
String trgt3_5 = Util.checkString(req.getParameter("trgt3_5"));
String trgt3_6 = Util.checkString(req.getParameter("trgt3_6"));
String trgt3_7 = Util.checkString(req.getParameter("trgt3_7"));
String trgt3_8 = Util.checkString(req.getParameter("trgt3_8"));
String trgt3_9 = Util.checkString(req.getParameter("trgt3_9"));
String trgt3_10 = Util.checkString(req.getParameter("trgt3_10"));
String trgt3_11 = Util.checkString(req.getParameter("trgt3_11"));
String trgt3_12 = Util.checkString(req.getParameter("trgt3_12"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyy = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyy")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String bo_cdseq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cdseq")));
String trgt1_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_1")));
String trgt1_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_2")));
String trgt1_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_3")));
String trgt1_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_4")));
String trgt1_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_5")));
String trgt1_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_6")));
String trgt1_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_7")));
String trgt1_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_8")));
String trgt1_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_9")));
String trgt1_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_10")));
String trgt1_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_11")));
String trgt1_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt1_12")));
String trgt2_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_1")));
String trgt2_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_2")));
String trgt2_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_3")));
String trgt2_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_4")));
String trgt2_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_5")));
String trgt2_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_6")));
String trgt2_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_7")));
String trgt2_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_8")));
String trgt2_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_9")));
String trgt2_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_10")));
String trgt2_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_11")));
String trgt2_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt2_12")));
String trgt3_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_1")));
String trgt3_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_2")));
String trgt3_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_3")));
String trgt3_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_4")));
String trgt3_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_5")));
String trgt3_6 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_6")));
String trgt3_7 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_7")));
String trgt3_8 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_8")));
String trgt3_9 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_9")));
String trgt3_10 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_10")));
String trgt3_11 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_11")));
String trgt3_12 = Util.Uni2Ksc(Util.checkString(req.getParameter("trgt3_12")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyy(yyyy);
dm.setArea_cd(area_cd);
dm.setBo_cdseq(bo_cdseq);
dm.setTrgt1_1(trgt1_1);
dm.setTrgt1_2(trgt1_2);
dm.setTrgt1_3(trgt1_3);
dm.setTrgt1_4(trgt1_4);
dm.setTrgt1_5(trgt1_5);
dm.setTrgt1_6(trgt1_6);
dm.setTrgt1_7(trgt1_7);
dm.setTrgt1_8(trgt1_8);
dm.setTrgt1_9(trgt1_9);
dm.setTrgt1_10(trgt1_10);
dm.setTrgt1_11(trgt1_11);
dm.setTrgt1_12(trgt1_12);
dm.setTrgt2_1(trgt2_1);
dm.setTrgt2_2(trgt2_2);
dm.setTrgt2_3(trgt2_3);
dm.setTrgt2_4(trgt2_4);
dm.setTrgt2_5(trgt2_5);
dm.setTrgt2_6(trgt2_6);
dm.setTrgt2_7(trgt2_7);
dm.setTrgt2_8(trgt2_8);
dm.setTrgt2_9(trgt2_9);
dm.setTrgt2_10(trgt2_10);
dm.setTrgt2_11(trgt2_11);
dm.setTrgt2_12(trgt2_12);
dm.setTrgt3_1(trgt3_1);
dm.setTrgt3_2(trgt3_2);
dm.setTrgt3_3(trgt3_3);
dm.setTrgt3_4(trgt3_4);
dm.setTrgt3_5(trgt3_5);
dm.setTrgt3_6(trgt3_6);
dm.setTrgt3_7(trgt3_7);
dm.setTrgt3_8(trgt3_8);
dm.setTrgt3_9(trgt3_9);
dm.setTrgt3_10(trgt3_10);
dm.setTrgt3_11(trgt3_11);
dm.setTrgt3_12(trgt3_12);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 02 13:57:48 KST 2009 */