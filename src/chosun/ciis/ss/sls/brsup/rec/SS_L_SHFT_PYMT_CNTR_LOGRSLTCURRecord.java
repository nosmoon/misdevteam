/***************************************************************************************************
* 파일명 : SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
* 작성일자 : 2004-04-12
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
 * 지국업무지원-Billing자동이체-납부자관리-납부계약 로그내역
 *
 */


public class SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String bocd;
	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String mediynm;
	public int dlvqty;
	public int realsubsamt;
	public String pymtno;
	public String shftbgnyymm;
	public String shftstatclsfcd;
	public String shftstatclsfnm;
	public String subsstat;

	public SS_L_SHFT_PYMT_CNTR_LOGRSLTCURRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMediynm(String mediynm){
		this.mediynm = mediynm;
	}

	public void setDlvqty(int dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setRealsubsamt(int realsubsamt){
		this.realsubsamt = realsubsamt;
	}

	public void setPymtno(String pymtno){
		this.pymtno = pymtno;
	}

	public void setShftbgnyymm(String shftbgnyymm){
		this.shftbgnyymm = shftbgnyymm;
	}

	public void setShftstatclsfcd(String shftstatclsfcd){
		this.shftstatclsfcd = shftstatclsfcd;
	}

	public void setShftstatclsfnm(String shftstatclsfnm){
		this.shftstatclsfnm = shftstatclsfnm;
	}

	public void setSubsstat(String subsstat){
		this.subsstat = subsstat;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMediynm(){
		return this.mediynm;
	}

	public int getDlvqty(){
		return this.dlvqty;
	}

	public int getRealsubsamt(){
		return this.realsubsamt;
	}

	public String getPymtno(){
		return this.pymtno;
	}

	public String getShftbgnyymm(){
		return this.shftbgnyymm;
	}

	public String getShftstatclsfcd(){
		return this.shftstatclsfcd;
	}

	public String getShftstatclsfnm(){
		return this.shftstatclsfnm;
	}

	public String getSubsstat(){
		return this.subsstat;
	}
}

/* 작성시간 : Mon Apr 12 10:24:30 KST 2004 */