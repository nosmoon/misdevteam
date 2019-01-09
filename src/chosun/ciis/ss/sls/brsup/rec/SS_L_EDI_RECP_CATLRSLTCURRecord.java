/***************************************************************************************************
 * 파일명   : SS_L_EDI_RECP_CATLRSLTCURRecord.java
 * 기능     : 지국지원-빌링-지로EDI 수납결과목록(header)
 * 작성일자 : 2007/02/21
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
**  SP_SS_L_EDI_RECP_CATL
**/

public class SS_L_EDI_RECP_CATLRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String acqno;
	public String girono;
	public int totalamt;
	public int normamt;
	public int normnoit;
	public int rejectnoit;
	public int girocoms;
	public String recpclsfnm;
	public String rcpmrflendyn;

	public SS_L_EDI_RECP_CATLRSLTCURRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setTotalamt(int totalamt){
		this.totalamt = totalamt;
	}

	public void setNormamt(int normamt){
		this.normamt = normamt;
	}

	public void setNormnoit(int normnoit){
		this.normnoit = normnoit;
	}

	public void setRejectnoit(int rejectnoit){
		this.rejectnoit = rejectnoit;
	}

	public void setGirocoms(int girocoms){
		this.girocoms = girocoms;
	}

	public void setRecpclsfnm(String recpclsfnm){
		this.recpclsfnm = recpclsfnm;
	}

	public void setRcpmrflendyn(String rcpmrflendyn){
		this.rcpmrflendyn = rcpmrflendyn;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAcqno(){
		return this.acqno;
	}

	public String getGirono(){
		return this.girono;
	}

	public int getTotalamt(){
		return this.totalamt;
	}

	public int getNormamt(){
		return this.normamt;
	}

	public int getNormnoit(){
		return this.normnoit;
	}

	public int getRejectnoit(){
		return this.rejectnoit;
	}

	public int getGirocoms(){
		return this.girocoms;
	}

	public String getRecpclsfnm(){
		return this.recpclsfnm;
	}

	public String getRcpmrflendyn(){
		return this.rcpmrflendyn;
	}
}

/* 작성시간 : Wed Feb 21 11:40:15 KST 2007 */