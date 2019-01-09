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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1109_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_dt;
	public String rcpm_clsf;
	public String rcpm_amt;
	public String actu_slip;
	public String rmtt_dt;
	public String rmtt_plac;
	public String remk;

	public AS_ASET_1109_LCURLISTRecord(){}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setActu_slip(String actu_slip){
		this.actu_slip = actu_slip;
	}

	public void setRmtt_dt(String rmtt_dt){
		this.rmtt_dt = rmtt_dt;
	}

	public void setRmtt_plac(String rmtt_plac){
		this.rmtt_plac = rmtt_plac;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getActu_slip(){
		return this.actu_slip;
	}

	public String getRmtt_dt(){
		return this.rmtt_dt;
	}

	public String getRmtt_plac(){
		return this.rmtt_plac;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Apr 02 09:57:20 KST 2009 */