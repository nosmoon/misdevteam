/***************************************************************************************************
* 파일명   : SP_AD_BAS_3420_L.java
* 기능     : 목표관리(출판) 조회(담당별)
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.bas.rec;


/**
 * 기초자료관리-목표관리(출판) 조회(담당별)
 */


public class AD_BAS_3420_LTRGTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String trgt_clsf;
	public String trgt_obj;
	public String trgt_yymm;
	public String slcrg_pers_nm;
	public String trgt_amt_pre;
	public String pubc_tot_amt_pre;
	public String achi_rate_pre;
	public String trgt_amt;
	public String pubc_tot_amt;
	public String achi_rate;
	public String trgt_amt_sum;
	public String pubc_tot_amt_sum;
	public String achi_rate_sum;

	public AD_BAS_3420_LTRGTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTrgt_clsf(String trgt_clsf){
		this.trgt_clsf = trgt_clsf;
	}

	public void setTrgt_obj(String trgt_obj){
		this.trgt_obj = trgt_obj;
	}

	public void setTrgt_yymm(String trgt_yymm){
		this.trgt_yymm = trgt_yymm;
	}

	public void setSlcrg_pers_nm(String slcrg_pers_nm){
		this.slcrg_pers_nm = slcrg_pers_nm;
	}

	public void setTrgt_amt_pre(String trgt_amt_pre){
		this.trgt_amt_pre = trgt_amt_pre;
	}

	public void setPubc_tot_amt_pre(String pubc_tot_amt_pre){
		this.pubc_tot_amt_pre = pubc_tot_amt_pre;
	}

	public void setAchi_rate_pre(String achi_rate_pre){
		this.achi_rate_pre = achi_rate_pre;
	}

	public void setTrgt_amt(String trgt_amt){
		this.trgt_amt = trgt_amt;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setAchi_rate(String achi_rate){
		this.achi_rate = achi_rate;
	}

	public void setTrgt_amt_sum(String trgt_amt_sum){
		this.trgt_amt_sum = trgt_amt_sum;
	}

	public void setPubc_tot_amt_sum(String pubc_tot_amt_sum){
		this.pubc_tot_amt_sum = pubc_tot_amt_sum;
	}

	public void setAchi_rate_sum(String achi_rate_sum){
		this.achi_rate_sum = achi_rate_sum;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTrgt_clsf(){
		return this.trgt_clsf;
	}

	public String getTrgt_obj(){
		return this.trgt_obj;
	}

	public String getTrgt_yymm(){
		return this.trgt_yymm;
	}

	public String getSlcrg_pers_nm(){
		return this.slcrg_pers_nm;
	}

	public String getTrgt_amt_pre(){
		return this.trgt_amt_pre;
	}

	public String getPubc_tot_amt_pre(){
		return this.pubc_tot_amt_pre;
	}

	public String getAchi_rate_pre(){
		return this.achi_rate_pre;
	}

	public String getTrgt_amt(){
		return this.trgt_amt;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getAchi_rate(){
		return this.achi_rate;
	}

	public String getTrgt_amt_sum(){
		return this.trgt_amt_sum;
	}

	public String getPubc_tot_amt_sum(){
		return this.pubc_tot_amt_sum;
	}

	public String getAchi_rate_sum(){
		return this.achi_rate_sum;
	}
}

/* 작성시간 : Wed Mar 25 14:37:36 KST 2009 */