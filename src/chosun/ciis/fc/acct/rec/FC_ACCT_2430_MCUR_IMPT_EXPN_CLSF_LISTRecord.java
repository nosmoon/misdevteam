/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_ACCT_2430_MCUR_IMPT_EXPN_CLSF_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String cd;

	public FC_ACCT_2430_MCUR_IMPT_EXPN_CLSF_LISTRecord(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* 작성시간 : Thu Feb 19 14:50:13 KST 2009 */