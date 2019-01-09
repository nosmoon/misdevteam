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


public class FC_ACCT_6032_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String data_clsf;
	public String ern;
	public String firmnm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String deal_prd;
	public String make_dt;
	public String nul;

	public FC_ACCT_6032_LCURLIST1Record(){}

	public void setData_clsf(String data_clsf){
		this.data_clsf = data_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setFirmnm(String firmnm){
		this.firmnm = firmnm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setDeal_prd(String deal_prd){
		this.deal_prd = deal_prd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setNul(String nul){
		this.nul = nul;
	}

	public String getData_clsf(){
		return this.data_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getFirmnm(){
		return this.firmnm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getDeal_prd(){
		return this.deal_prd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getNul(){
		return this.nul;
	}
}

/* 작성시간 : Thu Jul 21 17:35:12 KST 2016 */