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


package chosun.ciis.hd.trip.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.trip.ds.*;
import chosun.ciis.hd.trip.rec.*;

/**
 * 
 */


public class HD_TRIP_9997_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String area_clsf;
	public String cost_clsf;
	public String posi_clsf;
	public String busi_trip_cost;
	public String aply_basi_dt;
	public String new_aply_basi_dt;
	public String remk;
	public String seq;
	public String cmpy_cd;
	public String occr_dt;
	public String cmpy_cd_tm;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_TRIP_9997_ADM(){}
	public HD_TRIP_9997_ADM(String mode, String area_clsf, String cost_clsf, String posi_clsf, String busi_trip_cost, String aply_basi_dt, String new_aply_basi_dt, String remk, String seq, String cmpy_cd, String occr_dt, String cmpy_cd_tm, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.area_clsf = area_clsf;
		this.cost_clsf = cost_clsf;
		this.posi_clsf = posi_clsf;
		this.busi_trip_cost = busi_trip_cost;
		this.aply_basi_dt = aply_basi_dt;
		this.new_aply_basi_dt = new_aply_basi_dt;
		this.remk = remk;
		this.seq = seq;
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.cmpy_cd_tm = cmpy_cd_tm;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setArea_clsf(String area_clsf){
		this.area_clsf = area_clsf;
	}

	public void setCost_clsf(String cost_clsf){
		this.cost_clsf = cost_clsf;
	}

	public void setPosi_clsf(String posi_clsf){
		this.posi_clsf = posi_clsf;
	}

	public void setBusi_trip_cost(String busi_trip_cost){
		this.busi_trip_cost = busi_trip_cost;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setNew_aply_basi_dt(String new_aply_basi_dt){
		this.new_aply_basi_dt = new_aply_basi_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setCmpy_cd_tm(String cmpy_cd_tm){
		this.cmpy_cd_tm = cmpy_cd_tm;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getArea_clsf(){
		return this.area_clsf;
	}

	public String getCost_clsf(){
		return this.cost_clsf;
	}

	public String getPosi_clsf(){
		return this.posi_clsf;
	}

	public String getBusi_trip_cost(){
		return this.busi_trip_cost;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getNew_aply_basi_dt(){
		return this.new_aply_basi_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getCmpy_cd_tm(){
		return this.cmpy_cd_tm;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_TRIP_9997_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_TRIP_9997_ADM dm = (HD_TRIP_9997_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.area_clsf);
		cstmt.setString(5, dm.cost_clsf);
		cstmt.setString(6, dm.posi_clsf);
		cstmt.setString(7, dm.busi_trip_cost);
		cstmt.setString(8, dm.aply_basi_dt);
		cstmt.setString(9, dm.new_aply_basi_dt);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.seq);
		cstmt.setString(12, dm.cmpy_cd);
		cstmt.setString(13, dm.occr_dt);
		cstmt.setString(14, dm.cmpy_cd_tm);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.trip.ds.HD_TRIP_9997_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("area_clsf = [" + getArea_clsf() + "]");
		System.out.println("cost_clsf = [" + getCost_clsf() + "]");
		System.out.println("posi_clsf = [" + getPosi_clsf() + "]");
		System.out.println("busi_trip_cost = [" + getBusi_trip_cost() + "]");
		System.out.println("aply_basi_dt = [" + getAply_basi_dt() + "]");
		System.out.println("new_aply_basi_dt = [" + getNew_aply_basi_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("cmpy_cd_tm = [" + getCmpy_cd_tm() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String area_clsf = req.getParameter("area_clsf");
if( area_clsf == null){
	System.out.println(this.toString+" : area_clsf is null" );
}else{
	System.out.println(this.toString+" : area_clsf is "+area_clsf );
}
String cost_clsf = req.getParameter("cost_clsf");
if( cost_clsf == null){
	System.out.println(this.toString+" : cost_clsf is null" );
}else{
	System.out.println(this.toString+" : cost_clsf is "+cost_clsf );
}
String posi_clsf = req.getParameter("posi_clsf");
if( posi_clsf == null){
	System.out.println(this.toString+" : posi_clsf is null" );
}else{
	System.out.println(this.toString+" : posi_clsf is "+posi_clsf );
}
String busi_trip_cost = req.getParameter("busi_trip_cost");
if( busi_trip_cost == null){
	System.out.println(this.toString+" : busi_trip_cost is null" );
}else{
	System.out.println(this.toString+" : busi_trip_cost is "+busi_trip_cost );
}
String aply_basi_dt = req.getParameter("aply_basi_dt");
if( aply_basi_dt == null){
	System.out.println(this.toString+" : aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : aply_basi_dt is "+aply_basi_dt );
}
String new_aply_basi_dt = req.getParameter("new_aply_basi_dt");
if( new_aply_basi_dt == null){
	System.out.println(this.toString+" : new_aply_basi_dt is null" );
}else{
	System.out.println(this.toString+" : new_aply_basi_dt is "+new_aply_basi_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String cmpy_cd_tm = req.getParameter("cmpy_cd_tm");
if( cmpy_cd_tm == null){
	System.out.println(this.toString+" : cmpy_cd_tm is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd_tm is "+cmpy_cd_tm );
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

String mode = Util.checkString(req.getParameter("mode"));
String area_clsf = Util.checkString(req.getParameter("area_clsf"));
String cost_clsf = Util.checkString(req.getParameter("cost_clsf"));
String posi_clsf = Util.checkString(req.getParameter("posi_clsf"));
String busi_trip_cost = Util.checkString(req.getParameter("busi_trip_cost"));
String aply_basi_dt = Util.checkString(req.getParameter("aply_basi_dt"));
String new_aply_basi_dt = Util.checkString(req.getParameter("new_aply_basi_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String seq = Util.checkString(req.getParameter("seq"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String cmpy_cd_tm = Util.checkString(req.getParameter("cmpy_cd_tm"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String area_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("area_clsf")));
String cost_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_clsf")));
String posi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("posi_clsf")));
String busi_trip_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("busi_trip_cost")));
String aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aply_basi_dt")));
String new_aply_basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("new_aply_basi_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String cmpy_cd_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd_tm")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setArea_clsf(area_clsf);
dm.setCost_clsf(cost_clsf);
dm.setPosi_clsf(posi_clsf);
dm.setBusi_trip_cost(busi_trip_cost);
dm.setAply_basi_dt(aply_basi_dt);
dm.setNew_aply_basi_dt(new_aply_basi_dt);
dm.setRemk(remk);
dm.setSeq(seq);
dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setCmpy_cd_tm(cmpy_cd_tm);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Aug 31 20:24:40 KST 2009 */