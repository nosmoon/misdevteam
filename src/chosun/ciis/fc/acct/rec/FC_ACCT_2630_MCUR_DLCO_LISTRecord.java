/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무대상조회 초기화면
* 작성일자 : 2014.12.26
* 작성자 : 이혁
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_2630_MCUR_DLCO_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cmpy_cd;
	public String dlco_nm;

	public FC_ACCT_2630_MCUR_DLCO_LISTRecord(){}

	public void setDlco_cmpy_cd(String dlco_cmpy_cd){
		this.dlco_cmpy_cd = dlco_cmpy_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getDlco_cmpy_cd(){
		return this.dlco_cmpy_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}
}

/* 작성시간 : Fri Dec 26 16:50:13 KST 2014 */