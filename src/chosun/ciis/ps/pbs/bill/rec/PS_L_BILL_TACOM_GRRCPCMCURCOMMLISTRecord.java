/***************************************************************************************************
* 파일명 : PS_L_BILL_TACOM_GRRCPCM.java
* 수금-일괄입금 조회화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :     
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/** 
 * 수금-일괄입금 조회화면   
 * 
 */

public class PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String acqno;
	public String girono;
	public int normnoit;
	public int normamt;
	public int rejectnoit;
	public int rejectamt;
	public int intngironoit;
	public int intngiroamt;
	public String rmsgdt;
	public String rcpmrflendyn;
	public String incmgdt;

	public PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setGirono(String girono){
		this.girono = girono;
	}

	public void setNormnoit(int normnoit){
		this.normnoit = normnoit;
	}

	public void setNormamt(int normamt){
		this.normamt = normamt;
	}

	public void setRejectnoit(int rejectnoit){
		this.rejectnoit = rejectnoit;
	}

	public void setRejectamt(int rejectamt){
		this.rejectamt = rejectamt;
	}

	public void setIntngironoit(int intngironoit){
		this.intngironoit = intngironoit;
	}

	public void setIntngiroamt(int intngiroamt){
		this.intngiroamt = intngiroamt;
	}

	public void setRmsgdt(String rmsgdt){
		this.rmsgdt = rmsgdt;
	}

	public void setRcpmrflendyn(String rcpmrflendyn){
		this.rcpmrflendyn = rcpmrflendyn;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
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

	public int getNormnoit(){
		return this.normnoit;
	}

	public int getNormamt(){
		return this.normamt;
	}

	public int getRejectnoit(){
		return this.rejectnoit;
	}

	public int getRejectamt(){
		return this.rejectamt;
	}

	public int getIntngironoit(){
		return this.intngironoit;
	}

	public int getIntngiroamt(){
		return this.intngiroamt;
	}

	public String getRmsgdt(){
		return this.rmsgdt;
	}

	public String getRcpmrflendyn(){
		return this.rcpmrflendyn;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}
}

/* 작성시간 : Tue Apr 04 14:09:33 KST 2006 */