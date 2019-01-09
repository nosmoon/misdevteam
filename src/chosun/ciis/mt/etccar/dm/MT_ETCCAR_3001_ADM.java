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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_3001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String car_no;
	public String repa_dt;
	public String drvr_nm;
	public String repa_gag;
	public String repa_clsf;
	public String repa_cont;
	public String oil_qunt;
	public String repa_dtls_ptcr;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String gubun;

	public MT_ETCCAR_3001_ADM(){}
	public MT_ETCCAR_3001_ADM(String cmpy_cd, String occr_dt, String seq, String sub_seq, String car_no, String repa_dt, String drvr_nm, String repa_gag, String repa_clsf, String repa_cont, String oil_qunt, String repa_dtls_ptcr, String incmg_pers_ipaddr, String incmg_pers, String gubun){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.sub_seq = sub_seq;
		this.car_no = car_no;
		this.repa_dt = repa_dt;
		this.drvr_nm = drvr_nm;
		this.repa_gag = repa_gag;
		this.repa_clsf = repa_clsf;
		this.repa_cont = repa_cont;
		this.oil_qunt = oil_qunt;
		this.repa_dtls_ptcr = repa_dtls_ptcr;
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

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setRepa_dt(String repa_dt){
		this.repa_dt = repa_dt;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setRepa_gag(String repa_gag){
		this.repa_gag = repa_gag;
	}

	public void setRepa_clsf(String repa_clsf){
		this.repa_clsf = repa_clsf;
	}

	public void setRepa_cont(String repa_cont){
		this.repa_cont = repa_cont;
	}

	public void setOil_qunt(String oil_qunt){
		this.oil_qunt = oil_qunt;
	}

	public void setRepa_dtls_ptcr(String repa_dtls_ptcr){
		this.repa_dtls_ptcr = repa_dtls_ptcr;
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

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getRepa_dt(){
		return this.repa_dt;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getRepa_gag(){
		return this.repa_gag;
	}

	public String getRepa_clsf(){
		return this.repa_clsf;
	}

	public String getRepa_cont(){
		return this.repa_cont;
	}

	public String getOil_qunt(){
		return this.oil_qunt;
	}

	public String getRepa_dtls_ptcr(){
		return this.repa_dtls_ptcr;
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
		 return "{ call MISMAT.SP_MT_ETCCAR_3001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_3001_ADM dm = (MT_ETCCAR_3001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.sub_seq);
		cstmt.setString(7, dm.car_no);
		cstmt.setString(8, dm.repa_dt);
		cstmt.setString(9, dm.drvr_nm);
		cstmt.setString(10, dm.repa_gag);
		cstmt.setString(11, dm.repa_clsf);
		cstmt.setString(12, dm.repa_cont);
		cstmt.setString(13, dm.oil_qunt);
		cstmt.setString(14, dm.repa_dtls_ptcr);
		cstmt.setString(15, dm.incmg_pers_ipaddr);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_3001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("repa_dt = [" + getRepa_dt() + "]");
		System.out.println("drvr_nm = [" + getDrvr_nm() + "]");
		System.out.println("repa_gag = [" + getRepa_gag() + "]");
		System.out.println("repa_clsf = [" + getRepa_clsf() + "]");
		System.out.println("repa_cont = [" + getRepa_cont() + "]");
		System.out.println("oil_qunt = [" + getOil_qunt() + "]");
		System.out.println("repa_dtls_ptcr = [" + getRepa_dtls_ptcr() + "]");
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
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String repa_dt = req.getParameter("repa_dt");
if( repa_dt == null){
	System.out.println(this.toString+" : repa_dt is null" );
}else{
	System.out.println(this.toString+" : repa_dt is "+repa_dt );
}
String drvr_nm = req.getParameter("drvr_nm");
if( drvr_nm == null){
	System.out.println(this.toString+" : drvr_nm is null" );
}else{
	System.out.println(this.toString+" : drvr_nm is "+drvr_nm );
}
String repa_gag = req.getParameter("repa_gag");
if( repa_gag == null){
	System.out.println(this.toString+" : repa_gag is null" );
}else{
	System.out.println(this.toString+" : repa_gag is "+repa_gag );
}
String repa_clsf = req.getParameter("repa_clsf");
if( repa_clsf == null){
	System.out.println(this.toString+" : repa_clsf is null" );
}else{
	System.out.println(this.toString+" : repa_clsf is "+repa_clsf );
}
String repa_cont = req.getParameter("repa_cont");
if( repa_cont == null){
	System.out.println(this.toString+" : repa_cont is null" );
}else{
	System.out.println(this.toString+" : repa_cont is "+repa_cont );
}
String oil_qunt = req.getParameter("oil_qunt");
if( oil_qunt == null){
	System.out.println(this.toString+" : oil_qunt is null" );
}else{
	System.out.println(this.toString+" : oil_qunt is "+oil_qunt );
}
String repa_dtls_ptcr = req.getParameter("repa_dtls_ptcr");
if( repa_dtls_ptcr == null){
	System.out.println(this.toString+" : repa_dtls_ptcr is null" );
}else{
	System.out.println(this.toString+" : repa_dtls_ptcr is "+repa_dtls_ptcr );
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
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String car_no = Util.checkString(req.getParameter("car_no"));
String repa_dt = Util.checkString(req.getParameter("repa_dt"));
String drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
String repa_gag = Util.checkString(req.getParameter("repa_gag"));
String repa_clsf = Util.checkString(req.getParameter("repa_clsf"));
String repa_cont = Util.checkString(req.getParameter("repa_cont"));
String oil_qunt = Util.checkString(req.getParameter("oil_qunt"));
String repa_dtls_ptcr = Util.checkString(req.getParameter("repa_dtls_ptcr"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String repa_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_dt")));
String drvr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_nm")));
String repa_gag = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_gag")));
String repa_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_clsf")));
String repa_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_cont")));
String oil_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_qunt")));
String repa_dtls_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("repa_dtls_ptcr")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSub_seq(sub_seq);
dm.setCar_no(car_no);
dm.setRepa_dt(repa_dt);
dm.setDrvr_nm(drvr_nm);
dm.setRepa_gag(repa_gag);
dm.setRepa_clsf(repa_clsf);
dm.setRepa_cont(repa_cont);
dm.setOil_qunt(oil_qunt);
dm.setRepa_dtls_ptcr(repa_dtls_ptcr);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 15 11:33:31 KST 2009 */