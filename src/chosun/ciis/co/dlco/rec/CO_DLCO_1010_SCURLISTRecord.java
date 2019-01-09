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


package chosun.ciis.co.dlco.rec;

import java.sql.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;
import java.io.*;
/**
 * 
 */


public class CO_DLCO_1010_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public byte[] seal_phot;
	public byte[] ern_phot;
	public byte[] acct_aplc_frm;
	public byte[] psbk_copy;
	public byte[] use_seal;

	public CO_DLCO_1010_SCURLISTRecord(){}

	public void setSeal_phot(byte[] seal_phot){
		this.seal_phot = seal_phot;
	}

	public void setErn_phot(byte[] ern_phot){
		this.ern_phot = ern_phot;
	}
	
	public void setAcct_aplc_frm(byte[] acct_aplc_frm){
		this.acct_aplc_frm = acct_aplc_frm;
	}
	
	public void setPsbk_copy(byte[] psbk_copy){
		this.psbk_copy = psbk_copy;
	}
	
	public void setUse_seal(byte[] use_seal){
		this.use_seal = use_seal;
	}

	public byte[] getSeal_phot(){
		return this.seal_phot;
	}

	public byte[] getErn_phot(){
		return this.ern_phot;
	}
	
	public byte[] getAcct_aplc_frm(){
		return this.acct_aplc_frm;
	}
	
	public byte[] getPsbk_copy(){
		return this.psbk_copy;
	}
	
	public byte[] getUse_seal(){
		return this.use_seal;
	}
}

/* 작성시간 : Wed Jan 23 14:51:40 KST 2013 */