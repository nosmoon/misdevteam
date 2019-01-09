/***************************************************************************************************
* 파일명 : .java
* 기능 : 연결재무제표-내부거래대상 초기화면
* 작성일자 : 2014.11.20
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


public class FC_ACCT_2610_MCUR_CLSF_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd;
	public String dlco_clsf_nm;

	public FC_ACCT_2610_MCUR_CLSF_LISTRecord(){}

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

/* 작성시간 : Wed Nov 26 10:13:08 KST 2014 */