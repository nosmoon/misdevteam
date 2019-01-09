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


public class FC_FUNC_8131_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String pymt_plan_dt;
	public String pymt_plan_prcp_bal;
	public String pymt_plan_prcp;
	public String pymt_plan_int;
	public String bal;
	public String slip_no;

	public FC_FUNC_8131_LCURLIST2Record(){}

	public void setPymt_plan_dt(String pymt_plan_dt){
		this.pymt_plan_dt = pymt_plan_dt;
	}

	public void setPymt_plan_prcp_bal(String pymt_plan_prcp_bal){
		this.pymt_plan_prcp_bal = pymt_plan_prcp_bal;
	}

	public void setPymt_plan_prcp(String pymt_plan_prcp){
		this.pymt_plan_prcp = pymt_plan_prcp;
	}

	public void setPymt_plan_int(String pymt_plan_int){
		this.pymt_plan_int = pymt_plan_int;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getPymt_plan_dt(){
		return this.pymt_plan_dt;
	}

	public String getPymt_plan_prcp_bal(){
		return this.pymt_plan_prcp_bal;
	}

	public String getPymt_plan_prcp(){
		return this.pymt_plan_prcp;
	}

	public String getPymt_plan_int(){
		return this.pymt_plan_int;
	}

	public String getBal(){
		return this.bal;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* 작성시간 : Thu Apr 09 13:44:11 KST 2009 */