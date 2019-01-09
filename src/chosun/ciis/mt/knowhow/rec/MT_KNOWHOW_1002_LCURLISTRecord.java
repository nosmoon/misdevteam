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


package chosun.ciis.mt.knowhow.rec;

import java.sql.*;
import chosun.ciis.mt.knowhow.dm.*;
import chosun.ciis.mt.knowhow.ds.*;

/**
 * 
 */


public class MT_KNOWHOW_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String question;
	public String answer;
	public String reg_dt;
	public String qust_emp_nm;
	public String ans_emp_nm;
	public String lcls;
	public String reg_seq;
	public String qna;
	public String seq;

	public MT_KNOWHOW_1002_LCURLISTRecord(){}

	public void setQuestion(String question){
		this.question = question;
	}

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setQust_emp_nm(String qust_emp_nm){
		this.qust_emp_nm = qust_emp_nm;
	}

	public void setAns_emp_nm(String ans_emp_nm){
		this.ans_emp_nm = ans_emp_nm;
	}

	public void setLcls(String lcls){
		this.lcls = lcls;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setQna(String qna){
		this.qna = qna;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getQuestion(){
		return this.question;
	}

	public String getAnswer(){
		return this.answer;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getQust_emp_nm(){
		return this.qust_emp_nm;
	}

	public String getAns_emp_nm(){
		return this.ans_emp_nm;
	}

	public String getLcls(){
		return this.lcls;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getQna(){
		return this.qna;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Wed Jun 10 13:20:24 KST 2009 */