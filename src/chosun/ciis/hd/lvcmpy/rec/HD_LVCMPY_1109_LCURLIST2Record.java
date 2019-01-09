/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.lvcmpy.rec;

import java.sql.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.ds.*;

/**
 * 
 */


public class HD_LVCMPY_1109_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String lvcmpy_dt;
	public String seq;
	public String lvcmpy_clsf;
	public String saly_pay_mm;
	public String saly_fr_dt;
	public String saly_to_dt;
	public String saly_cnt;
	public String pay_saly1;
	public String pay_saly2;
	public String hody_alon1;
	public String hody_alon2;
	public String yymm_alon1;
	public String yymm_alon2;

	public HD_LVCMPY_1109_LCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLvcmpy_clsf(String lvcmpy_clsf){
		this.lvcmpy_clsf = lvcmpy_clsf;
	}

	public void setSaly_pay_mm(String saly_pay_mm){
		this.saly_pay_mm = saly_pay_mm;
	}

	public void setSaly_fr_dt(String saly_fr_dt){
		this.saly_fr_dt = saly_fr_dt;
	}

	public void setSaly_to_dt(String saly_to_dt){
		this.saly_to_dt = saly_to_dt;
	}

	public void setSaly_cnt(String saly_cnt){
		this.saly_cnt = saly_cnt;
	}

	public void setPay_saly1(String pay_saly1){
		this.pay_saly1 = pay_saly1;
	}

	public void setPay_saly2(String pay_saly2){
		this.pay_saly2 = pay_saly2;
	}

	public void setHody_alon1(String hody_alon1){
		this.hody_alon1 = hody_alon1;
	}

	public void setHody_alon2(String hody_alon2){
		this.hody_alon2 = hody_alon2;
	}

	public void setYymm_alon1(String yymm_alon1){
		this.yymm_alon1 = yymm_alon1;
	}

	public void setYymm_alon2(String yymm_alon2){
		this.yymm_alon2 = yymm_alon2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLvcmpy_clsf(){
		return this.lvcmpy_clsf;
	}

	public String getSaly_pay_mm(){
		return this.saly_pay_mm;
	}

	public String getSaly_fr_dt(){
		return this.saly_fr_dt;
	}

	public String getSaly_to_dt(){
		return this.saly_to_dt;
	}

	public String getSaly_cnt(){
		return this.saly_cnt;
	}

	public String getPay_saly1(){
		return this.pay_saly1;
	}

	public String getPay_saly2(){
		return this.pay_saly2;
	}

	public String getHody_alon1(){
		return this.hody_alon1;
	}

	public String getHody_alon2(){
		return this.hody_alon2;
	}

	public String getYymm_alon1(){
		return this.yymm_alon1;
	}

	public String getYymm_alon2(){
		return this.yymm_alon2;
	}
}

/* 작성시간 : Wed Nov 23 11:10:11 KST 2016 */