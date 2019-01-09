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


package chosun.ciis.ad.nmd.rec;

import java.sql.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */


public class AD_NMD_1020_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnt;
	public String suply_amt;
	public String suply_amt_g;
	public String vat_amt;
	public String p_suply_amt;
	public String p_suply_amt_g;
	public String p_vat_amt;
	public String w_suply_amt;
	public String w_suply_amt_g;
	public String w_vat_amt;
	public String sum_suply_amt;
	public String sum_suply_amt_g;
	public String sum_vat_amt;
	public String slip_occr_dt;
	public String slip_seq_l;

	public AD_NMD_1020_LCURLISTRecord(){}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setSuply_amt_g(String suply_amt_g){
		this.suply_amt_g = suply_amt_g;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setP_suply_amt(String p_suply_amt){
		this.p_suply_amt = p_suply_amt;
	}

	public void setP_suply_amt_g(String p_suply_amt_g){
		this.p_suply_amt_g = p_suply_amt_g;
	}

	public void setP_vat_amt(String p_vat_amt){
		this.p_vat_amt = p_vat_amt;
	}

	public void setW_suply_amt(String w_suply_amt){
		this.w_suply_amt = w_suply_amt;
	}

	public void setW_suply_amt_g(String w_suply_amt_g){
		this.w_suply_amt_g = w_suply_amt_g;
	}

	public void setW_vat_amt(String w_vat_amt){
		this.w_vat_amt = w_vat_amt;
	}

	public void setSum_suply_amt(String sum_suply_amt){
		this.sum_suply_amt = sum_suply_amt;
	}

	public void setSum_suply_amt_g(String sum_suply_amt_g){
		this.sum_suply_amt_g = sum_suply_amt_g;
	}

	public void setSum_vat_amt(String sum_vat_amt){
		this.sum_vat_amt = sum_vat_amt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq_l(String slip_seq_l){
		this.slip_seq_l = slip_seq_l;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getSuply_amt_g(){
		return this.suply_amt_g;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getP_suply_amt(){
		return this.p_suply_amt;
	}

	public String getP_suply_amt_g(){
		return this.p_suply_amt_g;
	}

	public String getP_vat_amt(){
		return this.p_vat_amt;
	}

	public String getW_suply_amt(){
		return this.w_suply_amt;
	}

	public String getW_suply_amt_g(){
		return this.w_suply_amt_g;
	}

	public String getW_vat_amt(){
		return this.w_vat_amt;
	}

	public String getSum_suply_amt(){
		return this.sum_suply_amt;
	}

	public String getSum_suply_amt_g(){
		return this.sum_suply_amt_g;
	}

	public String getSum_vat_amt(){
		return this.sum_vat_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq_l(){
		return this.slip_seq_l;
	}
}

/* 작성시간 : Thu Jul 26 17:16:36 KST 2012 */