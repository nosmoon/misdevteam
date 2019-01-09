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


public class AD_NMD_4151_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_advt_fee;
	public String rcpm_vat;
	public String medi_cd;
	public String pubc_dt;
	public String pubc_slip_no;
	public String dlco_nm;
	public int advt_fee;
	public int vat;
	public int unrcpm_fee;
	public int unrcpm_vat;
	public String medi_nm;

	public AD_NMD_4151_LCURLISTRecord(){}

	public void setRcpm_advt_fee(String rcpm_advt_fee){
		this.rcpm_advt_fee = rcpm_advt_fee;
	}

	public void setRcpm_vat(String rcpm_vat){
		this.rcpm_vat = rcpm_vat;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(int advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(int vat){
		this.vat = vat;
	}

	public void setUnrcpm_fee(int unrcpm_fee){
		this.unrcpm_fee = unrcpm_fee;
	}

	public void setUnrcpm_vat(int unrcpm_vat){
		this.unrcpm_vat = unrcpm_vat;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public String getRcpm_advt_fee(){
		return this.rcpm_advt_fee;
	}

	public String getRcpm_vat(){
		return this.rcpm_vat;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public int getAdvt_fee(){
		return this.advt_fee;
	}

	public int getVat(){
		return this.vat;
	}

	public int getUnrcpm_fee(){
		return this.unrcpm_fee;
	}

	public int getUnrcpm_vat(){
		return this.unrcpm_vat;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}
}

/* 작성시간 : Mon Apr 07 16:53:16 KST 2014 */