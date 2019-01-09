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


package chosun.ciis.as.leas.rec;

import java.sql.*;
import chosun.ciis.as.leas.dm.*;
import chosun.ciis.as.leas.ds.*;

/**
 * 
 */


public class AS_LEAS_1902_SCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String leas_tot_amt;
	public String leas_out_amt;
	public String gurt_tot_amt;
	public String gurt_out_amt;
	public String precpt_tot_amt;
	public String precpt_out_amt;
	public String bldg_cd;
	public String cntr_yy;
	public String cntr_seq;

	public AS_LEAS_1902_SCURLIST1Record(){}

	public void setLeas_tot_amt(String leas_tot_amt){
		this.leas_tot_amt = leas_tot_amt;
	}

	public void setLeas_out_amt(String leas_out_amt){
		this.leas_out_amt = leas_out_amt;
	}

	public void setGurt_tot_amt(String gurt_tot_amt){
		this.gurt_tot_amt = gurt_tot_amt;
	}

	public void setGurt_out_amt(String gurt_out_amt){
		this.gurt_out_amt = gurt_out_amt;
	}

	public void setPrecpt_tot_amt(String precpt_tot_amt){
		this.precpt_tot_amt = precpt_tot_amt;
	}

	public void setPrecpt_out_amt(String precpt_out_amt){
		this.precpt_out_amt = precpt_out_amt;
	}

	public void setBldg_cd(String bldg_cd){
		this.bldg_cd = bldg_cd;
	}

	public void setCntr_yy(String cntr_yy){
		this.cntr_yy = cntr_yy;
	}

	public void setCntr_seq(String cntr_seq){
		this.cntr_seq = cntr_seq;
	}

	public String getLeas_tot_amt(){
		return this.leas_tot_amt;
	}

	public String getLeas_out_amt(){
		return this.leas_out_amt;
	}

	public String getGurt_tot_amt(){
		return this.gurt_tot_amt;
	}

	public String getGurt_out_amt(){
		return this.gurt_out_amt;
	}

	public String getPrecpt_tot_amt(){
		return this.precpt_tot_amt;
	}

	public String getPrecpt_out_amt(){
		return this.precpt_out_amt;
	}

	public String getBldg_cd(){
		return this.bldg_cd;
	}

	public String getCntr_yy(){
		return this.cntr_yy;
	}

	public String getCntr_seq(){
		return this.cntr_seq;
	}
}

/* 작성시간 : Fri May 29 17:05:50 KST 2009 */