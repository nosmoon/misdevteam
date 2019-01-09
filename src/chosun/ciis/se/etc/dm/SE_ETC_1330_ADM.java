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


package chosun.ciis.se.etc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.ds.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1330_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String bo_cd;
	public String bo_seq;
	public String area_cd;
	public String area_nm;
	public String trmrd_qty_0;
	public String dscn_rdr_qty_0;
	public String month_aft_qty_1;
	public String month_aft_qty_2;
	public String month_aft_qty_3;
	public String month_aft_qty_4;
	public String month_aft_qty_5;
	public String month_aft_qty_6;
	public String month_aft_qty_7;
	public String dnt_qty;
	public String avg_send_qty;
	public String remk;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_ETC_1330_ADM(){}
	public SE_ETC_1330_ADM(String cmpy_cd, String yymm, String bo_cd, String bo_seq, String area_cd, String area_nm, String trmrd_qty_0, String dscn_rdr_qty_0, String month_aft_qty_1, String month_aft_qty_2, String month_aft_qty_3, String month_aft_qty_4, String month_aft_qty_5, String month_aft_qty_6, String month_aft_qty_7, String dnt_qty, String avg_send_qty, String remk, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.area_cd = area_cd;
		this.area_nm = area_nm;
		this.trmrd_qty_0 = trmrd_qty_0;
		this.dscn_rdr_qty_0 = dscn_rdr_qty_0;
		this.month_aft_qty_1 = month_aft_qty_1;
		this.month_aft_qty_2 = month_aft_qty_2;
		this.month_aft_qty_3 = month_aft_qty_3;
		this.month_aft_qty_4 = month_aft_qty_4;
		this.month_aft_qty_5 = month_aft_qty_5;
		this.month_aft_qty_6 = month_aft_qty_6;
		this.month_aft_qty_7 = month_aft_qty_7;
		this.dnt_qty = dnt_qty;
		this.avg_send_qty = avg_send_qty;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setTrmrd_qty_0(String trmrd_qty_0){
		this.trmrd_qty_0 = trmrd_qty_0;
	}

	public void setDscn_rdr_qty_0(String dscn_rdr_qty_0){
		this.dscn_rdr_qty_0 = dscn_rdr_qty_0;
	}

	public void setMonth_aft_qty_1(String month_aft_qty_1){
		this.month_aft_qty_1 = month_aft_qty_1;
	}

	public void setMonth_aft_qty_2(String month_aft_qty_2){
		this.month_aft_qty_2 = month_aft_qty_2;
	}

	public void setMonth_aft_qty_3(String month_aft_qty_3){
		this.month_aft_qty_3 = month_aft_qty_3;
	}

	public void setMonth_aft_qty_4(String month_aft_qty_4){
		this.month_aft_qty_4 = month_aft_qty_4;
	}

	public void setMonth_aft_qty_5(String month_aft_qty_5){
		this.month_aft_qty_5 = month_aft_qty_5;
	}

	public void setMonth_aft_qty_6(String month_aft_qty_6){
		this.month_aft_qty_6 = month_aft_qty_6;
	}

	public void setMonth_aft_qty_7(String month_aft_qty_7){
		this.month_aft_qty_7 = month_aft_qty_7;
	}
	
	public void setDnt_qty(String dnt_qty){
		this.dnt_qty = dnt_qty;
	}

	public void setAvg_send_qty(String avg_send_qty){
		this.avg_send_qty = avg_send_qty;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getTrmrd_qty_0(){
		return this.trmrd_qty_0;
	}

	public String getDscn_rdr_qty_0(){
		return this.dscn_rdr_qty_0;
	}

	public String getMonth_aft_qty_1(){
		return this.month_aft_qty_1;
	}

	public String getMonth_aft_qty_2(){
		return this.month_aft_qty_2;
	}

	public String getMonth_aft_qty_3(){
		return this.month_aft_qty_3;
	}

	public String getMonth_aft_qty_4(){
		return this.month_aft_qty_4;
	}

	public String getMonth_aft_qty_5(){
		return this.month_aft_qty_5;
	}

	public String getMonth_aft_qty_6(){
		return this.month_aft_qty_6;
	}

	public String getMonth_aft_qty_7(){
		return this.month_aft_qty_7;
	}
	
	public String getDnt_qty(){
		return this.dnt_qty;
	}

	public String getAvg_send_qty(){
		return this.avg_send_qty;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_ETC_1330_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_ETC_1330_ADM dm = (SE_ETC_1330_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.bo_cd);
		cstmt.setString(6, dm.bo_seq);
		cstmt.setString(7, dm.area_cd);
		cstmt.setString(8, dm.area_nm);
		cstmt.setString(9, dm.trmrd_qty_0);
		cstmt.setString(10, dm.dscn_rdr_qty_0);
		cstmt.setString(11, dm.month_aft_qty_1);
		cstmt.setString(12, dm.month_aft_qty_2);
		cstmt.setString(13, dm.month_aft_qty_3);
		cstmt.setString(14, dm.month_aft_qty_4);
		cstmt.setString(15, dm.month_aft_qty_5);
		cstmt.setString(16, dm.month_aft_qty_6);
		cstmt.setString(17, dm.month_aft_qty_7);
		cstmt.setString(18, dm.dnt_qty);
		cstmt.setString(19, dm.avg_send_qty);
		cstmt.setString(20, dm.remk);
		cstmt.setString(21, dm.incmg_pers);
		cstmt.setString(22, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.etc.ds.SE_ETC_1330_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("area_nm = [" + getArea_nm() + "]");
		System.out.println("trmrd_qty_0 = [" + getTrmrd_qty_0() + "]");
		System.out.println("dscn_rdr_qty_0 = [" + getDscn_rdr_qty_0() + "]");
		System.out.println("month_aft_qty_1 = [" + getMonth_aft_qty_1() + "]");
		System.out.println("month_aft_qty_2 = [" + getMonth_aft_qty_2() + "]");
		System.out.println("month_aft_qty_3 = [" + getMonth_aft_qty_3() + "]");
		System.out.println("month_aft_qty_4 = [" + getMonth_aft_qty_4() + "]");
		System.out.println("month_aft_qty_5 = [" + getMonth_aft_qty_5() + "]");
		System.out.println("month_aft_qty_6 = [" + getMonth_aft_qty_6() + "]");
		System.out.println("month_aft_qty_7 = [" + getMonth_aft_qty_7() + "]");
		System.out.println("dnt_qty = [" + getDnt_qty() + "]");
		System.out.println("avg_send_qty = [" + getAvg_send_qty() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String area_nm = req.getParameter("area_nm");
if( area_nm == null){
	System.out.println(this.toString+" : area_nm is null" );
}else{
	System.out.println(this.toString+" : area_nm is "+area_nm );
}
String trmrd_qty_0 = req.getParameter("trmrd_qty_0");
if( trmrd_qty_0 == null){
	System.out.println(this.toString+" : trmrd_qty_0 is null" );
}else{
	System.out.println(this.toString+" : trmrd_qty_0 is "+trmrd_qty_0 );
}
String dscn_rdr_qty_0 = req.getParameter("dscn_rdr_qty_0");
if( dscn_rdr_qty_0 == null){
	System.out.println(this.toString+" : dscn_rdr_qty_0 is null" );
}else{
	System.out.println(this.toString+" : dscn_rdr_qty_0 is "+dscn_rdr_qty_0 );
}
String month_aft_qty_1 = req.getParameter("month_aft_qty_1");
if( month_aft_qty_1 == null){
	System.out.println(this.toString+" : month_aft_qty_1 is null" );
}else{
	System.out.println(this.toString+" : month_aft_qty_1 is "+month_aft_qty_1 );
}
String month_aft_qty_2 = req.getParameter("month_aft_qty_2");
if( month_aft_qty_2 == null){
	System.out.println(this.toString+" : month_aft_qty_2 is null" );
}else{
	System.out.println(this.toString+" : month_aft_qty_2 is "+month_aft_qty_2 );
}
String month_aft_qty_3 = req.getParameter("month_aft_qty_3");
if( month_aft_qty_3 == null){
	System.out.println(this.toString+" : month_aft_qty_3 is null" );
}else{
	System.out.println(this.toString+" : month_aft_qty_3 is "+month_aft_qty_3 );
}
String month_aft_qty_4 = req.getParameter("month_aft_qty_4");
if( month_aft_qty_4 == null){
	System.out.println(this.toString+" : month_aft_qty_4 is null" );
}else{
	System.out.println(this.toString+" : month_aft_qty_4 is "+month_aft_qty_4 );
}
String month_aft_qty_5 = req.getParameter("month_aft_qty_5");
if( month_aft_qty_5 == null){
	System.out.println(this.toString+" : month_aft_qty_5 is null" );
}else{
	System.out.println(this.toString+" : month_aft_qty_5 is "+month_aft_qty_5 );
}
String dnt_qty = req.getParameter("dnt_qty");
if( dnt_qty == null){
	System.out.println(this.toString+" : dnt_qty is null" );
}else{
	System.out.println(this.toString+" : dnt_qty is "+dnt_qty );
}
String avg_send_qty = req.getParameter("avg_send_qty");
if( avg_send_qty == null){
	System.out.println(this.toString+" : avg_send_qty is null" );
}else{
	System.out.println(this.toString+" : avg_send_qty is "+avg_send_qty );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String area_nm = Util.checkString(req.getParameter("area_nm"));
String trmrd_qty_0 = Util.checkString(req.getParameter("trmrd_qty_0"));
String dscn_rdr_qty_0 = Util.checkString(req.getParameter("dscn_rdr_qty_0"));
String month_aft_qty_1 = Util.checkString(req.getParameter("month_aft_qty_1"));
String month_aft_qty_2 = Util.checkString(req.getParameter("month_aft_qty_2"));
String month_aft_qty_3 = Util.checkString(req.getParameter("month_aft_qty_3"));
String month_aft_qty_4 = Util.checkString(req.getParameter("month_aft_qty_4"));
String month_aft_qty_5 = Util.checkString(req.getParameter("month_aft_qty_5"));
String dnt_qty = Util.checkString(req.getParameter("dnt_qty"));
String avg_send_qty = Util.checkString(req.getParameter("avg_send_qty"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String area_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("area_nm")));
String trmrd_qty_0 = Util.Uni2Ksc(Util.checkString(req.getParameter("trmrd_qty_0")));
String dscn_rdr_qty_0 = Util.Uni2Ksc(Util.checkString(req.getParameter("dscn_rdr_qty_0")));
String month_aft_qty_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("month_aft_qty_1")));
String month_aft_qty_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("month_aft_qty_2")));
String month_aft_qty_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("month_aft_qty_3")));
String month_aft_qty_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("month_aft_qty_4")));
String month_aft_qty_5 = Util.Uni2Ksc(Util.checkString(req.getParameter("month_aft_qty_5")));
String dnt_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("dnt_qty")));
String avg_send_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("avg_send_qty")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setArea_cd(area_cd);
dm.setArea_nm(area_nm);
dm.setTrmrd_qty_0(trmrd_qty_0);
dm.setDscn_rdr_qty_0(dscn_rdr_qty_0);
dm.setMonth_aft_qty_1(month_aft_qty_1);
dm.setMonth_aft_qty_2(month_aft_qty_2);
dm.setMonth_aft_qty_3(month_aft_qty_3);
dm.setMonth_aft_qty_4(month_aft_qty_4);
dm.setMonth_aft_qty_5(month_aft_qty_5);
dm.setDnt_qty(dnt_qty);
dm.setAvg_send_qty(avg_send_qty);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 08 10:19:41 KST 2009 */