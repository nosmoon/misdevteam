/***************************************************************************************************
 * 파일명   : SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord.java
 * 기능     : 확장현황-사이버확장-요원관리-인쇄
 * 작성일자 : 2006/01/04
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
**  확장현황-사이버확장-요원관리-인쇄
**/

public class SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String in_cmpydt;
	public String stafclsfcd;
	public String stafclsfnm;
	public String stafno;
	public String stafnm;
	public String blngteamnm;
	public String prn;
	public String ernno;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String acctno;
	public String acctbank;
	public String acctdeps_pers;
	public String cnvsstafno;
	public String cnvsstafnm;
	public String cntrstatcd;

	public SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord(){}

	public void setIn_cmpydt(String in_cmpydt){
		this.in_cmpydt = in_cmpydt;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafclsfnm(String stafclsfnm){
		this.stafclsfnm = stafclsfnm;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setBlngteamnm(String blngteamnm){
		this.blngteamnm = blngteamnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
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

	public void setEmail(String email){
		this.email = email;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setCnvsstafno(String cnvsstafno){
		this.cnvsstafno = cnvsstafno;
	}

	public void setCnvsstafnm(String cnvsstafnm){
		this.cnvsstafnm = cnvsstafnm;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public String getIn_cmpydt(){
		return this.in_cmpydt;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafclsfnm(){
		return this.stafclsfnm;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getBlngteamnm(){
		return this.blngteamnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
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

	public String getEmail(){
		return this.email;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getCnvsstafno(){
		return this.cnvsstafno;
	}

	public String getCnvsstafnm(){
		return this.cnvsstafnm;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}
}

/* 작성시간 : Wed Jan 04 15:28:59 KST 2006 */