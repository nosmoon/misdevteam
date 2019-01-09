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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1930_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String sub_dept_nm;
	public String chrg_pers_nm;
	public String sale_clsf_nm;
	public String trgt_sale_amt_01;
	public String trgt_sale_amt_02;
	public String trgt_sale_amt_03;
	public String trgt_sale_amt_04;
	public String trgt_sale_amt_05;
	public String trgt_sale_amt_06;
	public String trgt_sale_amt_07;
	public String trgt_sale_amt_08;
	public String trgt_sale_amt_09;
	public String trgt_sale_amt_10;
	public String trgt_sale_amt_11;
	public String trgt_sale_amt_12;
	public String trgt_sale_amt;

	public IS_BAS_1930_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_nm(String sub_dept_nm){
		this.sub_dept_nm = sub_dept_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setSale_clsf_nm(String sale_clsf_nm){
		this.sale_clsf_nm = sale_clsf_nm;
	}

	public void setTrgt_sale_amt_01(String trgt_sale_amt_01){
		this.trgt_sale_amt_01 = trgt_sale_amt_01;
	}

	public void setTrgt_sale_amt_02(String trgt_sale_amt_02){
		this.trgt_sale_amt_02 = trgt_sale_amt_02;
	}

	public void setTrgt_sale_amt_03(String trgt_sale_amt_03){
		this.trgt_sale_amt_03 = trgt_sale_amt_03;
	}

	public void setTrgt_sale_amt_04(String trgt_sale_amt_04){
		this.trgt_sale_amt_04 = trgt_sale_amt_04;
	}

	public void setTrgt_sale_amt_05(String trgt_sale_amt_05){
		this.trgt_sale_amt_05 = trgt_sale_amt_05;
	}

	public void setTrgt_sale_amt_06(String trgt_sale_amt_06){
		this.trgt_sale_amt_06 = trgt_sale_amt_06;
	}

	public void setTrgt_sale_amt_07(String trgt_sale_amt_07){
		this.trgt_sale_amt_07 = trgt_sale_amt_07;
	}

	public void setTrgt_sale_amt_08(String trgt_sale_amt_08){
		this.trgt_sale_amt_08 = trgt_sale_amt_08;
	}

	public void setTrgt_sale_amt_09(String trgt_sale_amt_09){
		this.trgt_sale_amt_09 = trgt_sale_amt_09;
	}

	public void setTrgt_sale_amt_10(String trgt_sale_amt_10){
		this.trgt_sale_amt_10 = trgt_sale_amt_10;
	}

	public void setTrgt_sale_amt_11(String trgt_sale_amt_11){
		this.trgt_sale_amt_11 = trgt_sale_amt_11;
	}

	public void setTrgt_sale_amt_12(String trgt_sale_amt_12){
		this.trgt_sale_amt_12 = trgt_sale_amt_12;
	}

	public void setTrgt_sale_amt(String trgt_sale_amt){
		this.trgt_sale_amt = trgt_sale_amt;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getSub_dept_nm(){
		return this.sub_dept_nm;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getSale_clsf_nm(){
		return this.sale_clsf_nm;
	}

	public String getTrgt_sale_amt_01(){
		return this.trgt_sale_amt_01;
	}

	public String getTrgt_sale_amt_02(){
		return this.trgt_sale_amt_02;
	}

	public String getTrgt_sale_amt_03(){
		return this.trgt_sale_amt_03;
	}

	public String getTrgt_sale_amt_04(){
		return this.trgt_sale_amt_04;
	}

	public String getTrgt_sale_amt_05(){
		return this.trgt_sale_amt_05;
	}

	public String getTrgt_sale_amt_06(){
		return this.trgt_sale_amt_06;
	}

	public String getTrgt_sale_amt_07(){
		return this.trgt_sale_amt_07;
	}

	public String getTrgt_sale_amt_08(){
		return this.trgt_sale_amt_08;
	}

	public String getTrgt_sale_amt_09(){
		return this.trgt_sale_amt_09;
	}

	public String getTrgt_sale_amt_10(){
		return this.trgt_sale_amt_10;
	}

	public String getTrgt_sale_amt_11(){
		return this.trgt_sale_amt_11;
	}

	public String getTrgt_sale_amt_12(){
		return this.trgt_sale_amt_12;
	}

	public String getTrgt_sale_amt(){
		return this.trgt_sale_amt;
	}
}

/* 작성시간 : Tue Apr 24 19:32:18 KST 2012 */