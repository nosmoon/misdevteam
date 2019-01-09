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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mortg_clsf;
	public String dlco_nm;
	public String cntr_type;
	public String mortg_cont;
	public String setup_pers;
	public String acct_no;
	public String mortg_amt;
	public String cntr_dt;
	public String cntr_todt;
	public String gurt_frdt;
	public String gurt_todt;
	public String ewh_dt;
	public String owh_dt;
	public String remk;
	public String del_yn;

	public AD_BAS_1310_LCURLISTRecord(){}

	public void setMortg_clsf(String mortg_clsf){
		this.mortg_clsf = mortg_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCntr_type(String cntr_type){
		this.cntr_type = cntr_type;
	}

	public void setMortg_cont(String mortg_cont){
		this.mortg_cont = mortg_cont;
	}

	public void setSetup_pers(String setup_pers){
		this.setup_pers = setup_pers;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setMortg_amt(String mortg_amt){
		this.mortg_amt = mortg_amt;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCntr_todt(String cntr_todt){
		this.cntr_todt = cntr_todt;
	}

	public void setGurt_frdt(String gurt_frdt){
		this.gurt_frdt = gurt_frdt;
	}

	public void setGurt_todt(String gurt_todt){
		this.gurt_todt = gurt_todt;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDel_yn(String del_yn){
		this.del_yn = del_yn;
	}

	public String getMortg_clsf(){
		return this.mortg_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCntr_type(){
		return this.cntr_type;
	}

	public String getMortg_cont(){
		return this.mortg_cont;
	}

	public String getSetup_pers(){
		return this.setup_pers;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getMortg_amt(){
		return this.mortg_amt;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCntr_todt(){
		return this.cntr_todt;
	}

	public String getGurt_frdt(){
		return this.gurt_frdt;
	}

	public String getGurt_todt(){
		return this.gurt_todt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDel_yn(){
		return this.del_yn;
	}
}

/* 작성시간 : Fri Jan 18 17:38:23 KST 2013 */