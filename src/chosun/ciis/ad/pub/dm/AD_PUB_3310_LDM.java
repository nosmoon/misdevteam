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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String dlco_nm;
	public String item_nm;
	public String spl_dlco;
	public String proc_dt;
	public String sch_clsf;
	public String podr_ym;

	public AD_PUB_3310_LDM(){}
	public AD_PUB_3310_LDM(String cmpy_cd, String frdt, String todt, String dlco_nm, String item_nm, String spl_dlco, String proc_dt, String sch_clsf, String podr_ym){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.dlco_nm = dlco_nm;
		this.item_nm = item_nm;
		this.spl_dlco = spl_dlco;
		this.proc_dt = proc_dt;
		this.sch_clsf = sch_clsf;
		this.podr_ym = podr_ym;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setSpl_dlco(String spl_dlco){
		this.spl_dlco = spl_dlco;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public void setSch_clsf(String sch_clsf){
		this.sch_clsf = sch_clsf;
	}

	public void setPodr_ym(String podr_ym){
		this.podr_ym = podr_ym;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getSpl_dlco(){
		return this.spl_dlco;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}

	public String getSch_clsf(){
		return this.sch_clsf;
	}

	public String getPodr_ym(){
		return this.podr_ym;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3310_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3310_LDM dm = (AD_PUB_3310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.dlco_nm);
		cstmt.setString(7, dm.item_nm);
		cstmt.setString(8, dm.spl_dlco);
		cstmt.setString(9, dm.proc_dt);
		cstmt.setString(10, dm.sch_clsf);
		cstmt.setString(11, dm.podr_ym);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("item_nm = [" + getItem_nm() + "]");
		System.out.println("spl_dlco = [" + getSpl_dlco() + "]");
		System.out.println("proc_dt = [" + getProc_dt() + "]");
		System.out.println("sch_clsf = [" + getSch_clsf() + "]");
		System.out.println("podr_ym = [" + getPodr_ym() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String item_nm = req.getParameter("item_nm");
if( item_nm == null){
	System.out.println(this.toString+" : item_nm is null" );
}else{
	System.out.println(this.toString+" : item_nm is "+item_nm );
}
String spl_dlco = req.getParameter("spl_dlco");
if( spl_dlco == null){
	System.out.println(this.toString+" : spl_dlco is null" );
}else{
	System.out.println(this.toString+" : spl_dlco is "+spl_dlco );
}
String proc_dt = req.getParameter("proc_dt");
if( proc_dt == null){
	System.out.println(this.toString+" : proc_dt is null" );
}else{
	System.out.println(this.toString+" : proc_dt is "+proc_dt );
}
String sch_clsf = req.getParameter("sch_clsf");
if( sch_clsf == null){
	System.out.println(this.toString+" : sch_clsf is null" );
}else{
	System.out.println(this.toString+" : sch_clsf is "+sch_clsf );
}
String podr_ym = req.getParameter("podr_ym");
if( podr_ym == null){
	System.out.println(this.toString+" : podr_ym is null" );
}else{
	System.out.println(this.toString+" : podr_ym is "+podr_ym );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String item_nm = Util.checkString(req.getParameter("item_nm"));
String spl_dlco = Util.checkString(req.getParameter("spl_dlco"));
String proc_dt = Util.checkString(req.getParameter("proc_dt"));
String sch_clsf = Util.checkString(req.getParameter("sch_clsf"));
String podr_ym = Util.checkString(req.getParameter("podr_ym"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String item_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("item_nm")));
String spl_dlco = Util.Uni2Ksc(Util.checkString(req.getParameter("spl_dlco")));
String proc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dt")));
String sch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sch_clsf")));
String podr_ym = Util.Uni2Ksc(Util.checkString(req.getParameter("podr_ym")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDlco_nm(dlco_nm);
dm.setItem_nm(item_nm);
dm.setSpl_dlco(spl_dlco);
dm.setProc_dt(proc_dt);
dm.setSch_clsf(sch_clsf);
dm.setPodr_ym(podr_ym);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Sep 12 14:40:30 KST 2016 */