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


package chosun.ciis.mt.etccar.rec;


import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_9111_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String start_dt;
	public String start_tm;
	public String ariv_dt;
	public String ariv_tm;
	public String dest;
	public String rid_pers;
	public int rid_pers_cnt;
	public String rid_deptcd;
	public String rid_deptcd_nm;
	public String driv_purp;
	public String driv_purp_nm;
	public String req_stat;
	public String req_stat_nm;
	public String incmg_pers;
	public String incmg_dt_tm;
	public String chg_pers;
	public String chg_dt_tm;
	public String remk;
	public String drvr_nm;
	public String tel_no;
	public String cmpy_mang_nm;
	public String car_no;
	public String car_modl;
	public String req_occr_dt;
	public String req_seq;
	public String drvr_yn;
	public String canc_caus;
	public String cmpy_cd_nm;
	public String emp_no;
	public String dept_nm;
	public String rid_ptphno;
	public String gubun;
	public String real_aplc_pers; 
	public String real_aplc_pers_nm;
	
	
	public void setCmpy_cd_nm(String cmpy_cd_nm) {
		this.cmpy_cd_nm = cmpy_cd_nm;
	}
	
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
		
	public void setReal_aplc_pers(String real_aplc_pers) {
		this.real_aplc_pers = real_aplc_pers;
	}
	
	public void setReal_aplc_pers_nm(String real_aplc_pers_nm) {
		this.real_aplc_pers_nm = real_aplc_pers_nm;
	}

	public String getRid_ptphno() {
		return rid_ptphno;
	}

	public void setRid_ptphno(String rid_ptphno) {
		this.rid_ptphno = rid_ptphno;
	}

	public MT_ETCCAR_9111_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setStart_tm(String start_tm){
		this.start_tm = start_tm;
	}

	public void setAriv_dt(String ariv_dt){
		this.ariv_dt = ariv_dt;
	}

	public void setAriv_tm(String ariv_tm){
		this.ariv_tm = ariv_tm;
	}

	public void setDest(String dest){
		this.dest = dest;
	}

	public void setRid_pers(String rid_pers){
		this.rid_pers = rid_pers;
	}

	public void setRid_pers_cnt(int rid_pers_cnt){
		this.rid_pers_cnt = rid_pers_cnt;
	}

	public void setRid_deptcd(String rid_deptcd){
		this.rid_deptcd = rid_deptcd;
	}

	public void setRid_deptcd_nm(String rid_deptcd_nm){
		this.rid_deptcd_nm = rid_deptcd_nm;
	}

	public void setDriv_purp(String driv_purp){
		this.driv_purp = driv_purp;
	}

	public void setDriv_purp_nm(String driv_purp_nm){
		this.driv_purp_nm = driv_purp_nm;
	}

	public void setReq_stat(String req_stat){
		this.req_stat = req_stat;
	}

	public void setReq_stat_nm(String req_stat_nm){
		this.req_stat_nm = req_stat_nm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setCar_modl(String car_modl){
		this.car_modl = car_modl;
	}
	
	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setReq_occr_dt(String req_occr_dt){
		this.req_occr_dt = req_occr_dt;
	}

	public void setReq_seq(String req_seq){
		this.req_seq = req_seq;
	}
	
	public void setDrvr_yn(String drvr_yn){
		this.drvr_yn = drvr_yn;
	}

	public void setCanc_caus(String canc_caus){
		this.canc_caus = canc_caus;
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

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getStart_tm(){
		return this.start_tm;
	}

	public String getAriv_dt(){
		return this.ariv_dt;
	}

	public String getAriv_tm(){
		return this.ariv_tm;
	}

	public String getDest(){
		return this.dest;
	}

	public String getRid_pers(){
		return this.rid_pers;
	}

	public int getRid_pers_cnt(){
		return this.rid_pers_cnt;
	}

	public String getRid_deptcd(){
		return this.rid_deptcd;
	}

	public String getRid_deptcd_nm(){
		return this.rid_deptcd_nm;
	}

	public String getDriv_purp(){
		return this.driv_purp;
	}

	public String getDriv_purp_nm(){
		return this.driv_purp_nm;
	}

	public String getReq_stat(){
		return this.req_stat;
	}

	public String getReq_stat_nm(){
		return this.req_stat_nm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getCar_modl(){
		return this.car_modl;
	}
	
	public String getCar_no(){
		return this.car_no;
	}

	public String getReq_occr_dt(){
		return this.req_occr_dt;
	}

	public String getReq_seq(){
		return this.req_seq;
	}
	
	public String getDrvr_yn(){
		return this.drvr_yn;
	}
	
	public String getCanc_caus(){
		return this.canc_caus;
	}
	
	public String getCmpy_cd_nm() {
		return cmpy_cd_nm;
	}

	public String getDept_nm() {
		return dept_nm;
	}

	
	public String getEmp_no() {
		return emp_no;
	}

	
	public String getGubun() {
		return gubun;
	}

	
	public String getReal_aplc_pers() {
		return real_aplc_pers;
	}

	public String getReal_aplc_pers_nm() {
		return real_aplc_pers_nm;
	}


	
}

/* 작성시간 : Tue Sep 04 10:24:11 KST 2012 */