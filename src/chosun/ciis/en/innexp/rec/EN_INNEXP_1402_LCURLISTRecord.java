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


package chosun.ciis.en.innexp.rec;

import java.sql.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.ds.*;

/**
 * 
 */


public class EN_INNEXP_1402_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evnt_cd;
	public String evnt_nm;
	public String rcpm_unit_clsf;
	public String tran_date;
	public String tran_time;
	public String cms_code;
	public String remark;
	public String tran_amt;
	public String erp_transfer_yn;
	public String erp_transfer_date;
	public String occr_no;

	public EN_INNEXP_1402_LCURLISTRecord(){}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setRcpm_unit_clsf(String rcpm_unit_clsf){
		this.rcpm_unit_clsf = rcpm_unit_clsf;
	}

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_time(String tran_time){
		this.tran_time = tran_time;
	}

	public void setCms_code(String cms_code){
		this.cms_code = cms_code;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setErp_transfer_yn(String erp_transfer_yn){
		this.erp_transfer_yn = erp_transfer_yn;
	}

	public void setErp_transfer_date(String erp_transfer_date){
		this.erp_transfer_date = erp_transfer_date;
	}

	public void setOccr_no(String occr_no){
		this.occr_no = occr_no;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getRcpm_unit_clsf(){
		return this.rcpm_unit_clsf;
	}

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_time(){
		return this.tran_time;
	}

	public String getCms_code(){
		return this.cms_code;
	}

	public String getRemark(){
		return this.remark;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getErp_transfer_yn(){
		return this.erp_transfer_yn;
	}

	public String getErp_transfer_date(){
		return this.erp_transfer_date;
	}

	public String getOccr_no(){
		return this.occr_no;
	}
}

/* 작성시간 : Wed May 20 13:47:07 KST 2009 */