/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord.java
* 기능 : 확장현황-사원확장-수당-목록을 위한 Record
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
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
 * 확장현황-사원확장-수당-목록을 위한 Record
 */

public class SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String campnm;
	public String rdr_extncampno;
	public String frdt;
	public String todt;
	public String empseq;
	public String empnm;
	public String empcmpynm;
	public String empdeptnm;
	public String deps_persnm;
	public String banknm;
	public String acctno;
	public int alonamt;

	public SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord(){}

	public void setCampnm(String campnm){
		this.campnm = campnm;
	}

	public void setRdr_extncampno(String rdr_extncampno){
		this.rdr_extncampno = rdr_extncampno;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setEmpcmpynm(String empcmpynm){
		this.empcmpynm = empcmpynm;
	}

	public void setEmpdeptnm(String empdeptnm){
		this.empdeptnm = empdeptnm;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public String getCampnm(){
		return this.campnm;
	}

	public String getRdr_extncampno(){
		return this.rdr_extncampno;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getEmpcmpynm(){
		return this.empcmpynm;
	}

	public String getEmpdeptnm(){
		return this.empdeptnm;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public int getAlonamt(){
		return this.alonamt;
	}
}

/* 작성시간 : Sat May 08 12:20:07 KST 2004 */