/***************************************************************************************************
* 파일명 : SS_L_EDI_RCPM_CATLRSLTCURRecord.java
* 기능 : 지로EDI 입금처리결과 목록조회
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
 * 지로EDI 입금처리결과 목록조회
 *
 */


public class SS_L_EDI_RCPM_CATLRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String acqdt;
	public String recpdt;
	public String rdr_no;
	public String rdrnm;
	public String medinm;
	public String subsmappli;
	public int amt;
	public String rcpmstat;
	public String remk;

	public SS_L_EDI_RCPM_CATLRSLTCURRecord(){}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setRecpdt(String recpdt){
		this.recpdt = recpdt;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSubsmappli(String subsmappli){
		this.subsmappli = subsmappli;
	}

	public void setAmt(int amt){
		this.amt = amt;
	}

	public void setRcpmstat(String rcpmstat){
		this.rcpmstat = rcpmstat;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getRecpdt(){
		return this.recpdt;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSubsmappli(){
		return this.subsmappli;
	}

	public int getAmt(){
		return this.amt;
	}

	public String getRcpmstat(){
		return this.rcpmstat;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Mar 10 15:47:12 KST 2004 */