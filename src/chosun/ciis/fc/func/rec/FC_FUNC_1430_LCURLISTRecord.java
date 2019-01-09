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


public class FC_FUNC_1430_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String busn_dt;
	public String busn_dd_clsf_cd;
	public String amt1;
	public String amt2;
	public String amt3;
	public String amt4;
	public String amt5;
	public String amt6;
	public String sumamt;

	public FC_FUNC_1430_LCURLISTRecord(){}

	public void setBusn_dt(String busn_dt){
		this.busn_dt = busn_dt;
	}

	public void setBusn_dd_clsf_cd(String busn_dd_clsf_cd){
		this.busn_dd_clsf_cd = busn_dd_clsf_cd;
	}

	public void setAmt1(String amt1){
		this.amt1 = amt1;
	}

	public void setAmt2(String amt2){
		this.amt2 = amt2;
	}

	public void setAmt3(String amt3){
		this.amt3 = amt3;
	}

	public void setAmt4(String amt4){
		this.amt4 = amt4;
	}

	public void setAmt5(String amt5){
		this.amt5 = amt5;
	}

	public void setAmt6(String amt6){
		this.amt6 = amt6;
	}


	public void setSumamt(String sumamt){
		this.sumamt = sumamt;
	}

	public String getBusn_dt(){
		return this.busn_dt;
	}

	public String getBusn_dd_clsf_cd(){
		return this.busn_dd_clsf_cd;
	}

	public String getAmt1(){
		return this.amt1;
	}

	public String getAmt2(){
		return this.amt2;
	}

	public String getAmt3(){
		return this.amt3;
	}

	public String getAmt4(){
		return this.amt4;
	}

	public String getAmt5(){
		return this.amt5;
	}

	public String getAmt6(){
		return this.amt6;
	}

	public String getSumamt(){
		return this.sumamt;
	}
}

/* 작성시간 : Fri May 01 14:35:41 KST 2009 */