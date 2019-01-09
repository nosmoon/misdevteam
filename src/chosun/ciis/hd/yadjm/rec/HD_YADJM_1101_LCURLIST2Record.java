/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.rec;

import java.sql.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.ds.*;

/**
 * 
 */


public class HD_YADJM_1101_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String txn_std_sctn_1;
	public String txn_std_sctn_2;
	public String rate;
	public String dedu_amt;
	public String seq;

	public HD_YADJM_1101_LCURLIST2Record(){}

	public void setTxn_std_sctn_1(String txn_std_sctn_1){
		this.txn_std_sctn_1 = txn_std_sctn_1;
	}

	public void setTxn_std_sctn_2(String txn_std_sctn_2){
		this.txn_std_sctn_2 = txn_std_sctn_2;
	}

	public void setRate(String rate){
		this.rate = rate;
	}

	public void setDedu_amt(String dedu_amt){
		this.dedu_amt = dedu_amt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getTxn_std_sctn_1(){
		return this.txn_std_sctn_1;
	}

	public String getTxn_std_sctn_2(){
		return this.txn_std_sctn_2;
	}

	public String getRate(){
		return this.rate;
	}

	public String getDedu_amt(){
		return this.dedu_amt;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Aug 19 10:22:51 KST 2009 */