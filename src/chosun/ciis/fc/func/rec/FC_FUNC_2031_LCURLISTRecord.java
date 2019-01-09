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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_2031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seci_clsf_cdnm;
	public String seci_no;
	public String pay_bank_cdnm;
	public String face_val_amt;
	public String comp_dt;
	public String mtry_dt;
	public String int_rate;
	public String jbgamt;

	public FC_FUNC_2031_LCURLISTRecord(){}

	public void setSeci_clsf_cdnm(String seci_clsf_cdnm){
		this.seci_clsf_cdnm = seci_clsf_cdnm;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setPay_bank_cdnm(String pay_bank_cdnm){
		this.pay_bank_cdnm = pay_bank_cdnm;
	}

	public void setFace_val_amt(String face_val_amt){
		this.face_val_amt = face_val_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setJbgamt(String jbgamt){
		this.jbgamt = jbgamt;
	}

	public String getSeci_clsf_cdnm(){
		return this.seci_clsf_cdnm;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getPay_bank_cdnm(){
		return this.pay_bank_cdnm;
	}

	public String getFace_val_amt(){
		return this.face_val_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getJbgamt(){
		return this.jbgamt;
	}
}

/* 작성시간 : Thu Mar 12 20:19:57 KST 2009 */