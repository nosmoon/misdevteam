/***************************************************************************************************
* 파일명 : SS_L_BOINFOCURCOMMLISTRecord.java
* 기능 : 지국Info-지국현황 조회
* 작성일자 : 2004-02-10
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국Info-지국현황 조회
 *
 */


public class SS_L_BOINFOCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String boksnm;
	public String areanm;
	public String presi_nm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String bo_zip;
	public String boaddr;
	public String bodtlsaddr;
	public String bo_headnm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String bo_head_ptph_no1;
	public String bo_head_ptph_no2;
	public String bo_head_ptph_no3;
	public String bo_head_tel_no1;
	public String bo_head_tel_no2;
	public String bo_head_tel_no3;

	public SS_L_BOINFOCURCOMMLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setBo_zip(String bo_zip){
		this.bo_zip = bo_zip;
	}

	public void setBoaddr(String boaddr){
		this.boaddr = boaddr;
	}

	public void setBodtlsaddr(String bodtlsaddr){
		this.bodtlsaddr = bodtlsaddr;
	}

	public void setBo_headnm(String bo_headnm){
		this.bo_headnm = bo_headnm;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public void setBo_head_ptph_no1(String bo_head_ptph_no1){
		this.bo_head_ptph_no1 = bo_head_ptph_no1;
	}

	public void setBo_head_ptph_no2(String bo_head_ptph_no2){
		this.bo_head_ptph_no2 = bo_head_ptph_no2;
	}

	public void setBo_head_ptph_no3(String bo_head_ptph_no3){
		this.bo_head_ptph_no3 = bo_head_ptph_no3;
	}

	public void setBo_head_tel_no1(String bo_head_tel_no1){
		this.bo_head_tel_no1 = bo_head_tel_no1;
	}

	public void setBo_head_tel_no2(String bo_head_tel_no2){
		this.bo_head_tel_no2 = bo_head_tel_no2;
	}

	public void setBo_head_tel_no3(String bo_head_tel_no3){
		this.bo_head_tel_no3 = bo_head_tel_no3;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBoksnm(){
		return this.boksnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getBo_zip(){
		return this.bo_zip;
	}

	public String getBoaddr(){
		return this.boaddr;
	}

	public String getBodtlsaddr(){
		return this.bodtlsaddr;
	}

	public String getBo_headnm(){
		return this.bo_headnm;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public String getBo_head_ptph_no1(){
		return this.bo_head_ptph_no1;
	}

	public String getBo_head_ptph_no2(){
		return this.bo_head_ptph_no2;
	}

	public String getBo_head_ptph_no3(){
		return this.bo_head_ptph_no3;
	}

	public String getBo_head_tel_no1(){
		return this.bo_head_tel_no1;
	}

	public String getBo_head_tel_no2(){
		return this.bo_head_tel_no2;
	}

	public String getBo_head_tel_no3(){
		return this.bo_head_tel_no3;
	}
}

/* 작성시간 : Tue Feb 10 11:56:47 KST 2004 */