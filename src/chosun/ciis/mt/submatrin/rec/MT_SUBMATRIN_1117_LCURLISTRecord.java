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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1117_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String slip_arow_no;
	public String expn_clsf;
	public String impt_expn_clsf;
	public String reso_amt;
	public String titl;

	public MT_SUBMATRIN_1117_LCURLISTRecord(){}

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

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setExpn_clsf(String expn_clsf){
		this.expn_clsf = expn_clsf;
	}

	public void setImpt_expn_clsf(String impt_expn_clsf){
		this.impt_expn_clsf = impt_expn_clsf;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setTitl(String titl){
		this.titl = titl;
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

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getExpn_clsf(){
		return this.expn_clsf;
	}

	public String getImpt_expn_clsf(){
		return this.impt_expn_clsf;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getTitl(){
		return this.titl;
	}
}

/* 작성시간 : Fri Jul 17 10:25:43 KST 2009 */