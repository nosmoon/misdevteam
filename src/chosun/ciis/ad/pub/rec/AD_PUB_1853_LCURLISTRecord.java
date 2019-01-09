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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_1853_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sale_issu_yn;
	public String pubc_ym;
	public String dlco_nm;
	public String sum_advt;
	public String sum_vat;
	public String cnt;
	public String rslt_dept;
	public String agn_nm;
	public String sum_fee;
	public String sum_fee_vat;
	public String misu_tot_amt;
	public String clsf;

	public AD_PUB_1853_LCURLISTRecord(){}

	public void setSale_issu_yn(String sale_issu_yn){
		this.sale_issu_yn = sale_issu_yn;
	}

	public void setPubc_ym(String pubc_ym){
		this.pubc_ym = pubc_ym;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSum_advt(String sum_advt){
		this.sum_advt = sum_advt;
	}

	public void setSum_vat(String sum_vat){
		this.sum_vat = sum_vat;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setRslt_dept(String rslt_dept){
		this.rslt_dept = rslt_dept;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setSum_fee(String sum_fee){
		this.sum_fee = sum_fee;
	}

	public void setSum_fee_vat(String sum_fee_vat){
		this.sum_fee_vat = sum_fee_vat;
	}

	public void setMisu_tot_amt(String misu_tot_amt){
		this.misu_tot_amt = misu_tot_amt;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public String getSale_issu_yn(){
		return this.sale_issu_yn;
	}

	public String getPubc_ym(){
		return this.pubc_ym;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSum_advt(){
		return this.sum_advt;
	}

	public String getSum_vat(){
		return this.sum_vat;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getRslt_dept(){
		return this.rslt_dept;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getSum_fee(){
		return this.sum_fee;
	}

	public String getSum_fee_vat(){
		return this.sum_fee_vat;
	}

	public String getMisu_tot_amt(){
		return this.misu_tot_amt;
	}

	public String getClsf(){
		return this.clsf;
	}
}

/* 작성시간 : Tue Feb 03 14:39:53 KST 2015 */