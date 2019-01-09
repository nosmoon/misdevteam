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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_5072_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_no;
	public String amt;
	public String rmks1;
	public String medi_cd;
	public String medi_cd_nm;
	public String dtls_medi_cd;
	public String dtls_medi_cd_nm;

	public MC_BUDG_5072_LCURLISTRecord(){}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setDtls_medi_cd_nm(String dtls_medi_cd_nm){
		this.dtls_medi_cd_nm = dtls_medi_cd_nm;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getDtls_medi_cd_nm(){
		return this.dtls_medi_cd_nm;
	}
}

/* 작성시간 : Thu Apr 27 16:14:29 KST 2017 */