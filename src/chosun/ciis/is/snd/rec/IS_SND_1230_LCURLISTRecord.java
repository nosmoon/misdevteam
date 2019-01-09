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


public class IS_SND_1230_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String advcs_cd;
	public String advcs_cd_nm;
	public String advt_nm;
	public String std_cd;
	public String std_cd_nm;
	public String bnch_qty;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String cmpy_cd_nm;

	public IS_SND_1230_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdvcs_cd(String advcs_cd){
		this.advcs_cd = advcs_cd;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setBnch_qty(String bnch_qty){
		this.bnch_qty = bnch_qty;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setCmpy_cd_nm(String cmpy_cd_nm){
		this.cmpy_cd_nm = cmpy_cd_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdvcs_cd(){
		return this.advcs_cd;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getBnch_qty(){
		return this.bnch_qty;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getCmpy_cd_nm(){
		return this.cmpy_cd_nm;
	}
}

/* 작성시간 : Tue May 29 15:15:54 KST 2012 */