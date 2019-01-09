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


public class FC_FUNC_1071_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slipno;
	public String dlco_nm;
	public String dr_amt;
	public String stat_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_occr_dt;

	public FC_FUNC_1071_LCURLISTRecord(){}

	public void setSlipno(String slipno){
		this.slipno = slipno;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public String getSlipno(){
		return this.slipno;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}
}

/* 작성시간 : Wed Feb 18 13:53:10 KST 2009 */