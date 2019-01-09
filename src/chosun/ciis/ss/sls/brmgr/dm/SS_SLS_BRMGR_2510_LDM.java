/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2510_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String partcd;
	public String areacd;
	public String bocd;
	public String fr_yymm;
	public String to_yymm;
	public String medicd;
	public String boclsf;
	public String boclsf2;
	public String sell_net_clsf;
	public String orderby;
	public String orderby2;
	public String area_avg;
	public String prx_excp;
	public String boclsf_ar;
	public String d_stat_ar;
	public String schlevel;
	public String incmgpers;
	public String cmpycd;

	public SS_SLS_BRMGR_2510_LDM(){}
	public SS_SLS_BRMGR_2510_LDM(String deptcd, String partcd, String areacd, String bocd, String fr_yymm, String to_yymm, String medicd, String boclsf, String boclsf2, String sell_net_clsf, String orderby, String orderby2, String area_avg, String prx_excp, String boclsf_ar, String d_stat_ar, String schlevel, String incmgpers, String cmpycd){
		this.deptcd = deptcd;
		this.partcd = partcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fr_yymm = fr_yymm;
		this.to_yymm = to_yymm;
		this.medicd = medicd;
		this.boclsf = boclsf;
		this.boclsf2 = boclsf2;
		this.sell_net_clsf = sell_net_clsf;
		this.orderby = orderby;
		this.orderby2 = orderby2;
		this.area_avg = area_avg;
		this.prx_excp = prx_excp;
		this.boclsf_ar = boclsf_ar;
		this.d_stat_ar = d_stat_ar;
		this.schlevel = schlevel;
		this.incmgpers = incmgpers;
		this.cmpycd = cmpycd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setPartcd(String partcd){
		this.partcd = partcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFr_yymm(String fr_yymm){
		this.fr_yymm = fr_yymm;
	}

	public void setTo_yymm(String to_yymm){
		this.to_yymm = to_yymm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBoclsf(String boclsf){
		this.boclsf = boclsf;
	}

	public void setBoclsf2(String boclsf2){
		this.boclsf2 = boclsf2;
	}

	public void setSell_net_clsf(String sell_net_clsf){
		this.sell_net_clsf = sell_net_clsf;
	}

	public void setOrderby(String orderby){
		this.orderby = orderby;
	}

	public void setOrderby2(String orderby2){
		this.orderby2 = orderby2;
	}

	public void setArea_avg(String area_avg){
		this.area_avg = area_avg;
	}

	public void setPrx_excp(String prx_excp){
		this.prx_excp = prx_excp;
	}

	public void setBoclsf_ar(String boclsf_ar){
		this.boclsf_ar = boclsf_ar;
	}

	public void setD_stat_ar(String d_stat_ar){
		this.d_stat_ar = d_stat_ar;
	}

	public void setSchlevel(String schlevel){
		this.schlevel = schlevel;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getPartcd(){
		return this.partcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFr_yymm(){
		return this.fr_yymm;
	}

	public String getTo_yymm(){
		return this.to_yymm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBoclsf(){
		return this.boclsf;
	}

	public String getBoclsf2(){
		return this.boclsf2;
	}

	public String getSell_net_clsf(){
		return this.sell_net_clsf;
	}

	public String getOrderby(){
		return this.orderby;
	}

	public String getOrderby2(){
		return this.orderby2;
	}

	public String getArea_avg(){
		return this.area_avg;
	}

	public String getPrx_excp(){
		return this.prx_excp;
	}

	public String getBoclsf_ar(){
		return this.boclsf_ar;
	}

	public String getD_stat_ar(){
		return this.d_stat_ar;
	}

	public String getSchlevel(){
		return this.schlevel;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_BRMGR_2510_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_BRMGR_2510_LDM dm = (SS_SLS_BRMGR_2510_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.partcd);
		cstmt.setString(5, dm.areacd);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.fr_yymm);
		cstmt.setString(8, dm.to_yymm);
		cstmt.setString(9, dm.medicd);
		cstmt.setString(10, dm.boclsf);
		cstmt.setString(11, dm.boclsf2);
		cstmt.setString(12, dm.sell_net_clsf);
		cstmt.setString(13, dm.orderby);
		cstmt.setString(14, dm.orderby2);
		cstmt.setString(15, dm.area_avg);
		cstmt.setString(16, dm.prx_excp);
		cstmt.setString(17, dm.boclsf_ar);
		cstmt.setString(18, dm.d_stat_ar);
		cstmt.setString(19, dm.schlevel);
		cstmt.setString(20, dm.incmgpers);
		cstmt.setString(21, dm.cmpycd);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SS_SLS_BRMGR_2510_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("partcd = [" + getPartcd() + "]");
		System.out.println("areacd = [" + getAreacd() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("fr_yymm = [" + getFr_yymm() + "]");
		System.out.println("to_yymm = [" + getTo_yymm() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("boclsf = [" + getBoclsf() + "]");
		System.out.println("boclsf2 = [" + getBoclsf2() + "]");
		System.out.println("sell_net_clsf = [" + getSell_net_clsf() + "]");
		System.out.println("orderby = [" + getOrderby() + "]");
		System.out.println("orderby2 = [" + getOrderby2() + "]");
		System.out.println("area_avg = [" + getArea_avg() + "]");
		System.out.println("prx_excp = [" + getPrx_excp() + "]");
		System.out.println("boclsf_ar = [" + getBoclsf_ar() + "]");
		System.out.println("d_stat_ar = [" + getD_stat_ar() + "]");
		System.out.println("schlevel = [" + getSchlevel() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String partcd = req.getParameter("partcd");
if( partcd == null){
	System.out.println(this.toString+" : partcd is null" );
}else{
	System.out.println(this.toString+" : partcd is "+partcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String fr_yymm = req.getParameter("fr_yymm");
if( fr_yymm == null){
	System.out.println(this.toString+" : fr_yymm is null" );
}else{
	System.out.println(this.toString+" : fr_yymm is "+fr_yymm );
}
String to_yymm = req.getParameter("to_yymm");
if( to_yymm == null){
	System.out.println(this.toString+" : to_yymm is null" );
}else{
	System.out.println(this.toString+" : to_yymm is "+to_yymm );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String boclsf = req.getParameter("boclsf");
if( boclsf == null){
	System.out.println(this.toString+" : boclsf is null" );
}else{
	System.out.println(this.toString+" : boclsf is "+boclsf );
}
String boclsf2 = req.getParameter("boclsf2");
if( boclsf2 == null){
	System.out.println(this.toString+" : boclsf2 is null" );
}else{
	System.out.println(this.toString+" : boclsf2 is "+boclsf2 );
}
String sell_net_clsf = req.getParameter("sell_net_clsf");
if( sell_net_clsf == null){
	System.out.println(this.toString+" : sell_net_clsf is null" );
}else{
	System.out.println(this.toString+" : sell_net_clsf is "+sell_net_clsf );
}
String orderby = req.getParameter("orderby");
if( orderby == null){
	System.out.println(this.toString+" : orderby is null" );
}else{
	System.out.println(this.toString+" : orderby is "+orderby );
}
String orderby2 = req.getParameter("orderby2");
if( orderby2 == null){
	System.out.println(this.toString+" : orderby2 is null" );
}else{
	System.out.println(this.toString+" : orderby2 is "+orderby2 );
}
String area_avg = req.getParameter("area_avg");
if( area_avg == null){
	System.out.println(this.toString+" : area_avg is null" );
}else{
	System.out.println(this.toString+" : area_avg is "+area_avg );
}
String prx_excp = req.getParameter("prx_excp");
if( prx_excp == null){
	System.out.println(this.toString+" : prx_excp is null" );
}else{
	System.out.println(this.toString+" : prx_excp is "+prx_excp );
}
String boclsf_ar = req.getParameter("boclsf_ar");
if( boclsf_ar == null){
	System.out.println(this.toString+" : boclsf_ar is null" );
}else{
	System.out.println(this.toString+" : boclsf_ar is "+boclsf_ar );
}
String d_stat_ar = req.getParameter("d_stat_ar");
if( d_stat_ar == null){
	System.out.println(this.toString+" : d_stat_ar is null" );
}else{
	System.out.println(this.toString+" : d_stat_ar is "+d_stat_ar );
}
String schlevel = req.getParameter("schlevel");
if( schlevel == null){
	System.out.println(this.toString+" : schlevel is null" );
}else{
	System.out.println(this.toString+" : schlevel is "+schlevel );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.checkString(req.getParameter("deptcd"));
String partcd = Util.checkString(req.getParameter("partcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fr_yymm = Util.checkString(req.getParameter("fr_yymm"));
String to_yymm = Util.checkString(req.getParameter("to_yymm"));
String medicd = Util.checkString(req.getParameter("medicd"));
String boclsf = Util.checkString(req.getParameter("boclsf"));
String boclsf2 = Util.checkString(req.getParameter("boclsf2"));
String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));
String orderby = Util.checkString(req.getParameter("orderby"));
String orderby2 = Util.checkString(req.getParameter("orderby2"));
String area_avg = Util.checkString(req.getParameter("area_avg"));
String prx_excp = Util.checkString(req.getParameter("prx_excp"));
String boclsf_ar = Util.checkString(req.getParameter("boclsf_ar"));
String d_stat_ar = Util.checkString(req.getParameter("d_stat_ar"));
String schlevel = Util.checkString(req.getParameter("schlevel"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String boclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("boclsf")));
String boclsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("boclsf2")));
String sell_net_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sell_net_clsf")));
String orderby = Util.Uni2Ksc(Util.checkString(req.getParameter("orderby")));
String orderby2 = Util.Uni2Ksc(Util.checkString(req.getParameter("orderby2")));
String area_avg = Util.Uni2Ksc(Util.checkString(req.getParameter("area_avg")));
String prx_excp = Util.Uni2Ksc(Util.checkString(req.getParameter("prx_excp")));
String boclsf_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("boclsf_ar")));
String d_stat_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("d_stat_ar")));
String schlevel = Util.Uni2Ksc(Util.checkString(req.getParameter("schlevel")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setPartcd(partcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFr_yymm(fr_yymm);
dm.setTo_yymm(to_yymm);
dm.setMedicd(medicd);
dm.setBoclsf(boclsf);
dm.setBoclsf2(boclsf2);
dm.setSell_net_clsf(sell_net_clsf);
dm.setOrderby(orderby);
dm.setOrderby2(orderby2);
dm.setArea_avg(area_avg);
dm.setPrx_excp(prx_excp);
dm.setBoclsf_ar(boclsf_ar);
dm.setD_stat_ar(d_stat_ar);
dm.setSchlevel(schlevel);
dm.setIncmgpers(incmgpers);
dm.setCmpycd(cmpycd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 05 15:45:18 KST 2016 */