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


package chosun.ciis.ad.nmd.rec;

import java.sql.*;
import chosun.ciis.ad.nmd.dm.*;
import chosun.ciis.ad.nmd.ds.*;

/**
 * 
 */


public class AD_NMD_5050_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String pubc_dt;
	public String pubc_slip_no;
	public String dlco_no;
	public String dlco_nm;
	public String advt_fee;
	public String vat;
	public String sale_stmt_issu_yn;

	public AD_NMD_5050_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}
}

/* 작성시간 : Thu May 22 18:24:52 KST 2014 */