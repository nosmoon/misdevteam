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


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_4041_PCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String seq_1;
	public String compnm_1;
	public String amt1_1;
	public String amt2_1;
	public String amt3_1;
	public String seq_2;
	public String compnm_2;
	public String amt1_2;
	public String amt2_2;
	public String amt3_2;

	public FC_ACCT_4041_PCURLIST2Record(){}

	public void setSeq_1(String seq_1){
		this.seq_1 = seq_1;
	}

	public void setCompnm_1(String compnm_1){
		this.compnm_1 = compnm_1;
	}

	public void setAmt1_1(String amt1_1){
		this.amt1_1 = amt1_1;
	}

	public void setAmt2_1(String amt2_1){
		this.amt2_1 = amt2_1;
	}

	public void setAmt3_1(String amt3_1){
		this.amt3_1 = amt3_1;
	}

	public void setSeq_2(String seq_2){
		this.seq_2 = seq_2;
	}

	public void setCompnm_2(String compnm_2){
		this.compnm_2 = compnm_2;
	}

	public void setAmt1_2(String amt1_2){
		this.amt1_2 = amt1_2;
	}

	public void setAmt2_2(String amt2_2){
		this.amt2_2 = amt2_2;
	}

	public void setAmt3_2(String amt3_2){
		this.amt3_2 = amt3_2;
	}

	public String getSeq_1(){
		return this.seq_1;
	}

	public String getCompnm_1(){
		return this.compnm_1;
	}

	public String getAmt1_1(){
		return this.amt1_1;
	}

	public String getAmt2_1(){
		return this.amt2_1;
	}

	public String getAmt3_1(){
		return this.amt3_1;
	}

	public String getSeq_2(){
		return this.seq_2;
	}

	public String getCompnm_2(){
		return this.compnm_2;
	}

	public String getAmt1_2(){
		return this.amt1_2;
	}

	public String getAmt2_2(){
		return this.amt2_2;
	}

	public String getAmt3_2(){
		return this.amt3_2;
	}
}

/* 작성시간 : Thu Aug 06 18:08:40 KST 2009 */