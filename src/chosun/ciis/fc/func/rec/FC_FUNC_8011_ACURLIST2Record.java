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


public class FC_FUNC_8011_ACURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cntr_clsf_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String slip_no;
	public String cost_amt;
	public String rmks;
	public String fisc_dt;

	public FC_FUNC_8011_ACURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCntr_clsf_cd(String cntr_clsf_cd){
		this.cntr_clsf_cd = cntr_clsf_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setCost_amt(String cost_amt){
		this.cost_amt = cost_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCntr_clsf_cd(){
		return this.cntr_clsf_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getCost_amt(){
		return this.cost_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}
}

/* 작성시간 : Wed Mar 25 18:58:56 KST 2009 */