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


public class MC_BUDG_6303_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String su_cost_1;
	public String su_cost_2;
	public String su_cost_3;
	public String su_cost_4;
	public String j_cost_1;
	public String j_cost_2;
	public String j_cost_3;

	public MC_BUDG_6303_LCURLIST3Record(){}

	public void setSu_cost_1(String su_cost_1){
		this.su_cost_1 = su_cost_1;
	}

	public void setSu_cost_2(String su_cost_2){
		this.su_cost_2 = su_cost_2;
	}

	public void setSu_cost_3(String su_cost_3){
		this.su_cost_3 = su_cost_3;
	}

	public void setSu_cost_4(String su_cost_4){
		this.su_cost_4 = su_cost_4;
	}

	public void setJ_cost_1(String j_cost_1){
		this.j_cost_1 = j_cost_1;
	}

	public void setJ_cost_2(String j_cost_2){
		this.j_cost_2 = j_cost_2;
	}

	public void setJ_cost_3(String j_cost_3){
		this.j_cost_3 = j_cost_3;
	}

	public String getSu_cost_1(){
		return this.su_cost_1;
	}

	public String getSu_cost_2(){
		return this.su_cost_2;
	}

	public String getSu_cost_3(){
		return this.su_cost_3;
	}

	public String getSu_cost_4(){
		return this.su_cost_4;
	}

	public String getJ_cost_1(){
		return this.j_cost_1;
	}

	public String getJ_cost_2(){
		return this.j_cost_2;
	}

	public String getJ_cost_3(){
		return this.j_cost_3;
	}
}

/* 작성시간 : Fri May 22 13:40:29 KST 2009 */