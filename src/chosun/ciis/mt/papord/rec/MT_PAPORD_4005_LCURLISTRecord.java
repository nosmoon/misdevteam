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


public class MT_PAPORD_4005_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String fac_clsf;
	public String medi_cd;
	public String sect_cd;
	public String dual_out_clsf;
	public String paper_std;
	public String dual_out_clsf_nm;
	public int pcnt;
	public int issu_qty;
	public String matr_cd_a;
	public double roll_wgt_a;
	public double wgt_a;
	public int roll_cnt_a;
	public String matr_cd_b;
	public double roll_wgt_b;
	public double wgt_b;
	public int roll_cnt_b;
	public String matr_cd_c;
	public double roll_wgt_c;
	public double wgt_c;
	public int roll_cnt_c;

	public MT_PAPORD_4005_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setDual_out_clsf(String dual_out_clsf){
		this.dual_out_clsf = dual_out_clsf;
	}

	public void setPaper_std(String paper_std){
		this.paper_std = paper_std;
	}
	
	public void setDual_out_clsf_nm(String dual_out_clsf_nm){
		this.dual_out_clsf_nm = dual_out_clsf_nm;
	}

	public void setPcnt(int pcnt){
		this.pcnt = pcnt;
	}

	public void setIssu_qty(int issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setMatr_cd_a(String matr_cd_a){
		this.matr_cd_a = matr_cd_a;
	}

	public void setRoll_wgt_a(double roll_wgt_a){
		this.roll_wgt_a = roll_wgt_a;
	}

	public void setWgt_a(double wgt_a){
		this.wgt_a = wgt_a;
	}

	public void setRoll_cnt_a(int roll_cnt_a){
		this.roll_cnt_a = roll_cnt_a;
	}

	public void setMatr_cd_b(String matr_cd_b){
		this.matr_cd_b = matr_cd_b;
	}

	public void setRoll_wgt_b(double roll_wgt_b){
		this.roll_wgt_b = roll_wgt_b;
	}

	public void setWgt_b(double wgt_b){
		this.wgt_b = wgt_b;
	}

	public void setRoll_cnt_b(int roll_cnt_b){
		this.roll_cnt_b = roll_cnt_b;
	}

	public void setMatr_cd_c(String matr_cd_c){
		this.matr_cd_c = matr_cd_c;
	}

	public void setRoll_wgt_c(double roll_wgt_c){
		this.roll_wgt_c = roll_wgt_c;
	}

	public void setWgt_c(double wgt_c){
		this.wgt_c = wgt_c;
	}

	public void setRoll_cnt_c(int roll_cnt_c){
		this.roll_cnt_c = roll_cnt_c;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getDual_out_clsf(){
		return this.dual_out_clsf;
	}

	public String getPaper_std(){
		return this.paper_std;
	}
	
	public String getDual_out_clsf_nm(){
		return this.dual_out_clsf_nm;
	}

	public int getPcnt(){
		return this.pcnt;
	}

	public int getIssu_qty(){
		return this.issu_qty;
	}

	public String getMatr_cd_a(){
		return this.matr_cd_a;
	}

	public double getRoll_wgt_a(){
		return this.roll_wgt_a;
	}

	public double getWgt_a(){
		return this.wgt_a;
	}

	public int getRoll_cnt_a(){
		return this.roll_cnt_a;
	}

	public String getMatr_cd_b(){
		return this.matr_cd_b;
	}

	public double getRoll_wgt_b(){
		return this.roll_wgt_b;
	}

	public double getWgt_b(){
		return this.wgt_b;
	}

	public int getRoll_cnt_b(){
		return this.roll_cnt_b;
	}

	public String getMatr_cd_c(){
		return this.matr_cd_c;
	}

	public double getRoll_wgt_c(){
		return this.roll_wgt_c;
	}

	public double getWgt_c(){
		return this.wgt_c;
	}

	public int getRoll_cnt_c(){
		return this.roll_cnt_c;
	}
}

/* 작성시간 : Mon Jul 13 11:33:44 KST 2009 */