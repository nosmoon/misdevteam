/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String jursareanm;
	public String stafno;
	public String stafnm;
	public String prn;
	public String acctbank;
	public String acctno;
	public String acctdeps_pers;
	public int sa1;
	public int sh1;
	public int ss1;
	public int sa2;
	public int sh2;
	public int ss2;
	public int sa3;
	public int sh3;
	public int ss3;
	public int sa4;
	public int sh4;
	public int ss4;
	public int sa5;
	public int sh5;
	public int ss5;
	public int ea1;
	public int eh1;
	public int es1;
	public int ea2;
	public int eh2;
	public int es2;
	public int ea3;
	public int eh3;
	public int es3;
	public int ea4;
	public int eh4;
	public int es4;
	public int ea5;
	public int eh5;
	public int es5;
	public int corr_qty;
	public int tot_qty;

	public SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord(){}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setSa1(int sa1){
		this.sa1 = sa1;
	}

	public void setSh1(int sh1){
		this.sh1 = sh1;
	}

	public void setSs1(int ss1){
		this.ss1 = ss1;
	}

	public void setSa2(int sa2){
		this.sa2 = sa2;
	}

	public void setSh2(int sh2){
		this.sh2 = sh2;
	}

	public void setSs2(int ss2){
		this.ss2 = ss2;
	}

	public void setSa3(int sa3){
		this.sa3 = sa3;
	}

	public void setSh3(int sh3){
		this.sh3 = sh3;
	}

	public void setSs3(int ss3){
		this.ss3 = ss3;
	}

	public void setSa4(int sa4){
		this.sa4 = sa4;
	}

	public void setSh4(int sh4){
		this.sh4 = sh4;
	}

	public void setSs4(int ss4){
		this.ss4 = ss4;
	}

	public void setSa5(int sa5){
		this.sa5 = sa5;
	}

	public void setSh5(int sh5){
		this.sh5 = sh5;
	}

	public void setSs5(int ss5){
		this.ss5 = ss5;
	}

	public void setEa1(int ea1){
		this.ea1 = ea1;
	}

	public void setEh1(int eh1){
		this.eh1 = eh1;
	}

	public void setEs1(int es1){
		this.es1 = es1;
	}

	public void setEa2(int ea2){
		this.ea2 = ea2;
	}

	public void setEh2(int eh2){
		this.eh2 = eh2;
	}

	public void setEs2(int es2){
		this.es2 = es2;
	}

	public void setEa3(int ea3){
		this.ea3 = ea3;
	}

	public void setEh3(int eh3){
		this.eh3 = eh3;
	}

	public void setEs3(int es3){
		this.es3 = es3;
	}

	public void setEa4(int ea4){
		this.ea4 = ea4;
	}

	public void setEh4(int eh4){
		this.eh4 = eh4;
	}

	public void setEs4(int es4){
		this.es4 = es4;
	}

	public void setEa5(int ea5){
		this.ea5 = ea5;
	}

	public void setEh5(int eh5){
		this.eh5 = eh5;
	}

	public void setEs5(int es5){
		this.es5 = es5;
	}

	public void setCorr_qty(int corr_qty){
		this.corr_qty = corr_qty;
	}

	public void setTot_qty(int tot_qty){
		this.tot_qty = tot_qty;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public int getSa1(){
		return this.sa1;
	}

	public int getSh1(){
		return this.sh1;
	}

	public int getSs1(){
		return this.ss1;
	}

	public int getSa2(){
		return this.sa2;
	}

	public int getSh2(){
		return this.sh2;
	}

	public int getSs2(){
		return this.ss2;
	}

	public int getSa3(){
		return this.sa3;
	}

	public int getSh3(){
		return this.sh3;
	}

	public int getSs3(){
		return this.ss3;
	}

	public int getSa4(){
		return this.sa4;
	}

	public int getSh4(){
		return this.sh4;
	}

	public int getSs4(){
		return this.ss4;
	}

	public int getSa5(){
		return this.sa5;
	}

	public int getSh5(){
		return this.sh5;
	}

	public int getSs5(){
		return this.ss5;
	}

	public int getEa1(){
		return this.ea1;
	}

	public int getEh1(){
		return this.eh1;
	}

	public int getEs1(){
		return this.es1;
	}

	public int getEa2(){
		return this.ea2;
	}

	public int getEh2(){
		return this.eh2;
	}

	public int getEs2(){
		return this.es2;
	}

	public int getEa3(){
		return this.ea3;
	}

	public int getEh3(){
		return this.eh3;
	}

	public int getEs3(){
		return this.es3;
	}

	public int getEa4(){
		return this.ea4;
	}

	public int getEh4(){
		return this.eh4;
	}

	public int getEs4(){
		return this.es4;
	}

	public int getEa5(){
		return this.ea5;
	}

	public int getEh5(){
		return this.eh5;
	}

	public int getEs5(){
		return this.es5;
	}

	public int getCorr_qty(){
		return this.corr_qty;
	}

	public int getTot_qty(){
		return this.tot_qty;
	}
}

/* 작성시간 : Fri Aug 21 09:42:38 KST 2015 */