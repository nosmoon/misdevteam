/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.rec;

import java.sql.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.ds.*;

/**
 * 
 */


public class SE_SAL_2560_ASENDLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String col;
	public String slip_occr_dt;
	public String slip_occr_cd;
	public String slip_seq;

	public SE_SAL_2560_ASENDLISTRecord(){}

	public void setCol(String col){
		this.col = col;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_occr_cd(String slip_occr_cd){
		this.slip_occr_cd = slip_occr_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public String getCol(){
		return this.col;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_occr_cd(){
		return this.slip_occr_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}
}

/* 작성시간 : Wed Jul 22 20:30:58 KST 2009 */