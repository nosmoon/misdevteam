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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_3310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String presi_nm;
	public String ern;
	public String addr;
	public String tel_no;
	public String email;
	public String bizcond;
	public String item;
	public String advt_fee;
	public String mortg_clsf;
	public String mortg_amt;
	public String cntr_prd_frdt;
	public String cntr_prd_todt;
	public String slcrg_nm;
	public String mchrg_nm;

	public AD_BAS_3310_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setMortg_clsf(String mortg_clsf){
		this.mortg_clsf = mortg_clsf;
	}

	public void setMortg_amt(String mortg_amt){
		this.mortg_amt = mortg_amt;
	}

	public void setCntr_prd_frdt(String cntr_prd_frdt){
		this.cntr_prd_frdt = cntr_prd_frdt;
	}

	public void setCntr_prd_todt(String cntr_prd_todt){
		this.cntr_prd_todt = cntr_prd_todt;
	}

	public void setSlcrg_nm(String slcrg_nm){
		this.slcrg_nm = slcrg_nm;
	}

	public void setMchrg_nm(String mchrg_nm){
		this.mchrg_nm = mchrg_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getMortg_clsf(){
		return this.mortg_clsf;
	}

	public String getMortg_amt(){
		return this.mortg_amt;
	}

	public String getCntr_prd_frdt(){
		return this.cntr_prd_frdt;
	}

	public String getCntr_prd_todt(){
		return this.cntr_prd_todt;
	}

	public String getSlcrg_nm(){
		return this.slcrg_nm;
	}

	public String getMchrg_nm(){
		return this.mchrg_nm;
	}
}

/* 작성시간 : Wed Sep 06 19:23:10 KST 2017 */