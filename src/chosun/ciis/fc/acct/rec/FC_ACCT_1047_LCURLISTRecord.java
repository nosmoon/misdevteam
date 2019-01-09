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


public class FC_ACCT_1047_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk1;
	public String chk2;
	public String mang_item_cd;
	public String cdnm;
	public String drcr_clsf;
	public String mand_reg_yn;
	public String bal_mang_clsf;
	public String prty_rank;
	public String prty_rank2;
	public String mang_item_nm;

	public FC_ACCT_1047_LCURLISTRecord(){}

	public void setChk1(String chk1){
		this.chk1 = chk1;
	}

	public void setChk2(String chk2){
		this.chk2 = chk2;
	}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setMand_reg_yn(String mand_reg_yn){
		this.mand_reg_yn = mand_reg_yn;
	}

	public void setBal_mang_clsf(String bal_mang_clsf){
		this.bal_mang_clsf = bal_mang_clsf;
	}

	public void setPrty_rank(String prty_rank){
		this.prty_rank = prty_rank;
	}

	public void setPrty_rank2(String prty_rank2){
		this.prty_rank2 = prty_rank2;
	}

	public void setMang_item_nm(String mang_item_nm){
		this.mang_item_nm = mang_item_nm;
	}

	public String getChk1(){
		return this.chk1;
	}

	public String getChk2(){
		return this.chk2;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getMand_reg_yn(){
		return this.mand_reg_yn;
	}

	public String getBal_mang_clsf(){
		return this.bal_mang_clsf;
	}

	public String getPrty_rank(){
		return this.prty_rank;
	}

	public String getPrty_rank2(){
		return this.prty_rank2;
	}

	public String getMang_item_nm(){
		return this.mang_item_nm;
	}
}

/* 작성시간 : Wed Apr 01 20:09:35 KST 2009 */