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


public class MT_ETCCAR_1001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers_ipaddr;
	public String incmg_pers;
	public String seq;
	public String occr_dt;
	public String driv_dt;
	public String car_no;
	public String oil_kind;
	public String drvr_nm;
	public String buyoil_dt;
	public String buyoil_tm;
	public String buyoil_qunt;
	public String buyoil_gag;
	public String outsd_oil_dt;
	public String outsd_oil_tm;
	public String outsd_oil_qunt;
	public String remk;
	public String gubun_1;
	public String endgbn_1;
	public String occr_dt_2;
	public String seq_2;
	public String start_dt_2;
	public String driv_dt_2;
	public String car_no_2;
	public String start_tm_2;
	public String ariv_tm_2;
	public String dest_2;
	public String drvr_nm_2;
	public String start_gag_2;
	public String ariv_gag_2;
	public String rid_pers_2;
	public String rid_deptcd_2;
	public String rid_deptnm_2;
	public String driv_purp_2;
	public String clos_dt_2;
	public String gubun_2;
	public String endgbn_2;

	public MT_ETCCAR_1001_ADM(){}
	public MT_ETCCAR_1001_ADM(String cmpy_cd, String incmg_pers_ipaddr, String incmg_pers, String seq, String occr_dt, String driv_dt, String car_no, String oil_kind, String drvr_nm, String buyoil_dt, String buyoil_tm, String buyoil_qunt, String buyoil_gag, String outsd_oil_dt, String outsd_oil_tm, String outsd_oil_qunt, String remk, String gubun_1, String endgbn_1, String occr_dt_2, String seq_2, String start_dt_2, String driv_dt_2, String car_no_2, String start_tm_2, String ariv_tm_2, String dest_2, String drvr_nm_2, String start_gag_2, String ariv_gag_2, String rid_pers_2, String rid_deptcd_2, String rid_deptnm_2, String driv_purp_2, String clos_dt_2, String gubun_2, String endgbn_2){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
		this.seq = seq;
		this.occr_dt = occr_dt;
		this.driv_dt = driv_dt;
		this.car_no = car_no;
		this.oil_kind = oil_kind;
		this.drvr_nm = drvr_nm;
		this.buyoil_dt = buyoil_dt;
		this.buyoil_tm = buyoil_tm;
		this.buyoil_qunt = buyoil_qunt;
		this.buyoil_gag = buyoil_gag;
		this.outsd_oil_dt = outsd_oil_dt;
		this.outsd_oil_tm = outsd_oil_tm;
		this.outsd_oil_qunt = outsd_oil_qunt;
		this.remk = remk;
		this.gubun_1 = gubun_1;
		this.endgbn_1 = endgbn_1;
		this.occr_dt_2 = occr_dt_2;
		this.seq_2 = seq_2;
		this.start_dt_2 = start_dt_2;
		this.driv_dt_2 = driv_dt_2;
		this.car_no_2 = car_no_2;
		this.start_tm_2 = start_tm_2;
		this.ariv_tm_2 = ariv_tm_2;
		this.dest_2 = dest_2;
		this.drvr_nm_2 = drvr_nm_2;
		this.start_gag_2 = start_gag_2;
		this.ariv_gag_2 = ariv_gag_2;
		this.rid_pers_2 = rid_pers_2;
		this.rid_deptcd_2 = rid_deptcd_2;
		this.rid_deptnm_2 = rid_deptnm_2;
		this.driv_purp_2 = driv_purp_2;
		this.clos_dt_2 = clos_dt_2;
		this.gubun_2 = gubun_2;
		this.endgbn_2 = endgbn_2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setDriv_dt(String driv_dt){
		this.driv_dt = driv_dt;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setBuyoil_dt(String buyoil_dt){
		this.buyoil_dt = buyoil_dt;
	}

	public void setBuyoil_tm(String buyoil_tm){
		this.buyoil_tm = buyoil_tm;
	}

	public void setBuyoil_qunt(String buyoil_qunt){
		this.buyoil_qunt = buyoil_qunt;
	}

	public void setBuyoil_gag(String buyoil_gag){
		this.buyoil_gag = buyoil_gag;
	}

	public void setOutsd_oil_dt(String outsd_oil_dt){
		this.outsd_oil_dt = outsd_oil_dt;
	}

	public void setOutsd_oil_tm(String outsd_oil_tm){
		this.outsd_oil_tm = outsd_oil_tm;
	}

	public void setOutsd_oil_qunt(String outsd_oil_qunt){
		this.outsd_oil_qunt = outsd_oil_qunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setGubun_1(String gubun_1){
		this.gubun_1 = gubun_1;
	}

	public void setEndgbn_1(String endgbn_1){
		this.endgbn_1 = endgbn_1;
	}

	public void setOccr_dt_2(String occr_dt_2){
		this.occr_dt_2 = occr_dt_2;
	}

	public void setSeq_2(String seq_2){
		this.seq_2 = seq_2;
	}

	public void setStart_dt_2(String start_dt_2){
		this.start_dt_2 = start_dt_2;
	}

	public void setDriv_dt_2(String driv_dt_2){
		this.driv_dt_2 = driv_dt_2;
	}

	public void setCar_no_2(String car_no_2){
		this.car_no_2 = car_no_2;
	}

	public void setStart_tm_2(String start_tm_2){
		this.start_tm_2 = start_tm_2;
	}

	public void setAriv_tm_2(String ariv_tm_2){
		this.ariv_tm_2 = ariv_tm_2;
	}

	public void setDest_2(String dest_2){
		this.dest_2 = dest_2;
	}

	public void setDrvr_nm_2(String drvr_nm_2){
		this.drvr_nm_2 = drvr_nm_2;
	}

	public void setStart_gag_2(String start_gag_2){
		this.start_gag_2 = start_gag_2;
	}

	public void setAriv_gag_2(String ariv_gag_2){
		this.ariv_gag_2 = ariv_gag_2;
	}

	public void setRid_pers_2(String rid_pers_2){
		this.rid_pers_2 = rid_pers_2;
	}

	public void setRid_deptcd_2(String rid_deptcd_2){
		this.rid_deptcd_2 = rid_deptcd_2;
	}

	public void setRid_deptnm_2(String rid_deptnm_2){
		this.rid_deptnm_2 = rid_deptnm_2;
	}

	public void setDriv_purp_2(String driv_purp_2){
		this.driv_purp_2 = driv_purp_2;
	}

	public void setClos_dt_2(String clos_dt_2){
		this.clos_dt_2 = clos_dt_2;
	}

	public void setGubun_2(String gubun_2){
		this.gubun_2 = gubun_2;
	}

	public void setEndgbn_2(String endgbn_2){
		this.endgbn_2 = endgbn_2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getDriv_dt(){
		return this.driv_dt;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getBuyoil_dt(){
		return this.buyoil_dt;
	}

	public String getBuyoil_tm(){
		return this.buyoil_tm;
	}

	public String getBuyoil_qunt(){
		return this.buyoil_qunt;
	}

	public String getBuyoil_gag(){
		return this.buyoil_gag;
	}

	public String getOutsd_oil_dt(){
		return this.outsd_oil_dt;
	}

	public String getOutsd_oil_tm(){
		return this.outsd_oil_tm;
	}

	public String getOutsd_oil_qunt(){
		return this.outsd_oil_qunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getGubun_1(){
		return this.gubun_1;
	}

	public String getEndgbn_1(){
		return this.endgbn_1;
	}

	public String getOccr_dt_2(){
		return this.occr_dt_2;
	}

	public String getSeq_2(){
		return this.seq_2;
	}

	public String getStart_dt_2(){
		return this.start_dt_2;
	}

	public String getDriv_dt_2(){
		return this.driv_dt_2;
	}

	public String getCar_no_2(){
		return this.car_no_2;
	}

	public String getStart_tm_2(){
		return this.start_tm_2;
	}

	public String getAriv_tm_2(){
		return this.ariv_tm_2;
	}

	public String getDest_2(){
		return this.dest_2;
	}

	public String getDrvr_nm_2(){
		return this.drvr_nm_2;
	}

	public String getStart_gag_2(){
		return this.start_gag_2;
	}

	public String getAriv_gag_2(){
		return this.ariv_gag_2;
	}

	public String getRid_pers_2(){
		return this.rid_pers_2;
	}

	public String getRid_deptcd_2(){
		return this.rid_deptcd_2;
	}

	public String getRid_deptnm_2(){
		return this.rid_deptnm_2;
	}

	public String getDriv_purp_2(){
		return this.driv_purp_2;
	}

	public String getClos_dt_2(){
		return this.clos_dt_2;
	}

	public String getGubun_2(){
		return this.gubun_2;
	}

	public String getEndgbn_2(){
		return this.endgbn_2;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_1001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_1001_ADM dm = (MT_ETCCAR_1001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers_ipaddr);
		cstmt.setString(5, dm.incmg_pers);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.occr_dt);
		cstmt.setString(8, dm.driv_dt);
		cstmt.setString(9, dm.car_no);
		cstmt.setString(10, dm.oil_kind);
		cstmt.setString(11, dm.drvr_nm);
		cstmt.setString(12, dm.buyoil_dt);
		cstmt.setString(13, dm.buyoil_tm);
		cstmt.setString(14, dm.buyoil_qunt);
		cstmt.setString(15, dm.buyoil_gag);
		cstmt.setString(16, dm.outsd_oil_dt);
		cstmt.setString(17, dm.outsd_oil_tm);
		cstmt.setString(18, dm.outsd_oil_qunt);
		cstmt.setString(19, dm.remk);
		cstmt.setString(20, dm.gubun_1);
		cstmt.setString(21, dm.endgbn_1);
		cstmt.setString(22, dm.occr_dt_2);
		cstmt.setString(23, dm.seq_2);
		cstmt.setString(24, dm.start_dt_2);
		cstmt.setString(25, dm.driv_dt_2);
		cstmt.setString(26, dm.car_no_2);
		cstmt.setString(27, dm.start_tm_2);
		cstmt.setString(28, dm.ariv_tm_2);
		cstmt.setString(29, dm.dest_2);
		cstmt.setString(30, dm.drvr_nm_2);
		cstmt.setString(31, dm.start_gag_2);
		cstmt.setString(32, dm.ariv_gag_2);
		cstmt.setString(33, dm.rid_pers_2);
		cstmt.setString(34, dm.rid_deptcd_2);
		cstmt.setString(35, dm.rid_deptnm_2);
		cstmt.setString(36, dm.driv_purp_2);
		cstmt.setString(37, dm.clos_dt_2);
		cstmt.setString(38, dm.gubun_2);
		cstmt.setString(39, dm.endgbn_2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_1001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("driv_dt = [" + getDriv_dt() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("oil_kind = [" + getOil_kind() + "]");
		System.out.println("drvr_nm = [" + getDrvr_nm() + "]");
		System.out.println("buyoil_dt = [" + getBuyoil_dt() + "]");
		System.out.println("buyoil_tm = [" + getBuyoil_tm() + "]");
		System.out.println("buyoil_qunt = [" + getBuyoil_qunt() + "]");
		System.out.println("buyoil_gag = [" + getBuyoil_gag() + "]");
		System.out.println("outsd_oil_dt = [" + getOutsd_oil_dt() + "]");
		System.out.println("outsd_oil_tm = [" + getOutsd_oil_tm() + "]");
		System.out.println("outsd_oil_qunt = [" + getOutsd_oil_qunt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("gubun_1 = [" + getGubun_1() + "]");
		System.out.println("endgbn_1 = [" + getEndgbn_1() + "]");
		System.out.println("occr_dt_2 = [" + getOccr_dt_2() + "]");
		System.out.println("seq_2 = [" + getSeq_2() + "]");
		System.out.println("start_dt_2 = [" + getStart_dt_2() + "]");
		System.out.println("driv_dt_2 = [" + getDriv_dt_2() + "]");
		System.out.println("car_no_2 = [" + getCar_no_2() + "]");
		System.out.println("start_tm_2 = [" + getStart_tm_2() + "]");
		System.out.println("ariv_tm_2 = [" + getAriv_tm_2() + "]");
		System.out.println("dest_2 = [" + getDest_2() + "]");
		System.out.println("drvr_nm_2 = [" + getDrvr_nm_2() + "]");
		System.out.println("start_gag_2 = [" + getStart_gag_2() + "]");
		System.out.println("ariv_gag_2 = [" + getAriv_gag_2() + "]");
		System.out.println("rid_pers_2 = [" + getRid_pers_2() + "]");
		System.out.println("rid_deptcd_2 = [" + getRid_deptcd_2() + "]");
		System.out.println("rid_deptnm_2 = [" + getRid_deptnm_2() + "]");
		System.out.println("driv_purp_2 = [" + getDriv_purp_2() + "]");
		System.out.println("clos_dt_2 = [" + getClos_dt_2() + "]");
		System.out.println("gubun_2 = [" + getGubun_2() + "]");
		System.out.println("endgbn_2 = [" + getEndgbn_2() + "]");
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
String driv_dt = req.getParameter("driv_dt");
if( driv_dt == null){
	System.out.println(this.toString+" : driv_dt is null" );
}else{
	System.out.println(this.toString+" : driv_dt is "+driv_dt );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String oil_kind = req.getParameter("oil_kind");
if( oil_kind == null){
	System.out.println(this.toString+" : oil_kind is null" );
}else{
	System.out.println(this.toString+" : oil_kind is "+oil_kind );
}
String drvr_nm = req.getParameter("drvr_nm");
if( drvr_nm == null){
	System.out.println(this.toString+" : drvr_nm is null" );
}else{
	System.out.println(this.toString+" : drvr_nm is "+drvr_nm );
}
String buyoil_dt = req.getParameter("buyoil_dt");
if( buyoil_dt == null){
	System.out.println(this.toString+" : buyoil_dt is null" );
}else{
	System.out.println(this.toString+" : buyoil_dt is "+buyoil_dt );
}
String buyoil_tm = req.getParameter("buyoil_tm");
if( buyoil_tm == null){
	System.out.println(this.toString+" : buyoil_tm is null" );
}else{
	System.out.println(this.toString+" : buyoil_tm is "+buyoil_tm );
}
String buyoil_qunt = req.getParameter("buyoil_qunt");
if( buyoil_qunt == null){
	System.out.println(this.toString+" : buyoil_qunt is null" );
}else{
	System.out.println(this.toString+" : buyoil_qunt is "+buyoil_qunt );
}
String buyoil_gag = req.getParameter("buyoil_gag");
if( buyoil_gag == null){
	System.out.println(this.toString+" : buyoil_gag is null" );
}else{
	System.out.println(this.toString+" : buyoil_gag is "+buyoil_gag );
}
String outsd_oil_dt = req.getParameter("outsd_oil_dt");
if( outsd_oil_dt == null){
	System.out.println(this.toString+" : outsd_oil_dt is null" );
}else{
	System.out.println(this.toString+" : outsd_oil_dt is "+outsd_oil_dt );
}
String outsd_oil_tm = req.getParameter("outsd_oil_tm");
if( outsd_oil_tm == null){
	System.out.println(this.toString+" : outsd_oil_tm is null" );
}else{
	System.out.println(this.toString+" : outsd_oil_tm is "+outsd_oil_tm );
}
String outsd_oil_qunt = req.getParameter("outsd_oil_qunt");
if( outsd_oil_qunt == null){
	System.out.println(this.toString+" : outsd_oil_qunt is null" );
}else{
	System.out.println(this.toString+" : outsd_oil_qunt is "+outsd_oil_qunt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String gubun_1 = req.getParameter("gubun_1");
if( gubun_1 == null){
	System.out.println(this.toString+" : gubun_1 is null" );
}else{
	System.out.println(this.toString+" : gubun_1 is "+gubun_1 );
}
String endgbn_1 = req.getParameter("endgbn_1");
if( endgbn_1 == null){
	System.out.println(this.toString+" : endgbn_1 is null" );
}else{
	System.out.println(this.toString+" : endgbn_1 is "+endgbn_1 );
}
String occr_dt_2 = req.getParameter("occr_dt_2");
if( occr_dt_2 == null){
	System.out.println(this.toString+" : occr_dt_2 is null" );
}else{
	System.out.println(this.toString+" : occr_dt_2 is "+occr_dt_2 );
}
String seq_2 = req.getParameter("seq_2");
if( seq_2 == null){
	System.out.println(this.toString+" : seq_2 is null" );
}else{
	System.out.println(this.toString+" : seq_2 is "+seq_2 );
}
String start_dt_2 = req.getParameter("start_dt_2");
if( start_dt_2 == null){
	System.out.println(this.toString+" : start_dt_2 is null" );
}else{
	System.out.println(this.toString+" : start_dt_2 is "+start_dt_2 );
}
String driv_dt_2 = req.getParameter("driv_dt_2");
if( driv_dt_2 == null){
	System.out.println(this.toString+" : driv_dt_2 is null" );
}else{
	System.out.println(this.toString+" : driv_dt_2 is "+driv_dt_2 );
}
String car_no_2 = req.getParameter("car_no_2");
if( car_no_2 == null){
	System.out.println(this.toString+" : car_no_2 is null" );
}else{
	System.out.println(this.toString+" : car_no_2 is "+car_no_2 );
}
String start_tm_2 = req.getParameter("start_tm_2");
if( start_tm_2 == null){
	System.out.println(this.toString+" : start_tm_2 is null" );
}else{
	System.out.println(this.toString+" : start_tm_2 is "+start_tm_2 );
}
String ariv_tm_2 = req.getParameter("ariv_tm_2");
if( ariv_tm_2 == null){
	System.out.println(this.toString+" : ariv_tm_2 is null" );
}else{
	System.out.println(this.toString+" : ariv_tm_2 is "+ariv_tm_2 );
}
String dest_2 = req.getParameter("dest_2");
if( dest_2 == null){
	System.out.println(this.toString+" : dest_2 is null" );
}else{
	System.out.println(this.toString+" : dest_2 is "+dest_2 );
}
String drvr_nm_2 = req.getParameter("drvr_nm_2");
if( drvr_nm_2 == null){
	System.out.println(this.toString+" : drvr_nm_2 is null" );
}else{
	System.out.println(this.toString+" : drvr_nm_2 is "+drvr_nm_2 );
}
String start_gag_2 = req.getParameter("start_gag_2");
if( start_gag_2 == null){
	System.out.println(this.toString+" : start_gag_2 is null" );
}else{
	System.out.println(this.toString+" : start_gag_2 is "+start_gag_2 );
}
String ariv_gag_2 = req.getParameter("ariv_gag_2");
if( ariv_gag_2 == null){
	System.out.println(this.toString+" : ariv_gag_2 is null" );
}else{
	System.out.println(this.toString+" : ariv_gag_2 is "+ariv_gag_2 );
}
String rid_pers_2 = req.getParameter("rid_pers_2");
if( rid_pers_2 == null){
	System.out.println(this.toString+" : rid_pers_2 is null" );
}else{
	System.out.println(this.toString+" : rid_pers_2 is "+rid_pers_2 );
}
String rid_deptcd_2 = req.getParameter("rid_deptcd_2");
if( rid_deptcd_2 == null){
	System.out.println(this.toString+" : rid_deptcd_2 is null" );
}else{
	System.out.println(this.toString+" : rid_deptcd_2 is "+rid_deptcd_2 );
}
String rid_deptnm_2 = req.getParameter("rid_deptnm_2");
if( rid_deptnm_2 == null){
	System.out.println(this.toString+" : rid_deptnm_2 is null" );
}else{
	System.out.println(this.toString+" : rid_deptnm_2 is "+rid_deptnm_2 );
}
String driv_purp_2 = req.getParameter("driv_purp_2");
if( driv_purp_2 == null){
	System.out.println(this.toString+" : driv_purp_2 is null" );
}else{
	System.out.println(this.toString+" : driv_purp_2 is "+driv_purp_2 );
}
String clos_dt_2 = req.getParameter("clos_dt_2");
if( clos_dt_2 == null){
	System.out.println(this.toString+" : clos_dt_2 is null" );
}else{
	System.out.println(this.toString+" : clos_dt_2 is "+clos_dt_2 );
}
String gubun_2 = req.getParameter("gubun_2");
if( gubun_2 == null){
	System.out.println(this.toString+" : gubun_2 is null" );
}else{
	System.out.println(this.toString+" : gubun_2 is "+gubun_2 );
}
String endgbn_2 = req.getParameter("endgbn_2");
if( endgbn_2 == null){
	System.out.println(this.toString+" : endgbn_2 is null" );
}else{
	System.out.println(this.toString+" : endgbn_2 is "+endgbn_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String seq = Util.checkString(req.getParameter("seq"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String driv_dt = Util.checkString(req.getParameter("driv_dt"));
String car_no = Util.checkString(req.getParameter("car_no"));
String oil_kind = Util.checkString(req.getParameter("oil_kind"));
String drvr_nm = Util.checkString(req.getParameter("drvr_nm"));
String buyoil_dt = Util.checkString(req.getParameter("buyoil_dt"));
String buyoil_tm = Util.checkString(req.getParameter("buyoil_tm"));
String buyoil_qunt = Util.checkString(req.getParameter("buyoil_qunt"));
String buyoil_gag = Util.checkString(req.getParameter("buyoil_gag"));
String outsd_oil_dt = Util.checkString(req.getParameter("outsd_oil_dt"));
String outsd_oil_tm = Util.checkString(req.getParameter("outsd_oil_tm"));
String outsd_oil_qunt = Util.checkString(req.getParameter("outsd_oil_qunt"));
String remk = Util.checkString(req.getParameter("remk"));
String gubun_1 = Util.checkString(req.getParameter("gubun_1"));
String endgbn_1 = Util.checkString(req.getParameter("endgbn_1"));
String occr_dt_2 = Util.checkString(req.getParameter("occr_dt_2"));
String seq_2 = Util.checkString(req.getParameter("seq_2"));
String start_dt_2 = Util.checkString(req.getParameter("start_dt_2"));
String driv_dt_2 = Util.checkString(req.getParameter("driv_dt_2"));
String car_no_2 = Util.checkString(req.getParameter("car_no_2"));
String start_tm_2 = Util.checkString(req.getParameter("start_tm_2"));
String ariv_tm_2 = Util.checkString(req.getParameter("ariv_tm_2"));
String dest_2 = Util.checkString(req.getParameter("dest_2"));
String drvr_nm_2 = Util.checkString(req.getParameter("drvr_nm_2"));
String start_gag_2 = Util.checkString(req.getParameter("start_gag_2"));
String ariv_gag_2 = Util.checkString(req.getParameter("ariv_gag_2"));
String rid_pers_2 = Util.checkString(req.getParameter("rid_pers_2"));
String rid_deptcd_2 = Util.checkString(req.getParameter("rid_deptcd_2"));
String rid_deptnm_2 = Util.checkString(req.getParameter("rid_deptnm_2"));
String driv_purp_2 = Util.checkString(req.getParameter("driv_purp_2"));
String clos_dt_2 = Util.checkString(req.getParameter("clos_dt_2"));
String gubun_2 = Util.checkString(req.getParameter("gubun_2"));
String endgbn_2 = Util.checkString(req.getParameter("endgbn_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String driv_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String oil_kind = Util.Uni2Ksc(Util.checkString(req.getParameter("oil_kind")));
String drvr_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_nm")));
String buyoil_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("buyoil_dt")));
String buyoil_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("buyoil_tm")));
String buyoil_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("buyoil_qunt")));
String buyoil_gag = Util.Uni2Ksc(Util.checkString(req.getParameter("buyoil_gag")));
String outsd_oil_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_oil_dt")));
String outsd_oil_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_oil_tm")));
String outsd_oil_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("outsd_oil_qunt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String gubun_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_1")));
String endgbn_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_1")));
String occr_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_2")));
String seq_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_2")));
String start_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("start_dt_2")));
String driv_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_dt_2")));
String car_no_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no_2")));
String start_tm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("start_tm_2")));
String ariv_tm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_tm_2")));
String dest_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dest_2")));
String drvr_nm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("drvr_nm_2")));
String start_gag_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("start_gag_2")));
String ariv_gag_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ariv_gag_2")));
String rid_pers_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_pers_2")));
String rid_deptcd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_deptcd_2")));
String rid_deptnm_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rid_deptnm_2")));
String driv_purp_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("driv_purp_2")));
String clos_dt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt_2")));
String gubun_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun_2")));
String endgbn_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("endgbn_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
dm.setSeq(seq);
dm.setOccr_dt(occr_dt);
dm.setDriv_dt(driv_dt);
dm.setCar_no(car_no);
dm.setOil_kind(oil_kind);
dm.setDrvr_nm(drvr_nm);
dm.setBuyoil_dt(buyoil_dt);
dm.setBuyoil_tm(buyoil_tm);
dm.setBuyoil_qunt(buyoil_qunt);
dm.setBuyoil_gag(buyoil_gag);
dm.setOutsd_oil_dt(outsd_oil_dt);
dm.setOutsd_oil_tm(outsd_oil_tm);
dm.setOutsd_oil_qunt(outsd_oil_qunt);
dm.setRemk(remk);
dm.setGubun_1(gubun_1);
dm.setEndgbn_1(endgbn_1);
dm.setOccr_dt_2(occr_dt_2);
dm.setSeq_2(seq_2);
dm.setStart_dt_2(start_dt_2);
dm.setDriv_dt_2(driv_dt_2);
dm.setCar_no_2(car_no_2);
dm.setStart_tm_2(start_tm_2);
dm.setAriv_tm_2(ariv_tm_2);
dm.setDest_2(dest_2);
dm.setDrvr_nm_2(drvr_nm_2);
dm.setStart_gag_2(start_gag_2);
dm.setAriv_gag_2(ariv_gag_2);
dm.setRid_pers_2(rid_pers_2);
dm.setRid_deptcd_2(rid_deptcd_2);
dm.setRid_deptnm_2(rid_deptnm_2);
dm.setDriv_purp_2(driv_purp_2);
dm.setClos_dt_2(clos_dt_2);
dm.setGubun_2(gubun_2);
dm.setEndgbn_2(endgbn_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 09 13:37:21 KST 2009 */