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


package chosun.ciis.se.rcp.rec;

import java.sql.*;
import chosun.ciis.se.rcp.dm.*;
import chosun.ciis.se.rcp.ds.*;

/**
 * 
 */


public class SE_RCP_2610_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String cyov_bal;
	public String rcpm_amt;
	public String bal;

	public SE_RCP_2610_LCURLIST3Record(){}

	public void setCyov_bal(String cyov_bal){
		this.cyov_bal = cyov_bal;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setBal(String bal){
		this.bal = bal;
	}

	public String getCyov_bal(){
		return this.cyov_bal;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getBal(){
		return this.bal;
	}
}

/* 작성시간 : Fri Apr 24 10:55:47 KST 2009 */