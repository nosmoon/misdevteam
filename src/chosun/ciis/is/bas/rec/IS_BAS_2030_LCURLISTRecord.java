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


public class IS_BAS_2030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String sub_dept_nm;
	public String chrg_pers_nm;
	public String trgt_clamt_01;
	public String trgt_clamt_02;
	public String trgt_clamt_03;
	public String trgt_clamt_04;
	public String trgt_clamt_05;
	public String trgt_clamt_06;
	public String trgt_clamt_07;
	public String trgt_clamt_08;
	public String trgt_clamt_09;
	public String trgt_clamt_10;
	public String trgt_clamt_11;
	public String trgt_clamt_12;
	public String trgt_clamt;

	public IS_BAS_2030_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setSub_dept_nm(String sub_dept_nm){
		this.sub_dept_nm = sub_dept_nm;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setTrgt_clamt_01(String trgt_clamt_01){
		this.trgt_clamt_01 = trgt_clamt_01;
	}

	public void setTrgt_clamt_02(String trgt_clamt_02){
		this.trgt_clamt_02 = trgt_clamt_02;
	}

	public void setTrgt_clamt_03(String trgt_clamt_03){
		this.trgt_clamt_03 = trgt_clamt_03;
	}

	public void setTrgt_clamt_04(String trgt_clamt_04){
		this.trgt_clamt_04 = trgt_clamt_04;
	}

	public void setTrgt_clamt_05(String trgt_clamt_05){
		this.trgt_clamt_05 = trgt_clamt_05;
	}

	public void setTrgt_clamt_06(String trgt_clamt_06){
		this.trgt_clamt_06 = trgt_clamt_06;
	}

	public void setTrgt_clamt_07(String trgt_clamt_07){
		this.trgt_clamt_07 = trgt_clamt_07;
	}

	public void setTrgt_clamt_08(String trgt_clamt_08){
		this.trgt_clamt_08 = trgt_clamt_08;
	}

	public void setTrgt_clamt_09(String trgt_clamt_09){
		this.trgt_clamt_09 = trgt_clamt_09;
	}

	public void setTrgt_clamt_10(String trgt_clamt_10){
		this.trgt_clamt_10 = trgt_clamt_10;
	}

	public void setTrgt_clamt_11(String trgt_clamt_11){
		this.trgt_clamt_11 = trgt_clamt_11;
	}

	public void setTrgt_clamt_12(String trgt_clamt_12){
		this.trgt_clamt_12 = trgt_clamt_12;
	}

	public void setTrgt_clamt(String trgt_clamt){
		this.trgt_clamt = trgt_clamt;
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

	public String getTrgt_clamt_01(){
		return this.trgt_clamt_01;
	}

	public String getTrgt_clamt_02(){
		return this.trgt_clamt_02;
	}

	public String getTrgt_clamt_03(){
		return this.trgt_clamt_03;
	}

	public String getTrgt_clamt_04(){
		return this.trgt_clamt_04;
	}

	public String getTrgt_clamt_05(){
		return this.trgt_clamt_05;
	}

	public String getTrgt_clamt_06(){
		return this.trgt_clamt_06;
	}

	public String getTrgt_clamt_07(){
		return this.trgt_clamt_07;
	}

	public String getTrgt_clamt_08(){
		return this.trgt_clamt_08;
	}

	public String getTrgt_clamt_09(){
		return this.trgt_clamt_09;
	}

	public String getTrgt_clamt_10(){
		return this.trgt_clamt_10;
	}

	public String getTrgt_clamt_11(){
		return this.trgt_clamt_11;
	}

	public String getTrgt_clamt_12(){
		return this.trgt_clamt_12;
	}

	public String getTrgt_clamt(){
		return this.trgt_clamt;
	}
}

/* 작성시간 : Wed Apr 25 11:18:02 KST 2012 */