/***************************************************************************************************
* 파일명 : PS_L_CASHRCPT.java
* 기능   : 불편관리 - 현금영수증 신청리스트
* 작성일자 : 2005-12-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편관리 - 현금영수증 신청리스트
 *
 */

public class PS_L_CASHRCPTCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String acqnm;
	public String incmgdt;
	public String aplcpers;
	public String prn;
	public String ptphno;
	public String medicd;
	public String medinm;
	public String rcptclsfnm;
	public String aplcpathnm;
	public int rnum;

	public PS_L_CASHRCPTCURCOMMLISTRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setAplcpers(String aplcpers){
		this.aplcpers = aplcpers;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setPtphno(String ptphno){
		this.ptphno = ptphno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRcptclsfnm(String rcptclsfnm){
		this.rcptclsfnm = rcptclsfnm;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRnum(int rnum){
		this.rnum = rnum;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getAplcpers(){
		return this.aplcpers;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getPtphno(){
		return this.ptphno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRcptclsfnm(){
		return this.rcptclsfnm;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public int getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Fri Dec 23 15:42:59 KST 2005 */