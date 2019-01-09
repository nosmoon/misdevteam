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


public class IS_SND_1810_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String scat_dt;
	public String acwr_reg_dt_seq;
	public String advcs_cd_nm;
	public String advt_nm;
	public String std_cd_nm;
	public String asnt_dstc_cd_nm;
	public String purc_dlco_nm;
	public String bo_head_nm;
	public String qunt;
	public String send_yn;
	public String purc_reg_dt;
	public String purc_reg_seq;

	public IS_SND_1810_LCURLISTRecord(){}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setAcwr_reg_dt_seq(String acwr_reg_dt_seq){
		this.acwr_reg_dt_seq = acwr_reg_dt_seq;
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

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSend_yn(String send_yn){
		this.send_yn = send_yn;
	}

	public void setPurc_reg_dt(String purc_reg_dt){
		this.purc_reg_dt = purc_reg_dt;
	}

	public void setPurc_reg_seq(String purc_reg_seq){
		this.purc_reg_seq = purc_reg_seq;
	}

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getAcwr_reg_dt_seq(){
		return this.acwr_reg_dt_seq;
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

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSend_yn(){
		return this.send_yn;
	}

	public String getPurc_reg_dt(){
		return this.purc_reg_dt;
	}

	public String getPurc_reg_seq(){
		return this.purc_reg_seq;
	}
}

/* 작성시간 : Tue Jun 05 16:02:00 KST 2012 */