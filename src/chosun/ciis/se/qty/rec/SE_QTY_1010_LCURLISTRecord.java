/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2007-05-22
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.rec;

import java.sql.*;
import chosun.ciis.se.qty.dm.*;
import chosun.ciis.se.qty.ds.*;

/**
 * 
 */


public class SE_QTY_1010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String medi_cd;
	public String tms;
	public String cyov_dt;
	public String send_basi_dt;
	public String val_meda_yn;
	public String val_aply_basi_clsf;
	public String val_rate;

	public SE_QTY_1010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setCyov_dt(String cyov_dt){
		this.cyov_dt = cyov_dt;
	}

	public void setSend_basi_dt(String send_basi_dt){
		this.send_basi_dt = send_basi_dt;
	}

	public void setVal_meda_yn(String val_meda_yn){
		this.val_meda_yn = val_meda_yn;
	}

	public void setVal_aply_basi_clsf(String val_aply_basi_clsf){
		this.val_aply_basi_clsf = val_aply_basi_clsf;
	}

	public void setVal_rate(String val_rate){
		this.val_rate = val_rate;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getCyov_dt(){
		return this.cyov_dt;
	}

	public String getSend_basi_dt(){
		return this.send_basi_dt;
	}

	public String getVal_meda_yn(){
		return this.val_meda_yn;
	}

	public String getVal_aply_basi_clsf(){
		return this.val_aply_basi_clsf;
	}

	public String getVal_rate(){
		return this.val_rate;
	}
}

/* 작성시간 : Mon Feb 16 14:15:29 KST 2009 */