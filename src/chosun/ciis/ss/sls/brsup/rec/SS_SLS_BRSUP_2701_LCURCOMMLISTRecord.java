/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */


public class SS_SLS_BRSUP_2701_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tr_il;
	public String banknm;
	public String iacct_no;
	public String iacct_nm;
	public String tr_amt;

	public SS_SLS_BRSUP_2701_LCURCOMMLISTRecord(){}

	public void setTr_il(String tr_il){
		this.tr_il = tr_il;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setIacct_no(String iacct_no){
		this.iacct_no = iacct_no;
	}

	public void setIacct_nm(String iacct_nm){
		this.iacct_nm = iacct_nm;
	}

	public void setTr_amt(String tr_amt){
		this.tr_amt = tr_amt;
	}

	public String getTr_il(){
		return this.tr_il;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getIacct_no(){
		return this.iacct_no;
	}

	public String getIacct_nm(){
		return this.iacct_nm;
	}

	public String getTr_amt(){
		return this.tr_amt;
	}
}

/* 작성시간 : Tue Jul 26 14:40:14 KST 2016 */