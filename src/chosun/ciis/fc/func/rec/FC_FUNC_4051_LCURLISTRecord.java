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


public class FC_FUNC_4051_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String curacct_clsf_cd;
	public String pay_note_no;
	public String note_amt;
	public String comp_dt;
	public String compnm;
	public String djgbnm;
	public String total;

	public FC_FUNC_4051_LCURLISTRecord(){}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setPay_note_no(String pay_note_no){
		this.pay_note_no = pay_note_no;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setCompnm(String compnm){
		this.compnm = compnm;
	}

	public void setDjgbnm(String djgbnm){
		this.djgbnm = djgbnm;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getPay_note_no(){
		return this.pay_note_no;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getCompnm(){
		return this.compnm;
	}

	public String getDjgbnm(){
		return this.djgbnm;
	}

	public String getTotal(){
		return this.total;
	}
}

/* 작성시간 : Sat Mar 07 13:17:57 KST 2009 */