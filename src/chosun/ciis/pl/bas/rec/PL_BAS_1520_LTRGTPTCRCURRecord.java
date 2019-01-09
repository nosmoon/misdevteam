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


public class PL_BAS_1520_LTRGTPTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_nm;
	public String dlco_clsf;
	public String dlco_clsf_nm;
	public String basi_yymm;
	public String trgt_qty;
	public String trgt_amt;

	public PL_BAS_1520_LTRGTPTCRCURRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setTrgt_qty(String trgt_qty){
		this.trgt_qty = trgt_qty;
	}

	public void setTrgt_amt(String trgt_amt){
		this.trgt_amt = trgt_amt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getTrgt_qty(){
		return this.trgt_qty;
	}

	public String getTrgt_amt(){
		return this.trgt_amt;
	}
}

/* 작성시간 : Thu Apr 30 14:29:47 KST 2009 */