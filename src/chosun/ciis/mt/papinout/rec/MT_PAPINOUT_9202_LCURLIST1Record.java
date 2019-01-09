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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_9202_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String ewh_dt;
	public String fac_clsf;
	public String ewh_wgt;
	public String ewh_amt;

	public MT_PAPINOUT_9202_LCURLIST1Record(){}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}
}

/* 작성시간 : Wed May 20 08:58:24 KST 2009 */