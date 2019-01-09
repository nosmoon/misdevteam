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


public class FC_FUNC_6072_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pymt_dt;
	public String pymt_amt;
	public String rmks;
	public String ybjpno;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;

	public FC_FUNC_6072_LCURLISTRecord(){}

	public void setPymt_dt(String pymt_dt){
		this.pymt_dt = pymt_dt;
	}

	public void setPymt_amt(String pymt_amt){
		this.pymt_amt = pymt_amt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setYbjpno(String ybjpno){
		this.ybjpno = ybjpno;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getPymt_dt(){
		return this.pymt_dt;
	}

	public String getPymt_amt(){
		return this.pymt_amt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getYbjpno(){
		return this.ybjpno;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Fri Mar 20 14:15:09 KST 2009 */