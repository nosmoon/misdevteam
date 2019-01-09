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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1601_LCURLIST3Record extends java.lang.Object implements java.io.Serializable{

	public String appmt_nm;
	public String appmt_dt;
	public String mtry_dt;
	public String appmt_cont;
	public String dlftn2;

	public HD_SRCH_1601_LCURLIST3Record(){}

	public void setAppmt_nm(String appmt_nm){
		this.appmt_nm = appmt_nm;
	}

	public void setAppmt_dt(String appmt_dt){
		this.appmt_dt = appmt_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setAppmt_cont(String appmt_cont){
		this.appmt_cont = appmt_cont;
	}

	public void setDlftn2(String dlftn2){
		this.dlftn2 = dlftn2;
	}

	public String getAppmt_nm(){
		return this.appmt_nm;
	}

	public String getAppmt_dt(){
		return this.appmt_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getAppmt_cont(){
		return this.appmt_cont;
	}

	public String getDlftn2(){
		return this.dlftn2;
	}
}

/* 작성시간 : Thu Oct 08 18:16:01 KST 2009 */