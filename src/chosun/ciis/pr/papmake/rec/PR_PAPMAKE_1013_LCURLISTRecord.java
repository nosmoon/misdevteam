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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1013_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String wk_duty_nops;
	public String ngt_duty_nops;
	public String dtfree_nops;
	public String vaca_nops;
	public String dspch_nops;
	public String etc_nops;
	public String night_shift_liab_pers;
	public String mchn_1_duty_pers;
	public String mchn_2_duty_pers;
	public String mchn_3_duty_pers;
	public String mchn_4_duty_pers;
	public String mchn_duty_pers;
	public String befo_duty_pers;
	public String prt_board_duty_pers;
	public String send_duty_pers;
	public String etc_duty_pers;
	public String clos_clsf;
	public String remk;

	public PR_PAPMAKE_1013_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setWk_duty_nops(String wk_duty_nops){
		this.wk_duty_nops = wk_duty_nops;
	}

	public void setNgt_duty_nops(String ngt_duty_nops){
		this.ngt_duty_nops = ngt_duty_nops;
	}

	public void setDtfree_nops(String dtfree_nops){
		this.dtfree_nops = dtfree_nops;
	}

	public void setVaca_nops(String vaca_nops){
		this.vaca_nops = vaca_nops;
	}

	public void setDspch_nops(String dspch_nops){
		this.dspch_nops = dspch_nops;
	}

	public void setEtc_nops(String etc_nops){
		this.etc_nops = etc_nops;
	}

	public void setNight_shift_liab_pers(String night_shift_liab_pers){
		this.night_shift_liab_pers = night_shift_liab_pers;
	}

	public void setMchn_1_duty_pers(String mchn_1_duty_pers){
		this.mchn_1_duty_pers = mchn_1_duty_pers;
	}

	public void setMchn_2_duty_pers(String mchn_2_duty_pers){
		this.mchn_2_duty_pers = mchn_2_duty_pers;
	}

	public void setMchn_3_duty_pers(String mchn_3_duty_pers){
		this.mchn_3_duty_pers = mchn_3_duty_pers;
	}

	public void setMchn_4_duty_pers(String mchn_4_duty_pers){
		this.mchn_4_duty_pers = mchn_4_duty_pers;
	}

	public void setMchn_duty_pers(String mchn_duty_pers){
		this.mchn_duty_pers = mchn_duty_pers;
	}

	public void setBefo_duty_pers(String befo_duty_pers){
		this.befo_duty_pers = befo_duty_pers;
	}

	public void setPrt_board_duty_pers(String prt_board_duty_pers){
		this.prt_board_duty_pers = prt_board_duty_pers;
	}

	public void setSend_duty_pers(String send_duty_pers){
		this.send_duty_pers = send_duty_pers;
	}

	public void setEtc_duty_pers(String etc_duty_pers){
		this.etc_duty_pers = etc_duty_pers;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getWk_duty_nops(){
		return this.wk_duty_nops;
	}

	public String getNgt_duty_nops(){
		return this.ngt_duty_nops;
	}

	public String getDtfree_nops(){
		return this.dtfree_nops;
	}

	public String getVaca_nops(){
		return this.vaca_nops;
	}

	public String getDspch_nops(){
		return this.dspch_nops;
	}

	public String getEtc_nops(){
		return this.etc_nops;
	}

	public String getNight_shift_liab_pers(){
		return this.night_shift_liab_pers;
	}

	public String getMchn_1_duty_pers(){
		return this.mchn_1_duty_pers;
	}

	public String getMchn_2_duty_pers(){
		return this.mchn_2_duty_pers;
	}

	public String getMchn_3_duty_pers(){
		return this.mchn_3_duty_pers;
	}

	public String getMchn_4_duty_pers(){
		return this.mchn_4_duty_pers;
	}

	public String getMchn_duty_pers(){
		return this.mchn_duty_pers;
	}

	public String getBefo_duty_pers(){
		return this.befo_duty_pers;
	}

	public String getPrt_board_duty_pers(){
		return this.prt_board_duty_pers;
	}

	public String getSend_duty_pers(){
		return this.send_duty_pers;
	}

	public String getEtc_duty_pers(){
		return this.etc_duty_pers;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Jun 17 19:02:43 KST 2009 */