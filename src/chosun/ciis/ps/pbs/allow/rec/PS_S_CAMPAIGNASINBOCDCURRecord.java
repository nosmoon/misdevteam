/***************************************************************************************************
* 파일명 : SP_PS_S_CAMPAIGN.java
* 수당-캠페인관리 캠페인 상세조회
* 작성일자 : 2004-03-08
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.allow.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.allow.dm.*;
import chosun.ciis.ps.pbs.allow.ds.*;

/**
 * 수당-캠페인관리 캠페인 상세조회
 *
 */ 

  

public class PS_S_CAMPAIGNASINBOCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String bonm;
	public String deptcd;
	public String sellnetclsf;

	public PS_S_CAMPAIGNASINBOCDCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setSellnetclsf(String sellnetclsf){
		this.sellnetclsf = sellnetclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getSellnetclsf(){
		return this.sellnetclsf;
	}
}

/* 작성시간 : Thu Mar 11 17:44:23 KST 2004 */