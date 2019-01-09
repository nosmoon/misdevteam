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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1140_LNOTETOTZRecord extends java.lang.Object implements java.io.Serializable{

	public String note_prvdd_bal;
	public String note_thdd_incr;
	public String note_thdd_redu;
	public String note_thdd_bal;
	public String cmpy_prvdd_bal;
	public String cmpy_thdd_incr;
	public String cmpy_thdd_redu;
	public String cmpy_thdd_bal;
	public String icty_prvdd_bal;
	public String icty_thdd_incr;
	public String icty_thdd_redu;
	public String icty_thdd_bal;
	public String lcl_prvdd_bal;
	public String lcl_thdd_incr;
	public String lcl_thdd_redu;
	public String lcl_thdd_bal;
	public String prvdd_bal6;
	public String thdd_incr6;
	public String thdd_redu6;
	public String thdd_bal6;
	public String prvdd_bal7;
	public String thdd_incr7;
	public String thdd_redu7;
	public String thdd_bal7;
	public String bank_prvdd_bal;
	public String bank_thdd_incr;
	public String bank_thdd_redu;
	public String bank_thdd_bal;
	public String clct_ask_prvdd_bal;
	public String clct_ask_thdd_incr;
	public String clct_ask_thdd_redu;
	public String clct_ask_thdd_bal;
	public String dscn_ask_prvdd_bal;
	public String dscn_ask_thdd_incr;
	public String dscn_ask_thdd_redu;
	public String dscn_ask_thdd_bal;
	public String dscn_note_prvdd_bal;
	public String dscn_note_thdd_incr;
	public String dscn_note_thdd_redu;
	public String dscn_note_thdd_bal;
	public String endr_note_prvdd_bal;
	public String endr_note_thdd_incr;
	public String endr_note_thdd_redu;
	public String endr_note_thdd_bal;
	public String elseprvdd_bal;
	public String elsethdd_incr;
	public String elsethdd_redu;
	public String elsethdd_bal;

	public FC_FUNC_1140_LNOTETOTZRecord(){}

	public void setNote_prvdd_bal(String note_prvdd_bal){
		this.note_prvdd_bal = note_prvdd_bal;
	}

	public void setNote_thdd_incr(String note_thdd_incr){
		this.note_thdd_incr = note_thdd_incr;
	}

	public void setNote_thdd_redu(String note_thdd_redu){
		this.note_thdd_redu = note_thdd_redu;
	}

	public void setNote_thdd_bal(String note_thdd_bal){
		this.note_thdd_bal = note_thdd_bal;
	}

	public void setCmpy_prvdd_bal(String cmpy_prvdd_bal){
		this.cmpy_prvdd_bal = cmpy_prvdd_bal;
	}

	public void setCmpy_thdd_incr(String cmpy_thdd_incr){
		this.cmpy_thdd_incr = cmpy_thdd_incr;
	}

	public void setCmpy_thdd_redu(String cmpy_thdd_redu){
		this.cmpy_thdd_redu = cmpy_thdd_redu;
	}

	public void setCmpy_thdd_bal(String cmpy_thdd_bal){
		this.cmpy_thdd_bal = cmpy_thdd_bal;
	}

	public void setIcty_prvdd_bal(String icty_prvdd_bal){
		this.icty_prvdd_bal = icty_prvdd_bal;
	}

	public void setIcty_thdd_incr(String icty_thdd_incr){
		this.icty_thdd_incr = icty_thdd_incr;
	}

	public void setIcty_thdd_redu(String icty_thdd_redu){
		this.icty_thdd_redu = icty_thdd_redu;
	}

	public void setIcty_thdd_bal(String icty_thdd_bal){
		this.icty_thdd_bal = icty_thdd_bal;
	}

	public void setLcl_prvdd_bal(String lcl_prvdd_bal){
		this.lcl_prvdd_bal = lcl_prvdd_bal;
	}

	public void setLcl_thdd_incr(String lcl_thdd_incr){
		this.lcl_thdd_incr = lcl_thdd_incr;
	}

	public void setLcl_thdd_redu(String lcl_thdd_redu){
		this.lcl_thdd_redu = lcl_thdd_redu;
	}

	public void setLcl_thdd_bal(String lcl_thdd_bal){
		this.lcl_thdd_bal = lcl_thdd_bal;
	}

	public void setPrvdd_bal6(String prvdd_bal6){
		this.prvdd_bal6 = prvdd_bal6;
	}

	public void setThdd_incr6(String thdd_incr6){
		this.thdd_incr6 = thdd_incr6;
	}

	public void setThdd_redu6(String thdd_redu6){
		this.thdd_redu6 = thdd_redu6;
	}

	public void setThdd_bal6(String thdd_bal6){
		this.thdd_bal6 = thdd_bal6;
	}

	public void setPrvdd_bal7(String prvdd_bal7){
		this.prvdd_bal7 = prvdd_bal7;
	}

	public void setThdd_incr7(String thdd_incr7){
		this.thdd_incr7 = thdd_incr7;
	}

	public void setThdd_redu7(String thdd_redu7){
		this.thdd_redu7 = thdd_redu7;
	}

	public void setThdd_bal7(String thdd_bal7){
		this.thdd_bal7 = thdd_bal7;
	}

	public void setBank_prvdd_bal(String bank_prvdd_bal){
		this.bank_prvdd_bal = bank_prvdd_bal;
	}

	public void setBank_thdd_incr(String bank_thdd_incr){
		this.bank_thdd_incr = bank_thdd_incr;
	}

	public void setBank_thdd_redu(String bank_thdd_redu){
		this.bank_thdd_redu = bank_thdd_redu;
	}

	public void setBank_thdd_bal(String bank_thdd_bal){
		this.bank_thdd_bal = bank_thdd_bal;
	}

	public void setClct_ask_prvdd_bal(String clct_ask_prvdd_bal){
		this.clct_ask_prvdd_bal = clct_ask_prvdd_bal;
	}

	public void setClct_ask_thdd_incr(String clct_ask_thdd_incr){
		this.clct_ask_thdd_incr = clct_ask_thdd_incr;
	}

	public void setClct_ask_thdd_redu(String clct_ask_thdd_redu){
		this.clct_ask_thdd_redu = clct_ask_thdd_redu;
	}

	public void setClct_ask_thdd_bal(String clct_ask_thdd_bal){
		this.clct_ask_thdd_bal = clct_ask_thdd_bal;
	}

	public void setDscn_ask_prvdd_bal(String dscn_ask_prvdd_bal){
		this.dscn_ask_prvdd_bal = dscn_ask_prvdd_bal;
	}

	public void setDscn_ask_thdd_incr(String dscn_ask_thdd_incr){
		this.dscn_ask_thdd_incr = dscn_ask_thdd_incr;
	}

	public void setDscn_ask_thdd_redu(String dscn_ask_thdd_redu){
		this.dscn_ask_thdd_redu = dscn_ask_thdd_redu;
	}

	public void setDscn_ask_thdd_bal(String dscn_ask_thdd_bal){
		this.dscn_ask_thdd_bal = dscn_ask_thdd_bal;
	}

	public void setDscn_note_prvdd_bal(String dscn_note_prvdd_bal){
		this.dscn_note_prvdd_bal = dscn_note_prvdd_bal;
	}

	public void setDscn_note_thdd_incr(String dscn_note_thdd_incr){
		this.dscn_note_thdd_incr = dscn_note_thdd_incr;
	}

	public void setDscn_note_thdd_redu(String dscn_note_thdd_redu){
		this.dscn_note_thdd_redu = dscn_note_thdd_redu;
	}

	public void setDscn_note_thdd_bal(String dscn_note_thdd_bal){
		this.dscn_note_thdd_bal = dscn_note_thdd_bal;
	}

	public void setEndr_note_prvdd_bal(String endr_note_prvdd_bal){
		this.endr_note_prvdd_bal = endr_note_prvdd_bal;
	}

	public void setEndr_note_thdd_incr(String endr_note_thdd_incr){
		this.endr_note_thdd_incr = endr_note_thdd_incr;
	}

	public void setEndr_note_thdd_redu(String endr_note_thdd_redu){
		this.endr_note_thdd_redu = endr_note_thdd_redu;
	}

	public void setEndr_note_thdd_bal(String endr_note_thdd_bal){
		this.endr_note_thdd_bal = endr_note_thdd_bal;
	}

	public void setElseprvdd_bal(String elseprvdd_bal){
		this.elseprvdd_bal = elseprvdd_bal;
	}

	public void setElsethdd_incr(String elsethdd_incr){
		this.elsethdd_incr = elsethdd_incr;
	}

	public void setElsethdd_redu(String elsethdd_redu){
		this.elsethdd_redu = elsethdd_redu;
	}

	public void setElsethdd_bal(String elsethdd_bal){
		this.elsethdd_bal = elsethdd_bal;
	}

	public String getNote_prvdd_bal(){
		return this.note_prvdd_bal;
	}

	public String getNote_thdd_incr(){
		return this.note_thdd_incr;
	}

	public String getNote_thdd_redu(){
		return this.note_thdd_redu;
	}

	public String getNote_thdd_bal(){
		return this.note_thdd_bal;
	}

	public String getCmpy_prvdd_bal(){
		return this.cmpy_prvdd_bal;
	}

	public String getCmpy_thdd_incr(){
		return this.cmpy_thdd_incr;
	}

	public String getCmpy_thdd_redu(){
		return this.cmpy_thdd_redu;
	}

	public String getCmpy_thdd_bal(){
		return this.cmpy_thdd_bal;
	}

	public String getIcty_prvdd_bal(){
		return this.icty_prvdd_bal;
	}

	public String getIcty_thdd_incr(){
		return this.icty_thdd_incr;
	}

	public String getIcty_thdd_redu(){
		return this.icty_thdd_redu;
	}

	public String getIcty_thdd_bal(){
		return this.icty_thdd_bal;
	}

	public String getLcl_prvdd_bal(){
		return this.lcl_prvdd_bal;
	}

	public String getLcl_thdd_incr(){
		return this.lcl_thdd_incr;
	}

	public String getLcl_thdd_redu(){
		return this.lcl_thdd_redu;
	}

	public String getLcl_thdd_bal(){
		return this.lcl_thdd_bal;
	}

	public String getPrvdd_bal6(){
		return this.prvdd_bal6;
	}

	public String getThdd_incr6(){
		return this.thdd_incr6;
	}

	public String getThdd_redu6(){
		return this.thdd_redu6;
	}

	public String getThdd_bal6(){
		return this.thdd_bal6;
	}

	public String getPrvdd_bal7(){
		return this.prvdd_bal7;
	}

	public String getThdd_incr7(){
		return this.thdd_incr7;
	}

	public String getThdd_redu7(){
		return this.thdd_redu7;
	}

	public String getThdd_bal7(){
		return this.thdd_bal7;
	}

	public String getBank_prvdd_bal(){
		return this.bank_prvdd_bal;
	}

	public String getBank_thdd_incr(){
		return this.bank_thdd_incr;
	}

	public String getBank_thdd_redu(){
		return this.bank_thdd_redu;
	}

	public String getBank_thdd_bal(){
		return this.bank_thdd_bal;
	}

	public String getClct_ask_prvdd_bal(){
		return this.clct_ask_prvdd_bal;
	}

	public String getClct_ask_thdd_incr(){
		return this.clct_ask_thdd_incr;
	}

	public String getClct_ask_thdd_redu(){
		return this.clct_ask_thdd_redu;
	}

	public String getClct_ask_thdd_bal(){
		return this.clct_ask_thdd_bal;
	}

	public String getDscn_ask_prvdd_bal(){
		return this.dscn_ask_prvdd_bal;
	}

	public String getDscn_ask_thdd_incr(){
		return this.dscn_ask_thdd_incr;
	}

	public String getDscn_ask_thdd_redu(){
		return this.dscn_ask_thdd_redu;
	}

	public String getDscn_ask_thdd_bal(){
		return this.dscn_ask_thdd_bal;
	}

	public String getDscn_note_prvdd_bal(){
		return this.dscn_note_prvdd_bal;
	}

	public String getDscn_note_thdd_incr(){
		return this.dscn_note_thdd_incr;
	}

	public String getDscn_note_thdd_redu(){
		return this.dscn_note_thdd_redu;
	}

	public String getDscn_note_thdd_bal(){
		return this.dscn_note_thdd_bal;
	}

	public String getEndr_note_prvdd_bal(){
		return this.endr_note_prvdd_bal;
	}

	public String getEndr_note_thdd_incr(){
		return this.endr_note_thdd_incr;
	}

	public String getEndr_note_thdd_redu(){
		return this.endr_note_thdd_redu;
	}

	public String getEndr_note_thdd_bal(){
		return this.endr_note_thdd_bal;
	}

	public String getElseprvdd_bal(){
		return this.elseprvdd_bal;
	}

	public String getElsethdd_incr(){
		return this.elsethdd_incr;
	}

	public String getElsethdd_redu(){
		return this.elsethdd_redu;
	}

	public String getElsethdd_bal(){
		return this.elsethdd_bal;
	}
}

/* 작성시간 : Mon Sep 21 13:19:32 KST 2009 */