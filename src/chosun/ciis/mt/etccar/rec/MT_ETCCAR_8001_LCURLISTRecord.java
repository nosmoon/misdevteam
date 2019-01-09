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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_8001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String drvr_cd;
	public String drvr_nm;
	public String tel_no;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String use_yn;
	public String use_yn_nm;

	public MT_ETCCAR_8001_LCURLISTRecord(){}

	public void setDrvr_cd(String drvr_cd){
		this.drvr_cd = drvr_cd;
	}

	public void setDrvr_nm(String drvr_nm){
		this.drvr_nm = drvr_nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}
	
	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}
	
	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setUse_yn_nm(String use_yn_nm){
		this.use_yn_nm = use_yn_nm;
	}
		
	public String getDrvr_cd(){
		return this.drvr_cd;
	}

	public String getDrvr_nm(){
		return this.drvr_nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}
	
	public String getUse_yn(){
		return this.use_yn;
	}
	
	public String getUse_yn_nm(){
		return this.use_yn_nm;
	}
}

/* 작성시간 : Tue Aug 21 16:57:55 KST 2012 */