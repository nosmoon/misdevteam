/***************************************************************************************************
* 파일명 : SS_S_BOINFOCURCOMMLIST1Record.java
* 기능 : 지국Info-지국현황-상세-지국현황조직을 위한 Record
* 작성일자 : 2004-03-10
* 작성자 : 고윤홍
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * 지국Info-지국현황-상세-지국현황조직을 위한 Record
 */
 
public class SS_S_BOINFOCURCOMMLIST1Record extends java.lang.Object implements java.io.Serializable{

	public int dutycd10;
	public int dutycd20;
	public int dutycd40;
	public int dutycd50;
	public int dutycd60;
	public int dutycd70;
	public int dutycd80;
	public int total1;
	public int dutycd100;
	public int dutycd110;
	public int dutycd120;
	public int total2;

	public SS_S_BOINFOCURCOMMLIST1Record(){}

	public void setDutycd10(int dutycd10){
		this.dutycd10 = dutycd10;
	}

	public void setDutycd20(int dutycd20){
		this.dutycd20 = dutycd20;
	}

	public void setDutycd40(int dutycd40){
		this.dutycd40 = dutycd40;
	}

	public void setDutycd50(int dutycd50){
		this.dutycd50 = dutycd50;
	}

	public void setDutycd60(int dutycd60){
		this.dutycd60 = dutycd60;
	}

	public void setDutycd70(int dutycd70){
		this.dutycd70 = dutycd70;
	}

	public void setDutycd80(int dutycd80){
		this.dutycd80 = dutycd80;
	}

	public void setTotal1(int total1){
		this.total1 = total1;
	}

	public void setDutycd100(int dutycd100){
		this.dutycd100 = dutycd100;
	}

	public void setDutycd110(int dutycd110){
		this.dutycd110 = dutycd110;
	}

	public void setDutycd120(int dutycd120){
		this.dutycd120 = dutycd120;
	}

	public void setTotal2(int total2){
		this.total2 = total2;
	}

	public int getDutycd10(){
		return this.dutycd10;
	}

	public int getDutycd20(){
		return this.dutycd20;
	}

	public int getDutycd40(){
		return this.dutycd40;
	}

	public int getDutycd50(){
		return this.dutycd50;
	}

	public int getDutycd60(){
		return this.dutycd60;
	}

	public int getDutycd70(){
		return this.dutycd70;
	}

	public int getDutycd80(){
		return this.dutycd80;
	}

	public int getTotal1(){
		return this.total1;
	}

	public int getDutycd100(){
		return this.dutycd100;
	}

	public int getDutycd110(){
		return this.dutycd110;
	}

	public int getDutycd120(){
		return this.dutycd120;
	}

	public int getTotal2(){
		return this.total2;
	}
}

/* 작성시간 : Wed May 12 19:51:04 KST 2004 */