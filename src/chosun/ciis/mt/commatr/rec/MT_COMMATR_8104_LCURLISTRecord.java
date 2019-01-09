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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_8104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String somodat;
	public String tot_amt;
	public String reso_amt;
	public String rest_amt;
	public String slip_occr_dt;

	public MT_COMMATR_8104_LCURLISTRecord(){}

	public void setSomodat(String somodat){
		this.somodat = somodat;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setRest_amt(String rest_amt){
		this.rest_amt = rest_amt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public String getSomodat(){
		return this.somodat;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getRest_amt(){
		return this.rest_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}
}

/* 작성시간 : Fri Jun 28 16:21:29 KST 2013 */