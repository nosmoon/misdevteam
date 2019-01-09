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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String area_cd;
	public String bo_nm;
	public String bo_head_nm;
	public String bo_addr;
	public String cntr_stat_clsf;
	public String dlco_no;
	public String ern;
	public String a_bo_seq;
	public String a_area_cd;
	public String a_bo_nm;
	public String a_bo_head_nm;
	public String a_bo_addr;
	public String a_cntr_stat_clsf;
	public String a_dlco_no;
	public String a_ern;
	public String a_chg_dt_tm;
	public String s_bo_seq;
	public String s_area_cd;
	public String s_bo_nm;
	public String s_bo_head_nm;
	public String s_bo_addr;
	public String s_cntr_stat_clsf;
	public String s_dlco_no;
	public String s_ern;

	public IS_BAS_1610_LCURLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public void setCntr_stat_clsf(String cntr_stat_clsf){
		this.cntr_stat_clsf = cntr_stat_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setA_bo_seq(String a_bo_seq){
		this.a_bo_seq = a_bo_seq;
	}

	public void setA_area_cd(String a_area_cd){
		this.a_area_cd = a_area_cd;
	}

	public void setA_bo_nm(String a_bo_nm){
		this.a_bo_nm = a_bo_nm;
	}

	public void setA_bo_head_nm(String a_bo_head_nm){
		this.a_bo_head_nm = a_bo_head_nm;
	}

	public void setA_bo_addr(String a_bo_addr){
		this.a_bo_addr = a_bo_addr;
	}

	public void setA_cntr_stat_clsf(String a_cntr_stat_clsf){
		this.a_cntr_stat_clsf = a_cntr_stat_clsf;
	}

	public void setA_dlco_no(String a_dlco_no){
		this.a_dlco_no = a_dlco_no;
	}

	public void setA_ern(String a_ern){
		this.a_ern = a_ern;
	}

	public void setA_chg_dt_tm(String a_chg_dt_tm){
		this.a_chg_dt_tm = a_chg_dt_tm;
	}

	public void setS_bo_seq(String s_bo_seq){
		this.s_bo_seq = s_bo_seq;
	}

	public void setS_area_cd(String s_area_cd){
		this.s_area_cd = s_area_cd;
	}

	public void setS_bo_nm(String s_bo_nm){
		this.s_bo_nm = s_bo_nm;
	}

	public void setS_bo_head_nm(String s_bo_head_nm){
		this.s_bo_head_nm = s_bo_head_nm;
	}

	public void setS_bo_addr(String s_bo_addr){
		this.s_bo_addr = s_bo_addr;
	}

	public void setS_cntr_stat_clsf(String s_cntr_stat_clsf){
		this.s_cntr_stat_clsf = s_cntr_stat_clsf;
	}

	public void setS_dlco_no(String s_dlco_no){
		this.s_dlco_no = s_dlco_no;
	}

	public void setS_ern(String s_ern){
		this.s_ern = s_ern;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public String getCntr_stat_clsf(){
		return this.cntr_stat_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getA_bo_seq(){
		return this.a_bo_seq;
	}

	public String getA_area_cd(){
		return this.a_area_cd;
	}

	public String getA_bo_nm(){
		return this.a_bo_nm;
	}

	public String getA_bo_head_nm(){
		return this.a_bo_head_nm;
	}

	public String getA_bo_addr(){
		return this.a_bo_addr;
	}

	public String getA_cntr_stat_clsf(){
		return this.a_cntr_stat_clsf;
	}

	public String getA_dlco_no(){
		return this.a_dlco_no;
	}

	public String getA_ern(){
		return this.a_ern;
	}

	public String getA_chg_dt_tm(){
		return this.a_chg_dt_tm;
	}

	public String getS_bo_seq(){
		return this.s_bo_seq;
	}

	public String getS_area_cd(){
		return this.s_area_cd;
	}

	public String getS_bo_nm(){
		return this.s_bo_nm;
	}

	public String getS_bo_head_nm(){
		return this.s_bo_head_nm;
	}

	public String getS_bo_addr(){
		return this.s_bo_addr;
	}

	public String getS_cntr_stat_clsf(){
		return this.s_cntr_stat_clsf;
	}

	public String getS_dlco_no(){
		return this.s_dlco_no;
	}

	public String getS_ern(){
		return this.s_ern;
	}
}

/* 작성시간 : Thu Apr 26 18:10:46 KST 2012 */