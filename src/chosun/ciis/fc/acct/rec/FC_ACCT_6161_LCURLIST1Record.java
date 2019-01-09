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


public class FC_ACCT_6161_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String jpgbcdnm;
	public String dsamt;
	public String cbamt;
	public String ggamt;
	public String vat;
	public String diff_amt;
	public String slip_clsf_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;

	public FC_ACCT_6161_LCURLIST1Record(){}

	public void setJpgbcdnm(String jpgbcdnm){
		this.jpgbcdnm = jpgbcdnm;
	}

	public void setDsamt(String dsamt){
		this.dsamt = dsamt;
	}

	public void setCbamt(String cbamt){
		this.cbamt = cbamt;
	}

	public void setGgamt(String ggamt){
		this.ggamt = ggamt;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setDiff_amt(String diff_amt){
		this.diff_amt = diff_amt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setFrom_fisc_dt(String from_fisc_dt){
		this.from_fisc_dt = from_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public String getJpgbcdnm(){
		return this.jpgbcdnm;
	}

	public String getDsamt(){
		return this.dsamt;
	}

	public String getCbamt(){
		return this.cbamt;
	}

	public String getGgamt(){
		return this.ggamt;
	}

	public String getVat(){
		return this.vat;
	}

	public String getDiff_amt(){
		return this.diff_amt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getFrom_fisc_dt(){
		return this.from_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}
}

/* 작성시간 : Tue Sep 15 16:08:12 KST 2009 */