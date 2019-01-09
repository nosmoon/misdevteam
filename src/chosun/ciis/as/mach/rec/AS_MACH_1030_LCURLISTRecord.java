/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.as.mach.rec;

import java.sql.*;
import chosun.ciis.as.mach.dm.*;
import chosun.ciis.as.mach.ds.*;

/**
 * 
 */


public class AS_MACH_1030_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String mach_seq;
	public String as_seq;
	public String mach_as_dt;
	public String as_comp;
	public String as_fee;
	public String as_cont;
	public String remk;

	public AS_MACH_1030_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMach_seq(String mach_seq){
		this.mach_seq = mach_seq;
	}

	public void setAs_seq(String as_seq){
		this.as_seq = as_seq;
	}

	public void setMach_as_dt(String mach_as_dt){
		this.mach_as_dt = mach_as_dt;
	}

	public void setAs_comp(String as_comp){
		this.as_comp = as_comp;
	}

	public void setAs_fee(String as_fee){
		this.as_fee = as_fee;
	}

	public void setAs_cont(String as_cont){
		this.as_cont = as_cont;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMach_seq(){
		return this.mach_seq;
	}

	public String getAs_seq(){
		return this.as_seq;
	}

	public String getMach_as_dt(){
		return this.mach_as_dt;
	}

	public String getAs_comp(){
		return this.as_comp;
	}

	public String getAs_fee(){
		return this.as_fee;
	}

	public String getAs_cont(){
		return this.as_cont;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Jun 12 16:23:21 KST 2015 */