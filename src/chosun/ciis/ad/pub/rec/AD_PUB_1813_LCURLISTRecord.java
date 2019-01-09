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


public class AD_PUB_1813_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pubc_dt;
	public String pubc_slip_no;
	public String pre_pubc_slip_no;
	public String div_yn;
	public String dlco_nm;
	public String agn_nm;
	public String upd_advt_fee;
	public String advt_fee;
	public String icdc_fee;
	public String slcrg_pers;
	public String mchrg_pers;

	public AD_PUB_1813_LCURLISTRecord(){}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setPre_pubc_slip_no(String pre_pubc_slip_no){
		this.pre_pubc_slip_no = pre_pubc_slip_no;
	}

	public void setDiv_yn(String div_yn){
		this.div_yn = div_yn;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAgn_nm(String agn_nm){
		this.agn_nm = agn_nm;
	}

	public void setUpd_advt_fee(String upd_advt_fee){
		this.upd_advt_fee = upd_advt_fee;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setIcdc_fee(String icdc_fee){
		this.icdc_fee = icdc_fee;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getPre_pubc_slip_no(){
		return this.pre_pubc_slip_no;
	}

	public String getDiv_yn(){
		return this.div_yn;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAgn_nm(){
		return this.agn_nm;
	}

	public String getUpd_advt_fee(){
		return this.upd_advt_fee;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getIcdc_fee(){
		return this.icdc_fee;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}
}

/* 작성시간 : Thu Jun 04 11:02:15 KST 2015 */