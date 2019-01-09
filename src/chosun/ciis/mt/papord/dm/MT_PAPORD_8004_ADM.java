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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_8004_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String issu_pcnt;
	public String slip_qty;
	public String dual_out_clsf;
	public String pap_row;
	public String papcmpy_cd;
	public String use_a;
	public String use_c;
	public String use_b;
	public String roll_wgt_a;
	public String roll_wgt_c;
	public String roll_wgt_b;
	public String roll_cnt_a;
	public String roll_cnt_c;
	public String roll_cnt_b;
	public String ewh_roll_cnt_a;
	public String ewh_wgt_a;
	public String bal_roll_cnt_a;
	public String bal_wgt_a;
	public String rs_roll_cnt_a;
	public String rs_wgt_a;
	public String car_cnt_a;
	public String ewh_roll_cnt_b;
	public String ewh_wgt_b;
	public String bal_roll_cnt_b;
	public String bal_wgt_b;
	public String rs_roll_cnt_b;
	public String rs_wgt_b;
	public String car_cnt_b;
	public String ewh_roll_cnt_c;
	public String ewh_wgt_c;
	public String bal_roll_cnt_c;
	public String bal_wgt_c;
	public String rs_roll_cnt_c;
	public String rs_wgt_c;
	public String car_cnt_c;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public MT_PAPORD_8004_ADM(){}
	public MT_PAPORD_8004_ADM(String cmpy_cd, String occr_dt, String fac_clsf, String medi_cd, String sect_cd, String issu_pcnt, String slip_qty, String dual_out_clsf, String papcmpy_cd, String pap_row, 	 String use_a, String use_c, String use_b, String roll_wgt_a, String roll_wgt_c, String roll_wgt_b, String roll_cnt_a, String roll_cnt_c, String roll_cnt_b, String ewh_roll_cnt_a, String ewh_wgt_a, String bal_roll_cnt_a, String bal_wgt_a, String rs_roll_cnt_a, String rs_wgt_a, String car_cnt_a, String ewh_roll_cnt_b, String ewh_wgt_b, String bal_roll_cnt_b, String bal_wgt_b, String rs_roll_cnt_b, String rs_wgt_b, String car_cnt_b, String ewh_roll_cnt_c, String ewh_wgt_c, String bal_roll_cnt_c, String bal_wgt_c, String rs_roll_cnt_c, String rs_wgt_c, String car_cnt_c, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.fac_clsf = fac_clsf;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.issu_pcnt = issu_pcnt;
		this.slip_qty = slip_qty;
		this.dual_out_clsf = dual_out_clsf;
		this.pap_row = pap_row;
		this.papcmpy_cd = papcmpy_cd;
		this.use_a = use_a;
		this.use_c = use_c;
		this.use_b = use_b;
		this.roll_wgt_a = roll_wgt_a;
		this.roll_wgt_c = roll_wgt_c;
		this.roll_wgt_b = roll_wgt_b;
		this.roll_cnt_a = roll_cnt_a;
		this.roll_cnt_c = roll_cnt_c;
		this.roll_cnt_b = roll_cnt_b;
		this.ewh_roll_cnt_a = ewh_roll_cnt_a;
		this.ewh_wgt_a = ewh_wgt_a;
		this.bal_roll_cnt_a = bal_roll_cnt_a;
		this.bal_wgt_a = bal_wgt_a;
		this.rs_roll_cnt_a = rs_roll_cnt_a;
		this.rs_wgt_a = rs_wgt_a;
		this.car_cnt_a = car_cnt_a;
		this.ewh_roll_cnt_b = ewh_roll_cnt_b;
		this.ewh_wgt_b = ewh_wgt_b;
		this.bal_roll_cnt_b = bal_roll_cnt_b;
		this.bal_wgt_b = bal_wgt_b;
		this.rs_roll_cnt_b = rs_roll_cnt_b;
		this.rs_wgt_b = rs_wgt_b;
		this.car_cnt_b = car_cnt_b;
		this.ewh_roll_cnt_c = ewh_roll_cnt_c;
		this.ewh_wgt_c = ewh_wgt_c;
		this.bal_roll_cnt_c = bal_roll_cnt_c;
		this.bal_wgt_c = bal_wgt_c;
		this.rs_roll_cnt_c = rs_roll_cnt_c;
		this.rs_wgt_c = rs_wgt_c;
		this.car_cnt_c = car_cnt_c;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setPap_row(String pap_row){
		this.pap_row = pap_row;
	}
	
	public void setPapcmpy_cd(String papcmpy_cd) {
		this.papcmpy_cd = papcmpy_cd;
	}
	
	public void setUse_a(String use_a) {
		this.use_a = use_a;
	}

	public void setUse_b(String use_b) {
		this.use_b = use_b;
	}

	public void setUse_c(String use_c) {
		this.use_c = use_c;
	}

	public void setRoll_cnt_a(String roll_cnt_a) {
		this.roll_cnt_a = roll_cnt_a;
	}
	
	public void setRoll_cnt_b(String roll_cnt_b) {
		this.roll_cnt_b = roll_cnt_b;
	}
	
	public void setRoll_cnt_c(String roll_cnt_c) {
		this.roll_cnt_c = roll_cnt_c;
	}
	
	public void setRoll_wgt_a(String roll_wgt_a) {
		this.roll_wgt_a = roll_wgt_a;
	}
	
	public void setRoll_wgt_b(String roll_wgt_b) {
		this.roll_wgt_b = roll_wgt_b;
	}
	
	public void setRoll_wgt_c(String roll_wgt_c) {
		this.roll_wgt_c = roll_wgt_c;
	}
	
	public void setEwh_roll_cnt_a(String ewh_roll_cnt_a){
		this.ewh_roll_cnt_a = ewh_roll_cnt_a;
	}

	public void setEwh_wgt_a(String ewh_wgt_a){
		this.ewh_wgt_a = ewh_wgt_a;
	}

	public void setBal_roll_cnt_a(String bal_roll_cnt_a){
		this.bal_roll_cnt_a = bal_roll_cnt_a;
	}

	public void setBal_wgt_a(String bal_wgt_a){
		this.bal_wgt_a = bal_wgt_a;
	}

	public void setRs_roll_cnt_a(String rs_roll_cnt_a){
		this.rs_roll_cnt_a = rs_roll_cnt_a;
	}

	public void setRs_wgt_a(String rs_wgt_a){
		this.rs_wgt_a = rs_wgt_a;
	}

	public void setCar_cnt_a(String car_cnt_a){
		this.car_cnt_a = car_cnt_a;
	}

	public void setEwh_roll_cnt_b(String ewh_roll_cnt_b){
		this.ewh_roll_cnt_b = ewh_roll_cnt_b;
	}

	public void setEwh_wgt_b(String ewh_wgt_b){
		this.ewh_wgt_b = ewh_wgt_b;
	}

	public void setBal_roll_cnt_b(String bal_roll_cnt_b){
		this.bal_roll_cnt_b = bal_roll_cnt_b;
	}

	public void setBal_wgt_b(String bal_wgt_b){
		this.bal_wgt_b = bal_wgt_b;
	}

	public void setRs_roll_cnt_b(String rs_roll_cnt_b){
		this.rs_roll_cnt_b = rs_roll_cnt_b;
	}

	public void setRs_wgt_b(String rs_wgt_b){
		this.rs_wgt_b = rs_wgt_b;
	}

	public void setCar_cnt_b(String car_cnt_b){
		this.car_cnt_b = car_cnt_b;
	}

	public void setEwh_roll_cnt_c(String ewh_roll_cnt_c){
		this.ewh_roll_cnt_c = ewh_roll_cnt_c;
	}

	public void setEwh_wgt_c(String ewh_wgt_c){
		this.ewh_wgt_c = ewh_wgt_c;
	}

	public void setBal_roll_cnt_c(String bal_roll_cnt_c){
		this.bal_roll_cnt_c = bal_roll_cnt_c;
	}

	public void setBal_wgt_c(String bal_wgt_c){
		this.bal_wgt_c = bal_wgt_c;
	}

	public void setRs_roll_cnt_c(String rs_roll_cnt_c){
		this.rs_roll_cnt_c = rs_roll_cnt_c;
	}

	public void setRs_wgt_c(String rs_wgt_c){
		this.rs_wgt_c = rs_wgt_c;
	}

	public void setCar_cnt_c(String car_cnt_c){
		this.car_cnt_c = car_cnt_c;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getPap_row(){
		return this.pap_row;
	}

	public String getPapcmpy_cd() {
		return papcmpy_cd;
	}
	
	public String getUse_a() {
		return use_a;
	}

	public String getUse_b() {
		return use_b;
	}

	public String getUse_c() {
		return use_c;
	}
	
	public String getRoll_cnt_a() {
		return roll_cnt_a;
	}
	
	public String getRoll_cnt_b() {
		return roll_cnt_b;
	}
	
	public String getRoll_cnt_c() {
		return roll_cnt_c;
	}
	
	public String getRoll_wgt_a() {
		return roll_wgt_a;
	}
	
	public String getRoll_wgt_b() {
		return roll_wgt_b;
	}
	
	public String getRoll_wgt_c() {
		return roll_wgt_c;
	}

	public String getEwh_roll_cnt_a(){
		return this.ewh_roll_cnt_a;
	}

	public String getEwh_wgt_a(){
		return this.ewh_wgt_a;
	}

	public String getBal_roll_cnt_a(){
		return this.bal_roll_cnt_a;
	}

	public String getBal_wgt_a(){
		return this.bal_wgt_a;
	}

	public String getRs_roll_cnt_a(){
		return this.rs_roll_cnt_a;
	}

	public String getRs_wgt_a(){
		return this.rs_wgt_a;
	}

	public String getCar_cnt_a(){
		return this.car_cnt_a;
	}

	public String getEwh_roll_cnt_b(){
		return this.ewh_roll_cnt_b;
	}

	public String getEwh_wgt_b(){
		return this.ewh_wgt_b;
	}

	public String getBal_roll_cnt_b(){
		return this.bal_roll_cnt_b;
	}

	public String getBal_wgt_b(){
		return this.bal_wgt_b;
	}

	public String getRs_roll_cnt_b(){
		return this.rs_roll_cnt_b;
	}

	public String getRs_wgt_b(){
		return this.rs_wgt_b;
	}

	public String getCar_cnt_b(){
		return this.car_cnt_b;
	}

	public String getEwh_roll_cnt_c(){
		return this.ewh_roll_cnt_c;
	}

	public String getEwh_wgt_c(){
		return this.ewh_wgt_c;
	}

	public String getBal_roll_cnt_c(){
		return this.bal_roll_cnt_c;
	}

	public String getBal_wgt_c(){
		return this.bal_wgt_c;
	}

	public String getRs_roll_cnt_c(){
		return this.rs_roll_cnt_c;
	}

	public String getRs_wgt_c(){
		return this.rs_wgt_c;
	}

	public String getCar_cnt_c(){
		return this.car_cnt_c;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_8004_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_8004_ADM dm = (MT_PAPORD_8004_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.sect_cd);
		cstmt.setString(8, dm.issu_pcnt);
		cstmt.setString(9, dm.slip_qty);
		cstmt.setString(10, dm.dual_out_clsf);
		cstmt.setString(11, dm.pap_row);
		cstmt.setString(12, dm.use_a);
		cstmt.setString(13, dm.use_c);
		cstmt.setString(14, dm.use_b);
		cstmt.setString(15, dm.roll_wgt_a);
		cstmt.setString(16, dm.roll_wgt_c);
		cstmt.setString(17, dm.roll_wgt_b);
		cstmt.setString(18, dm.roll_cnt_a);
		cstmt.setString(19, dm.roll_cnt_c);
		cstmt.setString(20, dm.roll_cnt_b);
		cstmt.setString(21, dm.ewh_roll_cnt_a);
		cstmt.setString(22, dm.ewh_wgt_a);
		cstmt.setString(23, dm.bal_roll_cnt_a);
		cstmt.setString(24, dm.bal_wgt_a);
		cstmt.setString(25, dm.rs_roll_cnt_a);
		cstmt.setString(26, dm.rs_wgt_a);
		cstmt.setString(27, dm.car_cnt_a);
		cstmt.setString(28, dm.ewh_roll_cnt_b);
		cstmt.setString(29, dm.ewh_wgt_b);
		cstmt.setString(30, dm.bal_roll_cnt_b);
		cstmt.setString(31, dm.bal_wgt_b);
		cstmt.setString(32, dm.rs_roll_cnt_b);
		cstmt.setString(33, dm.rs_wgt_b);
		cstmt.setString(34, dm.car_cnt_b);
		cstmt.setString(35, dm.ewh_roll_cnt_c);
		cstmt.setString(36, dm.ewh_wgt_c);
		cstmt.setString(37, dm.bal_roll_cnt_c);
		cstmt.setString(38, dm.bal_wgt_c);
		cstmt.setString(39, dm.rs_roll_cnt_c);
		cstmt.setString(40, dm.rs_wgt_c);
		cstmt.setString(41, dm.car_cnt_c);
		cstmt.setString(42, dm.incmg_pers_ipaddr);
		cstmt.setString(43, dm.incmg_pers);
		cstmt.setString(44, dm.papcmpy_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_8004_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("issu_pcnt = [" + getIssu_pcnt() + "]");
		System.out.println("slip_qty = [" + getSlip_qty() + "]");
		System.out.println("dual_out_clsf = [" + getDual_out_clsf() + "]");
		System.out.println("pap_row = [" + getPap_row() + "]");
		System.out.println("use_a = [" + getUse_a() + "]");
		System.out.println("use_c = [" + getUse_c() + "]");
		System.out.println("use_b = [" + getUse_b() + "]");
		System.out.println("roll_wgt_a = [" + getRoll_wgt_a() + "]");
		System.out.println("roll_wgt_c = [" + getRoll_wgt_c() + "]");
		System.out.println("roll_wgt_b = [" + getRoll_wgt_b() + "]");
		System.out.println("roll_cnt_a = [" + getRoll_cnt_a() + "]");
		System.out.println("roll_cnt_c = [" + getRoll_cnt_c() + "]");
		System.out.println("roll_cnt_b = [" + getRoll_cnt_b() + "]");
		System.out.println("ewh_roll_cnt_a = [" + getEwh_roll_cnt_a() + "]");
		System.out.println("ewh_wgt_a = [" + getEwh_wgt_a() + "]");
		System.out.println("bal_roll_cnt_a = [" + getBal_roll_cnt_a() + "]");
		System.out.println("bal_wgt_a = [" + getBal_wgt_a() + "]");
		System.out.println("rs_roll_cnt_a = [" + getRs_roll_cnt_a() + "]");
		System.out.println("rs_wgt_a = [" + getRs_wgt_a() + "]");
		System.out.println("car_cnt_a = [" + getCar_cnt_a() + "]");
		System.out.println("ewh_roll_cnt_b = [" + getEwh_roll_cnt_b() + "]");
		System.out.println("ewh_wgt_b = [" + getEwh_wgt_b() + "]");
		System.out.println("bal_roll_cnt_b = [" + getBal_roll_cnt_b() + "]");
		System.out.println("bal_wgt_b = [" + getBal_wgt_b() + "]");
		System.out.println("rs_roll_cnt_b = [" + getRs_roll_cnt_b() + "]");
		System.out.println("rs_wgt_b = [" + getRs_wgt_b() + "]");
		System.out.println("car_cnt_b = [" + getCar_cnt_b() + "]");
		System.out.println("ewh_roll_cnt_c = [" + getEwh_roll_cnt_c() + "]");
		System.out.println("ewh_wgt_c = [" + getEwh_wgt_c() + "]");
		System.out.println("bal_roll_cnt_c = [" + getBal_roll_cnt_c() + "]");
		System.out.println("bal_wgt_c = [" + getBal_wgt_c() + "]");
		System.out.println("rs_roll_cnt_c = [" + getRs_roll_cnt_c() + "]");
		System.out.println("rs_wgt_c = [" + getRs_wgt_c() + "]");
		System.out.println("car_cnt_c = [" + getCar_cnt_c() + "]");
		System.out.println("incmg_pers_ipaddr = [" + getIncmg_pers_ipaddr() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String issu_pcnt = req.getParameter("issu_pcnt");
if( issu_pcnt == null){
	System.out.println(this.toString+" : issu_pcnt is null" );
}else{
	System.out.println(this.toString+" : issu_pcnt is "+issu_pcnt );
}
String slip_qty = req.getParameter("slip_qty");
if( slip_qty == null){
	System.out.println(this.toString+" : slip_qty is null" );
}else{
	System.out.println(this.toString+" : slip_qty is "+slip_qty );
}
String dual_out_clsf = req.getParameter("dual_out_clsf");
if( dual_out_clsf == null){
	System.out.println(this.toString+" : dual_out_clsf is null" );
}else{
	System.out.println(this.toString+" : dual_out_clsf is "+dual_out_clsf );
}
String pap_row = req.getParameter("pap_row");
if( pap_row == null){
	System.out.println(this.toString+" : pap_row is null" );
}else{
	System.out.println(this.toString+" : pap_row is "+pap_row );
}
String roll_wgt = req.getParameter("roll_wgt");
if( roll_wgt == null){
	System.out.println(this.toString+" : roll_wgt is null" );
}else{
	System.out.println(this.toString+" : roll_wgt is "+roll_wgt );
}
String ewh_roll_cnt_a = req.getParameter("ewh_roll_cnt_a");
if( ewh_roll_cnt_a == null){
	System.out.println(this.toString+" : ewh_roll_cnt_a is null" );
}else{
	System.out.println(this.toString+" : ewh_roll_cnt_a is "+ewh_roll_cnt_a );
}
String ewh_wgt_a = req.getParameter("ewh_wgt_a");
if( ewh_wgt_a == null){
	System.out.println(this.toString+" : ewh_wgt_a is null" );
}else{
	System.out.println(this.toString+" : ewh_wgt_a is "+ewh_wgt_a );
}
String bal_roll_cnt_a = req.getParameter("bal_roll_cnt_a");
if( bal_roll_cnt_a == null){
	System.out.println(this.toString+" : bal_roll_cnt_a is null" );
}else{
	System.out.println(this.toString+" : bal_roll_cnt_a is "+bal_roll_cnt_a );
}
String bal_wgt_a = req.getParameter("bal_wgt_a");
if( bal_wgt_a == null){
	System.out.println(this.toString+" : bal_wgt_a is null" );
}else{
	System.out.println(this.toString+" : bal_wgt_a is "+bal_wgt_a );
}
String rs_roll_cnt_a = req.getParameter("rs_roll_cnt_a");
if( rs_roll_cnt_a == null){
	System.out.println(this.toString+" : rs_roll_cnt_a is null" );
}else{
	System.out.println(this.toString+" : rs_roll_cnt_a is "+rs_roll_cnt_a );
}
String rs_wgt_a = req.getParameter("rs_wgt_a");
if( rs_wgt_a == null){
	System.out.println(this.toString+" : rs_wgt_a is null" );
}else{
	System.out.println(this.toString+" : rs_wgt_a is "+rs_wgt_a );
}
String car_cnt_a = req.getParameter("car_cnt_a");
if( car_cnt_a == null){
	System.out.println(this.toString+" : car_cnt_a is null" );
}else{
	System.out.println(this.toString+" : car_cnt_a is "+car_cnt_a );
}
String ewh_roll_cnt_b = req.getParameter("ewh_roll_cnt_b");
if( ewh_roll_cnt_b == null){
	System.out.println(this.toString+" : ewh_roll_cnt_b is null" );
}else{
	System.out.println(this.toString+" : ewh_roll_cnt_b is "+ewh_roll_cnt_b );
}
String ewh_wgt_b = req.getParameter("ewh_wgt_b");
if( ewh_wgt_b == null){
	System.out.println(this.toString+" : ewh_wgt_b is null" );
}else{
	System.out.println(this.toString+" : ewh_wgt_b is "+ewh_wgt_b );
}
String bal_roll_cnt_b = req.getParameter("bal_roll_cnt_b");
if( bal_roll_cnt_b == null){
	System.out.println(this.toString+" : bal_roll_cnt_b is null" );
}else{
	System.out.println(this.toString+" : bal_roll_cnt_b is "+bal_roll_cnt_b );
}
String bal_wgt_b = req.getParameter("bal_wgt_b");
if( bal_wgt_b == null){
	System.out.println(this.toString+" : bal_wgt_b is null" );
}else{
	System.out.println(this.toString+" : bal_wgt_b is "+bal_wgt_b );
}
String rs_roll_cnt_b = req.getParameter("rs_roll_cnt_b");
if( rs_roll_cnt_b == null){
	System.out.println(this.toString+" : rs_roll_cnt_b is null" );
}else{
	System.out.println(this.toString+" : rs_roll_cnt_b is "+rs_roll_cnt_b );
}
String rs_wgt_b = req.getParameter("rs_wgt_b");
if( rs_wgt_b == null){
	System.out.println(this.toString+" : rs_wgt_b is null" );
}else{
	System.out.println(this.toString+" : rs_wgt_b is "+rs_wgt_b );
}
String car_cnt_b = req.getParameter("car_cnt_b");
if( car_cnt_b == null){
	System.out.println(this.toString+" : car_cnt_b is null" );
}else{
	System.out.println(this.toString+" : car_cnt_b is "+car_cnt_b );
}
String ewh_roll_cnt_c = req.getParameter("ewh_roll_cnt_c");
if( ewh_roll_cnt_c == null){
	System.out.println(this.toString+" : ewh_roll_cnt_c is null" );
}else{
	System.out.println(this.toString+" : ewh_roll_cnt_c is "+ewh_roll_cnt_c );
}
String ewh_wgt_c = req.getParameter("ewh_wgt_c");
if( ewh_wgt_c == null){
	System.out.println(this.toString+" : ewh_wgt_c is null" );
}else{
	System.out.println(this.toString+" : ewh_wgt_c is "+ewh_wgt_c );
}
String bal_roll_cnt_c = req.getParameter("bal_roll_cnt_c");
if( bal_roll_cnt_c == null){
	System.out.println(this.toString+" : bal_roll_cnt_c is null" );
}else{
	System.out.println(this.toString+" : bal_roll_cnt_c is "+bal_roll_cnt_c );
}
String bal_wgt_c = req.getParameter("bal_wgt_c");
if( bal_wgt_c == null){
	System.out.println(this.toString+" : bal_wgt_c is null" );
}else{
	System.out.println(this.toString+" : bal_wgt_c is "+bal_wgt_c );
}
String rs_roll_cnt_c = req.getParameter("rs_roll_cnt_c");
if( rs_roll_cnt_c == null){
	System.out.println(this.toString+" : rs_roll_cnt_c is null" );
}else{
	System.out.println(this.toString+" : rs_roll_cnt_c is "+rs_roll_cnt_c );
}
String rs_wgt_c = req.getParameter("rs_wgt_c");
if( rs_wgt_c == null){
	System.out.println(this.toString+" : rs_wgt_c is null" );
}else{
	System.out.println(this.toString+" : rs_wgt_c is "+rs_wgt_c );
}
String car_cnt_c = req.getParameter("car_cnt_c");
if( car_cnt_c == null){
	System.out.println(this.toString+" : car_cnt_c is null" );
}else{
	System.out.println(this.toString+" : car_cnt_c is "+car_cnt_c );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String issu_pcnt = Util.checkString(req.getParameter("issu_pcnt"));
String slip_qty = Util.checkString(req.getParameter("slip_qty"));
String dual_out_clsf = Util.checkString(req.getParameter("dual_out_clsf"));
String pap_row = Util.checkString(req.getParameter("pap_row"));
String roll_wgt = Util.checkString(req.getParameter("roll_wgt"));
String ewh_roll_cnt_a = Util.checkString(req.getParameter("ewh_roll_cnt_a"));
String ewh_wgt_a = Util.checkString(req.getParameter("ewh_wgt_a"));
String bal_roll_cnt_a = Util.checkString(req.getParameter("bal_roll_cnt_a"));
String bal_wgt_a = Util.checkString(req.getParameter("bal_wgt_a"));
String rs_roll_cnt_a = Util.checkString(req.getParameter("rs_roll_cnt_a"));
String rs_wgt_a = Util.checkString(req.getParameter("rs_wgt_a"));
String car_cnt_a = Util.checkString(req.getParameter("car_cnt_a"));
String ewh_roll_cnt_b = Util.checkString(req.getParameter("ewh_roll_cnt_b"));
String ewh_wgt_b = Util.checkString(req.getParameter("ewh_wgt_b"));
String bal_roll_cnt_b = Util.checkString(req.getParameter("bal_roll_cnt_b"));
String bal_wgt_b = Util.checkString(req.getParameter("bal_wgt_b"));
String rs_roll_cnt_b = Util.checkString(req.getParameter("rs_roll_cnt_b"));
String rs_wgt_b = Util.checkString(req.getParameter("rs_wgt_b"));
String car_cnt_b = Util.checkString(req.getParameter("car_cnt_b"));
String ewh_roll_cnt_c = Util.checkString(req.getParameter("ewh_roll_cnt_c"));
String ewh_wgt_c = Util.checkString(req.getParameter("ewh_wgt_c"));
String bal_roll_cnt_c = Util.checkString(req.getParameter("bal_roll_cnt_c"));
String bal_wgt_c = Util.checkString(req.getParameter("bal_wgt_c"));
String rs_roll_cnt_c = Util.checkString(req.getParameter("rs_roll_cnt_c"));
String rs_wgt_c = Util.checkString(req.getParameter("rs_wgt_c"));
String car_cnt_c = Util.checkString(req.getParameter("car_cnt_c"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String issu_pcnt = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pcnt")));
String slip_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_qty")));
String dual_out_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dual_out_clsf")));
String pap_row = Util.Uni2Ksc(Util.checkString(req.getParameter("pap_row")));
String roll_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_wgt")));
String ewh_roll_cnt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_roll_cnt_a")));
String ewh_wgt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_wgt_a")));
String bal_roll_cnt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_roll_cnt_a")));
String bal_wgt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_wgt_a")));
String rs_roll_cnt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("rs_roll_cnt_a")));
String rs_wgt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("rs_wgt_a")));
String car_cnt_a = Util.Uni2Ksc(Util.checkString(req.getParameter("car_cnt_a")));
String ewh_roll_cnt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_roll_cnt_b")));
String ewh_wgt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_wgt_b")));
String bal_roll_cnt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_roll_cnt_b")));
String bal_wgt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_wgt_b")));
String rs_roll_cnt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("rs_roll_cnt_b")));
String rs_wgt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("rs_wgt_b")));
String car_cnt_b = Util.Uni2Ksc(Util.checkString(req.getParameter("car_cnt_b")));
String ewh_roll_cnt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_roll_cnt_c")));
String ewh_wgt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_wgt_c")));
String bal_roll_cnt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_roll_cnt_c")));
String bal_wgt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("bal_wgt_c")));
String rs_roll_cnt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("rs_roll_cnt_c")));
String rs_wgt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("rs_wgt_c")));
String car_cnt_c = Util.Uni2Ksc(Util.checkString(req.getParameter("car_cnt_c")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setFac_clsf(fac_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setIssu_pcnt(issu_pcnt);
dm.setSlip_qty(slip_qty);
dm.setDual_out_clsf(dual_out_clsf);
dm.setPap_row(pap_row);
dm.setRoll_wgt(roll_wgt);
dm.setEwh_roll_cnt_a(ewh_roll_cnt_a);
dm.setEwh_wgt_a(ewh_wgt_a);
dm.setBal_roll_cnt_a(bal_roll_cnt_a);
dm.setBal_wgt_a(bal_wgt_a);
dm.setRs_roll_cnt_a(rs_roll_cnt_a);
dm.setRs_wgt_a(rs_wgt_a);
dm.setCar_cnt_a(car_cnt_a);
dm.setEwh_roll_cnt_b(ewh_roll_cnt_b);
dm.setEwh_wgt_b(ewh_wgt_b);
dm.setBal_roll_cnt_b(bal_roll_cnt_b);
dm.setBal_wgt_b(bal_wgt_b);
dm.setRs_roll_cnt_b(rs_roll_cnt_b);
dm.setRs_wgt_b(rs_wgt_b);
dm.setCar_cnt_b(car_cnt_b);
dm.setEwh_roll_cnt_c(ewh_roll_cnt_c);
dm.setEwh_wgt_c(ewh_wgt_c);
dm.setBal_roll_cnt_c(bal_roll_cnt_c);
dm.setBal_wgt_c(bal_wgt_c);
dm.setRs_roll_cnt_c(rs_roll_cnt_c);
dm.setRs_wgt_c(rs_wgt_c);
dm.setCar_cnt_c(car_cnt_c);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 24 17:14:27 KST 2016 */