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


package chosun.ciis.co.dlco.rec;

import java.sql.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;

/**
 * 
 */


public class CO_DLCO_1002_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String ern;
	public String sys_clsf_cd;
	public String dlco_abrv_nm;
	public String dlco_nm;
	public String setl_bank;
	public String acct_no;
	public String corp_clsf;
	public String rcpm_main_nm;

	public CO_DLCO_1002_ACURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSys_clsf_cd(String sys_clsf_cd){
		this.sys_clsf_cd = sys_clsf_cd;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSys_clsf_cd(){
		return this.sys_clsf_cd;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}
}

/* 작성시간 : Fri Aug 17 16:52:28 KST 2012 */