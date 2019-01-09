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


public class MT_PAPORD_5002_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String papcmpy_cd;
	public String papcmpy_nm;
	public String p_ratio;
	public String issu_dt;
	public String ord;
	public String roll_wgt_a;
	public String roll_wgt_b;
	public String roll_wgt_c;
	public String matr_cd_a;
	public String matr_cd_b;
	public String matr_cd_c;
	public String wgt_a;
	public String wgt_b;
	public String wgt_c;
	public String roll_a;
	public String roll_b;
	public String roll_c;
	public String car_a;
	public String car_b;
	public String car_c;
	public String roll_car_a;
	public String roll_car_b;
	public String roll_car_c;

	public MT_PAPORD_5002_LCURLIST2Record(){}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setP_ratio(String p_ratio){
		this.p_ratio = p_ratio;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setOrd(String ord){
		this.ord = ord;
	}

	public void setRoll_wgt_a(String roll_wgt_a){
		this.roll_wgt_a = roll_wgt_a;
	}

	public void setRoll_wgt_b(String roll_wgt_b){
		this.roll_wgt_b = roll_wgt_b;
	}

	public void setRoll_wgt_c(String roll_wgt_c){
		this.roll_wgt_c = roll_wgt_c;
	}

	public void setMatr_cd_a(String matr_cd_a){
		this.matr_cd_a = matr_cd_a;
	}
	
	public void setMatr_cd_b(String matr_cd_b){
		this.matr_cd_b = matr_cd_b;
	}
	
	public void setMatr_cd_c(String matr_cd_c){
		this.matr_cd_c = matr_cd_c;
	}
	
	public void setWgt_a(String wgt_a){
		this.wgt_a = wgt_a;
	}

	public void setWgt_b(String wgt_b){
		this.wgt_b = wgt_b;
	}

	public void setWgt_c(String wgt_c){
		this.wgt_c = wgt_c;
	}

	public void setRoll_a(String roll_a){
		this.roll_a = roll_a;
	}

	public void setRoll_b(String roll_b){
		this.roll_b = roll_b;
	}

	public void setRoll_c(String roll_c){
		this.roll_c = roll_c;
	}

	public void setCar_a(String car_a){
		this.car_a = car_a;
	}

	public void setCar_b(String car_b){
		this.car_b = car_b;
	}

	public void setCar_c(String car_c){
		this.car_c = car_c;
	}

	public void setRoll_car_a(String roll_car_a){
		this.roll_car_a = roll_car_a;
	}
	
	public void setRoll_car_b(String roll_car_b){
		this.roll_car_b = roll_car_b;
	}
	
	public void setRoll_car_c(String roll_car_c){
		this.roll_car_c = roll_car_c;
	}
	
	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public String getP_ratio(){
		return this.p_ratio;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getOrd(){
		return this.ord;
	}

	public String getRoll_wgt_a(){
		return this.roll_wgt_a;
	}

	public String getRoll_wgt_b(){
		return this.roll_wgt_b;
	}

	public String getRoll_wgt_c(){
		return this.roll_wgt_c;
	}

	public String getMatr_cd_a(){
		return this.matr_cd_a;
	}
	
	public String getMatr_cd_b(){
		return this.matr_cd_b;
	}
	
	public String getMatr_cd_c(){
		return this.matr_cd_c;
	}
	
	public String getWgt_a(){
		return this.wgt_a;
	}

	public String getWgt_b(){
		return this.wgt_b;
	}

	public String getWgt_c(){
		return this.wgt_c;
	}

	public String getRoll_a(){
		return this.roll_a;
	}

	public String getRoll_b(){
		return this.roll_b;
	}

	public String getRoll_c(){
		return this.roll_c;
	}

	public String getCar_a(){
		return this.car_a;
	}

	public String getCar_b(){
		return this.car_b;
	}

	public String getCar_c(){
		return this.car_c;
	}
	
	public String getRoll_car_a(){
		return this.roll_car_a;
	}

	public String getRoll_car_b(){
		return this.roll_car_b;
	}

	public String getRoll_car_c(){
		return this.roll_car_c;
	}
}

/* 작성시간 : Sat Nov 14 02:19:12 KST 2009 */