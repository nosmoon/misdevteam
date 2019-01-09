/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
 * 
 */


public class SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String medicd;
	public String subsuprc;
	public String subsqty;

	public SS_SLS_BRMGR_2851_LMEDIPRICELISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setSubsuprc(String subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setSubsqty(String subsqty){
		this.subsqty = subsqty;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getSubsuprc(){
		return this.subsuprc;
	}

	public String getSubsqty(){
		return this.subsqty;
	}
}

/* 작성시간 : Thu Feb 23 11:34:09 KST 2017 */