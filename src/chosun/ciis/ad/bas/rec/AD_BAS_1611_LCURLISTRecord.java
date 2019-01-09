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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1611_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_clsf;
	public String dlco_nm;
	public String amt_avg;
	public String amt_1;
	public String amt_2;
	public String amt_3;
	public String amt_4;
	public String amt_5;
	public String amt_6;

	public AD_BAS_1611_LCURLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAmt_avg(String amt_avg){
		this.amt_avg = amt_avg;
	}

	public void setAmt_1(String amt_1){
		this.amt_1 = amt_1;
	}

	public void setAmt_2(String amt_2){
		this.amt_2 = amt_2;
	}

	public void setAmt_3(String amt_3){
		this.amt_3 = amt_3;
	}

	public void setAmt_4(String amt_4){
		this.amt_4 = amt_4;
	}

	public void setAmt_5(String amt_5){
		this.amt_5 = amt_5;
	}

	public void setAmt_6(String amt_6){
		this.amt_6 = amt_6;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAmt_avg(){
		return this.amt_avg;
	}

	public String getAmt_1(){
		return this.amt_1;
	}

	public String getAmt_2(){
		return this.amt_2;
	}

	public String getAmt_3(){
		return this.amt_3;
	}

	public String getAmt_4(){
		return this.amt_4;
	}

	public String getAmt_5(){
		return this.amt_5;
	}

	public String getAmt_6(){
		return this.amt_6;
	}
}

/* 작성시간 : Wed Aug 26 14:51:28 KST 2009 */