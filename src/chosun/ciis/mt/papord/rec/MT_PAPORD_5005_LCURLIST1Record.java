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
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_5005_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String max_ewh_wgt;
	public String std_ewh_roll_a;
	public String std_ewh_wgt_a;
	public String amss_wgt_a;
	public String std_ewh_roll_b;
	public String std_ewh_wgt_b;
	public String amss_wgt_b;
	public String std_ewh_roll_c;
	public String std_ewh_wgt_c;
	public String amss_wgt_c;
	public String roll_cnt_a;
	public String roll_cnt_b;
	public String roll_cnt_c;

	public MT_PAPORD_5005_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMax_ewh_wgt(String max_ewh_wgt){
		this.max_ewh_wgt = max_ewh_wgt;
	}

	public void setStd_ewh_roll_a(String std_ewh_roll_a){
		this.std_ewh_roll_a = std_ewh_roll_a;
	}

	public void setStd_ewh_wgt_a(String std_ewh_wgt_a){
		this.std_ewh_wgt_a = std_ewh_wgt_a;
	}

	public void setAmss_wgt_a(String amss_wgt_a){
		this.amss_wgt_a = amss_wgt_a;
	}

	public void setStd_ewh_roll_b(String std_ewh_roll_b){
		this.std_ewh_roll_b = std_ewh_roll_b;
	}

	public void setStd_ewh_wgt_b(String std_ewh_wgt_b){
		this.std_ewh_wgt_b = std_ewh_wgt_b;
	}

	public void setAmss_wgt_b(String amss_wgt_b){
		this.amss_wgt_b = amss_wgt_b;
	}

	public void setStd_ewh_roll_c(String std_ewh_roll_c){
		this.std_ewh_roll_c = std_ewh_roll_c;
	}

	public void setStd_ewh_wgt_c(String std_ewh_wgt_c){
		this.std_ewh_wgt_c = std_ewh_wgt_c;
	}

	public void setAmss_wgt_c(String amss_wgt_c){
		this.amss_wgt_c = amss_wgt_c;
	}
	
	public void setRoll_cnt_a(String roll_cnt_a){
		this.roll_cnt_a = roll_cnt_a;
	}
	
	public void setRoll_cnt_b(String roll_cnt_b){
		this.roll_cnt_b = roll_cnt_b;
	}
	
	public void setRoll_cnt_c(String roll_cnt_c){
		this.roll_cnt_c = roll_cnt_c;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMax_ewh_wgt(){
		return this.max_ewh_wgt;
	}

	public String getStd_ewh_roll_a(){
		return this.std_ewh_roll_a;
	}

	public String getStd_ewh_wgt_a(){
		return this.std_ewh_wgt_a;
	}

	public String getAmss_wgt_a(){
		return this.amss_wgt_a;
	}

	public String getStd_ewh_roll_b(){
		return this.std_ewh_roll_b;
	}

	public String getStd_ewh_wgt_b(){
		return this.std_ewh_wgt_b;
	}

	public String getAmss_wgt_b(){
		return this.amss_wgt_b;
	}

	public String getStd_ewh_roll_c(){
		return this.std_ewh_roll_c;
	}

	public String getStd_ewh_wgt_c(){
		return this.std_ewh_wgt_c;
	}

	public String getAmss_wgt_c(){
		return this.amss_wgt_c;
	}
	
	public String getRoll_cnt_a(){
		return this.roll_cnt_a;
	}
	
	public String getRoll_cnt_b(){
		return this.roll_cnt_b;
	}
	
	public String getRoll_cnt_c(){
		return this.roll_cnt_c;
	}
}

/* 작성시간 : Fri Jul 17 11:52:14 KST 2009 */