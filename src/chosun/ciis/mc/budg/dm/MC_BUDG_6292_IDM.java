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


public class MC_BUDG_6292_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String rate;
	public String fix_fee;
	public String chg_cost;
	public String cost_clsf;
	public String pcnt;
	public String mm_amt;
	public String tms;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MC_BUDG_6292_IDM(){}
	public MC_BUDG_6292_IDM(String cmpy_cd, String yymm, String rate, String fix_fee, String chg_cost, String cost_clsf, String pcnt, String mm_amt, String tms, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.rate = rate;
		this.fix_fee = fix_fee;
		this.chg_cost = chg_cost;
		this.cost_clsf = cost_clsf;
		this.pcnt = pcnt;
		this.mm_amt = mm_amt;
		this.tms = tms;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setFix_fee(String fix_fee){
		this.fix_fee = fix_fee;
	}

	public void setChg_cost(String chg_cost){
		this.chg_cost = chg_cost;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setMm_amt(String mm_amt){
		this.mm_amt = mm_amt;
	}

	public void setTms(String tms){
		this.tms = tms;
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

	public String getYymm(){
		return this.yymm;
	}

	public String getRate(){
		return this.rate;
	}

	public String getFix_fee(){
		return this.fix_fee;
	}

	public String getChg_cost(){
		return this.chg_cost;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getMm_amt(){
		return this.mm_amt;
	}

	public String getTms(){
		return this.tms;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_6292_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_6292_IDM dm = (MC_BUDG_6292_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.rate);
		cstmt.setString(6, dm.fix_fee);
		cstmt.setString(7, dm.chg_cost);
		cstmt.setString(8, dm.cost_clsf);
		cstmt.setString(9, dm.pcnt);
		cstmt.setString(10, dm.mm_amt);
		cstmt.setString(11, dm.tms);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_6292_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("rate = [" + getRate() + "]");
		System.out.println("fix_fee = [" + getFix_fee() + "]");
		System.out.println("chg_cost = [" + getChg_cost() + "]");
		System.out.println("cost_clsf = [" + getCost_clsf() + "]");
		System.out.println("pcnt = [" + getPcnt() + "]");
		System.out.println("mm_amt = [" + getMm_amt() + "]");
		System.out.println("tms = [" + getTms() + "]");
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String rate = req.getParameter("rate");
if( rate == null){
	System.out.println(this.toString+" : rate is null" );
}else{
	System.out.println(this.toString+" : rate is "+rate );
}
String fix_fee = req.getParameter("fix_fee");
if( fix_fee == null){
	System.out.println(this.toString+" : fix_fee is null" );
}else{
	System.out.println(this.toString+" : fix_fee is "+fix_fee );
}
String chg_cost = req.getParameter("chg_cost");
if( chg_cost == null){
	System.out.println(this.toString+" : chg_cost is null" );
}else{
	System.out.println(this.toString+" : chg_cost is "+chg_cost );
}
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
}
String pcnt = req.getParameter("pcnt");
if( pcnt == null){
	System.out.println(this.toString+" : pcnt is null" );
}else{
	System.out.println(this.toString+" : pcnt is "+pcnt );
}
String mm_amt = req.getParameter("mm_amt");
if( mm_amt == null){
	System.out.println(this.toString+" : mm_amt is null" );
}else{
	System.out.println(this.toString+" : mm_amt is "+mm_amt );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
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
String yymm = Util.checkString(req.getParameter("yymm"));
String rate = Util.checkString(req.getParameter("rate"));
String fix_fee = Util.checkString(req.getParameter("fix_fee"));
String chg_cost = Util.checkString(req.getParameter("chg_cost"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
String pcnt = Util.checkString(req.getParameter("pcnt"));
String mm_amt = Util.checkString(req.getParameter("mm_amt"));
String tms = Util.checkString(req.getParameter("tms"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String rate = Util.Uni2Ksc(Util.checkString(req.getParameter("rate")));
String fix_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fix_fee")));
String chg_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_cost")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
String pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("pcnt")));
String mm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("mm_amt")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setRate(rate);
dm.setFix_fee(fix_fee);
dm.setChg_cost(chg_cost);
dm.setCost_clsf(cost_clsf);
dm.setPcnt(pcnt);
dm.setMm_amt(mm_amt);
dm.setTms(tms);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 15:27:56 KST 2009 */