/***************************************************************************************************
* 파일명 : SE_MO_SAL_2320_LCURLISTRecord.java
* 기능 : 매출관리-출장전자료조회-지대청구 / 모바일) 지대마감 - 지대청구
* 작성일자 : 2017-03-01
* 작성자 : 장선희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 *
 */


public class SE_MO_SAL_2320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String bo_head_nm;
	public String area_cd;
	public String net_sale_amt;
	public String app_gurt;
	public String net_sale_amt_610;
	public String smt_amt1;
	public String compen_divn_amt;
	public String tax_compen_divn_amt;
	public String vat_compen_divn_amt;
	public String smt_amt2;
	public String smt;
	public String sub_amt;
	public String pdlv_altn_amt;

	public SE_MO_SAL_2320_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setNet_sale_amt(String net_sale_amt){
		this.net_sale_amt = net_sale_amt;
	}

	public void setApp_gurt(String app_gurt){
		this.app_gurt = app_gurt;
	}

	public void setNet_sale_amt_610(String net_sale_amt_610){
		this.net_sale_amt_610 = net_sale_amt_610;
	}

	public void setSmt_amt1(String smt_amt1){
		this.smt_amt1 = smt_amt1;
	}

	public void setCompen_divn_amt(String compen_divn_amt){
		this.compen_divn_amt = compen_divn_amt;
	}

	public void setTax_compen_divn_amt(String tax_compen_divn_amt){
		this.tax_compen_divn_amt = tax_compen_divn_amt;
	}

	public void setVat_compen_divn_amt(String vat_compen_divn_amt){
		this.vat_compen_divn_amt = vat_compen_divn_amt;
	}

	public void setSmt_amt2(String smt_amt2){
		this.smt_amt2 = smt_amt2;
	}

	public void setSmt(String smt){
		this.smt = smt;
	}

	public void setSub_amt(String sub_amt){
		this.sub_amt = sub_amt;
	}

	public void setPdlv_altn_amt(String pdlv_altn_amt){
		this.pdlv_altn_amt = pdlv_altn_amt;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getNet_sale_amt(){
		return this.net_sale_amt;
	}

	public String getApp_gurt(){
		return this.app_gurt;
	}

	public String getNet_sale_amt_610(){
		return this.net_sale_amt_610;
	}

	public String getSmt_amt1(){
		return this.smt_amt1;
	}

	public String getCompen_divn_amt(){
		return this.compen_divn_amt;
	}

	public String getTax_compen_divn_amt(){
		return this.tax_compen_divn_amt;
	}

	public String getVat_compen_divn_amt(){
		return this.vat_compen_divn_amt;
	}

	public String getSmt_amt2(){
		return this.smt_amt2;
	}

	public String getSmt(){
		return this.smt;
	}

	public String getSub_amt(){
		return this.sub_amt;
	}

	public String getPdlv_altn_amt(){
		return this.pdlv_altn_amt;
	}
}

/* 작성시간 : Fri Mar 24 19:52:35 KST 2017 */