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


package chosun.ciis.se.etc.rec;

import java.sql.*;
import chosun.ciis.se.etc.dm.*;
import chosun.ciis.se.etc.ds.*;

/**
 * 
 */


public class SE_ETC_1730_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String bo_head_prn;
	public String acct_no;
	public String setl_bank;
	public String rcpm_main_nm;
	public String bo_nm;

	public SE_ETC_1730_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setBo_head_prn(String bo_head_prn){
		this.bo_head_prn = bo_head_prn;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setSetl_bank(String setl_bank){
		this.setl_bank = setl_bank;
	}

	public void setRcpm_main_nm(String rcpm_main_nm){
		this.rcpm_main_nm = rcpm_main_nm;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getBo_head_prn(){
		return this.bo_head_prn;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getSetl_bank(){
		return this.setl_bank;
	}

	public String getRcpm_main_nm(){
		return this.rcpm_main_nm;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}
}

/* 작성시간 : Mon Dec 16 11:01:54 KST 2013 */