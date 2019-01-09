/***************************************************************************************************
* 파일명 : SS_L_EDI_RECP_RJCTRSLTCURRecord.java
* 기능 : 지로EDI Reject목록조회
* 작성일자 : 2004-03-10
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지로EDI Reject목록조회
 *
 */


public class SS_L_EDI_RECP_RJCTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String acqno;
	public String girono;
	public String seq;
	public String recpdt;
	public int amt;
	public String recpclsf;
	public String custbrwsno;

	public SS_L_EDI_RECP_RJCTRSLTCURRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public void setCustbrwsno(String custbrwsno){
		this.custbrwsno = custbrwsno;
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

	public String getSeq(){
		return this.seq;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getCustbrwsno(){
		return this.custbrwsno;
	}
}

/* 작성시간 : Wed Mar 10 17:04:02 KST 2004 */