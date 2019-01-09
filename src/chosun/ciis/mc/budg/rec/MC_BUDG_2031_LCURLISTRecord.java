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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_2031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String sum_31_qunt;
	public String sum_32_qunt;
	public String sum_33_qunt;
	public String sum_38_qunt;
	public String sum_39_qunt;
	public String rmks;
	public String form_dept_cd;

	public MC_BUDG_2031_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSum_31_qunt(String sum_31_qunt){
		this.sum_31_qunt = sum_31_qunt;
	}

	public void setSum_32_qunt(String sum_32_qunt){
		this.sum_32_qunt = sum_32_qunt;
	}

	public void setSum_33_qunt(String sum_33_qunt){
		this.sum_33_qunt = sum_33_qunt;
	}

	public void setSum_38_qunt(String sum_38_qunt){
		this.sum_38_qunt = sum_38_qunt;
	}

	public void setSum_39_qunt(String sum_39_qunt){
		this.sum_39_qunt = sum_39_qunt;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
	}

	public void setForm_dept_cd(String form_dept_cd){
		this.form_dept_cd = form_dept_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSum_31_qunt(){
		return this.sum_31_qunt;
	}

	public String getSum_32_qunt(){
		return this.sum_32_qunt;
	}

	public String getSum_33_qunt(){
		return this.sum_33_qunt;
	}

	public String getSum_38_qunt(){
		return this.sum_38_qunt;
	}

	public String getSum_39_qunt(){
		return this.sum_39_qunt;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getForm_dept_cd(){
		return this.form_dept_cd;
	}
}

/* 작성시간 : Tue May 19 21:27:04 KST 2009 */