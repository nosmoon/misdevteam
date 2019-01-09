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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_1005_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String fac_clsf;
	public String aply_dt;
	public String max_ewh_wgt;
	public String oth_prts_ratio;

	public MT_PAPORD_1005_LCURLIST1Record(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setMax_ewh_wgt(String max_ewh_wgt){
		this.max_ewh_wgt = max_ewh_wgt;
	}

	public void setOth_prts_ratio(String oth_prts_ratio){
		this.oth_prts_ratio = oth_prts_ratio;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getMax_ewh_wgt(){
		return this.max_ewh_wgt;
	}

	public String getOth_prts_ratio(){
		return this.oth_prts_ratio;
	}
}

/* 작성시간 : Tue Jul 14 01:18:13 KST 2009 */