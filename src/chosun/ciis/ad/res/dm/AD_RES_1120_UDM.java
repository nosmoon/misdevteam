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


package chosun.ciis.ad.res.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_RES_1120_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String issu_dt;
	public String issu_side1;
	public String cm1;
	public String dn1;
	public String color1;
	public String issu_side2;
	public String cm2;
	public String dn2;
	public String color2;
	public String issu_side3;
	public String cm3;
	public String dn3;
	public String color3;
	public String issu_side4;
	public String cm4;
	public String dn4;
	public String color4;
	public String issu_side5;
	public String cm5;
	public String dn5;
	public String color5;
	public String issu_side6;
	public String cm6;
	public String dn6;
	public String color6;
	public String issu_side7;
	public String cm7;
	public String dn7;
	public String color7;
	public String issu_side8;
	public String cm8;
	public String dn8;
	public String color8;
	public String incmg_pers;

	public AD_RES_1120_UDM(){}
	public AD_RES_1120_UDM(String cmpy_cd, String medi_cd, String issu_dt, String issu_side1, String cm1, String dn1, String color1, String issu_side2, String cm2, String dn2, String color2, String issu_side3, String cm3, String dn3, String color3, String issu_side4, String cm4, String dn4, String color4, String issu_side5, String cm5, String dn5, String color5, String issu_side6, String cm6, String dn6, String color6, String issu_side7, String cm7, String dn7, String color7, String issu_side8, String cm8, String dn8, String color8, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.issu_dt = issu_dt;
		this.issu_side1 = issu_side1;
		this.cm1 = cm1;
		this.dn1 = dn1;
		this.color1 = color1;
		this.issu_side2 = issu_side2;
		this.cm2 = cm2;
		this.dn2 = dn2;
		this.color2 = color2;
		this.issu_side3 = issu_side3;
		this.cm3 = cm3;
		this.dn3 = dn3;
		this.color3 = color3;
		this.issu_side4 = issu_side4;
		this.cm4 = cm4;
		this.dn4 = dn4;
		this.color4 = color4;
		this.issu_side5 = issu_side5;
		this.cm5 = cm5;
		this.dn5 = dn5;
		this.color5 = color5;
		this.issu_side6 = issu_side6;
		this.cm6 = cm6;
		this.dn6 = dn6;
		this.color6 = color6;
		this.issu_side7 = issu_side7;
		this.cm7 = cm7;
		this.dn7 = dn7;
		this.color7 = color7;
		this.issu_side8 = issu_side8;
		this.cm8 = cm8;
		this.dn8 = dn8;
		this.color8 = color8;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_side1(String issu_side1){
		this.issu_side1 = issu_side1;
	}

	public void setCm1(String cm1){
		this.cm1 = cm1;
	}

	public void setDn1(String dn1){
		this.dn1 = dn1;
	}

	public void setColor1(String color1){
		this.color1 = color1;
	}

	public void setIssu_side2(String issu_side2){
		this.issu_side2 = issu_side2;
	}

	public void setCm2(String cm2){
		this.cm2 = cm2;
	}

	public void setDn2(String dn2){
		this.dn2 = dn2;
	}

	public void setColor2(String color2){
		this.color2 = color2;
	}

	public void setIssu_side3(String issu_side3){
		this.issu_side3 = issu_side3;
	}

	public void setCm3(String cm3){
		this.cm3 = cm3;
	}

	public void setDn3(String dn3){
		this.dn3 = dn3;
	}

	public void setColor3(String color3){
		this.color3 = color3;
	}

	public void setIssu_side4(String issu_side4){
		this.issu_side4 = issu_side4;
	}

	public void setCm4(String cm4){
		this.cm4 = cm4;
	}

	public void setDn4(String dn4){
		this.dn4 = dn4;
	}

	public void setColor4(String color4){
		this.color4 = color4;
	}

	public void setIssu_side5(String issu_side5){
		this.issu_side5 = issu_side5;
	}

	public void setCm5(String cm5){
		this.cm5 = cm5;
	}

	public void setDn5(String dn5){
		this.dn5 = dn5;
	}

	public void setColor5(String color5){
		this.color5 = color5;
	}

	public void setIssu_side6(String issu_side6){
		this.issu_side6 = issu_side6;
	}

	public void setCm6(String cm6){
		this.cm6 = cm6;
	}

	public void setDn6(String dn6){
		this.dn6 = dn6;
	}

	public void setColor6(String color6){
		this.color6 = color6;
	}

	public void setIssu_side7(String issu_side7){
		this.issu_side7 = issu_side7;
	}

	public void setCm7(String cm7){
		this.cm7 = cm7;
	}

	public void setDn7(String dn7){
		this.dn7 = dn7;
	}

	public void setColor7(String color7){
		this.color7 = color7;
	}

	public void setIssu_side8(String issu_side8){
		this.issu_side8 = issu_side8;
	}

	public void setCm8(String cm8){
		this.cm8 = cm8;
	}

	public void setDn8(String dn8){
		this.dn8 = dn8;
	}

	public void setColor8(String color8){
		this.color8 = color8;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_side1(){
		return this.issu_side1;
	}

	public String getCm1(){
		return this.cm1;
	}

	public String getDn1(){
		return this.dn1;
	}

	public String getColor1(){
		return this.color1;
	}

	public String getIssu_side2(){
		return this.issu_side2;
	}

	public String getCm2(){
		return this.cm2;
	}

	public String getDn2(){
		return this.dn2;
	}

	public String getColor2(){
		return this.color2;
	}

	public String getIssu_side3(){
		return this.issu_side3;
	}

	public String getCm3(){
		return this.cm3;
	}

	public String getDn3(){
		return this.dn3;
	}

	public String getColor3(){
		return this.color3;
	}

	public String getIssu_side4(){
		return this.issu_side4;
	}

	public String getCm4(){
		return this.cm4;
	}

	public String getDn4(){
		return this.dn4;
	}

	public String getColor4(){
		return this.color4;
	}

	public String getIssu_side5(){
		return this.issu_side5;
	}

	public String getCm5(){
		return this.cm5;
	}

	public String getDn5(){
		return this.dn5;
	}

	public String getColor5(){
		return this.color5;
	}

	public String getIssu_side6(){
		return this.issu_side6;
	}

	public String getCm6(){
		return this.cm6;
	}

	public String getDn6(){
		return this.dn6;
	}

	public String getColor6(){
		return this.color6;
	}

	public String getIssu_side7(){
		return this.issu_side7;
	}

	public String getCm7(){
		return this.cm7;
	}

	public String getDn7(){
		return this.dn7;
	}

	public String getColor7(){
		return this.color7;
	}

	public String getIssu_side8(){
		return this.issu_side8;
	}

	public String getCm8(){
		return this.cm8;
	}

	public String getDn8(){
		return this.dn8;
	}

	public String getColor8(){
		return this.color8;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_RES_1120_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1120_UDM dm = (AD_RES_1120_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.issu_dt);
		cstmt.setString(6, dm.issu_side1);
		cstmt.setString(7, dm.cm1);
		cstmt.setString(8, dm.dn1);
		cstmt.setString(9, dm.color1);
		cstmt.setString(10, dm.issu_side2);
		cstmt.setString(11, dm.cm2);
		cstmt.setString(12, dm.dn2);
		cstmt.setString(13, dm.color2);
		cstmt.setString(14, dm.issu_side3);
		cstmt.setString(15, dm.cm3);
		cstmt.setString(16, dm.dn3);
		cstmt.setString(17, dm.color3);
		cstmt.setString(18, dm.issu_side4);
		cstmt.setString(19, dm.cm4);
		cstmt.setString(20, dm.dn4);
		cstmt.setString(21, dm.color4);
		cstmt.setString(22, dm.issu_side5);
		cstmt.setString(23, dm.cm5);
		cstmt.setString(24, dm.dn5);
		cstmt.setString(25, dm.color5);
		cstmt.setString(26, dm.issu_side6);
		cstmt.setString(27, dm.cm6);
		cstmt.setString(28, dm.dn6);
		cstmt.setString(29, dm.color6);
		cstmt.setString(30, dm.issu_side7);
		cstmt.setString(31, dm.cm7);
		cstmt.setString(32, dm.dn7);
		cstmt.setString(33, dm.color7);
		cstmt.setString(34, dm.issu_side8);
		cstmt.setString(35, dm.cm8);
		cstmt.setString(36, dm.dn8);
		cstmt.setString(37, dm.color8);
		cstmt.setString(38, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1120_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("issu_side1 = [" + getIssu_side1() + "]");
		System.out.println("cm1 = [" + getCm1() + "]");
		System.out.println("dn1 = [" + getDn1() + "]");
		System.out.println("color1 = [" + getColor1() + "]");
		System.out.println("issu_side2 = [" + getIssu_side2() + "]");
		System.out.println("cm2 = [" + getCm2() + "]");
		System.out.println("dn2 = [" + getDn2() + "]");
		System.out.println("color2 = [" + getColor2() + "]");
		System.out.println("issu_side3 = [" + getIssu_side3() + "]");
		System.out.println("cm3 = [" + getCm3() + "]");
		System.out.println("dn3 = [" + getDn3() + "]");
		System.out.println("color3 = [" + getColor3() + "]");
		System.out.println("issu_side4 = [" + getIssu_side4() + "]");
		System.out.println("cm4 = [" + getCm4() + "]");
		System.out.println("dn4 = [" + getDn4() + "]");
		System.out.println("color4 = [" + getColor4() + "]");
		System.out.println("issu_side5 = [" + getIssu_side5() + "]");
		System.out.println("cm5 = [" + getCm5() + "]");
		System.out.println("dn5 = [" + getDn5() + "]");
		System.out.println("color5 = [" + getColor5() + "]");
		System.out.println("issu_side6 = [" + getIssu_side6() + "]");
		System.out.println("cm6 = [" + getCm6() + "]");
		System.out.println("dn6 = [" + getDn6() + "]");
		System.out.println("color6 = [" + getColor6() + "]");
		System.out.println("issu_side7 = [" + getIssu_side7() + "]");
		System.out.println("cm7 = [" + getCm7() + "]");
		System.out.println("dn7 = [" + getDn7() + "]");
		System.out.println("color7 = [" + getColor7() + "]");
		System.out.println("issu_side8 = [" + getIssu_side8() + "]");
		System.out.println("cm8 = [" + getCm8() + "]");
		System.out.println("dn8 = [" + getDn8() + "]");
		System.out.println("color8 = [" + getColor8() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String issu_side1 = req.getParameter("issu_side1");
if( issu_side1 == null){
	System.out.println(this.toString+" : issu_side1 is null" );
}else{
	System.out.println(this.toString+" : issu_side1 is "+issu_side1 );
}
String cm1 = req.getParameter("cm1");
if( cm1 == null){
	System.out.println(this.toString+" : cm1 is null" );
}else{
	System.out.println(this.toString+" : cm1 is "+cm1 );
}
String dn1 = req.getParameter("dn1");
if( dn1 == null){
	System.out.println(this.toString+" : dn1 is null" );
}else{
	System.out.println(this.toString+" : dn1 is "+dn1 );
}
String color1 = req.getParameter("color1");
if( color1 == null){
	System.out.println(this.toString+" : color1 is null" );
}else{
	System.out.println(this.toString+" : color1 is "+color1 );
}
String issu_side2 = req.getParameter("issu_side2");
if( issu_side2 == null){
	System.out.println(this.toString+" : issu_side2 is null" );
}else{
	System.out.println(this.toString+" : issu_side2 is "+issu_side2 );
}
String cm2 = req.getParameter("cm2");
if( cm2 == null){
	System.out.println(this.toString+" : cm2 is null" );
}else{
	System.out.println(this.toString+" : cm2 is "+cm2 );
}
String dn2 = req.getParameter("dn2");
if( dn2 == null){
	System.out.println(this.toString+" : dn2 is null" );
}else{
	System.out.println(this.toString+" : dn2 is "+dn2 );
}
String color2 = req.getParameter("color2");
if( color2 == null){
	System.out.println(this.toString+" : color2 is null" );
}else{
	System.out.println(this.toString+" : color2 is "+color2 );
}
String issu_side3 = req.getParameter("issu_side3");
if( issu_side3 == null){
	System.out.println(this.toString+" : issu_side3 is null" );
}else{
	System.out.println(this.toString+" : issu_side3 is "+issu_side3 );
}
String cm3 = req.getParameter("cm3");
if( cm3 == null){
	System.out.println(this.toString+" : cm3 is null" );
}else{
	System.out.println(this.toString+" : cm3 is "+cm3 );
}
String dn3 = req.getParameter("dn3");
if( dn3 == null){
	System.out.println(this.toString+" : dn3 is null" );
}else{
	System.out.println(this.toString+" : dn3 is "+dn3 );
}
String color3 = req.getParameter("color3");
if( color3 == null){
	System.out.println(this.toString+" : color3 is null" );
}else{
	System.out.println(this.toString+" : color3 is "+color3 );
}
String issu_side4 = req.getParameter("issu_side4");
if( issu_side4 == null){
	System.out.println(this.toString+" : issu_side4 is null" );
}else{
	System.out.println(this.toString+" : issu_side4 is "+issu_side4 );
}
String cm4 = req.getParameter("cm4");
if( cm4 == null){
	System.out.println(this.toString+" : cm4 is null" );
}else{
	System.out.println(this.toString+" : cm4 is "+cm4 );
}
String dn4 = req.getParameter("dn4");
if( dn4 == null){
	System.out.println(this.toString+" : dn4 is null" );
}else{
	System.out.println(this.toString+" : dn4 is "+dn4 );
}
String color4 = req.getParameter("color4");
if( color4 == null){
	System.out.println(this.toString+" : color4 is null" );
}else{
	System.out.println(this.toString+" : color4 is "+color4 );
}
String issu_side5 = req.getParameter("issu_side5");
if( issu_side5 == null){
	System.out.println(this.toString+" : issu_side5 is null" );
}else{
	System.out.println(this.toString+" : issu_side5 is "+issu_side5 );
}
String cm5 = req.getParameter("cm5");
if( cm5 == null){
	System.out.println(this.toString+" : cm5 is null" );
}else{
	System.out.println(this.toString+" : cm5 is "+cm5 );
}
String dn5 = req.getParameter("dn5");
if( dn5 == null){
	System.out.println(this.toString+" : dn5 is null" );
}else{
	System.out.println(this.toString+" : dn5 is "+dn5 );
}
String color5 = req.getParameter("color5");
if( color5 == null){
	System.out.println(this.toString+" : color5 is null" );
}else{
	System.out.println(this.toString+" : color5 is "+color5 );
}
String issu_side6 = req.getParameter("issu_side6");
if( issu_side6 == null){
	System.out.println(this.toString+" : issu_side6 is null" );
}else{
	System.out.println(this.toString+" : issu_side6 is "+issu_side6 );
}
String cm6 = req.getParameter("cm6");
if( cm6 == null){
	System.out.println(this.toString+" : cm6 is null" );
}else{
	System.out.println(this.toString+" : cm6 is "+cm6 );
}
String dn6 = req.getParameter("dn6");
if( dn6 == null){
	System.out.println(this.toString+" : dn6 is null" );
}else{
	System.out.println(this.toString+" : dn6 is "+dn6 );
}
String color6 = req.getParameter("color6");
if( color6 == null){
	System.out.println(this.toString+" : color6 is null" );
}else{
	System.out.println(this.toString+" : color6 is "+color6 );
}
String issu_side7 = req.getParameter("issu_side7");
if( issu_side7 == null){
	System.out.println(this.toString+" : issu_side7 is null" );
}else{
	System.out.println(this.toString+" : issu_side7 is "+issu_side7 );
}
String cm7 = req.getParameter("cm7");
if( cm7 == null){
	System.out.println(this.toString+" : cm7 is null" );
}else{
	System.out.println(this.toString+" : cm7 is "+cm7 );
}
String dn7 = req.getParameter("dn7");
if( dn7 == null){
	System.out.println(this.toString+" : dn7 is null" );
}else{
	System.out.println(this.toString+" : dn7 is "+dn7 );
}
String color7 = req.getParameter("color7");
if( color7 == null){
	System.out.println(this.toString+" : color7 is null" );
}else{
	System.out.println(this.toString+" : color7 is "+color7 );
}
String issu_side8 = req.getParameter("issu_side8");
if( issu_side8 == null){
	System.out.println(this.toString+" : issu_side8 is null" );
}else{
	System.out.println(this.toString+" : issu_side8 is "+issu_side8 );
}
String cm8 = req.getParameter("cm8");
if( cm8 == null){
	System.out.println(this.toString+" : cm8 is null" );
}else{
	System.out.println(this.toString+" : cm8 is "+cm8 );
}
String dn8 = req.getParameter("dn8");
if( dn8 == null){
	System.out.println(this.toString+" : dn8 is null" );
}else{
	System.out.println(this.toString+" : dn8 is "+dn8 );
}
String color8 = req.getParameter("color8");
if( color8 == null){
	System.out.println(this.toString+" : color8 is null" );
}else{
	System.out.println(this.toString+" : color8 is "+color8 );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String issu_side1 = Util.checkString(req.getParameter("issu_side1"));
String cm1 = Util.checkString(req.getParameter("cm1"));
String dn1 = Util.checkString(req.getParameter("dn1"));
String color1 = Util.checkString(req.getParameter("color1"));
String issu_side2 = Util.checkString(req.getParameter("issu_side2"));
String cm2 = Util.checkString(req.getParameter("cm2"));
String dn2 = Util.checkString(req.getParameter("dn2"));
String color2 = Util.checkString(req.getParameter("color2"));
String issu_side3 = Util.checkString(req.getParameter("issu_side3"));
String cm3 = Util.checkString(req.getParameter("cm3"));
String dn3 = Util.checkString(req.getParameter("dn3"));
String color3 = Util.checkString(req.getParameter("color3"));
String issu_side4 = Util.checkString(req.getParameter("issu_side4"));
String cm4 = Util.checkString(req.getParameter("cm4"));
String dn4 = Util.checkString(req.getParameter("dn4"));
String color4 = Util.checkString(req.getParameter("color4"));
String issu_side5 = Util.checkString(req.getParameter("issu_side5"));
String cm5 = Util.checkString(req.getParameter("cm5"));
String dn5 = Util.checkString(req.getParameter("dn5"));
String color5 = Util.checkString(req.getParameter("color5"));
String issu_side6 = Util.checkString(req.getParameter("issu_side6"));
String cm6 = Util.checkString(req.getParameter("cm6"));
String dn6 = Util.checkString(req.getParameter("dn6"));
String color6 = Util.checkString(req.getParameter("color6"));
String issu_side7 = Util.checkString(req.getParameter("issu_side7"));
String cm7 = Util.checkString(req.getParameter("cm7"));
String dn7 = Util.checkString(req.getParameter("dn7"));
String color7 = Util.checkString(req.getParameter("color7"));
String issu_side8 = Util.checkString(req.getParameter("issu_side8"));
String cm8 = Util.checkString(req.getParameter("cm8"));
String dn8 = Util.checkString(req.getParameter("dn8"));
String color8 = Util.checkString(req.getParameter("color8"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String issu_side1 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side1")));
String cm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm1")));
String dn1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn1")));
String color1 = Util.Uni2Ksc(Util.checkString(req.getParameter("color1")));
String issu_side2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side2")));
String cm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm2")));
String dn2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn2")));
String color2 = Util.Uni2Ksc(Util.checkString(req.getParameter("color2")));
String issu_side3 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side3")));
String cm3 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm3")));
String dn3 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn3")));
String color3 = Util.Uni2Ksc(Util.checkString(req.getParameter("color3")));
String issu_side4 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side4")));
String cm4 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm4")));
String dn4 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn4")));
String color4 = Util.Uni2Ksc(Util.checkString(req.getParameter("color4")));
String issu_side5 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side5")));
String cm5 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm5")));
String dn5 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn5")));
String color5 = Util.Uni2Ksc(Util.checkString(req.getParameter("color5")));
String issu_side6 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side6")));
String cm6 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm6")));
String dn6 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn6")));
String color6 = Util.Uni2Ksc(Util.checkString(req.getParameter("color6")));
String issu_side7 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side7")));
String cm7 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm7")));
String dn7 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn7")));
String color7 = Util.Uni2Ksc(Util.checkString(req.getParameter("color7")));
String issu_side8 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_side8")));
String cm8 = Util.Uni2Ksc(Util.checkString(req.getParameter("cm8")));
String dn8 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn8")));
String color8 = Util.Uni2Ksc(Util.checkString(req.getParameter("color8")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setIssu_dt(issu_dt);
dm.setIssu_side1(issu_side1);
dm.setCm1(cm1);
dm.setDn1(dn1);
dm.setColor1(color1);
dm.setIssu_side2(issu_side2);
dm.setCm2(cm2);
dm.setDn2(dn2);
dm.setColor2(color2);
dm.setIssu_side3(issu_side3);
dm.setCm3(cm3);
dm.setDn3(dn3);
dm.setColor3(color3);
dm.setIssu_side4(issu_side4);
dm.setCm4(cm4);
dm.setDn4(dn4);
dm.setColor4(color4);
dm.setIssu_side5(issu_side5);
dm.setCm5(cm5);
dm.setDn5(dn5);
dm.setColor5(color5);
dm.setIssu_side6(issu_side6);
dm.setCm6(cm6);
dm.setDn6(dn6);
dm.setColor6(color6);
dm.setIssu_side7(issu_side7);
dm.setCm7(cm7);
dm.setDn7(dn7);
dm.setColor7(color7);
dm.setIssu_side8(issu_side8);
dm.setCm8(cm8);
dm.setDn8(dn8);
dm.setColor8(color8);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 20:14:26 KST 2009 */