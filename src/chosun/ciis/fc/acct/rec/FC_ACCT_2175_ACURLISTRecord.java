/***************************************************************************************************
* 파일명 : .java
* 기능 :  회계관리-전표관리-수입결의관리-세금계산서전송(스마트빌)
* 작성일자 : 2010-03-08
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 회계관리-전표관리-수입결의관리-세금계산서전송(스마트빌)
 */


public class FC_ACCT_2175_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String col;
	public String slip_occr_dt;
	public String slip_occr_cd;
	public String slip_seq;

	public FC_ACCT_2175_ACURLISTRecord(){}

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

/* 작성시간 : Mon Mar 08 19:25:25 KST 2010 */