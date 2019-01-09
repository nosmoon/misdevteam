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


package chosun.ciis.as.redm.rec;

import java.sql.*;
import chosun.ciis.as.redm.dm.*;
import chosun.ciis.as.redm.ds.*;

/**
 * 
 */


public class AS_REDM_1201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String meda_amt;
	public String redm_extt_amt;
	public String cur_redm_agg_amt;
	public String pre_bi_amt;
	public String stcuramt;
	public String cur_end_bi_amt;
	public String redm_mthd_cd;
	public String redm_stat_cd;
	public String hsty__stat_cd;
	public String acct_book_amt;

	public AS_REDM_1201_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setMeda_amt(String meda_amt){
		this.meda_amt = meda_amt;
	}

	public void setRedm_extt_amt(String redm_extt_amt){
		this.redm_extt_amt = redm_extt_amt;
	}

	public void setCur_redm_agg_amt(String cur_redm_agg_amt){
		this.cur_redm_agg_amt = cur_redm_agg_amt;
	}

	public void setPre_bi_amt(String pre_bi_amt){
		this.pre_bi_amt = pre_bi_amt;
	}

	public void setStcuramt(String stcuramt){
		this.stcuramt = stcuramt;
	}

	public void setCur_end_bi_amt(String cur_end_bi_amt){
		this.cur_end_bi_amt = cur_end_bi_amt;
	}

	public void setRedm_mthd_cd(String redm_mthd_cd){
		this.redm_mthd_cd = redm_mthd_cd;
	}

	public void setRedm_stat_cd(String redm_stat_cd){
		this.redm_stat_cd = redm_stat_cd;
	}

	public void setHsty__stat_cd(String hsty__stat_cd){
		this.hsty__stat_cd = hsty__stat_cd;
	}

	public void setAcct_book_amt(String acct_book_amt){
		this.acct_book_amt = acct_book_amt;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getMeda_amt(){
		return this.meda_amt;
	}

	public String getRedm_extt_amt(){
		return this.redm_extt_amt;
	}

	public String getCur_redm_agg_amt(){
		return this.cur_redm_agg_amt;
	}

	public String getPre_bi_amt(){
		return this.pre_bi_amt;
	}

	public String getStcuramt(){
		return this.stcuramt;
	}

	public String getCur_end_bi_amt(){
		return this.cur_end_bi_amt;
	}

	public String getRedm_mthd_cd(){
		return this.redm_mthd_cd;
	}

	public String getRedm_stat_cd(){
		return this.redm_stat_cd;
	}

	public String getHsty__stat_cd(){
		return this.hsty__stat_cd;
	}

	public String getAcct_book_amt(){
		return this.acct_book_amt;
	}
}

/* 작성시간 : Tue May 12 16:11:35 KST 2009 */