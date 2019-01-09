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


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_SLS_EXTN_5601_LUSERLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String extnnm;
	public String cmpynm;
	public String teamnm;
	public String empseq;

	public SS_SLS_EXTN_5601_LUSERLISTRecord(){}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setTeamnm(String teamnm){
		this.teamnm = teamnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getTeamnm(){
		return this.teamnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}
}

/* 작성시간 : Mon Jan 08 16:45:56 KST 2018 */