/***************************************************************************************************
* 파일명 : .java
* 기능 : * 지국지원-판촉현황-요원관리-Excel
* 작성일자 : 2009-10-28
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 *  지국지원-판촉현황-요원관리-Excel
 */

public class SS_L_PROMSTAF_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String stafclsfcd;
	public String stafclsfnm;
	public String cntrstatnm;
	public String stafno;
	public String stafnm;
	public String jursareanm;
	public String prn;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String addr;
	public String dtlsaddr;
	public String ernno;
	public String zip;
	public String email;

	public SS_L_PROMSTAF_PRINTCURCOMMLISTRecord(){}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafclsfnm(String stafclsfnm){
		this.stafclsfnm = stafclsfnm;
	}

	public void setCntrstatnm(String cntrstatnm){
		this.cntrstatnm = cntrstatnm;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafclsfnm(){
		return this.stafclsfnm;
	}

	public String getCntrstatnm(){
		return this.cntrstatnm;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getZip(){
		return this.zip;
	}

	public String getEmail(){
		return this.email;
	}
}

/* 작성시간 : Wed Oct 28 17:24:36 KST 2009 */