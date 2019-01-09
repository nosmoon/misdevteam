/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_EXTN_PATY_NEWUSERLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String empseq;
	public String cmpycd;
	public String prn;
	public String empnm;
	public String deptnm;

	public SS_L_EXTN_PATY_NEWUSERLISTRecord(){}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* 작성시간 : Mon Jun 04 14:30:59 KST 2012 */