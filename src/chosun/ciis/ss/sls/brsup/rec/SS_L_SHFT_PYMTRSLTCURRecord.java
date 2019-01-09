/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMTRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부자목록
* 작성일자 : 2004-04-01
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
 * 지국업무지원-Billing자동이체-납부자관리-납부자목록
 *
 */


public class SS_L_SHFT_PYMTRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String pymtseq;
	public String shftclsf;
	public String shftclsfnm;
	public String prn;
	public String pymtnm;
	public String acctno;
	public String cardno;
	public String cnfm;

	public SS_L_SHFT_PYMTRSLTCURRecord(){}

	public void setPymtseq(String pymtseq){
		this.pymtseq = pymtseq;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setCnfm(String cnfm){
		this.cnfm = cnfm;
	}

	public String getPymtseq(){
		return this.pymtseq;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getCnfm(){
		return this.cnfm;
	}
}

/* 작성시간 : Fri Apr 09 13:58:55 KST 2004 */