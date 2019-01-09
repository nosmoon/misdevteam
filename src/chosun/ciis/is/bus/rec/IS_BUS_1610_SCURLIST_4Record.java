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


package chosun.ciis.is.bus.rec;

import java.sql.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.ds.*;

/**
 * 
 */


public class IS_BUS_1610_SCURLIST_4Record extends java.lang.Object implements java.io.Serializable{

	public String purc_dlco_nm;
	public String cnt_1;
	public String cnt_2;
	public String cnt_3;
	public String cnt_4;
	public String cnt_t;
	public String per_2;
	public String per_3;
	public String per_4;
	public String minus_3;
	public String minus_4;

	public IS_BUS_1610_SCURLIST_4Record(){}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
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

	public void setCnt_t(String cnt_t){
		this.cnt_t = cnt_t;
	}

	public void setPer_2(String per_2){
		this.per_2 = per_2;
	}

	public void setPer_3(String per_3){
		this.per_3 = per_3;
	}

	public void setPer_4(String per_4){
		this.per_4 = per_4;
	}

	public void setMinus_3(String minus_3){
		this.minus_3 = minus_3;
	}

	public void setMinus_4(String minus_4){
		this.minus_4 = minus_4;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
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

	public String getCnt_t(){
		return this.cnt_t;
	}

	public String getPer_2(){
		return this.per_2;
	}

	public String getPer_3(){
		return this.per_3;
	}

	public String getPer_4(){
		return this.per_4;
	}

	public String getMinus_3(){
		return this.minus_3;
	}

	public String getMinus_4(){
		return this.minus_4;
	}
}

/* 작성시간 : Tue Jun 19 18:11:56 KST 2012 */