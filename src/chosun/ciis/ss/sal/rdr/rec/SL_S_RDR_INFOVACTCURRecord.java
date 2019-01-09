/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 
 */


public class SL_S_RDR_INFOVACTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String bank_cd;
	public String acct_no;

	public SL_S_RDR_INFOVACTCURRecord(){}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}
}

/* 작성시간 : Wed Oct 11 17:10:57 KST 2017 */