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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String hlth_entr_no;
	public String cmpy_cd;
	public String emp_no;
	public String nm_korn;
	public String prn;
	public String in_cmpy_dt;
	public String burd_cnt;
	public String med_cnt;
	public String sum_insr_care;
	public String sum_insr_fee;
	public String sum_care_insr_fee;
	public String impt_stot;
	public String bet;

	public HD_INSR_1400_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setHlth_entr_no(String hlth_entr_no){
		this.hlth_entr_no = hlth_entr_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setBurd_cnt(String burd_cnt){
		this.burd_cnt = burd_cnt;
	}

	public void setMed_cnt(String med_cnt){
		this.med_cnt = med_cnt;
	}

	public void setSum_insr_care(String sum_insr_care){
		this.sum_insr_care = sum_insr_care;
	}

	public void setSum_insr_fee(String sum_insr_fee){
		this.sum_insr_fee = sum_insr_fee;
	}

	public void setSum_care_insr_fee(String sum_care_insr_fee){
		this.sum_care_insr_fee = sum_care_insr_fee;
	}

	public void setImpt_stot(String impt_stot){
		this.impt_stot = impt_stot;
	}

	public void setBet(String bet){
		this.bet = bet;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getHlth_entr_no(){
		return this.hlth_entr_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getBurd_cnt(){
		return this.burd_cnt;
	}

	public String getMed_cnt(){
		return this.med_cnt;
	}

	public String getSum_insr_care(){
		return this.sum_insr_care;
	}

	public String getSum_insr_fee(){
		return this.sum_insr_fee;
	}

	public String getSum_care_insr_fee(){
		return this.sum_care_insr_fee;
	}

	public String getImpt_stot(){
		return this.impt_stot;
	}

	public String getBet(){
		return this.bet;
	}
}

/* 작성시간 : Mon May 18 10:08:12 KST 2009 */