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


package chosun.ciis.is.snd.rec;

import java.sql.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;

/**
 * 
 */


public class IS_SND_1110_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String dlco_nm;
	public String advcs_cd_nm;
	public String advt_nm;
	public String std_cd_nm;
	public String qunt;
	public String chrg_pers;
	public String wh_cd_nm;
	public String fix_yn;
	public String self_yn;
	public String wh_cd;

	public IS_SND_1110_LCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setWh_cd_nm(String wh_cd_nm){
		this.wh_cd_nm = wh_cd_nm;
	}

	public void setFix_yn(String fix_yn){
		this.fix_yn = fix_yn;
	}

	public void setSelf_yn(String self_yn){
		this.self_yn = self_yn;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getWh_cd_nm(){
		return this.wh_cd_nm;
	}

	public String getFix_yn(){
		return this.fix_yn;
	}

	public String getSelf_yn(){
		return this.self_yn;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}
}

/* 작성시간 : Mon Dec 24 14:50:05 KST 2012 */