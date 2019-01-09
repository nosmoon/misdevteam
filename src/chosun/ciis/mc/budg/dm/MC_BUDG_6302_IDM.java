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


public class MC_BUDG_6302_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String make_cost_mm;
	public String issu_pcnt;
	public String qty;
	public String cho_rate;
	public String local_rate;
	public String tms;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public MC_BUDG_6302_IDM(){}
	public MC_BUDG_6302_IDM(String cmpy_cd, String yymm, String make_cost_mm, String issu_pcnt, String qty, String cho_rate, String local_rate, String tms, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.make_cost_mm = make_cost_mm;
		this.issu_pcnt = issu_pcnt;
		this.qty = qty;
		this.cho_rate = cho_rate;
		this.local_rate = local_rate;
		this.tms = tms;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMake_cost_mm(String make_cost_mm){
		this.make_cost_mm = make_cost_mm;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setCho_rate(String cho_rate){
		this.cho_rate = cho_rate;
	}

	public void setLocal_rate(String local_rate){
		this.local_rate = local_rate;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMake_cost_mm(){
		return this.make_cost_mm;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getQty(){
		return this.qty;
	}

	public String getCho_rate(){
		return this.cho_rate;
	}

	public String getLocal_rate(){
		return this.local_rate;
	}

	public String getTms(){
		return this.tms;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6302_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6302_IDM dm = (MC_BUDG_6302_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.make_cost_mm);
		cstmt.setString(6, dm.issu_pcnt);
		cstmt.setString(7, dm.qty);
		cstmt.setString(8, dm.cho_rate);
		cstmt.setString(9, dm.local_rate);
		cstmt.setString(10, dm.tms);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6302_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("make_cost_mm = [" + getMake_cost_mm() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("cho_rate = [" + getCho_rate() + "]");
		System.out.println("local_rate = [" + getLocal_rate() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String make_cost_mm = req.getParameter("make_cost_mm");
if( make_cost_mm == null){
	System.out.println(this.toString+" : make_cost_mm is null" );
}else{
	System.out.println(this.toString+" : make_cost_mm is "+make_cost_mm );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String cho_rate = req.getParameter("cho_rate");
if( cho_rate == null){
	System.out.println(this.toString+" : cho_rate is null" );
}else{
	System.out.println(this.toString+" : cho_rate is "+cho_rate );
}
String local_rate = req.getParameter("local_rate");
if( local_rate == null){
	System.out.println(this.toString+" : local_rate is null" );
}else{
	System.out.println(this.toString+" : local_rate is "+local_rate );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String make_cost_mm = Util.checkString(req.getParameter("make_cost_mm"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String qty = Util.checkString(req.getParameter("qty"));
String cho_rate = Util.checkString(req.getParameter("cho_rate"));
String local_rate = Util.checkString(req.getParameter("local_rate"));
String tms = Util.checkString(req.getParameter("tms"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String make_cost_mm = Util.Uni2Ksc(Util.checkString(req.getParameter("make_cost_mm")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String cho_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("cho_rate")));
String local_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("local_rate")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMake_cost_mm(make_cost_mm);
dm.setIssu_pcnt(issu_pcnt);
dm.setQty(qty);
dm.setCho_rate(cho_rate);
dm.setLocal_rate(local_rate);
dm.setTms(tms);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 23 12:56:47 KST 2009 */