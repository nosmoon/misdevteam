/***************************************************************************************************
* 파일명 : MT_PRNPAP_1003_ADM.java
* 기능 :  원재료관리 / 인쇄용지 관리
* 작성일자 : 2009-03-30 
* 작성자 : 유경민
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_qq;
	public String fac_clsf;
	public String papcmpy_cd;
	public String eqp_mchn_no;
	public String test_ask_dt;
	public String test_frdt;
	public String test_todt;
	public String test_instt;
	public String remk;
	public String seq;
	public String occr_dt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String test_item_clsf;
	public String unit;
	public String ocom_val;
	public String gubun;

	public MT_PRNPAP_1003_ADM(){}
	public MT_PRNPAP_1003_ADM(String cmpy_cd, String occr_qq, String fac_clsf, String papcmpy_cd, String eqp_mchn_no, String test_ask_dt, String test_frdt, String test_todt, String test_instt, String remk, String seq, String occr_dt, String incmg_pers_ipaddr, String incmg_pers, String test_item_clsf, String unit, String ocom_val, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_qq = occr_qq;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.eqp_mchn_no = eqp_mchn_no;
		this.test_ask_dt = test_ask_dt;
		this.test_frdt = test_frdt;
		this.test_todt = test_todt;
		this.test_instt = test_instt;
		this.remk = remk;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.test_item_clsf = test_item_clsf;
		this.unit = unit;
		this.ocom_val = ocom_val;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_qq(String occr_qq){
		this.occr_qq = occr_qq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setEqp_mchn_no(String eqp_mchn_no){
		this.eqp_mchn_no = eqp_mchn_no;
	}

	public void setTest_ask_dt(String test_ask_dt){
		this.test_ask_dt = test_ask_dt;
	}

	public void setTest_frdt(String test_frdt){
		this.test_frdt = test_frdt;
	}

	public void setTest_todt(String test_todt){
		this.test_todt = test_todt;
	}

	public void setTest_instt(String test_instt){
		this.test_instt = test_instt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setTest_item_clsf(String test_item_clsf){
		this.test_item_clsf = test_item_clsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setOcom_val(String ocom_val){
		this.ocom_val = ocom_val;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_qq(){
		return this.occr_qq;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getEqp_mchn_no(){
		return this.eqp_mchn_no;
	}

	public String getTest_ask_dt(){
		return this.test_ask_dt;
	}

	public String getTest_frdt(){
		return this.test_frdt;
	}

	public String getTest_todt(){
		return this.test_todt;
	}

	public String getTest_instt(){
		return this.test_instt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getTest_item_clsf(){
		return this.test_item_clsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getOcom_val(){
		return this.ocom_val;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_1003_ADM dm = (MT_PRNPAP_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_qq);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.papcmpy_cd);
		cstmt.setString(7, dm.eqp_mchn_no);
		cstmt.setString(8, dm.test_ask_dt);
		cstmt.setString(9, dm.test_frdt);
		cstmt.setString(10, dm.test_todt);
		cstmt.setString(11, dm.test_instt);
		cstmt.setString(12, dm.remk);
		cstmt.setString(13, dm.seq);
		cstmt.setString(14, dm.occr_dt);
		cstmt.setString(15, dm.incmg_pers_ipaddr);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.test_item_clsf);
		cstmt.setString(18, dm.unit);
		cstmt.setString(19, dm.ocom_val);
		cstmt.setString(20, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_1003_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_qq = [" + getOccr_qq() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("eqp_mchn_no = [" + getEqp_mchn_no() + "]");
		System.out.println("test_ask_dt = [" + getTest_ask_dt() + "]");
		System.out.println("test_frdt = [" + getTest_frdt() + "]");
		System.out.println("test_todt = [" + getTest_todt() + "]");
		System.out.println("test_instt = [" + getTest_instt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("test_item_clsf = [" + getTest_item_clsf() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("ocom_val = [" + getOcom_val() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
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
String occr_qq = req.getParameter("occr_qq");
if( occr_qq == null){
	System.out.println(this.toString+" : occr_qq is null" );
}else{
	System.out.println(this.toString+" : occr_qq is "+occr_qq );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String eqp_mchn_no = req.getParameter("eqp_mchn_no");
if( eqp_mchn_no == null){
	System.out.println(this.toString+" : eqp_mchn_no is null" );
}else{
	System.out.println(this.toString+" : eqp_mchn_no is "+eqp_mchn_no );
}
String test_ask_dt = req.getParameter("test_ask_dt");
if( test_ask_dt == null){
	System.out.println(this.toString+" : test_ask_dt is null" );
}else{
	System.out.println(this.toString+" : test_ask_dt is "+test_ask_dt );
}
String test_frdt = req.getParameter("test_frdt");
if( test_frdt == null){
	System.out.println(this.toString+" : test_frdt is null" );
}else{
	System.out.println(this.toString+" : test_frdt is "+test_frdt );
}
String test_todt = req.getParameter("test_todt");
if( test_todt == null){
	System.out.println(this.toString+" : test_todt is null" );
}else{
	System.out.println(this.toString+" : test_todt is "+test_todt );
}
String test_instt = req.getParameter("test_instt");
if( test_instt == null){
	System.out.println(this.toString+" : test_instt is null" );
}else{
	System.out.println(this.toString+" : test_instt is "+test_instt );
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String test_item_clsf = req.getParameter("test_item_clsf");
if( test_item_clsf == null){
	System.out.println(this.toString+" : test_item_clsf is null" );
}else{
	System.out.println(this.toString+" : test_item_clsf is "+test_item_clsf );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String ocom_val = req.getParameter("ocom_val");
if( ocom_val == null){
	System.out.println(this.toString+" : ocom_val is null" );
}else{
	System.out.println(this.toString+" : ocom_val is "+ocom_val );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_qq = Util.checkString(req.getParameter("occr_qq"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String eqp_mchn_no = Util.checkString(req.getParameter("eqp_mchn_no"));
String test_ask_dt = Util.checkString(req.getParameter("test_ask_dt"));
String test_frdt = Util.checkString(req.getParameter("test_frdt"));
String test_todt = Util.checkString(req.getParameter("test_todt"));
String test_instt = Util.checkString(req.getParameter("test_instt"));
String remk = Util.checkString(req.getParameter("remk"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String test_item_clsf = Util.checkString(req.getParameter("test_item_clsf"));
String unit = Util.checkString(req.getParameter("unit"));
String ocom_val = Util.checkString(req.getParameter("ocom_val"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_qq")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String eqp_mchn_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eqp_mchn_no")));
String test_ask_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("test_ask_dt")));
String test_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("test_frdt")));
String test_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("test_todt")));
String test_instt = Util.Uni2Ksc(Util.checkString(req.getParameter("test_instt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String test_item_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("test_item_clsf")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String ocom_val = Util.Uni2Ksc(Util.checkString(req.getParameter("ocom_val")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_qq(occr_qq);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setEqp_mchn_no(eqp_mchn_no);
dm.setTest_ask_dt(test_ask_dt);
dm.setTest_frdt(test_frdt);
dm.setTest_todt(test_todt);
dm.setTest_instt(test_instt);
dm.setRemk(remk);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setTest_item_clsf(test_item_clsf);
dm.setUnit(unit);
dm.setOcom_val(ocom_val);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 14:34:13 KST 2009 */