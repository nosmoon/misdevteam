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


package chosun.ciis.ad.tax.rec;

import java.sql.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.ds.*;

/**
 * 
 */


public class AD_TAX_2320_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{ 

	public String pubc_slip_no;
	public String medi_nm;
	public String dlco_nm;
	public String acct_dlco_no;
	public String acct_dlco_nm;
	public String ern;
	public String fee;
	public String slcrg_pers;
	public String mchrg_pers;

	public AD_TAX_2320_LCURLISTRecord(){}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAcct_dlco_no(String acct_dlco_no){
		this.acct_dlco_no = acct_dlco_no;
	}

	public void setAcct_dlco_nm(String acct_dlco_nm){
		this.acct_dlco_nm = acct_dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFee(String fee){
		this.fee = fee;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAcct_dlco_no(){
		return this.acct_dlco_no;
	}

	public String getAcct_dlco_nm(){
		return this.acct_dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getFee(){
		return this.fee;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}
}

/* 작성시간 : Tue Nov 14 15:55:30 KST 2017 */