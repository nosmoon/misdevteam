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


public class MT_ETCCAR_9101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

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
	public String drvr_yn;
	public String drvr_yn_nm;
	public String car_no;
	public String drvr_nm;
	public String tel_no;
	public String driv_pers;
	public String driv_dt_tm;
	public String cancle_pers;
	public String cancle_dt_tm;
	public String emp_no;
	public String cmpy_cd_nm;
	public String dept_nm;
	public String ptph_no;
	public String rid_tel_no;
	public String canc_caus;

	public MT_ETCCAR_9101_LCURLISTRecord(){}

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

	public void setDrvr_yn(String drvr_yn){
		this.drvr_yn = drvr_yn;
	}

	public void setDrvr_yn_nm(String drvr_yn_nm){
		this.drvr_yn_nm = drvr_yn_nm;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setDriv_pers(String driv_pers){
		this.driv_pers = driv_pers;
	}

	public void setDriv_dt_tm(String driv_dt_tm){
		this.driv_dt_tm = driv_dt_tm;
	}

	public void setCancle_pers(String cancle_pers){
		this.cancle_pers = cancle_pers;
	}

	public void setCancle_dt_tm(String cancle_dt_tm){
		this.cancle_dt_tm = cancle_dt_tm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setCmpy_cd_nm(String cmpy_cd_nm){
		this.cmpy_cd_nm = cmpy_cd_nm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setRid_tel_no(String rid_tel_no){
		this.rid_tel_no = rid_tel_no;
	}
	
	public void setCanc_caus(String canc_caus){
		this.canc_caus = canc_caus;
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

	public String getDrvr_yn(){
		return this.drvr_yn;
	}

	public String getDrvr_yn_nm(){
		return this.drvr_yn_nm;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getDriv_pers(){
		return this.driv_pers;
	}

	public String getDriv_dt_tm(){
		return this.driv_dt_tm;
	}

	public String getCancle_pers(){
		return this.cancle_pers;
	}

	public String getCancle_dt_tm(){
		return this.cancle_dt_tm;
	}
	
	public String getEmp_no(){
		return this.emp_no;
	}

	public String getCmpy_cd_nm(){
		return this.cmpy_cd_nm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getRid_tel_no(){
		return this.rid_tel_no;
	}

	public String getCanc_caus(){
		return this.canc_caus;
	}
}

/* 작성시간 : Thu Sep 20 19:08:29 KST 2012 */