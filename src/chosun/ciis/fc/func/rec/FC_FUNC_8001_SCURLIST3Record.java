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


public class FC_FUNC_8001_SCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String leas_clsf_cd;
	public String leas_no;
	public String loss_dt;
	public String expt_loss_amt;
	public String fix_loss_amt;

	public FC_FUNC_8001_SCURLIST3Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setLeas_clsf_cd(String leas_clsf_cd){
		this.leas_clsf_cd = leas_clsf_cd;
	}

	public void setLeas_no(String leas_no){
		this.leas_no = leas_no;
	}

	public void setLoss_dt(String loss_dt){
		this.loss_dt = loss_dt;
	}

	public void setExpt_loss_amt(String expt_loss_amt){
		this.expt_loss_amt = expt_loss_amt;
	}

	public void setFix_loss_amt(String fix_loss_amt){
		this.fix_loss_amt = fix_loss_amt;
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

	public String getLoss_dt(){
		return this.loss_dt;
	}

	public String getExpt_loss_amt(){
		return this.expt_loss_amt;
	}

	public String getFix_loss_amt(){
		return this.fix_loss_amt;
	}
}

/* 작성시간 : Wed Mar 18 13:06:50 KST 2009 */