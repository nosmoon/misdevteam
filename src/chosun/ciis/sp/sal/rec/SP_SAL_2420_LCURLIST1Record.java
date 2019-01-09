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


public class SP_SAL_2420_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String bo_cd;
	public String bo_nm;
	public String bank_nm;
	public String bank_cd;
	public String acct_no;
	public String deps_pers;
	public String amt;
	public String req_amt_1;
	public String req_amt_2;
	public String req_amt_3;
	public String req_amt_4;
	public String req_amt_5;
	public String req_amt_6;
	public String req_amt_7;
	public String req_amt_8;
	public String req_amt_9;
	public String req_amt_10;
	public String req_amt_11;
	public String req_amt_12;
	public String req_amt_13;
	public String req_amt_14;
	public String req_amt_15;
	public String tot;
	public String mappli;

	public SP_SAL_2420_LCURLIST1Record(){}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setDeps_pers(String deps_pers){
		this.deps_pers = deps_pers;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setReq_amt_1(String req_amt_1){
		this.req_amt_1 = req_amt_1;
	}

	public void setReq_amt_2(String req_amt_2){
		this.req_amt_2 = req_amt_2;
	}

	public void setReq_amt_3(String req_amt_3){
		this.req_amt_3 = req_amt_3;
	}

	public void setReq_amt_4(String req_amt_4){
		this.req_amt_4 = req_amt_4;
	}

	public void setReq_amt_5(String req_amt_5){
		this.req_amt_5 = req_amt_5;
	}

	public void setReq_amt_6(String req_amt_6){
		this.req_amt_6 = req_amt_6;
	}

	public void setReq_amt_7(String req_amt_7){
		this.req_amt_7 = req_amt_7;
	}

	public void setReq_amt_8(String req_amt_8){
		this.req_amt_8 = req_amt_8;
	}

	public void setReq_amt_9(String req_amt_9){
		this.req_amt_9 = req_amt_9;
	}

	public void setReq_amt_10(String req_amt_10){
		this.req_amt_10 = req_amt_10;
	}

	public void setReq_amt_11(String req_amt_11){
		this.req_amt_11 = req_amt_11;
	}

	public void setReq_amt_12(String req_amt_12){
		this.req_amt_12 = req_amt_12;
	}

	public void setReq_amt_13(String req_amt_13){
		this.req_amt_13 = req_amt_13;
	}

	public void setReq_amt_14(String req_amt_14){
		this.req_amt_14 = req_amt_14;
	}

	public void setReq_amt_15(String req_amt_15){
		this.req_amt_15 = req_amt_15;
	}

	public void setTot(String tot){
		this.tot = tot;
	}

	public void setMappli(String mappli){
		this.mappli = mappli;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getDeps_pers(){
		return this.deps_pers;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getReq_amt_1(){
		return this.req_amt_1;
	}

	public String getReq_amt_2(){
		return this.req_amt_2;
	}

	public String getReq_amt_3(){
		return this.req_amt_3;
	}

	public String getReq_amt_4(){
		return this.req_amt_4;
	}

	public String getReq_amt_5(){
		return this.req_amt_5;
	}

	public String getReq_amt_6(){
		return this.req_amt_6;
	}

	public String getReq_amt_7(){
		return this.req_amt_7;
	}

	public String getReq_amt_8(){
		return this.req_amt_8;
	}

	public String getReq_amt_9(){
		return this.req_amt_9;
	}

	public String getReq_amt_10(){
		return this.req_amt_10;
	}

	public String getReq_amt_11(){
		return this.req_amt_11;
	}

	public String getReq_amt_12(){
		return this.req_amt_12;
	}

	public String getReq_amt_13(){
		return this.req_amt_13;
	}

	public String getReq_amt_14(){
		return this.req_amt_14;
	}

	public String getReq_amt_15(){
		return this.req_amt_15;
	}

	public String getTot(){
		return this.tot;
	}

	public String getMappli(){
		return this.mappli;
	}
}

/* 작성시간 : Wed Jul 18 14:18:33 KST 2012 */