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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1120_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String advcs_nm;
	public String pubc_amt;
	public String rcpm_amt;
	public String rcpm_rate;
	public String vexc_fee;
	public String avg_due_dd;
	public String colt_rate;

	public AD_BAS_1120_LCURLISTRecord(){}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setPubc_amt(String pubc_amt){
		this.pubc_amt = pubc_amt;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setRcpm_rate(String rcpm_rate){
		this.rcpm_rate = rcpm_rate;
	}

	public void setVexc_fee(String vexc_fee){
		this.vexc_fee = vexc_fee;
	}

	public void setAvg_due_dd(String avg_due_dd){
		this.avg_due_dd = avg_due_dd;
	}

	public void setColt_rate(String colt_rate){
		this.colt_rate = colt_rate;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getPubc_amt(){
		return this.pubc_amt;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getRcpm_rate(){
		return this.rcpm_rate;
	}

	public String getVexc_fee(){
		return this.vexc_fee;
	}

	public String getAvg_due_dd(){
		return this.avg_due_dd;
	}

	public String getColt_rate(){
		return this.colt_rate;
	}
}

/* 작성시간 : Tue Dec 11 16:57:17 KST 2012 */