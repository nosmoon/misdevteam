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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_2610_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ern;
	public String dlco_no;
	public String dlco_nm;
	public String sale_item_cd_nm;
	public String gds_nm;
	public String qunt;
	public String sale_amt;
	public String vat_amt;
	public String stot_amt;
	public String presi_nm;
	public String sale_item_cd_sort;
	public String dept_cd;
	public String area_nm;
	public String sale_item_cd;
	public String rsort;

	public SP_SAL_2610_LCURLISTRecord(){}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSale_item_cd_nm(String sale_item_cd_nm){
		this.sale_item_cd_nm = sale_item_cd_nm;
	}

	public void setGds_nm(String gds_nm){
		this.gds_nm = gds_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setStot_amt(String stot_amt){
		this.stot_amt = stot_amt;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setSale_item_cd_sort(String sale_item_cd_sort){
		this.sale_item_cd_sort = sale_item_cd_sort;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setRsort(String rsort){
		this.rsort = rsort;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSale_item_cd_nm(){
		return this.sale_item_cd_nm;
	}

	public String getGds_nm(){
		return this.gds_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getStot_amt(){
		return this.stot_amt;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getSale_item_cd_sort(){
		return this.sale_item_cd_sort;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getRsort(){
		return this.rsort;
	}
}

/* 작성시간 : Tue Aug 21 20:12:13 KST 2012 */