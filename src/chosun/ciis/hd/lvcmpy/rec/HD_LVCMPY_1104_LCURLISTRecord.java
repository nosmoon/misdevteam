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


public class HD_LVCMPY_1104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_pay_mm;
	public String saly_fr_dt;
	public String saly_to_dt;
	public String saly_cnt;
	public String pay_saly1;
	public String pay_saly2;
	public String yymm_alon1;
	public String yymm_alon2;
	public String hody_alon1;
	public String hody_alon2;

	public HD_LVCMPY_1104_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setYymm_alon1(String yymm_alon1){
		this.yymm_alon1 = yymm_alon1;
	}

	public void setYymm_alon2(String yymm_alon2){
		this.yymm_alon2 = yymm_alon2;
	}

	public void setHody_alon1(String hody_alon1){
		this.hody_alon1 = hody_alon1;
	}

	public void setHody_alon2(String hody_alon2){
		this.hody_alon2 = hody_alon2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
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

	public String getYymm_alon1(){
		return this.yymm_alon1;
	}

	public String getYymm_alon2(){
		return this.yymm_alon2;
	}

	public String getHody_alon1(){
		return this.hody_alon1;
	}

	public String getHody_alon2(){
		return this.hody_alon2;
	}
}

/* 작성시간 : Fri Nov 18 18:29:09 KST 2016 */