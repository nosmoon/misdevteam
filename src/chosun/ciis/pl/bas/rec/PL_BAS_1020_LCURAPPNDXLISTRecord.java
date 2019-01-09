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


public class PL_BAS_1020_LCURAPPNDXLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_ser_no;
	public String appndx_seq;
	public String reg_dt;
	public String appndx_nm;
	public String appndx_qty;
	public String wgt;
	public String remk;

	public PL_BAS_1020_LCURAPPNDXLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setAppndx_seq(String appndx_seq){
		this.appndx_seq = appndx_seq;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setAppndx_nm(String appndx_nm){
		this.appndx_nm = appndx_nm;
	}

	public void setAppndx_qty(String appndx_qty){
		this.appndx_qty = appndx_qty;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getAppndx_seq(){
		return this.appndx_seq;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getAppndx_nm(){
		return this.appndx_nm;
	}

	public String getAppndx_qty(){
		return this.appndx_qty;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */