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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_2910_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String pubc_dt;
	public String advt_clas;
	public String sect_cd;
	public String sect_seq;
	public String pubc_dn;
	public String pubc_cm;
	public String dlco_nm1;
	public String make_dn;
	public String make_cm;
	public String dlco_nm2;

	public AD_PUB_2910_LCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setAdvt_clas(String advt_clas){
		this.advt_clas = advt_clas;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setPubc_dn(String pubc_dn){
		this.pubc_dn = pubc_dn;
	}

	public void setPubc_cm(String pubc_cm){
		this.pubc_cm = pubc_cm;
	}

	public void setDlco_nm1(String dlco_nm1){
		this.dlco_nm1 = dlco_nm1;
	}

	public void setMake_dn(String make_dn){
		this.make_dn = make_dn;
	}

	public void setMake_cm(String make_cm){
		this.make_cm = make_cm;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getAdvt_clas(){
		return this.advt_clas;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getPubc_dn(){
		return this.pubc_dn;
	}

	public String getPubc_cm(){
		return this.pubc_cm;
	}

	public String getDlco_nm1(){
		return this.dlco_nm1;
	}

	public String getMake_dn(){
		return this.make_dn;
	}

	public String getMake_cm(){
		return this.make_cm;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}
}

/* 작성시간 : Wed Sep 09 11:56:56 KST 2009 */