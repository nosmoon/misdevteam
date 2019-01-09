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


package chosun.ciis.se.boi.rec;

import java.sql.*;
import chosun.ciis.se.boi.dm.*;
import chosun.ciis.se.boi.ds.*;

/**
 * 
 */


public class SE_BOI_1440_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String yymm;
	public String chrg_pers;
	public String chrg_nm1;
	public String chrg_nm2;
	public String chrg_nm3;

	public SE_BOI_1440_LCURLISTRecord(){}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_nm1(String chrg_nm1){
		this.chrg_nm1 = chrg_nm1;
	}

	public void setChrg_nm2(String chrg_nm2){
		this.chrg_nm2 = chrg_nm2;
	}

	public void setChrg_nm3(String chrg_nm3){
		this.chrg_nm3 = chrg_nm3;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_nm1(){
		return this.chrg_nm1;
	}

	public String getChrg_nm2(){
		return this.chrg_nm2;
	}

	public String getChrg_nm3(){
		return this.chrg_nm3;
	}
}

/* 작성시간 : Wed Feb 04 21:26:30 KST 2009 */