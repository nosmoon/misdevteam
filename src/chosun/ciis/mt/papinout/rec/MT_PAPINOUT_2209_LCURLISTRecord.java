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


public class MT_PAPINOUT_2209_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cnsm_dt;
	public String fac_clsf;
	public String pcsim62cnt;
	public String mssim62cnt;
	public String pcsim31cnt;
	public String mssim31cnt;

	public MT_PAPINOUT_2209_LCURLISTRecord(){}

	public void setCnsm_dt(String cnsm_dt){
		this.cnsm_dt = cnsm_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPcsim62cnt(String pcsim62cnt){
		this.pcsim62cnt = pcsim62cnt;
	}

	public void setMssim62cnt(String mssim62cnt){
		this.mssim62cnt = mssim62cnt;
	}

	public void setPcsim31cnt(String pcsim31cnt){
		this.pcsim31cnt = pcsim31cnt;
	}

	public void setMssim31cnt(String mssim31cnt){
		this.mssim31cnt = mssim31cnt;
	}

	public String getCnsm_dt(){
		return this.cnsm_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPcsim62cnt(){
		return this.pcsim62cnt;
	}

	public String getMssim62cnt(){
		return this.mssim62cnt;
	}

	public String getPcsim31cnt(){
		return this.pcsim31cnt;
	}

	public String getMssim31cnt(){
		return this.mssim31cnt;
	}
}

/* 작성시간 : Tue Apr 28 20:23:27 KST 2009 */