/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1220_LHNDLMEDILISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String medi_clsf;
	public String medi_clsf_nm;
	public String medi_cd;
	public String medi_cd_nm;
	public String deal_yn;
	public String no_val_exne;
	public String dcrate;
	public String wh_cd;
	public String sendclsf;
	public String remk;

	public PL_BAS_1220_LHNDLMEDILISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setMedi_clsf_nm(String medi_clsf_nm){
		this.medi_clsf_nm = medi_clsf_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_cd_nm(String medi_cd_nm){
		this.medi_cd_nm = medi_cd_nm;
	}

	public void setDeal_yn(String deal_yn){
		this.deal_yn = deal_yn;
	}

	public void setNo_val_exne(String no_val_exne){
		this.no_val_exne = no_val_exne;
	}

	public void setDcrate(String dcrate){
		this.dcrate = dcrate;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
	}

	public void setSendclsf(String sendclsf){
		this.sendclsf = sendclsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getMedi_clsf_nm(){
		return this.medi_clsf_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_cd_nm(){
		return this.medi_cd_nm;
	}

	public String getDeal_yn(){
		return this.deal_yn;
	}

	public String getNo_val_exne(){
		return this.no_val_exne;
	}

	public String getDcrate(){
		return this.dcrate;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getSendclsf(){
		return this.sendclsf;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Apr 27 18:18:56 KST 2009 */