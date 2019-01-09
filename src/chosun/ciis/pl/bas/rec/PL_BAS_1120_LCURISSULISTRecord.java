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


public class PL_BAS_1120_LCURISSULISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd;
	public String medi_ser_no;
	public String issu_seq;
	public String ecnt;
	public String issu_dt;
	public String issu_qty;
	public String remk;

	public PL_BAS_1120_LCURISSULISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setIssu_seq(String issu_seq){
		this.issu_seq = issu_seq;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
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

	public String getIssu_seq(){
		return this.issu_seq;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Mar 16 21:48:55 KST 2009 */