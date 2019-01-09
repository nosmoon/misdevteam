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


public class IS_BUS_1610_SCURLIST_5Record extends java.lang.Object implements java.io.Serializable{

	public String indt_cd_nm;
	public String dan_cnt_1;
	public String dan_amt_1;
	public String jun_cnt_2;
	public String jun_amt_2;
	public String incr_rate;
	public String incr_amt;

	public IS_BUS_1610_SCURLIST_5Record(){}

	public void setIndt_cd_nm(String indt_cd_nm){
		this.indt_cd_nm = indt_cd_nm;
	}

	public void setDan_cnt_1(String dan_cnt_1){
		this.dan_cnt_1 = dan_cnt_1;
	}

	public void setDan_amt_1(String dan_amt_1){
		this.dan_amt_1 = dan_amt_1;
	}

	public void setJun_cnt_2(String jun_cnt_2){
		this.jun_cnt_2 = jun_cnt_2;
	}

	public void setJun_amt_2(String jun_amt_2){
		this.jun_amt_2 = jun_amt_2;
	}

	public void setIncr_rate(String incr_rate){
		this.incr_rate = incr_rate;
	}

	public void setIncr_amt(String incr_amt){
		this.incr_amt = incr_amt;
	}

	public String getIndt_cd_nm(){
		return this.indt_cd_nm;
	}

	public String getDan_cnt_1(){
		return this.dan_cnt_1;
	}

	public String getDan_amt_1(){
		return this.dan_amt_1;
	}

	public String getJun_cnt_2(){
		return this.jun_cnt_2;
	}

	public String getJun_amt_2(){
		return this.jun_amt_2;
	}

	public String getIncr_rate(){
		return this.incr_rate;
	}

	public String getIncr_amt(){
		return this.incr_amt;
	}
}

/* 작성시간 : Tue Jun 19 18:11:56 KST 2012 */