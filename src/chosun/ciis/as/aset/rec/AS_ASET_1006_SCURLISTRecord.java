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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1006_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no;
	public String car_no;
	public String usag;
	public String car_engine_size;
	public String car_kind;
	public String insr_no;
	public String quorum_cnt;
	public String car_mang_no;
	public String car_make_yymm;
	public String car_usag;
	public String use_car_oil;

	public AS_ASET_1006_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setCar_engine_size(String car_engine_size){
		this.car_engine_size = car_engine_size;
	}

	public void setCar_kind(String car_kind){
		this.car_kind = car_kind;
	}

	public void setInsr_no(String insr_no){
		this.insr_no = insr_no;
	}

	public void setQuorum_cnt(String quorum_cnt){
		this.quorum_cnt = quorum_cnt;
	}

	public void setCar_mang_no(String car_mang_no){
		this.car_mang_no = car_mang_no;
	}

	public void setCar_make_yymm(String car_make_yymm){
		this.car_make_yymm = car_make_yymm;
	}

	public void setCar_usag(String car_usag){
		this.car_usag = car_usag;
	}

	public void setUse_car_oil(String use_car_oil){
		this.use_car_oil = use_car_oil;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getCar_engine_size(){
		return this.car_engine_size;
	}

	public String getCar_kind(){
		return this.car_kind;
	}

	public String getInsr_no(){
		return this.insr_no;
	}

	public String getQuorum_cnt(){
		return this.quorum_cnt;
	}

	public String getCar_mang_no(){
		return this.car_mang_no;
	}

	public String getCar_make_yymm(){
		return this.car_make_yymm;
	}

	public String getCar_usag(){
		return this.car_usag;
	}

	public String getUse_car_oil(){
		return this.use_car_oil;
	}
}

/* 작성시간 : Tue Mar 03 14:30:33 KST 2009 */