/***************************************************************************************************
* 파일명 : SS_L_PYMT_CNTRRSLTCURRecord.java
* 기능 : 지국업무지원-Billing자동이체-납부계약목록
* 작성일자 : 2004-03-18
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
 * 지국업무지원-Billing자동이체-납부계약목록
 *
 */


public class SS_L_PYMT_CNTRRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bonm;
	public String rdr_no;
	public String rdrnm;
	public String mediynm;
	public int dlvqty;
	public int realsubsamt;
	public String shftbgnyymm;
	public String shftclsfnm;
	public String shftstatclsfnm;
	public String dlvzip;
	public String dlvaddr;
	public String subsstat;

	public SS_L_PYMT_CNTRRSLTCURRecord(){}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
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

	public void setShftbgnyymm(String shftbgnyymm){
		this.shftbgnyymm = shftbgnyymm;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setShftstatclsfnm(String shftstatclsfnm){
		this.shftstatclsfnm = shftstatclsfnm;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setSubsstat(String subsstat){
		this.subsstat = subsstat;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
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

	public String getShftbgnyymm(){
		return this.shftbgnyymm;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getShftstatclsfnm(){
		return this.shftstatclsfnm;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getSubsstat(){
		return this.subsstat;
	}
}

/* 작성시간 : Mon Mar 22 22:02:33 KST 2004 */