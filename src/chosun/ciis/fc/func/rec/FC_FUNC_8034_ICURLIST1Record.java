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


public class FC_FUNC_8034_ICURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String flu_altn_slip_occr_dt;
	public String flu_altn_slip_clsf_cd;
	public String flu_altn_slip_seq;

	public FC_FUNC_8034_ICURLIST1Record(){}

	public void setFlu_altn_slip_occr_dt(String flu_altn_slip_occr_dt){
		this.flu_altn_slip_occr_dt = flu_altn_slip_occr_dt;
	}

	public void setFlu_altn_slip_clsf_cd(String flu_altn_slip_clsf_cd){
		this.flu_altn_slip_clsf_cd = flu_altn_slip_clsf_cd;
	}

	public void setFlu_altn_slip_seq(String flu_altn_slip_seq){
		this.flu_altn_slip_seq = flu_altn_slip_seq;
	}

	public String getFlu_altn_slip_occr_dt(){
		return this.flu_altn_slip_occr_dt;
	}

	public String getFlu_altn_slip_clsf_cd(){
		return this.flu_altn_slip_clsf_cd;
	}

	public String getFlu_altn_slip_seq(){
		return this.flu_altn_slip_seq;
	}
}

/* 작성시간 : Thu May 28 15:15:30 KST 2009 */