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


public class IS_AGR_1930_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String scat_dt;
	public String dlco_nm;
	public String advcs_cd_nm;
	public String indt_cd_nm;
	public String advt_nm;
	public String sale_clsf_nm;
	public String spc_sale_clsf_nm;
	public String dept_cd_nm;
	public String sub_dept_cd_nm;
	public String chrg_pers;
	public String std_cd_nm;
	public String uprc;
	public String qunt;
	public String suply_amt;
	public String purc_uprc;
	public String purc_amt;
	public String prft_amt;
	public String prft_rate;

	public IS_AGR_1930_LCURLISTRecord(){}

	public void setScat_dt(String scat_dt){
		this.scat_dt = scat_dt;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setAdvt_nm(String advt_nm){
		this.advt_nm = advt_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setSpc_sale_clsf_nm(String spc_sale_clsf_nm){
		this.spc_sale_clsf_nm = spc_sale_clsf_nm;
	}

	public void setDept_cd_nm(String dept_cd_nm){
		this.dept_cd_nm = dept_cd_nm;
	}

	public void setSub_dept_cd_nm(String sub_dept_cd_nm){
		this.sub_dept_cd_nm = sub_dept_cd_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
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

	public String getScat_dt(){
		return this.scat_dt;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getAdvt_nm(){
		return this.advt_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getSpc_sale_clsf_nm(){
		return this.spc_sale_clsf_nm;
	}

	public String getDept_cd_nm(){
		return this.dept_cd_nm;
	}

	public String getSub_dept_cd_nm(){
		return this.sub_dept_cd_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
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
}

/* 작성시간 : Fri Jun 01 16:26:19 KST 2012 */