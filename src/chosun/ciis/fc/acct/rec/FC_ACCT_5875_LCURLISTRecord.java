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


public class FC_ACCT_5875_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String slip_clsf_cd;
	public String clos_mm;
	public String bgn_dt;
	public String end_dt;

	public FC_ACCT_5875_LCURLISTRecord(){}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setClos_mm(String clos_mm){
		this.clos_mm = clos_mm;
	}

	public void setBgn_dt(String bgn_dt){
		this.bgn_dt = bgn_dt;
	}

	public void setEnd_dt(String end_dt){
		this.end_dt = end_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getClos_mm(){
		return this.clos_mm;
	}

	public String getBgn_dt(){
		return this.bgn_dt;
	}

	public String getEnd_dt(){
		return this.end_dt;
	}
}

/* 작성시간 : Wed Mar 11 20:47:28 KST 2009 */