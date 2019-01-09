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


public class SS_SLS_EXTN_4901_LCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpycd;
	public String cmpynm;
	public String officd;
	public String offinm;
	public String deptcd;
	public String deptnm;

	public SS_SLS_EXTN_4901_LCURCOMMLISTRecord(){}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setOfficd(String officd){
		this.officd = officd;
	}

	public void setOffinm(String offinm){
		this.offinm = offinm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getOfficd(){
		return this.officd;
	}

	public String getOffinm(){
		return this.offinm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}
}

/* 작성시간 : Fri Jul 22 10:20:51 KST 2016 */