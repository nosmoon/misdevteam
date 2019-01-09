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


public class MT_PAPORD_5003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String papcmpy_cd;
	public String papcmpy_nm;
	public String matr_cd_a;
	public String roll_wgt_a;
	public String somo_cnt_a;
	public String somo_wgt_a;
	public String ordr_roll_cnt_a;
	public String ordr_wgt_a;
	public String car_kind_a;
	public String seq_a;
	public String occr_dt_a;
	public String car_prd_cnt_a;
	public String mix_roll_a;
	public String mix_wgt_a;
	public String matr_cd_b;
	public String roll_wgt_b;
	public String somo_cnt_b;
	public String somo_wgt_b;
	public String ordr_roll_cnt_b;
	public String ordr_wgt_b;
	public String car_kind_b;
	public String seq_b;
	public String occr_dt_b;
	public String car_prd_cnt_b;
	public String mix_roll_b;
	public String mix_wgt_b;
	public String matr_cd_c;
	public String roll_wgt_c;
	public String somo_cnt_c;
	public String somo_wgt_c;
	public String ordr_roll_cnt_c;
	public String ordr_wgt_c;
	public String car_kind_c;
	public String seq_c;
	public String occr_dt_c;
	public String car_prd_cnt_c;
	public String mix_roll_c;
	public String mix_wgt_c;

	public MT_PAPORD_5003_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setMatr_cd_a(String matr_cd_a){
		this.matr_cd_a = matr_cd_a;
	}

	public void setRoll_wgt_a(String roll_wgt_a){
		this.roll_wgt_a = roll_wgt_a;
	}

	public void setSomo_cnt_a(String somo_cnt_a){
		this.somo_cnt_a = somo_cnt_a;
	}

	public void setSomo_wgt_a(String somo_wgt_a){
		this.somo_wgt_a = somo_wgt_a;
	}

	public void setOrdr_roll_cnt_a(String ordr_roll_cnt_a){
		this.ordr_roll_cnt_a = ordr_roll_cnt_a;
	}

	public void setOrdr_wgt_a(String ordr_wgt_a){
		this.ordr_wgt_a = ordr_wgt_a;
	}

	public void setCar_kind_a(String car_kind_a){
		this.car_kind_a = car_kind_a;
	}

	public void setSeq_a(String seq_a){
		this.seq_a = seq_a;
	}

	public void setOccr_dt_a(String occr_dt_a){
		this.occr_dt_a = occr_dt_a;
	}

	public void setCar_prd_cnt_a(String car_prd_cnt_a){
		this.car_prd_cnt_a = car_prd_cnt_a;
	}

	public void setMix_roll_a(String mix_roll_a){
		this.mix_roll_a = mix_roll_a;
	}

	public void setMix_wgt_a(String mix_wgt_a){
		this.mix_wgt_a = mix_wgt_a;
	}

	public void setMatr_cd_b(String matr_cd_b){
		this.matr_cd_b = matr_cd_b;
	}

	public void setRoll_wgt_b(String roll_wgt_b){
		this.roll_wgt_b = roll_wgt_b;
	}

	public void setSomo_cnt_b(String somo_cnt_b){
		this.somo_cnt_b = somo_cnt_b;
	}

	public void setSomo_wgt_b(String somo_wgt_b){
		this.somo_wgt_b = somo_wgt_b;
	}

	public void setOrdr_roll_cnt_b(String ordr_roll_cnt_b){
		this.ordr_roll_cnt_b = ordr_roll_cnt_b;
	}

	public void setOrdr_wgt_b(String ordr_wgt_b){
		this.ordr_wgt_b = ordr_wgt_b;
	}

	public void setCar_kind_b(String car_kind_b){
		this.car_kind_b = car_kind_b;
	}

	public void setSeq_b(String seq_b){
		this.seq_b = seq_b;
	}

	public void setOccr_dt_b(String occr_dt_b){
		this.occr_dt_b = occr_dt_b;
	}

	public void setCar_prd_cnt_b(String car_prd_cnt_b){
		this.car_prd_cnt_b = car_prd_cnt_b;
	}

	public void setMix_roll_b(String mix_roll_b){
		this.mix_roll_b = mix_roll_b;
	}

	public void setMix_wgt_b(String mix_wgt_b){
		this.mix_wgt_b = mix_wgt_b;
	}

	public void setMatr_cd_c(String matr_cd_c){
		this.matr_cd_c = matr_cd_c;
	}

	public void setRoll_wgt_c(String roll_wgt_c){
		this.roll_wgt_c = roll_wgt_c;
	}

	public void setSomo_cnt_c(String somo_cnt_c){
		this.somo_cnt_c = somo_cnt_c;
	}

	public void setSomo_wgt_c(String somo_wgt_c){
		this.somo_wgt_c = somo_wgt_c;
	}

	public void setOrdr_roll_cnt_c(String ordr_roll_cnt_c){
		this.ordr_roll_cnt_c = ordr_roll_cnt_c;
	}

	public void setOrdr_wgt_c(String ordr_wgt_c){
		this.ordr_wgt_c = ordr_wgt_c;
	}

	public void setCar_kind_c(String car_kind_c){
		this.car_kind_c = car_kind_c;
	}

	public void setSeq_c(String seq_c){
		this.seq_c = seq_c;
	}

	public void setOccr_dt_c(String occr_dt_c){
		this.occr_dt_c = occr_dt_c;
	}

	public void setCar_prd_cnt_c(String car_prd_cnt_c){
		this.car_prd_cnt_c = car_prd_cnt_c;
	}

	public void setMix_roll_c(String mix_roll_c){
		this.mix_roll_c = mix_roll_c;
	}

	public void setMix_wgt_c(String mix_wgt_c){
		this.mix_wgt_c = mix_wgt_c;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public String getMatr_cd_a(){
		return this.matr_cd_a;
	}

	public String getRoll_wgt_a(){
		return this.roll_wgt_a;
	}

	public String getSomo_cnt_a(){
		return this.somo_cnt_a;
	}

	public String getSomo_wgt_a(){
		return this.somo_wgt_a;
	}

	public String getOrdr_roll_cnt_a(){
		return this.ordr_roll_cnt_a;
	}

	public String getOrdr_wgt_a(){
		return this.ordr_wgt_a;
	}

	public String getCar_kind_a(){
		return this.car_kind_a;
	}

	public String getSeq_a(){
		return this.seq_a;
	}

	public String getOccr_dt_a(){
		return this.occr_dt_a;
	}

	public String getCar_prd_cnt_a(){
		return this.car_prd_cnt_a;
	}

	public String getMix_roll_a(){
		return this.mix_roll_a;
	}

	public String getMix_wgt_a(){
		return this.mix_wgt_a;
	}

	public String getMatr_cd_b(){
		return this.matr_cd_b;
	}

	public String getRoll_wgt_b(){
		return this.roll_wgt_b;
	}

	public String getSomo_cnt_b(){
		return this.somo_cnt_b;
	}

	public String getSomo_wgt_b(){
		return this.somo_wgt_b;
	}

	public String getOrdr_roll_cnt_b(){
		return this.ordr_roll_cnt_b;
	}

	public String getOrdr_wgt_b(){
		return this.ordr_wgt_b;
	}

	public String getCar_kind_b(){
		return this.car_kind_b;
	}

	public String getSeq_b(){
		return this.seq_b;
	}

	public String getOccr_dt_b(){
		return this.occr_dt_b;
	}

	public String getCar_prd_cnt_b(){
		return this.car_prd_cnt_b;
	}

	public String getMix_roll_b(){
		return this.mix_roll_b;
	}

	public String getMix_wgt_b(){
		return this.mix_wgt_b;
	}

	public String getMatr_cd_c(){
		return this.matr_cd_c;
	}

	public String getRoll_wgt_c(){
		return this.roll_wgt_c;
	}

	public String getSomo_cnt_c(){
		return this.somo_cnt_c;
	}

	public String getSomo_wgt_c(){
		return this.somo_wgt_c;
	}

	public String getOrdr_roll_cnt_c(){
		return this.ordr_roll_cnt_c;
	}

	public String getOrdr_wgt_c(){
		return this.ordr_wgt_c;
	}

	public String getCar_kind_c(){
		return this.car_kind_c;
	}

	public String getSeq_c(){
		return this.seq_c;
	}

	public String getOccr_dt_c(){
		return this.occr_dt_c;
	}

	public String getCar_prd_cnt_c(){
		return this.car_prd_cnt_c;
	}

	public String getMix_roll_c(){
		return this.mix_roll_c;
	}

	public String getMix_wgt_c(){
		return this.mix_wgt_c;
	}
}

/* 작성시간 : Sun Jul 12 18:43:00 KST 2009 */