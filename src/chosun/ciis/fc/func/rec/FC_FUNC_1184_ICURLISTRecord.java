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


public class FC_FUNC_1184_ICURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rv_out_rv;
	public String rv_out_cashamt;
	public String rv_slip_no;
	public String rv_out_eecnt;
	public String rv_out_msg;
	public String rv_slip_occr_dt;
	public String rv_slip_clsf_cd;
	public String rv_slip_seq;

	public FC_FUNC_1184_ICURLISTRecord(){}

	public void setRv_out_rv(String rv_out_rv){
		this.rv_out_rv = rv_out_rv;
	}

	public void setRv_out_cashamt(String rv_out_cashamt){
		this.rv_out_cashamt = rv_out_cashamt;
	}

	public void setRv_slip_no(String rv_slip_no){
		this.rv_slip_no = rv_slip_no;
	}

	public void setRv_out_eecnt(String rv_out_eecnt){
		this.rv_out_eecnt = rv_out_eecnt;
	}

	public void setRv_out_msg(String rv_out_msg){
		this.rv_out_msg = rv_out_msg;
	}

	public void setRv_slip_occr_dt(String rv_slip_occr_dt){
		this.rv_slip_occr_dt = rv_slip_occr_dt;
	}

	public void setRv_slip_clsf_cd(String rv_slip_clsf_cd){
		this.rv_slip_clsf_cd = rv_slip_clsf_cd;
	}

	public void setRv_slip_seq(String rv_slip_seq){
		this.rv_slip_seq = rv_slip_seq;
	}

	public String getRv_out_rv(){
		return this.rv_out_rv;
	}

	public String getRv_out_cashamt(){
		return this.rv_out_cashamt;
	}

	public String getRv_slip_no(){
		return this.rv_slip_no;
	}

	public String getRv_out_eecnt(){
		return this.rv_out_eecnt;
	}

	public String getRv_out_msg(){
		return this.rv_out_msg;
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

/* 작성시간 : Fri Mar 27 12:53:08 KST 2009 */