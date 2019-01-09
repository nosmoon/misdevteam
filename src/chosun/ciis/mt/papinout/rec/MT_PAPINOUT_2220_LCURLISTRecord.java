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


public class MT_PAPINOUT_2220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_cd;
	public String roll_cnt;
	public String wgt;

	public MT_PAPINOUT_2220_LCURLISTRecord(){}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setRoll_cnt(String roll_cnt){
		this.roll_cnt = roll_cnt;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getRoll_cnt(){
		return this.roll_cnt;
	}

	public String getWgt(){
		return this.wgt;
	}
}

/* 작성시간 : Thu Jul 16 11:28:33 KST 2009 */