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


package chosun.ciis.ad.evlu.rec;

import java.sql.*;
import chosun.ciis.ad.evlu.dm.*;
import chosun.ciis.ad.evlu.ds.*;

/**
 * 
 */


public class AD_EVLU_2000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String emp_nm;
	public String rank_1;
	public String scor_1;
	public String rank_2;
	public String scor_2;
	public String rank_3;
	public String scor_3;
	public String rank_4;
	public String scor_4;
	public String rank_5;
	public String scor_5;
	public String rank_6;
	public String scor_6;
	public String rank_7;
	public String scor_7;
	public String rank_8;
	public String scor_8;
	public String rank_9;
	public String scor_9;
	public String rank_10;
	public String scor_10;
	public String rank_11;
	public String scor_11;
	public String rank_12;
	public String scor_12;
	public String tot_rank;
	public String tot_sum;

	public AD_EVLU_2000_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_nm(String emp_nm){
		this.emp_nm = emp_nm;
	}

	public void setRank_1(String rank_1){
		this.rank_1 = rank_1;
	}

	public void setScor_1(String scor_1){
		this.scor_1 = scor_1;
	}

	public void setRank_2(String rank_2){
		this.rank_2 = rank_2;
	}

	public void setScor_2(String scor_2){
		this.scor_2 = scor_2;
	}

	public void setRank_3(String rank_3){
		this.rank_3 = rank_3;
	}

	public void setScor_3(String scor_3){
		this.scor_3 = scor_3;
	}

	public void setRank_4(String rank_4){
		this.rank_4 = rank_4;
	}

	public void setScor_4(String scor_4){
		this.scor_4 = scor_4;
	}

	public void setRank_5(String rank_5){
		this.rank_5 = rank_5;
	}

	public void setScor_5(String scor_5){
		this.scor_5 = scor_5;
	}

	public void setRank_6(String rank_6){
		this.rank_6 = rank_6;
	}

	public void setScor_6(String scor_6){
		this.scor_6 = scor_6;
	}

	public void setRank_7(String rank_7){
		this.rank_7 = rank_7;
	}

	public void setScor_7(String scor_7){
		this.scor_7 = scor_7;
	}

	public void setRank_8(String rank_8){
		this.rank_8 = rank_8;
	}

	public void setScor_8(String scor_8){
		this.scor_8 = scor_8;
	}

	public void setRank_9(String rank_9){
		this.rank_9 = rank_9;
	}

	public void setScor_9(String scor_9){
		this.scor_9 = scor_9;
	}

	public void setRank_10(String rank_10){
		this.rank_10 = rank_10;
	}

	public void setScor_10(String scor_10){
		this.scor_10 = scor_10;
	}

	public void setRank_11(String rank_11){
		this.rank_11 = rank_11;
	}

	public void setScor_11(String scor_11){
		this.scor_11 = scor_11;
	}

	public void setRank_12(String rank_12){
		this.rank_12 = rank_12;
	}

	public void setScor_12(String scor_12){
		this.scor_12 = scor_12;
	}

	public void setTot_rank(String tot_rank){
		this.tot_rank = tot_rank;
	}

	public void setTot_sum(String tot_sum){
		this.tot_sum = tot_sum;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_nm(){
		return this.emp_nm;
	}

	public String getRank_1(){
		return this.rank_1;
	}

	public String getScor_1(){
		return this.scor_1;
	}

	public String getRank_2(){
		return this.rank_2;
	}

	public String getScor_2(){
		return this.scor_2;
	}

	public String getRank_3(){
		return this.rank_3;
	}

	public String getScor_3(){
		return this.scor_3;
	}

	public String getRank_4(){
		return this.rank_4;
	}

	public String getScor_4(){
		return this.scor_4;
	}

	public String getRank_5(){
		return this.rank_5;
	}

	public String getScor_5(){
		return this.scor_5;
	}

	public String getRank_6(){
		return this.rank_6;
	}

	public String getScor_6(){
		return this.scor_6;
	}

	public String getRank_7(){
		return this.rank_7;
	}

	public String getScor_7(){
		return this.scor_7;
	}

	public String getRank_8(){
		return this.rank_8;
	}

	public String getScor_8(){
		return this.scor_8;
	}

	public String getRank_9(){
		return this.rank_9;
	}

	public String getScor_9(){
		return this.scor_9;
	}

	public String getRank_10(){
		return this.rank_10;
	}

	public String getScor_10(){
		return this.scor_10;
	}

	public String getRank_11(){
		return this.rank_11;
	}

	public String getScor_11(){
		return this.scor_11;
	}

	public String getRank_12(){
		return this.rank_12;
	}

	public String getScor_12(){
		return this.scor_12;
	}

	public String getTot_rank(){
		return this.tot_rank;
	}

	public String getTot_sum(){
		return this.tot_sum;
	}
}

/* 작성시간 : Mon Mar 22 18:22:02 KST 2010 */