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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5501_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String cd;
	public String cdnm;
	public String t1;
	public String t2;
	public String t3;
	public String t4;
	public String t5;
	public String t6;
	public String t7;

	public HD_EVLU_5501_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setT1(String t1){
		this.t1 = t1;
	}

	public void setT2(String t2){
		this.t2 = t2;
	}

	public void setT3(String t3){
		this.t3 = t3;
	}

	public void setT4(String t4){
		this.t4 = t4;
	}

	public void setT5(String t5){
		this.t5 = t5;
	}

	public void setT6(String t6){
		this.t6 = t6;
	}

	public void setT7(String t7){
		this.t7 = t7;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getT1(){
		return this.t1;
	}

	public String getT2(){
		return this.t2;
	}

	public String getT3(){
		return this.t3;
	}

	public String getT4(){
		return this.t4;
	}

	public String getT5(){
		return this.t5;
	}

	public String getT6(){
		return this.t6;
	}

	public String getT7(){
		return this.t7;
	}
}

/* 작성시간 : Thu Jun 04 15:18:22 KST 2009 */