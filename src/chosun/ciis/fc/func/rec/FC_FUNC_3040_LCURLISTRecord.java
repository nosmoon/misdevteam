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


public class FC_FUNC_3040_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String busn_dt;
	public String in_cash;
	public String in_note;
	public String in_tot;
	public String out_amt;
	public String mtry_amt;
	public String entry_amt;
	public String bal_amt;
	public String bal_amt2;

	public FC_FUNC_3040_LCURLISTRecord(){}

	public void setBusn_dt(String busn_dt){
		this.busn_dt = busn_dt;
	}

	public void setIn_cash(String in_cash){
		this.in_cash = in_cash;
	}

	public void setIn_note(String in_note){
		this.in_note = in_note;
	}

	public void setIn_tot(String in_tot){
		this.in_tot = in_tot;
	}

	public void setOut_amt(String out_amt){
		this.out_amt = out_amt;
	}

	public void setMtry_amt(String mtry_amt){
		this.mtry_amt = mtry_amt;
	}

	public void setEntry_amt(String entry_amt){
		this.entry_amt = entry_amt;
	}

	public void setBal_amt(String bal_amt){
		this.bal_amt = bal_amt;
	}

	public void setBal_amt2(String bal_amt2){
		this.bal_amt2 = bal_amt2;
	}

	public String getBusn_dt(){
		return this.busn_dt;
	}

	public String getIn_cash(){
		return this.in_cash;
	}

	public String getIn_note(){
		return this.in_note;
	}

	public String getIn_tot(){
		return this.in_tot;
	}

	public String getOut_amt(){
		return this.out_amt;
	}

	public String getMtry_amt(){
		return this.mtry_amt;
	}

	public String getEntry_amt(){
		return this.entry_amt;
	}

	public String getBal_amt(){
		return this.bal_amt;
	}

	public String getBal_amt2(){
		return this.bal_amt2;
	}
}

/* 작성시간 : Thu Apr 02 12:07:46 KST 2009 */