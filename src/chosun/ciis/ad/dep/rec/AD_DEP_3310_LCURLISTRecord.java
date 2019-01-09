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


package chosun.ciis.ad.dep.rec;

import java.sql.*;
import chosun.ciis.ad.dep.dm.*;
import chosun.ciis.ad.dep.ds.*;

/**
 * 
 */


public class AD_DEP_3310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String medi_cd;
	public String dlco_nm;
	public String b_misu_amt;
	public String pubc_amt;
	public String rcpm_amt;
	public String misu_amt;
	public String misu_rat1;
	public String misu_rat2;
	public String misu_rat3;
	public String kiil_avg1;
	public String kiil_avg2;
	public String kiil_avg3;
	public String dhon_amt;

	public AD_DEP_3310_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setB_misu_amt(String b_misu_amt){
		this.b_misu_amt = b_misu_amt;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setMisu_amt(String misu_amt){
		this.misu_amt = misu_amt;
	}

	public void setMisu_rat1(String misu_rat1){
		this.misu_rat1 = misu_rat1;
	}

	public void setMisu_rat2(String misu_rat2){
		this.misu_rat2 = misu_rat2;
	}

	public void setMisu_rat3(String misu_rat3){
		this.misu_rat3 = misu_rat3;
	}

	public void setKiil_avg1(String kiil_avg1){
		this.kiil_avg1 = kiil_avg1;
	}

	public void setKiil_avg2(String kiil_avg2){
		this.kiil_avg2 = kiil_avg2;
	}

	public void setKiil_avg3(String kiil_avg3){
		this.kiil_avg3 = kiil_avg3;
	}

	public void setDhon_amt(String dhon_amt){
		this.dhon_amt = dhon_amt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getB_misu_amt(){
		return this.b_misu_amt;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getMisu_amt(){
		return this.misu_amt;
	}

	public String getMisu_rat1(){
		return this.misu_rat1;
	}

	public String getMisu_rat2(){
		return this.misu_rat2;
	}

	public String getMisu_rat3(){
		return this.misu_rat3;
	}

	public String getKiil_avg1(){
		return this.kiil_avg1;
	}

	public String getKiil_avg2(){
		return this.kiil_avg2;
	}

	public String getKiil_avg3(){
		return this.kiil_avg3;
	}

	public String getDhon_amt(){
		return this.dhon_amt;
	}
}

/* 작성시간 : Wed Oct 07 20:42:26 KST 2009 */