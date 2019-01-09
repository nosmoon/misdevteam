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


public class IS_SND_1250_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String send_cmpy_cd;
	public String advcs_cd;
	public String advcs_cd_nm;
	public String advt_nm;
	public String std_cd;
	public String std_cd_nm;
	public String scat_dt;
	public String bnch_qty;
	public String qunt;
	public String bnch_qunt;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;
	public String purc_dlco_no;
	public String purc_dlco_nm;
	public String dstc_seqo;
	public String cmpy_cd_nm;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String purc_reg_dt;
	public String purc_reg_seq;
	public String group_cnt;
	public String group_order;

	public IS_SND_1250_LCURLIST1Record(){}

	public void setSend_cmpy_cd(String send_cmpy_cd){
		this.send_cmpy_cd = send_cmpy_cd;
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

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setBnch_qty(String bnch_qty){
		this.bnch_qty = bnch_qty;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setBnch_qunt(String bnch_qunt){
		this.bnch_qunt = bnch_qunt;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setPurc_dlco_no(String purc_dlco_no){
		this.purc_dlco_no = purc_dlco_no;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setDstc_seqo(String dstc_seqo){
		this.dstc_seqo = dstc_seqo;
	}

	public void setCmpy_cd_nm(String cmpy_cd_nm){
		this.cmpy_cd_nm = cmpy_cd_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setPurc_reg_dt(String purc_reg_dt){
		this.purc_reg_dt = purc_reg_dt;
	}

	public void setPurc_reg_seq(String purc_reg_seq){
		this.purc_reg_seq = purc_reg_seq;
	}

	public void setGroup_cnt(String group_cnt){
		this.group_cnt = group_cnt;
	}

	public void setGroup_order(String group_order){
		this.group_order = group_order;
	}

	public String getSend_cmpy_cd(){
		return this.send_cmpy_cd;
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

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getBnch_qty(){
		return this.bnch_qty;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getBnch_qunt(){
		return this.bnch_qunt;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getPurc_dlco_no(){
		return this.purc_dlco_no;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getDstc_seqo(){
		return this.dstc_seqo;
	}

	public String getCmpy_cd_nm(){
		return this.cmpy_cd_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getPurc_reg_dt(){
		return this.purc_reg_dt;
	}

	public String getPurc_reg_seq(){
		return this.purc_reg_seq;
	}

	public String getGroup_cnt(){
		return this.group_cnt;
	}

	public String getGroup_order(){
		return this.group_order;
	}
}

/* 작성시간 : Fri Jan 11 10:26:37 KST 2013 */