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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_2103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String base_dt;
	public String mg_chk_10;
	public String mg_chk_20;
	public String mg_user_10;
	public String mg_user_20;
	public String mg_dt_10;
	public String mg_dt_20;

	public MT_PAPINOUT_2103_LCURLISTRecord(){}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setMg_chk_10(String mg_chk_10){
		this.mg_chk_10 = mg_chk_10;
	}

	public void setMg_chk_20(String mg_chk_20){
		this.mg_chk_20 = mg_chk_20;
	}

	public void setMg_user_10(String mg_user_10){
		this.mg_user_10 = mg_user_10;
	}

	public void setMg_user_20(String mg_user_20){
		this.mg_user_20 = mg_user_20;
	}

	public void setMg_dt_10(String mg_dt_10){
		this.mg_dt_10 = mg_dt_10;
	}

	public void setMg_dt_20(String mg_dt_20){
		this.mg_dt_20 = mg_dt_20;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getMg_chk_10(){
		return this.mg_chk_10;
	}

	public String getMg_chk_20(){
		return this.mg_chk_20;
	}

	public String getMg_user_10(){
		return this.mg_user_10;
	}

	public String getMg_user_20(){
		return this.mg_user_20;
	}

	public String getMg_dt_10(){
		return this.mg_dt_10;
	}

	public String getMg_dt_20(){
		return this.mg_dt_20;
	}
}

/* 작성시간 : Wed Sep 23 21:38:15 KST 2009 */