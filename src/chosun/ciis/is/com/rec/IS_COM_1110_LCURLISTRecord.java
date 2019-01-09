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


package chosun.ciis.is.com.rec;

import java.sql.*;
import chosun.ciis.is.com.dm.*;
import chosun.ciis.is.com.ds.*;

/**
 * 
 */


public class IS_COM_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd_seq;
	public String dlco_abrv_nm;
	public String ern;
	public String bo_nm;
	public String bo_head_nm;
	public String presi_nm;
	public String corp_clsf_nm;
	public String addr;
	public String chg_dt_tm;
	public String dlco_clsf;
	public String dlco_cd;
	public String dlco_seq;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;

	public IS_COM_1110_LCURLISTRecord(){}

	public void setDlco_cd_seq(String dlco_cd_seq){
		this.dlco_cd_seq = dlco_cd_seq;
	}

	public void setDlco_abrv_nm(String dlco_abrv_nm){
		this.dlco_abrv_nm = dlco_abrv_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_head_nm(String bo_head_nm){
		this.bo_head_nm = bo_head_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setCorp_clsf_nm(String corp_clsf_nm){
		this.corp_clsf_nm = corp_clsf_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public String getDlco_cd_seq(){
		return this.dlco_cd_seq;
	}

	public String getDlco_abrv_nm(){
		return this.dlco_abrv_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_head_nm(){
		return this.bo_head_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getCorp_clsf_nm(){
		return this.corp_clsf_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}
}

/* 작성시간 : Mon Jul 09 19:33:14 KST 2012 */