/***************************************************************************************************
 * 파일명   : SP_SL_L_COMM_APT_THRW.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  투입율조사-현황등록
**/

public class SL_L_COMM_APT_THRWTHRWLISTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bocd;
	public String invsgdt;
	public String invsgno;
	public String invsghhmm;
	public String addrnm;
	public String invsgpers;
	public String addrcd;
	public String dongno;
	public String regdt;

	public SL_L_COMM_APT_THRWTHRWLISTCURRecord(){}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setInvsghhmm(String invsghhmm){
		this.invsghhmm = invsghhmm;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getInvsghhmm(){
		return this.invsghhmm;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getRegdt(){
		return this.regdt;
	}
}

/* 작성시간 : Mon Mar 13 13:34:21 KST 2006 */