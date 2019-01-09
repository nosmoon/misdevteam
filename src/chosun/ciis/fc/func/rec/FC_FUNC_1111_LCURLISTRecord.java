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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1111_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String note_amt;
	public String mtry_dt;
	public String issu_pers_nm;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_no;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dhon_resn_cd;
	public String slip_occr_dt2;
	public String slip_clsf_cd2;
	public String slip_seq2;
	public String slip_no2;
	public String dlco_clsf_cd2;
	public String dlco_cd2;
	public String stat_dt;
	public String dhon_occr_dt;
	public String pch_amt1;
	public String pch_amt2;
	public String pch_amt3;
	public String pch_amt4;
	public String pch_compgbnm;
	public String pch_compnm;
	public String pch_bankgbnm;
	public String pch_banknm;
	public String dhon_resn_nm;
	public String pch_amt5;
	public String pch_amt6;

	public FC_FUNC_1111_LCURLISTRecord(){}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDhon_resn_cd(String dhon_resn_cd){
		this.dhon_resn_cd = dhon_resn_cd;
	}

	public void setSlip_occr_dt2(String slip_occr_dt2){
		this.slip_occr_dt2 = slip_occr_dt2;
	}

	public void setSlip_clsf_cd2(String slip_clsf_cd2){
		this.slip_clsf_cd2 = slip_clsf_cd2;
	}

	public void setSlip_seq2(String slip_seq2){
		this.slip_seq2 = slip_seq2;
	}

	public void setSlip_no2(String slip_no2){
		this.slip_no2 = slip_no2;
	}

	public void setDlco_clsf_cd2(String dlco_clsf_cd2){
		this.dlco_clsf_cd2 = dlco_clsf_cd2;
	}

	public void setDlco_cd2(String dlco_cd2){
		this.dlco_cd2 = dlco_cd2;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setDhon_occr_dt(String dhon_occr_dt){
		this.dhon_occr_dt = dhon_occr_dt;
	}

	public void setPch_amt1(String pch_amt1){
		this.pch_amt1 = pch_amt1;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
	}

	public void setPch_amt3(String pch_amt3){
		this.pch_amt3 = pch_amt3;
	}

	public void setPch_amt4(String pch_amt4){
		this.pch_amt4 = pch_amt4;
	}

	public void setPch_compgbnm(String pch_compgbnm){
		this.pch_compgbnm = pch_compgbnm;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setPch_bankgbnm(String pch_bankgbnm){
		this.pch_bankgbnm = pch_bankgbnm;
	}

	public void setPch_banknm(String pch_banknm){
		this.pch_banknm = pch_banknm;
	}

	public void setDhon_resn_nm(String dhon_resn_nm){
		this.dhon_resn_nm = dhon_resn_nm;
	}

	public void setPch_amt5(String pch_amt5){
		this.pch_amt5 = pch_amt5;
	}

	public void setPch_amt6(String pch_amt6){
		this.pch_amt6 = pch_amt6;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDhon_resn_cd(){
		return this.dhon_resn_cd;
	}

	public String getSlip_occr_dt2(){
		return this.slip_occr_dt2;
	}

	public String getSlip_clsf_cd2(){
		return this.slip_clsf_cd2;
	}

	public String getSlip_seq2(){
		return this.slip_seq2;
	}

	public String getSlip_no2(){
		return this.slip_no2;
	}

	public String getDlco_clsf_cd2(){
		return this.dlco_clsf_cd2;
	}

	public String getDlco_cd2(){
		return this.dlco_cd2;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getDhon_occr_dt(){
		return this.dhon_occr_dt;
	}

	public String getPch_amt1(){
		return this.pch_amt1;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
	}

	public String getPch_amt3(){
		return this.pch_amt3;
	}

	public String getPch_amt4(){
		return this.pch_amt4;
	}

	public String getPch_compgbnm(){
		return this.pch_compgbnm;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getPch_bankgbnm(){
		return this.pch_bankgbnm;
	}

	public String getPch_banknm(){
		return this.pch_banknm;
	}

	public String getDhon_resn_nm(){
		return this.dhon_resn_nm;
	}

	public String getPch_amt5(){
		return this.pch_amt5;
	}

	public String getPch_amt6(){
		return this.pch_amt6;
	}
}

/* 작성시간 : Fri Feb 27 13:33:35 KST 2009 */