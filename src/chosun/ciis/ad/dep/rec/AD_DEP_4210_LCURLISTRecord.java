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


package chosun.ciis.ad.dep.rec;

import java.sql.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.ds.*;

/**
 * 
 */


public class AD_DEP_4210_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pk;
	public String prt_seq;
	public String input_clsf;
	public String basi_dt;	
	public String dlco_nm;
	public String unrcp_amt;
	public String rcvnote_amt;
	public String precpt_amt;
	public String unrcp_fee;
	public String impt_gurt_amt;

	public AD_DEP_4210_LCURLISTRecord(){}

	public void setPK(String pk){
		this.pk = pk;
	}

	public void setPrt_seq(String prt_seq){
		this.prt_seq = prt_seq;
	}
	
	public void setInput_clsf(String input_clsf){
		this.input_clsf = input_clsf;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}	

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setUnrcp_amt(String unrcp_amt){
		this.unrcp_amt = unrcp_amt;
	}

	public void setRcvnote_amt(String rcvnote_amt){
		this.rcvnote_amt = rcvnote_amt;
	}

	public void setPrecpt_amt(String precpt_amt){
		this.precpt_amt = precpt_amt;
	}

	public void setUnrcp_fee(String unrcp_fee){
		this.unrcp_fee = unrcp_fee;
	}

	public void setImpt_gurt_amt(String impt_gurt_amt){
		this.impt_gurt_amt = impt_gurt_amt;
	}
	
	public String getPK(){
		return this.pk;
	}

	public String getPrt_seq(){
		return this.prt_seq;
	}
	
	public String getInput_clsf(){
		return this.input_clsf;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getUnrcp_amt(){
		return this.unrcp_amt;
	}

	public String getRcvnote_amt(){
		return this.rcvnote_amt;
	}

	public String getPrecpt_amt(){
		return this.precpt_amt;
	}

	public String getUnrcp_fee(){
		return this.unrcp_fee;
	}

	public String getImpt_gurt_amt(){
		return this.impt_gurt_amt;
	}
}

/* 작성시간 : Wed Aug 26 11:47:51 KST 2009 */