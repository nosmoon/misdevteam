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


public class FC_ACCT_8072_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_cd;
	public String cucustnm;
	public String totamt;
	public String sdstotamt;
	public String jmstotamt;
	public String wctotamt;
	public String pytotamt;
	public String sdtotamt;
	public String inwoncnt;
	public String w_tcnt;

	public FC_ACCT_8072_LCURLIST2Record(){}

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

	public void setSdstotamt(String sdstotamt){
		this.sdstotamt = sdstotamt;
	}

	public void setJmstotamt(String jmstotamt){
		this.jmstotamt = jmstotamt;
	}

	public void setWctotamt(String wctotamt){
		this.wctotamt = wctotamt;
	}

	public void setPytotamt(String pytotamt){
		this.pytotamt = pytotamt;
	}

	public void setSdtotamt(String sdtotamt){
		this.sdtotamt = sdtotamt;
	}

	public void setInwoncnt(String inwoncnt){
		this.inwoncnt = inwoncnt;
	}

	public void setW_tcnt(String w_tcnt){
		this.w_tcnt = w_tcnt;
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

	public String getSdstotamt(){
		return this.sdstotamt;
	}

	public String getJmstotamt(){
		return this.jmstotamt;
	}

	public String getWctotamt(){
		return this.wctotamt;
	}

	public String getPytotamt(){
		return this.pytotamt;
	}

	public String getSdtotamt(){
		return this.sdtotamt;
	}

	public String getInwoncnt(){
		return this.inwoncnt;
	}

	public String getW_tcnt(){
		return this.w_tcnt;
	}
}

/* 작성시간 : Thu Jul 09 13:17:12 KST 2015 */