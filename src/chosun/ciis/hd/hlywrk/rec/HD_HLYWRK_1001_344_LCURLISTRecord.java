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


package chosun.ciis.hd.hlywrk.rec;

import java.sql.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.ds.*;

/**
 * 
 */


public class HD_HLYWRK_1001_344_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String hody_clsf;
	public String obj_clsf;
	public String prsnt_hody_clsf;
	public String finish_hody_clsf;
	public String prsnt_tm;
	public String finish_tm;
	public String finish_dd_clsf;
	public String duty_tm;
	public String alvc_occr_yn;
	public String base_alon;
	public String cmpn_alon;
	public String tot_alon;

	public HD_HLYWRK_1001_344_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setObj_clsf(String obj_clsf){
		this.obj_clsf = obj_clsf;
	}

	public void setPrsnt_hody_clsf(String prsnt_hody_clsf){
		this.prsnt_hody_clsf = prsnt_hody_clsf;
	}

	public void setFinish_hody_clsf(String finish_hody_clsf){
		this.finish_hody_clsf = finish_hody_clsf;
	}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setDuty_tm(String duty_tm){
		this.duty_tm = duty_tm;
	}

	public void setAlvc_occr_yn(String alvc_occr_yn){
		this.alvc_occr_yn = alvc_occr_yn;
	}

	public void setBase_alon(String base_alon){
		this.base_alon = base_alon;
	}

	public void setCmpn_alon(String cmpn_alon){
		this.cmpn_alon = cmpn_alon;
	}

	public void setTot_alon(String tot_alon){
		this.tot_alon = tot_alon;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getObj_clsf(){
		return this.obj_clsf;
	}

	public String getPrsnt_hody_clsf(){
		return this.prsnt_hody_clsf;
	}

	public String getFinish_hody_clsf(){
		return this.finish_hody_clsf;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getDuty_tm(){
		return this.duty_tm;
	}

	public String getAlvc_occr_yn(){
		return this.alvc_occr_yn;
	}

	public String getBase_alon(){
		return this.base_alon;
	}

	public String getCmpn_alon(){
		return this.cmpn_alon;
	}

	public String getTot_alon(){
		return this.tot_alon;
	}
}

/* 작성시간 : Fri Nov 16 15:31:10 KST 2012 */