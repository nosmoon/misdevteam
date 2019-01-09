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


public class PR_OTHCNSM_2100_LCURLIST8Record extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String psplat_clsf;
	public String psplat_fee;
	public String gnaw_fee;
	public String psplat_qunt;
	public String nul_plat_cnt;
	public String psplat_amt;
	public String gnaw_amt;

	public PR_OTHCNSM_2100_LCURLIST8Record(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPsplat_clsf(String psplat_clsf){
		this.psplat_clsf = psplat_clsf;
	}

	public void setPsplat_fee(String psplat_fee){
		this.psplat_fee = psplat_fee;
	}

	public void setGnaw_fee(String gnaw_fee){
		this.gnaw_fee = gnaw_fee;
	}

	public void setPsplat_qunt(String psplat_qunt){
		this.psplat_qunt = psplat_qunt;
	}

	public void setNul_plat_cnt(String nul_plat_cnt){
		this.nul_plat_cnt = nul_plat_cnt;
	}

	public void setPsplat_amt(String psplat_amt){
		this.psplat_amt = psplat_amt;
	}

	public void setGnaw_amt(String gnaw_amt){
		this.gnaw_amt = gnaw_amt;
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

	public String getPsplat_clsf(){
		return this.psplat_clsf;
	}

	public String getPsplat_fee(){
		return this.psplat_fee;
	}

	public String getGnaw_fee(){
		return this.gnaw_fee;
	}

	public String getPsplat_qunt(){
		return this.psplat_qunt;
	}

	public String getNul_plat_cnt(){
		return this.nul_plat_cnt;
	}

	public String getPsplat_amt(){
		return this.psplat_amt;
	}

	public String getGnaw_amt(){
		return this.gnaw_amt;
	}
}

/* 작성시간 : Tue Oct 06 11:16:41 KST 2009 */