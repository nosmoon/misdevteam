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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_1610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rvord_dt;
	public String scat_dt;
	public String advcs_cd_nm;
	public String std_cd_nm;
	public String ord_qunt;
	public String ord_uprc;
	public String ord_amt;
	public String purc_uprc;
	public String purc_amt;
	public String prft_amt;
	public String prft_rate;
	public String chrg_pers;

	public IS_AGR_1610_LCURLISTRecord(){}

	public void setRvord_dt(String rvord_dt){
		this.rvord_dt = rvord_dt;
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

	public void setOrd_qunt(String ord_qunt){
		this.ord_qunt = ord_qunt;
	}

	public void setOrd_uprc(String ord_uprc){
		this.ord_uprc = ord_uprc;
	}

	public void setOrd_amt(String ord_amt){
		this.ord_amt = ord_amt;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setPrft_amt(String prft_amt){
		this.prft_amt = prft_amt;
	}

	public void setPrft_rate(String prft_rate){
		this.prft_rate = prft_rate;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public String getRvord_dt(){
		return this.rvord_dt;
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

	public String getOrd_qunt(){
		return this.ord_qunt;
	}

	public String getOrd_uprc(){
		return this.ord_uprc;
	}

	public String getOrd_amt(){
		return this.ord_amt;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getPrft_amt(){
		return this.prft_amt;
	}

	public String getPrft_rate(){
		return this.prft_rate;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}
}

/* 작성시간 : Thu May 24 10:45:24 KST 2012 */