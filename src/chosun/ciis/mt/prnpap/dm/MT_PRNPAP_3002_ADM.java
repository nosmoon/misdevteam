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


public class MT_PRNPAP_3002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String issu_dt;
	public String fac_clsf;
	public String matr_cd;
	public String ewh_roll_cnt;
	public String ewh_wgt;
	public String wht_pj_retngod_wgt;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_PRNPAP_3002_ADM(){}
	public MT_PRNPAP_3002_ADM(String cmpy_cd, String occr_dt, String seq, String issu_dt, String fac_clsf, String matr_cd, String ewh_roll_cnt, String ewh_wgt, String wht_pj_retngod_wgt, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.issu_dt = issu_dt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.ewh_roll_cnt = ewh_roll_cnt;
		this.ewh_wgt = ewh_wgt;
		this.wht_pj_retngod_wgt = wht_pj_retngod_wgt;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.gubun = gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setEwh_roll_cnt(String ewh_roll_cnt){
		this.ewh_roll_cnt = ewh_roll_cnt;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setWht_pj_retngod_wgt(String wht_pj_retngod_wgt){
		this.wht_pj_retngod_wgt = wht_pj_retngod_wgt;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getEwh_roll_cnt(){
		return this.ewh_roll_cnt;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getWht_pj_retngod_wgt(){
		return this.wht_pj_retngod_wgt;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3002_ADM dm = (MT_PRNPAP_3002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.issu_dt);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.ewh_roll_cnt);
		cstmt.setString(10, dm.ewh_wgt);
		cstmt.setString(11, dm.wht_pj_retngod_wgt);
		cstmt.setString(12, dm.incmg_pers_ipaddr);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("issu_dt = [" + getIssu_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("ewh_roll_cnt = [" + getEwh_roll_cnt() + "]");
		System.out.println("ewh_wgt = [" + getEwh_wgt() + "]");
		System.out.println("wht_pj_retngod_wgt = [" + getWht_pj_retngod_wgt() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String issu_dt = req.getParameter("issu_dt");
if( issu_dt == null){
	System.out.println(this.toString+" : issu_dt is null" );
}else{
	System.out.println(this.toString+" : issu_dt is "+issu_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String ewh_roll_cnt = req.getParameter("ewh_roll_cnt");
if( ewh_roll_cnt == null){
	System.out.println(this.toString+" : ewh_roll_cnt is null" );
}else{
	System.out.println(this.toString+" : ewh_roll_cnt is "+ewh_roll_cnt );
}
String ewh_wgt = req.getParameter("ewh_wgt");
if( ewh_wgt == null){
	System.out.println(this.toString+" : ewh_wgt is null" );
}else{
	System.out.println(this.toString+" : ewh_wgt is "+ewh_wgt );
}
String wht_pj_retngod_wgt = req.getParameter("wht_pj_retngod_wgt");
if( wht_pj_retngod_wgt == null){
	System.out.println(this.toString+" : wht_pj_retngod_wgt is null" );
}else{
	System.out.println(this.toString+" : wht_pj_retngod_wgt is "+wht_pj_retngod_wgt );
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
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String issu_dt = Util.checkString(req.getParameter("issu_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String ewh_roll_cnt = Util.checkString(req.getParameter("ewh_roll_cnt"));
String ewh_wgt = Util.checkString(req.getParameter("ewh_wgt"));
String wht_pj_retngod_wgt = Util.checkString(req.getParameter("wht_pj_retngod_wgt"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String ewh_roll_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_roll_cnt")));
String ewh_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_wgt")));
String wht_pj_retngod_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("wht_pj_retngod_wgt")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIssu_dt(issu_dt);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setEwh_roll_cnt(ewh_roll_cnt);
dm.setEwh_wgt(ewh_wgt);
dm.setWht_pj_retngod_wgt(wht_pj_retngod_wgt);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 25 15:09:07 KST 2009 */