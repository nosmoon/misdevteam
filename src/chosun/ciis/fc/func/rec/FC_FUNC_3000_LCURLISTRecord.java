/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_3000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String busn_dt;
	public String week_day;
	public String in_cash;
	public String sumamt;
	public String in_tot;
	public String out_amt;
	public String mtry_amt;
	public String entry_amt;
	public String bal_amt;
	public String bal_amt2;

	public FC_FUNC_3000_LCURLISTRecord(){}

	public void setBusn_dt(String busn_dt){
		this.busn_dt = busn_dt;
	}

	public void setWeek_day(String week_day){
		this.week_day = week_day;
	}

	public void setIn_cash(String in_cash){
		this.in_cash = in_cash;
	}

	public void setSumamt(String sumamt){
		this.sumamt = sumamt;
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

	public String getWeek_day(){
		return this.week_day;
	}

	public String getIn_cash(){
		return this.in_cash;
	}

	public String getSumamt(){
		return this.sumamt;
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

/* �ۼ��ð� : Tue Jul 14 18:11:54 KST 2009 */