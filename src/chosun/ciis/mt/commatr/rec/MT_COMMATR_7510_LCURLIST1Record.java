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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_7510_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String jejisa;
	public String paper_cmpy;
	public String wgt_tot;
	public String per_tot;
	public String std_rate;
	public String diff_rate;
	public String amt;

	public MT_COMMATR_7510_LCURLIST1Record(){}

	public void setJejisa(String jejisa){
		this.jejisa = jejisa;
	}

	public void setPaper_cmpy(String paper_cmpy){
		this.paper_cmpy = paper_cmpy;
	}

	public void setWgt_tot(String wgt_tot){
		this.wgt_tot = wgt_tot;
	}

	public void setPer_tot(String per_tot){
		this.per_tot = per_tot;
	}

	public void setStd_rate(String std_rate){
		this.std_rate = std_rate;
	}

	public void setDiff_rate(String diff_rate){
		this.diff_rate = diff_rate;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getJejisa(){
		return this.jejisa;
	}

	public String getPaper_cmpy(){
		return this.paper_cmpy;
	}

	public String getWgt_tot(){
		return this.wgt_tot;
	}

	public String getPer_tot(){
		return this.per_tot;
	}

	public String getStd_rate(){
		return this.std_rate;
	}

	public String getDiff_rate(){
		return this.diff_rate;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Fri Dec 04 14:52:34 KST 2015 */