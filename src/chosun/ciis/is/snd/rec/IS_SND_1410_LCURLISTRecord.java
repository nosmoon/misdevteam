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


public class IS_SND_1410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String asnt_dstc_cd_nm;
	public String purc_dlco_nm;
	public String scat_dt;
	public String advcs_cd_nm;
	public String std_cd_nm;
	public String qunt;
	public String bnch_qty;
	public String uprc;
	public String purc_amt;
	public String purc_dlco_nm_sort;
	public String dstc_seqo;

	public IS_SND_1410_LCURLISTRecord(){}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setBnch_qty(String bnch_qty){
		this.bnch_qty = bnch_qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setPurc_dlco_nm_sort(String purc_dlco_nm_sort){
		this.purc_dlco_nm_sort = purc_dlco_nm_sort;
	}

	public void setDstc_seqo(String dstc_seqo){
		this.dstc_seqo = dstc_seqo;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getBnch_qty(){
		return this.bnch_qty;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getPurc_dlco_nm_sort(){
		return this.purc_dlco_nm_sort;
	}

	public String getDstc_seqo(){
		return this.dstc_seqo;
	}
}

/* 작성시간 : Mon Dec 24 16:14:27 KST 2012 */