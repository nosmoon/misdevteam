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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3603_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String saly_yy;
	public String saly_no;
	public String emp_no;
	public String flnm;
	public String bsgwanm;
	public String pay_saly;
	public String yymm_alon;
	public String hody_alon;
	public String non_regu_alon_stot;
	public String etc_saly_amt1;
	public String etc_saly_amt;
	public String lvcmpy_alon;
	public String corr_base_stay_fee;
	public String bns;
	public String mm_saly;
	public String non_tax_stot;

	public HD_SALY_3603_LCURLISTRecord(){}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setBsgwanm(String bsgwanm){
		this.bsgwanm = bsgwanm;
	}

	public void setPay_saly(String pay_saly){
		this.pay_saly = pay_saly;
	}

	public void setYymm_alon(String yymm_alon){
		this.yymm_alon = yymm_alon;
	}

	public void setHody_alon(String hody_alon){
		this.hody_alon = hody_alon;
	}

	public void setNon_regu_alon_stot(String non_regu_alon_stot){
		this.non_regu_alon_stot = non_regu_alon_stot;
	}

	public void setEtc_saly_amt1(String etc_saly_amt1){
		this.etc_saly_amt1 = etc_saly_amt1;
	}

	public void setEtc_saly_amt(String etc_saly_amt){
		this.etc_saly_amt = etc_saly_amt;
	}

	public void setLvcmpy_alon(String lvcmpy_alon){
		this.lvcmpy_alon = lvcmpy_alon;
	}

	public void setCorr_base_stay_fee(String corr_base_stay_fee){
		this.corr_base_stay_fee = corr_base_stay_fee;
	}

	public void setBns(String bns){
		this.bns = bns;
	}

	public void setMm_saly(String mm_saly){
		this.mm_saly = mm_saly;
	}

	public void setNon_tax_stot(String non_tax_stot){
		this.non_tax_stot = non_tax_stot;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getBsgwanm(){
		return this.bsgwanm;
	}

	public String getPay_saly(){
		return this.pay_saly;
	}

	public String getYymm_alon(){
		return this.yymm_alon;
	}

	public String getHody_alon(){
		return this.hody_alon;
	}

	public String getNon_regu_alon_stot(){
		return this.non_regu_alon_stot;
	}

	public String getEtc_saly_amt1(){
		return this.etc_saly_amt1;
	}

	public String getEtc_saly_amt(){
		return this.etc_saly_amt;
	}

	public String getLvcmpy_alon(){
		return this.lvcmpy_alon;
	}

	public String getCorr_base_stay_fee(){
		return this.corr_base_stay_fee;
	}

	public String getBns(){
		return this.bns;
	}

	public String getMm_saly(){
		return this.mm_saly;
	}

	public String getNon_tax_stot(){
		return this.non_tax_stot;
	}
}

/* 작성시간 : Tue Sep 10 10:14:34 KST 2013 */