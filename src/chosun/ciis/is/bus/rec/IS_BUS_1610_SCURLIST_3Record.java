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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1610_SCURLIST_3Record extends java.lang.Object implements java.io.Serializable{

	public String purc_dlco_nm;
	public String jun_amt_2;
	public String dan_amt_1;
	public String icr_rate;
	public String icr_amt;

	public IS_BUS_1610_SCURLIST_3Record(){}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
	}

	public void setJun_amt_2(String jun_amt_2){
		this.jun_amt_2 = jun_amt_2;
	}

	public void setDan_amt_1(String dan_amt_1){
		this.dan_amt_1 = dan_amt_1;
	}

	public void setIcr_rate(String icr_rate){
		this.icr_rate = icr_rate;
	}

	public void setIcr_amt(String icr_amt){
		this.icr_amt = icr_amt;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
	}

	public String getJun_amt_2(){
		return this.jun_amt_2;
	}

	public String getDan_amt_1(){
		return this.dan_amt_1;
	}

	public String getIcr_rate(){
		return this.icr_rate;
	}

	public String getIcr_amt(){
		return this.icr_amt;
	}
}

/* 작성시간 : Tue Jun 19 18:11:56 KST 2012 */