/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_5002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String jg_roll_cnt_a;
	public String jg_wgt_a;
	public String jg_roll_cnt_b;
	public String jg_wgt_b;
	public String jg_roll_cnt_c;
	public String jg_wgt_c;
	public String bi_roll_cnt_a;
	public String bi_roll_wgt_a;
	public String bi_roll_cnt_b;
	public String bi_roll_wgt_b;
	public String bi_roll_cnt_c;
	public String bi_roll_wgt_c;
	public String somo_cnt_a;
	public String somo_wgt_a;
	public String somo_cnt_b;
	public String somo_wgt_b;
	public String somo_cnt_c;
	public String somo_wgt_c;
	public String ordr_roll_cnt_a;
	public String ordr_wgt_a;
	public String ordr_roll_cnt_b;
	public String ordr_wgt_b;
	public String ordr_roll_cnt_c;
	public String ordr_wgt_c;

	public MT_PAPORD_5002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setJg_roll_cnt_a(String jg_roll_cnt_a){
		this.jg_roll_cnt_a = jg_roll_cnt_a;
	}

	public void setJg_wgt_a(String jg_wgt_a){
		this.jg_wgt_a = jg_wgt_a;
	}

	public void setJg_roll_cnt_b(String jg_roll_cnt_b){
		this.jg_roll_cnt_b = jg_roll_cnt_b;
	}

	public void setJg_wgt_b(String jg_wgt_b){
		this.jg_wgt_b = jg_wgt_b;
	}

	public void setJg_roll_cnt_c(String jg_roll_cnt_c){
		this.jg_roll_cnt_c = jg_roll_cnt_c;
	}

	public void setJg_wgt_c(String jg_wgt_c){
		this.jg_wgt_c = jg_wgt_c;
	}

	public void setBi_roll_cnt_a(String bi_roll_cnt_a){
		this.bi_roll_cnt_a = bi_roll_cnt_a;
	}

	public void setBi_roll_wgt_a(String bi_roll_wgt_a){
		this.bi_roll_wgt_a = bi_roll_wgt_a;
	}

	public void setBi_roll_cnt_b(String bi_roll_cnt_b){
		this.bi_roll_cnt_b = bi_roll_cnt_b;
	}

	public void setBi_roll_wgt_b(String bi_roll_wgt_b){
		this.bi_roll_wgt_b = bi_roll_wgt_b;
	}

	public void setBi_roll_cnt_c(String bi_roll_cnt_c){
		this.bi_roll_cnt_c = bi_roll_cnt_c;
	}

	public void setBi_roll_wgt_c(String bi_roll_wgt_c){
		this.bi_roll_wgt_c = bi_roll_wgt_c;
	}

	public void setSomo_cnt_a(String somo_cnt_a){
		this.somo_cnt_a = somo_cnt_a;
	}

	public void setSomo_wgt_a(String somo_wgt_a){
		this.somo_wgt_a = somo_wgt_a;
	}

	public void setSomo_cnt_b(String somo_cnt_b){
		this.somo_cnt_b = somo_cnt_b;
	}

	public void setSomo_wgt_b(String somo_wgt_b){
		this.somo_wgt_b = somo_wgt_b;
	}

	public void setSomo_cnt_c(String somo_cnt_c){
		this.somo_cnt_c = somo_cnt_c;
	}

	public void setSomo_wgt_c(String somo_wgt_c){
		this.somo_wgt_c = somo_wgt_c;
	}

	public void setOrdr_roll_cnt_a(String ordr_roll_cnt_a){
		this.ordr_roll_cnt_a = ordr_roll_cnt_a;
	}

	public void setOrdr_wgt_a(String ordr_wgt_a){
		this.ordr_wgt_a = ordr_wgt_a;
	}

	public void setOrdr_roll_cnt_b(String ordr_roll_cnt_b){
		this.ordr_roll_cnt_b = ordr_roll_cnt_b;
	}

	public void setOrdr_wgt_b(String ordr_wgt_b){
		this.ordr_wgt_b = ordr_wgt_b;
	}

	public void setOrdr_roll_cnt_c(String ordr_roll_cnt_c){
		this.ordr_roll_cnt_c = ordr_roll_cnt_c;
	}

	public void setOrdr_wgt_c(String ordr_wgt_c){
		this.ordr_wgt_c = ordr_wgt_c;
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

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getJg_roll_cnt_a(){
		return this.jg_roll_cnt_a;
	}

	public String getJg_wgt_a(){
		return this.jg_wgt_a;
	}

	public String getJg_roll_cnt_b(){
		return this.jg_roll_cnt_b;
	}

	public String getJg_wgt_b(){
		return this.jg_wgt_b;
	}

	public String getJg_roll_cnt_c(){
		return this.jg_roll_cnt_c;
	}

	public String getJg_wgt_c(){
		return this.jg_wgt_c;
	}

	public String getBi_roll_cnt_a(){
		return this.bi_roll_cnt_a;
	}

	public String getBi_roll_wgt_a(){
		return this.bi_roll_wgt_a;
	}

	public String getBi_roll_cnt_b(){
		return this.bi_roll_cnt_b;
	}

	public String getBi_roll_wgt_b(){
		return this.bi_roll_wgt_b;
	}

	public String getBi_roll_cnt_c(){
		return this.bi_roll_cnt_c;
	}

	public String getBi_roll_wgt_c(){
		return this.bi_roll_wgt_c;
	}

	public String getSomo_cnt_a(){
		return this.somo_cnt_a;
	}

	public String getSomo_wgt_a(){
		return this.somo_wgt_a;
	}

	public String getSomo_cnt_b(){
		return this.somo_cnt_b;
	}

	public String getSomo_wgt_b(){
		return this.somo_wgt_b;
	}

	public String getSomo_cnt_c(){
		return this.somo_cnt_c;
	}

	public String getSomo_wgt_c(){
		return this.somo_wgt_c;
	}

	public String getOrdr_roll_cnt_a(){
		return this.ordr_roll_cnt_a;
	}

	public String getOrdr_wgt_a(){
		return this.ordr_wgt_a;
	}

	public String getOrdr_roll_cnt_b(){
		return this.ordr_roll_cnt_b;
	}

	public String getOrdr_wgt_b(){
		return this.ordr_wgt_b;
	}

	public String getOrdr_roll_cnt_c(){
		return this.ordr_roll_cnt_c;
	}

	public String getOrdr_wgt_c(){
		return this.ordr_wgt_c;
	}
}

/* �ۼ��ð� : Wed Jun 24 22:22:48 KST 2009 */