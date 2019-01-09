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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class MT_PAPORD_8002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String issu_dt_day;
	public String issu_dt;	
	public String medi_nm;
	public String sect_nm;
	public String pcnt;
	public String clr_pcnt;
	public String prt_dt;
	public String prt_tm;
	public String std;
	public String dual_out_nm;
	public String tm_in_yn;
	public String add_prt_seq;
	public String remk;
	public String slip_qty;
	public String use_a;
	public String use_b;
	public String use_c;
	public String bf_dt;
	public String medi_cd;
	public String sect_cd;
	public String bal_wgt_a;
	public String bal_wgt_c;
	public String bal_wgt_b;
	public String bal_wgt_tot;
	public String bal_roll_a;
	public String bal_roll_c;
	public String bal_roll_b;
	public String roll_wgt_a;
	public String roll_wgt_b;
	public String roll_wgt_c;
	public String roll_cnt_a;
	public String roll_cnt_b;
	public String roll_cnt_c;
	public String bf_bal_wgt_a;
	public String bf_bal_wgt_c;
	public String bf_bal_wgt_b;
	public String row_num;
	public String wgt_a;
	public String wgt_c;
	public String wgt_b;
	public String roll_a;
	public String roll_c;
	public String roll_b;
	public String clos_clsf;
	public String dual_out_clsf;
	public String papcmpy_cd;
	public String car_cnt;
	public String car_c;
	public String car_b;
	public String ewh_roll_cnt_a;
	public String ewh_roll_cnt_b;
	public String ewh_roll_cnt_c;
	public String ewh_wgt_a;
	public String ewh_wgt_c;
	public String ewh_wgt_b;
	
	public MT_PAPORD_8002_LCURLISTRecord(){}

	
	public void setIssu_dt_day(String issu_dt_day) {
		this.issu_dt_day = issu_dt_day;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setPrt_tm(String prt_tm){
		this.prt_tm = prt_tm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setDual_out_nm(String dual_out_nm){
		this.dual_out_nm = dual_out_nm;
	}

	public void setTm_in_yn(String tm_in_yn){
		this.tm_in_yn = tm_in_yn;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}
	
	public void setSlip_qty(String slip_qty) {
		this.slip_qty = slip_qty;
	}
	
	public void setRemk(String remk){
		this.remk = remk;
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

	public void setBf_dt(String bf_dt) {
		this.bf_dt = bf_dt;
	}
	
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}

	public void setBal_roll_a(String bal_roll_a) {
		this.bal_roll_a = bal_roll_a;
	}

	public void setBal_roll_b(String bal_roll_b) {
		this.bal_roll_b = bal_roll_b;
	}

	public void setBal_roll_c(String bal_roll_c) {
		this.bal_roll_c = bal_roll_c;
	}

	public void setBal_wgt_a(String bal_wgt_a) {
		this.bal_wgt_a = bal_wgt_a;
	}

	public void setBal_wgt_b(String bal_wgt_b) {
		this.bal_wgt_b = bal_wgt_b;
	}
	
	public void setBal_wgt_c(String bal_wgt_c) {
		this.bal_wgt_c = bal_wgt_c;
	}
	
	public void setBal_wgt_tot(String bal_wgt_tot) {
		this.bal_wgt_tot = bal_wgt_tot;
	}

	public void setRoll_wgt_a(String roll_wgt_a) {
		this.roll_wgt_a = roll_wgt_a;
	}

	public void setRoll_wgt_c(String roll_wgt_c) {
		this.roll_wgt_c = roll_wgt_c;
	}

	public void setRoll_wgt_b(String roll_wgt_b) {
		this.roll_wgt_b = roll_wgt_b;
	}

	public void setRoll_cnt_a(String roll_cnt_a) {
		this.roll_cnt_a = roll_cnt_a;
	}

	public void setRoll_cnt_c(String roll_cnt_c) {
		this.roll_cnt_c = roll_cnt_c;
	}

	public void setRoll_cnt_b(String roll_cnt_b) {
		this.roll_cnt_b = roll_cnt_b;
	}

	public void setBf_bal_wgt_a(String bf_bal_wgt_a) {
		this.bf_bal_wgt_a = bf_bal_wgt_a;
	}

	public void setBf_bal_wgt_b(String bf_bal_wgt_b) {
		this.bf_bal_wgt_b = bf_bal_wgt_b;
	}

	public void setBf_bal_wgt_c(String bf_bal_wgt_c) {
		this.bf_bal_wgt_c = bf_bal_wgt_c;
	}
	
	public void setWgt_a(String wgt_a) {
		this.wgt_a = wgt_a;
	}

	public void setWgt_c(String wgt_c) {
		this.wgt_c = wgt_c;
	}
	
	public void setWgt_b(String wgt_b) {
		this.wgt_b = wgt_b;
	}
	
	public void setRoll_a(String roll_a) {
		this.roll_a = roll_a;
	}

	public void setRoll_c(String roll_c) {
		this.roll_c = roll_c;
	}
	
	public void setRoll_b(String roll_b) {
		this.roll_b = roll_b;
	}

	public void setClos_clsf(String clos_clsf) {
		this.clos_clsf = clos_clsf;
	}

	public void setRow_num(String row_num) {
		this.row_num = row_num;
	}
	
	public void setCar_b(String car_b) {
		this.car_b = car_b;
	}

	public void setCar_c(String car_c) {
		this.car_c = car_c;
	}

	public void setCar_cnt(String car_cnt) {
		this.car_cnt = car_cnt;
	}
	
	public void setEwh_roll_cnt_a(String ewh_roll_cnt_a) {
		this.ewh_roll_cnt_a = ewh_roll_cnt_a;
	}
	
	public void setEwh_roll_cnt_b(String ewh_roll_cnt_b) {
		this.ewh_roll_cnt_b = ewh_roll_cnt_b;
	}
	
	public void setEwh_roll_cnt_c(String ewh_roll_cnt_c) {
		this.ewh_roll_cnt_c = ewh_roll_cnt_c;
	}
	
	public void setEwh_wgt_a(String ewh_wgt_a) {
		this.ewh_wgt_a = ewh_wgt_a;
	}
	
	public void setEwh_wgt_b(String ewh_wgt_b) {
		this.ewh_wgt_b = ewh_wgt_b;
	}
	
	public void setEwh_wgt_c(String ewh_wgt_c) {
		this.ewh_wgt_c = ewh_wgt_c;
	}
	
	public String getIssu_dt_day() {
		return issu_dt_day;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getPrt_tm(){
		return this.prt_tm;
	}

	public String getStd(){
		return this.std;
	}

	public String getDual_out_nm(){
		return this.dual_out_nm;
	}

	public String getTm_in_yn(){
		return this.tm_in_yn;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSlip_qty() {
		return slip_qty;
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
	
	public String getBf_dt() {
		return bf_dt;
	}

	public String getMedi_cd() {
		return medi_cd;
	}

	public String getSect_cd() {
		return sect_cd;
	}

	public String getBal_wgt_c() {
		return bal_wgt_c;
	}
	
	public String getBal_wgt_b() {
		return bal_wgt_b;
	}
	
	public String getBal_wgt_a() {
		return bal_wgt_a;
	}
	
	public String getBal_roll_c() {
		return bal_roll_c;
	}
	
	public String getBal_roll_b() {
		return bal_roll_b;
	}
	
	public String getBal_roll_a() {
		return bal_roll_a;
	}

	public String getBal_wgt_tot() {
		return bal_wgt_tot;
	}

	public String getRoll_wgt_a() {
		return roll_wgt_a;
	}

	public String getRoll_wgt_c() {
		return roll_wgt_c;
	}
	
	public String getRoll_wgt_b() {
		return roll_wgt_b;
	}
	
	public String getRoll_cnt_a() {
		return roll_cnt_a;
	}

	public String getRoll_cnt_c() {
		return roll_cnt_c;
	}
	
	public String getRoll_cnt_b() {
		return roll_cnt_b;
	}

	public String getBf_bal_wgt_a() {
		return bf_bal_wgt_a;
	}

	public String getBf_bal_wgt_b() {
		return bf_bal_wgt_b;
	}

	public String getBf_bal_wgt_c() {
			return bf_bal_wgt_c;
	}

	public String getRow_num() {
		return row_num;
	}
	
	public String getWgt_a() {
		return wgt_a;
	}
	
	public String getWgt_c() {
		return wgt_c;
	}
	
	public String getWgt_b() {
		return wgt_b;
	}

	public String getRoll_a() {
		return roll_a;
	}
	
	public String getRoll_c() {
		return roll_c;
	}

	public String getRoll_b() {
		return roll_b;
	}
	
	public String getClos_clsf() {
		return clos_clsf;
	}

	public String getPapcmpy_cd() {
		return papcmpy_cd;
	}

	public String getDual_out_clsf() {
		return dual_out_clsf;
	}

	public void setDual_out_clsf(String dual_out_clsf) {
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd) {
		this.papcmpy_cd = papcmpy_cd;
	}

	public String getCar_b() {
		return car_b;
	}

	public String getCar_c() {
		return car_c;
	}

	public String getCar_cnt() {
		return car_cnt;
	}

	public String getEwh_roll_cnt_a() {
		return ewh_roll_cnt_a;
	}
	
	public String getEwh_roll_cnt_b() {
		return ewh_roll_cnt_b;
	}

	public String getEwh_roll_cnt_c() {
		return ewh_roll_cnt_c;
	}

	public String getEwh_wgt_a() {
		return ewh_wgt_a;
	}

	public String getEwh_wgt_b() {
		return ewh_wgt_b;
	}

	public String getEwh_wgt_c() {
		return ewh_wgt_c;
	}



	
}

/* 작성시간 : Tue Jun 30 19:41:59 KST 2009 */