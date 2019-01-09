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


package chosun.ciis.pl.com.rec;

import java.sql.*;
import chosun.ciis.pl.com.dm.*;
import chosun.ciis.pl.com.ds.*;

/**
 * 
 */


public class PL_COM_1300_MCRDT_PTCRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String budg_clsf;
	public String basi_yymm;
	public String amt;
	public String slip_clsf;
	public String seq;
	public String subseq;
	public String dd_clos_yn;
	public String remk;

	public PL_COM_1300_MCRDT_PTCRCURRecord(){}

	public void setBudg_clsf(String budg_clsf){
		this.budg_clsf = budg_clsf;
	}

	public void setBasi_yymm(String basi_yymm){
		this.basi_yymm = basi_yymm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSubseq(String subseq){
		this.subseq = subseq;
	}

	public void setDd_clos_yn(String dd_clos_yn){
		this.dd_clos_yn = dd_clos_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBudg_clsf(){
		return this.budg_clsf;
	}

	public String getBasi_yymm(){
		return this.basi_yymm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSubseq(){
		return this.subseq;
	}

	public String getDd_clos_yn(){
		return this.dd_clos_yn;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Apr 22 20:01:20 KST 2009 */