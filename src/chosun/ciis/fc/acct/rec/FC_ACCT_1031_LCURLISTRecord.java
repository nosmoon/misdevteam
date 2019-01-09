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


public class FC_ACCT_1031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String insd_acct_cd;
	public String acct_subj_nm;
	public String supr_acct_cd;
	public String acct_cd;
	public String slip_incmg_exne;
	public String drcr_bal_clsf;
	public String setoff_yn;
	public String tbs_exne;

	public FC_ACCT_1031_LCURLISTRecord(){}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setSupr_acct_cd(String supr_acct_cd){
		this.supr_acct_cd = supr_acct_cd;
	}

	public void setAcct_cd(String acct_cd){
		this.acct_cd = acct_cd;
	}

	public void setSlip_incmg_exne(String slip_incmg_exne){
		this.slip_incmg_exne = slip_incmg_exne;
	}

	public void setDrcr_bal_clsf(String drcr_bal_clsf){
		this.drcr_bal_clsf = drcr_bal_clsf;
	}

	public void setSetoff_yn(String setoff_yn){
		this.setoff_yn = setoff_yn;
	}

	public void setTbs_exne(String tbs_exne){
		this.tbs_exne = tbs_exne;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getSupr_acct_cd(){
		return this.supr_acct_cd;
	}

	public String getAcct_cd(){
		return this.acct_cd;
	}

	public String getSlip_incmg_exne(){
		return this.slip_incmg_exne;
	}

	public String getDrcr_bal_clsf(){
		return this.drcr_bal_clsf;
	}

	public String getSetoff_yn(){
		return this.setoff_yn;
	}

	public String getTbs_exne(){
		return this.tbs_exne;
	}
}

/* 작성시간 : Fri Feb 27 17:00:08 KST 2009 */