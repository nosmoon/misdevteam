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


package chosun.ciis.hd.info.rec;

import java.sql.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.ds.*;

/**
 * 
 */


public class HD_INFO_6000_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String schir_seq;
	public String scl_clsf;
	public String scl_clsf_nm;
	public String scl_cd;
	public String scl_nm;
	public String enty_dt;
	public String grdu_dt;
	public String grdu_clsf;
	public String grdu_clsf_nm;
	public String schir_cd;
	public String schir_nm;
	public String majr_clsf_1;
	public String majr_clsf_nm_1;
	public String majr_cd_1;
	public String majr_nm_1;
	public String majr_clsf_2;
	public String majr_clsf_nm_2;
	public String majr_cd_2;
	public String majr_nm_2;
	public String majr_clsf_3;
	public String majr_clsf_nm_3;
	public String majr_cd_3;
	public String majr_nm_3;
	public String sclgg_kind_cd;
	public String sclgg_kind_nm;
	public String plcw_cd;
	public String plcw_nm;
	public String natn_cd;
	public String natn_nm;

	public HD_INFO_6000_LCURLIST2Record(){}

	public void setSchir_seq(String schir_seq){
		this.schir_seq = schir_seq;
	}

	public void setScl_clsf(String scl_clsf){
		this.scl_clsf = scl_clsf;
	}

	public void setScl_clsf_nm(String scl_clsf_nm){
		this.scl_clsf_nm = scl_clsf_nm;
	}

	public void setScl_cd(String scl_cd){
		this.scl_cd = scl_cd;
	}

	public void setScl_nm(String scl_nm){
		this.scl_nm = scl_nm;
	}

	public void setEnty_dt(String enty_dt){
		this.enty_dt = enty_dt;
	}

	public void setGrdu_dt(String grdu_dt){
		this.grdu_dt = grdu_dt;
	}

	public void setGrdu_clsf(String grdu_clsf){
		this.grdu_clsf = grdu_clsf;
	}

	public void setGrdu_clsf_nm(String grdu_clsf_nm){
		this.grdu_clsf_nm = grdu_clsf_nm;
	}

	public void setSchir_cd(String schir_cd){
		this.schir_cd = schir_cd;
	}

	public void setSchir_nm(String schir_nm){
		this.schir_nm = schir_nm;
	}

	public void setMajr_clsf_1(String majr_clsf_1){
		this.majr_clsf_1 = majr_clsf_1;
	}

	public void setMajr_clsf_nm_1(String majr_clsf_nm_1){
		this.majr_clsf_nm_1 = majr_clsf_nm_1;
	}

	public void setMajr_cd_1(String majr_cd_1){
		this.majr_cd_1 = majr_cd_1;
	}

	public void setMajr_nm_1(String majr_nm_1){
		this.majr_nm_1 = majr_nm_1;
	}

	public void setMajr_clsf_2(String majr_clsf_2){
		this.majr_clsf_2 = majr_clsf_2;
	}

	public void setMajr_clsf_nm_2(String majr_clsf_nm_2){
		this.majr_clsf_nm_2 = majr_clsf_nm_2;
	}

	public void setMajr_cd_2(String majr_cd_2){
		this.majr_cd_2 = majr_cd_2;
	}

	public void setMajr_nm_2(String majr_nm_2){
		this.majr_nm_2 = majr_nm_2;
	}

	public void setMajr_clsf_3(String majr_clsf_3){
		this.majr_clsf_3 = majr_clsf_3;
	}

	public void setMajr_clsf_nm_3(String majr_clsf_nm_3){
		this.majr_clsf_nm_3 = majr_clsf_nm_3;
	}

	public void setMajr_cd_3(String majr_cd_3){
		this.majr_cd_3 = majr_cd_3;
	}

	public void setMajr_nm_3(String majr_nm_3){
		this.majr_nm_3 = majr_nm_3;
	}

	public void setSclgg_kind_cd(String sclgg_kind_cd){
		this.sclgg_kind_cd = sclgg_kind_cd;
	}

	public void setSclgg_kind_nm(String sclgg_kind_nm){
		this.sclgg_kind_nm = sclgg_kind_nm;
	}

	public void setPlcw_cd(String plcw_cd){
		this.plcw_cd = plcw_cd;
	}

	public void setPlcw_nm(String plcw_nm){
		this.plcw_nm = plcw_nm;
	}

	public void setNatn_cd(String natn_cd){
		this.natn_cd = natn_cd;
	}

	public void setNatn_nm(String natn_nm){
		this.natn_nm = natn_nm;
	}

	public String getSchir_seq(){
		return this.schir_seq;
	}

	public String getScl_clsf(){
		return this.scl_clsf;
	}

	public String getScl_clsf_nm(){
		return this.scl_clsf_nm;
	}

	public String getScl_cd(){
		return this.scl_cd;
	}

	public String getScl_nm(){
		return this.scl_nm;
	}

	public String getEnty_dt(){
		return this.enty_dt;
	}

	public String getGrdu_dt(){
		return this.grdu_dt;
	}

	public String getGrdu_clsf(){
		return this.grdu_clsf;
	}

	public String getGrdu_clsf_nm(){
		return this.grdu_clsf_nm;
	}

	public String getSchir_cd(){
		return this.schir_cd;
	}

	public String getSchir_nm(){
		return this.schir_nm;
	}

	public String getMajr_clsf_1(){
		return this.majr_clsf_1;
	}

	public String getMajr_clsf_nm_1(){
		return this.majr_clsf_nm_1;
	}

	public String getMajr_cd_1(){
		return this.majr_cd_1;
	}

	public String getMajr_nm_1(){
		return this.majr_nm_1;
	}

	public String getMajr_clsf_2(){
		return this.majr_clsf_2;
	}

	public String getMajr_clsf_nm_2(){
		return this.majr_clsf_nm_2;
	}

	public String getMajr_cd_2(){
		return this.majr_cd_2;
	}

	public String getMajr_nm_2(){
		return this.majr_nm_2;
	}

	public String getMajr_clsf_3(){
		return this.majr_clsf_3;
	}

	public String getMajr_clsf_nm_3(){
		return this.majr_clsf_nm_3;
	}

	public String getMajr_cd_3(){
		return this.majr_cd_3;
	}

	public String getMajr_nm_3(){
		return this.majr_nm_3;
	}

	public String getSclgg_kind_cd(){
		return this.sclgg_kind_cd;
	}

	public String getSclgg_kind_nm(){
		return this.sclgg_kind_nm;
	}

	public String getPlcw_cd(){
		return this.plcw_cd;
	}

	public String getPlcw_nm(){
		return this.plcw_nm;
	}

	public String getNatn_cd(){
		return this.natn_cd;
	}

	public String getNatn_nm(){
		return this.natn_nm;
	}
}

/* 작성시간 : Thu Aug 09 16:35:29 KST 2018 */