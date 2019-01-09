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


public class MT_COMMATR_8103_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String titl;
	public String reso_amt;
	public String adpay_amt;

	public MT_COMMATR_8103_LCURLIST2Record(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
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

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setAdpay_amt(String adpay_amt){
		this.adpay_amt = adpay_amt;
	}

	public String getSlip_no(){
		return this.slip_no;
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

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getAdpay_amt(){
		return this.adpay_amt;
	}
}

/* 작성시간 : Fri Jul 05 15:59:26 KST 2013 */