/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-목록조회
* 작성일자 : 2005-01-11
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * 지국업무지원-Billing자동이체-신청/해지통계-목록조회
 */


public class SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String title1;
	public String title2;
	public int aplc_ok;
	public int aplc_err;
	public int aplc_sum;
	public int aplc_no;
	public int total;

	public SS_L_SHFTAPLCEXPY_STCSRSLTCURRecord(){}

	public void setTitle1(String title1){
		this.title1 = title1;
	}

	public void setTitle2(String title2){
		this.title2 = title2;
	}

	public void setAplc_ok(int aplc_ok){
		this.aplc_ok = aplc_ok;
	}

	public void setAplc_err(int aplc_err){
		this.aplc_err = aplc_err;
	}

	public void setAplc_sum(int aplc_sum){
		this.aplc_sum = aplc_sum;
	}

	public void setAplc_no(int aplc_no){
		this.aplc_no = aplc_no;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public String getTitle1(){
		return this.title1;
	}

	public String getTitle2(){
		return this.title2;
	}

	public int getAplc_ok(){
		return this.aplc_ok;
	}

	public int getAplc_err(){
		return this.aplc_err;
	}

	public int getAplc_sum(){
		return this.aplc_sum;
	}

	public int getAplc_no(){
		return this.aplc_no;
	}

	public int getTotal(){
		return this.total;
	}
}

/* 작성시간 : Tue Jan 11 20:20:30 KST 2005 */
