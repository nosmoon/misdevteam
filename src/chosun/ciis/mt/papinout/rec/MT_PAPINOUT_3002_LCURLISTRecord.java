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


public class MT_PAPINOUT_3002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String pj_kind;
	public String pj_wgt;
	public String etc_pj_resn_cd;
	public String remk;

	public MT_PAPINOUT_3002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_wgt(String pj_wgt){
		this.pj_wgt = pj_wgt;
	}

	public void setEtc_pj_resn_cd(String etc_pj_resn_cd){
		this.etc_pj_resn_cd = etc_pj_resn_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_wgt(){
		return this.pj_wgt;
	}

	public String getEtc_pj_resn_cd(){
		return this.etc_pj_resn_cd;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Sep 08 01:15:57 KST 2009 */