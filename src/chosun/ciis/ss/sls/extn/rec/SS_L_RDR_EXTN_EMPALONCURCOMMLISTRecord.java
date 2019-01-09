/***************************************************************************************************
* 파일명 : SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord.java
* 기능 : 사원확장 수당 목록을 위한 Record
* 작성일자 : 2003-12-15
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
 * class definition
 *
 */


public class SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String campnm;
	public String rdr_extncampno;
	public String frdt;
	public String todt;
	public String empseq;
	public String empnm;
	public String empcmpynm;
	public String empdeptnm;
	public int alonamt;
	public String payyn;
	public String paydt;

	public SS_L_RDR_EXTN_EMPALONCURCOMMLISTRecord(){}

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

	public void setAlonamt(int alonamt){
		this.alonamt = alonamt;
	}

	public void setPayyn(String payyn){
		this.payyn = payyn;
	}

	public void setPaydt(String paydt){
		this.paydt = paydt;
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

	public int getAlonamt(){
		return this.alonamt;
	}

	public String getPayyn(){
		return this.payyn;
	}

	public String getPaydt(){
		return this.paydt;
	}
}

/* 작성시간 : Tue Dec 16 11:53:45 KST 2003 */