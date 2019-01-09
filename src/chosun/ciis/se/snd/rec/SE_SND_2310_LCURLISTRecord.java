/***************************************************************************************************
* 파일명 : SE_SND_2310_LCURLISTRecord.java
* 기능 : 판매-발송관리-수송업자등록
* 작성일자 : 2009-02-13
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_2310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String tran_cmpy_cd;
	public String dlco_no;
	public String car_no;
	public String tran_cmpy_nm;
	public String corp_clsf;
	public String zip_1;
	public String zip_2;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String ptph_no;
	public String cntr_dt;
	public String cctr_dt;
	public String use_yn;
	public String setl_bank;
	public String acct_no;
	
	public SE_SND_2310_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd){
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setCorp_clsf(String corp_clsf){
		this.corp_clsf = corp_clsf;
	}

	public void setZip_1(String zip_1){
		this.zip_1 = zip_1;
	}

	public void setZip_2(String zip_2){
		this.zip_2 = zip_2;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getTran_cmpy_cd(){
		return this.tran_cmpy_cd;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getCorp_clsf(){
		return this.corp_clsf;
	}

	public String getZip_1(){
		return this.zip_1;
	}

	public String getZip_2(){
		return this.zip_2;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getAcct_no() {
		return acct_no;
	}

	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}

	public String getSetl_bank() {
		return setl_bank;
	}

	public void setSetl_bank(String setl_bank) {
		this.setl_bank = setl_bank;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getUse_yn(){
		return this.use_yn;
	}
}

/* 작성시간 : Fri Feb 13 14:29:43 KST 2009 */