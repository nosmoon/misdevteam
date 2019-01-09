/**************************************************************************************************
* 파일명    : .java
* 기능      : 판매국-지국지원-컴퓨터AS
* 작성일자  : 2004-03-12
* 작성자    : 배창희
**************************************************************************************************/
/**************************************************************************************************
* 수정내역  :
* 수정자    :
* 수정일자  :
* 백업      :
**************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 
 */

public class SS_L_ASREQCURASREQLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String eqpno;
	public String regdt;
	public String regno;
	public String as_stat;
	public String acpndt;
	public String nddt;
	public String req_rmk;

	public SS_L_ASREQCURASREQLISTRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setEqpno(String eqpno){
		this.eqpno = eqpno;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setAs_stat(String as_stat){
		this.as_stat = as_stat;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setNddt(String nddt){
		this.nddt = nddt;
	}

	public void setReq_rmk(String req_rmk){
		this.req_rmk = req_rmk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getEqpno(){
		return this.eqpno;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getAs_stat(){
		return this.as_stat;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getNddt(){
		return this.nddt;
	}

	public String getReq_rmk(){
		return this.req_rmk;
	}
}

/* 작성시간 : Fri Mar 12 16:24:16 KST 2004 */