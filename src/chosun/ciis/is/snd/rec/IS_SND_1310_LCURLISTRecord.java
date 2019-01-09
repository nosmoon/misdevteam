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


public class IS_SND_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String wh_cd_nm;
	public String dlco_nm;
	public String advcs_cd_nm;
	public String advt_nm;
	public String std_cd_nm;
	public String asnt_dstc_cd_nm;
	public String purc_dlco_nm;
	public String purc_qunt;
	public String uprc;
	public String tot_amt;
	public String chrg_pers;
	public String send_yn;

	public IS_SND_1310_LCURLISTRecord(){}

	public void setWh_cd_nm(String wh_cd_nm){
		this.wh_cd_nm = wh_cd_nm;
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

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setPurc_qunt(String purc_qunt){
		this.purc_qunt = purc_qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setSend_yn(String send_yn){
		this.send_yn = send_yn;
	}

	public String getWh_cd_nm(){
		return this.wh_cd_nm;
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

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getPurc_qunt(){
		return this.purc_qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getSend_yn(){
		return this.send_yn;
	}
}

/* 작성시간 : Fri May 25 09:34:47 KST 2012 */