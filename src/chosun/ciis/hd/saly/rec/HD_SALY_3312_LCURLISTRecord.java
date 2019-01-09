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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_3312_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_nm;
	public String occr_dt;
	public String occr_seq;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String actu_slip_no;
	public String proc_clsf;
	public String proc_clsf_nm;

	public HD_SALY_3312_LCURLISTRecord(){}

	public void setSlip_nm(String slip_nm){
		this.slip_nm = slip_nm;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setActu_slip_no(String actu_slip_no){
		this.actu_slip_no = actu_slip_no;
	}

	public void setProc_clsf(String proc_clsf){
		this.proc_clsf = proc_clsf;
	}

	public void setProc_clsf_nm(String proc_clsf_nm){
		this.proc_clsf_nm = proc_clsf_nm;
	}

	public String getSlip_nm(){
		return this.slip_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getActu_slip_no(){
		return this.actu_slip_no;
	}

	public String getProc_clsf(){
		return this.proc_clsf;
	}

	public String getProc_clsf_nm(){
		return this.proc_clsf_nm;
	}
}

/* 작성시간 : Fri May 22 16:18:18 KST 2009 */