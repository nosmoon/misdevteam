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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_5181_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String brcd1;
	public String brnm1;
	public String brcd2;
	public String brnm2;
	public String brcd3;
	public String brnm3;
	public String medi_cd;
	public String medi_cdnm;
	public String dtls_medi_cd;
	public String dtls_medi_nm;
	public String curmm_budg_amt;
	public String curmm_cndt_amt;
	public String mon_gap;
	public String befmm_cndt_amt;
	public String mon_rate;
	public String tot_budg_amt;
	public String tot_cndt_amt;
	public String tot_gap;

	public MC_BUDG_5181_LCURLISTRecord(){}

	public void setBrcd1(String brcd1){
		this.brcd1 = brcd1;
	}

	public void setBrnm1(String brnm1){
		this.brnm1 = brnm1;
	}

	public void setBrcd2(String brcd2){
		this.brcd2 = brcd2;
	}

	public void setBrnm2(String brnm2){
		this.brnm2 = brnm2;
	}

	public void setBrcd3(String brcd3){
		this.brcd3 = brcd3;
	}

	public void setBrnm3(String brnm3){
		this.brnm3 = brnm3;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cdnm(String medi_cdnm){
		this.medi_cdnm = medi_cdnm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_nm(String dtls_medi_nm){
		this.dtls_medi_nm = dtls_medi_nm;
	}

	public void setCurmm_budg_amt(String curmm_budg_amt){
		this.curmm_budg_amt = curmm_budg_amt;
	}

	public void setCurmm_cndt_amt(String curmm_cndt_amt){
		this.curmm_cndt_amt = curmm_cndt_amt;
	}

	public void setMon_gap(String mon_gap){
		this.mon_gap = mon_gap;
	}

	public void setBefmm_cndt_amt(String befmm_cndt_amt){
		this.befmm_cndt_amt = befmm_cndt_amt;
	}

	public void setMon_rate(String mon_rate){
		this.mon_rate = mon_rate;
	}

	public void setTot_budg_amt(String tot_budg_amt){
		this.tot_budg_amt = tot_budg_amt;
	}

	public void setTot_cndt_amt(String tot_cndt_amt){
		this.tot_cndt_amt = tot_cndt_amt;
	}

	public void setTot_gap(String tot_gap){
		this.tot_gap = tot_gap;
	}

	public String getBrcd1(){
		return this.brcd1;
	}

	public String getBrnm1(){
		return this.brnm1;
	}

	public String getBrcd2(){
		return this.brcd2;
	}

	public String getBrnm2(){
		return this.brnm2;
	}

	public String getBrcd3(){
		return this.brcd3;
	}

	public String getBrnm3(){
		return this.brnm3;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cdnm(){
		return this.medi_cdnm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_nm(){
		return this.dtls_medi_nm;
	}

	public String getCurmm_budg_amt(){
		return this.curmm_budg_amt;
	}

	public String getCurmm_cndt_amt(){
		return this.curmm_cndt_amt;
	}

	public String getMon_gap(){
		return this.mon_gap;
	}

	public String getBefmm_cndt_amt(){
		return this.befmm_cndt_amt;
	}

	public String getMon_rate(){
		return this.mon_rate;
	}

	public String getTot_budg_amt(){
		return this.tot_budg_amt;
	}

	public String getTot_cndt_amt(){
		return this.tot_cndt_amt;
	}

	public String getTot_gap(){
		return this.tot_gap;
	}
}

/* �ۼ��ð� : Mon Jul 21 18:01:40 KST 2014 */