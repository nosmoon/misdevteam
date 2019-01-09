/***************************************************************************************************
 * 파일명   : SS_L_CYBALON_STAFPAYSTAFPAYLISTRecord.java
 * 기능     : 사이버센터-사이버수당지급 조회
 * 작성일자 : 2005-06-22
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.ca.rec;

import java.sql.*;
import chosun.ciis.ss.sls.ca.dm.*;
import chosun.ciis.ss.sls.ca.ds.*;

/**
 * 사이버센터-사이버수당지급 조회
 */

public class SS_L_CYBALON_STAFPAYSTAFPAYLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String closyymm;
	public String stafclsfcd;
	public String stafno;
	public int rdrcnt;
	public int payalonnoit;
	public int payalonamt;
	public String prn;
	public String ernno;
	public String stafnm;
	public String acctbank;
	public String acctbanknm;
	public String acctno;
	public String acctdeps_pers;
	public String tel_no;
	public String ptph_no;
	public String email;
	public String cntrstatcd;
	public String cntrstatnm;
	public int rnum;

	public SS_L_CYBALON_STAFPAYSTAFPAYLISTRecord(){}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setRdrcnt(int rdrcnt){
		this.rdrcnt = rdrcnt;
	}

	public void setPayalonnoit(int payalonnoit){
		this.payalonnoit = payalonnoit;
	}

	public void setPayalonamt(int payalonamt){
		this.payalonamt = payalonamt;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctbanknm(String acctbanknm){
		this.acctbanknm = acctbanknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setCntrstatnm(String cntrstatnm){
		this.cntrstatnm = cntrstatnm;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public int getRdrcnt(){
		return this.rdrcnt;
	}

	public int getPayalonnoit(){
		return this.payalonnoit;
	}

	public int getPayalonamt(){
		return this.payalonamt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctbanknm(){
		return this.acctbanknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getEmail(){
		return this.email;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getCntrstatnm(){
		return this.cntrstatnm;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Wed Jun 22 19:25:05 KST 2005 */