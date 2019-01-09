/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 
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


public class AD_RES_1060_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String wkdy;
	public String sect_clas_cd1;
	public String sect_nm_cd1;
	public String sect_cd1;
	public String bgn_side1;
	public String end_side1;
	public String sect_clas_cd2;
	public String sect_nm_cd2;
	public String sect_cd2;
	public String bgn_side2;
	public String end_side2;
	public String sect_clas_cd3;
	public String sect_nm_cd3;
	public String sect_cd3;
	public String bgn_side3;
	public String end_side3;
	public String sect_clas_cd4;
	public String sect_nm_cd4;
	public String sect_cd4;
	public String bgn_side4;
	public String end_side4;
	public String sect_clas_cd5;
	public String sect_nm_cd5;
	public String sect_cd5;
	public String bgn_side5;
	public String end_side5;
	public String incmg_pers_ip;
	public String incmg_pers;

	public AD_RES_1060_UDM(){}
	public AD_RES_1060_UDM(String cmpy_cd, String medi_cd, String wkdy, String sect_clas_cd1, String sect_nm_cd1, String sect_cd1, String bgn_side1, String end_side1, String sect_clas_cd2, String sect_nm_cd2, String sect_cd2, String bgn_side2, String end_side2, String sect_clas_cd3, String sect_nm_cd3, String sect_cd3, String bgn_side3, String end_side3, String sect_clas_cd4, String sect_nm_cd4, String sect_cd4, String bgn_side4, String end_side4, String sect_clas_cd5, String sect_nm_cd5, String sect_cd5, String bgn_side5, String end_side5, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.wkdy = wkdy;
		this.sect_clas_cd1 = sect_clas_cd1;
		this.sect_nm_cd1 = sect_nm_cd1;
		this.sect_cd1 = sect_cd1;
		this.bgn_side1 = bgn_side1;
		this.end_side1 = end_side1;
		this.sect_clas_cd2 = sect_clas_cd2;
		this.sect_nm_cd2 = sect_nm_cd2;
		this.sect_cd2 = sect_cd2;
		this.bgn_side2 = bgn_side2;
		this.end_side2 = end_side2;
		this.sect_clas_cd3 = sect_clas_cd3;
		this.sect_nm_cd3 = sect_nm_cd3;
		this.sect_cd3 = sect_cd3;
		this.bgn_side3 = bgn_side3;
		this.end_side3 = end_side3;
		this.sect_clas_cd4 = sect_clas_cd4;
		this.sect_nm_cd4 = sect_nm_cd4;
		this.sect_cd4 = sect_cd4;
		this.bgn_side4 = bgn_side4;
		this.end_side4 = end_side4;
		this.sect_clas_cd5 = sect_clas_cd5;
		this.sect_nm_cd5 = sect_nm_cd5;
		this.sect_cd5 = sect_cd5;
		this.bgn_side5 = bgn_side5;
		this.end_side5 = end_side5;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setWkdy(String wkdy){
		this.wkdy = wkdy;
	}

	public void setSect_clas_cd1(String sect_clas_cd1){
		this.sect_clas_cd1 = sect_clas_cd1;
	}

	public void setSect_nm_cd1(String sect_nm_cd1){
		this.sect_nm_cd1 = sect_nm_cd1;
	}

	public void setSect_cd1(String sect_cd1){
		this.sect_cd1 = sect_cd1;
	}

	public void setBgn_side1(String bgn_side1){
		this.bgn_side1 = bgn_side1;
	}

	public void setEnd_side1(String end_side1){
		this.end_side1 = end_side1;
	}

	public void setSect_clas_cd2(String sect_clas_cd2){
		this.sect_clas_cd2 = sect_clas_cd2;
	}

	public void setSect_nm_cd2(String sect_nm_cd2){
		this.sect_nm_cd2 = sect_nm_cd2;
	}

	public void setSect_cd2(String sect_cd2){
		this.sect_cd2 = sect_cd2;
	}

	public void setBgn_side2(String bgn_side2){
		this.bgn_side2 = bgn_side2;
	}

	public void setEnd_side2(String end_side2){
		this.end_side2 = end_side2;
	}

	public void setSect_clas_cd3(String sect_clas_cd3){
		this.sect_clas_cd3 = sect_clas_cd3;
	}

	public void setSect_nm_cd3(String sect_nm_cd3){
		this.sect_nm_cd3 = sect_nm_cd3;
	}

	public void setSect_cd3(String sect_cd3){
		this.sect_cd3 = sect_cd3;
	}

	public void setBgn_side3(String bgn_side3){
		this.bgn_side3 = bgn_side3;
	}

	public void setEnd_side3(String end_side3){
		this.end_side3 = end_side3;
	}

	public void setSect_clas_cd4(String sect_clas_cd4){
		this.sect_clas_cd4 = sect_clas_cd4;
	}

	public void setSect_nm_cd4(String sect_nm_cd4){
		this.sect_nm_cd4 = sect_nm_cd4;
	}

	public void setSect_cd4(String sect_cd4){
		this.sect_cd4 = sect_cd4;
	}

	public void setBgn_side4(String bgn_side4){
		this.bgn_side4 = bgn_side4;
	}

	public void setEnd_side4(String end_side4){
		this.end_side4 = end_side4;
	}

	public void setSect_clas_cd5(String sect_clas_cd5){
		this.sect_clas_cd5 = sect_clas_cd5;
	}

	public void setSect_nm_cd5(String sect_nm_cd5){
		this.sect_nm_cd5 = sect_nm_cd5;
	}

	public void setSect_cd5(String sect_cd5){
		this.sect_cd5 = sect_cd5;
	}

	public void setBgn_side5(String bgn_side5){
		this.bgn_side5 = bgn_side5;
	}

	public void setEnd_side5(String end_side5){
		this.end_side5 = end_side5;
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

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getWkdy(){
		return this.wkdy;
	}

	public String getSect_clas_cd1(){
		return this.sect_clas_cd1;
	}

	public String getSect_nm_cd1(){
		return this.sect_nm_cd1;
	}

	public String getSect_cd1(){
		return this.sect_cd1;
	}

	public String getBgn_side1(){
		return this.bgn_side1;
	}

	public String getEnd_side1(){
		return this.end_side1;
	}

	public String getSect_clas_cd2(){
		return this.sect_clas_cd2;
	}

	public String getSect_nm_cd2(){
		return this.sect_nm_cd2;
	}

	public String getSect_cd2(){
		return this.sect_cd2;
	}

	public String getBgn_side2(){
		return this.bgn_side2;
	}

	public String getEnd_side2(){
		return this.end_side2;
	}

	public String getSect_clas_cd3(){
		return this.sect_clas_cd3;
	}

	public String getSect_nm_cd3(){
		return this.sect_nm_cd3;
	}

	public String getSect_cd3(){
		return this.sect_cd3;
	}

	public String getBgn_side3(){
		return this.bgn_side3;
	}

	public String getEnd_side3(){
		return this.end_side3;
	}

	public String getSect_clas_cd4(){
		return this.sect_clas_cd4;
	}

	public String getSect_nm_cd4(){
		return this.sect_nm_cd4;
	}

	public String getSect_cd4(){
		return this.sect_cd4;
	}

	public String getBgn_side4(){
		return this.bgn_side4;
	}

	public String getEnd_side4(){
		return this.end_side4;
	}

	public String getSect_clas_cd5(){
		return this.sect_clas_cd5;
	}

	public String getSect_nm_cd5(){
		return this.sect_nm_cd5;
	}

	public String getSect_cd5(){
		return this.sect_cd5;
	}

	public String getBgn_side5(){
		return this.bgn_side5;
	}

	public String getEnd_side5(){
		return this.end_side5;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_AD_RES_1060_U( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_RES_1060_UDM dm = (AD_RES_1060_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.wkdy);
		cstmt.setString(6, dm.sect_clas_cd1);
		cstmt.setString(7, dm.sect_nm_cd1);
		cstmt.setString(8, dm.sect_cd1);
		cstmt.setString(9, dm.bgn_side1);
		cstmt.setString(10, dm.end_side1);
		cstmt.setString(11, dm.sect_clas_cd2);
		cstmt.setString(12, dm.sect_nm_cd2);
		cstmt.setString(13, dm.sect_cd2);
		cstmt.setString(14, dm.bgn_side2);
		cstmt.setString(15, dm.end_side2);
		cstmt.setString(16, dm.sect_clas_cd3);
		cstmt.setString(17, dm.sect_nm_cd3);
		cstmt.setString(18, dm.sect_cd3);
		cstmt.setString(19, dm.bgn_side3);
		cstmt.setString(20, dm.end_side3);
		cstmt.setString(21, dm.sect_clas_cd4);
		cstmt.setString(22, dm.sect_nm_cd4);
		cstmt.setString(23, dm.sect_cd4);
		cstmt.setString(24, dm.bgn_side4);
		cstmt.setString(25, dm.end_side4);
		cstmt.setString(26, dm.sect_clas_cd5);
		cstmt.setString(27, dm.sect_nm_cd5);
		cstmt.setString(28, dm.sect_cd5);
		cstmt.setString(29, dm.bgn_side5);
		cstmt.setString(30, dm.end_side5);
		cstmt.setString(31, dm.incmg_pers_ip);
		cstmt.setString(32, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.res.ds.AD_RES_1060_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("wkdy = " + getWkdy());
        System.out.println("sect_clas_cd1 = " + getSect_clas_cd1());
        System.out.println("sect_nm_cd1 = " + getSect_nm_cd1());
        System.out.println("sect_cd1 = " + getSect_cd1());
        System.out.println("bgn_side1 = " + getBgn_side1());
        System.out.println("end_side1 = " + getEnd_side1());
        System.out.println("sect_clas_cd2 = " + getSect_clas_cd2());
        System.out.println("sect_nm_cd2 = " + getSect_nm_cd2());
        System.out.println("sect_cd2 = " + getSect_cd2());
        System.out.println("bgn_side2 = " + getBgn_side2());
        System.out.println("end_side2 = " + getEnd_side2());
        System.out.println("sect_clas_cd3 = " + getSect_clas_cd3());
        System.out.println("sect_nm_cd3 = " + getSect_nm_cd3());
        System.out.println("sect_cd3 = " + getSect_cd3());
        System.out.println("bgn_side3 = " + getBgn_side3());
        System.out.println("end_side3 = " + getEnd_side3());
        System.out.println("sect_clas_cd4 = " + getSect_clas_cd4());
        System.out.println("sect_nm_cd4 = " + getSect_nm_cd4());
        System.out.println("sect_cd4 = " + getSect_cd4());
        System.out.println("bgn_side4 = " + getBgn_side4());
        System.out.println("end_side4 = " + getEnd_side4());
        System.out.println("sect_clas_cd5 = " + getSect_clas_cd5());
        System.out.println("sect_nm_cd5 = " + getSect_nm_cd5());
        System.out.println("sect_cd5 = " + getSect_cd5());
        System.out.println("bgn_side5 = " + getBgn_side5());
        System.out.println("end_side5 = " + getEnd_side5());
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String wkdy = req.getParameter("wkdy");
if( wkdy == null){
	System.out.println(this.toString+" : wkdy is null" );
}else{
	System.out.println(this.toString+" : wkdy is "+wkdy );
}
String sect_clas_cd1 = req.getParameter("sect_clas_cd1");
if( sect_clas_cd1 == null){
	System.out.println(this.toString+" : sect_clas_cd1 is null" );
}else{
	System.out.println(this.toString+" : sect_clas_cd1 is "+sect_clas_cd1 );
}
String sect_nm_cd1 = req.getParameter("sect_nm_cd1");
if( sect_nm_cd1 == null){
	System.out.println(this.toString+" : sect_nm_cd1 is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd1 is "+sect_nm_cd1 );
}
String sect_cd1 = req.getParameter("sect_cd1");
if( sect_cd1 == null){
	System.out.println(this.toString+" : sect_cd1 is null" );
}else{
	System.out.println(this.toString+" : sect_cd1 is "+sect_cd1 );
}
String bgn_side1 = req.getParameter("bgn_side1");
if( bgn_side1 == null){
	System.out.println(this.toString+" : bgn_side1 is null" );
}else{
	System.out.println(this.toString+" : bgn_side1 is "+bgn_side1 );
}
String end_side1 = req.getParameter("end_side1");
if( end_side1 == null){
	System.out.println(this.toString+" : end_side1 is null" );
}else{
	System.out.println(this.toString+" : end_side1 is "+end_side1 );
}
String sect_clas_cd2 = req.getParameter("sect_clas_cd2");
if( sect_clas_cd2 == null){
	System.out.println(this.toString+" : sect_clas_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_clas_cd2 is "+sect_clas_cd2 );
}
String sect_nm_cd2 = req.getParameter("sect_nm_cd2");
if( sect_nm_cd2 == null){
	System.out.println(this.toString+" : sect_nm_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd2 is "+sect_nm_cd2 );
}
String sect_cd2 = req.getParameter("sect_cd2");
if( sect_cd2 == null){
	System.out.println(this.toString+" : sect_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_cd2 is "+sect_cd2 );
}
String bgn_side2 = req.getParameter("bgn_side2");
if( bgn_side2 == null){
	System.out.println(this.toString+" : bgn_side2 is null" );
}else{
	System.out.println(this.toString+" : bgn_side2 is "+bgn_side2 );
}
String end_side2 = req.getParameter("end_side2");
if( end_side2 == null){
	System.out.println(this.toString+" : end_side2 is null" );
}else{
	System.out.println(this.toString+" : end_side2 is "+end_side2 );
}
String sect_clas_cd3 = req.getParameter("sect_clas_cd3");
if( sect_clas_cd3 == null){
	System.out.println(this.toString+" : sect_clas_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_clas_cd3 is "+sect_clas_cd3 );
}
String sect_nm_cd3 = req.getParameter("sect_nm_cd3");
if( sect_nm_cd3 == null){
	System.out.println(this.toString+" : sect_nm_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd3 is "+sect_nm_cd3 );
}
String sect_cd3 = req.getParameter("sect_cd3");
if( sect_cd3 == null){
	System.out.println(this.toString+" : sect_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_cd3 is "+sect_cd3 );
}
String bgn_side3 = req.getParameter("bgn_side3");
if( bgn_side3 == null){
	System.out.println(this.toString+" : bgn_side3 is null" );
}else{
	System.out.println(this.toString+" : bgn_side3 is "+bgn_side3 );
}
String end_side3 = req.getParameter("end_side3");
if( end_side3 == null){
	System.out.println(this.toString+" : end_side3 is null" );
}else{
	System.out.println(this.toString+" : end_side3 is "+end_side3 );
}
String sect_clas_cd4 = req.getParameter("sect_clas_cd4");
if( sect_clas_cd4 == null){
	System.out.println(this.toString+" : sect_clas_cd4 is null" );
}else{
	System.out.println(this.toString+" : sect_clas_cd4 is "+sect_clas_cd4 );
}
String sect_nm_cd4 = req.getParameter("sect_nm_cd4");
if( sect_nm_cd4 == null){
	System.out.println(this.toString+" : sect_nm_cd4 is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd4 is "+sect_nm_cd4 );
}
String sect_cd4 = req.getParameter("sect_cd4");
if( sect_cd4 == null){
	System.out.println(this.toString+" : sect_cd4 is null" );
}else{
	System.out.println(this.toString+" : sect_cd4 is "+sect_cd4 );
}
String bgn_side4 = req.getParameter("bgn_side4");
if( bgn_side4 == null){
	System.out.println(this.toString+" : bgn_side4 is null" );
}else{
	System.out.println(this.toString+" : bgn_side4 is "+bgn_side4 );
}
String end_side4 = req.getParameter("end_side4");
if( end_side4 == null){
	System.out.println(this.toString+" : end_side4 is null" );
}else{
	System.out.println(this.toString+" : end_side4 is "+end_side4 );
}
String sect_clas_cd5 = req.getParameter("sect_clas_cd5");
if( sect_clas_cd5 == null){
	System.out.println(this.toString+" : sect_clas_cd5 is null" );
}else{
	System.out.println(this.toString+" : sect_clas_cd5 is "+sect_clas_cd5 );
}
String sect_nm_cd5 = req.getParameter("sect_nm_cd5");
if( sect_nm_cd5 == null){
	System.out.println(this.toString+" : sect_nm_cd5 is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd5 is "+sect_nm_cd5 );
}
String sect_cd5 = req.getParameter("sect_cd5");
if( sect_cd5 == null){
	System.out.println(this.toString+" : sect_cd5 is null" );
}else{
	System.out.println(this.toString+" : sect_cd5 is "+sect_cd5 );
}
String bgn_side5 = req.getParameter("bgn_side5");
if( bgn_side5 == null){
	System.out.println(this.toString+" : bgn_side5 is null" );
}else{
	System.out.println(this.toString+" : bgn_side5 is "+bgn_side5 );
}
String end_side5 = req.getParameter("end_side5");
if( end_side5 == null){
	System.out.println(this.toString+" : end_side5 is null" );
}else{
	System.out.println(this.toString+" : end_side5 is "+end_side5 );
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
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String wkdy = Util.checkString(req.getParameter("wkdy"));
String sect_clas_cd1 = Util.checkString(req.getParameter("sect_clas_cd1"));
String sect_nm_cd1 = Util.checkString(req.getParameter("sect_nm_cd1"));
String sect_cd1 = Util.checkString(req.getParameter("sect_cd1"));
String bgn_side1 = Util.checkString(req.getParameter("bgn_side1"));
String end_side1 = Util.checkString(req.getParameter("end_side1"));
String sect_clas_cd2 = Util.checkString(req.getParameter("sect_clas_cd2"));
String sect_nm_cd2 = Util.checkString(req.getParameter("sect_nm_cd2"));
String sect_cd2 = Util.checkString(req.getParameter("sect_cd2"));
String bgn_side2 = Util.checkString(req.getParameter("bgn_side2"));
String end_side2 = Util.checkString(req.getParameter("end_side2"));
String sect_clas_cd3 = Util.checkString(req.getParameter("sect_clas_cd3"));
String sect_nm_cd3 = Util.checkString(req.getParameter("sect_nm_cd3"));
String sect_cd3 = Util.checkString(req.getParameter("sect_cd3"));
String bgn_side3 = Util.checkString(req.getParameter("bgn_side3"));
String end_side3 = Util.checkString(req.getParameter("end_side3"));
String sect_clas_cd4 = Util.checkString(req.getParameter("sect_clas_cd4"));
String sect_nm_cd4 = Util.checkString(req.getParameter("sect_nm_cd4"));
String sect_cd4 = Util.checkString(req.getParameter("sect_cd4"));
String bgn_side4 = Util.checkString(req.getParameter("bgn_side4"));
String end_side4 = Util.checkString(req.getParameter("end_side4"));
String sect_clas_cd5 = Util.checkString(req.getParameter("sect_clas_cd5"));
String sect_nm_cd5 = Util.checkString(req.getParameter("sect_nm_cd5"));
String sect_cd5 = Util.checkString(req.getParameter("sect_cd5"));
String bgn_side5 = Util.checkString(req.getParameter("bgn_side5"));
String end_side5 = Util.checkString(req.getParameter("end_side5"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String wkdy = Util.Uni2Ksc(Util.checkString(req.getParameter("wkdy")));
String sect_clas_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clas_cd1")));
String sect_nm_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd1")));
String sect_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd1")));
String bgn_side1 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_side1")));
String end_side1 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_side1")));
String sect_clas_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clas_cd2")));
String sect_nm_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd2")));
String sect_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd2")));
String bgn_side2 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_side2")));
String end_side2 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_side2")));
String sect_clas_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clas_cd3")));
String sect_nm_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd3")));
String sect_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd3")));
String bgn_side3 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_side3")));
String end_side3 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_side3")));
String sect_clas_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clas_cd4")));
String sect_nm_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd4")));
String sect_cd4 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd4")));
String bgn_side4 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_side4")));
String end_side4 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_side4")));
String sect_clas_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clas_cd5")));
String sect_nm_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd5")));
String sect_cd5 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd5")));
String bgn_side5 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_side5")));
String end_side5 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_side5")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setWkdy(wkdy);
dm.setSect_clas_cd1(sect_clas_cd1);
dm.setSect_nm_cd1(sect_nm_cd1);
dm.setSect_cd1(sect_cd1);
dm.setBgn_side1(bgn_side1);
dm.setEnd_side1(end_side1);
dm.setSect_clas_cd2(sect_clas_cd2);
dm.setSect_nm_cd2(sect_nm_cd2);
dm.setSect_cd2(sect_cd2);
dm.setBgn_side2(bgn_side2);
dm.setEnd_side2(end_side2);
dm.setSect_clas_cd3(sect_clas_cd3);
dm.setSect_nm_cd3(sect_nm_cd3);
dm.setSect_cd3(sect_cd3);
dm.setBgn_side3(bgn_side3);
dm.setEnd_side3(end_side3);
dm.setSect_clas_cd4(sect_clas_cd4);
dm.setSect_nm_cd4(sect_nm_cd4);
dm.setSect_cd4(sect_cd4);
dm.setBgn_side4(bgn_side4);
dm.setEnd_side4(end_side4);
dm.setSect_clas_cd5(sect_clas_cd5);
dm.setSect_nm_cd5(sect_nm_cd5);
dm.setSect_cd5(sect_cd5);
dm.setBgn_side5(bgn_side5);
dm.setEnd_side5(end_side5);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 23 12:15:51 KST 2009 */