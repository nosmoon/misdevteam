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


public class FC_ACCT_2411_LCURAMTRecord extends java.lang.Object implements java.io.Serializable{

	public String fajcbamt;
	public String fajdbamt;
	public String fdajcbamt;
	public String fdajdbamt;
	public String fcbjan;
	public String fdbjan;
	public String bal_clsf;

	public FC_ACCT_2411_LCURAMTRecord(){}

	public void setFajcbamt(String fajcbamt){
		this.fajcbamt = fajcbamt;
	}

	public void setFajdbamt(String fajdbamt){
		this.fajdbamt = fajdbamt;
	}

	public void setFdajcbamt(String fdajcbamt){
		this.fdajcbamt = fdajcbamt;
	}

	public void setFdajdbamt(String fdajdbamt){
		this.fdajdbamt = fdajdbamt;
	}

	public void setFcbjan(String fcbjan){
		this.fcbjan = fcbjan;
	}

	public void setFdbjan(String fdbjan){
		this.fdbjan = fdbjan;
	}

	public void setBal_clsf(String bal_clsf){
		this.bal_clsf = bal_clsf;
	}

	public String getFajcbamt(){
		return this.fajcbamt;
	}

	public String getFajdbamt(){
		return this.fajdbamt;
	}

	public String getFdajcbamt(){
		return this.fdajcbamt;
	}

	public String getFdajdbamt(){
		return this.fdajdbamt;
	}

	public String getFcbjan(){
		return this.fcbjan;
	}

	public String getFdbjan(){
		return this.fdbjan;
	}

	public String getBal_clsf(){
		return this.bal_clsf;
	}
}

/* 작성시간 : Fri Mar 16 17:40:22 KST 2018 */