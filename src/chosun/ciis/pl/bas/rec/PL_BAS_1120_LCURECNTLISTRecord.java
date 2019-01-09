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


public class PL_BAS_1120_LCURECNTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_ser_no;
	public String ecnt_seq;
	public String ecnt;
	public String issu_dt;
	public String ewh_dt;
	public String ewh_clsf;
	public String ewh_qty;
	public String wh_cd;
	public String remk;

	public PL_BAS_1120_LCURECNTLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setEcnt_seq(String ecnt_seq){
		this.ecnt_seq = ecnt_seq;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_clsf(String ewh_clsf){
		this.ewh_clsf = ewh_clsf;
	}

	public void setEwh_qty(String ewh_qty){
		this.ewh_qty = ewh_qty;
	}

	public void setWh_cd(String wh_cd){
		this.wh_cd = wh_cd;
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

	public String getEcnt_seq(){
		return this.ecnt_seq;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_clsf(){
		return this.ewh_clsf;
	}

	public String getEwh_qty(){
		return this.ewh_qty;
	}

	public String getWh_cd(){
		return this.wh_cd;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */