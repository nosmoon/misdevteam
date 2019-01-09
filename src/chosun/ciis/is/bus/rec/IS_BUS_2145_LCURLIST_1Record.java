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


public class IS_BUS_2145_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String sido_nm;
	public String gu_nm;
	public String purc_dlco_nm;
	public String c_is;
	public String c_ad;
	public String chosun;
	public String jungang;
	public String donga;

	public IS_BUS_2145_LCURLIST_1Record(){}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setGu_nm(String gu_nm){
		this.gu_nm = gu_nm;
	}

	public void setPurc_dlco_nm(String purc_dlco_nm){
		this.purc_dlco_nm = purc_dlco_nm;
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

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getGu_nm(){
		return this.gu_nm;
	}

	public String getPurc_dlco_nm(){
		return this.purc_dlco_nm;
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

/* 작성시간 : Thu Jun 21 16:49:46 KST 2012 */