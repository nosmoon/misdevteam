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


public class FC_ACCT_5842_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sum_cbamt;
	public String jan_cbamt;
	public String insd_acct_cd;
	public String acct_subj_nm;
	public String slip_incmg_exne;
	public String acct_levl;
	public String jan_dbamt;
	public String sum_dbamt;

	public FC_ACCT_5842_LCURLISTRecord(){}

	public void setSum_cbamt(String sum_cbamt){
		this.sum_cbamt = sum_cbamt;
	}

	public void setJan_cbamt(String jan_cbamt){
		this.jan_cbamt = jan_cbamt;
	}

	public void setInsd_acct_cd(String insd_acct_cd){
		this.insd_acct_cd = insd_acct_cd;
	}

	public void setAcct_subj_nm(String acct_subj_nm){
		this.acct_subj_nm = acct_subj_nm;
	}

	public void setSlip_incmg_exne(String slip_incmg_exne){
		this.slip_incmg_exne = slip_incmg_exne;
	}

	public void setAcct_levl(String acct_levl){
		this.acct_levl = acct_levl;
	}

	public void setJan_dbamt(String jan_dbamt){
		this.jan_dbamt = jan_dbamt;
	}

	public void setSum_dbamt(String sum_dbamt){
		this.sum_dbamt = sum_dbamt;
	}

	public String getSum_cbamt(){
		return this.sum_cbamt;
	}

	public String getJan_cbamt(){
		return this.jan_cbamt;
	}

	public String getInsd_acct_cd(){
		return this.insd_acct_cd;
	}

	public String getAcct_subj_nm(){
		return this.acct_subj_nm;
	}

	public String getSlip_incmg_exne(){
		return this.slip_incmg_exne;
	}

	public String getAcct_levl(){
		return this.acct_levl;
	}

	public String getJan_dbamt(){
		return this.jan_dbamt;
	}

	public String getSum_dbamt(){
		return this.sum_dbamt;
	}
}

/* 작성시간 : Wed Mar 11 10:03:52 KST 2009 */