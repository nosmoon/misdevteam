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


public class FC_ACCT_6033_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String erplace_cd;
	public String ernm;
	public String ern;
	public String presi_nm;
	public String erplace_addr;
	public String erplace_bizcond;
	public String erplace_item;
	public String taxoff;
	public String corp_reg_no;
	public String intg_dlco_cd;

	public FC_ACCT_6033_LCURLISTRecord(){}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErnm(String ernm){
		this.ernm = ernm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setErplace_addr(String erplace_addr){
		this.erplace_addr = erplace_addr;
	}

	public void setErplace_bizcond(String erplace_bizcond){
		this.erplace_bizcond = erplace_bizcond;
	}

	public void setErplace_item(String erplace_item){
		this.erplace_item = erplace_item;
	}

	public void setTaxoff(String taxoff){
		this.taxoff = taxoff;
	}

	public void setCorp_reg_no(String corp_reg_no){
		this.corp_reg_no = corp_reg_no;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErnm(){
		return this.ernm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getErplace_addr(){
		return this.erplace_addr;
	}

	public String getErplace_bizcond(){
		return this.erplace_bizcond;
	}

	public String getErplace_item(){
		return this.erplace_item;
	}

	public String getTaxoff(){
		return this.taxoff;
	}

	public String getCorp_reg_no(){
		return this.corp_reg_no;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}
}

/* 작성시간 : Mon Apr 27 10:39:44 KST 2009 */