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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_5811_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String supr_acct_cd;
	public String insd_acct_nm;
	public String acctcdacct_abrvnm;
	public String acct_levl;
	public String etc;
	public String medi_190;
	public String medi_210;
	public String medi_220;
	public String medi_230;
	public String medi_270;
	public String medi_320;
	public String medi_424;
	public String medi_426;
	public String medi_610;
	public String medi_620;
	public String medi_625;
	public String medi_630;
	public String medi_635;
	public String medi_640;
	public String medi_645;
	public String medi_646;
	public String medi_650;
	public String medi_655;
	public String medi_660;
	public String medi_665;
	public String medi_671;
	public String medi_680;
	public String medi_685;
	public String medi_700;
	public String medi_701;
	public String medi_702;
	public String medi_703;
	public String medi_704;
	public String medi_705;

	public FC_ACCT_5811_LCURLISTRecord(){}

	public void setSupr_acct_cd(String supr_acct_cd){
		this.supr_acct_cd = supr_acct_cd;
	}

	public void setInsd_acct_nm(String insd_acct_nm){
		this.insd_acct_nm = insd_acct_nm;
	}

	public void setAcctcdacct_abrvnm(String acctcdacct_abrvnm){
		this.acctcdacct_abrvnm = acctcdacct_abrvnm;
	}

	public void setAcct_levl(String acct_levl){
		this.acct_levl = acct_levl;
	}

	public void setEtc(String etc){
		this.etc = etc;
	}

	public void setMedi_190(String medi_190){
		this.medi_190 = medi_190;
	}

	public void setMedi_210(String medi_210){
		this.medi_210 = medi_210;
	}

	public void setMedi_220(String medi_220){
		this.medi_220 = medi_220;
	}

	public void setMedi_230(String medi_230){
		this.medi_230 = medi_230;
	}

	public void setMedi_270(String medi_270){
		this.medi_270 = medi_270;
	}

	public void setMedi_320(String medi_320){
		this.medi_320 = medi_320;
	}

	public void setMedi_424(String medi_424){
		this.medi_424 = medi_424;
	}

	public void setMedi_426(String medi_426){
		this.medi_426 = medi_426;
	}

	public void setMedi_610(String medi_610){
		this.medi_610 = medi_610;
	}

	public void setMedi_620(String medi_620){
		this.medi_620 = medi_620;
	}

	public void setMedi_625(String medi_625){
		this.medi_625 = medi_625;
	}

	public void setMedi_630(String medi_630){
		this.medi_630 = medi_630;
	}

	public void setMedi_635(String medi_635){
		this.medi_635 = medi_635;
	}

	public void setMedi_640(String medi_640){
		this.medi_640 = medi_640;
	}

	public void setMedi_645(String medi_645){
		this.medi_645 = medi_645;
	}

	public void setMedi_646(String medi_646){
		this.medi_646 = medi_646;
	}

	public void setMedi_650(String medi_650){
		this.medi_650 = medi_650;
	}

	public void setMedi_655(String medi_655){
		this.medi_655 = medi_655;
	}

	public void setMedi_660(String medi_660){
		this.medi_660 = medi_660;
	}

	public void setMedi_665(String medi_665){
		this.medi_665 = medi_665;
	}

	public void setMedi_671(String medi_671){
		this.medi_671 = medi_671;
	}

	public void setMedi_680(String medi_680){
		this.medi_680 = medi_680;
	}

	public void setMedi_685(String medi_685){
		this.medi_685 = medi_685;
	}

	public void setMedi_700(String medi_700){
		this.medi_700 = medi_700;
	}

	public void setMedi_701(String medi_701){
		this.medi_701 = medi_701;
	}

	public void setMedi_702(String medi_702){
		this.medi_702 = medi_702;
	}

	public void setMedi_703(String medi_703){
		this.medi_703 = medi_703;
	}

	public void setMedi_704(String medi_704){
		this.medi_704 = medi_704;
	}

	public void setMedi_705(String medi_705){
		this.medi_705 = medi_705;
	}

	public String getSupr_acct_cd(){
		return this.supr_acct_cd;
	}

	public String getInsd_acct_nm(){
		return this.insd_acct_nm;
	}

	public String getAcctcdacct_abrvnm(){
		return this.acctcdacct_abrvnm;
	}

	public String getAcct_levl(){
		return this.acct_levl;
	}

	public String getEtc(){
		return this.etc;
	}

	public String getMedi_190(){
		return this.medi_190;
	}

	public String getMedi_210(){
		return this.medi_210;
	}

	public String getMedi_220(){
		return this.medi_220;
	}

	public String getMedi_230(){
		return this.medi_230;
	}

	public String getMedi_270(){
		return this.medi_270;
	}

	public String getMedi_320(){
		return this.medi_320;
	}

	public String getMedi_424(){
		return this.medi_424;
	}

	public String getMedi_426(){
		return this.medi_426;
	}

	public String getMedi_610(){
		return this.medi_610;
	}

	public String getMedi_620(){
		return this.medi_620;
	}

	public String getMedi_625(){
		return this.medi_625;
	}

	public String getMedi_630(){
		return this.medi_630;
	}

	public String getMedi_635(){
		return this.medi_635;
	}

	public String getMedi_640(){
		return this.medi_640;
	}

	public String getMedi_645(){
		return this.medi_645;
	}

	public String getMedi_646(){
		return this.medi_646;
	}

	public String getMedi_650(){
		return this.medi_650;
	}

	public String getMedi_655(){
		return this.medi_655;
	}

	public String getMedi_660(){
		return this.medi_660;
	}

	public String getMedi_665(){
		return this.medi_665;
	}

	public String getMedi_671(){
		return this.medi_671;
	}

	public String getMedi_680(){
		return this.medi_680;
	}

	public String getMedi_685(){
		return this.medi_685;
	}

	public String getMedi_700(){
		return this.medi_700;
	}

	public String getMedi_701(){
		return this.medi_701;
	}

	public String getMedi_702(){
		return this.medi_702;
	}

	public String getMedi_703(){
		return this.medi_703;
	}

	public String getMedi_704(){
		return this.medi_704;
	}

	public String getMedi_705(){
		return this.medi_705;
	}
}

/* 작성시간 : Wed Dec 21 11:12:40 KST 2016 */