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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_2100_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String psplat_clsf;
	public String use_qunt;
	public String nul_plat_cnt;
	public String psplat_fee;
	public String gnaw_fee;
	public String cmpy_cd;
	public String seq;
	public String occr_dt;
	public String sub_seq;

	public PR_OTHCNSM_2100_LCURLIST1Record(){}

	public void setPsplat_clsf(String psplat_clsf){
		this.psplat_clsf = psplat_clsf;
	}

	public void setUse_qunt(String use_qunt){
		this.use_qunt = use_qunt;
	}

	public void setNul_plat_cnt(String nul_plat_cnt){
		this.nul_plat_cnt = nul_plat_cnt;
	}

	public void setPsplat_fee(String psplat_fee){
		this.psplat_fee = psplat_fee;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public String getPsplat_clsf(){
		return this.psplat_clsf;
	}

	public String getUse_qunt(){
		return this.use_qunt;
	}

	public String getNul_plat_cnt(){
		return this.nul_plat_cnt;
	}

	public String getPsplat_fee(){
		return this.psplat_fee;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
}

/* 작성시간 : Sat Sep 26 18:14:25 KST 2009 */