/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-채권채무 확정대상연결 (초기화면)
* 작성일자 : 2015.01.05
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


public class FC_ACCT_2640_MCUR_CLSF_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_clsf_nm;

	public FC_ACCT_2640_MCUR_CLSF_LISTRecord(){}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_clsf_nm(String dlco_clsf_nm){
		this.dlco_clsf_nm = dlco_clsf_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_clsf_nm(){
		return this.dlco_clsf_nm;
	}
}

/* 작성시간 : Mon Jan 05 11:28:30 KST 2015 */