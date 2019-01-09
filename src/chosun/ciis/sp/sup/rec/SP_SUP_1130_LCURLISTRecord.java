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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1130_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String cnt_1;
	public String cnt_2;
	public String cnt_3;
	public String cnt_4;
	public String cnt_5;

	public SP_SUP_1130_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setCnt_1(String cnt_1){
		this.cnt_1 = cnt_1;
	}

	public void setCnt_2(String cnt_2){
		this.cnt_2 = cnt_2;
	}

	public void setCnt_3(String cnt_3){
		this.cnt_3 = cnt_3;
	}

	public void setCnt_4(String cnt_4){
		this.cnt_4 = cnt_4;
	}

	public void setCnt_5(String cnt_5){
		this.cnt_5 = cnt_5;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getCnt_1(){
		return this.cnt_1;
	}

	public String getCnt_2(){
		return this.cnt_2;
	}

	public String getCnt_3(){
		return this.cnt_3;
	}

	public String getCnt_4(){
		return this.cnt_4;
	}

	public String getCnt_5(){
		return this.cnt_5;
	}
}

/* 작성시간 : Thu Jul 05 14:18:01 KST 2012 */