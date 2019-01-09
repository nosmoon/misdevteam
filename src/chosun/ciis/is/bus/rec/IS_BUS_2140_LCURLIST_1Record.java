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


public class IS_BUS_2140_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String std;
	public String c_is;
	public String c_ad;
	public String chosun;
	public String jungang;
	public String donga;

	public IS_BUS_2140_LCURLIST_1Record(){}

	public void setStd(String std){
		this.std = std;
	}

	public void setC_is(String c_is){
		this.c_is = c_is;
	}

	public void setC_ad(String c_ad){
		this.c_ad = c_ad;
	}

	public void setChosun(String chosun){
		this.chosun = chosun;
	}

	public void setJungang(String jungang){
		this.jungang = jungang;
	}

	public void setDonga(String donga){
		this.donga = donga;
	}

	public String getStd(){
		return this.std;
	}

	public String getC_is(){
		return this.c_is;
	}

	public String getC_ad(){
		return this.c_ad;
	}

	public String getChosun(){
		return this.chosun;
	}

	public String getJungang(){
		return this.jungang;
	}

	public String getDonga(){
		return this.donga;
	}
}

/* 작성시간 : Thu Jun 21 16:41:07 KST 2012 */