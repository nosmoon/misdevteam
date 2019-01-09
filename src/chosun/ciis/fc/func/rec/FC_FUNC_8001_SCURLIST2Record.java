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


public class FC_FUNC_8001_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String note_no;
	public String amt;
	public String expt_widr_dt;

	public FC_FUNC_8001_SCURLIST2Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setExpt_widr_dt(String expt_widr_dt){
		this.expt_widr_dt = expt_widr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getLeas_clsf_cd(){
		return this.leas_clsf_cd;
	}

	public String getLeas_no(){
		return this.leas_no;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getExpt_widr_dt(){
		return this.expt_widr_dt;
	}
}

/* 작성시간 : Wed Mar 18 13:06:50 KST 2009 */