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


package chosun.ciis.pl.cls.rec;

import java.sql.*;
import chosun.ciis.pl.cls.dm.*;
import chosun.ciis.pl.cls.ds.*;

/**
 * 
 */


public class PL_CLS_1815_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String bo_cd;
	public String bo_seq;
	public String bo_nm;
	public String ern;
	public String slip_no;
	public String suply_amt;
	public String rcpm_amt;

	public PL_CLS_1815_LCURLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}
}

/* 작성시간 : Tue Apr 04 18:41:23 KST 2017 */