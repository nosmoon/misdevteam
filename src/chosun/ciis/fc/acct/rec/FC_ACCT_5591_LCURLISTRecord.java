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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_5591_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_arow_no;
	public String mang_clsf_cd;
	public String comp_dt;
	public String rmks2;
	public String dr_amt;

	public FC_ACCT_5591_LCURLISTRecord(){}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}
}

/* 작성시간 : Fri Mar 20 11:59:37 KST 2009 */