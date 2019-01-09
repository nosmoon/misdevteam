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


public class FC_ACCT_8061_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_cd;
	public String cucustnm;
	public String totamt;
	public String wctotamt;
	public String sdstotamt;
	public String jmstotamt;
	public String cnt;
	public String inwoncnt;
	public String soaeg_cnt;
	public String soaeg_amt;

	public FC_ACCT_8061_LCURLIST2Record(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCucustnm(String cucustnm){
		this.cucustnm = cucustnm;
	}

	public void setTotamt(String totamt){
		this.totamt = totamt;
	}

	public void setWctotamt(String wctotamt){
		this.wctotamt = wctotamt;
	}

	public void setSdstotamt(String sdstotamt){
		this.sdstotamt = sdstotamt;
	}

	public void setJmstotamt(String jmstotamt){
		this.jmstotamt = jmstotamt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setInwoncnt(String inwoncnt){
		this.inwoncnt = inwoncnt;
	}

	public void setSoaeg_cnt(String soaeg_cnt){
		this.soaeg_cnt = soaeg_cnt;
	}

	public void setSoaeg_amt(String soaeg_amt){
		this.soaeg_amt = soaeg_amt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCucustnm(){
		return this.cucustnm;
	}

	public String getTotamt(){
		return this.totamt;
	}

	public String getWctotamt(){
		return this.wctotamt;
	}

	public String getSdstotamt(){
		return this.sdstotamt;
	}

	public String getJmstotamt(){
		return this.jmstotamt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getInwoncnt(){
		return this.inwoncnt;
	}

	public String getSoaeg_cnt(){
		return this.soaeg_cnt;
	}

	public String getSoaeg_amt(){
		return this.soaeg_amt;
	}
}

/* 작성시간 : Thu Jul 09 13:03:02 KST 2015 */