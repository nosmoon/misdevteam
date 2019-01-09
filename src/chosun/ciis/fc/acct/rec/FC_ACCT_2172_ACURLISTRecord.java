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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2172_ACURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String col;
	public String slip_occr_dt;
	public String slip_occr_cd;
	public String slip_seq;

	public FC_ACCT_2172_ACURLISTRecord(){}

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

/* 작성시간 : Fri Aug 14 10:07:22 KST 2009 */