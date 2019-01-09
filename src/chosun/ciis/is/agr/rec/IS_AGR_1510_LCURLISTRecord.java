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


public class IS_AGR_1510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String adms_dstc_cdd_nm;
	public String purc_dlco_nm;
	public String scat_dt;
	public String dlco_nm;
	public String advcs_cd_nm;
	public String advt_nm;
	public String std_cd_nm;
	public String sale_clsf_nm;
	public String purc_qunt;
	public String purc_amt;

	public IS_AGR_1510_LCURLISTRecord(){}

	public void setAdms_dstc_cdd_nm(String adms_dstc_cdd_nm){
		this.adms_dstc_cdd_nm = adms_dstc_cdd_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
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

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setPurc_qunt(String purc_qunt){
		this.purc_qunt = purc_qunt;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public String getAdms_dstc_cdd_nm(){
		return this.adms_dstc_cdd_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getScat_dt(){
		return this.scat_dt;
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

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getPurc_qunt(){
		return this.purc_qunt;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}
}

/* 작성시간 : Wed May 23 14:31:29 KST 2012 */