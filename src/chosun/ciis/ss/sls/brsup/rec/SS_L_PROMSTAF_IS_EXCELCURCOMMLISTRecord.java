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


public class SS_L_PROMSTAF_IS_EXCELCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String jursareanm;
	public String stafnm;
	public String stafno;
	public String prn;
	public String ptphno;
	public String stafclsfnm;
	public String kdcntrdt;
	public String kdexpdt;

	public SS_L_PROMSTAF_IS_EXCELCURCOMMLISTRecord(){}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public void setStafclsfnm(String stafclsfnm){
		this.stafclsfnm = stafclsfnm;
	}

	public void setKdcntrdt(String kdcntrdt){
		this.kdcntrdt = kdcntrdt;
	}

	public void setKdexpdt(String kdexpdt){
		this.kdexpdt = kdexpdt;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtphno(){
		return this.ptphno;
	}

	public String getStafclsfnm(){
		return this.stafclsfnm;
	}

	public String getKdcntrdt(){
		return this.kdcntrdt;
	}

	public String getKdexpdt(){
		return this.kdexpdt;
	}
}

/* 작성시간 : Thu May 19 15:59:47 KST 2016 */