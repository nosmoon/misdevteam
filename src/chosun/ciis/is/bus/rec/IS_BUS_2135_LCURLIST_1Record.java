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


public class IS_BUS_2135_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String bo_nm;
	public String std;
	public String advcs_nm;
	public String tel_no;
	public String chosun;
	public String jungang;
	public String donga;
	public String etc;

	public IS_BUS_2135_LCURLIST_1Record(){}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
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

	public void setEtc(String etc){
		this.etc = etc;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getStd(){
		return this.std;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getTel_no(){
		return this.tel_no;
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

	public String getEtc(){
		return this.etc;
	}
}

/* 작성시간 : Thu Jun 21 15:59:02 KST 2012 */