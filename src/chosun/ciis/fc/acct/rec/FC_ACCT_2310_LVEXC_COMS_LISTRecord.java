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

public class FC_ACCT_2310_LVEXC_COMS_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vexc_cmpy_cd;
	public String dlco_nm;
	public String suply_amt;
	public String pch_amt1;
	public String pch_amt2;

	public FC_ACCT_2310_LVEXC_COMS_LISTRecord(){}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setPch_amt1(String pch_amt1){
		this.pch_amt1 = pch_amt1;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getPch_amt1(){
		return this.pch_amt1;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
	}
}

/* 작성시간 : Tue Feb 17 19:59:21 KST 2009 */
