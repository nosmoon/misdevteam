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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String ordr_dt;
	public String papcmpy_cd;
	public String papcmpy_nm;
	public double ordr_ratio;
	public double ordr_wgt;
	public int ordr_roll_cnt;
	public String car_kind;
	public double sum_ratio;

	public MT_PAPORD_6000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrdr_dt(String ordr_dt){
		this.ordr_dt = ordr_dt;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setOrdr_ratio(double ordr_ratio){
		this.ordr_ratio = ordr_ratio;
	}

	public void setOrdr_wgt(double ordr_wgt){
		this.ordr_wgt = ordr_wgt;
	}

	public void setOrdr_roll_cnt(int ordr_roll_cnt){
		this.ordr_roll_cnt = ordr_roll_cnt;
	}

	public void setCar_kind(String car_kind){
		this.car_kind = car_kind;
	}

	public void setSum_ratio(double sum_ratio){
		this.sum_ratio = sum_ratio;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrdr_dt(){
		return this.ordr_dt;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public double getOrdr_ratio(){
		return this.ordr_ratio;
	}

	public double getOrdr_wgt(){
		return this.ordr_wgt;
	}

	public int getOrdr_roll_cnt(){
		return this.ordr_roll_cnt;
	}

	public String getCar_kind(){
		return this.car_kind;
	}

	public double getSum_ratio(){
		return this.sum_ratio;
	}
}

/* 작성시간 : Thu Apr 16 22:41:46 KST 2009 */