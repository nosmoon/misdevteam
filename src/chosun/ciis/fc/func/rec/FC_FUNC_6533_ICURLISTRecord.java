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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_6533_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rv_slip_occr_dt;
	public String rv_slip_clsf_cd;
	public String rv_slip_seq;

	public FC_FUNC_6533_ICURLISTRecord(){}

	public void setRv_slip_occr_dt(String rv_slip_occr_dt){
		this.rv_slip_occr_dt = rv_slip_occr_dt;
	}

	public void setRv_slip_clsf_cd(String rv_slip_clsf_cd){
		this.rv_slip_clsf_cd = rv_slip_clsf_cd;
	}

	public void setRv_slip_seq(String rv_slip_seq){
		this.rv_slip_seq = rv_slip_seq;
	}

	public String getRv_slip_occr_dt(){
		return this.rv_slip_occr_dt;
	}

	public String getRv_slip_clsf_cd(){
		return this.rv_slip_clsf_cd;
	}

	public String getRv_slip_seq(){
		return this.rv_slip_seq;
	}
}

/* 작성시간 : Tue Mar 17 17:42:51 KST 2009 */