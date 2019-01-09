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


public class AD_NMD_3010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String demand_dlco_no;
	public String demand_dlco_nm;
	public String sum_adjst_amt;
	public String proc_yn;
	public String slip_occr_dt;
	public String slip_seq;

	public AD_NMD_3010_LCURLISTRecord(){}

	public void setDemand_dlco_no(String demand_dlco_no){
		this.demand_dlco_no = demand_dlco_no;
	}

	public void setDemand_dlco_nm(String demand_dlco_nm){
		this.demand_dlco_nm = demand_dlco_nm;
	}

	public void setSum_adjst_amt(String sum_adjst_amt){
		this.sum_adjst_amt = sum_adjst_amt;
	}

	public void setProc_yn(String proc_yn){
		this.proc_yn = proc_yn;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getDemand_dlco_no(){
		return this.demand_dlco_no;
	}

	public String getDemand_dlco_nm(){
		return this.demand_dlco_nm;
	}

	public String getSum_adjst_amt(){
		return this.sum_adjst_amt;
	}

	public String getProc_yn(){
		return this.proc_yn;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Thu Jul 26 17:49:20 KST 2012 */